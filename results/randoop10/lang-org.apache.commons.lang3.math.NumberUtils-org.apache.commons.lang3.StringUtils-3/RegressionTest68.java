import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest68 {

    public static boolean debug = false;

    @Test
    public void test34001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34001");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                             100.0", "44444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test34002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34002");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "aa100.0aaaa", (java.lang.CharSequence) "4444444...4444444...4444444...4...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 33 + "'", int2 == 33);
    }

    @Test
    public void test34003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34003");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("                                                                             A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A                                                                             ", "44...7900.1-eurt04444444444444444444444444444444444...444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test34004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34004");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "    ...44444444444444444444444444444444440true-1.0097...A...44444444444444444444444444444444440true-1.0097...         ...44444444444444444444444444444444440true-1.0097...A...44444444444444444444444444444444440true-1.0097...                                                     ...44444444444444444444444444444444440true-1.0097...100...44444444444444444444444444444444440true-1.0097.......44444444444444444444444444444444440true-1.0097...0...44444444444444444444444444444444440true-1.0097...    ...44444444444444444444444444444444440true-1.0097...A...44444444444444444444444444444444440true-1.0097...         ...44444444444444444444444444444444440true-1.0097...A...44444444444444444444444444444444440true-1.0097...         ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "    ...44444444444444444444444444444444440true-1.0097...A...44444444444444444444444444444444440true-1.0097...         ...44444444444444444444444444444444440true-1.0097...A...44444444444444444444444444444444440true-1.0097...                                                     ...44444444444444444444444444444444440true-1.0097...100...44444444444444444444444444444444440true-1.0097.......44444444444444444444444444444444440true-1.0097...0...44444444444444444444444444444444440true-1.0097...    ...44444444444444444444444444444444440true-1.0097...A...44444444444444444444444444444444440true-1.0097...         ...44444444444444444444444444444444440true-1.0097...A...44444444444444444444444444444444440true-1.0097...         " + "'", str1, "    ...44444444444444444444444444444444440true-1.0097...A...44444444444444444444444444444444440true-1.0097...         ...44444444444444444444444444444444440true-1.0097...A...44444444444444444444444444444444440true-1.0097...                                                     ...44444444444444444444444444444444440true-1.0097...100...44444444444444444444444444444444440true-1.0097.......44444444444444444444444444444444440true-1.0097...0...44444444444444444444444444444444440true-1.0097...    ...44444444444444444444444444444444440true-1.0097...A...44444444444444444444444444444444440true-1.0097...         ...44444444444444444444444444444444440true-1.0097...A...44444444444444444444444444444444440true-1.0097...         ");
    }

    @Test
    public void test34005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34005");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##100.0###", 982, "0TRUE-10AAAA00970AAAA0AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##100.0###0TRUE-10AAAA00970AAAA0AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA0TRUE-10AAAA00970AAAA0AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA0TRUE-10AAAA00970AAAA0AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA0TRUE-10AAAA00970AAAA0AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA0TRUE-10AAAA00970AAAA0AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA0TRUE-10AAAA00970AAAA0AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA0TRUE-10AAAA00970AAAA0AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA0TRUE-10AAAA00970AAAA0AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##100.0###0TRUE-10AAAA00970AAAA0AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA0TRUE-10AAAA00970AAAA0AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA0TRUE-10AAAA00970AAAA0AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA0TRUE-10AAAA00970AAAA0AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA0TRUE-10AAAA00970AAAA0AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA0TRUE-10AAAA00970AAAA0AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA0TRUE-10AAAA00970AAAA0AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA0TRUE-10AAAA00970AAAA0AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test34006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34006");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444E-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR    A     0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR", "4444444444444444444444444444444444444444444444444444444444444444444444   !    aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 54);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test34007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34007");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      A A A A A", "...             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0", 625);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test34008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34008");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterType("                                      a                                                     ");
        boolean boolean3 = org.apache.commons.lang3.StringUtils.startsWithAny("a44", strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test34009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34009");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("0                        0true-1.00-1.0097.0444444444444444444444444444444...                                                                                      ");
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, "aaaaaa                                                                ...44444", 36, 29);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test34010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34010");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 57, (double) 891, 18.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 891.0d + "'", double3 == 891.0d);
    }

    @Test
    public void test34011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34011");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("A     0true-1 0097 00true-1 0097 00true-1 0097 00tr", 77);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test34012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34012");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "                                                   aaaaa0aaaa                                                                         ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test34013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34013");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("                       a", (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test34014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34014");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("444444444444444444444444...79hi!hi!hi!hi!hi!hi!.1-EURThi!hi!hi!4444444444444444444444444444444444...444444444444444444444444", (short) 0);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 0 + "'", short2 == (short) 0);
    }

    @Test
    public void test34015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34015");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("                                                                                            A    44", 59, " ...");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                            A    44" + "'", str3, "                                                                                            A    44");
    }

    @Test
    public void test34016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34016");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "########################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################0true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.00...", (java.lang.CharSequence) "a rt00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt0                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test34017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34017");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("true444...44444444444444444444444444444444440TRUE-1.0097...44", "                                                                                                                                       0aaaa                                                                                                                                  A                                                                                                                                  0aaaa                                                                                                                                      ");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "true444...4444444444444444444444444444444444TRUE-1.97...44" + "'", str3, "true444...4444444444444444444444444444444444TRUE-1.97...44");
    }

    @Test
    public void test34018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34018");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("0true-1.0097.044444444444444444444444444 40true-1.0097.044444444444444444444444444 40true-1.0097.044444444444444444444444444 40true-1.0097.044444444444444444444444444 40true-1.0097.044444444444444444444444444 40true-1.0097.044444444444444444444444444 40true-1.0097.044444444444444444444444444 40true-1.0097.044444444444444444444444444 40true-1.0097.044444444444444444444444444 40true-1.0097.044444444444444444444444444 40true-1.0097.044444444444444444444444444 40true-1.0097.0444444444444444444!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!", "");
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("444...44444444444444444444444444444444440true-1.0097...44", "                                               100.0                                                ", (int) (short) 1);
        int int9 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("100.", strArray8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = org.apache.commons.lang3.StringUtils.replaceEach("A 0true-1.0097.00true-1.0097.00true-1.0097.00tr", strArray3, strArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 12 vs 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test34019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34019");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars(" . 97 . ", "", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " . 97 . " + "'", str3, " . 97 . ");
    }

    @Test
    public void test34020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34020");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("444440true-1.0097...4", "a         a    0001                       aaaaaaaaaaaaaaaaaaa0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.00....444444440tr...aaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test34021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34021");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("true 1.  97.", (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "true 1.  97." + "'", str2, "true 1.  97.");
    }

    @Test
    public void test34022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34022");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("44444444444444444444444444...true-1.4444444...97.4444444...444444444444444444444444444444444444444444", "                                           ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44444444444444444444444444...true-1.4444444...97.4444444...444444444444444444444444444444444444444444" + "'", str2, "44444444444444444444444444...true-1.4444444...97.4444444...444444444444444444444444444444444444444444");
    }

    @Test
    public void test34023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34023");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("44444444444444444444444444444440true0true-1.0097.00true-1.0097.00true-1.0097.00trA0t...", (byte) 100);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 100 + "'", byte2 == (byte) 100);
    }

    @Test
    public void test34024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34024");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("a A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A...", (double) 585);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 585.0d + "'", double2 == 585.0d);
    }

    @Test
    public void test34025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34025");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "4444444444444444444444444444444444444444444                                                                                                                                                                                                                                                                          0.79                                                                                                                                                                                                                                                                          0.1-eurt                                                                                                                                                                                                                                                                          04444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4444444444444444444444444444444444444444444                                                                                                                                                                                                                                                                          0.79                                                                                                                                                                                                                                                                          0.1-eurt                                                                                                                                                                                                                                                                          04444444444444444444444444444444444444444444" + "'", str1, "4444444444444444444444444444444444444444444                                                                                                                                                                                                                                                                          0.79                                                                                                                                                                                                                                                                          0.1-eurt                                                                                                                                                                                                                                                                          04444444444444444444444444444444444444444444");
    }

    @Test
    public void test34026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34026");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("0true-1.0097.044444444444444444444444444 ...aaaaaaaaaaaaaaaaaaaaaaaaa...aaaaaaaaaaaaaa###0.001##...aaaaaaaaaaaaaaaaaaaaaaaaa...aaaaaaaaaaaaaa", " true-1.  97. ", (-1));
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, 'a', 145, 159);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 145");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test34027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34027");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("004444444000444444400044444440011", "0true-1.0097.00true-1.0097.00true-1.0097.00tr4444a444440true-1.0097.00true-1.0097.00true-1.0097.00t");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "004444444000444444400044444440011" + "'", str2, "004444444000444444400044444440011");
    }

    @Test
    public void test34028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34028");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) 4, (short) 0, (short) (byte) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 4 + "'", short3 == (short) 4);
    }

    @Test
    public void test34029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34029");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("                                                0444", "                   TRUE-1.0097.0                       a", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                0444" + "'", str3, "                                                0444");
    }

    @Test
    public void test34030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34030");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("44444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray2);
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.split("41004.404                                                444444A444444444444444444444444A444444444444444444444444A444444444444444444444444A444444444444444444444444A444444444444444444444444A444444444444444444444444A444444444444444444444444A444444444444444444444444A444444444444444444444444A444444444444444444444444A444444444444444444444444A444444444444444444444444A444444444444444444444444A444444444444444444444444A444444444444444444444444A444444444444444444444444A444444444444444444444444A4444444444444444444", "                   .0097.00tr                   ", 49);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("    a   HI!HI!...", strArray2, strArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 71 vs 5");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void test34031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34031");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("true-1.97.", "true4-4449744                                       ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test34032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34032");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("                 4444a44444                  ", "                                                                                               100.0", "");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test34033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34033");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("4444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test34034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34034");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "... A A", "a#a");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test34035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34035");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("", 133);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                     " + "'", str2, "                                                                                                                                     ");
    }

    @Test
    public void test34036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34036");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("aaTRUE-1.##97.aa", 561);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaTRUE-1.##97.aa" + "'", str2, "aaTRUE-1.##97.aa");
    }

    @Test
    public void test34037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34037");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "0AAA");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test34038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34038");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("aaaa0aaaaa", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", 0);
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.stripAll(strArray6);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.startsWithAny("4444444", strArray6);
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("", strArray6, strArray10);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.concatWith(".. A..", (java.lang.Object[]) strArray6);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "aaaa0aaaaa" + "'", str12, "aaaa0aaaaa");
    }

    @Test
    public void test34039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34039");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("                                                                                                                                                                                                                                                                                                                                      aahI!aa                                                                                                                                                                                                                                                                                                                                       ", "A         A                                                     100.0    A         A", 172);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test34040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34040");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("                 ...                                                     ", 744, "444444444444444440TRUE-1.0097...444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "444444444444444440TRUE-1.0097...444444444444444444444444444444444444444440TRUE-1.0097...444444444444444444444444444444444444444440TRUE-1.0097...444444444444444444444444444444444444444440TRUE-1.0097...444444444444444444444444444444444444444440TRUE-1.0097...444444444444444444444444444444444444444440TRUE-1.0097...444444444444444444444444444444444444444440TRUE-1.0097...444444444444444444444444444444444444444440TRUE-1.0097...444444444444444444444444444444444444444440TRUE-1.0097...444444444444444444444444444444444444444440TRUE-1.0097...444444444444444444444444444444444444444440TRUE-1.0097...444444444444444444444444444444444444444440TRUE-1.0097...44444444444444444444444                 ...                                                     " + "'", str3, "444444444444444440TRUE-1.0097...444444444444444444444444444444444444444440TRUE-1.0097...444444444444444444444444444444444444444440TRUE-1.0097...444444444444444444444444444444444444444440TRUE-1.0097...444444444444444444444444444444444444444440TRUE-1.0097...444444444444444444444444444444444444444440TRUE-1.0097...444444444444444444444444444444444444444440TRUE-1.0097...444444444444444444444444444444444444444440TRUE-1.0097...444444444444444444444444444444444444444440TRUE-1.0097...444444444444444444444444444444444444444440TRUE-1.0097...444444444444444444444444444444444444444440TRUE-1.0097...444444444444444444444444444444444444444440TRUE-1.0097...44444444444444444444444                 ...                                                     ");
    }

    @Test
    public void test34041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34041");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("4444444..444444444444444440true-1.0097...44444444444444444444444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...", "44444444444444444444444444444444444444444440.7900.1-eurt04444444444444444444444444444444444444444444.790.7900.1-eurt04444444444444444444444444444444444444444444.1-eurt0.7900.1-eurt044444444444444444444444444444444444444444444444444444444444444444444444444444444444444", 49);
        boolean boolean5 = org.apache.commons.lang3.StringUtils.startsWithAny("...44444...true-1.4444444...97.4444444...4444444444444...", strArray4);
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.stripAll(strArray4, "4444444444444444444444444444444444444444444 a A A A 97.A a A A A true-1.A a A A A 4444444444444444444444444444444444444444444A");
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, "...4444.....", 236, 329);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test34042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34042");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("                       #A#44444444444444444444#...#444444444444444444444444444444444444444444444");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"                       #A#44444444444444444444#...#444444444444444444444444444444444444444444444\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test34043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34043");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator(" . 97 . 4444444444444444444444444444444444444444444", "4             ", (int) (short) 10);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.concatWith("                                                                                            4444444444444444444444444444440TA4444444444444444444444444444440T    4444444444444444444444444444440T44                                                                                            4444444444444444444444444444440TA4444444444444444444444444444440T    4444444444444444444444444444440T44                                                                                            44444444444444444444444444                                               100.0                                                ", (java.lang.Object[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + " . 97 . 4444444444444444444444444444444444444444444" + "'", str5, " . 97 . 4444444444444444444444444444444444444444444");
    }

    @Test
    public void test34044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34044");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("", "#######################################################################################################################################################################4 0true-1.0097.04444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test34045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34045");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("               #######    a   HI!HI!...");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test34046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34046");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("HHHH0H7900H1-EURT0HHHHH0HHHH0H7900H1-EURT0HHHHH0HHHH0H7900H1-EURT0HHHHH0HHHH0H7900H1-EURT0HHHHH0HHHH0H7900H1-EURT0HHHHH0HHHH0H7900H1-EURT0HHHHH0HHHH0H7900H1-EURT0HHHHH0HHHH0", "                                                                       ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test34047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34047");
        char[] charArray9 = new char[] { '4', '4', ' ' };
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "0", charArray9);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsAny("a", charArray9);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                                      ...                                                     ", charArray9);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "4 0true-1.0097.044444444444444444444444444", charArray9);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                                                                                                                                                                                                                        4444a44444                                                                                                                                                                                                       44444444444444444444444444444444444444444444444444...true-1.4444444...97.4444444...444444444444444444444444444444444444444444", charArray9);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "44444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "44 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "44 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[4, 4,  ]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 43 + "'", int15 == 43);
    }

    @Test
    public void test34048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34048");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("...44444444444444444444444444444444444444444444444444444...", 833, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "###################################################################################################################################################################################################################################################################################################################################################################################################...44444444444444444444444444444444444444444444444444444...###################################################################################################################################################################################################################################################################################################################################################################################################" + "'", str3, "###################################################################################################################################################################################################################################################################################################################################################################################################...44444444444444444444444444444444444444444444444444444...###################################################################################################################################################################################################################################################################################################################################################################################################");
    }

    @Test
    public void test34049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34049");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("1aaaaaaaaaaa4444444...4444444...4444444...4", '#');
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("0                                                                                                                                                                                                                                                                          ", "4 0true-1.0097.044444444444444444444444444");
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.replaceEach("                     aaaa0aaaaa           ", strArray3, strArray6);
        int int8 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray6);
        int int9 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray6);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "                     aaaa0aaaaa           " + "'", str7, "                     aaaa0aaaaa           ");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test34050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34050");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf(" 4...7900.1-EURT04444444444444444444444444444444444...4440", 34, 267);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test34051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34051");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("4444444444444444444444444440.7900.1-EURT04444444444444444444444444444444444444444440.7900.1-EURT044444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4444444444444444444444444440.7900.1-EURT04444444444444444444444444444444444444444440.7900.1-EURT044444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaa" + "'", str1, "4444444444444444444444444440.7900.1-EURT04444444444444444444444444444444444444444440.7900.1-EURT044444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaa");
    }

    @Test
    public void test34052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34052");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("....4444444444444444444444444444..", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa              aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 141);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test34053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34053");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa444440true-1.0097...4444440true-1.0097...4444440444444444444444444444444444444440true-1.0097...4444440true-1.0097...4444440aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa444440true-1.0097...4444440true-1.0097...4444440444444444444444444444444444444440true-1.0097...4444440true-1.0097...4444440aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa444440true-1.0097...4444440true-1.0097...4444440444444444444444444444444444444440true-1.0097...4444440true-1.0097...4444440aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test34054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34054");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("                                                                                                                                                                                                                                                                 ", "444444444444444444444444444444444444444444444444444", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test34055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34055");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("aaaaaaaaa", "");
        int int5 = org.apache.commons.lang3.StringUtils.indexOfAny("4                     aaaa0aaaaa                                          aaaa0aaaaa                                          aaaa0aaaaa                                          aaaa0aaaaa                                          aaaa0aaaaa                                          aaaa0aaaaa                                          aaaa0aaaaa                                          aaaa0aaaaa                                          aaaa0aaaaa                                          aaaa0aaaaa                                          aaaa0aaaaa                                          aaaa0aaaaa                                          aaaa0aaaaa                     ", strArray4);
        boolean boolean6 = org.apache.commons.lang3.StringUtils.endsWithAny("                                                                                                                                                                                                                                                                                                                                                                    444444444..", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test34056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34056");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 250L, (float) 128, (float) 589);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 589.0f + "'", float3 == 589.0f);
    }

    @Test
    public void test34057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34057");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                                                                                                                                  0aaaa                                                                  4ue-1.0097...444444444444444444444444########################################################################################100.44                                                                                                                                  0aaaa                                                                   ", "A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test34058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34058");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("                                           444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                           444444444444" + "'", str1, "                                           444444444444");
    }

    @Test
    public void test34059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34059");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("0AAA", 671);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test34060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34060");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("    A         A         A  A         A        rue-1.97.4444444444444444444444444444444444444444444                                                                                                                                                                                                                                                                                                                                                                                     ", "#0true-1.0097.0##########################################0true-1.0097.0############################", "...4444444...4444444...4444444...4444444...                                       444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...44444444444444444444444444...7900.1-eurt044444444444444444..4444444");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test34061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34061");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("                         AAAAAAAAAAAAAA                                                          ", "                                              aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4                                                                                                  ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                         AAAAAAAAAAAAAA                                                          " + "'", str2, "                         AAAAAAAAAAAAAA                                                          ");
    }

    @Test
    public void test34062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34062");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 232, (float) 570L, (float) 750);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 232.0f + "'", float3 == 232.0f);
    }

    @Test
    public void test34063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34063");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("                                                                                                                                                                                                                                                                                                                                      aahI!aa                                                                                                                                                                                                                                                                                                                                       ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aahI!aa" + "'", str1, "aahI!aa");
    }

    @Test
    public void test34064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34064");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("4444444...4444444...4444444...4...", "                                      100.0                                                     ");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test34065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34065");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("                                          ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                          " + "'", str1, "                                          ");
    }

    @Test
    public void test34066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34066");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("                                                                                                                                           0true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.0");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                                                                           0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.0" + "'", str1, "                                                                                                                                           0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.0");
    }

    @Test
    public void test34067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34067");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("                                                                                                                                    ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test34068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34068");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("A    44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"A    44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test34069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34069");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("44444AAAA0AAAAAAAAA0AAAAAAAAA0AAA...0...", "A HI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                                                                                                                                                                                                                                                                                                                                                                                                           ", 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test34070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34070");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("", "444444444..444444444444..444444444444..444444444444..444444444444..444444444444..444444444444444");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test34071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34071");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("Hi4!", '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hi4!" + "'", str2, "Hi4!");
    }

    @Test
    public void test34072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34072");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("0true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444", 136);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444" + "'", str2, "0true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444");
    }

    @Test
    public void test34073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34073");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("4444444...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "                                                                                                                                                                                                                                                                                                                                     ...44444444444...                                                                                                                                                                                                                                                                                                                                     ", 11);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test34074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34074");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("aaaaaaa", "0true-1.0097.04444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaa" + "'", str2, "aaaaaaa");
    }

    @Test
    public void test34075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34075");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("     a    44444444444444444444444444444444444444444440TRUE-1.0097.04444444444444444444444444444444444444444444", "                                                                                                                                                                                                                                                                                      0true-1.00                           aaaa0aaaaa                                             aaaa0a                                                                                                                                                                                                                                                                                       ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test34076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34076");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("0true-1.0097.00true-1.0097.00true-1.0097.00tr A");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test34077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34077");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("A      A                            100.0                                                     aaaa", "...........#######################################################################################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test34078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34078");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split(".0097.00tr          ...", "...####################################..", 14);
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "...44444444444444444444440TRUE-1.0440true-1.0097.0aaaa0aaaaa...44444444444444444444440TRUE-1.044");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test34079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34079");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "                                                                   AAAA0AAAAAAAAA0AAAAAAAAA0AAA...0...                                                                                                                                                                                   hI!                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 754 + "'", int1 == 754);
    }

    @Test
    public void test34080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34080");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("           a", "100.0");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test34081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34081");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("4444444444444444444444444444444444444444444 true-1. 97. 444444444444444444444444444444444444444444", "0097      a   HI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAA       ...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444444444444444444444444444444444444444 true-1. 97. 444444444444444444444444444444444444444444" + "'", str2, "4444444444444444444444444444444444444444444 true-1. 97. 444444444444444444444444444444444444444444");
    }

    @Test
    public void test34082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34082");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterType("                                      a                                                     ");
        boolean boolean3 = org.apache.commons.lang3.StringUtils.startsWithAny("", strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test34083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34083");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test34084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34084");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("true                                         TRUE-1                                                                                                  44444444444444444444444444444444444444444444A4444444444444444444A4444444444444444444A444");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"true                                         TRUE-1                                                                                                  44444444444444444444444444444444444444444444A4444444444444444444A4444444444444444444A444\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test34085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34085");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("444444444444444440TRUE-1.0097...444444444444444444444444444444444444444440TRUE-1.0097...444444444444444444444444444444444444444440TRUE-1.0097...444444444444444444444444444444444444444440TRUE-1.0097...444444444444444444444444444444444444444440TRUE-1.0097...444444444444444444444444444444444444444440TRUE-1.0097...444444444444444444444444444444444444444440TRUE-1.0097...444444444444444444444444444444444444444440TRUE-1.0097...444444444444444444444444444444444444444440TRUE-1.0097...444444444444444444444444444444444444444440TRUE-1.0097...444444444444444444444444444444444444444440TRUE-1.0097...444444444444444444444444444444444444444440TRUE-1.0097...44444444444444444444444                 ...                                                     ", 33, 99);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test34086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34086");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("97atrue-1.", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "97atrue-1." + "'", str2, "97atrue-1.");
    }

    @Test
    public void test34087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34087");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(76, 168, 136);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 76 + "'", int3 == 76);
    }

    @Test
    public void test34088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34088");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("4444444444440true-1.0097.", 465, 49);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test34089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34089");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "IHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIH");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test34090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34090");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("", "A0000000000                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test34091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34091");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("0true-1.0097.00true-1.0097.00true-1.0097.00tr4444a444440true-1.0097.00true-1.0097.00true-1.0097.00t", 111, 969);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test34092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34092");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("A         A         A         A         A       Aaaaaaaaa A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A", "                                                 ###0.001##", 11);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test34093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34093");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("4true-1.4497.4444444444444444444444444444", 124, "aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaa");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaa4true-1.4497.4444444444444444444444444444" + "'", str3, "aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaa4true-1.4497.4444444444444444444444444444");
    }

    @Test
    public void test34094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34094");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "...true-1....97....      #a######################...##############################################      #a######################.");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test34095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34095");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("0097.0                       a                    ", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0097.0                       a                    " + "'", str2, "0097.0                       a                    ");
    }

    @Test
    public void test34096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34096");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("4444444444444444444444444444100.044444444444444444444444444444444444444444444444444444aaa", "444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0true-1.44444444444444444444444444444444444444444440true-1.0097.097.44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaa" + "'", str2, "aaa");
    }

    @Test
    public void test34097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34097");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfBlank("                  4                   0true-1.0097.04444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444", "444444444444444444444444444444444444444444444     4    444444444444444444444444444444444444444444444          ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                  4                   0true-1.0097.04444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444" + "'", str2, "                  4                   0true-1.0097.04444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444");
    }

    @Test
    public void test34098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34098");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI..." + "'", str1, "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...");
    }

    @Test
    public void test34099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34099");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("0       00aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "                                               A44444                                               ");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2);
        int int4 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "000aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "000aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test34100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34100");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("    a   HI!HI!...", "RT00.7900.1-EURT00.7900.1-EURT00.7900.1-E");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test34101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34101");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test34102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34102");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!", "..44440TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR4444a444HI HI HI HI HI HI HI HI HI HI...4444a44444444                                                                                                                                                                   ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test34103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34103");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("A     .7900.1-eurt0444444444444444444...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "A.7900.1-eurt0444444444444444444..." + "'", str1, "A.7900.1-eurt0444444444444444444...");
    }

    @Test
    public void test34104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34104");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!###########################################################################################################################################################################################################################################################################################################################################################################################################################################", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa    A     ", 92);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa    A     #################" + "'", str3, "hi!hi!hi!hi!hi!hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa    A     #################");
    }

    @Test
    public void test34105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34105");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1.00..", "                                                 ###0.001##", "HI!");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test34106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34106");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("", "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444.04444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test34107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34107");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("a         a         a         a         a");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test34108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34108");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("###0.001##", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test34109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34109");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("                                                                                                                                                                           a         ", (byte) 10);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 10 + "'", byte2 == (byte) 10);
    }

    @Test
    public void test34110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34110");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("                           ", 145, 243);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test34111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34111");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "A   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    A");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test34112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34112");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "   1000    .         .        ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test34113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34113");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("100.0#100.0#100.0#100.0#100.0#100.0#100.0#100.0#100.0#100.0#100.0#Art00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt0#100.0#100.0#100.0#100.0#100.0#100.0#100.0#100.0#100.0#100.0#100.0", "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test34114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34114");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.stripAll(strArray1);
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, 'a', 86, 0);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.stripAll(strArray2);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test34115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34115");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("...0aaaa0aaaaa44444444444444444444444444444444...", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhI");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...0aaaa0aaaaa44444444444444444444444444444444..." + "'", str2, "...0aaaa0aaaaa44444444444444444444444444444444...");
    }

    @Test
    public void test34116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34116");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa444440true-1.0097...4444440true-1.0097...4444440444444444444444444444444444444440true-1.0097...4444440true-1.0097...4444440aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "444444444444444444444444444444444444444444444AAAA0AAAAA", "          ");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test34117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34117");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("444##444440true-1.0097...4444444444444444444440true-1#0097###44");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test34118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34118");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("44444444444444444444444444444444444444444440TRUE-1 0097 A 4444444444444444444444444444444444444444444440TRUE-1 0097 A 4444444444444444444444444444444444444444444440TRUE-1 0097 A 4444444444444444444444444444444444444444444440TRUE-1 0097 A 4444444444444444444444444444444444444444444440TRUE-1 0097 A 4444444444444444444444444444444444444444444440TRUE-1 0097 A 4444444444444444444444444444444444444444444440TRUE-1 0097 A 4444444444444444444444444444444444444444444440TRUE-1 0097 A 4444444444444444444444444444444444444444444440TRUE-1 0097 A 4444444444444444444444444444444444444444444440TRUE-1 0097", "                                                                                                                                                                                                                                                            0true-1.0097.044444444444444444444444444...                                                                                                                                                                                                                                                             ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "TRUE-1 0097 A 4444444444444444444444444444444444444444444440TRUE-1 0097 A 4444444444444444444444444444444444444444444440TRUE-1 0097 A 4444444444444444444444444444444444444444444440TRUE-1 0097 A 4444444444444444444444444444444444444444444440TRUE-1 0097 A 4444444444444444444444444444444444444444444440TRUE-1 0097 A 4444444444444444444444444444444444444444444440TRUE-1 0097 A 4444444444444444444444444444444444444444444440TRUE-1 0097 A 4444444444444444444444444444444444444444444440TRUE-1 0097 A 4444444444444444444444444444444444444444444440TRUE-1 0097" + "'", str2, "TRUE-1 0097 A 4444444444444444444444444444444444444444444440TRUE-1 0097 A 4444444444444444444444444444444444444444444440TRUE-1 0097 A 4444444444444444444444444444444444444444444440TRUE-1 0097 A 4444444444444444444444444444444444444444444440TRUE-1 0097 A 4444444444444444444444444444444444444444444440TRUE-1 0097 A 4444444444444444444444444444444444444444444440TRUE-1 0097 A 4444444444444444444444444444444444444444444440TRUE-1 0097 A 4444444444444444444444444444444444444444444440TRUE-1 0097 A 4444444444444444444444444444444444444444444440TRUE-1 0097");
    }

    @Test
    public void test34119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34119");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("0true-1.0097.044444444444444444444444444...", "A A A A                        a                             ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0true-1.0097.044444444444444444444444444..." + "'", str2, "0true-1.0097.044444444444444444444444444...");
    }

    @Test
    public void test34120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34120");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("          ###    a   HI!HI!.           ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test34121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34121");
        java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("44444444444444444444");
        org.junit.Assert.assertNotNull(bigDecimal1);
    }

    @Test
    public void test34122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34122");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("                   .0097.00tr          ...", '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                   .0097.00tr          ..." + "'", str2, "                   .0097.00tr          ...");
    }

    @Test
    public void test34123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34123");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                 aaaa0aaaaa    aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "rue-1.0097.0                                       ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test34124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34124");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("Aaaaaaaaa", "0                                                                                                                                                                                                                                                                         ");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "4                   0true-1.0097.04444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444");
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "AAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAA");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Aaaaaaaaa" + "'", str4, "Aaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Aaaaaaaaa" + "'", str6, "Aaaaaaaaa");
    }

    @Test
    public void test34125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34125");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("                                                      ", 224, 545);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test34126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34126");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("                   rt00.7900.                   ", 754, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                   rt00.7900.                   ##################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################" + "'", str3, "                   rt00.7900.                   ##################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################");
    }

    @Test
    public void test34127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34127");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("     a    44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test34128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34128");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) 78, (long) 967, (long) 445);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 78L + "'", long3 == 78L);
    }

    @Test
    public void test34129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34129");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("4444444444444444444444444444444444440true-1.0097.4444444444444444444444444444444444444444444440true-1.0097.4444444444444444444444444444444444444444444440true-1.0097.4444444444444444444444444444444444444444444440true-1.0097.4444444444444444444444444444aHI!HI!..", "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test34130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34130");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi44444444444444444444444444444444444444444444TRUE-1.497.44444444444444444444444444444444444444444444", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test34131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34131");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("###################    a   HI!HI!...#################");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"###################    a   HI!HI!...#################\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test34132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34132");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("###################################       hi!hi!", "0TRUE-1.0097.0", 826);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test34133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34133");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("                                                                                                                                                                                                                                                            0true-1.0097.044444444444444444444444444...                                                                                                                                                                                                                                                             ", "44444444444444444440TRUE-1.0097.                    ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                            0true-1.0097.044444444444444444444444444...                                                                                                                                                                                                                                                             " + "'", str2, "                                                                                                                                                                                                                                                            0true-1.0097.044444444444444444444444444...                                                                                                                                                                                                                                                             ");
    }

    @Test
    public void test34134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34134");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                   TRUE-1.0097.0                       a", "...               ", 138);
        boolean boolean5 = org.apache.commons.lang3.StringUtils.startsWithAny("44444444444444444444444a444444444444444444444444", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test34135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34135");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "true-97");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test34136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34136");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "...0aaaa0aaaaa44444444444444444444444444444444...", "44444444444444444444444444444444444444444444444444...TRUE-1.4444444...97.4444444...444444444444444444444444444444444444444444444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...44444444444444444444444444...7900.1-eurt044444444444444444..4444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test34137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34137");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("                                                                         aaaa0aaaaa    ", "#########################################################");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test34138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34138");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("0true-1.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"0true-1.0\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test34139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34139");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove(" 0044444440004444444000444444400", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " 0044444440004444444000444444400" + "'", str2, " 0044444440004444444000444444400");
    }

    @Test
    public void test34140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34140");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("", "ahi!hi!hi!haaaaaaaaaaaaaaa44444aaaaaaaaaaaaaaaaaaaaaaaa", 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test34141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34141");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("0true-1.0097.00true-1.0097.00true-1.0097.00tr    A     0true-1.0097.00true-1.0097.00true-1.0097.00t", "0true-1.0097.0");
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray4);
        int int6 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("aA44444A44444A44444A44444A44444A44444A44444A44444A44444100.0", strArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.concatWith("4444444444444444444444444444444444444444444...44444true-1....4444497....444444444444444444444444444444444444444444444444", (java.lang.Object[]) strArray4);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, "0                                                                                                                                                                                                                                                                         0                                                                                                    4444a44444");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "    A     " + "'", str5, "    A     ");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "    A     " + "'", str7, "    A     ");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "    A     " + "'", str9, "    A     ");
    }

    @Test
    public void test34142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34142");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) 4, (short) 0, (short) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 4 + "'", short3 == (short) 4);
    }

    @Test
    public void test34143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34143");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("44444440.7900.1-eurt04444444444444444444444444444444444444444440.7900.1-eurt044444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test34144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34144");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "444 44444 4444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test34145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34145");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("aa100.0aaaa", "UE");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test34146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34146");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.00...############################################################################");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, "                                                  ");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.00...############################################################################" + "'", str3, "TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.00...############################################################################");
    }

    @Test
    public void test34147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34147");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("rt00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt0 a rt00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt0", "44444444444                                                                                                 44444444444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test34148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34148");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA100.", "0true-10aaaa00970aaaa0", (int) '#', 33);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA0true-10aaaa00970aaaa0AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA100." + "'", str4, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA0true-10aaaa00970aaaa0AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA100.");
    }

    @Test
    public void test34149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34149");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("", "0true-1.00-1.0097.0444444444444444444444444444444...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test34150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34150");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("044444444444444444444444444                                                                                    ", 83);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test34151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34151");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("0true-1.0A A A A                        a44444...");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test34152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34152");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test34153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34153");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("444444444444444444444444...44444", "...44444444444...                 aaaaaaaaaaa aaaa0aaaaa                                                                                                       aaaa0aaaaa                                                                                                       aaaa0aaaaa                                                                                                       aaaa0aaaaa                                                                                                       aaaa0aaaaa                                                                                                       aaaa0aaaaa                                    ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "444444444444444444444444...44444" + "'", str2, "444444444444444444444444...44444");
    }

    @Test
    public void test34154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34154");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("!hi!hi!hi!hi!hi!hi!hi!hi!hi...    A    ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test34155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34155");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "###############################################################################################");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test34156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34156");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("a0aaaaa##############0true-1.0097.0444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "a0aaaaa##############0true-1.0097.044" + "'", str1, "a0aaaaa##############0true-1.0097.044");
    }

    @Test
    public void test34157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34157");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("...444###################################################44444444444444444444444                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ", "TRUETRUE");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test34158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34158");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("                                                                                                                                  aaaa0                                                                                                                                 ", 3, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                                  aaaa0                                                                                                                                 " + "'", str3, "                                                                                                                                  aaaa0                                                                                                                                 ");
    }

    @Test
    public void test34159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34159");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "     A    4");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test34160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34160");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("           A");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test34161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34161");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("0097..", "-1.0097.04444444444444444444444444444444444444444444", (int) (byte) -1);
        boolean boolean5 = org.apache.commons.lang3.StringUtils.startsWithAny("A4A4A4A444444444444444444444444a44444444444444444444444...aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test34162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34162");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("44444444444444444444444444444444444444444440true-1.0097. A 44444444444444444440true-1.0097. A 4444444444444444444444444444444444444444444440true-1.0097. A 4444444444444444444444444444444444444444444440true-1.0097. A 4444444444444444444444444444444444444444444440true-1.0097. A 4444444444444444444444444444444444444444444440true-1.0097. A 4444444444444444444444444444444444444444444440true-1.0097. A 4444444444444444444444444444444444444444444440true-1.0097. A 4444444444444444444444444444444444444444444440true-1.0097. A 4444444444444444444444444444444444444444444440true-1.0097", 'a', 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "44444444444444444444444444444444444444444440true-1.0097. A 44444444444444444440true-1.0097. A 4444444444444444444444444444444444444444444440true-1.0097. A 4444444444444444444444444444444444444444444440true-1.0097. A 4444444444444444444444444444444444444444444440true-1.0097. A 4444444444444444444444444444444444444444444440true-1.0097. A 4444444444444444444444444444444444444444444440true-1.0097. A 4444444444444444444444444444444444444444444440true-1.0097. A 4444444444444444444444444444444444444444444440true-1.0097. A 4444444444444444444444444444444444444444444440true-1.0097" + "'", str3, "44444444444444444444444444444444444444444440true-1.0097. A 44444444444444444440true-1.0097. A 4444444444444444444444444444444444444444444440true-1.0097. A 4444444444444444444444444444444444444444444440true-1.0097. A 4444444444444444444444444444444444444444444440true-1.0097. A 4444444444444444444444444444444444444444444440true-1.0097. A 4444444444444444444444444444444444444444444440true-1.0097. A 4444444444444444444444444444444444444444444440true-1.0097. A 4444444444444444444444444444444444444444444440true-1.0097. A 4444444444444444444444444444444444444444444440true-1.0097");
    }

    @Test
    public void test34163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34163");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("1", "4                                                   ");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray4, "A    44");
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.split("A   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi.", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa444");
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("...I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...", strArray6, strArray9);
        java.lang.String[] strArray14 = org.apache.commons.lang3.StringUtils.split("    A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A     ", "aaaaaaaaa");
        java.lang.String[] strArray16 = org.apache.commons.lang3.StringUtils.stripAll(strArray14, "!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray14, "a44444");
        boolean boolean19 = org.apache.commons.lang3.StringUtils.endsWithAny("04444444444444444444444444444444444444444444", strArray14);
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray14);
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("aaaaa0aaaa                     ", strArray6, strArray14);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "...I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI..." + "'", str10, "...I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...");
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "    A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A     " + "'", str18, "    A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A     ");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "    A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A     " + "'", str20, "    A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A     ");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "aaaaa0aaaa                     " + "'", str21, "aaaaa0aaaa                     ");
    }

    @Test
    public void test34164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34164");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("     A    aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4                                                   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1.0097.0", 732);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "     A    aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4                                                   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1.0097.0" + "'", str2, "     A    aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4                                                   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1.0097.0");
    }

    @Test
    public void test34165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34165");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "                                                            0         aaa                        ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test34166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34166");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("4444444444444444444444444444444444444444444#true#-#1#.#97#.#4444444444444444444444444444444444444444444true4444444444444444444444444444444444444444444#true#-#1#.#97#.#4444444444444444444444444444444444444444444-4444444444444444444444444444444444444444444#true#-#1#.#97#.#44444444444444444444444444444444444444444444444444444444444444444444444444444444444444#true#-#1#.#97#.#44444444444444444444444444444444444444444444444444444444444444444444444444444444444444#true#-#1#.#97#.#4444444444444444444444444444444444444444444974444444444444444444444444444444444444444444#true#-#1#.#97#.#44444444444444444444444444444444444444444444444444444444444444444444444444444444444444#true#-#1#.#97#.#4444444444444444444444444444444444444444444", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test34167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34167");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("", "...40TRUE-1.0097.04444444444444444444444444444444444...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test34168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34168");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 43L, 12.0f, 87.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 87.0f + "'", float3 == 87.0f);
    }

    @Test
    public void test34169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34169");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "444444444444444444444444...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "444444444444444444444444..." + "'", str1, "444444444444444444444444...");
    }

    @Test
    public void test34170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34170");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("                                                                                                                                                                                                         0TRUE-1.0097.044444444444444444444444444..", 150);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test34171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34171");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("                       #a#44444444444444444444#...#444444444444444444444444444444444444444444444", 188);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test34172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34172");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("A rt00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test34173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34173");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("                                            AAAA", "##100.0###", 655);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test34174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34174");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("aA44444A44a44444", "4444444true-1.00                                           true-1.97.", "444444444444444444440TRUE-    ...AAAA0AAAA");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test34175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34175");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("4444444440097...##########################################0444##############################################4444444440097...#############################################################################################4444444440097...#############################################################################################4444444440097...#################################A HI!HI!HI!HI!HI!HI!HI!HI!HI!HI... A", 660, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                                                                                                                                                         4444444440097...##########################################0444##############################################4444444440097...#############################################################################################4444444440097...#############################################################################################4444444440097...#################################A HI!HI!HI!HI!HI!HI!HI!HI!HI!HI... A" + "'", str3, "                                                                                                                                                                                                                                                         4444444440097...##########################################0444##############################################4444444440097...#############################################################################################4444444440097...#############################################################################################4444444440097...#################################A HI!HI!HI!HI!HI!HI!HI!HI!HI!HI... A");
    }

    @Test
    public void test34176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34176");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("", "                                                                                                                                                                                                                                aaa...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1.0097...aa                                                                                                                                                                                                                                                                         ", (int) 'a');
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test34177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34177");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("...!hi!hi!hi!hi!hi!hi!", "aaaaaaaaaaaaaaaaaaa0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.00....444444440tr...aaaaaaaaaaaaaaaaaa", "0AAAA4444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test34178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34178");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("4444a44444                                                                                                                                           ", "4A444HI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAA...44");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test34179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34179");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  rue-1.0097.0                                                                                                                                                                                                                                                               ", "hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi                                                                                                                                  0aaaa                                                                                                                                  ", 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test34180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34180");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfBlank((java.lang.CharSequence) "44444", (java.lang.CharSequence) "9EURT79EURT");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "44444" + "'", charSequence2, "44444");
    }

    @Test
    public void test34181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34181");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("...44444444444444444444440TRUE-1.044444444444444444444444444444444444444444440TRUE-1.044444444444444444444444444444444444444444440TRUE-1.044444444444444444444444444444444444444444440TRUE-1.044444444444444444444444444444444444444444440TRUE-1.044444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...44444444444444444444440true-1.044444444444444444444444444444444444444444440true-1.044444444444444444444444444444444444444444440true-1.044444444444444444444444444444444444444444440true-1.044444444444444444444444444444444444444444440true-1.044444444444" + "'", str1, "...44444444444444444444440true-1.044444444444444444444444444444444444444444440true-1.044444444444444444444444444444444444444444440true-1.044444444444444444444444444444444444444444440true-1.044444444444444444444444444444444444444444440true-1.044444444444");
    }

    @Test
    public void test34182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34182");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("0true-1.0097.00true-1.0097.00true-1.0097.00trHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HH", (byte) 100);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 100 + "'", byte2 == (byte) 100);
    }

    @Test
    public void test34183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34183");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("444444444444444444...true-1.4444444", 0, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "444444444444444444...true-1.4444444" + "'", str3, "444444444444444444...true-1.4444444");
    }

    @Test
    public void test34184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34184");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfBlank((java.lang.CharSequence) "                                   ...                                   ", (java.lang.CharSequence) "44444444444444444440TRUE-1.0097.                                                                      ");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "                                   ...                                   " + "'", charSequence2, "                                   ...                                   ");
    }

    @Test
    public void test34185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34185");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("aa                100.0aaaa                 ", " 44444444444444444444444444444444444444444444444444444444444444444444444444444                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test34186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34186");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("0HI!HI!HI!HI!HI!HI!HI!HI!HI!HI.A A A1.00HI!HI!HI!HI!HI!HI!HI!HI!HI!HI.A A A1.00HI!HI!HI!HI!HI!HI!HI!HI!HI!HI.A A A.0HI!HI!HI!HI!HI!HI!HI!HI!HI!HI.A A AA   hi!hi!hi!haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 123);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0HI!HI!HI!HI!HI!HI!HI!HI!HI!HI.A A A1.00HI!HI!HI!HI!HI!HI!HI!HI!HI!HI.A A A1.00HI!HI!HI!HI!HI!HI!HI!HI!HI!HI.A A A.0HI!HI!HI!HI!HI!HI!HI!HI!HI!HI.A A AA   hi!hi!hi!haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "0HI!HI!HI!HI!HI!HI!HI!HI!HI!HI.A A A1.00HI!HI!HI!HI!HI!HI!HI!HI!HI!HI.A A A1.00HI!HI!HI!HI!HI!HI!HI!HI!HI!HI.A A A.0HI!HI!HI!HI!HI!HI!HI!HI!HI!HI.A A AA   hi!hi!hi!haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test34187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34187");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih                   ", 130);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test34188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34188");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("                                                                                                                                                                                                                                                                         0", "...00.1-EURT04444444444444444444444444444444444444444440.7900.1-EURT044444444444444444444444444440true-1.0097.0aaaa0aaaaa4444444444444444444444444...", "                                      100.0                                                      ", 400);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "                                                                                                                                                                                                                                                                         0" + "'", str4, "                                                                                                                                                                                                                                                                         0");
    }

    @Test
    public void test34189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34189");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("a A 1000 A A                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               ", "                                                                                                                                                                                                                                                                a    ...IH!IH!IH!IH!IH!IH!IH!IH!IH!IH   a                                                                                                                                                                                                                                                                 ", "     A    aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1.0097.0");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "a A 1000 A A                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               " + "'", str3, "a A 1000 A A                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               ");
    }

    @Test
    public void test34190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34190");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("                                                                                                                                              4444444444444444444444444440.7900.1-EURT04444444444444444444444444444444444444444440.7900.1-EURT044444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa                                                                                                                                              ", "...00.7900.1-eurt00.7900.1-eurt0");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test34191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34191");
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
    public void test34192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34192");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("0true-1.0097.00true-1.0097.00true-1.0097.00tr A");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR a" + "'", str1, "0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR a");
    }

    @Test
    public void test34193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34193");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("                                                                                                 I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HII!HI!HI!HI!HI!HI!HI!HI!HI");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test34194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34194");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "            0000000");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test34195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34195");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("0.0010.0hi");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray1, "                                                                                                                                                                                                                                          44444444444444444440true-1.0097.");
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, "");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "0.0010.0hi" + "'", str5, "0.0010.0hi");
    }

    @Test
    public void test34196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34196");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("...44444444444444444444440TRUE-1.044444444444444444444444444444444444444444440TRUE-1.044444444444444444444444444444444444444444440TRUE-1.044444444444444444444444444444444444444444440TRUE-1.044444444444444444444444444444444444444444440TRUE-1.044444444444", "    4444444444444444444444444444   ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test34197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34197");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!", "...44444444444444444444444444444444440true-1.0097...");
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, '#');
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("", "444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0true-1.44444444444444444444444444444444444444444440true-1.0097.097.44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444", 0);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.concatWith("444444444444444444444444...44444444444444444444444444444444440TRUE-1.0097...444444444444444444444444", (java.lang.Object[]) strArray10);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray10);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray10);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray10, "HI!", 56, 47);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("0true-1.0097.00true-1.0097.00true-1.0097.00tr A ", strArray3, strArray10);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray10, "...444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444...", 47, 135);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!" + "'", str5, "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!");
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "0true-1.0097.00true-1.0097.00true-1.0097.00tr A " + "'", str18, "0true-1.0097.00true-1.0097.00true-1.0097.00tr A ");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test34198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34198");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                               true  ", 967, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                     aaaaaa0aaaaaaaaaaaaa444444...                                                                ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                     aaaaaa0aaaaaaaaaaaaa444444...                                                                                                                                                                                                                                                                                                                                                                                                      aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                               true  " + "'", str3, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                     aaaaaa0aaaaaaaaaaaaa444444...                                                                                                                                                                                                                                                                                                                                                                                                      aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                               true  ");
    }

    @Test
    public void test34199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34199");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "444444444444444444440TRUE-    ...AAAA0AAAA", (java.lang.CharSequence) "                       0aaa                        ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test34200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34200");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4                                                   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4                                                   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test34201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34201");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) " ...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test34202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34202");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("0true-1.0097.00true-1.0097.00true-1.0097.00trA0true-1.0097.00true-1.0097.00true-1.0097.00tr", "44444444444444444444444444444444444444444440true-1.0097.     a    4444444444444444444444444444444444444444444440true-1.0097.     a    4444444444444444444444444444444444444444444440true-1.0097.     a    4444444444444444444444444444444444444444444440true-1.0097.     a    4444444444444444444444444444444444444444444440true-1.0097.     a    4444444444444444444444444444444444444444444440true-1.0097.     a    4444444444444444444444444444444444444444444440true-1.0097.     a    4444444444444444444444444444444444444444444440true-1.0097.     a    4444444444444444444444444444444444444444444440true-1.0097.     a    4444444444444444444444444444444444444444444440true-1.0097");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test34203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34203");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("rt00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt044444a4444rt00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt                           aaaa0aaaaa aaaa0aaaaa aaaa0aaaaa aaaa0aaaaa                           ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "rt00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt044444a4444rt00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt                           aaaa0aaaaa aaaa0aaaaa aaaa0aaaaa aaaa0aaaaa                           " + "'", str1, "rt00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt044444a4444rt00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt                           aaaa0aaaaa aaaa0aaaaa aaaa0aaaaa aaaa0aaaaa                           ");
    }

    @Test
    public void test34204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34204");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "4444444...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4444444..." + "'", str1, "4444444...");
    }

    @Test
    public void test34205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34205");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("9744");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "9744" + "'", str1, "9744");
    }

    @Test
    public void test34206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34206");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "4444444444444444444aaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4444444444444444444aaaaaaaaaaaaaaaaaa" + "'", str1, "4444444444444444444aaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test34207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34207");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("                                               A44444                                               ", 533, "0true-1.0097.00true-1.0097.00true-1.0097.00tr A ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0true-1.0097.00true-1.0097.00true-1.0097.00tr A 0true-1.0097.00true-1.0097.00true-1.0097.00tr A 0true-1.0097.00true-1.0097.00true-1.0097.00tr A 0true-1.0097.00true-1.0097.00true-1.0097.00tr A 0true-1.0097.00true-1.00                                               A44444                                               0true-1.0097.00true-1.0097.00true-1.0097.00tr A 0true-1.0097.00true-1.0097.00true-1.0097.00tr A 0true-1.0097.00true-1.0097.00true-1.0097.00tr A 0true-1.0097.00true-1.0097.00true-1.0097.00tr A 0true-1.0097.00true-1.009" + "'", str3, "0true-1.0097.00true-1.0097.00true-1.0097.00tr A 0true-1.0097.00true-1.0097.00true-1.0097.00tr A 0true-1.0097.00true-1.0097.00true-1.0097.00tr A 0true-1.0097.00true-1.0097.00true-1.0097.00tr A 0true-1.0097.00true-1.00                                               A44444                                               0true-1.0097.00true-1.0097.00true-1.0097.00tr A 0true-1.0097.00true-1.0097.00true-1.0097.00tr A 0true-1.0097.00true-1.0097.00true-1.0097.00tr A 0true-1.0097.00true-1.0097.00true-1.0097.00tr A 0true-1.0097.00true-1.009");
    }

    @Test
    public void test34208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34208");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("AAAA", (byte) 1);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 1 + "'", byte2 == (byte) 1);
    }

    @Test
    public void test34209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34209");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("    A     0true-1.0097.00true-1.0097.00true-1.0097.00trHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HH", "########################4444444444444444444444440TRUE-1.009...");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test34210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34210");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(0L, (long) 895, (long) 16);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 895L + "'", long3 == 895L);
    }

    @Test
    public void test34211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34211");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 571, 0.0f, (float) 156);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test34212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34212");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("hihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihi", "a   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    4444444444444444444444444444444444444", "4444444444444444444444444444444444444444444444444444444444444444444444   !    ", 975);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihi" + "'", str4, "hihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihi");
    }

    @Test
    public void test34213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34213");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("a                   TRUE-1.0097.0                       a                    ", "......................");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test34214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34214");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("!HI!HI!HI!HI!HI!HI!HI!HI!");
        boolean boolean4 = org.apache.commons.lang3.StringUtils.startsWithAny("                                                                                                                                                                             ", strArray3);
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.split("44444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444", '4');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray9);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.concatWith("##100.0###", (java.lang.Object[]) strArray9);
        int int12 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("AE444444444444444444444", strArray9);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("A    4444444444444444444444444444444444444444444440true-1.0097.     A    44444444444444444444", strArray3, strArray9);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0true-1.0097.0" + "'", str10, "0true-1.0097.0");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "0true-1.0097.0" + "'", str11, "0true-1.0097.0");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "A    4444444444444444444444444444444444444444444440true-1.0097.     A    44444444444444444444" + "'", str13, "A    4444444444444444444444444444444444444444444440true-1.0097.     A    44444444444444444444");
    }

    @Test
    public void test34215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34215");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAH!IH!IH!IHa", '#', '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAH!IH!IH!IHa" + "'", str3, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAH!IH!IH!IHa");
    }

    @Test
    public void test34216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34216");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("                                      41004.404                                                ");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test34217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34217");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("...444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444...444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444...44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "A A A A A4A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test34218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34218");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444                       a4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test34219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34219");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test34220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34220");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("...aaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test34221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34221");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("444hi!hi!hi!...hi!hi!hi!44444444444444444444444444444444440hi!hi!hi!truehi!hi!hi!-hi     A    44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444444hi!hi!hi!...hi!hi!hi!44444444444444444444444444444444440hi!hi!hi!truehi!hi!hi!-hi!", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaA    ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih   Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test34222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34222");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("", "A   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    ", 202);
        int int5 = org.apache.commons.lang3.StringUtils.indexOfAny("######...", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test34223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34223");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("A444444               a   hi!hi!...A444444               a   hi!hi!...A444444               a   hi!hi!......", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test34224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34224");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("79  .1-eurt 444444440 true - 1 . 44444444444444444444");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"79  .1-eurt 444444440 true - 1 . 44444444444444444444\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test34225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34225");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "                                                                                               ...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test34226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34226");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("0444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0444444444444444444444444444444444444444444" + "'", str1, "0444444444444444444444444444444444444444444");
    }

    @Test
    public void test34227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34227");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("0atruea-a1a.a0097a.a0", "                                                                                                                                                                                                                                                                                                                                                                                                                                             4444A44444                                                                                                                                                                                                                          ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0atruea-a1a.a0097a.a0" + "'", str2, "0atruea-a1a.a0097a.a0");
    }

    @Test
    public void test34228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34228");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "hI");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test34229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34229");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt(" rt00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt0art00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt0 ", 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test34230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34230");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("ue-1.0097.444444444444444444444444", '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ue-1.0097." + "'", str2, "ue-1.0097.");
    }

    @Test
    public void test34231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34231");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("ue-1.0097.", "0444...44444444444444444444444444444444440TRUE-1.0097...4", 56);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test34232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34232");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR", 104);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR" + "'", str2, "TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR");
    }

    @Test
    public void test34233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34233");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("                                                                                                aaaa                                                                                                aaaa                                                                                                aaaa                                                                                                                                aaaa                                                                                                aaaa                                                                                                aaaa                                 ", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                aaaa                                                                                                aaaa                                                                                                aaaa                                                                                                                                aaaa                                                                                                aaaa                                                                                                aaaa                                 " + "'", str2, "                                                                                                aaaa                                                                                                aaaa                                                                                                aaaa                                                                                                                                aaaa                                                                                                aaaa                                                                                                aaaa                                 ");
    }

    @Test
    public void test34234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34234");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi!hi!hi!hi0true-1.0097.00true-1.0097.00true-1.0097.00trA0t...aaaaaaa", "                     aaaa0aaaaa                                   aaaa0aaaaa                                   aaaa0aaaaa                                   aaaa0aaaaa                         ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test34235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34235");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("            1000    a         a", "                                                                                   ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "            1000    a         a" + "'", str2, "            1000    a         a");
    }

    @Test
    public void test34236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34236");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("4444.444444444.4444444444444444444444444444444444444444444444444444410004444.444444444.444444444", 202, "             AAAA0AAAAA    ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4444.444444444.4444444444444444444444444444444444444444444444444444410004444.444444444.444444444             AAAA0AAAAA                 AAAA0AAAAA                 AAAA0AAAAA                 AAAA0AAAAA  " + "'", str3, "4444.444444444.4444444444444444444444444444444444444444444444444444410004444.444444444.444444444             AAAA0AAAAA                 AAAA0AAAAA                 AAAA0AAAAA                 AAAA0AAAAA  ");
    }

    @Test
    public void test34237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34237");
        long[] longArray1 = new long[] { (short) 100 };
        long long2 = org.apache.commons.lang3.math.NumberUtils.min(longArray1);
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(longArray1);
        long long4 = org.apache.commons.lang3.math.NumberUtils.min(longArray1);
        long long5 = org.apache.commons.lang3.math.NumberUtils.min(longArray1);
        long long6 = org.apache.commons.lang3.math.NumberUtils.max(longArray1);
        long long7 = org.apache.commons.lang3.math.NumberUtils.min(longArray1);
        long long8 = org.apache.commons.lang3.math.NumberUtils.max(longArray1);
        long long9 = org.apache.commons.lang3.math.NumberUtils.min(longArray1);
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray1), "[100]");
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 100L + "'", long9 == 100L);
    }

    @Test
    public void test34238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34238");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "                                                                                ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test34239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34239");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("4444444...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4444444..." + "'", str1, "4444444...");
    }

    @Test
    public void test34240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34240");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("4444444444444444444444444444444444444444444 TRUE-1. 97. 4444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4444444444444444444444444444444444444444444 TRUE-1. 97. 4444444444444444444444444444444444444444444" + "'", str1, "4444444444444444444444444444444444444444444 TRUE-1. 97. 4444444444444444444444444444444444444444444");
    }

    @Test
    public void test34241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34241");
        long[] longArray5 = new long[] { (byte) 1, (byte) 10, (short) -1, (byte) 10, (short) 10 };
        long long6 = org.apache.commons.lang3.math.NumberUtils.min(longArray5);
        long long7 = org.apache.commons.lang3.math.NumberUtils.max(longArray5);
        long long8 = org.apache.commons.lang3.math.NumberUtils.max(longArray5);
        long long9 = org.apache.commons.lang3.math.NumberUtils.max(longArray5);
        long long10 = org.apache.commons.lang3.math.NumberUtils.max(longArray5);
        long long11 = org.apache.commons.lang3.math.NumberUtils.max(longArray5);
        long long12 = org.apache.commons.lang3.math.NumberUtils.min(longArray5);
        long long13 = org.apache.commons.lang3.math.NumberUtils.min(longArray5);
        org.junit.Assert.assertNotNull(longArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray5), "[1, 10, -1, 10, 10]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 10L + "'", long8 == 10L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10L + "'", long9 == 10L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 10L + "'", long10 == 10L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 10L + "'", long11 == 10L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
    }

    @Test
    public void test34242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34242");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("                                                                                                                                                                                                                                                                                                                                                                                                           0TRUE-1.04444444444444444444444444444444444444444444                                                                                                                                                                                                                                                                                                                                                                                                           ", "...44444...true-1.4444444...97.4444444...444444...44444...true-1.4444444...97.4444444...4444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                           0TRUE-1.04444444444444444444444444444444444444444444                                                                                                                                                                                                                                                                                                                                                                                                           " + "'", str2, "                                                                                                                                                                                                                                                                                                                                                                                                           0TRUE-1.04444444444444444444444444444444444444444444                                                                                                                                                                                                                                                                                                                                                                                                           ");
    }

    @Test
    public void test34243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34243");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("AAAA0AAAAAAAAA0AAAAAAAAA0AAA...0...", "aaaaaaaaaaaaaaaaaaaaaaaaa...", 0);
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("A         A         A        ...", "", 99);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.startsWithAny("0true-1.00-1.0097.04444444444444444444444444444444A   hi!hi!hi!haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", strArray9);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("aHI!HI!HI!HI!HI!HI!HI!HI!HI!HI...a", strArray4, strArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 7 vs 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test34244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34244");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("0true-1.0097.4444444444444444444444444444444444444444444440true-1.009", 234);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test34245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34245");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("A HI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              ");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test34246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34246");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("                                     100.0                                                     aaaa                                     ", "                                           444444444444", "A .7ee444ee44440.7ee444ee44440.7ee444ee44440.7e");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                     100.0                                                     aaaa                                     " + "'", str3, "                                     100.0                                                     aaaa                                     ");
    }

    @Test
    public void test34247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34247");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("hi!hi!hi!hi!hi0true-1.0097.00true-1.0097.00true-1.0097.00trA0t...");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test34248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34248");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("4444444444444444444444444444444444444444440a.a7900a.a1a-aeurta04444444444444444444444444444444444444444440a.a7900a.a1a-aeurta04444444444444444444444444444444444444444440a.a7900a.a1a-aeurta04444444444444444444444444444444444444444440a.a7900a.a1a-aeurta04444444444444444444444444444444444444444440a.a7900a.a1a-aeurta04444444444444444444444444444444444444444440a.a7900a.a1a-aeurta04444444444444444444444444444444444444444440a.a7900a.a1a-aeurta04444444444444444444444444444444444444444440a.a7900a.a1a-aeurta04444444444444444444444444444444444444444440a.a7900a.a1a-aeurta04444444444444444444444444444444444444444440a.a7900a.a1a-aeurta0");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test34249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34249");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("######################################################################################################################################################################################################################################################################################################################################################################4TRUE4-414.400974.4004TRUE4-414.400974.4004TRUE4-414.400974.4004TR4 4A4#######################################################################################################################################################################################################################################################################################################################################################################", "             AAAA0AAAAA    ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test34250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34250");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("...I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HhI!7.44444444444444444444444444444444444444444444");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: multiple points");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test34251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34251");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("...00true-1.0097.00true-1.0097.00tr", "...AAAAAAAAAAAAAAAAAAAAAAAAAAAAH!IH!IH!IH000A...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test34252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34252");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A", "..    0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR", 237);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test34253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34253");
        char[] charArray16 = new char[] { ' ', '4', 'a', 'a', 'a' };
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "100.0", charArray16);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray16);
        boolean boolean19 = org.apache.commons.lang3.StringUtils.containsAny("44444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444", charArray16);
        int int20 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "0true-1.0097.00true-1.0097.00true-1.0097.00tr    A     0true-1.0097.00true-1.0097.00true-1.0097.00t", charArray16);
        boolean boolean21 = org.apache.commons.lang3.StringUtils.containsAny("4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...", charArray16);
        boolean boolean22 = org.apache.commons.lang3.StringUtils.containsAny("HI", charArray16);
        int int23 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "4444a44444", charArray16);
        boolean boolean24 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "A A A A ", charArray16);
        boolean boolean25 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "aaaa0aaaaaaaaa0aaaaaaaaa0aaa...0...", charArray16);
        int int26 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "444", charArray16);
        int int27 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "0true-1.0097.00true-1.0097.00true-1.0097.00tr4444A444440true-1.0097.00true-1.0097.00true-1.0097.00t", charArray16);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray16), " 4aaa");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray16), " 4aaa");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray16), "[ , 4, a, a, a]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 45 + "'", int20 == 45);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 45 + "'", int27 == 45);
    }

    @Test
    public void test34254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34254");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("00       0");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test34255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34255");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "0true-1.0097.4444444444444444444444444444444444444444444440true-1.009");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test34256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34256");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "aaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Aaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaa" + "'", str1, "Aaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaa");
    }

    @Test
    public void test34257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34257");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("aHI!HI!HI!HI!HI!HI!HI!HI!HI!HIaaHI!HI!HI!HI!HI!HI!HI!HI!HI!HIaahi!hi!hi!haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                                                                                                      ", "ih444444444444444444........4444444444...4444444440444444444444444444........4444444444...444444444.444444444444444444........4444444444...4444444440100444444444444444444........4444444444...444444444.444444444444444444........4444444444...4444444440");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aHI!HI!HI!HI!HI!HI!HI!HI!HI!HIaaHI!HI!HI!HI!HI!HI!HI!HI!HI!HIaahi!hi!hi!haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                                                                                                      " + "'", str2, "aHI!HI!HI!HI!HI!HI!HI!HI!HI!HIaaHI!HI!HI!HI!HI!HI!HI!HI!HI!HIaahi!hi!hi!haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                                                                                                      ");
    }

    @Test
    public void test34258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34258");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         ...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test34259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34259");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("    a   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    a    ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "    a   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    a    " + "'", str1, "    a   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    a    ");
    }

    @Test
    public void test34260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34260");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("790041-eurt044410040", 84);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "790041-eurt044410040" + "'", str2, "790041-eurt044410040");
    }

    @Test
    public void test34261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34261");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf(".0097.00true-1.00", "4444444...AAAAAAAAA44444444444444444444444444444444444444444", 59);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test34262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34262");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa" + "'", str1, "aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa");
    }

    @Test
    public void test34263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34263");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("        a                     44444444444444444444444444444444444444444444444444444444444444");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"a                     44444444444444444444444444444444444444444444444444444444444444\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test34264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34264");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("                                                                                                                                                                                                                                                                           true 1.  97                                                                                                                                                                                                                                                                            ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message:                                                                                                                                                                                                                                                                            true 1.  97                                                                                                                                                                                                                                                                             is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test34265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34265");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("...4444444...4444444...4444444...4444444...---------------------------------------444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...44444444444444444444444444...0077.00...t744444444444444444..4444444", 252, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...4444444...4444444...4444444...4444444...---------------------------------------444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...44444444444444444444444444...0077.00...t744444444444444444..4444444" + "'", str3, "...4444444...4444444...4444444...4444444...---------------------------------------444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...44444444444444444444444444...0077.00...t744444444444444444..4444444");
    }

    @Test
    public void test34266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34266");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("4444444444444444444444444444444444444444444444444444444444444444444444   !    aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "0 tru...ue-1.0097.044444444444444444444444444444444...4444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test34267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34267");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("                                                                                ", "                                                                                                ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test34268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34268");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                                                 ", "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H");
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, ' ', 60, 31);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "       aaaa0aaaaa                     ...");
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray8, '4');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test34269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34269");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("##############################################################4true4-4449744########################################");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test34270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34270");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("....IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I...", 'a');
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test34271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34271");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("44440.7900.1-eurt0", 9);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44440.7900.1-eurt0" + "'", str2, "44440.7900.1-eurt0");
    }

    @Test
    public void test34272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34272");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfBlank("4444################################################################################################", "    A         A                                                     1000    A         A         ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444################################################################################################" + "'", str2, "4444################################################################################################");
    }

    @Test
    public void test34273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34273");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("aaaaaaaaa...44444444444444444444444444444444hi4!aaaaaaaaaa", "a   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    4444444444444444444444444444444444444", 64);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test34274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34274");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!" };
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray4);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray5);
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("4444444...", "a", (int) '4');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444", strArray5, strArray10);
        int int12 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("444444444444444440true-1.0097...444444444444444444444444", strArray5);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.startsWithAny("44444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444", strArray5);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444" + "'", str11, "44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test34275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34275");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("......................", "0444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test34276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34276");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("AAAAAA0AAAAAAA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AAAAAA0AAAAAAA" + "'", str1, "AAAAAA0AAAAAAA");
    }

    @Test
    public void test34277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34277");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("                                                                                                                                    ", 400, "44444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444                                                                                                                                    " + "'", str3, "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444                                                                                                                                    ");
    }

    @Test
    public void test34278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34278");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("AAAAA0AAAA0.7900.1-EURT04444444444444444", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AAAAA0AAAA0.7900.1-EURT04444444444444444" + "'", str2, "AAAAA0AAAA0.7900.1-EURT04444444444444444");
    }

    @Test
    public void test34279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34279");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("..00.1-eurt0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               ", 665);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test34280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34280");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.00...############################################################################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.00...############################################################################" + "'", str1, "TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.00...############################################################################");
    }

    @Test
    public void test34281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34281");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.00...", "0atruea-a1a.a0097a.a0");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test34282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34282");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("A     .7900.1-eurt0444444444444444444...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "A     .7900.1-eurt0444444444444444444..." + "'", str1, "A     .7900.1-eurt0444444444444444444...");
    }

    @Test
    public void test34283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34283");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("...aaaa...444444444", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...aaaa...444444444" + "'", str2, "...aaaa...444444444");
    }

    @Test
    public void test34284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34284");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("0true-1.0097.044444444444444444444444444444444444444444", 62, 80);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test34285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34285");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("4444444..444444444444444440TRUE-1.0097...44444444444444444444444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...", ".44444444444444444444444444444444a    4");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test34286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34286");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "   a         ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test34287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34287");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("44444444444444444444444444444444440true-140097", 'a');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test34288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34288");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "44444444444444444444444444444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A44444444444444444444444444444444444444444444444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A44444444444444444444444444444444444444444444444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "44444444444444444444444444444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A44444444444444444444444444444444444444444444444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A44444444444444444444444444444444444444444444444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str1, "44444444444444444444444444444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A44444444444444444444444444444444444444444444444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A44444444444444444444444444444444444444444444444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test34289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34289");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("    A   HI!HI!HI!HI!HI!HI!HI!HI!HI!H");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AHI!HI!HI!HI!HI!HI!HI!HI!HI!H" + "'", str1, "AHI!HI!HI!HI!HI!HI!HI!HI!HI!H");
    }

    @Test
    public void test34290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34290");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) 100, (short) 0, (short) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test34291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34291");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("##100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0##Art00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt0##100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0###", "               true                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "##100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0##Art00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt0##100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0###" + "'", str2, "##100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0##Art00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt0##100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0###");
    }

    @Test
    public void test34292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34292");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("A .7ee444ee44440.7ee444ee44440.7ee444ee44440.7e");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "e7.04444ee444ee7.04444ee444ee7.04444ee444ee7. A" + "'", str1, "e7.04444ee444ee7.04444ee444ee7.04444ee444ee7. A");
    }

    @Test
    public void test34293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34293");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("                            100.0                ...                            ", "true-1...97.............................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................", 30);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                            100.0                ...                            " + "'", str3, "                            100.0                ...                            ");
    }

    @Test
    public void test34294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34294");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("44444AAAA0AAAAAAAAA0AAAAAAAAA0AAA...0...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "44444AAAA0AAAAAAAAA0AAAAAAAAA0AAA...0..." + "'", str1, "44444AAAA0AAAAAAAAA0AAAAAAAAA0AAA...0...");
    }

    @Test
    public void test34295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34295");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("Ahi!hi!hi!haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444444444444444444444444444444444444444440true-1.0097.  A    44444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    44444444!hi!hi!hi...    A0true-1.0097.0aaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1.0097.0aaaaaaaaaaaaaaaaaaaaaaa", ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Ahi!hi!hi!haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444444444444444444444444444444444444444440true-1.0097.A44444444444444444440true-1.0097.A4444444444444444444444444444444444444444444440true-1.0097.A44444444!hi!hi!hi...A0true-1.0097.0aaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1.0097.0aaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "Ahi!hi!hi!haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444444444444444444444444444444444444444440true-1.0097.A44444444444444444440true-1.0097.A4444444444444444444444444444444444444444444440true-1.0097.A44444444!hi!hi!hi...A0true-1.0097.0aaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1.0097.0aaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test34296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34296");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "A00       000       000       0", (java.lang.CharSequence) "99999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test34297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34297");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("                                                                                                                                                                                                                                                                                                                                                                             444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test34298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34298");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("...44444444444444444444444444444444440true-1.0097...A...44444444444444444444444444444444440true-1.0097...         ...44444444444444444444444444444444440true-1.0097...A...44444444444444444444444444444444440true-1.0097...                                                     ...44444444444444444444444444444444440true-1.0097...100...44444444444444444444444444444444440true-1.0097.......44444444444444444444444444444444440true-1.0097...0...44444444444444444444444444444444440true-1.0097...    ...44444444444444444444444444444444440true-1.0097...A...44444444444444444444444444444444440true-1.0097...         ...44444444444444444444444444444444440true-1.0097...A...44444444444444444444444444444444440true-1.0097...", 6, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...44444444444444444444444444444444440true-1.0097...A...44444444444444444444444444444444440true-1.0097...         ...44444444444444444444444444444444440true-1.0097...A...44444444444444444444444444444444440true-1.0097...                                                     ...44444444444444444444444444444444440true-1.0097...100...44444444444444444444444444444444440true-1.0097.......44444444444444444444444444444444440true-1.0097...0...44444444444444444444444444444444440true-1.0097...    ...44444444444444444444444444444444440true-1.0097...A...44444444444444444444444444444444440true-1.0097...         ...44444444444444444444444444444444440true-1.0097...A...44444444444444444444444444444444440true-1.0097..." + "'", str3, "...44444444444444444444444444444444440true-1.0097...A...44444444444444444444444444444444440true-1.0097...         ...44444444444444444444444444444444440true-1.0097...A...44444444444444444444444444444444440true-1.0097...                                                     ...44444444444444444444444444444444440true-1.0097...100...44444444444444444444444444444444440true-1.0097.......44444444444444444444444444444444440true-1.0097...0...44444444444444444444444444444444440true-1.0097...    ...44444444444444444444444444444444440true-1.0097...A...44444444444444444444444444444444440true-1.0097...         ...44444444444444444444444444444444440true-1.0097...A...44444444444444444444444444444444440true-1.0097...");
    }

    @Test
    public void test34299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34299");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("A A A A                        a                       ...aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true", 667, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "A A A A                        a                       ...aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440trueaaaaaaaaaaaaaaa" + "'", str3, "A A A A                        a                       ...aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440trueaaaaaaaaaaaaaaa");
    }

    @Test
    public void test34300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34300");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger(" aaaa0aaaaa    ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \" aaaa0aaaaa    \"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test34301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34301");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("RT00.7900.1-EURT00.7900.1-EURT00.7900.1-EURT0     A    RT00.7900.1-EURT00.7900.1-EURT00.7900.1-EURT", "...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "RT00.7900.1-EURT00.7900.1-EURT00.7900.1-EURT0     A    RT00.7900.1-EURT00.7900.1-EURT00.7900.1-EURT" + "'", str2, "RT00.7900.1-EURT00.7900.1-EURT00.7900.1-EURT0     A    RT00.7900.1-EURT00.7900.1-EURT00.7900.1-EURT");
    }

    @Test
    public void test34302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34302");
        java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertNotNull(number1);
    }

    @Test
    public void test34303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34303");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("", "#############################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################0.00");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test34304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34304");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("4444444... 4444444... 4444444... 4444444... 4444444... 4444444... 4444444... 4444444... 4444444... 4444444... 4444444... 4444444... 4444444... 4444444... 4444444... 4444444... 4444444... 4444444... 4444444... 4444444... 4444444... 4444444... 4444444... 4444444..974");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"4444444... 4444444... 4444444... 4444444... 4444444... 4444444... 4444444... 4444444... 4444444... 4444444... 4444444... 4444444... 4444444... 4444444... 4444444... 4444444... 4444444... 4444444... 4444444... 4444444... 4444444... 4444444... 4444444... 4444444..974\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test34305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34305");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("   ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: A blank string is not a valid number");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test34306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34306");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "0097...#############################################################################################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str2, "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test34307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34307");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("                                                                                                                                                                                                                                                                                                         100.097.044444444444444444444444444...                                                                                                                                                                                                                                                                                                          ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                                                                                                                                                                                                                                         100.097.044444444444444444444444444...                                                                                                                                                                                                                                                                                                          " + "'", str1, "                                                                                                                                                                                                                                                                                                         100.097.044444444444444444444444444...                                                                                                                                                                                                                                                                                                          ");
    }

    @Test
    public void test34308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34308");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("    a   hi!hi!...", "4444444444444444444444444444444444444444444                                                                                                                                                                                                                                                                          0.79                                                                                                                                                                                                                                                                          0.1-eurt                                                                                                                                                                                                                                                                          04444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test34309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34309");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("RT00.7900.1-EURT00.7900.1-EURT00.7900.1-EURT0ART00.7900.1-EURT00.7900.1-EURT00.7900.1-EURT");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test34310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34310");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("true-1.00true-1.97.");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "true-1.00true-1.97." + "'", str1, "true-1.00true-1.97.");
    }

    @Test
    public void test34311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34311");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "-EURT04444", 850);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test34312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34312");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("                           aaaa0aaaaa                  ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"                           aaaa0aaaaa                  \"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test34313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34313");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.split("a", "44444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444");
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!" };
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.stripAll(strArray9);
        java.lang.String[] strArray13 = org.apache.commons.lang3.StringUtils.split("44444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444", '4');
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.replaceEach("100.0", strArray10, strArray13);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.endsWithAny("a", strArray10);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray10);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.replaceEach("4444444..444444444444444440true-1.0097...44444444444444444444444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...", strArray5, strArray10);
        int int18 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa    A     ", strArray10);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray10);
        int int20 = org.apache.commons.lang3.StringUtils.indexOfAny("HI!", strArray10);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "100.0" + "'", str14, "100.0");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "4444444..444444444444444440true-1.0097...44444444444444444444444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444..." + "'", str17, "4444444..444444444444444440true-1.0097...44444444444444444444444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test34314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34314");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min(0L, (long) 52, (long) 130);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test34315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34315");
        char[] charArray10 = new char[] { '4', '4', ' ' };
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "0", charArray10);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsAny("a", charArray10);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                                      ...                                                     ", charArray10);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "4 0true-1.0097.044444444444444444444444444", charArray10);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "                     AAAA0AAAAA              ", charArray10);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "0TRUE-1.0097.00TRUE-1....0true-1.0097...0TRUE-1.0097.00TRUE-1....0true-1.0097...0TRUE-1.0097.00TRUE-1....0true-1.0097...0TRUE-1.0097.00TRUE-1....0true-1.0097...0TRUE-1.0097.00TRUE-1....0true-1.0097...0TRUE-1.0097.00TRUE-1....0true-1.0097...0TRUE-1.0097.00TRUE-1....0true-1.0097...0TRUERT00.7900.1-EURT00.7900.1-EURT00.7900.1-EURT0 A RT00.7900.1-EURT00.7900.1-EURT00.7900.1-EURT00TRUE-1.0097.00TRUE-1....0true-1.0097...0TRUE-1.0097.00TRUE-1....0true-1.0097...0TRUE-1.0097.00TRUE-1....0true-1.0097...0TRUE-1.0097.00TRUE-1....0true-1.0097...0TRUE-1.0097.00TRUE-1....0true-1.0097...0TRUE-1.0097.00TRUE-1....0true-1.0097...0TRUE-1.0097.00TRUE-1....0true-1.0097...0TRUE-", charArray10);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...44444444444444444444444444444444440TRUE-1.0097", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "44 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "44 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[4, 4,  ]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test34316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34316");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("100.0                                                                                      100.0                                                                                      100.0                                            ...", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...44                             ", 615);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test34317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34317");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("                                                                                                                                                                                                                                    ...aaaaaaaaaaaaaaaaaaaaaaaaa", "100.0#100.0#100.0#100.0#100.0#100.0#100.0#100.0#100.0#100.0#100.0#Art00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt0#100.0#100.0#100.0#100.0#100.0#100.0#100.0#100.0#100.0#100.0#100.0");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test34318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34318");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("...44", "   4444444...aaaaaaaaa44444444444444444444444444444444444444444", "                                       444...44444444444444444444444444444444440TRUE-1.0097...44444...4444444444444");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "     " + "'", str3, "     ");
    }

    @Test
    public void test34319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34319");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("Aaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaa                                                                                             ", "1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.00....444444440tr...", 479);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test34320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34320");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfBlank("4444444444444444444444444444444444444444444444444444444444444444444444   !    aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "                                                                                             100.                                                                                             100.                                                                                         rt00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt0     a    rt00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt0                                                                                             100.                                                                                             100.                                                                                          ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444444444444444444444444444444444444444444444444444444444444444444   !    aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "4444444444444444444444444444444444444444444444444444444444444444444444   !    aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test34321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34321");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("40true-1.0097.04444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444", "Hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test34322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34322");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test34323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34323");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("44444444444444444444444444444444444444444440TRUE-1.0097.     a    4444444444444444444444444444444444444444444440TRUE-1.0097.     a    4444444444444444444444444444444444444444444440TRUE-1.0097.     a    4444444444444444444444444444444444444444444440TRUE-1.0097.     a    4444444444444444444444444444444444444444444440TRUE-1.0097.     a    4444444444444444444444444444444444444444444440TRUE-1.0097.     a    4444444444444444444444444444444444444444444440TRUE-1.0097.     a    4444444444444444444444444444444444444444444440TRUE-1.0097.     a    4444444444444444444444444444444444444444444440TRUE-1.0097.     a    4444444444444444444444444444444444444444444440TRUE-1.0097.", "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "44444444444444444444444444444444444444444440TRUE-1.0097.     a    4444444444444444444444444444444444444444444440TRUE-1.0097.     a    4444444444444444444444444444444444444444444440TRUE-1.0097.     a    4444444444444444444444444444444444444444444440TRUE-1.0097.     a    4444444444444444444444444444444444444444444440TRUE-1.0097.     a    4444444444444444444444444444444444444444444440TRUE-1.0097.     a    4444444444444444444444444444444444444444444440TRUE-1.0097.     a    4444444444444444444444444444444444444444444440TRUE-1.0097.     a    4444444444444444444444444444444444444444444440TRUE-1.0097.     a    4444444444444444444444444444444444444444444440TRUE-1.0097." + "'", str4, "44444444444444444444444444444444444444444440TRUE-1.0097.     a    4444444444444444444444444444444444444444444440TRUE-1.0097.     a    4444444444444444444444444444444444444444444440TRUE-1.0097.     a    4444444444444444444444444444444444444444444440TRUE-1.0097.     a    4444444444444444444444444444444444444444444440TRUE-1.0097.     a    4444444444444444444444444444444444444444444440TRUE-1.0097.     a    4444444444444444444444444444444444444444444440TRUE-1.0097.     a    4444444444444444444444444444444444444444444440TRUE-1.0097.     a    4444444444444444444444444444444444444444444440TRUE-1.0097.     a    4444444444444444444444444444444444444444444440TRUE-1.0097.");
    }

    @Test
    public void test34324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34324");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("HI!");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!" + "'", str2, "HI!");
    }

    @Test
    public void test34325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34325");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("4444444...444444           aaaaaaaaaaa44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "44444444444444444444444444444444444444444444444444...TRUE-1.4444444...97.4444444...4444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444...444444           aaaaaaaaaaa44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str2, "4444444...444444           aaaaaaaaaaa44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test34326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34326");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                                                a   hi!hi!...                                                                                                                                                                                                                                                                                            ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                a   hi!hi!...                                                                                                                                                                                                                                                                                            " + "'", str1, "                                                                                                                                                                                                                                                                                                                                                                                a   hi!hi!...                                                                                                                                                                                                                                                                                            ");
    }

    @Test
    public void test34327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34327");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("tr...");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test34328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34328");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "##########################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################4444444440097...#############################################################################################");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test34329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34329");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "#############################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################atruea-a1a.a97a.a");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test34330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34330");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("a...");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test34331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34331");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("Hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               4444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test34332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34332");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("", "....4444444444444444444444444444...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa....4444444444444444444444444444...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa....4444444444444444444444444444...hI!################################hI!################################hI!################################hI!################################hI!################################hI!################################hI!################################hI!################################hI!################################hI!################################hI!################################hI!################################hI!################################hI!################################hI!################################hI!################################hI!#######################");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test34333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34333");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("EURT044444444444444444444444444444444444444444444444444444444444444444444444444444444!hi!h!hi!h44444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT04444444444444444444444444444444444444444444", "...            ...            ...            ...            ...            ...            ...         ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test34334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34334");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString(" 4A4 4RT4004.479004.414-4EURT4004.47444444444444444444444444444444444444444444444444444 4A4 4RT4004.479004.414-4EURT4004.47", "      00");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " 4A4 4RT4004.479004.414-4EURT4004.47444444444444444444444444444444444444444444444444444 4A4 4RT4004.479004.414-4EURT4004.47" + "'", str2, " 4A4 4RT4004.479004.414-4EURT4004.47444444444444444444444444444444444444444444444444444 4A4 4RT4004.479004.414-4EURT4004.47");
    }

    @Test
    public void test34335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34335");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("a    44");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "a    44" + "'", str1, "a    44");
    }

    @Test
    public void test34336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34336");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("44444a4444", '4');
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...444444", '#');
        java.lang.String[] strArray12 = org.apache.commons.lang3.StringUtils.split("hi", "                                ", 7);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.replaceEach("                                         ...444444440tr...                                          ", strArray8, strArray12);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAny("0 true - 1 . 0097 . 04444444444444444444444444444444444444444440 true - 1 . 0097 . 04444444444444444444444444444444444444444440 true - 1 . 0097 . 04444444444444444444444444444444444444444440 true - 1 . 0097 . 04444444444444444444444444444444444444444440 true - 1 . 0097 . 04444444444444444444444444444444444444444440 true - 1 . 0097 . 04444444444444444444444444444444444444444440 true - 1 . 0097 . 04444444444444444444444444444444444444444440 true - 1 . 0097 . 04444444444444444444444444444444444444444440 true - 1 . 0097 . 04444444444444444444444444444444444444444440 true - 1 . 0097 . 0444444444444444444444444444444444444444444", strArray8);
        java.lang.String[] strArray15 = org.apache.commons.lang3.StringUtils.stripAll(strArray8);
        java.lang.String[] strArray17 = org.apache.commons.lang3.StringUtils.stripAll(strArray15, "                                                                                                                                                                                                                                           ...A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A...");
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.replaceEach("                                       444...44444444444444444444444444444444440true-1.0097################################################################################################################################################################################", strArray3, strArray17);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "                                         ...444444440tr...                                          " + "'", str13, "                                         ...444444440tr...                                          ");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "                                       444...44444444444444444444444444444444440true-1.0097################################################################################################################################################################################" + "'", str18, "                                       444...44444444444444444444444444444444440true-1.0097################################################################################################################################################################################");
    }

    @Test
    public void test34337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34337");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("RT00I00I##EURT00I00I##EURT00I00I##EURT0#####A####RT00I00I##EURT00I00I##EURT00I00I##E", '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "RT00I00I##EURT00I00I##EURT00I00I##EURT0#####A####RT00I00I##EURT00I00I##EURT00I00I##E" + "'", str2, "RT00I00I##EURT00I00I##EURT00I00I##EURT0#####A####RT00I00I##EURT00I00I##EURT00I00I##E");
    }

    @Test
    public void test34338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34338");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("", 419);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test34339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34339");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("a     0true-1.0097.00true-1.0097.00true-1.0097.00trhi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hh");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test34340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34340");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "444440true-1.0097.0100.0");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "444440true-1.0097.0100.0" + "'", str1, "444440true-1.0097.0100.0");
    }

    @Test
    public void test34341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34341");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("a hi!hi!hi!hi!hi!hi!hi!hi!hi!hi... AA hi!hi!hi!hi!0true-1 0097 044444444444444444444444444 4", "###################################    a   HI!HI!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test34342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34342");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("0TRUE-1.0097.04444444444444444444444444440AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0", "                                                                                              44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444A    ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih   A44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444                                                                                               ", 64);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test34343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34343");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min(97.0d, (double) 638, (double) 957);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
    }

    @Test
    public void test34344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34344");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("...000     ...                                                                                                                                                                                                                                                                                                                                                                                  ", "444444444444444444...true-1.4444444", " ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "000                                                                                                                                                                                                                                                                                                                                                                                       " + "'", str3, "000                                                                                                                                                                                                                                                                                                                                                                                       ");
    }

    @Test
    public void test34345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34345");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("444444444444444444444444444444444444444444444444444444444444e-1.0097.00true-1.0097.00true-1.0097.00tra0true-1.0097.00true-1.0097.00true-1.0097.00tr", "0 true - 1 ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test34346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34346");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test34347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34347");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("444444444444444444444444444444444444444444444444444444444444e-1.0097.00true-1.0097.00true-1.0097.00tr    a     0true-1.0097.00true-1.0097.00true-1.0097.00tr");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"444444444444444444444444444444444444444444444444444444444444e-1.0097.00true-1.0097.00true-1.0097.00tr    a     0true-1.0097.00true-1.0097.00true-1.0097.00tr\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test34348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34348");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("                 ...                                                     AAAAAAAAAAAAAAAAAAAAAAAA", "A hi!hi!hi!hi!hi!hi!hi!hi!hi!hi... AA hi!hi!hi!hi!hi!hi!hi!hi!hi!hi... AA hi!hi!hi!hi!hi!hi!hi!hi!hi!hi... AA hi!hi!hi!hi!hi!hi!hi!hi!hi!hi... AA hi!hi!hi!hi!hi!hi!hi!hi!hi!hi... AA hi!hi!hi!hi!hi!hi!hi!hi!hi!hi... AA hi!hi!hi!hi!hi!hi!hi!hi!hi!hi... AA hi!hi!hi!hi!hi!hi!hi!hi!hi!hi... AA hi!hi!hi!hi!hi!hi!hi!hi!hi!hi... AA hi!hi!hi!hi!hi!hi!hi!hi!hi!hi... AA hi!hi!hi!hi!hi!hi!hi!hi!hi!hi... AA hi!hi!hi!hi!hi!hi!hi!hi!hi!hi... AA hi!hi!hi!hi!hi!hi!hi!hi!hi!hi... AA hi!hi!hi!hi!hi!hi!hi!hi!hi!hi... AA hi!hi!hi!hi!hi!hi!hi!hi!hi!hi... AA hi!hi!hi!hi!hi!hi!hi!hi!hi!hi... AA hi!hi!hi!hi!hi!hi!hi!hi!hi!hi... AA hi!hi!hi!hi!hi!hi!hi!hi!hi!hi... AA hi!hi!hi!hi!hi!hi!hi!hi!hi!hi... AA hi!hi!hi!hi!hi!hi!hi!hi!hi!hi... AA hi!hi!hi!hi!hi!hi!hi!hi!hi!hi... AA hi!hi!hi!hi!hi!hi!hi!hi!hi!hi.");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test34349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34349");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) ".ih!ih!ih!ih!ih!ih!ih!ih!ih!ih AA ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih AA ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih AA ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih AA ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih AA ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih AA ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih AA ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih AA ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih AA ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih AA ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih AA ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih AA ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih AA ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih AA ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih AA ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih AA ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih AA ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih AA ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih AA ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih AA ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih AA ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih A", "A   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    A0true-1.0097.0aaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1.0097.0aaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test34350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34350");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("44444444444444", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44444444444444" + "'", str2, "44444444444444");
    }

    @Test
    public void test34351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34351");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("hi!hi!hi!hi!hi!hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa    A     #################", "0true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test34352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34352");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("4444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444 ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test34353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34353");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("4444444444444444444444444444444444444444444true-1.97.4444444444444444444444444444444444444444444                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  ", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                0true-1.0097.044444444444444444444444444..");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test34354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34354");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                                                 ", "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H");
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, ' ', 60, 31);
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "       aaaa0aaaaa                     ...");
        int int10 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("Hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test34355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34355");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("444444444444444444444444444444444444444444444444444444444444444444444444444444aA44444A44444A44444A44444A44444A44444A44444A44444A44444100.044444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444440TRUE-1.009...", "4 0true-1.0097.044444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test34356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34356");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("4444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444", "                                                                                                 ", (int) (short) 4);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.split("0true-1.0097.00true-1.0097.00true-1.0097.00tr    A     0true-1.0097.00true-1.0097.00true-1.0097.00t", "0true-1.0097.0");
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray8);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.replaceEach("###########################################true-1.97.############################################", strArray5, strArray8);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.concatWith("", (java.lang.Object[]) strArray8);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "    A     " + "'", str9, "    A     ");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "###########################################true-1.97.############################################" + "'", str10, "###########################################true-1.97.############################################");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "    A     " + "'", str11, "    A     ");
    }

    @Test
    public void test34357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34357");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.substringsBetween("", "4444a44444", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.concatWith("4 0true-1.0097.04444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444", (java.lang.Object[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test34358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34358");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("44444444444444444444 !", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 4444444444444444444444444440.7900.1-eurt04444444444444444444444444444444444444444440.7900.1-eurt0");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 21 + "'", int2 == 21);
    }

    @Test
    public void test34359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34359");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT044444444444444444444444444444444444444444444444444444444444444444444444444444444!hi!h!hi!h44444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0440097...40097...4444444444444444444444444444444444444444444444444444444444440.7900.1-EURT04444444444444444444444444444444444444444444             ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT044444444444444444444444444444444444444444444444444444444444444444444444444444444!hi!h!hi!h44444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0440097...40097...4444444444444444444444444444444444444444444444444444444444440.7900.1-EURT04444444444444444444444444444444444444444444             \"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test34360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34360");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaTRUE-1.97.aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaTRUE-1.97.aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "0       00aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test34361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34361");
        int[] intArray1 = new int[] { 0 };
        int int2 = org.apache.commons.lang3.math.NumberUtils.max(intArray1);
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(intArray1);
        int int4 = org.apache.commons.lang3.math.NumberUtils.min(intArray1);
        int int5 = org.apache.commons.lang3.math.NumberUtils.max(intArray1);
        int int6 = org.apache.commons.lang3.math.NumberUtils.min(intArray1);
        int int7 = org.apache.commons.lang3.math.NumberUtils.max(intArray1);
        int int8 = org.apache.commons.lang3.math.NumberUtils.min(intArray1);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test34362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34362");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("", 363);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test34363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34363");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                                                                                               hI!                                                                                                                                                                                                                                                                                                                                                                                                                               ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test34364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34364");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("", "                             ...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test34365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34365");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("", "444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT04444444444444444444444444444444444444444444             ", 61);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", 618, 159);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test34366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34366");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("44444444444444444444444444444444444440TRUE-1.0097.     A    4444444444444444444444444444444444444444444440TRUE-1.0097.     A    4444444444444444444444444444444444444444444440TRUE-1.0097.     A    4444444444444444444444444444444444444444444440TRUE-1.0097.     A    4444444444444444444444444444444444444444444440TRUE-1.0097.     A    4444444444444444444444444444444444444444444440TRUE-1.0097.     A    4444444444444444444444444444444444444444444440TRUE-1.0097.     A    4444444444444444444444444444444444444444444440TRUE-1.0097.     A    4444444444444444444444444444444444444444444440TRUE-1.0097.     A    4444444444444444444444444444444444444444444440TRUE-1.0097.", "0true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.0");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test34367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34367");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("aaaaaaa...00.7900.1-eurt00.79...aaaaaaa");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: aaaaaaa...00.7900.1-eurt00.79...aaaaaaa is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test34368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34368");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("                                                           0true-1.0097.0", "0true-1.0097.044444444444444444444444444 40true-1.0097.044444444444444444444444444 40true-1.0097.044444444444444444444444444 40true-1.0097.044444444444444444444444444 40true-1.0097.04444444444444444444                                                                                              0097..0true-1.0097.044444444444444444444444444 40true-1.0097.044444444444444444444444444 40true-1.0097.044444444444444444444444444 40true-1.0097.044444444444444444444444444 40true-1.0097.04444444444444444444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test34369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34369");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                                                                ...", "#########################################################################################################################################################################################################################################################################HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH             A");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test34370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34370");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("           A", 424, 257);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test34371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34371");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("0true-1.0097.00t..0true-1.0097.00t                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ", "RT00.7900.1-EURT00.7900.1-EURT00.7900.1-EURT0ART00.7900.1-EURT00.7900.1-EURT00.7900.1-EURT");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0true-1.0097.00t..0true-1.0097.00t                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             " + "'", str2, "0true-1.0097.00t..0true-1.0097.00t                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ");
    }

    @Test
    public void test34372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34372");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                0TRUE-1.0097.044444444444444444444444444..");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test34373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34373");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("04true4-414.400974.4004true4-414.400974.4004true4-414.400974.4004tr44A4", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test34374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34374");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("...40TRUE-1.0097.04444444444444444444444444444444444...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...40TRUE-1.0097.04444444444444444444444444444444444..." + "'", str1, "...40TRUE-1.0097.04444444444444444444444444444444444...");
    }

    @Test
    public void test34375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34375");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) 655, (long) 465, (long) 57);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 655L + "'", long3 == 655L);
    }

    @Test
    public void test34376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34376");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("A A 1000 A A############################################################################################################################################################################################################################### A rt00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt0A    44A    44A    44A    44A    44A    44A    44A  ######################################################################################################################################################################################################################################################################################", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test34377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34377");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("                                      A                                                     ", "   !    ", 111);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                      A                                                     " + "'", str3, "                                      A                                                     ");
    }

    @Test
    public void test34378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34378");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "4ue-1.0097...444444444444444444444444########################################################################################100.44");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test34379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34379");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 668.0f, (double) 49, 101.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 668.0d + "'", double3 == 668.0d);
    }

    @Test
    public void test34380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34380");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("0true-1.0A A A A                        a44444...", "                                   ", (int) (short) 1);
        boolean boolean5 = org.apache.commons.lang3.StringUtils.endsWithAny("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", strArray4);
        int int6 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test34381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34381");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd(".04444444444444444444444444", "0true-1.0097.0aaaa0aaaaa40true-1.0097.0aaaa0aaaaa40true-1.0097.0aaaa0aaaaa40true-1.0097.0aaaa0aaaaa40true-1.0097.0aaaa0aaaaa40true-1.0097.0aaaa0aaaaa40true-1.0097.0aaaa0aaaaa40true-1.0097.0aaaa0aaaaa40true-1.0097.0aaaa0aaaaa4...aaaa0aaaaa4a4A4A4A4A");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test34382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34382");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "                                                                                     0");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test34383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34383");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("A44");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test34384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34384");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("aHI!HI!HI!HI!HI!HI!HI!HI!HI!HIaaHI!HI!HI!HI!HI!HI!HI!HI!HI!HIa", 'a');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test34385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34385");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "...4a   hi!hi!hi!haaaaaaaaaaaaaaaaaaaaaaaaaaaa...44");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test34386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34386");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "0097.00TRUE-1.0097.00TRUE-1.0097.00TR", (java.lang.CharSequence) "AaaaaaaaaaaaaAaaaaaaaaaaaaAaaaaaaaaaaaa...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 42 + "'", int2 == 42);
    }

    @Test
    public void test34387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34387");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("...                     aaaaa0aaaa                     aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...                     aaaaa0aaaa                     aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.....", 159);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...                     aaaaa0aaaa                     aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...                     aaaaa0aaaa                     a..." + "'", str2, "...                     aaaaa0aaaa                     aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...                     aaaaa0aaaa                     a...");
    }

    @Test
    public void test34388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34388");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) 0, (short) 0, (short) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test34389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34389");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "                       A                                 ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                       A                                 " + "'", str1, "                       A                                 ");
    }

    @Test
    public void test34390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34390");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("00.7900.1-EURT00.7900.1-EURT00.7900.1-EURT0");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "00.7900.1-EURT00.7900.1-EURT00.7900.1-EURT0" + "'", str1, "00.7900.1-EURT00.7900.1-EURT00.7900.1-EURT0");
    }

    @Test
    public void test34391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34391");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat("                                   0         aaa                        ", 5);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                   0         aaa                                                           0         aaa                                                           0         aaa                                                           0         aaa                                                           0         aaa                        " + "'", str2, "                                   0         aaa                                                           0         aaa                                                           0         aaa                                                           0         aaa                                                           0         aaa                        ");
    }

    @Test
    public void test34392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34392");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                     aaaa0aaaaa                     4", 615, 167);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                     aaaa0aaaaa                     4" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                     aaaa0aaaaa                     4");
    }

    @Test
    public void test34393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34393");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "444444444444444444444440.7900.1-eurt0aaaa0.001");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "444444444444444444444440.7900.1-eurt0aaaa0.001" + "'", str1, "444444444444444444444440.7900.1-eurt0aaaa0.001");
    }

    @Test
    public void test34394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34394");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444444444...                            ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test34395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34395");
        double[] doubleArray1 = new double[] { 34L };
        double double2 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray1);
        double double3 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray1);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[34.0]");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 34.0d + "'", double2 == 34.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 34.0d + "'", double3 == 34.0d);
    }

    @Test
    public void test34396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34396");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("                                                                                                                                        ", "######################################################################################################################################################################################################################################################################################################################################################################4TRUE4-414.400974.4004TRUE4-414.400974.4004TRUE4-414.400974.4004TR4 4A4#######################################################################################################################################################################################################################################################################################################################################################################", (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test34397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34397");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("                       0aaa                        ", "4A4 4rt4004.479004.414-4eurt4004.47444444444444444444444444444444444444444444444444444 4A4 4rt4004.479004.414-4eurt4004.47                                                                                     ", 665);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test34398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34398");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(59, 147, 205);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 59 + "'", int3 == 59);
    }

    @Test
    public void test34399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34399");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad(".7900.1-eurt0444444444444444444444444444444444444444444444    A   ...", 826, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.7900.1-eurt0444444444444444444444444444444444444444444444    A   ..." + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.7900.1-eurt0444444444444444444444444444444444444444444444    A   ...");
    }

    @Test
    public void test34400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34400");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("444444444444444440true-1.0097.04444444444444444444444444444444444444444444", "...0...AAA0AAAAAAAAA0AAAAAAAAA0AAAA44444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "444444444444444440true-1.0097" + "'", str2, "444444444444444440true-1.0097");
    }

    @Test
    public void test34401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34401");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "4444444444true-1.  97                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test34402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34402");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray2);
        int int4 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("    .         .                                                     1000    .         .         ", strArray2);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, ' ');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444..." + "'", str3, "4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444..." + "'", str6, "4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...");
    }

    @Test
    public void test34403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34403");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                                                                ...", "a4a4aaaaaaaaaaaaaaaaaaa4TRUE-4.497.4TRUE-4.497.4TRUE-4.497.4TRUE-4.497.4TRUE-4.497.4TRUE-4.497.4TRUE-4.4....444444444tr...aaaaaaaaaaaaaaaaa", 608);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test34404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34404");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhhhhhhh...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhhhhhhh...AAAAAAAAAAAAAAAAAAAAAAAAAA                                         41004.404                                                    AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhhhhhhh...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhhhhhhh...AAAAAAAAAAAAAAAAAAAAAAAAAA", ".. A...444444444...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhhhhhhh...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhhhhhhh...AAAAAAAAAAAAAAAAAAAAAAAAAA                                         41004.404                                                    AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhhhhhhh...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhhhhhhh...AAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str2, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhhhhhhh...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhhhhhhh...AAAAAAAAAAAAAAAAAAAAAAAAAA                                         41004.404                                                    AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhhhhhhh...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhhhhhhh...AAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test34405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34405");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444444444444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaAaAaAaA.79aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaAaAaAaA.1-eurtaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaAaAaAaA4444444444444444444444444444444444444440.7900.1-eurt04444444444444444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test34406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34406");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "aa100.0aaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aa100.0aaaa" + "'", str1, "aa100.0aaaa");
    }

    @Test
    public void test34407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34407");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("ue-144444444444444444444444444444444########################################################################################1444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ue-144444444444444444444444444444444########################################################################################1444444444444444444444444444444444444444444444444444444" + "'", str1, "ue-144444444444444444444444444444444########################################################################################1444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test34408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34408");
        char[] charArray9 = new char[] { '4', '4', ' ' };
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "0", charArray9);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsAny("a", charArray9);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsAny("                  4                   0true-1.0097.04444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444", charArray9);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsAny("00       000       000       00a", charArray9);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                                            100.0", charArray9);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "!", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "44 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "44 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[4, 4,  ]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test34409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34409");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("1AAAAAAAAAAA4444444...4444444...4444444...4", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test34410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34410");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("HI!", "                  4                   0true-1.0097.04444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HI!" + "'", str3, "HI!");
    }

    @Test
    public void test34411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34411");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("                                                                                                                   ", "", 561);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 115 + "'", int3 == 115);
    }

    @Test
    public void test34412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34412");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                              ", "44444444444444444444444444444aA44444A44a44444aA44444A44a44444aA44444A44a44444aA44444A44a44444aA44444A44a44444aA44444A44a44444aA44444A44a44444aA44444A44a44444aA44444A44a44444aA44444A44a44444aA44444A44a44444aA44444A44a44444aA44444A44a44444aA44444A44a44444aA44444A44a44444aA44444A44a44444aA44444A44a44444aA44444A44a44444aA44444A44a44444aA44444A44aAAAAAA4440true-1.0097.0AAAAAA4#AAAAAA40true-1.0097.0AAAAAA4#AAAAAA40true-1.0097.0AAAAAA4444444479-eurt44444444444444444444444444444444444444444447979-eurt4444444444444444444444444444444444444444444-eurt79-eurt44444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test34413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34413");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("                                                                                                                                                                                               ", 14, 179);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...                                                                                                                                                                             ..." + "'", str3, "...                                                                                                                                                                             ...");
    }

    @Test
    public void test34414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34414");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("4444444444444444444444444444444444444444444 a A A A 97.A a A A A true-1.A a A A A 4444444444444444444444444444444444444444444");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test34415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34415");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("                       a44444444444444444444...4444                       a44444444444444444444...4444", "                 aaaa0aaaaa    ");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test34416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34416");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444                                                                                                aaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test34417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34417");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("aaaaaaaaaaaaaaaaaaaa   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    a0true-1.0097.0aaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1.0097.0aaaaaaaaaaaaaaaaaaaaaaa", "11111111111111111111111111111111111111111", 9);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test34418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34418");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("    100.0      0true-1.0097.00true-1.0097.00true-1.0097.00tr4444A444440true-1.0097.00true-1.0097.00true-1.0097.00t                                                                                100.0                                                                                      100.0                                                                                      100.0", (byte) 0);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 0 + "'", byte2 == (byte) 0);
    }

    @Test
    public void test34419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34419");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("40true-1.0097.04444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4444444444444444444444444440.7900.1-eurt04444444444444444444444444444444444444444440.7900.1-eurt04" + "'", str1, "4444444444444444444444444440.7900.1-eurt04444444444444444444444444444444444444444440.7900.1-eurt04");
    }

    @Test
    public void test34420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34420");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("                                                                                                                                                                                                                                 444...44444444444444444444444444444444440TRUE-1.0097                                                                                                                                                                                          ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                                                                                                                                                                 444...44444444444444444444444444444444440TRUE-1.0097                                                                                                                                                                                          " + "'", str1, "                                                                                                                                                                                                                                 444...44444444444444444444444444444444440TRUE-1.0097                                                                                                                                                                                          ");
    }

    @Test
    public void test34421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34421");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("4                                                 100.0                                                                             AAAA0AAAAA       ...", "                           TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR                            ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4                                                 100.0                                                                             AAAA0AAAAA" + "'", str2, "4                                                 100.0                                                                             AAAA0AAAAA");
    }

    @Test
    public void test34422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34422");
        java.lang.CharSequence charSequence1 = null;
        char[] charArray8 = new char[] { '4', '4', ' ' };
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "0", charArray8);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsAny("a", charArray8);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "44444444444444444444444444444444444444444440true-1.0097.0", charArray8);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsOnly(charSequence1, charArray8);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "#a######################...##############################################", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "44 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "44 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[4, 4,  ]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test34423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34423");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("... aaaaa0aaaa aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaa0aaaa aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.....");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test34424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34424");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("444440TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00Ta0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR4444", "true-1. 97. 444444444444444444444444444444444444444444 true-1. 97. 44444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test34425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34425");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("    A   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI", "                                             A                                                 ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test34426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34426");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("########################4444444444444444444444440TRUE-1.009...", ' ');
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "########################4444444444444444444444440TRUE-1.009..." + "'", str3, "########################4444444444444444444444440TRUE-1.009...");
    }

    @Test
    public void test34427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34427");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!" };
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray5);
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.split("44444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444", '4');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.replaceEach("100.0", strArray6, strArray9);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.endsWithAny("a", strArray6);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.startsWithAny("44444444444444444444444444444444444444444440true-1.0097.0", strArray6);
        java.lang.String[] strArray16 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                                                0.001                                               ", "     a    ", 56);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray16, "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H");
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.replaceEach(" aaaa0aaaaa                                                                                                      ", strArray6, strArray16);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "100.0" + "'", str10, "100.0");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "                                                0.001                                               " + "'", str18, "                                                0.001                                               ");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + " aaaa0aaaaa                                                                                                      " + "'", str19, " aaaa0aaaaa                                                                                                      ");
    }

    @Test
    public void test34428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34428");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("aaa   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1 0097   aa                                        ", "a44444a444444a444444444444444444a44444a");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test34429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34429");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4                                                   ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test34430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34430");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("44444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444", "44444a4444rt00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt0", 91);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test34431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34431");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("a#4#...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "a#4#..." + "'", str1, "a#4#...");
    }

    @Test
    public void test34432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34432");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("                                                                                                                                                                                                                                                                                                                                                                                                                               44444444444444444444444444444444444444444444444444...TRUE-1.4444444...97.4444444...4444444444444444444444444444444444444444444                                                                                                                                                                                                                                                                                                                                                                                                                                ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "44444444444444444444444444444444444444444444444444...TRUE-1.4444444...97.4444444...4444444444444444444444444444444444444444444" + "'", str1, "44444444444444444444444444444444444444444444444444...TRUE-1.4444444...97.4444444...4444444444444444444444444444444444444444444");
    }

    @Test
    public void test34433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34433");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("                 ", "aaaaa0aaaa0.7900.1-eurt04444444444444444...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                 " + "'", str2, "                 ");
    }

    @Test
    public void test34434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34434");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("ahi#!#hi#!#hi#!#haaaaaaaaaaaaaaa#44444#aaaaaaaaaaaaaaaaaaaaaaaa", "...44444...TRUE-1.4444444...97.4444444..    a0a                 ...44444...TRUE-1.4444444...97.4444444..", 72);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ahi#!#hi#!#hi#!#haaaaaaaaaaaaaaa#44444#aaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "ahi#!#hi#!#hi#!#haaaaaaaaaaaaaaa#44444#aaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test34435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34435");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce(".0097.00tr", "a00       000       000       00aaaaaaaaaaaaaaaaaaaaaaaaaa00       000       000       00aa  A      A                            100.0                                                     aaaa", "A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A aaaaaaaaaaaaaaaaaaaa00       0true00       0-00       000       000       09700       000       0");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ".0097.00tr" + "'", str3, ".0097.00tr");
    }

    @Test
    public void test34436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34436");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("0true-1.0097.04444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     ", (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test34437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34437");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("...aaaa...44444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...aaaa...44444444444444444" + "'", str1, "...aaaa...44444444444444444");
    }

    @Test
    public void test34438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34438");
        long[] longArray4 = new long[] { 'a', (byte) 100, 52L, 44 };
        long long5 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        long long6 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        long long7 = org.apache.commons.lang3.math.NumberUtils.max(longArray4);
        long long8 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        long long9 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        long long10 = org.apache.commons.lang3.math.NumberUtils.max(longArray4);
        long long11 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray4), "[97, 100, 52, 44]");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 44L + "'", long5 == 44L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 44L + "'", long6 == 44L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 44L + "'", long8 == 44L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 44L + "'", long9 == 44L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 100L + "'", long10 == 100L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 44L + "'", long11 == 44L);
    }

    @Test
    public void test34439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34439");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("4444444...");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "##100.0###");
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, "                        ");
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("A         A                                  ", "...44444444444444444444444444444444440true-1.0097...");
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAny("", strArray10);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...", strArray4, strArray10);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray10);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "4444444" + "'", str6, "4444444");
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi..." + "'", str12, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test34440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34440");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("   4444444...aaaaaaaaa44444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "   4444444...aaaaaaaaa44444444444444444444444444444444444444444" + "'", str1, "   4444444...aaaaaaaaa44444444444444444444444444444444444444444");
    }

    @Test
    public void test34441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34441");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove(".. A         A         A         A         A         A         A         A         A         A         A         A         A         A           ", "0TRUE-1.0097.00TRUE-1....0true-1.0097...0TRUE-1.0097.00TRUE-1....0true-1.0097...0TRUE-1.0097.00TRUE-1....0true-1.0097...0TRUE-1.0097.00TRUE-1....0true-1.0097...0TRUE-1.0097.00TRUE-1....0true-1.0097...0TRUE-1.0097.00TRUE-1....0true-1.0097...0TRUE-1.0097.00TRUE-1....0true-1.0097...0TRUERT00.7900.1-EURT00.7900.1-EURT00.7900.1-EURT0 A RT00.7900.1-EURT00.7900.1-EURT00.7900.1-EURT00TRUE-1.0097.00TRUE-1....0true-1.0097...0TRUE-1.0097.00TRUE-1....0true-1.0097...0TRUE-1.0097.00TRUE-1....0true-1.0097...0TRUE-1.0097.00TRUE-1....0true-1.0097...0TRUE-1.0097.00TRUE-1....0true-1.0097...0TRUE-1.0097.00TRUE-1....0true-1.0097...0TRUE-1.0097.00TRUE-1....0true-1.0097...0TRUE-");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ".. A         A         A         A         A         A         A         A         A         A         A         A         A         A           " + "'", str2, ".. A         A         A         A         A         A         A         A         A         A         A         A         A         A           ");
    }

    @Test
    public void test34442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34442");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 229L, (float) 119L, (float) 548L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 119.0f + "'", float3 == 119.0f);
    }

    @Test
    public void test34443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34443");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "A         A         A         A         A       Aaaaaaaaa A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test34444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34444");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test34445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34445");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi", "  . 444444444444444444444444444444444444444444       .    . 44444444444444444444444444", 975);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test34446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34446");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("", "  ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test34447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34447");
        int[] intArray3 = new int[] { 267, (byte) -1, 267 };
        int int4 = org.apache.commons.lang3.math.NumberUtils.max(intArray3);
        int int5 = org.apache.commons.lang3.math.NumberUtils.min(intArray3);
        int int6 = org.apache.commons.lang3.math.NumberUtils.min(intArray3);
        int int7 = org.apache.commons.lang3.math.NumberUtils.max(intArray3);
        int int8 = org.apache.commons.lang3.math.NumberUtils.min(intArray3);
        int int9 = org.apache.commons.lang3.math.NumberUtils.min(intArray3);
        int int10 = org.apache.commons.lang3.math.NumberUtils.max(intArray3);
        int int11 = org.apache.commons.lang3.math.NumberUtils.min(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[267, -1, 267]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 267 + "'", int4 == 267);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 267 + "'", int7 == 267);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 267 + "'", int10 == 267);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test34448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34448");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("44444444444444444444444444444444444444444440TRUE-1.0097.     a    4444444444444444444444444444444444444444444440TRUE-1.0097.     a    4444444444444444444444444444444444444444444440TRUE-1.0097.     a    4444444444444444444444444444444444444444444440TRUE-1.0097.     a    4444444444444444444444444444444444444444444440TRUE-1.0097.     a    4444444444444444444444444444444444444444444440TRUE-1.0097.     a    4444444444444444444444444444444444444444444440TRUE-1.0097.     a    4444444444444444444444444444444444444444444440TRUE-1.0097.     a    4444444444444444444444444444444444444444444440TRUE-1.0097.     a    4444444444444444444444444444444444444444444440TRUE-1.0097.", "A 0true-1.0097.00true-1.0097.00true-1.0097.00tr", 655);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test34449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34449");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("                                                                                                                                                                                                                                                                                                                                           !IH                                                                                                                                                                                                                                                                                                                                            ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!IH" + "'", str1, "!IH");
    }

    @Test
    public void test34450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34450");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "... A A");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test34451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34451");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("IHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIH");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test34452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34452");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("0AAAA A 0AAAA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0aaaa a 0aaaa" + "'", str1, "0aaaa a 0aaaa");
    }

    @Test
    public void test34453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34453");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("aaaa44........4444444444444444444444444444444.....4444444444444444444444444444...4444444444........4444444444444444444444444444...4444444444........4444444444444444444444444444.aaaa", "    a   HI!HI!..    a   HI!HI!..    a   HI!HI!..");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test34454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34454");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("100.0aaaa", (float) 44);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 44.0f + "'", float2 == 44.0f);
    }

    @Test
    public void test34455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34455");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test34456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34456");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("4444A44444");
        int int4 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray3);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray3);
        int int6 = org.apache.commons.lang3.StringUtils.indexOfAny("aHI!HI!HI!HI!HI!HI!HI!HI!HI!HI...a", strArray3);
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("4444444...                            ", ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A", strArray3, strArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 1 vs 29");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "4444A44444" + "'", str5, "4444A44444");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void test34457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34457");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("00 0", "                                                                                                                                 0                                                                                                                     ", 20);
        boolean boolean5 = org.apache.commons.lang3.StringUtils.endsWithAny("A A A A A A A A A A A A A A A A A A A A A A A A 4479     000       000       09700       000       0", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test34458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34458");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                                                                               aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...4444444                                                                                                                                                                                                                                                                                                                                                                                                               ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test34459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34459");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                         aaaa0aaaaa    ", "Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa444440true-1.0097...4444440true-1.0097...4444440444444444444444444444444444444440true-1.0097...4444440true-1.0097...4444440aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test34460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34460");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("Ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!0097      a   HI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAA       ...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!", 571, "444...444444444444444444444444444444444444444...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!0097      a   HI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAA       ...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!" + "'", str3, "Ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!0097      a   HI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAA       ...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!");
    }

    @Test
    public void test34461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34461");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("079001-eurt0");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "079001-EURT0" + "'", str1, "079001-EURT0");
    }

    @Test
    public void test34462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34462");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("", "444444444444444444444444444444444444444444444AAAA0AAAAA", 79);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test34463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34463");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("04444444444444444444444444", "                                                                                            4444444444444444444444444444440TA4444444444444444444444444444440T    4444444444444444444444444444440T44                                                                                            4444444444444444444444444444440TA4444444444444444444444444444440T    4444444444444444444444444444440T44                                                                                            44444444444444444444444444                                               100.0                                                ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test34464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34464");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("            ", "Aaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test34465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34465");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("0true-1.0097.044444444444444444444444444 40true-1.0097.044444444444444444444444444 40true-1.0097.044444444444444444444444444 40true-1.0097.044444444444444444444444444 40true-1.0097.044444444444444444444444444 40true-1.0097.044444444444444444444444444 40true-1.0097.044444444444444444444444444 40true-1.0097.044444444444444444444444444 40true-1.0097.044444444444444444444444444 40true-1.0097.044444444444444444444444444 40true-1.0097.044444444444444444444444444 40true-1.0097.0444444444444444444!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0true-1.0097.044444444444444444444444444 40true-1.0097.044444444444444444444444444 40true-1.0097.044444444444444444444444444 40true-1.0097.044444444444444444444444444 40true-1.0097.044444444444444444444444444 40true-1.0097.044444444444444444444444444 40true-1.0097.044444444444444444444444444 40true-1.0097.044444444444444444444444444 40true-1.0097.044444444444444444444444444 40true-1.0097.044444444444444444444444444 40true-1.0097.044444444444444444444444444 40true-1.0097.0444444444444444444!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str1, "0true-1.0097.044444444444444444444444444 40true-1.0097.044444444444444444444444444 40true-1.0097.044444444444444444444444444 40true-1.0097.044444444444444444444444444 40true-1.0097.044444444444444444444444444 40true-1.0097.044444444444444444444444444 40true-1.0097.044444444444444444444444444 40true-1.0097.044444444444444444444444444 40true-1.0097.044444444444444444444444444 40true-1.0097.044444444444444444444444444 40true-1.0097.044444444444444444444444444 40true-1.0097.0444444444444444444!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test34466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34466");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("aaaa                                                     0.001                            A      A  ", 292, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaa                                                     0.001                            A      A  aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "aaaa                                                     0.001                            A      A  aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test34467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34467");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("                                      ...                                                     ", "44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444", 0);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, 'a');
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "                                      a                                                     " + "'", str5, "                                      a                                                     ");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "                                      " + "'", str6, "                                      ");
    }

    @Test
    public void test34468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34468");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("#######################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!", 24);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#######################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!" + "'", str2, "#######################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!");
    }

    @Test
    public void test34469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34469");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("Aaa4444444...4444444...4444444...4  ", "...7900...7900...7900...7900");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...7900...7900...7900...7900" + "'", str2, "...7900...7900...7900...7900");
    }

    @Test
    public void test34470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34470");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "   A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A!hi!h!hi!h");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test34471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34471");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("A         A                                                                  ...A         A  ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test34472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34472");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "                                      100.0                                                     aaaa100100.0                                                     aaaa.100.0                                                     aaaa0100.0                                                     aaaa                                                ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test34473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34473");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min(58L, (long) 648, (long) 245);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 58L + "'", long3 == 58L);
    }

    @Test
    public void test34474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34474");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("......4444444...4444444...4444444", "7900.1-EURT04444444444444444444444444444444444...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                             ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "......4444444...4444444...4444444" + "'", str2, "......4444444...4444444...4444444");
    }

    @Test
    public void test34475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34475");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("                                                                                                        ", "4444444444444444444444444...aaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test34476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34476");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("", "                       #A#44444444444444444444#...#444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test34477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34477");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi!hi!hi!hi0true-1.0097.00true-1.0097.00true-1.0097.00trA0t...aaaaaaa", "I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test34478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34478");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("     a    44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444", "aaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "     a    44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444" + "'", str2, "     a    44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444");
    }

    @Test
    public void test34479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34479");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 100, (byte) 100 };
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte8 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        byte byte10 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte11 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        byte byte12 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[10, 100, 100]");
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 100 + "'", byte4 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 10 + "'", byte5 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 10 + "'", byte6 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 100 + "'", byte7 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 10 + "'", byte8 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 10 + "'", byte9 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte10 + "' != '" + (byte) 100 + "'", byte10 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) 10 + "'", byte11 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte12 + "' != '" + (byte) 100 + "'", byte12 == (byte) 100);
    }

    @Test
    public void test34480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34480");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("0true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.000.7900.1-eurt0444444444444444444444444444444444444444444400.7900.1-eurt0444444444444444444444444444444444444444444400.790                    ", "0    -1.0097.00    -1.0097.00    -1.0097.00   a 0    -1.0097.00    -1.0097.00    -1.0097.00aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test34481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34481");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.split("44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444", "0", (int) 'a');
        boolean boolean6 = org.apache.commons.lang3.StringUtils.startsWithAny("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", strArray5);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.concatWith("                                                                                ", (java.lang.Object[]) strArray5);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "4444444444444444444444444444444444444444444                                                                                true-1.                                                                                97.                                                                                4444444444444444444444444444444444444444444" + "'", str7, "4444444444444444444444444444444444444444444                                                                                true-1.                                                                                97.                                                                                4444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "4444444444444444444444444444444444444444444true-1.97.4444444444444444444444444444444444444444444" + "'", str8, "4444444444444444444444444444444444444444444true-1.97.4444444444444444444444444444444444444444444");
    }

    @Test
    public void test34482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34482");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               true-1.  97");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               true-1.  97" + "'", str1, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               true-1.  97");
    }

    @Test
    public void test34483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34483");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("", "a     0true-1.0097.00true-1.0097.00true-1.0097.00trhi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hh");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test34484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34484");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("                                               A                                               ", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                               A                                               " + "'", str2, "                                               A                                               ");
    }

    @Test
    public void test34485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34485");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("0097...#############################################################################################", "##############################################################################################################################################################################################################################################################################################################################################################################4444444444444444444444444444444444444444444TRUE-1.97.4444444444444444444444444444444444444444444444444444444444444444444444444444444444444TRUE-1.97.4444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0097...#############################################################################################" + "'", str2, "0097...#############################################################################################");
    }

    @Test
    public void test34486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34486");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("0ATRUEA-A1A.A0097A.A0", 109, 534);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test34487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34487");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("a HI!HI!HI!HI!HI!HI!HI!HI!HI!HI... a", 657);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test34488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34488");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("                  4                  ", 750);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test34489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34489");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("0097444444a444HI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAA4444444...", "     a    44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0097444444a444HI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAA4444444..." + "'", str2, "0097444444a444HI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAA4444444...");
    }

    @Test
    public void test34490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34490");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("                                                                                                                                                                                                                                aaa...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1.0097...aa                                                                                                                                                                                                                                                                         ", 34, "TR.0097.00TR.0097.00TR.0097.00TR.0097.00TR.0097.00TR");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                                                                                                                                aaa...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1.0097...aa                                                                                                                                                                                                                                                                         " + "'", str3, "                                                                                                                                                                                                                                aaa...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1.0097...aa                                                                                                                                                                                                                                                                         ");
    }

    @Test
    public void test34491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34491");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a       44444444444444444444444444444444444444444444444444...true-1.4444444...97.4444444...4444444444444444444444444444444444444444444                       a                       a                       a                       a    ", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa ...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test34492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34492");
        java.lang.CharSequence charSequence2 = null;
        char[] charArray10 = new char[] { '4', '4', ' ' };
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "0", charArray10);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444", charArray10);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "    A     ", charArray10);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "0true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.00...", charArray10);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAny(charSequence2, charArray10);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "0true-1.0                                               41004.404", charArray10);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                                       444...44444444444444444444444444444444440true-1.0097...44444...44444444444444", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "44 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "44 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[4, 4,  ]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test34493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34493");
        char[] charArray13 = new char[] { '4', '4', ' ' };
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "0", charArray13);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsAny("a", charArray13);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "    A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A     ", charArray13);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "444444444444444444444444...44444444444444444444444444444444440true-1.0097...444444444444444444444444", charArray13);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "     A    ", charArray13);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR4444A444440TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00T", charArray13);
        int int20 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", charArray13);
        boolean boolean21 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi", charArray13);
        boolean boolean22 = org.apache.commons.lang3.StringUtils.containsAny("...44444444444444444444444444444444440true-1.0097...44444", charArray13);
        boolean boolean23 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "4444444...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0aaaaa##############0true-1.0097.0444", charArray13);
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
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test34494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34494");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("                                                                            ###    A   hi!hi!.                                                                              ", "aaaaaaaaaaaaaaaaaaaaaa    a   HI!HI!aaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 76 + "'", int2 == 76);
    }

    @Test
    public void test34495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34495");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa", "                                                                ...444444", (int) (byte) 1);
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray4, "...A     ...");
        int int7 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("4444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test34496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34496");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("                                                                                                                                              4444444444444444444444444440.7900.1-EURT04444444444444444444444444444444444444444440.7900.1-EURT044444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa444444444...");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test34497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34497");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("a0true-1.0097.04444444444444444444444444444444444444444440true-1.0097.044444444444444444444444444aa", "rt00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "a0true-1.0097.04444444444444444444444444444444444444444440true-1.0097.044444444444444444444444444aa" + "'", str2, "a0true-1.0097.04444444444444444444444444444444444444444440true-1.0097.044444444444444444444444444aa");
    }

    @Test
    public void test34498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34498");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("                                 4444444444444444444444444444444444444444444TRUE-1.97.4444444444444444444444444444444444444444444444444444444444444444444444444444444444444TRUE-1.97.4444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test34499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34499");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  rue-1.0097.0                                                                                                                                                                                                                                                               ", "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test34500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest68.test34500");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 ", "                                                      ...");
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("4444444");
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!" };
        java.lang.String[] strArray12 = org.apache.commons.lang3.StringUtils.stripAll(strArray11);
        java.lang.String[] strArray15 = org.apache.commons.lang3.StringUtils.split("44444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444", '4');
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.replaceEach("100.0", strArray12, strArray15);
        java.lang.String[] strArray17 = org.apache.commons.lang3.StringUtils.stripAll(strArray12);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAny("0TRUE-1.0097.0", strArray12);
        java.lang.String str22 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray12, "44444444444444444444444444444444444444444444true-1.497.44444444444444444444444444444444444444444444 ", (int) 'a', 44);
        java.lang.String str23 = org.apache.commons.lang3.StringUtils.replaceEach("    A         A         A  A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A!hi!h!hi!h", strArray7, strArray12);
        java.lang.String str24 = org.apache.commons.lang3.StringUtils.replaceEach("                                                                                                                                                                                                                                                                                                                                                                                                           0TRUE-1.04444444444444444444444444444444444444444444                                                                                                                                                                                                                                                                                                                                                                                                           ", strArray4, strArray12);
        java.lang.String str25 = org.apache.commons.lang3.StringUtils.concatWith("...a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a...", (java.lang.Object[]) strArray4);
        java.lang.String str27 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, '#');
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "100.0" + "'", str16, "100.0");
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "    A         A         A  A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A!hi!h!hi!h" + "'", str23, "    A         A         A  A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A!hi!h!hi!h");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                           0TRUE-1.04444444444444444444444444444444444444444444                                                                                                                                                                                                                                                                                                                                                                                                           " + "'", str24, "                                                                                                                                                                                                                                                                                                                                                                                                           0TRUE-1.04444444444444444444444444444444444444444444                                                                                                                                                                                                                                                                                                                                                                                                           ");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
    }
}

