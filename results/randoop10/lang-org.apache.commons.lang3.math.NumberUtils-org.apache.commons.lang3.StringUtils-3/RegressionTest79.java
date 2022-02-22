import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest79 {

    public static boolean debug = false;

    @Test
    public void test39501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39501");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("aaaaaaaaaaaaaaaaaaa                                            100.0aaaaaaaaaaaaaaaaaaa                                ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaa                                            100.0aaaaaaaaaaaaaaaaaaa                                " + "'", str1, "aaaaaaaaaaaaaaaaaaa                                            100.0aaaaaaaaaaaaaaaaaaa                                ");
    }

    @Test
    public void test39502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39502");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA   #################################################", "A      A                            100.0                                                     AAAAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test39503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39503");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "...44444444444......");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test39504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39504");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHIHIHIHA                                                                                                         ", (short) 0);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 0 + "'", short2 == (short) 0);
    }

    @Test
    public void test39505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39505");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                                      aAAAAAAAAAAAAAAAA......aAAAAAAAAAAAAAAAA...0aAAAAAAAAAAAAAAAA......", "...0");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test39506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39506");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "...444444444444444444444440TRUE-1 0097 ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test39507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39507");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("0true-1.00-1.0097.0444444444444444444444444444444......           0     44444444444444444444444444444444444444444440true-1.0097.0    0     44444444444444444444444444444444444444444440true-1.0097.0    0     44444444444444444444444444444444444444444440true-1.0097.0    0     4444444444444444444", "                                                             ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test39508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39508");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("###########################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test39509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39509");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("a                   TRUE-1.0097.0                       a                                                                                                                                                                                                                                                                                                                                                                                          ", 48);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 48 + "'", int2 == 48);
    }

    @Test
    public void test39510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39510");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("      aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa      ", "                                            000                        ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "      aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa      " + "'", str2, "      aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa      ");
    }

    @Test
    public void test39511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39511");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("!hi!h!hi!h", "4444444444444444444444444440.7900.1-EURT04444444444444444444444444444444444444444440.7900.1-EURT044444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test39512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39512");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("444444444444444440true-1.0097...444444444444444444444444                                                                                        100.");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "444444444444444440true-1.0097...444444444444444444444444                                                                                        100." + "'", str1, "444444444444444440true-1.0097...444444444444444444444444                                                                                        100.");
    }

    @Test
    public void test39513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39513");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(0.0f, (float) 132, (float) 625L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 625.0f + "'", float3 == 625.0f);
    }

    @Test
    public void test39514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39514");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("                                                   ...                           ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test39515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39515");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("", 269);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 269 + "'", int2 == 269);
    }

    @Test
    public void test39516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39516");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("      a         a         a         a         a", "                       a44444444444444444444...444444444444444444444444444444444444444444444                       a44444444444444444444...444444444444444444444444444444444444444444444                       a44444444444444444444...444444444444444444444444444444444444444444444                     444444444444444444444444444444444444444444                       a44444444444444444444...444444444444444444444444444444444444444444444                       a44444444444444444444...444444444444444444444444444444444444444444444                       a44444444444444444444...444444444444444444444444444444444444444444444                     ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test39517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39517");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444aaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test39518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39518");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "...4a   hi!hi!hi!haaaaaaaaaaaaaaaaaaaaaaaaaaaa...44");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test39519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39519");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("                                       aaaaaaa      a         a         a         a         aaaaaaaa");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test39520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39520");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "0 00aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test39521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39521");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("... A A", "00.0                                                     AAAA0TRUE-1.0097.044444444444444444444444                                                                                                                                       0AAAA                                                                                                                                  A                                                                        ", "900.1-EURT0444444444444444444444444444", 168);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "... A A" + "'", str4, "... A A");
    }

    @Test
    public void test39522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39522");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("         000", 479, 8);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test39523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39523");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          ", 'a', 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          " + "'", str3, "i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          ");
    }

    @Test
    public void test39524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39524");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("#############################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################0atruea-a1a.a0097a.a0", "true -   97");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#############################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################0atruea-a1a.a0097a.a0" + "'", str2, "#############################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################0atruea-a1a.a0097a.a0");
    }

    @Test
    public void test39525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39525");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("  a    TRUETRUETRUET");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "  A    TRUETRUETRUET" + "'", str1, "  A    TRUETRUETRUET");
    }

    @Test
    public void test39526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39526");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("0TRUE-1 0097 0", 156, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                                              0TRUE-1 0097 0" + "'", str3, "                                                                                                                                              0TRUE-1 0097 0");
    }

    @Test
    public void test39527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39527");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("############################################0H!IH!H!IH!.H!IH!H!IH!0010H!IH!H!IH!.H!IH!H!IH!0H!IH!H!IH!HI");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "############################################0H!IH!H!IH!.H!IH!H!IH!0010H!IH!H!IH!.H!IH!H!IH!0H!IH!H!IH!HI" + "'", str1, "############################################0H!IH!H!IH!.H!IH!H!IH!0010H!IH!H!IH!.H!IH!H!IH!0H!IH!H!IH!HI");
    }

    @Test
    public void test39528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39528");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 172.0f, 32.0d, (double) 58L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 172.0d + "'", double3 == 172.0d);
    }

    @Test
    public void test39529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39529");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("                 ", "444###44444444444444444444444444444444440true-1#0097###44", "4444444...                            ", (int) ' ');
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "                 " + "'", str4, "                 ");
    }

    @Test
    public void test39530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39530");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!" };
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray4);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.split("44444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444", '4');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.replaceEach("100.0", strArray5, strArray8);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray8, '4');
        int int12 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray8);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.concatWith("4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...", (java.lang.Object[]) strArray8);
        java.lang.String[] strArray17 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("0", "44444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444", (int) (short) 100);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray17);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray17);
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa", strArray8, strArray17);
        java.lang.String str24 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray8, "  ", 668, 61);
        java.lang.String str26 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray8, ' ');
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "100.0" + "'", str9, "100.0");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "0true-1.0097.0" + "'", str11, "0true-1.0097.0");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "0true-1.0097.0" + "'", str13, "0true-1.0097.0");
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "aaaa0aaaaa0aaaa0aaaaa0aaaa0aaaaa0aaaa0aaaaa0aaaa0aaaaa0aaaa0aaaaa0aaaa0aaaaa0aaaa0aaaaa0aaaa0aaaaa" + "'", str20, "aaaa0aaaaa0aaaa0aaaaa0aaaa0aaaaa0aaaa0aaaaa0aaaa0aaaaa0aaaa0aaaaa0aaaa0aaaaa0aaaa0aaaaa0aaaa0aaaaa");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "0true-1.0097.0" + "'", str26, "0true-1.0097.0");
    }

    @Test
    public void test39531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39531");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("a444444444444444444444444...44444444444444444444444444444444440true-1.0097...444444444444444444444444hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...44444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444", 25);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 25 + "'", int2 == 25);
    }

    @Test
    public void test39532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39532");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H.7900.1-eurt04444444444444444444444444444444444444444444 a .7900.1-eurt04444444444444444444 a .7900.1-eurt0444444444444444444444444444444444444444444444 a.7900.1-eurt04444444444444444444444444444444444444444444 a .7900.1-eurt04444444444444444444 a .7900.1-eurt0444444444444444444444444444444444444444444444 a.7900.1-eurt04444444444444444444444444444444444444444444 a .7900.1-eurt04444444444444444444 a .7900.1-eurt0444444444444444444444444444444444444444444444 a.7900.1-eurt04444444444444444444444444444444444444444444 a .7900.1-eurt04444444444444444444 a .7900.1-eurt0444444444444444444444444444444444444444444444 a.7900.1-eurt044444", "hi");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test39533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39533");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull(".0097.00true-1.0097.00trA0t...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".0097.00true-1.0097.00trA0t..." + "'", str1, ".0097.00true-1.0097.00trA0t...");
    }

    @Test
    public void test39534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39534");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny(".true-1...97..44444444444444444444444444444444444444444", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHIHIHIHA                                                                                                         ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test39535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39535");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "0true-1.0097.");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0true-1.0097." + "'", str1, "0true-1.0097.");
    }

    @Test
    public void test39536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39536");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            ...4#444hi!hi!hi!h############################...44");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test39537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39537");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("!HI!HI!HI!HI!HI!HI!HI!HI!", '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!HI!HI!HI!HI!HI!HI!HI!HI!" + "'", str2, "!HI!HI!HI!HI!HI!HI!HI!HI!");
    }

    @Test
    public void test39538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39538");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("", "...00.1-EURT04444444444444444444444444444444444444444440.7900.1-EURT044444444444444444444444444440true-1.0097.0aaaa0aaaaa4444444444444444444444444...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test39539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39539");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("A rt00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt0");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test39540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39540");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 220, (double) 54L, (double) 119.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 54.0d + "'", double3 == 54.0d);
    }

    @Test
    public void test39541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39541");
        char[] charArray10 = new char[] { '4', '4', ' ' };
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "0", charArray10);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsAny("a", charArray10);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "    A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A     ", charArray10);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "444444444444444444444444...44444444444444444444444444444444440true-1.0097...444444444444444444444444", charArray10);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "4444444444444444444444444444444444444444444true-1.97.4444444444444444444444444444444444444444444", charArray10);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsAny("                                                0.001                                               ", charArray10);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsAny("444", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "44 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "44 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[4, 4,  ]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 24 + "'", int14 == 24);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 43 + "'", int15 == 43);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test39542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39542");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("...........", "0true-1.0097.  a    0true-1.0097.     a    0true-1.0097.     a    0true-1.0097.     a    0true-1.0097.     a    0true-1.0097.     a    0true-1.0097.     a    0true-1.0097.     a    0true-1.0097.     a    0true-1.0097                 ...                                                     ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test39543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39543");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("####################################...", (short) -1);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) -1 + "'", short2 == (short) -1);
    }

    @Test
    public void test39544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39544");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  ", "...44444...true-1.4444444...97.4444444...4444444444444...4");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test39545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39545");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("0                                                                                                                                                                                                                                                                          ", 608);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0                                                                                                                                                                                                                                                                          " + "'", str2, "0                                                                                                                                                                                                                                                                          ");
    }

    @Test
    public void test39546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39546");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!" };
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.stripAll(strArray6);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray7);
        java.lang.String[] strArray12 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("4444444...", "a", (int) '4');
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444", strArray7, strArray12);
        java.lang.String[] strArray15 = org.apache.commons.lang3.StringUtils.stripAll(strArray7, "44444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444");
        boolean boolean16 = org.apache.commons.lang3.StringUtils.endsWithAny("                                      100.0                                                      ", strArray7);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.startsWithAny("44444444444444444444444a444444444444444444444444", strArray7);
        java.lang.String[] strArray19 = org.apache.commons.lang3.StringUtils.stripAll(strArray7, "a HI!HI!HI!HI!HI!HI!HI!HI!HI!HI... a               ");
        int int20 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("", strArray19);
        java.lang.String[] strArray25 = org.apache.commons.lang3.StringUtils.split("", "A    4444444444444444444444444444444444444444444440true-1.0097.     A    44444444444444444444", 191);
        java.lang.String[] strArray27 = org.apache.commons.lang3.StringUtils.stripAll(strArray25, "    A   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI");
        boolean boolean28 = org.apache.commons.lang3.StringUtils.startsWithAny("0true-1.0097.00t..0true-1.0097.00t                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ", strArray25);
        java.lang.String str29 = org.apache.commons.lang3.StringUtils.replaceEach("44444..4444", strArray19, strArray25);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444" + "'", str13, "44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444");
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "44444..4444" + "'", str29, "44444..4444");
    }

    @Test
    public void test39547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39547");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("44444444444444444444444444444444444444444444444444...true-1.4444444...97.4444444...4444444444444444444444444444444444444444444      #a######################...##############################################      #a######################.                          ", "97.0aA44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A4444497.0aA44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A4444497.0", "                                                                                                                                                                                                                                                                                                                                                                                                                     44444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test39548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39548");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("4444444...44444444444444444444444444444444", ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444...44444444444444444444444444444444" + "'", str2, "4444444...44444444444444444444444444444444");
    }

    @Test
    public void test39549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39549");
        char[] charArray13 = new char[] { ' ', '4', 'a', 'a', 'a' };
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "100.0", charArray13);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray13);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsAny("44444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444", charArray13);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "0true-1.0097.00true-1.0097.00true-1.0097.00tr    A     0true-1.0097.00true-1.0097.00true-1.0097.00t", charArray13);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray13);
        boolean boolean19 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "                                                0.001                                               ", charArray13);
        int int20 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "0.001", charArray13);
        int int21 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "true-1.4444444...97", charArray13);
        java.lang.Class<?> wildcardClass22 = charArray13.getClass();
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), " 4aaa");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), " 4aaa");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[ , 4, a, a, a]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 45 + "'", int17 == 45);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 7 + "'", int21 == 7);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test39550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39550");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "     A    4");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test39551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39551");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "                                           true-1.97.                                                                                   ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test39552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39552");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("100.0#100.0#100.0#100.0#100.0#100.0#100.0#100.0#100.0#100.0#100.0#Art00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt0#100.0#100.0#100.0#100.0#100.0#100.0#100.0#100.0#100.0#100.0#100.0", "Ah!ih!h!ih!A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A           ", 136);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test39553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39553");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "444444444444444444444444...44444true - 97");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test39554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39554");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!" };
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray4);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.split("44444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444", '4');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.replaceEach("100.0", strArray5, strArray8);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.endsWithAny("a", strArray5);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray5);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray5, "44444444444444444444444444444444444444444440.7900.1-eurt04444444444444444444444444444444444444444444.790.7900.1-eurt04444444444444444444444444444444444444444444.1-eurt0.7900.1-eurt044444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        java.lang.String[] strArray18 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("a", "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!", (int) (byte) 10);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAny("", strArray18);
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA4444444...", strArray5, strArray18);
        java.lang.String str24 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray5, '4', (int) (short) 0, 0);
        java.lang.String str28 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray5, "4444...44444", 664, 57);
        java.lang.String str30 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray5, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA4444444... 4444444...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "100.0" + "'", str9, "100.0");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA4444444..." + "'", str20, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA4444444...");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
    }

    @Test
    public void test39555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39555");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("4444444444444444444444444444444                                                   4444444444444444444444444444444", "444444444444444444444444444444444444444444444     4    44444444444444444444444444444444444444444444444                                      100.0                                                     aaaa444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test39556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39556");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfBlank((java.lang.CharSequence) "A         A         A        ...", (java.lang.CharSequence) "A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "A         A         A        ..." + "'", charSequence2, "A         A         A        ...");
    }

    @Test
    public void test39557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39557");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test39558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39558");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("rue-1.0097.0                                       ", (byte) 10);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 10 + "'", byte2 == (byte) 10);
    }

    @Test
    public void test39559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39559");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("UE-1.0097.");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"UE-1.0097.\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test39560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39560");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("...44444...4444444...4...aaaaaa...", 544, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...44444...4444444...4...aaaaaa...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "...44444...4444444...4...aaaaaa...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test39561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39561");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("##############################################################################################################################################################################################################################################################################################################################################################################HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH             A", (short) 10);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 10 + "'", short2 == (short) 10);
    }

    @Test
    public void test39562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39562");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("AAAAA", "444444444444444444444444444444444444444444444     4    444444444444444444444444444444444444444444444          ", 131);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test39563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39563");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("aaaaaaaaaaaaaaaaaaaa00       0true00       0-00       000       000       0970aaaaaa0aaaaaaaaaaaaa444444...", "...t0444444444444444444444444444.....#...#...", 82);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test39564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39564");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("0true-1.0097.00true-1.0097.00true-1.0097.00tr A 0true-1.0097.00true-1.0097.00true-1.0097.00tr", "44444444444444444444444444444444444444444", 41);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, '#', 145, 44);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test39565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39565");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("               #######    a   HI!HI!...", "0097..");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test39566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39566");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(6, 26, 78);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
    }

    @Test
    public void test39567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39567");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("...HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test39568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39568");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) 0, 9L, 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test39569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39569");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("                                      100.0                ...");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfAny(".7900.1-eu", strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test39570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39570");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("                                                                                               100.0");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.stripAll(strArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "-1.0097.04444444444444444444444444444444444444444444", 20, 551);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test39571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39571");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("A         A         A         A         A         A         A         A         A         A   114", 127, 79);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test39572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39572");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("                           aaaa0aaaaa aaaa0aaaaa aaaa0aaaaa aaaa0aaaaa                           ", 4.444444444444444E50d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.444444444444444E50d + "'", double2 == 4.444444444444444E50d);
    }

    @Test
    public void test39573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39573");
        char[] charArray11 = new char[] { '4', '4', ' ' };
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "0", charArray11);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsAny("a", charArray11);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                                      ...                                                     ", charArray11);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "4 0true-1.0097.044444444444444444444444444", charArray11);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                                                                                                                                                                                                                        4444a44444                                                                                                                                                                                                       44444444444444444444444444444444444444444444444444...true-1.4444444...97.4444444...444444444444444444444444444444444444444444", charArray11);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "true-1.  97", charArray11);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "44444444444444444444444444444444444444444440true-1.0097.0", charArray11);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "4444444..444444444444444440true-1.0097...44444444444444444444444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "44 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "44 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[4, 4,  ]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test39574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39574");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("                     ", "a0aaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test39575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39575");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("UE-1.0097.", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...44444444444444444444444444444444440TRUE-1.0097", 618);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test39576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39576");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("                                         ...                                                    ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: multiple points");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test39577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39577");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("44444444444444444444444444444444444444444440TRUE-1 0097 A 4444444444444444444444444444444444444444444440TRUE-1 0097 A 4444444444444444444444444444444444444444444440TRUE-1 0097 A 4444444444444444444444444444444444444444444440TRUE-1 0097 A 4444444444444444444444444444444444444444444440TRUE-1 0097 A 4444444444444444444444444444444444444444444440TRUE-1 0097 A 4444444444444444444444444444444444444444444440TRUE-1 0097 A 4444444444444444444444444444444444444444444440TRUE-1 0097 A 4444444444444444444444444444444444444444444440TRUE-1 0097 A 4444444444444444444444444444444444444444444440TRUE-1 0097", 115);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44444444444444444444444444444444444444444440TRUE-1 0097 A 4444444444444444444444444444444444444444444440TRUE-1 0097" + "'", str2, "44444444444444444444444444444444444444444440TRUE-1 0097 A 4444444444444444444444444444444444444444444440TRUE-1 0097");
    }

    @Test
    public void test39578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39578");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                                                                                                                                                                                                                                          44444444444444444440true-1.0097.aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444444444444444444444444444444444444444AaAaAaAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaat", "0TRUE-1.00-1.0097.0444444444444444", 229);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test39579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39579");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("444444444444444444444444444444444444444444447900.1-EURT04444444444444444444444444444444444...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "44444444444444444440true-1.0097.444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test39580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39580");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("#########################################HI!HI!HI!HI!HI!HI!HI!HI!HI!HI########", "0TRUE-1.04444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#########################################HI!HI!HI!HI!HI!HI!HI!HI!HI!HI########" + "'", str2, "#########################################HI!HI!HI!HI!HI!HI!HI!HI!HI!HI########");
    }

    @Test
    public void test39581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39581");
        char[] charArray7 = new char[] { '4', 'a', 'a', ' ' };
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "...44                             ", charArray7);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "A   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    A0true-1.0097.0aaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1.0097.0aaaa", charArray7);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsAny("     hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...      ", charArray7);
        java.lang.Class<?> wildcardClass11 = charArray7.getClass();
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "4aa ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "4aa ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[4, a, a,  ]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test39582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39582");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("A    44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test39583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39583");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444true-1.00true-1.97.44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test39584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39584");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("true-1.97.", "                                      100.0                                                     ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test39585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39585");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("aaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AAAAAAAAAAAAAAAAA" + "'", str1, "AAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test39586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39586");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("444444444444444440TRUE-1.0097...444444444444444444444444444444444444444440TRUE-1.0097...444444444444444444444444444444444444444440TRUE-1.0097...444444444444444444444444444444444444444440TRUE-1.0097...444444444444444444444444444444444444444440TRUE-1.0097...444444444444444444444444444444444444444440TRUE-1.0097...444444444444444444444444444444444444444440TRUE-1.0097...444444444444444444444444444444444444444440TRUE-1.0097...444444444444444444444444444444444444444440TRUE-1.0097...444444444444444444444444444444444444444440TRUE-1.0097...444444444444444444444444444444444444444440TRUE-1.0097...444444444444444444444444444444444444444440TRUE-1.0097...44444444444444444444444                 ...                                                     ");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test39587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39587");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("", "444444444444444444444440.7900.1-eurt0aaaa                                                     0.001");
        boolean boolean6 = org.apache.commons.lang3.StringUtils.endsWithAny("                                         ...                                                    ", strArray5);
        int int7 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("", strArray5);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray5);
        int int9 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray5);
        java.lang.String[] strArray15 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                               ", "444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0true-1.44444444444444444444444444444444444444444440true-1.0097.097.44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444", (int) 'a');
        boolean boolean16 = org.apache.commons.lang3.StringUtils.startsWithAny("AAAAAAAAAAAAAA", strArray15);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAny("RT00.7900.1-EURT00.7900.1-EURT00.7900.1-EURT0aaaaaaaaaaRT00.7900.1-EURT00.7900.1-EURT00.7900.1-EURT0", strArray15);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                     aaaa0aaaaa                    ", strArray5, strArray15);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                     aaaa0aaaaa                    " + "'", str18, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                     aaaa0aaaaa                    ");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test39588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39588");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("...44444444444444444444444444444444444444444444444444444...", "...", 21, (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "...44444444444444444444444444444444444..." + "'", str4, "...44444444444444444444444444444444444...");
    }

    @Test
    public void test39589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39589");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("aaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaaaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaaaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaaaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaaaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaaaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaaaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaaaaaaaaaaaa4444444...4444444...4444444..a   hi!hi!hi!haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444444440.7900.1-eurt0aaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaaaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaaaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaaaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaaaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaaaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaaaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaaaaaaaaaaaa4444444...4444444...4444444..a   hi!hi!hi!haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaaaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaaaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaaaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaaaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaaaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaaaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaaaaaaaaaaaa4444444...4444444...4444444..a   hi!hi!hi!haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444444440.7900.1-eurt0aaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaaaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaaaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaaaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaaaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaaaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaaaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaaaaaaaaaaaa4444444...4444444...4444444..a   hi!hi!hi!haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "aaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaaaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaaaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaaaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaaaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaaaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaaaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaaaaaaaaaaaa4444444...4444444...4444444..a   hi!hi!hi!haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444444440.7900.1-eurt0aaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaaaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaaaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaaaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaaaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaaaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaaaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaaaaaaaaaaaa4444444...4444444...4444444..a   hi!hi!hi!haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test39590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39590");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("", "                                      4444400       0444444                                     ", "                                                                                ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test39591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39591");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                                                                                                                                                                                                                                                                                                                                                 04true4-414.400974.4004true4-414.400974.4004true4-414.400974.4004tr4 4A4", "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444AAAA");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test39592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39592");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("", "Aaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaAaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaAaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaAaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaAaaaaaaaaaa4444444...4444444...44hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!Aaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaAaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaAaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaAaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaAaaaaaaaaaa4444444...4444444...444", "44444444444444444444444444444444444444444440TRUE-1 0097 A 4444444444444444444444444444444444444444444440TRUE-1 0097 A 4444444444444444444444444444444444444444444440TRUE-1 0097 A 4444444444444444444444444444444444444444444440TRUE-1 0097 A 4444444444444444444444444444444444444444444440TRUE-1 0097 A 4444444444444444444444444444444444444444444440TRUE-1 0097 A 4444444444444444444444444444444444444444444440TRUE-1 0097 A 4444444444444444444444444444444444444444444440TRUE-1 0097 A 4444444444444444444444444444444444444444444440TRUE-1 0097 A 4444444444444444444444444444444444444444444440TRUE-1 0097");
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test39593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39593");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("4444444444444444444444444440.7900.1-EURT04444444444444444444444444444444444444444440.7900.1-EURT044444444444444444444444444440true-1.00...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test39594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39594");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("                                1aaaaaaaaaaa4444444...4444444...4444444...4  ", "00true-1.0097.00tr    A     0true-1.0097.00true-1.0097.00true-1.0097.00tr");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                1aaaaaaaaaaa4444444...4444444...4444444...4  " + "'", str2, "                                1aaaaaaaaaaa4444444...4444444...4444444...4  ");
    }

    @Test
    public void test39595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39595");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("    A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A     ", "h", 100);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("     A    ", "4444444...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("0true-1.0097.044444444444444444444444444444444444444444", strArray5, strArray8);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray5, ' ');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.concatWith("", (java.lang.Object[]) strArray5);
        java.lang.String[] strArray14 = org.apache.commons.lang3.StringUtils.stripAll(strArray5, "a4444444444444444444444444444444");
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray5);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray5, "a4a4a4a444444444444444444444444A44444444444444444444444...AAAA0AAAAA44444444444444444444444444444444444444444440TRUE-1.0097.0AAAA0AAAAA44444444444444444444444444444444444444444440TRUE-1.0097.0AAAA0AAAAA44444444444444444444444444444444444444444440TRUE-1.0097.0AAAA0AAAAA44444444444444444444444444444444444444444440TRUE-1.0097.0AAAA0AAAAA44444444444444444444444444444444444444444440TRUE-1.0097.0AAAA0AAAAA44444444444444444444444444444444444444444440TRUE-1.0097.0AAAA0AAAAA44444444444444444444444444444444444444444440TRUE-1.0097.0AAAA0AAAAA44444444444444444444444444444444444444444440TRUE-1.0097.0AAAA0AAAAA44444444444444444444444444444444444444444440TRUE-1.0097.0AAAA0AAA");
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0true-1.0097.044444444444444444444444444444444444444444" + "'", str9, "0true-1.0097.044444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "    A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A     " + "'", str11, "    A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A     ");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "    A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A     " + "'", str12, "    A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A     ");
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "    A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A     " + "'", str15, "    A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A     ");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "    A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A     " + "'", str17, "    A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A     ");
    }

    @Test
    public void test39596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39596");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("########################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################0true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.00...", 982, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa########################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################0true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.00...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa########################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################0true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.00...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test39597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39597");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "A00       000       000       00");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test39598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39598");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("aaaaaa0aaaa0.7900.1-eurt04444444444444444... 44444444444444444444444444444444444444444440TRUE-1.0097.04444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test39599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39599");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("44444444444444444444444444444444444444444440TRUE-1.0097.A4444444444444444444444444444444444444444444440TRUE-1.0097.A4444444444444444444444444444444444444444444440TRUE-1.0097.A4444444444444444444444444444444444444444444440TRUE-1.0097.A4444444444444444444444444444444444444444444440TRUE-1.0097.A4444444444444444444444444444444444444444444440TRUE-1.0097.A4444444444444444444444444444444444444444444440TRUE-1.0097.A4444444444444444444444444444444444444444444440TRUE-1.0097.A4444444444444444444444444444444444444444444440TRUE-1.0097.A4444444444444444444444444444444444444444444440TRUE-1.0097.", "0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test39600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39600");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("a HI!HI!HI!HI!HI!HI!HI!HI!HI!HI... a                                                                                                                                                                      ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"a HI!HI!HI!HI!HI!HI!HI!HI!HI!HI... a\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test39601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39601");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("0TRUE-1.0", "            AAAA0AAAAA0AAAA0AAAAA0AAAA0AAAAA0AAAA0A444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", 16);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test39602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39602");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("aaaaaaaaaaaaaaaaaaaaaaaaaaa                     AAAA0AAAAA           aaaaaaaaaaaaaaaaaaaaaaaaaaaa", 27);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 27 + "'", int2 == 27);
    }

    @Test
    public void test39603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39603");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "4444444..444444444444444440T");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test39604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39604");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("...44444444444...                                                                                                                                                              ", (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...44444444444...                                                                                                                                                              " + "'", str2, "...44444444444...                                                                                                                                                              ");
    }

    @Test
    public void test39605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39605");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh             A     ", "444440TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00Ta0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR4444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh             A     " + "'", str2, "hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh             A     ");
    }

    @Test
    public void test39606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39606");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00T" + "'", str1, "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00T");
    }

    @Test
    public void test39607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39607");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("aa 100.0aaaa", ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, '#', 292, 667);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 292");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test39608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39608");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(9.0d, (double) 24, (double) 27);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 27.0d + "'", double3 == 27.0d);
    }

    @Test
    public void test39609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39609");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "       0true-1.0097.00true-1.0097.00true-1.0097.00tr    a     0true-1.0097.00true-1.0097.00true-1.0097.00tr        ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test39610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39610");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split(".44444444444444444444444444444444a    4", "a A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A aaaaaaaaaaaaaaaaaaaa00       0true00       0-00       000       000       09700       000       0", 537);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test39611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39611");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("100.0                                                AAAAAAAAAAAAAAAAAA", 788);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "100.0                                                AAAAAAAAAAAAAAAAAA" + "'", str2, "100.0                                                AAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test39612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39612");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("true-1.00true-1.97.true-1.00true-1.97.true-1.00true-1.97.true-1.00true-1.97.true-1.00true-1.97.true-1.00true-1.97.true-1.00true-1.97.true-1.00true-1.97.true-1.00true-1.97.true-1.00true-1.97.true-1.00true-1.97.true-1.00true-1.97.true-1.00true-1.97.true-1.00true-1.97.true-                                                                                                                                                                                                                                                      aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                                                                                                                                                                                                                                                                                                                                 ", 107);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "true-1.00true-1.97.true-1.00true-1.97.true-1.00true-1.97.true-1.00true-1.97.true-1.00true-1.97.true-1.00true-1.97.true-1.00true-1.97.true-1.00true-1.97.true-1.00true-1.97.true-1.00true-1.97.true-1.00true-1.97.true-1.00true-1.97.true-1.00true-1.97.true-1.00true-1.97.true-                                                                                                                                                                                                                                                      aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                                                                                                                                                                                                                                                                                                                                 " + "'", str2, "true-1.00true-1.97.true-1.00true-1.97.true-1.00true-1.97.true-1.00true-1.97.true-1.00true-1.97.true-1.00true-1.97.true-1.00true-1.97.true-1.00true-1.97.true-1.00true-1.97.true-1.00true-1.97.true-1.00true-1.97.true-1.00true-1.97.true-1.00true-1.97.true-1.00true-1.97.true-                                                                                                                                                                                                                                                      aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                                                                                                                                                                                                                                                                                                                                 ");
    }

    @Test
    public void test39613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39613");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfBlank((java.lang.CharSequence) "aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa", (java.lang.CharSequence) " A");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa" + "'", charSequence2, "aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa");
    }

    @Test
    public void test39614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39614");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("4444444440097...##########################################0444##############################################4444444440097...#############################################################################################4444444440097...#############################################################################################4444444440097...#################################A HI!HI!HI!HI!HI!HI!HI!HI!HI!HI... A", "                                                       ", 168);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test39615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39615");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("                  4                   0TRUE-1.0097.04444444444444444444444444444444444444444440TRUE-1.0097.044444444444444444444444444", 465);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 465 + "'", int2 == 465);
    }

    @Test
    public void test39616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39616");
        java.lang.CharSequence charSequence0 = null;
        char[] charArray8 = new char[] { '4', '4', ' ' };
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "0", charArray8);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsAny("                                      100.0                                                      ", charArray8);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsAny("###0.001##", charArray8);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsAny("                                                                         aaaa0aaaaa   ", charArray8);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAnyBut(charSequence0, charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "44 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "44 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[4, 4,  ]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test39617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39617");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "                        ", (java.lang.CharSequence) "                                                                            0097.                                                 ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 106 + "'", int2 == 106);
    }

    @Test
    public void test39618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39618");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("4444                                           ", "                 ...                                                     aaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                                                                                                                                                                                                                                                                                         ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test39619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39619");
        char[] charArray15 = new char[] { ' ', '4', 'a', 'a', 'a' };
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "100.0", charArray15);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray15);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsAny("44444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444", charArray15);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "0true-1.0097.00true-1.0097.00true-1.0097.00tr    A     0true-1.0097.00true-1.0097.00true-1.0097.00t", charArray15);
        int int20 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!", charArray15);
        boolean boolean21 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "444444444444", charArray15);
        boolean boolean22 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...", charArray15);
        boolean boolean23 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "444                                      100.0                                                     aaaa444444444444444444444", charArray15);
        boolean boolean24 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "0097      a   HI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAA       ...", charArray15);
        int int25 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "!hi!hi!hi...    A0true-1.0097.0aaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1.0097.0aaaaaaaaaaaaaaaaaaaaaaa40true-1.0097.     A    40true-1.0097.     A    40true-1.0097.  A    4aaaaaaa", charArray15);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray15), " 4aaa");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray15), " 4aaa");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray15), "[ , 4, a, a, a]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 45 + "'", int19 == 45);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 12 + "'", int25 == 12);
    }

    @Test
    public void test39620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39620");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("0097.00T44444444444444444444444444444444444444444444444444...true-1.4444444...97.4444444...4444444444444444444444444444444444444444444", "44444444444444444444444444444444444444444440true-1.0097.     a    4444444444444444444444444444444444444444444440true-1.0097.     a    4444444444444444444444444444444444444444444440true-1.0097.     a    4444444444444444444444444444444444444444444440true-1.0097.     a    4444444444444444444444444444444444444444444440true-1.0097.     a    4444444444444444444444444444444444444444444440true-1.0097.     a    4444444444444444444444444444444444444444444440true-1.0097.     a    4444444444444444444444444444444444444444444440true-1.0097.     a    4444444444444444444444444444444444444444444440true-1.0097.     a    4444444444444444444444444444444444444444444440true-1.0097");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test39621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39621");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace(".0097.00true-1.0097.00true-1.0097.00tr", " 4A4 4RT4004.479004.414-4EURT4004.47444444444444444444444444444444444444444444444444444 4A4 4RT4004.479004.414-4EURT4004.47", "#############AAAA0AAAAAAAAA0AAAAAAAAA0AAA...0...###################################################################################################################################################################################hI!###############################################################################################################################################################################################################################################################################################################################################################################################################################");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ".0097.00true-1.0097.00true-1.0097.00tr" + "'", str3, ".0097.00true-1.0097.00true-1.0097.00tr");
    }

    @Test
    public void test39622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39622");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("...44444444444...", "....4444444444444444444444444444...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa....4444444444444444444444444444...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa....4444444444444444444444444444...", 967);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test39623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39623");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("    A   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...44444444444444444444444444444444440TRUE-1.0097");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test39624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39624");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "true-1....97true-1....97");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test39625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39625");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("...444444444444444444444444444444444444444444444     4    444444444444444444444444444444444444444444444           444444444444444444444444444444444444444444444     4    444444444444444444444444444444444444444444444           444444444444444444444444444444444444444444444     4    444444444444");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                                         aaaa0aaaaa   ", "...                     4444444444444444444444444444444444444444444TRUE-1.97.4444444444444444444444444444444444444444444444444444444444444444444444444444444444444TRUE-1.97.4444444444444444444444444444444444444444444                                                   ");
        java.lang.String[] strArray7 = null;
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.replaceEach("aaaa0aaaaaaaaa0aaaaaaaaa0aaa...0...", strArray6, strArray7);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("                                      hI!HI!HI!HI!HI!HI!HI!HI!Htrue-1.00                                           true-1.97.", strArray2, strArray7);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "aaaa0aaaaaaaaa0aaaaaaaaa0aaa...0..." + "'", str8, "aaaa0aaaaaaaaa0aaaaaaaaa0aaa...0...");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "                                      hI!HI!HI!HI!HI!HI!HI!HI!Htrue-1.00                                           true-1.97." + "'", str9, "                                      hI!HI!HI!HI!HI!HI!HI!HI!Htrue-1.00                                           true-1.97.");
    }

    @Test
    public void test39626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39626");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "044444444444444444444444444                                                                                    hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...hi!hi!hi!hi!hi!hi!hi!", (java.lang.CharSequence) "00.7900.1-EURT00.7900.1-EURT00.7900.1-EURT0");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 541 + "'", int2 == 541);
    }

    @Test
    public void test39627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39627");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("4A4 4rt4004.479004.414-4eurt4004.47444444444444444444444444444444444444444444444444444 4A4 4rt4004.479004.414-4eurt4004.47", "                                                                                                                                                                                                                                             0                  ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                             0                  " + "'", str2, "                                                                                                                                                                                                                                             0                  ");
    }

    @Test
    public void test39628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39628");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("                                                                                                                                                                              Atrue-1.AA97.AAtrue-1.AA97.AAtrue-1.AA97.AAtr A Atrue-1.AA97.AAtrue-1.AA97.AAtrue-1.AA97.AAtr", "                                                                                                                          4444444...4444444...4444444...4...", "                       a44444444444444444444...444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                                                                              Atrue-1.AA97.AAtrue-1.AA97.AAtrue-1.AA97.AAtr A Atrue-1.AA97.AAtrue-1.AA97.AAtrue-1.AA97.AAtr" + "'", str3, "                                                                                                                                                                              Atrue-1.AA97.AAtrue-1.AA97.AAtrue-1.AA97.AAtr A Atrue-1.AA97.AAtrue-1.AA97.AAtrue-1.AA97.AAtr");
    }

    @Test
    public void test39629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39629");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("Hi!hi!hi!hi!hi!hi!hi!hi!hi!hi");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test39630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39630");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa444440true-1.0097...4444440true-1.0097...4444440444444444444444444444444444444440true-1.0097...4444440true-1.0097...4444440aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test39631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39631");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 100, (byte) 100 };
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte8 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        byte byte10 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[10, 100, 100]");
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 100 + "'", byte4 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 100 + "'", byte5 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 100 + "'", byte6 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 100 + "'", byte7 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 100 + "'", byte8 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 10 + "'", byte9 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte10 + "' != '" + (byte) 10 + "'", byte10 == (byte) 10);
    }

    @Test
    public void test39632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39632");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "...4444                                                              ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test39633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39633");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaA    ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih   Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "444444444444444444444444444444444440true-1.0097.     a    4444444444444444444444444444444444444444444440true-1.0097.     a    4444444444444444444444444444444444444444444440true-1.0097.     a    4444444444444444444444444444444444444444444440true-1.0097.     a    4444444444444444444444444444444444444444444440true-1.0097.     a    4444444444444444444444444444444444444444444440true-1.0097.     a    4444444444444444444444444444444444444444444440true-1.0097.     a    4444444444444444444444444444444444444444444440true-1.0097.     a    4444444444444444444444444444444444444444444440true-1.0097.");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test39634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39634");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("AAA", "  A      A                            100.0                                                     aaaa", "...44                             ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "..." + "'", str3, "...");
    }

    @Test
    public void test39635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39635");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("aaaa44........4444444444444444444444444444444.....4444444444444444444444444444...4444444444........4444444444444444444444444444...4444444444........4444444444444444444444444444.aaaa", "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444a   HI!HI!...", 975);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test39636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39636");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("4     4     4     4     4     4     4     4     4     4     4     4     4 ", "aaaa0aaaaa aaaa0aaaaa aaaa0aaaaa aaaa0aaaaa");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test39637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39637");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("                                      100.0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                      100.0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "                                      100.0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test39638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39638");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "                                       aaaaaaa      a         a         a         a         aaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test39639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39639");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAATRUE97TRUE97AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAATRUE97TRUE97AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str1, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAATRUE97TRUE97AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test39640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39640");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("                                                                                                                                                                                                                                                                                                                                     ###    a   HI!HI                                                                                                                                                                                                                                                                                                                                      ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "###    a   HI!HI" + "'", str1, "###    a   HI!HI");
    }

    @Test
    public void test39641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39641");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 660L, 15.0d, (double) 16);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 660.0d + "'", double3 == 660.0d);
    }

    @Test
    public void test39642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39642");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("0true-1.0097.04444444444444444444444444444444444444444440true-1.0097.044444444444444444444444444", "0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRA0TRUE-1.0097.00TRUE-1.0097.0...", 744);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test39643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39643");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("true444...444444444444444444444");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test39644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39644");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                                                                               44                     aaaa0aaaaa                                          aaaa0aaaaa                                          aaaa0aaaaa       ...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test39645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39645");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.split("                                      100.0                                                                                                          ", "44444444444444444444444444444444444444444440true-1.0097.  A    44444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097", 47);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("...40true-1.0097.04444444444", strArray2, strArray6);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "...40true-1.0097.04444444444" + "'", str7, "...40true-1.0097.04444444444");
    }

    @Test
    public void test39646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39646");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("0       00", "1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.00....444444440tr...", 550);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test39647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39647");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("TRUE-1.0097.0", "                 ...                                                     aaaaaaaaaaaaaaaaaaaaaaaaaa", 216);
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray4);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "TRUE-100970" + "'", str5, "TRUE-100970");
    }

    @Test
    public void test39648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39648");
        char[] charArray14 = new char[] { ' ', '4', 'a', 'a', 'a' };
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "100.0", charArray14);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray14);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsAny("44444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444", charArray14);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "0true-1.0097.00true-1.0097.00true-1.0097.00tr    A     0true-1.0097.00true-1.0097.00true-1.0097.00t", charArray14);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "0true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444", charArray14);
        boolean boolean20 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H", charArray14);
        boolean boolean21 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "Hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!###########################################################################################################################################################################################################################################################################################################################################################################################################################################", charArray14);
        int int22 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "44444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.", charArray14);
        boolean boolean23 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "...4444.....", charArray14);
        java.lang.Class<?> wildcardClass24 = charArray14.getClass();
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray14), " 4aaa");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray14), " 4aaa");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray14), "[ , 4, a, a, a]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 45 + "'", int18 == 45);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 14 + "'", int19 == 14);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test39649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39649");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens(".............................................", "a0aaaaa              0true-1.0097.0444", (-1));
        java.lang.Class<?> wildcardClass4 = strArray3.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test39650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39650");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                               a    TRUETRUETRUET                                                              ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test39651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39651");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("..4444444...4444444...4444444...4444444...4444444...4444444...4444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "..4444444...4444444...4444444...4444444...4444444...4444444...4444444" + "'", str1, "..4444444...4444444...4444444...4444444...4444444...4444444...4444444");
    }

    @Test
    public void test39652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39652");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("                 ...                                                     ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"                 ...                                                     \"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test39653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39653");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("", 69);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test39654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39654");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("4                   0TRUE-1.0097.04444444444444444444444444444444444444444440TRUE-1.0097.044444444444444444444444444", 732);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4                   0TRUE-1.0097.04444444444444444444444444444444444444444440TRUE-1.0097.044444444444444444444444444" + "'", str2, "4                   0TRUE-1.0097.04444444444444444444444444444444444444444440TRUE-1.0097.044444444444444444444444444");
    }

    @Test
    public void test39655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39655");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "97.000true-1.0097.000true-1.0097.000true-1.0097.000true-1.0097.000true-1.0097.000true-1.0097.097.000true-1.0097.000true-1.0097.000true-1.0097.000true-1.0097.000true-1.0097.000true-1.0097.097.000true-1.0097.000true-1.0097.000true-1.0097.000true-1.0097.000true-1.0097.000true-1.0097.097.000true-1.0097.000true-1.0097.000true-1.0097.000true-1AAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAA");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test39656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39656");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "                       444                       ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test39657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39657");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("     0TRUE-10AAAA00970AAAA0AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test39658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39658");
        char[] charArray11 = new char[] { '4', '4', ' ' };
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "0", charArray11);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444", charArray11);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "    A     ", charArray11);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", charArray11);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "44444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444", charArray11);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "444...44444444444444444444444444444444440true-1.0097...44", charArray11);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsAny("4444444...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", charArray11);
        boolean boolean19 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "4444444...                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           0aaaa", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "44 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "44 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[4, 4,  ]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 43 + "'", int16 == 43);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test39659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39659");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      A A A A A");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test39660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39660");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("0444...44444444444444444444444444444444440TRUE-1.0097...4", '#', 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0444...44444444444444444444444444444444440TRUE-1.0097...4" + "'", str3, "0444...44444444444444444444444444444444440TRUE-1.0097...4");
    }

    @Test
    public void test39661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39661");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("0true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00t100.0#####100.0###");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test39662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39662");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("    A         A                                                     100.0    A         A         ", "0TRUE-1.0097.00TRUE-1....0true-1.0097...0TRUE-1.0097.00TRUE-1....0true-1.0097...0TRUE-1.0097.00TRUE-1....0true-1.0097...0TRUE-1.0097.00TRUE-1....0true-1.0097...0TRUE-1.0097.00TRUE-1....0true-1.0097...0TRUE-1.0097.00TRUE-1....0true-1.0097...0TRUE-1.0097.00TRUE-1....0true-1.0097...0TRUERT00.7900.1-EURT00.7900.1-EURT00.7900.1-EURT0 A RT00.7900.1-EURT00.7900.1-EURT00.7900.1-EURT00TRUE-1.0097.00TRUE-1....0true-1.0097...0TRUE-1.0097.00TRUE-1....0true-1.0097...0TRUE-1.0097.00TRUE-1....0true-1.0097...0TRUE-1.0097.00TRUE-1....0true-1.0097...0TRUE-1.0097.00TRUE-1....0true-1.0097...0TRUE-1.0097.00TRUE-1....0true-1.0097...0TRUE-1.0097.00TRUE-1....0true-1.0097...0TRUE-");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "    A         A                                                     100.0    A         A         " + "'", str2, "    A         A                                                     100.0    A         A         ");
    }

    @Test
    public void test39663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39663");
        long[] longArray1 = new long[] { (short) 100 };
        long long2 = org.apache.commons.lang3.math.NumberUtils.min(longArray1);
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(longArray1);
        long long4 = org.apache.commons.lang3.math.NumberUtils.min(longArray1);
        long long5 = org.apache.commons.lang3.math.NumberUtils.max(longArray1);
        long long6 = org.apache.commons.lang3.math.NumberUtils.min(longArray1);
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray1), "[100]");
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
    }

    @Test
    public void test39664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39664");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("4444aaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444444444444444444444444444444444444440true");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4444aaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444444444444444444444444444444444444440tru" + "'", str1, "4444aaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444444444444444444444444444444444444440tru");
    }

    @Test
    public void test39665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39665");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("true");
        boolean boolean3 = org.apache.commons.lang3.StringUtils.endsWithAny("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", strArray2);
        int int4 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test39666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39666");
        char[] charArray15 = new char[] { ' ', '4', 'a', 'a', 'a' };
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "100.0", charArray15);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray15);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsAny("44444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444", charArray15);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "0true-1.0097.00true-1.0097.00true-1.0097.00tr    A     0true-1.0097.00true-1.0097.00true-1.0097.00t", charArray15);
        int int20 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray15);
        boolean boolean21 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "4444444...", charArray15);
        int int22 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "4444444...", charArray15);
        boolean boolean23 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "                     aaaa0aaaaa                     ", charArray15);
        boolean boolean24 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "    A    ...IH!IH!IH!IH!IH!IH!IH!IH!IH!IH   A    ", charArray15);
        boolean boolean25 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "h!ih!h!ih!h!ih!h!ih!h!ih!h!ih!h!ih!h!ih!h!ih!h!ih!", charArray15);
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 7 + "'", int22 == 7);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test39667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39667");
        long[] longArray5 = new long[] { (byte) 1, (byte) 10, (short) -1, (byte) 10, (short) 10 };
        long long6 = org.apache.commons.lang3.math.NumberUtils.min(longArray5);
        long long7 = org.apache.commons.lang3.math.NumberUtils.max(longArray5);
        long long8 = org.apache.commons.lang3.math.NumberUtils.max(longArray5);
        long long9 = org.apache.commons.lang3.math.NumberUtils.max(longArray5);
        long long10 = org.apache.commons.lang3.math.NumberUtils.min(longArray5);
        long long11 = org.apache.commons.lang3.math.NumberUtils.max(longArray5);
        long long12 = org.apache.commons.lang3.math.NumberUtils.min(longArray5);
        long long13 = org.apache.commons.lang3.math.NumberUtils.min(longArray5);
        long long14 = org.apache.commons.lang3.math.NumberUtils.max(longArray5);
        org.junit.Assert.assertNotNull(longArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray5), "[1, 10, -1, 10, 10]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 10L + "'", long8 == 10L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10L + "'", long9 == 10L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 10L + "'", long11 == 10L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 10L + "'", long14 == 10L);
    }

    @Test
    public void test39668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39668");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("....414-4eurt40");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "....414-4eurt40" + "'", str1, "....414-4eurt40");
    }

    @Test
    public void test39669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39669");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("0a44444444444444444444444444444444444444444440true-1.0097.0a0a44444444444444444444444444444444444444444440true-1.0097.0a0a44444444444444444444444444444444444444444440true-1.0097.0a0a44444444444444444444444444444444444444444440true-1.0097.0a0a44444444444444444444444444444444444444444440true-1.0097.0a0a44444444444444444444444444444444444444444440true-1.0097.0a0a44444444444444444444444444444444444444444440true-1.0097.0a0a44444444444444444444444444444444444444444440true-1.0097.0a0a44444444444444444444444444444444444444444440true-1.0097.0a0a44444444444444444444444...aA4A4A4A444444444444444444444444", 907);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test39670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39670");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("###################################    a   hi!hi!...", "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test39671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39671");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444                                                                                                                                                                                                                                                                           true 1.  97                                                                                                                                                                                                                                                                            4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "..####################################...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test39672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39672");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("4444444...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "444...44444444444444444444444444444444440true-1.0097...44", 3);
        int int4 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test39673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39673");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "4000                                                                                                                                                     HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...         444444444444444444444444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4000                                                                                                                                              ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4000                                                                                                                                                     HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...         444444444444444444444444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4000                                                                                                                                              " + "'", str1, "4000                                                                                                                                                     HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...         444444444444444444444444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4000                                                                                                                                              ");
    }

    @Test
    public void test39674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39674");
        int[] intArray3 = new int[] { 267, (byte) -1, 267 };
        int int4 = org.apache.commons.lang3.math.NumberUtils.max(intArray3);
        int int5 = org.apache.commons.lang3.math.NumberUtils.max(intArray3);
        int int6 = org.apache.commons.lang3.math.NumberUtils.min(intArray3);
        int int7 = org.apache.commons.lang3.math.NumberUtils.max(intArray3);
        int int8 = org.apache.commons.lang3.math.NumberUtils.min(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[267, -1, 267]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 267 + "'", int4 == 267);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 267 + "'", int5 == 267);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 267 + "'", int7 == 267);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test39675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39675");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("0true-1.0097.044444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0TRUE-1.0097.044444444444444444444444444444444444444444" + "'", str1, "0TRUE-1.0097.044444444444444444444444444444444444444444");
    }

    @Test
    public void test39676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39676");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("                                                                                             100.                                                                                             100.                                                                                         rt00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt0     a    rt00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt0                                                                                             100.                                                                                             100.                                                                                          ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test39677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39677");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("###########################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!", "0true-1.0097.0444444444444444444444444444444444444444444");
        boolean boolean4 = org.apache.commons.lang3.StringUtils.endsWithAny("             AAAA0AAAAA    ", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test39678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39678");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("444444444...4444444444........44444444444");
        java.lang.Class<?> wildcardClass2 = strArray1.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test39679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39679");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("...A ...", 267, 9);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test39680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39680");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "a   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    4444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test39681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39681");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               ", 17);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 17 + "'", int2 == 17);
    }

    @Test
    public void test39682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39682");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("                                                                                                                                                                                                                                                                                                                                                                                                                     44444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.", "...44444444444...                 aaaaaaaaaaa");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test39683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39683");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a       44444444444444444444444444444444444444444444444444...true-1.4444444...97.4444444...4444444444444444444444444444444444444444444                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a        ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                       A                       A                       A                       A                       A                       A                       A                       A                       A                       A                       A                       A                       A                       A                       A                       A                       A       44444444444444444444444444444444444444444444444444...TRUE-1.4444444...97.4444444...4444444444444444444444444444444444444444444                       A                       A                       A                       A                       A                       A                       A                       A                       A                       A                       A                       A                       A                       A                       A                       A                       A        " + "'", str1, "                       A                       A                       A                       A                       A                       A                       A                       A                       A                       A                       A                       A                       A                       A                       A                       A                       A       44444444444444444444444444444444444444444444444444...TRUE-1.4444444...97.4444444...4444444444444444444444444444444444444444444                       A                       A                       A                       A                       A                       A                       A                       A                       A                       A                       A                       A                       A                       A                       A                       A                       A        ");
    }

    @Test
    public void test39684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39684");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("Aaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test39685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39685");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min(0L, (long) 545, (long) 144);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test39686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39686");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                                                 ", "4444444444444444444444444444");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test39687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39687");
        short[] shortArray1 = new short[] { (byte) -1 };
        short short2 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short3 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        short short4 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        short short5 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        short short6 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
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
    public void test39688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39688");
        java.lang.CharSequence charSequence5 = null;
        char[] charArray12 = new char[] { '4', '4', ' ' };
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "0", charArray12);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444", charArray12);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "    A     ", charArray12);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAnyBut(charSequence5, charArray12);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsAny("444...44444444444444444444444444444444440true-1.0097...44", charArray12);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "4444444...", charArray12);
        boolean boolean19 = org.apache.commons.lang3.StringUtils.containsAny("A     0true-1.0097.00true-1.0097.00true-1.0097.00tr", charArray12);
        int int20 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "Aaaaaaaaa", charArray12);
        boolean boolean21 = org.apache.commons.lang3.StringUtils.containsAny("4444aaaaaaaaaaaaaaaaaaaaaaaaaaaa", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "44 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "44 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[4, 4,  ]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test39689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39689");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("4444444444444444444444444444444444444444444A A A A                        a                             true-1.A A A A                        a                             97.A A A A                        a                             4444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4444444444444444444444444444444444444444444                             a                        A A A A.79                             a                        A A A A.1-eurt                             a                        A A A A4444444444444444444444444444444444444444444" + "'", str1, "4444444444444444444444444444444444444444444                             a                        A A A A.79                             a                        A A A A.1-eurt                             a                        A A A A4444444444444444444444444444444444444444444");
    }

    @Test
    public void test39690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39690");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("                       44444444444444444444...4444                       44444444444444444444...4444", (byte) 100);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 100 + "'", byte2 == (byte) 100);
    }

    @Test
    public void test39691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39691");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("0444444444       44444A   hi!hi!0444444444       44444a a a a a", "                                                                                  44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444A    ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih   A44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444                                                                                   ", 124);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test39692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39692");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("......................", ".7900.1-eurt0444444444444444444444444444444444444444444444    A   ...", 123);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "......................" + "'", str3, "......................");
    }

    @Test
    public void test39693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39693");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("a0true-1.0097.04444444444444444444444444444444444444444440true-1.0097.044444444444444444444444444aa", "444444a444444444444444444");
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, ' ', 56, (int) (short) 4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test39694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39694");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("100.0                                                                                      100.0                                                                                      100.0                                                                                      100.0                                                                                      100.0                                                                                      100.0                                                                                      100.0                                                                                      100.0                                                                                      100.0                                                                                      100.0");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "100.0                                                                                      100.0                                                                                      100.0                                                                                      100.0                                                                                      100.0                                                                                      100.0                                                                                      100.0                                                                                      100.0                                                                                      100.0                                                                                      100.0" + "'", str1, "100.0                                                                                      100.0                                                                                      100.0                                                                                      100.0                                                                                      100.0                                                                                      100.0                                                                                      100.0                                                                                      100.0                                                                                      100.0                                                                                      100.0");
    }

    @Test
    public void test39695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39695");
        char[] charArray14 = new char[] { ' ', '4', 'a', 'a', 'a' };
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "100.0", charArray14);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray14);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsAny("44444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444", charArray14);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "0true-1.0097.00true-1.0097.00true-1.0097.00tr    A     0true-1.0097.00true-1.0097.00true-1.0097.00t", charArray14);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!", charArray14);
        boolean boolean20 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "444444444444", charArray14);
        boolean boolean21 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...", charArray14);
        boolean boolean22 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "444                                      100.0                                                     aaaa444444444444444444444", charArray14);
        int int23 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1 0097   ", charArray14);
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
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test39696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39696");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("                                                                                                                                        ", "444444444444444444444444..", 33);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test39697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39697");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("     A    44444444444444444444444444444444444444444440true-1.0097.0", "aaaa0.7900.1-eurt0aaaaaaaaaaaaaaaaaaaaaaaaaaa0.7900.1-eurt0A    ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih   A");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test39698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39698");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!0097      a   HI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAA       ...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test39699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39699");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("", "0       00");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray2);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test39700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39700");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("4444444444444444444444444444444444444444444 a A A A 97.A a A A A true-1.A a A A A 4444444444444444444444444444444444444444444A", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test39701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39701");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("a hi!hi!hi!hi!hi!hi!hi!hi!hi!hi... a4true4-44497", "Aaaa                                                     0.001                            A      A  ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi... a4true4-44497" + "'", str2, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi... a4true4-44497");
    }

    @Test
    public void test39702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39702");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("", "974");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test39703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39703");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("UE", 179, 141);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test39704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39704");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("aaa   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1 0097   aa                                        ", "         A         A         A         A         A         A         ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test39705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39705");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("4444444444444444444444444444444444444444444 TRUE-1. 97. 4444444444444444444444444444444444444444444", 44444444444444L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 44444444444444L + "'", long2 == 44444444444444L);
    }

    @Test
    public void test39706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39706");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhhhhhhh...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhhhhhhh...AAAAAAAAAAAAAAAAAAAAAAAAAA                                         41004.404                                                    AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhhhhhhh...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhhhhhhh...AAAAAAAAAAAAAAAAAAAAAAAAAA", 53, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhhhhhhh...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhhhhhhh...AAAAAAAAAAAAAAAAAAAAAAAAAA                                         41004.404                                                    AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhhhhhhh...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhhhhhhh...AAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str3, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhhhhhhh...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhhhhhhh...AAAAAAAAAAAAAAAAAAAAAAAAAA                                         41004.404                                                    AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhhhhhhh...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhhhhhhh...AAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test39707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39707");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "                                                                                                         aHI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                                         aHI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str1, "                                                                                                         aHI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test39708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39708");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("...a..", 82, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...a..############################################################################" + "'", str3, "...a..############################################################################");
    }

    @Test
    public void test39709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39709");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfBlank("4444444440097...#############################################################################################", "                                                                                                                                                                                                                                             0                                                                                                                          4444444...4444444...4444444...4...                       ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444440097...#############################################################################################" + "'", str2, "4444444440097...#############################################################################################");
    }

    @Test
    public void test39710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39710");
        long[] longArray6 = new long[] { 0L, (byte) -1, (short) 1, (short) 100, 10L, 10L };
        long long7 = org.apache.commons.lang3.math.NumberUtils.max(longArray6);
        long long8 = org.apache.commons.lang3.math.NumberUtils.max(longArray6);
        long long9 = org.apache.commons.lang3.math.NumberUtils.max(longArray6);
        long long10 = org.apache.commons.lang3.math.NumberUtils.min(longArray6);
        java.lang.Class<?> wildcardClass11 = longArray6.getClass();
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray6), "[0, -1, 1, 100, 10, 10]");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 100L + "'", long9 == 100L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test39711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39711");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("4444444444444444444444444444444444444444444 TRUE-1. 97. 444444444444444444444444444444444444444444");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test39712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39712");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                                                      ", "Ue-1.0097...444444444444444444444444########################################################################################100.aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test39713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39713");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "A A A A A4A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "a A A A A4A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444" + "'", str1, "a A A A A4A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444");
    }

    @Test
    public void test39714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39714");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center(".7900.1-eurt04444444444444444444444444444444444444444444 A .7900.1-eurt04444444444444444444 A .7900.1-eurt0444444444444444444444444444444444444444444444 A", 0, "aaaaa0aaaa0.7900.1-eurt04444444444444444...");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ".7900.1-eurt04444444444444444444444444444444444444444444 A .7900.1-eurt04444444444444444444 A .7900.1-eurt0444444444444444444444444444444444444444444444 A" + "'", str3, ".7900.1-eurt04444444444444444444444444444444444444444444 A .7900.1-eurt04444444444444444444 A .7900.1-eurt0444444444444444444444444444444444444444444444 A");
    }

    @Test
    public void test39715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39715");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("...                                                                                                                                                                             ...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "......" + "'", str1, "......");
    }

    @Test
    public void test39716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39716");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa4444444444444444444444444444444444444444444", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test39717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39717");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("Ahi!hi!hi!haaaaaaaaaaaaaaA44444aaaaaaaaaaaaaaaA hi!hi!hi!hi!hi!hi!hi!hi!hi!hi... AA hi!hi!hi!hi!0true-1 0097 044444444444444444444444444 4");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test39718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39718");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("", "true4-4449744                                       ", "44444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test39719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39719");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("0true-1044440097044440                                                                                                                                       A    4444444444444", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAaaaaa0aaaa0.790");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test39720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39720");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA100.", 25);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AAAAAAAAAAAAAAAAAAAAA100." + "'", str2, "AAAAAAAAAAAAAAAAAAAAA100.");
    }

    @Test
    public void test39721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39721");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test39722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39722");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("                                                                                                                                                                                                                                                                                                                  aaaaaaaaaa                                                                                                                                                                                                                                                                                                                   ", "    a  ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test39723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39723");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("AAA...", "      ");
        boolean boolean4 = org.apache.commons.lang3.StringUtils.endsWithAny("                          44444444444444444444444a", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test39724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39724");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR    A     0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR0TRUE-1.0097.00TRUE-Ahi!hi!hi!haaaaaaaaaaaaaaaaaaaaaaaaaaaa0HI!HI!HI", "44444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test39725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39725");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("        ", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "0true-1.0097.4444444444444444444444444444444444444444444440true-1.0097");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test39726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39726");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove(" true - 1 . 97 . ", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " true - 1 . 97 . " + "'", str2, " true - 1 . 97 . ");
    }

    @Test
    public void test39727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39727");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("#true-#.############################################################################################################################################################################################                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      ", "", "                 aaaa0aaaaa    ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#true-#.############################################################################################################################################################################################                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      " + "'", str3, "#true-#.############################################################################################################################################################################################                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      ");
    }

    @Test
    public void test39728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39728");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(243, 124, 150);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 124 + "'", int3 == 124);
    }

    @Test
    public void test39729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39729");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               true-1.  97", "                                                                                                                                                                                                                                          44444444444444444440true-1.0097.");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test39730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39730");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("0.001                                                                                      0.001                                                                                      0.001                                                                                      0.001                                                                                      0.001                                                                                      0.001                                                                                      0.001                                                                                      0.001                                                                                      0.001                                                                                      0.001", "A A ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test39731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39731");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("true-1.00true-1.97.true-1.00true-1.97.true-1.00true-1.97.true-1.00true-1.97.true-1.00true-1.97.true-1.00true-1.97.true-1.00true-1.97.true-1.00true-1.97.true-1.00true-1.97.true-1.00true-1.97.true-1.00true-1.97.true-1.00true-1.97.true-1.00true-1.97.true-1.00true-1.97.true-                                                                                                                                                                                                                                                      aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                                                                                                                                                                                                                                                                                                                                ", 104);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test39732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39732");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("                                   ", 181, 130);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test39733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39733");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("                                                                                                                                                                                                                                                                                                                                                                                                                                                                     aaaaaa0aaaaaaaaaaaaa444444...                                                                                                                                                                                                                                                                                                                                                                                                      aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                               true  ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                     AAAAAA0AAAAAAAAAAAAA444444...                                                                                                                                                                                                                                                                                                                                                                                                      AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                               TRUE  " + "'", str1, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                     AAAAAA0AAAAAAAAAAAAA444444...                                                                                                                                                                                                                                                                                                                                                                                                      AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                               TRUE  ");
    }

    @Test
    public void test39734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39734");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("00.7900.1-EURT00.7900.1-EURT00.7900.1-EURT0                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ", "     a    44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 344, 82);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00.7900.1-EURT00.7900.1-EURT00.7900.1-EURT0                                            a    44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                                                                                                                                              " + "'", str4, "00.7900.1-EURT00.7900.1-EURT00.7900.1-EURT0                                            a    44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                                                                                                                                              ");
    }

    @Test
    public void test39735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39735");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) " 4...7900.1-EURT04444444444444444444444444444444444...4440");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test39736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39736");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("4444444...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "0true-1.0097.00true-1.0097.00true-1.0097.00tr    A     0true-1.0097.00true-1.0097.00true-1.0097.00tr", 1);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.concatWith("true-1.0097.00true-1.0097.00tr", (java.lang.Object[]) strArray5);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.concatWith("                                        4444444444444444444444444444444444444444444444444444444444", (java.lang.Object[]) strArray5);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray5, ' ');
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "4444444...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str6, "4444444...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "4444444...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str7, "4444444...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "4444444...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str9, "4444444...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test39737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39737");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("                                     100.0                                                     aaaa");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"                                     100.0                                                     aaaa\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test39738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39738");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("4444444444444444444444444444444444444444444 true - 1 . 97 . 4444444444444444444444444444444444444...", ".7900.1-eurt0444444444444444444444444444444444444444444444 A .7900.1-eurt0444444444444444444444444444444444444444444444 A .7900.1-eurt0444444444444444444444444444444444444444444444 A .7900.1-eurt0444444444444444444444444444444444444444444444 A .7900.1-eurt0444444444444444444444444444444444444444444444 A .7900.1-eurt0444444444444444444444444444444444444444444444 A .7900.1-eurt0444444444444444444444444444444444444444444444 A .7900.1-eurt0444444444444444444444444444444444444444444444 A .7900.1-eurt0444444444444444444444444444444444444444444444 A .7900.1-eurt044444444444444444444444444444..IH!IH!IH!IH!IH!IH!IH!IH!IH!IH a a ...IH!IH!IH!IH!IH!IH!IH!IH!IH!IH a a ...IH!IH!IH!IH!IH!IH!IH!IH!IH!IH a a ...IH!IH!IH!IH!IH!IH!IH!IH!IH!IH a a ...IH!IH!IH!IH!IH!IH!IH!IH!IH!IH a");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test39739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39739");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("aaaa0aaaaa", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", 0);
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray5, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa    ");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "aaaa0aaaaa" + "'", str7, "aaaa0aaaaa");
    }

    @Test
    public void test39740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39740");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("AAAA0AAAAA");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test39741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39741");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("    A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A     ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A" + "'", str1, "A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A");
    }

    @Test
    public void test39742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39742");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaa                                            100.0aaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test39743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39743");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("...I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...", "", 91);
        int int4 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test39744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39744");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test39745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39745");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("                                       444...44444444444444444444444444444444440true-1.0097", 22, "4...44444444444444444444a                       ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                       444...44444444444444444444444444444444440true-1.0097" + "'", str3, "                                       444...44444444444444444444444444444444440true-1.0097");
    }

    @Test
    public void test39746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39746");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("true-1.  97.", "    4444444444444444444444444444   ", 73);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "true-1.  97." + "'", str4, "true-1.  97.");
    }

    @Test
    public void test39747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39747");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("0TRUE-1.0097.04444444444444444444444444444444444444444440TRUE-1.0097.0444444444444444444444444444", "                                                                                                                                                                                               ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0TRUE-1.0097.04444444444444444444444444444444444444444440TRUE-1.0097.0444444444444444444444444444" + "'", str2, "0TRUE-1.0097.04444444444444444444444444444444444444444440TRUE-1.0097.0444444444444444444444444444");
    }

    @Test
    public void test39748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39748");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("##############################################################################################################################################################################################################################################################################################################################################################################4444444444444444444444444444444444444444444TRUE-1.97.4444444444444444444444444444444444444444444444444444444444444444444444444444444444444TRUE-1.97.4444444444444444444444444444444444444444444", ".001                                      ...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test39749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39749");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("97.0", "100.097.044444444444444444444444444...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "97.0" + "'", str2, "97.0");
    }

    @Test
    public void test39750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39750");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("                                                                                                                                              0TRUE-1 0097 0", "", 77);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                                              0TRUE-1 0097 0" + "'", str3, "                                                                                                                                              0TRUE-1 0097 0");
    }

    @Test
    public void test39751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39751");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("A         A         A         A         A         A         A         A         A         A         A         A         A         A ...", (short) (byte) 0);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 0 + "'", short2 == (short) 0);
    }

    @Test
    public void test39752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39752");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("444444440true-1.0097", "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!", 236);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "444444440true-1.0097" + "'", str3, "444444440true-1.0097");
    }

    @Test
    public void test39753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39753");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("                                                                 A A A A                        a                                                                                              ", 2, 40);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                        " + "'", str3, "                                        ");
    }

    @Test
    public void test39754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39754");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("a         a         a         aa         a         a         a", (int) ' ', 252);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60 + "'", int3 == 60);
    }

    @Test
    public void test39755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39755");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("444...44444444444444444444444444444444440true-1.0097...44                                        ", 4.444444591917127E31d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.444444591917127E31d + "'", double2 == 4.444444591917127E31d);
    }

    @Test
    public void test39756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39756");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("a                             ###    A   hi!hi!...###    A   hi!hi!...###", '#');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test39757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39757");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("...4...4444444..#########.                                                   ...4...4444444...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...4...4444444..#########.                                                   ...4...4444444..." + "'", str1, "...4...4444444..#########.                                                   ...4...4444444...");
    }

    @Test
    public void test39758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39758");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("     A    ", "4444444...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", "");
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("4", strArray5, strArray8);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.concatWith("", (java.lang.Object[]) strArray8);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.concatWith("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", (java.lang.Object[]) strArray8);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray8, "...........................................................................................................................................................................");
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray8, 'a', 585, 259);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "4" + "'", str9, "4");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str10, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str11, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str13, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test39759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39759");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("...4A   HI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAA...44", 119, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...4A   HI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAA...44aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...4A   HI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAA...44aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test39760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39760");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat("...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0ue-1.0097...444444444444444444444444########################################################################################100.", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test39761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39761");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 57.0f, (double) 664.0f, (double) 82);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 57.0d + "'", double3 == 57.0d);
    }

    @Test
    public void test39762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39762");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "                                                                                                97.0                                                                                                97.0                                                                                                97.0                                                                                                97.0                                            444                                                                                                97.0                                                                                                97.0                                                                                                97.0                                                                                                97.0                                            ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test39763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39763");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("444444444444444");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test39764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39764");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("Aaaa                                                     0.001                            A      A  ");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray1, "A hi!hi!hi!hi!hi!hi!hi!hi!hi!hi... AA hi!hi!hi!hi!0true-1 0097 044444444444444444444444444 4");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test39765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39765");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("hi!Hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", "                                                                                                  ...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test39766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39766");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("...aaaa...44444444444444444", 314, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444...aaaa...44444444444444444" + "'", str3, "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444...aaaa...44444444444444444");
    }

    @Test
    public void test39767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39767");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfBlank("444444444444444444444444444444444444444444479-eurt44444444444444444444444444444444444444444447979-eurt4444444444444444444444444444444444444444444-eurt79-eurt44444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "                         ...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "444444444444444444444444444444444444444444479-eurt44444444444444444444444444444444444444444447979-eurt4444444444444444444444444444444444444444444-eurt79-eurt44444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str2, "444444444444444444444444444444444444444444479-eurt44444444444444444444444444444444444444444447979-eurt4444444444444444444444444444444444444444444-eurt79-eurt44444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test39768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39768");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA4444444...   4444444...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...", (java.lang.CharSequence) "aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 854 + "'", int2 == 854);
    }

    @Test
    public void test39769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39769");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("                                                                                                                                                                                                                                                                                                                                                                                                                           AAAAAAAAAAAAAAAAAAAAAAAAAAAAH!IH!IH!IH ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"AAAAAAAAAAAAAAAAAAAAAAAAAAAAH!IH!IH!IH\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test39770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39770");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "Hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test39771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39771");
        java.lang.Object[] objArray0 = null;
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(objArray0, "1aaaaaaaaaaa4444444...4444444...4444444...4", 19, 147);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test39772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39772");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "A44444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test39773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39773");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("                                                                                                                                                                                                                                          44444444444444444440TRUE-1.0097HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    A        ", "0aaaa a 0aaaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test39774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39774");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("      A         A         A         A         A", 750);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test39775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39775");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.split("a", "44444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444");
        java.lang.String[] strArray10 = new java.lang.String[] { "hi!" };
        java.lang.String[] strArray11 = org.apache.commons.lang3.StringUtils.stripAll(strArray10);
        java.lang.String[] strArray14 = org.apache.commons.lang3.StringUtils.split("44444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444", '4');
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.replaceEach("100.0", strArray11, strArray14);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.endsWithAny("a", strArray11);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray11);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.replaceEach("4444444..444444444444444440true-1.0097...44444444444444444444444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...", strArray6, strArray11);
        boolean boolean19 = org.apache.commons.lang3.StringUtils.startsWithAny("0true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444", strArray11);
        int int20 = org.apache.commons.lang3.StringUtils.indexOfAny("44444444444444444444444444444444444444444440true-1.0097.0", strArray11);
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray11);
        java.lang.String str22 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray11);
        boolean boolean23 = org.apache.commons.lang3.StringUtils.endsWithAny("4444444440097...#############################################################################################", strArray11);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "100.0" + "'", str15, "100.0");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "4444444..444444444444444440true-1.0097...44444444444444444444444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444..." + "'", str18, "4444444..444444444444444440true-1.0097...44444444444444444444444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test39776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39776");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444444444444444444444444444444444444444 true - 1 . 97 . 4444444444444444444444444444444444444444444444444444444440TRUE-1.0097.0", 368, 38);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test39777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39777");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("4479", "a0000000000aaaaaaaaaaaaaaaaaaaaaaaaa");
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.concatWith("      a         a         a         a         a", (java.lang.Object[]) strArray4);
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("!hi!h!hi!h", "...900.1-EURT04444444444444444444444444444444444444444444", (-1));
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAny("41004.404                                                444444A444444444444444444444444A444444444444444444444444A444444444444444444444444A444444444444444444444444A444444444444444444444444A444444444444444444444444A444444444444444444444444A444444444444444444444444A444444444444444444444444A444444444444444444444444A444444444444444444444444A444444444444444444444444A444444444444444444444444A444444444444444444444444A444444444444444444444444A444444444444444444444444A444444444444444444444444A4444444444444444444", strArray10);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray10);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("0       000       00790       000       000       00-0       00eurt0       00", strArray4, strArray10);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "4479" + "'", str5, "4479");
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "!hi!h!hi!h" + "'", str12, "!hi!h!hi!h");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "0       000       00790       000       000       00-0       00eurt0       00" + "'", str13, "0       000       00790       000       000       00-0       00eurt0       00");
    }

    @Test
    public void test39778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39778");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "...44440true-1.0097.00true-1.0097.00true-1.0097.00tr", (java.lang.CharSequence) "0true-1.0097.0444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "...44440true-1.0097.00true-1.0097.00true-1.0097.00tr" + "'", charSequence2, "...44440true-1.0097.00true-1.0097.00true-1.0097.00tr");
    }

    @Test
    public void test39779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39779");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("4000                                                                                                                                                     HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...         444444444444444444444444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4000                                                                                                                                              ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4000                                                                                                                                                     hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...         444444444444444444444444444444444444444444444444444AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA4000                                                                                                                                              " + "'", str1, "4000                                                                                                                                                     hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...         444444444444444444444444444444444444444444444444444AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA4000                                                                                                                                              ");
    }

    @Test
    public void test39780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39780");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("A         ", ".0097.00true-1.000true-1.0                                    ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "A" + "'", str2, "A");
    }

    @Test
    public void test39781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39781");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("##100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0##Art00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt0##100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0##");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"#100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0##Art00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt0##100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0##\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test39782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39782");
        double[] doubleArray6 = new double[] { 181.0f, 57L, 4.4444042E9f, 444, 50.0d, 25L };
        double double7 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray6);
        double double8 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray6);
        double double9 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray6);
        double double10 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray6);
        double double11 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[181.0, 57.0, 4.444404224E9, 444.0, 50.0, 25.0]");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 25.0d + "'", double7 == 25.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 4.444404224E9d + "'", double8 == 4.444404224E9d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 4.444404224E9d + "'", double9 == 4.444404224E9d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 25.0d + "'", double10 == 25.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 4.444404224E9d + "'", double11 == 4.444404224E9d);
    }

    @Test
    public void test39783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39783");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                          ##100.0###                                           ", "0097      A   hi!hi!hi!haaaaaaaaaaaaaaaaaaaaaaaaaaaa       ...", (int) (short) 0);
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test39784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39784");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("...I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HhI!7.44444444444444444444444444444444444444444444 ", 7);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "444444 " + "'", str2, "444444 ");
    }

    @Test
    public void test39785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39785");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("AHI!HI!HI!HI!HI!HI!HI!HI!HI!H", 975, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaAHI!HI!HI!HI!HI!HI!HI!HI!HI!H" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaAHI!HI!HI!HI!HI!HI!HI!HI!HI!H");
    }

    @Test
    public void test39786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39786");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("                                      4444400       0444444                                      ");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test39787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39787");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(561, 20, 96);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 561 + "'", int3 == 561);
    }

    @Test
    public void test39788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39788");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("...7900.1-eurt0", "#############################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################0atruea-a1a.a0097a.a0", 25);
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, '#');
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "...7900.1-eurt0" + "'", str6, "...7900.1-eurt0");
    }

    @Test
    public void test39789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39789");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "    A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A     ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test39790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39790");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("                             ...");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test39791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39791");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaA" + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaA");
    }

    @Test
    public void test39792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39792");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("HHHHHHHHHHHHHHHHHHHrue-1.0097.0             a     ", 54, 741);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test39793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39793");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("aA44444A44a44444aA44444A44a44444aA44444A44a44444aA44444A44a44444aA44444A44a44444aA44444A44a44444aA44444A44a44444aA44444A44a44444aA44444A44a44444aA44444A44a44444aA44444A44a44444aA44444A44a44444aA44444A44a44444aA44444A44a44444aA44444A44a44444aA44444A44a44444aA44444A44a44444aA44444A44a44444aA44444A44a44444aA44444A44aAAAAAA4440true-1.0097.0AAAAAA4#AAAAAA40true-1.0097.0AAAAAA4#AAAAAA40true-1.0097.0AAAAAA", 614, 957);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test39794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39794");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("  A    TRUETRUETRUET", "4000                                                                                                                                                     HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...         444444444444444444444444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4000                                                                                                                                              ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test39795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39795");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "...44440true-1.0097.00true-1.0097.00true-1.0097.00tr");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test39796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39796");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("44444444444444444444444444444444444444444", "aaaaa0aaaa0.7900.1-eurt0aaa...4aaaaa0aaaa0.7900.1-eurt0aaa...4aaaaa0aaaa0.7900.1-eurt0aaa...4aaaaa0aaaa0.7900.1-eurt0aaa...4aaaaa0aaaa0.7900.1-eurt0aaa...4aaaaa0aaaa0.7900.1-eurt0aaa...4aaaaa0aaaa0.7900.1-eurt0aaa...4aaaaa0aaaa0.7900.1-eurt0aaa...4aaaaa0aaaa0.7900.1-eurt0aaa...4aaaaa0aaaa     ", (int) 'a');
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "44444444444444444444444444444444444444444" + "'", str4, "44444444444444444444444444444444444444444");
    }

    @Test
    public void test39797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39797");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444a00       000       000       00aaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaa4true-1.4497.4444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 170);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444a00       000       000       00aaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444a00       000       000       00aaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test39798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39798");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR4444444440TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00T", "00aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                             ", 969);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test39799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39799");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "    A    ...IH!IH!IH!IH!IH!IH!IH!IH!IH!IH   A    ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "    A    ...IH!IH!IH!IH!IH!IH!IH!IH!IH!IH   A    " + "'", str1, "    A    ...IH!IH!IH!IH!IH!IH!IH!IH!IH!IH   A    ");
    }

    @Test
    public void test39800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39800");
        char[] charArray11 = new char[] { ' ', '4', 'a', 'a', 'a' };
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "100.0", charArray11);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray11);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsAny("44444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444", charArray11);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "97.04444444444444444444444444444444444444444440true-1.0097.044444444444444444444444444", charArray11);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsAny("                                          ", charArray11);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "4444444444444444444444444444444444444444444 true-1.  97.     A    444444444444444444444444444444444444444444444 true-1.  97.     A    444444444444444444444444444444444444444444444 true-1.  97.     A    444444444444444444444444444444444444444444444 true-1.  97.     A    444444444444444444444444444444444444444444444 true-1.  97.     A    444444444444444444444444444444444444444444444 true-1.  97.     A    444444444444444444444444444444444444444444444 true-1.  97.     A    444444444444444444444444444444444444444444444 true-1.  97.     A    444444444444444444444444444444444444444444444 true-1.  97.     A    444444444444444444444444444444444444444444444 true-1.  97", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), " 4aaa");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), " 4aaa");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[ , 4, a, a, a]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test39801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39801");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("4444444444444444444444444444444444444444444#true#-#1#.#97#.#4444444444444444444444444444444444444444444true4444444444444444444444444444444444444444444#true#-#1#.#97#.#4444444444444444444444444444444444444444444-4444444444444444444444444444444444444444444#true#-#1#.#97#.#44444444444444444444444444444444444444444444444444444444444444444444444444444444444444#true#-#1#.#97#.#44444444444444444444444444444444444444444444444444444444444444444444444444444444444444#true#-#1#.#97#.#4444444444444444444444444444444444444444444974444444444444444444444444444444444444444444#true#-#1#.#97#.#44444444444444444444444444444444444444444444444444444444444444444444444444444444444444#true#-#1#.#97#.#4444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4444444444444444444444444444444444444444444#true#-#1#.#97#.#4444444444444444444444444444444444444444444true4444444444444444444444444444444444444444444#true#-#1#.#97#.#4444444444444444444444444444444444444444444-4444444444444444444444444444444444444444444#true#-#1#.#97#.#44444444444444444444444444444444444444444444444444444444444444444444444444444444444444#true#-#1#.#97#.#44444444444444444444444444444444444444444444444444444444444444444444444444444444444444#true#-#1#.#97#.#4444444444444444444444444444444444444444444974444444444444444444444444444444444444444444#true#-#1#.#97#.#44444444444444444444444444444444444444444444444444444444444444444444444444444444444444#true#-#1#.#97#.#4444444444444444444444444444444444444444444" + "'", str1, "4444444444444444444444444444444444444444444#true#-#1#.#97#.#4444444444444444444444444444444444444444444true4444444444444444444444444444444444444444444#true#-#1#.#97#.#4444444444444444444444444444444444444444444-4444444444444444444444444444444444444444444#true#-#1#.#97#.#44444444444444444444444444444444444444444444444444444444444444444444444444444444444444#true#-#1#.#97#.#44444444444444444444444444444444444444444444444444444444444444444444444444444444444444#true#-#1#.#97#.#4444444444444444444444444444444444444444444974444444444444444444444444444444444444444444#true#-#1#.#97#.#44444444444444444444444444444444444444444444444444444444444444444444444444444444444444#true#-#1#.#97#.#4444444444444444444444444444444444444444444");
    }

    @Test
    public void test39802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39802");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("...aaaa0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR", "TRUE-1", "                                                                                  ...i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!7.44444444444444444444444444444444444444444444                                                                                   ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...aaaa0      .0097.00      .0097.00      .0097.00  " + "'", str3, "...aaaa0      .0097.00      .0097.00      .0097.00  ");
    }

    @Test
    public void test39803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39803");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("", "A    ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih   A...     A    -EURT04444444444444444444444444444444444...", 83);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test39804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39804");
        char[] charArray8 = new char[] { '4', '4', ' ' };
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "0", charArray8);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "444...444444444444444444444444444444444444444...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", charArray8);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "aaaaaaaaa", charArray8);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "079001-eurt0", charArray8);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "                                     100.0                                                     aaaa                                     ", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "44 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "44 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[4, 4,  ]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test39805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39805");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("444 44444 4444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "444 44444 4444444444444444444444444" + "'", str1, "444 44444 4444444444444444444444444");
    }

    @Test
    public void test39806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39806");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("4444444444444444444444444444444444444444444TRUE4444444444444444444444444444444444444444444444444444444444444444444444444444444444444TRUE4444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test39807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39807");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("####################aaa...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1.0097...aa                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       ######################################", 539);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "####################aaa...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1.0097...aa                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       ######################################" + "'", str2, "####################aaa...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1.0097...aa                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       ######################################");
    }

    @Test
    public void test39808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39808");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("A         A                                                     1000    A         A", '#');
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "true-1.0097.0444444444444444444");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "A         A                                                     1000    A         A" + "'", str4, "A         A                                                     1000    A         A");
    }

    @Test
    public void test39809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39809");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("                                                                                                  4444444...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                                                                                   ", "");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test39810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39810");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa       ", ".0097.00true-1.0097.00trA0t...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test39811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39811");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("00       000       000       00aa44444444444444444444...444444444444444444444444444444444444444444444", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA4444444... 4444444...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...", (int) '4');
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test39812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39812");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("                     aaaa0aaaaa                     ...I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!                     aaaa0aaaaa                     ...I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!                     aaaa0aaaaa                     ...I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!                     aaaa0aaaaa                     ...I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!                     aaaa0aaaaa                     ...I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!                     aaaa0aaaaa                     ...I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!                     aaaa0aaaaa                     ...I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!                     aaaa0aaaaa                     ...I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!                     aaaa0aaaaa         A         A");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaa0aaaaa                     ...I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!                     aaaa0aaaaa                     ...I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!                     aaaa0aaaaa                     ...I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!                     aaaa0aaaaa                     ...I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!                     aaaa0aaaaa                     ...I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!                     aaaa0aaaaa                     ...I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!                     aaaa0aaaaa                     ...I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!                     aaaa0aaaaa                     ...I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!                     aaaa0aaaaa         A         A" + "'", str1, "aaaa0aaaaa                     ...I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!                     aaaa0aaaaa                     ...I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!                     aaaa0aaaaa                     ...I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!                     aaaa0aaaaa                     ...I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!                     aaaa0aaaaa                     ...I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!                     aaaa0aaaaa                     ...I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!                     aaaa0aaaaa                     ...I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!                     aaaa0aaaaa                     ...I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!                     aaaa0aaaaa         A         A");
    }

    @Test
    public void test39813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39813");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(534L, (long) 850, (long) 4);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 850L + "'", long3 == 850L);
    }

    @Test
    public void test39814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39814");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("4true4-4449744", '4');
        boolean boolean4 = org.apache.commons.lang3.StringUtils.startsWithAny("", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test39815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39815");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("                                                                                                                                                                                                                                    ...aaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test39816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39816");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("0true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.0");
        boolean boolean3 = org.apache.commons.lang3.StringUtils.startsWithAny("0true-1.00                               0                                                      0 ", strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test39817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39817");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("A    4444444444444444444444444444444444444444444440true-1.0097.     A    44444444444444444444A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A    ", "4444444444444444444444444444444444444444444440true-1.0097 A 4444444444444444444444444444444444444444444440true-1.0097. A 4444444444444444444444444444444444444444444440true-1.0097. A 4444444444444444444444444444444444444444444440true-1.0097. A 44444444444444", 314, 269);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "A    4444444444444444444444444444444444444444444440true-1.0097.     A    44444444444444444444A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A     4444444444444444444444444444444444444444444440true-1.0097 A 4444444444444444444444444444444444444444444440true-1.0097. A 4444444444444444444444444444444444444444444440true-1.0097. A 4444444444444444444444444444444444444444444440true-1.0097. A 44444444444444         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A    " + "'", str4, "A    4444444444444444444444444444444444444444444440true-1.0097.     A    44444444444444444444A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A     4444444444444444444444444444444444444444444440true-1.0097 A 4444444444444444444444444444444444444444444440true-1.0097. A 4444444444444444444444444444444444444444444440true-1.0097. A 4444444444444444444444444444444444444444444440true-1.0097. A 44444444444444         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A    ");
    }

    @Test
    public void test39818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39818");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "0    -1.0097.00    -1.0097.00    -1.0097.00   A 0    -1.0097.00    -1.0097.00    -1.0097.000    -1.0097.00    -1.0097.00    -1.0097.00   A 0    -1.0097.00    -1.0097.00    -1.0097.000    -1.0097.00    -1.0097.00    -1.0097.00   A 0    -1.0097.00    -1.0097.00    -1.0097.00                               ...4A   HI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAA...44");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test39819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39819");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("...e-1.0097.00true-1.0097.00trA0t", "                                              0true-1.00...44444...true-1.4444444...97.4444444...4444444444444...0true-1.00...44444...true-1.4444444...97.4444444...4444444444444...0true-1.00...44444...true-1.4444444...97.4444444...4444444444444...0tr    A     0true-1.00...44444...true-1.4444444...97.4444444...4444444444444...0true-1.00...44444...true-1.4444444...97.4444444...4444444444444...0true-1.00...44444...true-1.4444444...97.4444444...4444444444444...0tr");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...e-1.0097.00true-1.0097.00trA0t" + "'", str2, "...e-1.0097.00true-1.0097.00trA0t");
    }

    @Test
    public void test39820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39820");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate(".001", 51);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ".001" + "'", str2, ".001");
    }

    @Test
    public void test39821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39821");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("100.0#100.0#100.0#100.0#100.0#100.0#100.0#100.0#100.0#100.0#100.0#aRT00.7900.1-EURT00.7900.1-EURT00.7900.1-EURT0#100.0#100.0#100.0#100.0#100.0#100.0#100.0#100.0#100.0#100.0#100.0", "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI.A A A");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test39822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39822");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("", "...000     ...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test39823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39823");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR A 0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test39824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39824");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test39825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39825");
        int[] intArray3 = new int[] { 267, (byte) -1, 267 };
        int int4 = org.apache.commons.lang3.math.NumberUtils.max(intArray3);
        int int5 = org.apache.commons.lang3.math.NumberUtils.max(intArray3);
        int int6 = org.apache.commons.lang3.math.NumberUtils.max(intArray3);
        int int7 = org.apache.commons.lang3.math.NumberUtils.max(intArray3);
        int int8 = org.apache.commons.lang3.math.NumberUtils.min(intArray3);
        int int9 = org.apache.commons.lang3.math.NumberUtils.max(intArray3);
        int int10 = org.apache.commons.lang3.math.NumberUtils.min(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[267, -1, 267]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 267 + "'", int4 == 267);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 267 + "'", int5 == 267);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 267 + "'", int6 == 267);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 267 + "'", int7 == 267);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 267 + "'", int9 == 267);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test39826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39826");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("        HI!H4444404444HI!HI.A A A ...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI!H4444404444HI!HI.A A A ...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAA" + "'", str1, "HI!H4444404444HI!HI.A A A ...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAA");
    }

    @Test
    public void test39827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39827");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("100.0#100.0#100.0#100.0#100.0#100.0#100.0#100.0#100.0#100.0#100.0#aRT00.7900.1-EURT00.7900.1-EURT00.7900.1-EURT0#100.0#100.0#100.0#100.0#100.0#100.0#100.0#100.0#100.0#100.0#100.0", 'a', '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "100.0#100.0#100.0#100.0#100.0#100.0#100.0#100.0#100.0#100.0#100.0##RT00.7900.1-EURT00.7900.1-EURT00.7900.1-EURT0#100.0#100.0#100.0#100.0#100.0#100.0#100.0#100.0#100.0#100.0#100.0" + "'", str3, "100.0#100.0#100.0#100.0#100.0#100.0#100.0#100.0#100.0#100.0#100.0##RT00.7900.1-EURT00.7900.1-EURT00.7900.1-EURT0#100.0#100.0#100.0#100.0#100.0#100.0#100.0#100.0#100.0#100.0#100.0");
    }

    @Test
    public void test39828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39828");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "4444444444444444444444444444444444444444440true-1.0097.044444444444444444444444444444444444444444444444444444444444444444444444440TRUE-1.0097.04444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test39829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39829");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", "44444444444444444444444444444444444444444440true-1.0097.", 93);
        int int7 = org.apache.commons.lang3.StringUtils.indexOfAny("444444444444444444444444444444444444444444true-1.97.4444444444444444444444444444444444444444444", strArray6);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray6);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.concatWith("444444444444444444444444444444444444444444true-1.97.4444444444444444444444444444444444444444444", (java.lang.Object[]) strArray6);
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAny("0true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444", strArray6);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str8, "!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str9, "!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test39830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39830");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("RT00.7900.1-EURT00.7900.1-EURT00.7900.1-EURT0     A    RT00.7900.1-EURT00.7900.1-EURT00.7900.1-E");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test39831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39831");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("A A 0.001 Aaaa", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test39832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39832");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("A A A A                        a                                                                                              ", ' ');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test39833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39833");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("    A   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    A", "...44444444444...                                                                                                                                                                                                       ", 0);
        boolean boolean6 = org.apache.commons.lang3.StringUtils.endsWithAny("...4444444...444444444...", strArray5);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray5);
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAny("A A A A                        a                       ...aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true", strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "AHI!HI!HI!HI!HI!HI!HI!HI!HI!HIA" + "'", str7, "AHI!HI!HI!HI!HI!HI!HI!HI!HI!HIA");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test39834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39834");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd(" 4A4 4rt4004.479004.414-4eurt4004.47444444444444444444444444444444444444444444444444444 4A4 4rt4004.479004.414-4eurt4004.47", "true-1.  97.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " 4A4 4rt4004.479004.414-4eurt4004.47444444444444444444444444444444444444444444444444444 4A4 4rt4004.479004.414-4eurt4004.47" + "'", str2, " 4A4 4rt4004.479004.414-4eurt4004.47444444444444444444444444444444444444444444444444444 4A4 4rt4004.479004.414-4eurt4004.47");
    }

    @Test
    public void test39835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39835");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "44444444444444444444444444444444444444444440true-1.009744444444444444444444444444444444444444444440true-1.009744444444444444444444444444444444444444444440true-1.009744444444444444444444444444444444444444444440true-1.009744444444444444444444444444444444444444444440true-1.009744444444444444444444444444444444444444444440true-1.009744444444444444444444444444444444444444444440true-1.00974444444###################################    a   HI!HI!...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test39836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39836");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a4444444...aaaaaa...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test39837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39837");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("...000     ..", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                     aaaa0aaaaa                    ", 138);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test39838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39838");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("aaa...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1.0097...aa                                                                                            A    44                                                                                            A    44                                                                                            A    44                                                                                            A    44                                                                                            A    44                                                                                            A    44", "aaaaaaaaaaaaaaaaaaaaaaaaa...aaaaaaaaaaaaaaaaaaaaaaaaa...aaaaaaaaaaaaaaaaaaaaaaaaHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaa...aaaaaaaaaaaaaaaaaaaaaaaaa...aaaaaaaaaaaaaaaaaaaaaaaaHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaa...aaaaaaaaaaaaaaaaaaaaaaaaa...aaaaaaaaaaaaaaaaaaaaaaaaHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H");
    }

    @Test
    public void test39839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39839");
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
        int int27 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "4444444...true-1.4444444...97.4444444...4444444444444444444444444444444444444444444", charArray16);
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
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 7 + "'", int27 == 7);
    }

    @Test
    public void test39840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39840");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "0atruea-a1a.a00aaaa4444444444444", (java.lang.CharSequence) "aaaaaaa      a         a         a         a         aaaaaaaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test39841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39841");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("                                                                                                                                                                                                                                                                                                                                                                                                                  4                                                                                                                                                                                                                                                                                                                                                                                                                                ", 0, 175);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                                                                            ..." + "'", str3, "                                                                                                                                                                            ...");
    }

    @Test
    public void test39842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39842");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("44444444444444444444444444444444", "0true-1.0097.044444444444444444444444444444444444444444", 0);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, '#');
        boolean boolean7 = org.apache.commons.lang3.StringUtils.endsWithAny("rt00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt", strArray4);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.stripAll(strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "44444444444444444444444444444444" + "'", str6, "44444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test39843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39843");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("                                       aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "     a    44444444444444444444444444444444444444444440TRUE-1.0097.04444444444444444444444444444444444444444444", 57, 45);
        int int7 = org.apache.commons.lang3.StringUtils.indexOfAny("                                                                                                                                          ", strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test39844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39844");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                       a44444444444444444444...444444444444444444444444444444444444444444444                       a44444444444444444444...444444444444444444444444444444444444444444444                       a44444444444444444444...44444444444444444444444444444444444444444000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000", "aaaaaaaaaaaaaaaaaaaa   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    a0true-1.0097.0aaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1.0097.0aaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test39845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39845");
        long[] longArray5 = new long[] { (byte) 1, (byte) 10, (short) -1, (byte) 10, (short) 10 };
        long long6 = org.apache.commons.lang3.math.NumberUtils.min(longArray5);
        long long7 = org.apache.commons.lang3.math.NumberUtils.min(longArray5);
        long long8 = org.apache.commons.lang3.math.NumberUtils.min(longArray5);
        long long9 = org.apache.commons.lang3.math.NumberUtils.min(longArray5);
        long long10 = org.apache.commons.lang3.math.NumberUtils.min(longArray5);
        long long11 = org.apache.commons.lang3.math.NumberUtils.max(longArray5);
        org.junit.Assert.assertNotNull(longArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray5), "[1, 10, -1, 10, 10]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 10L + "'", long11 == 10L);
    }

    @Test
    public void test39846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39846");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min(444444444444L, 16L, (long) 615);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 16L + "'", long3 == 16L);
    }

    @Test
    public void test39847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39847");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("                                                                                                                                                                                                                                                                                                                                                                                 04true4-414.400974.4004true4-414.400974.4004true4-414.400974.4004tr4 4A4");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test39848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39848");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("    a   HI!HI!HI!HI!HI!HI!H", "                                                                                                                                                                                                                                 444...44444444444444444444444444444444440TRUE-1.0097                                                                                                                                                                                          ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test39849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39849");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("    A         A         A         A         A       Aaaaaaaaa A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A    ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test39850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39850");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444444444444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaatrue-1.aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa97.aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444444444444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "                                                                    44444444444444444440true-1.009");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test39851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39851");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("", "                                       aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 907);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test39852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39852");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "                                                                                                                            ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test39853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39853");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("44444444444444444444444444444440true0true-1.0097.00true-1.0097.00true-1.0097.00trA0t...");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test39854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39854");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("                                                  ", "....IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                  " + "'", str2, "                                                  ");
    }

    @Test
    public void test39855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39855");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "       aaaa0aaaaa                     ...", (java.lang.CharSequence) "0 true - 1 .");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test39856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39856");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("4444444...4444444...4444444...4", "0true-1.0097.00t..0true-1.0097.00t                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ", 468);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test39857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39857");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("aaaa0aaaaa", "444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0true-1.44444444444444444444444444444444444444444440true-1.0097.097.44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444", 32);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test39858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39858");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "0.7900.1-EURT0AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                                   4AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA    A");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test39859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39859");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("A   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    A");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test39860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39860");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("                                                           0 ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"       \"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test39861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39861");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("                                      100.0                                                AAAAAAAAAAAAAAAAAA", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test39862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39862");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.", 51, 967);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097." + "'", str3, "true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.");
    }

    @Test
    public void test39863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39863");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("                                                                                                                                                                                                                                                                                                                                       ", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA!hi!h!hi!hA0true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test39864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39864");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "true -   97                                                                                                                                                                                                                                                                            ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test39865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39865");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("                                                                                                                                                                                                                                                                                                                                                                                                  4444444444444444444444444444444444444444444true-1.97.4444444444444444444444444444444444444444444                                                                                                                                                                                                                                                                                                                                                                                                                                  ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test39866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39866");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("..####0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR", 15, 236);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "097.00TRUE-1.0097.00TRUE-1.0097.00TR" + "'", str3, "097.00TRUE-1.0097.00TRUE-1.0097.00TR");
    }

    @Test
    public void test39867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39867");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) (byte) 0, (short) 100, (short) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test39868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39868");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "a44", "0true-1.0097.00true-1.0097.00true-1.0097.00tr4444a444440true-1.0097.00true-1.0097.00true-1.0097.00t");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test39869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39869");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("                                                                                                                                                                                                         0TRUE-1.0097.044444444444444444444444444..");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test39870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39870");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("0true-1.0097.04444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.044444444444444440true-1.00###########################################################################################################################################################################################################################", 256, "0a44444444444444444444444444444444444444444440true-1.0097.0a0a44444444444444444444444444444444444444444440true-1.0097.0a0a44444444444444444444444444444444444444444440true-1.0097.0a0a44444444444444444444444444444444444444444440true-1.0097.0a0a44444444444444444444444444444444444444444440true-1.0097.0a0a44444444444444444444444444444444444444444440true-1.0097.0a0a44444444444444444444444444444444444444444440true-1.0097.0a0a44444444444444444444444444444444444444444440true-1.0097.0a0a44444444444444444444444444444444444444444440true-1.0097.0a0a44444444444444444444444...a1414141444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0true-1.0097.04444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.044444444444444440true-1.00###########################################################################################################################################################################################################################" + "'", str3, "0true-1.0097.04444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.044444444444444440true-1.00###########################################################################################################################################################################################################################");
    }

    @Test
    public void test39871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39871");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("4444444444444444444444444444444444444444444TRUE-1.97.4444444444444444444444444444444444444444444444444444444444444444444444444444444444444TRUE-1.97.4444444444444444444444444444444444444444444");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1);
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444444444444444444444444444444444444444TRUE-1.97.4444444444444444444444444444444444444444444444444444444444444444444444444444444444444TRUE-1.97.4444444444444444444444444444444444444444444" + "'", str2, "4444444444444444444444444444444444444444444TRUE-1.97.4444444444444444444444444444444444444444444444444444444444444444444444444444444444444TRUE-1.97.4444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test39872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39872");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace(".001", "aaaa0aaaaa                     ...I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!                     aaaa0aaaaa                     ...I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!                     aaaa0aaaaa                     ...I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!                     aaaa0aaaaa                     ...I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!                     aaaa0aaaaa                     ...I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!                     aaaa0aaaaa                     ...I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!                     aaaa0aaaaa                     ...I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!                     aaaa0aaaaa                     ...I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!                     aaaa0aaaaa         A         A", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA4444444...");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ".001" + "'", str3, ".001");
    }

    @Test
    public void test39873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39873");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("4444444444444444444444444444444444444444444444444444444444444444444444   !", 19);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test39874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39874");
        float[] floatArray4 = new float[] { 100, (byte) -1, (short) 1, (byte) -1 };
        float float5 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        float float6 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        float float7 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        float float8 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        float float9 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        float float10 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        float float11 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        float float12 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        float float13 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        float float14 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        float float15 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray4), "[100.0, -1.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 100.0f + "'", float6 == 100.0f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 100.0f + "'", float7 == 100.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + (-1.0f) + "'", float8 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 100.0f + "'", float9 == 100.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 100.0f + "'", float10 == 100.0f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 100.0f + "'", float11 == 100.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 100.0f + "'", float12 == 100.0f);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 100.0f + "'", float13 == 100.0f);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + (-1.0f) + "'", float14 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + (-1.0f) + "'", float15 == (-1.0f));
    }

    @Test
    public void test39875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39875");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("                                       444...44444444444444444444444444444444440true-1.0097...44444...44444444444444", "          ###    a   HI!HI!.           ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test39876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39876");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("...                                                   ", ' ', '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...###################################################" + "'", str3, "...###################################################");
    }

    @Test
    public void test39877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39877");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("44444444444444444444444444444444444444444444444444444444444444444444444!", (int) (byte) 100, 104);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test39878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39878");
        char[] charArray17 = new char[] { ' ', '4', 'a', 'a', 'a' };
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "100.0", charArray17);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray17);
        boolean boolean20 = org.apache.commons.lang3.StringUtils.containsAny("44444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444", charArray17);
        int int21 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "0true-1.0097.00true-1.0097.00true-1.0097.00tr    A     0true-1.0097.00true-1.0097.00true-1.0097.00t", charArray17);
        boolean boolean22 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "444444444444444444444444...7900.1-eurt044444444444444444", charArray17);
        boolean boolean23 = org.apache.commons.lang3.StringUtils.containsAny("...44444...true-1.4444444...97.4444444...4444444444444...", charArray17);
        boolean boolean24 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa       ...", charArray17);
        int int25 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "                                                                ..", charArray17);
        boolean boolean26 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "HI!", charArray17);
        int int27 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "a44444444444444444444...444444444444444444444444444444444444444444444", charArray17);
        int int28 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                                       444...44444444444444444444444444444444440TRUE-1.0097...44444...4444444444444", charArray17);
        boolean boolean29 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "0         aaa", charArray17);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray17), " 4aaa");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray17), " 4aaa");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray17), "[ , 4, a, a, a]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 45 + "'", int21 == 45);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 64 + "'", int25 == 64);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test39879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39879");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("1aaaaaaaaaaa4444444...4444444...4444444...4", "444444444444444444444444...44444444444444444444444444444444440true-1.0097...444444444444444444444444", 534);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1aaaaaaaaaaa4444444...4444444...4444444...4" + "'", str4, "1aaaaaaaaaaa4444444...4444444...4444444...4");
    }

    @Test
    public void test39880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39880");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "97...#############################################################################################");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test39881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39881");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("0true-1.0097.0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1.0097.0aaaaaaaaaaaaaaaaaaaaaaaaaaa", "44444444444444444444444444444444444444AAAA0AAAAAAAAA0AAAAAAAAA0AAA...0...444444444444444444444444444444444444444444444     4    44444444444444444444444444444444444444444444444                                      100.0                                                     aaaa444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test39882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39882");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("...i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!7.44444444444444444444444444444444444444444444");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test39883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39883");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(384, 17, 62);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 17 + "'", int3 == 17);
    }

    @Test
    public void test39884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39884");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "aaaaaa0aaaaaaaaaaaaa444444...                                                                ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test39885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39885");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H.7900.1-eurt04444444444444444444444444444444444444444444 a .7900.1-eurt04444444444444444444 a .7900.1-eurt0444444444444444444444444444444444444444444444 a.7900.1-eurt04444444444444444444444444444444444444444444 a .7900.1-eurt04444444444444444444 a .7900.1-eurt0444444444444444444444444444444444444444444444 a.7900.1-eurt04444444444444444444444444444444444444444444 a .7900.1-eurt04444444444444444444 a .7900.1-eurt0444444444444444444444444444444444444444444444 a.7900.1-eurt04444444444444444444444444444444444444444444 a .7900.1-eurt04444444444444444444 a .7900.1-eurt0444444444444444444444444444444444444444444444 a.7900.1-eurt044444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test39886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39886");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("4444444...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA0h!ih!h!ih!.h!ih!h!ih!0010h!ih!h!ih!.h!ih!h!ih!0h!ih!h!ih!hi4444444...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA0h!ih!h!ih!.h!ih!h!ih!0010h!ih!h!ih!.h!ih!h!ih!0h!ih!h!ih!hi4444444...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA0h!ih!h!ih!.h!ih!h!ih!0010h!ih!h!ih!.h!ih!h!ih!0h!ih!h!ih!hi4444444...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "100.0#100.0#100.0#100.0#100.0#100.0#100.0#100.0#100.0#100.0#100.0##RT00.7900.1-EURT00.7900.1-EURT00.7900.1-EURT0#100.0#100.0#100.0#100.0#100.0#100.0#100.0#100.0#100.0#100.0#100.0");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test39887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39887");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("                                                                                                                                                                                                                                                                     aaaaa0aaaa                     ", "a44444a444444a444444444444444444a44444a", "Aaaaaaaaa");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test39888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39888");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("aaa...aaaaaaaaaaaa...", "0444...44444444444444444444444444444444440TRUE-1.0097...4 ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test39889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39889");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("4444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444", 134);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test39890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39890");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("                             100.0", "                                                                                                                                                                                               tr.0097.00tr.0097.00tr.0097.00tr.0097.00tr.0097.00tr");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                             100.0" + "'", str2, "                             100.0");
    }

    @Test
    public void test39891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39891");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("A    ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih   A", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test39892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39892");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("                 ...                                                     aaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                                                                                                                                                                                                                                                                                         ", 269);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                               " + "'", str2, "                                                                                                                                                                               ");
    }

    @Test
    public void test39893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39893");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("...true-1....97....      #a######################...##############################################      #a######################.");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test39894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39894");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 113L, (float) 100L, (float) 250L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 250.0f + "'", float3 == 250.0f);
    }

    @Test
    public void test39895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39895");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444att-------ttt-------ttt-------t");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str2, "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test39896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39896");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) (byte) 10, (short) (byte) 0, (short) (byte) 100);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test39897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39897");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("RT00.7900.1-EURT00.7900.1-EURT00.7900.1-EURT0aaaaaaaaaaRT00.7900.1-EURT00.7900.1-EURT00.7900.1-EURT0", "RT00.7900.1-EURT00.7900.1-EURT00.7900.1-EURT0 A RT00.7900.1-EURT00.7900.1-EURT00.7900.1-EURT0", "...444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "RT00.7900.1-EURT00.7900.1-EURT00.7900.1-EURT0aaaaaaaaaaRT00.7900.1-EURT00.7900.1-EURT00.7900.1-EURT0" + "'", str3, "RT00.7900.1-EURT00.7900.1-EURT00.7900.1-EURT0aaaaaaaaaaRT00.7900.1-EURT00.7900.1-EURT00.7900.1-EURT0");
    }

    @Test
    public void test39898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39898");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("0TRUE-1.009", '#');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test39899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39899");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("###############################################################################################", "a A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A...", (int) (short) 1);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, 'a');
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "###############################################################################################" + "'", str5, "###############################################################################################");
    }

    @Test
    public void test39900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39900");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("4...44444444444444444444a", "#######################################4true4-4449744########################################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...44444444444444444444a" + "'", str2, "...44444444444444444444a");
    }

    @Test
    public void test39901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39901");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("A 0true-1.0097.00true-1.00AAAAA 0true-1.0097.00true-1.009", "", 104);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test39902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39902");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("True - 97", "                                                                         aaaa0aaaaa    ", "", 891);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "True - 97" + "'", str4, "True - 97");
    }

    @Test
    public void test39903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39903");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "HI!H4444404444HI!HI.A A A ...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI!H4444404444HI!HI.A A A ...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAA" + "'", str1, "HI!H4444404444HI!HI.A A A ...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAA");
    }

    @Test
    public void test39904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39904");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa       ", 951, 84);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test39905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39905");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("...i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!7.44444444444444444444444444444444444444444444", "44444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444", 660);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!7.44444444444444444444444444444444444444444444" + "'", str3, "...i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!7.44444444444444444444444444444444444444444444");
    }

    @Test
    public void test39906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39906");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("TRUE-1.0097.0");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray1);
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray1, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, "100.0#100.0#100.0#100.0#100.0#100.0#100.0#100.0#100.0#100.0#100.0#aRT00.7900.1-EURT00.7900.1-EURT00.7900.1-EURT0#100.0#100.0#100.0#100.0#100.0#100.0#100.0#100.0#100.0#100.0#100.0", 630, 29);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "TRUE-1.0097.0" + "'", str2, "TRUE-1.0097.0");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test39907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39907");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "...                     4444444444444444444444444444444444444444444TRUE-1.97.4444444444444444444444444444444444444444444444444444444444444444444444444444444444444TRUE-1.97.4444444444444444444444444444444444444444444", 651);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test39908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39908");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("...444###################################################44444444444444444444444", "0true-1.0097.00true-1.0097.00true-1.0097.00trHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HH");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test39909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39909");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("4444aaaaaaaaaaaaaaaaaaaaaa", "a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a!HI!H!HI!H");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444aaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "4444aaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test39910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39910");
        java.lang.CharSequence charSequence2 = null;
        char[] charArray12 = new char[] { '4', '4', ' ' };
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "0", charArray12);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444", charArray12);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "    A     ", charArray12);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "444444444444444444444444...7900.1-eurt044444444444444444", charArray12);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "###########################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!", charArray12);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "4444444444444444444444444444444444444444444 true - 1 . 97 . 4444444444444444444444444444444444444444444", charArray12);
        boolean boolean19 = org.apache.commons.lang3.StringUtils.containsOnly(charSequence2, charArray12);
        boolean boolean20 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "   4444444...AAAAAAAAA44444444...", charArray12);
        int int21 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "44 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "44 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[4, 4,  ]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test39911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39911");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(502.0d, (double) 58, (double) 445L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 502.0d + "'", double3 == 502.0d);
    }

    @Test
    public void test39912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39912");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("                                                ", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhhhhhhh...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhhhhhhh...AAAAAAAAAAAAAAAAAAAAAAAAAA                                         41004.404                                                    AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhhhhhhh...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhhhhhhh...AAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhhhhhhh...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhhhhhhh...AAAAAAAAAAAAAAAAAAAAAAAAAA                                         41004.404                                                    AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhhhhhhh...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhhhhhhh...AAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str2, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhhhhhhh...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhhhhhhh...AAAAAAAAAAAAAAAAAAAAAAAAAA                                         41004.404                                                    AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhhhhhhh...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhhhhhhh...AAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test39913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39913");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("444444444444444444444444...44444444444444444444444444444444440TRUE-1.0097...444444444444444444444444", '#');
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "444444444444444444444444...44444444444444444444444444444444440TRUE-1.0097...444444444444444444444444" + "'", str3, "444444444444444444444444...44444444444444444444444444444444440TRUE-1.0097...444444444444444444444444");
    }

    @Test
    public void test39914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39914");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("4                   0true-1.0097.04444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444", "0       00");
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "aaaaaaaaaaaaaaaaaaaaaaaaaaa444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 175, (int) (short) 1);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test39915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39915");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("A   hi!hi!", "4444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test39916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39916");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  ", "                            100.0                                                     aaaa", "     A    44");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  " + "'", str3, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  ");
    }

    @Test
    public void test39917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39917");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("...44444444444444444444444444444444440true-1.0097...");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test39918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39918");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "                                                                                     4444444444444444444444444444444444444444444a.79a.1-eurta44444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test39919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39919");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "aaa...                                                                                                                                                                                     ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test39920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39920");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi", "true -   97                                                                                                                                                                                                                                                                            ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi" + "'", str2, "!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi");
    }

    @Test
    public void test39921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39921");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("...A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A......A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A......A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A......A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A......A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A......A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A...", "UUUUU4UUUU444444444444444444444444444444444444444444444UUUUUUUUUUU444444444444444444444444444444444444444444444UUUUU4UUUU444444444444444444444444444444444444444444444UUUUUUUUUUU444444444444444444444444444444444444444444444UUUUU4UUUU444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A......A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A......A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A......A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A......A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A......A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A..." + "'", str2, "...A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A......A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A......A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A......A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A......A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A......A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A...");
    }

    @Test
    public void test39922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39922");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                                                                                   ", "    A         A                                                     100.0    A         A     ..");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test39923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39923");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 38L, (double) 28, (double) (short) 10);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
    }

    @Test
    public void test39924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39924");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("0.7900.1-eurt000.7900.1-eurt000.7900.1-eurt000.7900.1-eurt000.7900.1-eurt000.7900.1-eurt000.79", "#######################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0.7900.1-eurt000.7900.1-eurt000.7900.1-eurt000.7900.1-eurt000.7900.1-eurt000.7900.1-eurt000.79" + "'", str2, "0.7900.1-eurt000.7900.1-eurt000.7900.1-eurt000.7900.1-eurt000.7900.1-eurt000.7900.1-eurt000.79");
    }

    @Test
    public void test39925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39925");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) ".001");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test39926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39926");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("A hi!hi!hi!hi!hi!hi!hi!hi!hi!hi... AA hi!hi!hi!hi!hi!hi!hi!hi!hi!hi... AA hi!hi!hi!hi!hi!hi!hi!hi!hi!hi... AA hi!hi!hi!hi!hi!hi!hi!hi!hi!hi... AA hi!hi!hi!hi!hi!hi!hi!hi!hi!hi... AA hi!hi!hi!hi!hi!hi!hi!hi!hi!hi... AA hi!hi!hi!hi!hi!hi!hi!hi!hi!hi... AA hi!hi!hi!hi!hi!hi!hi!hi!hi!hi... AA hi!hi!hi!hi!hi!hi!hi!hi!hi!hi... AA hi!hi!hi!hi!hi!hi!hi!hi!hi!hi... AA hi!hi!hi!hi!hi!hi!hi!hi!hi!hi... AA hi!hi!hi!hi!hi!hi!hi!hi!hi!hi... AA hi!hi!hi!hi!hi!hi!hi!hi!hi!hi... AA hi!hi!hi!hi!hi!hi!hi!hi!hi!hi... AA hi!hi!hi!hi!hi!hi!hi!hi!hi!hi... AA hi!hi!hi!hi!hi!hi!hi!hi!hi!hi... AA hi!hi!hi!hi!hi!hi!hi!hi!hi!hi... AA hi!hi!hi!hi!hi!hi!hi!hi!hi!hi... AA hi!hi!hi!hi!hi!hi!hi!hi!hi!hi... AA hi!hi!hi!hi!hi!hi!hi!hi!hi!hi... AA hi!hi!hi!hi!hi!hi!hi!hi!hi!hi... AA hi!hi!hi!hi!hi!hi!hi!hi!hi!hi.", "444444444444444444444444444444444444444444true-1.97.4444444444444444444444444444444444444444444                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            ", 424);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test39927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39927");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444AAAA");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444AAAA\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test39928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39928");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("                                        ", "           A");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                        " + "'", str2, "                                        ");
    }

    @Test
    public void test39929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39929");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("true-1.0097.00true-1.0097.00tr", 608);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  true-1.0097.00true-1.0097.00tr" + "'", str2, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  true-1.0097.00true-1.0097.00tr");
    }

    @Test
    public void test39930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39930");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("4444444444444444444444A A A A 444444444444444440TRUE-1.0097.  A    44444444444444444440TRUE-1.0097.     aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa    A", "444444...4444444444........4444444444444444444444444444.");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test39931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39931");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("4444444...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!", 69);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!" + "'", str2, "4444444...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!");
    }

    @Test
    public void test39932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39932");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("a                   TRUE-1.0097.0                       a                                                                                                                                                                                                                                                                                                                                                                                          ", "                                                                                                                                       0AAAA                                                                                                                                  A                                                                                                                                  0AAAA                                                                                                                                      ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test39933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39933");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "                       a4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                       a4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str1, "                       a4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test39934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39934");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("a0a", 671);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                                                              a0a                                                                                                                                                                                                                                                                                                                                              " + "'", str2, "                                                                                                                                                                                                                                                                                                                                              a0a                                                                                                                                                                                                                                                                                                                                              ");
    }

    @Test
    public void test39935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39935");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("ue-1.0097.", "0true-1.00###########################################################################################################################################################################################################################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ue-1.0097." + "'", str2, "ue-1.0097.");
    }

    @Test
    public void test39936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39936");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("AAAAAAAAAAAAAAAAAAAAA100.", '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AAAAAAAAAAAAAAAAAAAAA100." + "'", str2, "AAAAAAAAAAAAAAAAAAAAA100.");
    }

    @Test
    public void test39937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39937");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("A    4444444444444444444444444444444444444444444              4444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test39938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39938");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                               true  ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test39939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39939");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt(".44444444444444444444444444444444a    4", 363);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 363 + "'", int2 == 363);
    }

    @Test
    public void test39940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39940");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(400, 266, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test39941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39941");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("1000    A         A", "i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test39942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39942");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("", 34);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test39943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39943");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("aaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaA", "0true-1.0097.00true-1.0097.00true-1.0097.00tr    a     0true-1.0097.00true-1.0097.00true-1.0097.00tr");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test39944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39944");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                ", 820);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test39945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39945");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("aaaa0.7900.1-eurt0aaaaaaaaaaaaaaaaaaaaaaaaaaa0.7900.1-eurt0A    ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih   A", (double) 252.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 252.0d + "'", double2 == 252.0d);
    }

    @Test
    public void test39946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39946");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                                       rue-1.0097.0", "TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.00...############################################################################");
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "                                                                                                                                                            ", 615, 84);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test39947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39947");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("                        ...ue-1.0097.044444444444444444444444444444444...                        ", "#######################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test39948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39948");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("...44444444444444444444444444444444440true-1.0097", "        HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...         444444444444444444444444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0true-1.0097" + "'", str2, "0true-1.0097");
    }

    @Test
    public void test39949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39949");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test39950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39950");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test39951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39951");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("                                                                                                                                                                                                                                                                                                                                                                                                                                                                     0TRUE-10AAAA00970AAAA0AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", 623, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                                                                                                                                                                                                                                                                                                                                                                                                     0TRUE-10AAAA00970AAAA0AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                                                                                                                                                                                                                                                                                                                                                                                                     0TRUE-10AAAA00970AAAA0AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test39952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39952");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("    A   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    A    ", "4444444..444444444444444440true-1.0097...44444444444444444444444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test39953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39953");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "HI!HI...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test39954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39954");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("att-------ttt-------ttt-------t", "4444444...444444           aaaaaaaaaaa", 363);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "att-------ttt-------ttt-------t" + "'", str3, "att-------ttt-------ttt-------t");
    }

    @Test
    public void test39955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39955");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("0TRUE-1 0097 0", "0a44444444444444444444444444444444444444444440true-1.0097.0a0a44444444444444444444444444444444444444444440true-1.0097.0a0a44444444444444444444444444444444444444444440true-1.0097.0a0a44444444444444444444444444444444444444444440true-1.0097.0a0a44444444444444444444444444444444444444444440true-1.0097.0a0a44444444444444444444444444444444444444444440true-1.0097.0a0a44444444444444444444444444444444444444444440true-1.0097.0a0a44444444444444444444444444444444444444444440true-1.0097.0a0a44444444444444444444444444444444444444444440true-1.0097.0a0a44444444444444444444444...a1414141444444444444444444444444");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0TRUE-1 0097 0" + "'", str3, "0TRUE-1 0097 0");
    }

    @Test
    public void test39956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39956");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("                                                                                                                                                                                                                                             0                                                                                                                          4444444...4444444...4444444...4...                       ", "AAA...", 403);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test39957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39957");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("  A    TRUETRUETRUET");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test39958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39958");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "0 true - 1 .");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0 true - 1 ." + "'", str1, "0 true - 1 .");
    }

    @Test
    public void test39959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39959");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 119L, (double) 73L, 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 119.0d + "'", double3 == 119.0d);
    }

    @Test
    public void test39960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39960");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("aaaaaaaaaaaaaaaaaaaaaaaa0AAAA", "0.7900.1-eurt0", 638, 48);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaa0AAAA0.7900.1-eurt0" + "'", str4, "aaaaaaaaaaaaaaaaaaaaaaaa0AAAA0.7900.1-eurt0");
    }

    @Test
    public void test39961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39961");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("44444444    A     .7900.1-eurt0444444444444444444444444444444444444444444444    A     .7900.1-eurt04444444444444444444    A  .7900.1-eurt04444444444444444444444444444444444444444444", "Hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi", "00.1-eurt00.7900");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "44444444    A     .7900.1-eurt0444444444444444444444444444444444444444444444    A     .7900.1-eurt04444444444444444444    A  .7900.1-eurt04444444444444444444444444444444444444444444" + "'", str3, "44444444    A     .7900.1-eurt0444444444444444444444444444444444444444444444    A     .7900.1-eurt04444444444444444444    A  .7900.1-eurt04444444444444444444444444444444444444444444");
    }

    @Test
    public void test39962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39962");
        char[] charArray1 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh             A     4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...444444", charArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test39963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39963");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "       ...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test39964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39964");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("0TRUE-1.0097.04444444444444444444444444440AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0", "                                                                ...             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                ...             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             " + "'", str2, "                                                                ...             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             ");
    }

    @Test
    public void test39965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39965");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("...44444...true-1.4444444...97.4444444...4444444444444...                  4");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test39966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39966");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("100.0aaaa100100.0aaaa.100.0aaaa0100.0aaaa", "0TRUE-1.04444444...4444444...444", 533);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test39967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39967");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("                                                                                            A    44", 75, 125);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test39968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39968");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "44444444444444444444444444444444444444444AAAAAAAAA...4444444   ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test39969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39969");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("", "                                                          ...####################################..", 546);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test39970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39970");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("                                                  44444444444444444444444444444444444444444444true-1.497.44444444444444444444444444444444444444444444", "0444...44444444444444444444444444444444440TRUE-1.0097...4 ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "true" + "'", str2, "true");
    }

    @Test
    public void test39971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39971");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("A4A4A4A444444444444444444444444a4...", 734, 444);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test39972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39972");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("...44444...true-1.4444444...97.4444444...4444444444444...", 53, 62);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4..." + "'", str3, "4...");
    }

    @Test
    public void test39973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39973");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("44444444444444444444444a444444444444444444444444", 9);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test39974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39974");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("####", "...444444440tr...", 479, 26);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "####...444444440tr..." + "'", str4, "####...444444440tr...");
    }

    @Test
    public void test39975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39975");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "0097.00T");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test39976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39976");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("44444444444444444444444444444444444444444444444444444444444444444444444!44444444444444444444444444444444444444444444444444444444444444444444444!44444444444444444444444444444444444444444444444444444444444444444444444!44444444444444444444444444444444444444444444444444444444444444444444444!44444444444444444444444444444444444444444444444444444444444444444444444!44444444444444444444444444444444444444444444444444444444444444444444444!44444444444444444444444444444444444444444444444444444444444444444444444!44444444444444444444444444444444444444444444444444444444444444444444444!44444444444444444444444444444444444444444444444444444444444444444444444!44444444444444444444444444444444444444444444444444444444444444444444444!", 216, 68);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "44444444444444444444444444444444444444444444444444444444444444444444" + "'", str3, "44444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test39977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39977");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("    A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A     ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "    A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A     " + "'", str1, "    A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A     ");
    }

    @Test
    public void test39978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39978");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("                             00       0                 ", 133);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test39979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39979");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens(".ih!ih!ih!ih!ih!ih!ih!ih!ih!ih AA ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih AA ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih AA ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih AA ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih AA ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih AA ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih AA ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih AA ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih AA ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih AA ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih AA ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih AA ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih AA ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih AA ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih AA ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih AA ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih AA ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih AA ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih AA ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih AA ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih AA ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih A", "...40true-1.0097.04444444444444444444444444444444444...");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test39980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39980");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("aaa...", 136);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 136 + "'", int2 == 136);
    }

    @Test
    public void test39981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39981");
        float[] floatArray4 = new float[] { 100, (byte) -1, (short) 1, (byte) -1 };
        float float5 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        float float6 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        float float7 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        float float8 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        float float9 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        float float10 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        float float11 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray4), "[100.0, -1.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + (-1.0f) + "'", float6 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 100.0f + "'", float7 == 100.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + (-1.0f) + "'", float8 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + (-1.0f) + "'", float9 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 100.0f + "'", float10 == 100.0f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 100.0f + "'", float11 == 100.0f);
    }

    @Test
    public void test39982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39982");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("              ", "                                      100.0                                                     aaaa");
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("A44444", "true4-4449744", 550);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray7, "                                                                                     a   hi!hi!...");
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("        a    ...IH!IH!IH!IH!IH!IH!IH!IH!IH!IH   a    ", strArray3, strArray7);
        java.lang.String[] strArray11 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "A44444" + "'", str9, "A44444");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "        a    ...IH!IH!IH!IH!IH!IH!IH!IH!IH!IH   a    " + "'", str10, "        a    ...IH!IH!IH!IH!IH!IH!IH!IH!IH!IH   a    ");
        org.junit.Assert.assertNotNull(strArray11);
    }

    @Test
    public void test39983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39983");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("aA44444A44444A44444A44444A44444A44444A44444A44444A44444100.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "100.044444444444444444444444444444444444444444444444444444aaa", 27);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test39984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39984");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                     aaaa0aaaaa                    ", " 4...7900.1-EURT04444444444444444444444444444444444...4440", "...                                                               ...A A ", 170);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                     aaaa0aaaaa                    " + "'", str4, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                     aaaa0aaaaa                    ");
    }

    @Test
    public void test39985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39985");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("HI...I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI......I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI......I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI......I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI......I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI......I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI......I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI......I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI......I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI....!", "######################################################################################################444444444444444440true-1.0097...444444444444444444444444                                                                                        100.", "                                                                             A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A                                                                             ");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test39986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39986");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "######################################044444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test39987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39987");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("0true-1.0097.00true-1.0097.00true-1.0097.00tr A 0true-1.0097.00true-1.0097.00true-1.0097.00tr A 0true-1.0097.00true-1.0097.00true-1.0097.00tr A 0true-1.0097.00true-1.0097.00true-1.0097.00tr A 0true-1.0097.00true-1.00                                               A44444                                               0true-1.0097.00true-1.0097.00true-1.0097.00tr A 0true-1.0097.00true-1.0097.00true-1.0097.00tr A 0true-1.0097.00true-1.0097.00true-1.0097.00tr A 0true-1.0097.00true-1.0097.00true-1.0097.00tr A 0true-1.0097.00true-1.009", "                                                                                                       0                                                                                                                                 ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0true-1.0097.00true-1.0097.00true-1.0097.00tr A 0true-1.0097.00true-1.0097.00true-1.0097.00tr A 0true-1.0097.00true-1.0097.00true-1.0097.00tr A 0true-1.0097.00true-1.0097.00true-1.0097.00tr A 0true-1.0097.00true-1.00                                               A44444                                               0true-1.0097.00true-1.0097.00true-1.0097.00tr A 0true-1.0097.00true-1.0097.00true-1.0097.00tr A 0true-1.0097.00true-1.0097.00true-1.0097.00tr A 0true-1.0097.00true-1.0097.00true-1.0097.00tr A 0true-1.0097.00true-1.009" + "'", str2, "0true-1.0097.00true-1.0097.00true-1.0097.00tr A 0true-1.0097.00true-1.0097.00true-1.0097.00tr A 0true-1.0097.00true-1.0097.00true-1.0097.00tr A 0true-1.0097.00true-1.0097.00true-1.0097.00tr A 0true-1.0097.00true-1.00                                               A44444                                               0true-1.0097.00true-1.0097.00true-1.0097.00tr A 0true-1.0097.00true-1.0097.00true-1.0097.00tr A 0true-1.0097.00true-1.0097.00true-1.0097.00tr A 0true-1.0097.00true-1.0097.00true-1.0097.00tr A 0true-1.0097.00true-1.009");
    }

    @Test
    public void test39988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39988");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("100.0#####100.0###", "HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH             a     ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "100.0#####100.0###" + "'", str2, "100.0#####100.0###");
    }

    @Test
    public void test39989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39989");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("###################################################################################################################################################################################################################################################################################################################################################################################################...44444444444444444444444444444444444444444444444444444...###################################################################################################################################################################################################################################################################################################################################################################################################", "     A44444      Aaaaaaaaaaa4444444...4444444...4444444...4");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test39990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39990");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse(".############################################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "############################################." + "'", str1, "############################################.");
    }

    @Test
    public void test39991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39991");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "e-1.0097.00true-1.0097.00true-1.0097.00tr    a     0true-1.0097.00true-1.0097.00true-1.0097.00tr");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test39992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39992");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "...t0444444444444444444444444444.....#...#4#a#");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test39993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39993");
        int[] intArray3 = new int[] { 267, (byte) -1, 267 };
        int int4 = org.apache.commons.lang3.math.NumberUtils.max(intArray3);
        int int5 = org.apache.commons.lang3.math.NumberUtils.min(intArray3);
        int int6 = org.apache.commons.lang3.math.NumberUtils.min(intArray3);
        int int7 = org.apache.commons.lang3.math.NumberUtils.min(intArray3);
        int int8 = org.apache.commons.lang3.math.NumberUtils.max(intArray3);
        int int9 = org.apache.commons.lang3.math.NumberUtils.max(intArray3);
        int int10 = org.apache.commons.lang3.math.NumberUtils.min(intArray3);
        int int11 = org.apache.commons.lang3.math.NumberUtils.max(intArray3);
        int int12 = org.apache.commons.lang3.math.NumberUtils.max(intArray3);
        int int13 = org.apache.commons.lang3.math.NumberUtils.max(intArray3);
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
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 267 + "'", int12 == 267);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 267 + "'", int13 == 267);
    }

    @Test
    public void test39994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39994");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("                                                                                                                                                                      4444444444444444444444444444444444444444444444444444444444", (short) 100);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 100 + "'", short2 == (short) 100);
    }

    @Test
    public void test39995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39995");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("444444444444444444444444444444444444444444444444444444444444444444444444...7900.1-EURT04444444444444444444444444444444444...444", (short) 10);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 10 + "'", short2 == (short) 10);
    }

    @Test
    public void test39996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39996");
        short[] shortArray1 = new short[] { (byte) -1 };
        short short2 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short3 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        short short4 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short5 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short6 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short7 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        short short8 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        short short9 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        short short10 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short11 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short12 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short13 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short14 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
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
    }

    @Test
    public void test39997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39997");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) (byte) 100, (short) (byte) 1, (short) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test39998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39998");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("4444444...");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "##100.0###");
        int int6 = org.apache.commons.lang3.StringUtils.indexOfAny("4444444...", strArray3);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.concatWith("                                                                                                                                                                                                                                                                                                                                                                                a   hi!hi!...                                                                                                                                                                                                                                                                                            ", (java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "4444444..." + "'", str7, "4444444...");
    }

    @Test
    public void test39999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39999");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(541, 68, 63);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 541 + "'", int3 == 541);
    }

    @Test
    public void test40000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test40000");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("RT00.7900.1-EURT00.7900.1-EURT00.7900.1-EURT0ART00.7900.1-EURT00.7900.1-EURT00.7900.1-EURT0");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "RT00.7900.1-EURT00.7900.1-EURT00.7900.1-EURT0ART00.7900.1-EURT00.7900.1-EURT00.7900.1-EURT0" + "'", str1, "RT00.7900.1-EURT00.7900.1-EURT00.7900.1-EURT0ART00.7900.1-EURT00.7900.1-EURT00.7900.1-EURT0");
    }
}

