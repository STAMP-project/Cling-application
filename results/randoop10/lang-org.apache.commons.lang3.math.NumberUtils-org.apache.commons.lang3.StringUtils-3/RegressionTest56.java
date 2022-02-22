import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest56 {

    public static boolean debug = false;

    @Test
    public void test28001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28001");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "#######04true4-414.400974.4004true4-414.400974.4004true4-414.400974.4004tr4 4A4 #######", "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444 a4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 8 + "'", int2 == 8);
    }

    @Test
    public void test28002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28002");
        double[] doubleArray2 = new double[] { 172, 145.0d };
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[172.0, 145.0]");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 172.0d + "'", double3 == 172.0d);
    }

    @Test
    public void test28003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28003");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "AAAAAAaaaaaaaaAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test28004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28004");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                        0.0010.0hi                                                                                                                                                                                                                                                                                                                                         ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test28005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28005");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 127L, (double) 47, (double) 265);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 47.0d + "'", double3 == 47.0d);
    }

    @Test
    public void test28006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28006");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("                                              ...44444444444444444444444444444444440TRUE-1.0097...                                                                 ", "A.79--.10eurt-111111111111111111111111111111111111111111111A.79--.10eurt-1111111111111111111A.79--.10eurt-1111111111111111111111111111111111111111111");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test28007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28007");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test28008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28008");
        char[] charArray6 = new char[] { '4', '4', ' ' };
        int int7 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "0", charArray6);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsAny("                                                                                     0", charArray6);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "0AAAA", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "44 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "44 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[4, 4,  ]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test28009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28009");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("a44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444", "...             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test28010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28010");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("                                                                                                                   ", "true-97");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test28011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28011");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("RT00.7900.1-EURT00.7900.1-EURT00.7900.1-EURT0     A    RT00.7900.1-EURT00.7900.1-EURT00.7900.1-E", "A    ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "RT00.7900.1-EURT00.7900.1-EURT00.7900.1-E" + "'", str2, "RT00.7900.1-EURT00.7900.1-EURT00.7900.1-E");
    }

    @Test
    public void test28012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28012");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "RT00.7900.1-EURT00.7900.1-EURT00.7900.1-E");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test28013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28013");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("4444444...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  ", "0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.00..");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test28014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28014");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("    A     ");
        boolean boolean3 = org.apache.commons.lang3.StringUtils.startsWithAny("                     aaaa0aaaaa                     ...I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!", strArray2);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "A" + "'", str4, "A");
    }

    @Test
    public void test28015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28015");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) 0, (short) -1, (short) (byte) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test28016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28016");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("aaaaaaaaaaaaaaaaaaaA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    A0true-1.0097.0aaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1.0097.0aaaaaaaaaaaaaaaaaaaaaaa", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    A0true-1.0097.0aaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1.0097.0aaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "aaaaaaaaaaaaaaaaaaaA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    A0true-1.0097.0aaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1.0097.0aaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test28017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28017");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 630, (float) 618, (float) 468);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 468.0f + "'", float3 == 468.0f);
    }

    @Test
    public void test28018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28018");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("                                                       ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test28019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28019");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("4444444444444444444444...444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4444444444444444444444...444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str1, "4444444444444444444444...444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test28020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28020");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("4444444444444444444444444444100.044444444444444444444444444444444444444444444444444444aaaa", "####");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444444444444444444444444100.044444444444444444444444444444444444444444444444444444aaaa" + "'", str2, "4444444444444444444444444444100.044444444444444444444444444444444444444444444444444444aaaa");
    }

    @Test
    public void test28021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28021");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("    a   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    a    ", 25, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "    a   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    a    " + "'", str3, "    a   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    a    ");
    }

    @Test
    public void test28022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28022");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "100.0                ...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "100.0                ..." + "'", str1, "100.0                ...");
    }

    @Test
    public void test28023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28023");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "I!HI!HI!HI!HI!HI!HI!HI!HI!HI", "##100.0###");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test28024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28024");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444A   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    A0097...###################################################################################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444A   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    A0097...###################################################################################" + "'", str1, "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444A   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    A0097...###################################################################################");
    }

    @Test
    public void test28025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28025");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("aaaaaaaaaaaaaaaaaaaaaaaaaaaaa4true-1.4497.4444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test28026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28026");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "                                                                                                                                                                              Atrue-1.AA97.AAtrue-1.AA97.AAtrue-1.AA97.AAtr A Atrue-1.AA97.AAtrue-1.AA97.AAtrue-1.AA97.AAtr");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test28027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28027");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("hihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihi", "44444444444444444444444444444444444444444440.7900.1-EURT04444444444444444444444444444444444444444444.790.7900.1-EURT04444444444444444444444444444444444444444444.1-EURT0.7900.1-EURT044444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "aaaaaaaaa");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test28028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28028");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("A00       000       000       0", "aaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test28029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28029");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("44444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "44444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097." + "'", str1, "44444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.");
    }

    @Test
    public void test28030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28030");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 79L, 648.0f, (float) 69);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 69.0f + "'", float3 == 69.0f);
    }

    @Test
    public void test28031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28031");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min((byte) 0, (byte) 100, (byte) 10);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
    }

    @Test
    public void test28032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28032");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "100.0                                                     aaaa..");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test28033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28033");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("0097...40097...4");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: multiple points");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test28034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28034");
        float[] floatArray4 = new float[] { 100, (byte) -1, (short) 1, (byte) -1 };
        float float5 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        float float6 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        float float7 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        float float8 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        float float9 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        float float10 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        float float11 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        float float12 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        float float13 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
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
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 100.0f + "'", float13 == 100.0f);
    }

    @Test
    public void test28035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28035");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("  aa     aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               ", "aaaa44........4444444444444444444444444444444.....4444444444444444444444444444...4444444444........4444444444444444444444444444...4444444444........4444444444444444444444444444.aaaa", 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test28036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28036");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(55, 47, 73);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 73 + "'", int3 == 73);
    }

    @Test
    public void test28037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28037");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("...                                                               ...", 969, 444);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test28038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28038");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("A         A         A         A         A       Aaaaaaaaa A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test28039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28039");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("00       0", "                                                   ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test28040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28040");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "                       #a#44444444444444444444#...#444444444444444444444444444444444444444444444                       #a#44444444444444444444#...#444444444444444444444444444444444444444444444                       #a#44444444444444444444#...#444444444444444444444444444444444444444444444                     444444444444444444444444444444444444444444                       #a#44444444444444444444#...#444444444444444444444444444444444444444444444                       #a#44444444444444444444#...#444444444444444444444444444444444444444444444                       #a#44444444444444444444#...#444444444444444444444444444444444444444444444                     ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test28041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28041");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("...44444444444444444444440TRUE-1.0440true-1.0097.0aaaa0aaaaa...44444444444444444444440TRUE-1.044", "a    44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...44444444444444444444440TRUE-1.0440true-1.0097.0aaaa0aaaaa...44444444444444444444440TRUE-1.044" + "'", str2, "...44444444444444444444440TRUE-1.0440true-1.0097.0aaaa0aaaaa...44444444444444444444440TRUE-1.044");
    }

    @Test
    public void test28042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28042");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa     ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test28043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28043");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("41004.404                                                444444A444444444444444444444444A444444444444444444444444A444444444444444444444444A444444444444444444444444A444444444444444444444444A444444444444444444444444A444444444444444444444444A444444444444444444444444A444444444444444444444444A444444444444444444444444A444444444444444444444444A444444444444444444444444A444444444444444444444444A444444444444444444444444A444444444444444444444444A444444444444444444444444A444444444444444444444444A4444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "41004.404                                                444444A444444444444444444444444A444444444444444444444444A444444444444444444444444A444444444444444444444444A444444444444444444444444A444444444444444444444444A444444444444444444444444A444444444444444444444444A444444444444444444444444A444444444444444444444444A444444444444444444444444A444444444444444444444444A444444444444444444444444A444444444444444444444444A444444444444444444444444A444444444444444444444444A444444444444444444444444A4444444444444444444" + "'", str1, "41004.404                                                444444A444444444444444444444444A444444444444444444444444A444444444444444444444444A444444444444444444444444A444444444444444444444444A444444444444444444444444A444444444444444444444444A444444444444444444444444A444444444444444444444444A444444444444444444444444A444444444444444444444444A444444444444444444444444A444444444444444444444444A444444444444444444444444A444444444444444444444444A444444444444444444444444A444444444444444444444444A4444444444444444444");
    }

    @Test
    public void test28044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28044");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 542, (double) 181.0f, (double) 850.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 181.0d + "'", double3 == 181.0d);
    }

    @Test
    public void test28045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28045");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "0true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test28046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28046");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("A    ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih   A");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test28047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28047");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("a444444444444444444444444", 136);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "a444444444444444444444444                                                                                                               " + "'", str2, "a444444444444444444444444                                                                                                               ");
    }

    @Test
    public void test28048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28048");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test28049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28049");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad(".7900.1-eurt04444444444444444444444444444444444444444444 A .7900.1-eurt04444444444444444444 A .7900.1-eurt0444444444444444444444444444444444444444444444 A", 170);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ".7900.1-eurt04444444444444444444444444444444444444444444 A .7900.1-eurt04444444444444444444 A .7900.1-eurt0444444444444444444444444444444444444444444444 A                " + "'", str2, ".7900.1-eurt04444444444444444444444444444444444444444444 A .7900.1-eurt04444444444444444444 A .7900.1-eurt0444444444444444444444444444444444444444444444 A                ");
    }

    @Test
    public void test28050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28050");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(123.0f, (float) 253L, (float) 98L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 253.0f + "'", float3 == 253.0f);
    }

    @Test
    public void test28051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28051");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("-1.0097.04444444444444444444444444444444444444444444", "44444444HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...4444444444444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test28052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28052");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("0444...44444444444444444444444444444444440TRUE-1.0097...4", (float) 9);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 9.0f + "'", float2 == 9.0f);
    }

    @Test
    public void test28053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28053");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                     aaaa0aaaaa                     4");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                     aaaa0aaaaa                     4" + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                     aaaa0aaaaa                     4");
    }

    @Test
    public void test28054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28054");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "...         aaaa0aaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test28055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28055");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("0TRUE-1.0097.04aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444", 80, 46);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0TRUE-1.0097.04aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444" + "'", str4, "0TRUE-1.0097.04aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444");
    }

    @Test
    public void test28056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28056");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                0true-1.0097.044444444444444444444444444..", "...t0444444444444444444444444444...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test28057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28057");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("..44440TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR4444a444HI HI HI HI HI HI HI HI HI HI...4444a44444444                                                                                                                                                                   ", "Aaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaAaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaAaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaAaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaAaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaAaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaAaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaAaaaaaaaaaa4444444...4444444...4444444..A   hi!hi!hi!haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test28058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28058");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("4A4 4rt4004.479004.414-4eurt4004.47444444444444444444444444444444444444444444444444444 4A4 4rt4004.479004.414-4eurt4004.47                                                                                    ", '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "A rt00.7900.1-eurt00.7 A rt00.7900.1-eurt00.7                                                                                    " + "'", str2, "A rt00.7900.1-eurt00.7 A rt00.7900.1-eurt00.7                                                                                    ");
    }

    @Test
    public void test28059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28059");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("0true-1.0097.  a    0true-1.0097.     a    0true-1.0097.     a    0true-1.0097.     a    0true-1.0097.     a    0true-1.0097.     a    0true-1.0097.     a    0true-1.0097.     a    0true-1.0097.     a    0true-1.0097                 ...                                                     ", 102);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test28060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28060");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("Aaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaa                                                                                             ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Aaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaa" + "'", str1, "Aaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaa");
    }

    @Test
    public void test28061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28061");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("0097..###############################################################################################################################################", "                   AAAAAAAAAA                    ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test28062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28062");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("                                                                                                                                                                                                                                                            ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test28063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28063");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("A rt00.7900.1-eurt00.7 A rt00.7900.1-eurt00.7                                                                                    ", "...7.044444444444444444444444444..");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test28064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28064");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("                                                                                                                                                                                            ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                                                                                                                           " + "'", str1, "                                                                                                                                                                                           ");
    }

    @Test
    public void test28065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28065");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(655, 744, 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 744 + "'", int3 == 744);
    }

    @Test
    public void test28066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28066");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.00...############################################################################", 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test28067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28067");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("A   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    A");
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, '4', 266, (int) (short) 1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test28068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28068");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                                                                                                                                                                                                                    0true-1.0097.0444444444444444444444444444", "0       000       00790       000       000       00-0       00EURT0       00", 16);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test28069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28069");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("4444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4444" + "'", str1, "4444");
    }

    @Test
    public void test28070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28070");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("44444444444444444444444444444444444444444440TRUE-1.0097.     a    4444444444444444444444444444444444444444444440TRUE-1.0097.     a    4444444444444444444444444444444444444444444440TRUE-1.0097.     a    4444444444444444444444444444444444444444444440TRUE-1.0097.     a    4444444444444444444444444444444444444444444440TRUE-1.0097.     a    4444444444444444444444444444444444444444444440TRUE-1.0097.     a    4444444444444444444444444444444444444444444440TRUE-1.0097.     a    4444444444444444444444444444444444444444444440TRUE-1.0097.     a    4444444444444444444444444444444444444444444440TRUE-1.0097.     a    4444444444444444444444444444444444444444444440TRUE-1.0097", "44444444444e-1.0097.00true-1.0097.00true-1.0097.00tr    a     0true-1.0097.00true-1.0097.00true-1.0097.00tr", 37);
        java.lang.Class<?> wildcardClass4 = strArray3.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test28071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28071");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("4444444444444444444444444444444444444444444 true - 1 . 97 . 4444444444444444444444444444444444444444444true4444444444444444444444444444444444444444444 true - 1 . 97 . 4444444444444444444444444444444444444444444-4444444444444444444444444444444444444444444 true - 1 . 97 . 44444444444444444444444444444444444444444444444444444444444444444444444444444444444444 true - 1 . 97 . 44444444444444444444444444444444444444444444444444444444444444444444444444444444444444 true - 1 . 97 . 4444444444444444444444444444444444444444444974444444444444444444444444444444444444444444 true - 1 . 97 . 44444444444444444444444444444444444444444444444444444444444444444444444444444444444444 true - 1 . 97 . 4444444444444444444444444444444444444444444", "####################################...####################################...####################################...####################################...                                     100.0                                                     aaaa                                     ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test28072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28072");
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
        double double16 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        double double17 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
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
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-1.0d) + "'", double16 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 35.0d + "'", double17 == 35.0d);
    }

    @Test
    public void test28073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28073");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("true-1.  97", "4444444..444444444444444440T", "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!", 59);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "true-1.  97" + "'", str4, "true-1.  97");
    }

    @Test
    public void test28074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28074");
        char[] charArray1 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "4444444444444444444444444444444444444444444 true-1. 97. 4444444444444444444444444444444444444444444", charArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test28075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28075");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        ...44444444444444444444444444444444440true-1.0097...44444", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        ...44444444444444444444444444444444440true-1.0097...44444" + "'", str2, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        ...44444444444444444444444444444444440true-1.0097...44444");
    }

    @Test
    public void test28076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28076");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("", "", "44444444444444444444...40004000400040004000400040004000400040004000400040004000400040004000400040004000400040004000400040004000400040004000400040004000400040004000400040004000400040004000400040004000400040004000400040004000400040004000400040004000400040004000400040004000400040004000400040004000400040004000400040004000400040004000400040004000400040004000400040004000400040004000400040004000400040004000400040004000400040004000400040004000400040004000400040004000400040004000400040004000400040004000400040004000400040004000400040004000400040004000400040004000400040004000400040004000400040004000400040004000400040004000400040004000400040004000400040004000400040004");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test28077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28077");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("0TRUE-1.0", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                               TRUE  ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test28078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28078");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("                                                                                                                     0                                                                                                                                 ", "4444444##############4true-1.4497.4444", "044444444444444444444444444                                                                                    ", 441);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "                                                                                                                     0                                                                                                                                 " + "'", str4, "                                                                                                                     0                                                                                                                                 ");
    }

    @Test
    public void test28079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28079");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("                   AAAAAAAAAA                    ", "...4444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097....");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                   AAAAAAAAAA                    " + "'", str2, "                   AAAAAAAAAA                    ");
    }

    @Test
    public void test28080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28080");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("###    a   HI!HI");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test28081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28081");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("", 182, 664);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test28082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28082");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("..HI!HI!HI!HI!HI!HI!HI!HI!HI!HI.....");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test28083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28083");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("100.0 AAAA0TRUE-1.0097.044444444444444444444444", "TRUETRUE                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test28084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28084");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaatrue-1.a97.aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test28085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28085");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "                                                                                                  ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                                  " + "'", str1, "                                                                                                  ");
    }

    @Test
    public void test28086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28086");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "444444444444444444444444444444444444444444444444444" + "'", str1, "444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test28087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28087");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "0a44444444444444444444444444444444444444444440true-1.0097.0a0a44444444444444444444444444444444444444444440true-1.0097.0a0a44444444444444444444444444444444444444444440true-1.0097.0a0a44444444444444444444444444444444444444444440true-1.0097.0a0a44444444444444444444444444444444444444444440true-1.0097.0a0a44444444444444444444444444444444444444444440true-1.0097.0a0a44444444444444444444444444444444444444444440true-1.0097.0a0a44444444444444444444444444444444444444444440true-1.0097.0a0a44444444444444444444444444444444444444444440true-1.0097.0a0a44444444444444444444444...a");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test28088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28088");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("4444444444444444444444444444444444444444440a.a7900a.a1a-aeurta04444444444444444444444444444444444444444440a.a7900a.a1a-aeurta04444444444444444444444444444444444444444440a.a7900a.a1a-aeurta04444444444444444444444444444444444444444440a.a7900a.a1a-aeurta04444444444444444444444444444444444444444440a.a7900a.a1a-aeurta04444444444444444444444444444444444444444440a.a7900a.a1a-aeurta04444444444444444444444444444444444444444440a.a7900a.a1a-aeurta04444444444444444444444444444444444444444440a.a7900a.a1a-aeurta04444444444444444444444444444444444444444440a.a7900a.a1a-aeurta04444444444444444444444444444444444444444440a.a7900a.a1a-aeurta0");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test28089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28089");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("", "...0TRUE-1.00TRUE-1.00TRUE-1.00TRUE-1.00TRUE-1.0");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test28090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28090");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("4444444444444444444444444444444444440true-1.0097.4444444444444444444444444444444444444444444440true-1.0097.4444444444444444444444444444444444444444444440true-1.0097.4444444444444444444444444444444444444444444440true-1.0097.4444444444444444444444444444    a   HI!HI!..                                                                                                                                                                                                                                                                                                                                                                                                                 ", "A4A4A4A444444444444444444444444a44444444444444444444444...aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444444444444444444444444444444440true-1.0097.4444444444444444444444444444444444444444444440true-1.0097.4444444444444444444444444444444444444444444440true-1.0097.4444444444444444444444444444444444444444444440true-1.0097.4444444444444444444444444444    a   HI!HI!..                                                                                                                                                                                                                                                                                                                                                                                                                 " + "'", str2, "4444444444444444444444444444444444440true-1.0097.4444444444444444444444444444444444444444444440true-1.0097.4444444444444444444444444444444444444444444440true-1.0097.4444444444444444444444444444444444444444444440true-1.0097.4444444444444444444444444444    a   HI!HI!..                                                                                                                                                                                                                                                                                                                                                                                                                 ");
    }

    @Test
    public void test28091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28091");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("#######################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!", "0true-1.0097.00true-1.0097.00true-1.0097.00tr A 0true-1.0097.00true-1.0097.00true-1.0097.00tr");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test28092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28092");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("...t0444444444444444444444444444.....#...#...", "4444444444444444444444444444444444444444444TRUE-1.97.4444444444444444444444444444444444444444444", "                                                                                            0aaa");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...t0444444444444444444444444444.....#...#..." + "'", str3, "...t0444444444444444444444444444.....#...#...");
    }

    @Test
    public void test28093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28093");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaA    ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih   Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaA    ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih   Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaA    ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih   Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test28094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28094");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("E-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR    A     0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test28095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28095");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT044444444444444444444444444444444444444444444444444444444444444444444444444444444!hi!h!hi!h44444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT04444444444444444444444444444444444444444444             ", "0097...40097...4", 243, 668);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT044444444444444444444444444444444444444444444444444444444444444444444444444444444!hi!h!hi!h44444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0440097...40097...4444444444444444444444444444444444444444444444444444444444440.7900.1-EURT04444444444444444444444444444444444444444444             " + "'", str4, "444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT044444444444444444444444444444444444444444444444444444444444444444444444444444444!hi!h!hi!h44444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0440097...40097...4444444444444444444444444444444444444444444444444444444444440.7900.1-EURT04444444444444444444444444444444444444444444             ");
    }

    @Test
    public void test28096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28096");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "444444444444444444444444...44444", (java.lang.CharSequence) "0true-1 0097 044444444444444444444444444 4");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test28097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28097");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "a         a                 44444444444444444444444444444444444444444444444444                                      100.0                                                      true                                      100.0                                                      4444444                                      100.0                                                      4444444                                      100.0                                                      4444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test28098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28098");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "ahi!hi!...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test28099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28099");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfBlank((java.lang.CharSequence) "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", (java.lang.CharSequence) "0TRUE-1.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", charSequence2, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test28100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28100");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAaaaaaaaaaaaaaaaaaaaa000true000-00000000097000000");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAaaaaaaaaaaaaaaaaaaaa000true000-00000000097000000" + "'", str1, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAaaaaaaaaaaaaaaaaaaaa000true000-00000000097000000");
    }

    @Test
    public void test28101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28101");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("44444444444444444444444444444444444444444444441004.4044444444444444444444444444444444444444444444444", "    a   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    a    ", 97);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test28102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28102");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("00.0                                                     AAAA0TRUE-1.0097.044444444444444444444444                                                                                                                                       0AAAA                                                                                                                                  A                                                                        ", 84);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 62 + "'", int2 == 62);
    }

    @Test
    public void test28103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28103");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "... a ...IH!IH!IH!IH!IH!IH!IH!IH!IH!IH a a ...IH!IH!IH!IH!IH!IH!IH!IH!IH!IH a");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test28104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28104");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("aaaa0aaaaa0aaaa0aaaaa0aaaa0aaaaa0aaaa0aaaaa0aaaa0aaaaa0aaaa0aaaaa0aaaa0aaaaa0aaaa0aaaaa0aaaa0aaaaa", "444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaa0aaaaa0aaaa0aaaaa0aaaa0aaaaa0aaaa0aaaaa0aaaa0aaaaa0aaaa0aaaaa0aaaa0aaaaa0aaaa0aaaaa0aaaa0aaaaa" + "'", str2, "aaaa0aaaaa0aaaa0aaaaa0aaaa0aaaaa0aaaa0aaaaa0aaaa0aaaaa0aaaa0aaaaa0aaaa0aaaaa0aaaa0aaaaa0aaaa0aaaaa");
    }

    @Test
    public void test28105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28105");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT04444444444444444444444444444444444444444444", "    ...44444444444444444444444444444444440true-1.0097...A...444444444          aaaatrue-1.0097...A...44444444444444444444444444444444440true-1.0097...         ", "444444444444444444444444...44444444444444444444444444444444440true-1.0097...444444444444444444444444", 28);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT04444444444444444444444444444444444444444444" + "'", str4, "444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT04444444444444444444444444444444444444444444");
    }

    @Test
    public void test28106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28106");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("                       a44444444444444444444...4444                       a44444444444444444444...444");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test28107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28107");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test28108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28108");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("###    a   HI!HI!.");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"###    a \"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test28109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28109");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("0aaaaa    ", "                                                                                    444...44444444444444444444444444444444440TRUE-1.0097...44                                        ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test28110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28110");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "                                                                    44444444444444444440true-1.009");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test28111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28111");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "!hi!hiTTTTTTi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test28112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28112");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("                     AAAAAA0AAAAAAA              ", "0097      a   HI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAA       ...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                     AAAAAA0AAAAAAA              " + "'", str2, "                     AAAAAA0AAAAAAA              ");
    }

    @Test
    public void test28113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28113");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("4444400       0444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test28114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28114");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("0true-1.0097.044444444444444444444444444 ", 87, 445);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test28115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28115");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444...", (java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444444444444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaAaAaAaA.79aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaAaAaAaA.1-eurtaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaAaAaAaA4444444444444444444444444444444444444440.7900.1-eurt04444444444444444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test28116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28116");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "00       000       000       00A", "0true-1.0097.00true-1.0097.0");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test28117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28117");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 30, (float) 3L, (float) 175);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 3.0f + "'", float3 == 3.0f);
    }

    @Test
    public void test28118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28118");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("    A         A         A         A         A       Aaaaaaaaa A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A    ", "    A   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    ");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test28119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28119");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("                                     100.0                                                     AAAA                                     ", 'a', '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                     100.0                                                     AAAA                                     " + "'", str3, "                                     100.0                                                     AAAA                                     ");
    }

    @Test
    public void test28120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28120");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("a0000000000aaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "a0000000000aaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "a0000000000aaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test28121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28121");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("00true-1.0097.00trA0true-1.0097.00true-1.0097.00true-1.0097.00tr", "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!                            100.0                                                     AAAAHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H", 149);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test28122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28122");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("0true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444", 101, 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test28123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28123");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("44444444444444...7900.1-eurt044444", "      00");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test28124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28124");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("0true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.00...", "aaaaaaaaa.", 51);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0true-1009700true-1009700true-1009700true-1009700true-1009700true-1009700true-100" + "'", str4, "0true-1009700true-1009700true-1009700true-1009700true-1009700true-1009700true-100");
    }

    @Test
    public void test28125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28125");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                       44444444444444444444...4444                       44444444444444444444...4444", "0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.00..", 83);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test28126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28126");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("4444444444444444444444444444444444444444444444444444444444444444444444   !    ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4444444444444444444444444444444444444444444444444444444444444444444444   !    " + "'", str1, "4444444444444444444444444444444444444444444444444444444444444444444444   !    ");
    }

    @Test
    public void test28127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28127");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("    a   HI!HI!..    a   HI!HI!..    a   HI!HI!..", "rt00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt0aaaaaaaaaart00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt0");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test28128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28128");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("0true-1.0097.04444444444444444444444444444444444444444440true-1.0097.044444444444444444444444444", "                                                                                                aaaa");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!" };
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.stripAll(strArray7);
        java.lang.String[] strArray11 = org.apache.commons.lang3.StringUtils.split("44444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444", '4');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.replaceEach("100.0", strArray8, strArray11);
        java.lang.String[] strArray13 = org.apache.commons.lang3.StringUtils.stripAll(strArray8);
        int int14 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("     A    44", strArray8);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray8);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.replaceEach("                                         AAAA0AAAA", strArray3, strArray8);
        java.lang.String[] strArray18 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, ".....aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                     aaaa0aaaaa                     ...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                     aaaa0aaaaa                     ...");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "100.0" + "'", str12, "100.0");
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "                                         AAAA0AAAA" + "'", str16, "                                         AAAA0AAAA");
        org.junit.Assert.assertNotNull(strArray18);
    }

    @Test
    public void test28129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28129");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi", (int) (short) 100, "true-97");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "true-97true-97true-97true-97true-97true-97true-97true-97true-97trhi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi" + "'", str3, "true-97true-97true-97true-97true-97true-97true-97true-97true-97trhi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi");
    }

    @Test
    public void test28130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28130");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("...444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...444444" + "'", str1, "...444444");
    }

    @Test
    public void test28131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28131");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("                                          ", '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                          " + "'", str2, "                                          ");
    }

    @Test
    public void test28132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28132");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("AAAA0AAAAAAAAA0AAAAAAAAA0AAA...0...", 37);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AAAA0AAAAAAAAA0AAAAAAAAA0AAA...0..." + "'", str2, "AAAA0AAAAAAAAA0AAAAAAAAA0AAA...0...");
    }

    @Test
    public void test28133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28133");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("A rt00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt0", "444444444444444440true-1.0097...444444444444444444444444                                                                                        100.444444444444444440true-1.0097...444444444444444444444444                                                                                        100.444444444444444440true-1.0097...444444444444444444444444                                                                                        100.444444444444444440true-1.0097...444444444444444444444444                                     ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "A rt00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt0" + "'", str2, "A rt00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt0");
    }

    @Test
    public void test28134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28134");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) (byte) 100, (long) 84, 841L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 841L + "'", long3 == 841L);
    }

    @Test
    public void test28135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28135");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("                                                                                     4444444444444444444444444444444444444444444atrue-1.a97.a4444444444444444444444444444444444444444444                                                                                     ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test28136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28136");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("A    4444444444444444444444444444444444444444444440true-1.0097.     A    44444444444444444444A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A    ", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "A    4444444444444444444444444444444444444444444440true-1.0097.     A    44444444444444444444A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A    " + "'", str2, "A    4444444444444444444444444444444444444444444440true-1.0097.     A    44444444444444444444A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A    ");
    }

    @Test
    public void test28137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28137");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("4000");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray2);
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("", "444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0true-1.44444444444444444444444444444444444444444440true-1.0097.097.44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444", 0);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.endsWithAny("0true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444", strArray9);
        int int11 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("tr...", strArray9);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.replaceEach("                100.0aaaa                 ", strArray2, strArray9);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4000" + "'", str3, "4000");
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "                100.0aaaa                 " + "'", str12, "                100.0aaaa                 ");
    }

    @Test
    public void test28138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28138");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfBlank("UE-1.0097...44                                        ", "0aaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UE-1.0097...44                                        " + "'", str2, "UE-1.0097...44                                        ");
    }

    @Test
    public void test28139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28139");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("true-97", "aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...", "                                                                                                                                                                                                                        4444a44444                                                                                                                                                                                                       44444444444444444444444444444444444444444444444444...true-1.4444444...97.4444444...444444444444444444444444444444444444444444");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test28140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28140");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("...                     4444444444444444444444444444444444444444444TRUE-1.97.4444444444444444444444444444444444444444444444444444444444444444444444444444444444444TRUE-1.97.4444444444444444444444444444444444444444444                                                   ", "                                                     ", "                                                                                                                                                                                                                                           ...A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A...");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...                     4444444444444444444444444444444444444444444TRUE-1.97.4444444444444444444444444444444444444444444444444444444444444444444444444444444444444TRUE-1.97.4444444444444444444444444444444444444444444                                                   " + "'", str3, "...                     4444444444444444444444444444444444444444444TRUE-1.97.4444444444444444444444444444444444444444444444444444444444444444444444444444444444444TRUE-1.97.4444444444444444444444444444444444444444444                                                   ");
    }

    @Test
    public void test28141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28141");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut(" aaaa0aaaaa    ", "...000     ...                                                                                                                                                                                                                                                                                                                                                                                  ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test28142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28142");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("44444444444444444444444444444444444444444440.7900.1-eurt04444444444444444444444444444444444444444444.790.7900.1-eurt04444444444444444444444444444444444444444444.1-eurt0.7900.1-eurt044444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfAny("444440true-1.0097.0100.0", strArray2);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, ' ');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "44444444444444444444444444444444444444444440.7900.1-eurt04444444444444444444444444444444444444444444.790.7900.1-eurt04444444444444444444444444444444444444444444.1-eurt0.7900.1-eurt044444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str5, "44444444444444444444444444444444444444444440.7900.1-eurt04444444444444444444444444444444444444444444.790.7900.1-eurt04444444444444444444444444444444444444444444.1-eurt0.7900.1-eurt044444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test28143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28143");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "...HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 44 + "'", int1 == 44);
    }

    @Test
    public void test28144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28144");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("...aaaa...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...aaaa..." + "'", str1, "...aaaa...");
    }

    @Test
    public void test28145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28145");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("        HI!HI!HI!HI!HI!HI!HI!HI!HI!HI.A A A ", "4444444444444444444444444444444444440true-1.0097.4444444444444444444444444444444444444444444440true-1.0097.4444444444444444444444444444444444444444444440true-1.0097.4444444444444444444444444444444444444444444440true-1.0097.4444444444444444444444444444aHI!HI!..");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444444444444444444444444444444440true-1.0097.4444444444444444444444444444444444444444444440true-1.0097.4444444444444444444444444444444444444444444440true-1.0097.4444444444444444444444444444444444444444444440true-1.0097.4444444444444444444444444444aHI!HI!.." + "'", str2, "4444444444444444444444444444444444440true-1.0097.4444444444444444444444444444444444444444444440true-1.0097.4444444444444444444444444444444444444444444440true-1.0097.4444444444444444444444444444444444444444444440true-1.0097.4444444444444444444444444444aHI!HI!..");
    }

    @Test
    public void test28146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28146");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                  4                   0true-1.0097.04444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444", "Rue-1.0097.0");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test28147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28147");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("A    ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "A   " + "'", str1, "A   ");
    }

    @Test
    public void test28148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28148");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "RT00I00I  EURT00I00I  EURT00I00I  EURT0     A    RT00I00I  EURT00I00I  EURT00I00I  E", "!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test28149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28149");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("4444444...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!aaaaaaaaaaaaaaaaaa", 269, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                              4444444...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!aaaaaaaaaaaaaaaaaa                                                                                               " + "'", str3, "                                                                                              4444444...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!aaaaaaaaaaaaaaaaaa                                                                                               ");
    }

    @Test
    public void test28150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28150");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("0         aaa", (int) (short) 0, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0         aaa" + "'", str3, "0         aaa");
    }

    @Test
    public void test28151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28151");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("                                            AAAA");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test28152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28152");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "...00.7900.1-eurt00.79......aaaa", (java.lang.CharSequence) "0 00aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test28153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28153");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 277, 0.0d, (double) 548L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 548.0d + "'", double3 == 548.0d);
    }

    @Test
    public void test28154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28154");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("4444444...true-1.4444444...97.4444444...4444444444444444444444444444444444444444444", 667);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 667 + "'", int2 == 667);
    }

    @Test
    public void test28155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28155");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("100.0                                                                                      100.0                                                                                      100.0                                                                                      100.0                                                                                      100.0                                                                                      100.0                                                                                      100.0                                                                                      100.0                                                                                      100.0                                                                                      100.0");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test28156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28156");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("hi!", 0.04444444552063942d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.04444444552063942d + "'", double2 == 0.04444444552063942d);
    }

    @Test
    public void test28157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28157");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("true -   97  ", "Aaaaaaaaaaa4444444...4444444...4444444...4");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "true -   97  " + "'", str2, "true -   97  ");
    }

    @Test
    public void test28158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28158");
        char[] charArray1 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("A   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    ", charArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test28159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28159");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a       44444444444444444444444444444444444444444444444444...true-1.4444444...97.4444444...4444444444444444444444444444444444444444444                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a        ", "...                             ");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test28160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28160");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                     aaaa0aaaaa                     4", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAa    ...IH!IH!IH!IH!IH!IH!IH!IH!IH!IH   aAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test28161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28161");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!" + "'", str1, "hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!");
    }

    @Test
    public void test28162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28162");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("AAAAAAaaaaaaaaAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", 25, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "AAAAAAaaaaaaaaAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str3, "AAAAAAaaaaaaaaAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test28163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28163");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("444...44444444444444444444444444444444440TRUE-1.0097...44");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray1, "...4444444...4444444...4444444...4444444...                                       444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...44444444444444444444444444...7900.1-eurt044444444444444444..4444444");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "444...44444444444444444444444444444444440TRUE-1.0097...44" + "'", str4, "444...44444444444444444444444444444444440TRUE-1.0097...44");
    }

    @Test
    public void test28164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28164");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("A hi!hi!hi!hi!hi!hi!hi!hi!hi!hi... AA hi!hi!hi!hi!0true-1 0097 044444444444444444444444444 4", " 0044444440004444444000444444400");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test28165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28165");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("    100.0      0true-1.0097.00true-1.0097.00true-1.0097.00tr4444A444440true-1.0097.00true-1.0097.00true-1.0097.00t                                                                                100.0                                         ...00true-1.0097.00tru...", '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0true-1.0097.00true-1.0097.00true-1.0097.00t                                                                                100.0                                         ...00true-1.0097.00tru...4A4    100.0      0true-1.0097.00true-1.0097.00true-1.0097.00tr" + "'", str2, "0true-1.0097.00true-1.0097.00true-1.0097.00t                                                                                100.0                                         ...00true-1.0097.00tru...4A4    100.0      0true-1.0097.00true-1.0097.00true-1.0097.00tr");
    }

    @Test
    public void test28166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28166");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("00       0true00       0-00       000       000       09700       000       0", "aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa");
        boolean boolean4 = org.apache.commons.lang3.StringUtils.startsWithAny(".0097.00TRUE-1.0097.00TRUE-1.0097.00TR", strArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "aaaa0aaaaaaaaa0aaaaaaaaa0aaa...0...", 670, 18);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test28167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28167");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger(" . 97 . 4444444444444444444444444444444444444444444");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \" . 97 \"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test28168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28168");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("", 648);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test28169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28169");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("44444444444444444444444444444444444444444440TRUE-1.0097.0", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test28170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28170");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("RT00.7900.1-EURT00.7900.1-EURT00.7900.1-EURT0    ..", "         ......00.7900.1-eurt00.79......aaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test28171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28171");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("", "...aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test28172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28172");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) 648, 102L, 4444404444L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 102L + "'", long3 == 102L);
    }

    @Test
    public void test28173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28173");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("                          ", "                                                                                                                                                                                                                                                                                                                                                                                                aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                                                                                                                                                                                                                                                                                                                                 ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                          " + "'", str2, "                          ");
    }

    @Test
    public void test28174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28174");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("0true-1.0097.0aaaaaaaaaaaaaaaaaaaaaaaaaaa");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: 0true-1.0097.0aaaaaaaaaaaaaaaaaaaaaaaaaaa is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test28175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28175");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(56, 842, 98);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 56 + "'", int3 == 56);
    }

    @Test
    public void test28176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28176");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("        ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test28177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28177");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("Aaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaAaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaAaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaAaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaAaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaAaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaAaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaAaaaaaaaaaa4444444...4444444...4444444..A   hi!hi!hi!haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444444440.7900.1-EURT0Aaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaAaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaAaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaAaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaAaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaAaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaAaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaAaaaaaaaaaa4444444...4444444...4444444..A   hi!hi!hi!haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "4444444444444444444444444444444444444444444TRUE4444444444444444444444444444444444444444444444444444444444444444444444444444444444444TRUE4444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Aaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaAaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaAaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaAaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaAaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaAaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaAaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaAaaaaaaaaaa4444444...4444444...4444444..A   hi!hi!hi!haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444444440.7900.1-EURT0Aaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaAaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaAaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaAaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaAaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaAaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaAaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaAaaaaaaaaaa4444444...4444444...4444444..A   hi!hi!hi!haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "Aaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaAaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaAaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaAaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaAaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaAaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaAaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaAaaaaaaaaaa4444444...4444444...4444444..A   hi!hi!hi!haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444444440.7900.1-EURT0Aaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaAaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaAaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaAaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaAaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaAaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaAaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaAaaaaaaaaaa4444444...4444444...4444444..A   hi!hi!hi!haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test28178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28178");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("41004.404                                                444444A444444444444444444444444A444444444444444444444444A444444444444444444444444A444444444444444444444444A444444444444444444444444A444444444444444444444444A444444444444444444444444A444444444444444444444444A444444444444444444444444A444444444444444444444444A444444444444444444444444A444444444444444444444444A444444444444444444444444A444444444444444444444444A444444444444444444444444A444444444444444444444444A444444444444444444444444A4444444444444444444", " A rt00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt0                                      ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test28179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28179");
        char[] charArray14 = new char[] { ' ', '4', 'a', 'a', 'a' };
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "100.0", charArray14);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray14);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsAny("44444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444", charArray14);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "0true-1.0097.00true-1.0097.00true-1.0097.00tr    A     0true-1.0097.00true-1.0097.00true-1.0097.00t", charArray14);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "0true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444", charArray14);
        boolean boolean20 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "TRUE-1.0097.0", charArray14);
        int int21 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "0true-1.0097.04444444444444444444444444444444444444444440true-1.0097.044444444444444444444444444", charArray14);
        int int22 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT04444444444444444444444444444444444444444444", charArray14);
        boolean boolean23 = org.apache.commons.lang3.StringUtils.containsAny("0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa", charArray14);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray14), " 4aaa");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray14), " 4aaa");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray14), "[ , 4, a, a, a]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 45 + "'", int18 == 45);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 14 + "'", int19 == 14);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 62 + "'", int22 == 62);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test28180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28180");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("4 0true-1.0097.044444444444444444444444444", "                                         ...444444440tr...                                          ", 656);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test28181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28181");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(5, 2, 91);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
    }

    @Test
    public void test28182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28182");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("44444444444444444440TRUE-1.0097.                    ", 102);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44444444444444444440TRUE-1.0097.                                                                      " + "'", str2, "44444444444444444440TRUE-1.0097.                                                                      ");
    }

    @Test
    public void test28183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28183");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("...00.7900.1-eurt00.7900.1-eurt0", "44444444444444444440true-1.0097.");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test28184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28184");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("                        ", "444...4444Aaaaaaaaa");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "4444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444");
        int int6 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("                       #a#44444444444444444444#...#444444444444444444444444444444444444444444444", strArray5);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test28185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28185");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("4444444444444444444444444444440T", 127, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4444444444444444444444444444440T                                                                                               " + "'", str3, "4444444444444444444444444444440T                                                                                               ");
    }

    @Test
    public void test28186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28186");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("0true-1.0097.00true-1.0097.00true-1.0097.00t                                                                                100.0                                         ...00true-1.0097.00tru...4A4    100.0      0true-1.0097.00true-1.0097.00true-1.0097.00tr", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                               true  ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0true-1.0097.00true-1.0097.00true-1.0097.00t                                                                                100.0                                         ...00true-1.0097.00tru...4A4    100.0      0true-1.0097.00true-1.0097.00true-1.0097.00tr" + "'", str2, "0true-1.0097.00true-1.0097.00true-1.0097.00t                                                                                100.0                                         ...00true-1.0097.00tru...4A4    100.0      0true-1.0097.00true-1.0097.00true-1.0097.00tr");
    }

    @Test
    public void test28187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28187");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "444444...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test28188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28188");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("44444444444444444444444444444444444444444444444444...true-1.4444444...97.4444444...444444444444444444444444444444444444444444");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test28189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28189");
        char[] charArray15 = new char[] { ' ', '4', 'a', 'a', 'a' };
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "100.0", charArray15);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray15);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsAny("44444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444", charArray15);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "0true-1.0097.00true-1.0097.00true-1.0097.00tr    A     0true-1.0097.00true-1.0097.00true-1.0097.00t", charArray15);
        int int20 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray15);
        boolean boolean21 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "4444444...", charArray15);
        boolean boolean22 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...444444", charArray15);
        int int23 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "444444444444444440true-1.0097...444444444444444444444444", charArray15);
        int int24 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "    a   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    a    ", charArray15);
        boolean boolean25 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", charArray15);
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
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test28190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28190");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("EURT044444444444444444444444444444444444444444444444444444444444444444444444444444444!hi!h!hi!h44444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT04444444444444444444444444444444444444444444             ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "EURT044444444444444444444444444444444444444444444444444444444444444444444444444444444!hi!h!hi!h44444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT04444444444444444444444444444444444444444444" + "'", str1, "EURT044444444444444444444444444444444444444444444444444444444444444444444444444444444!hi!h!hi!h44444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT04444444444444444444444444444444444444444444");
    }

    @Test
    public void test28191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28191");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "aA44444A44444A44444A44444A44444A44444A44444A44444A44444100.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AA44444A44444A44444A44444A44444A44444A44444A44444A44444100.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str1, "AA44444A44444A44444A44444A44444A44444A44444A44444A44444100.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test28192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28192");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "a0044444440004444444000444444400");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test28193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28193");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  aaaaa0aaaa0.7900.1-eurt04444444444444444...", "                                       aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 96);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test28194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28194");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("                                                                                    0.001                                                            44444444444444444440true-1.0097.", 'a', ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                    0.001                                                            44444444444444444440true-1.0097." + "'", str3, "                                                                                    0.001                                                            44444444444444444440true-1.0097.");
    }

    @Test
    public void test28195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28195");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("a A 1000 A A");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test28196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28196");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("...444444444444444444444444444444444444444444444UUUUU4UUUU444444444444444444444444444444444444444444444UUUUUUUUUUU444444444444444444444444444444444444444444444UUUUU4UUUU444444444444444444444444444444444444444444444UUUUUUUUUUU444444444444444444444444444444444444444444444UUUUU4UUUU444444444444", "                                                                     99999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999                                                                                                                                                                                                                                                                                                                                                                                                                                                                        4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test28197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28197");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("4444444...4444444444444444444444444444444444444444444444444hi!", "4                                                 100.0                                                                             aaaa0aaaaa       ...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 59 + "'", int2 == 59);
    }

    @Test
    public void test28198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28198");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("          ###    a   HI!HI!.           ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"###    a   HI!HI!.\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test28199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28199");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("44444444444444444444444444444444444444444444444444444444                                                                                                                   0true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444", (byte) 10);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 10 + "'", byte2 == (byte) 10);
    }

    @Test
    public void test28200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28200");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("0.7900.1-eurt0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                   4aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa    A     ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0.7900.1-EURT0AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                                   4AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA    A     " + "'", str1, "0.7900.1-EURT0AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                                   4AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA    A     ");
    }

    @Test
    public void test28201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28201");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "0 true - 1 . 0097 . 04444444444444444444444444444444444444444440 true - 1 . 0097 . 04444444444444444444444444444444444444444440 true - 1 . 0097 . 04444444444444444444444444444444444444444440 true - 1 . 0097 . 04444444444444444444444444444444444444444440 true - 1 . 0097 . 04444444444444444444444444444444444444444440 true - 1 . 0097 . 04444444444444444444444444444444444444444440 true - 1 . 0097 . 04444444444444444444444444444444444444444440 true - 1 . 0097 . 04444444444444444444444444444444444444444440 true - 1 . 0097 . 04444444444444444444444444444444444444444440 true - 1 . 0097 . 0444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test28202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28202");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("                           aaaa0aaaaa aaaa0aaaaa aaaa0aaaaa aaaa0aaaaa                           ", 537);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test28203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28203");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("444aaa   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1 0097   aaaaa   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1 0097   aaaaa   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1 0097   aaaaa   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1 0097   aaaaa   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1 0097   aaaaa   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1 0097   aaaaa   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1 0097   aaaaa   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1 0097   aaaaa   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1 0097   aaaaa   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1 0097   aaaaa   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1 0097   aaaaa   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1 0097   aaaaa   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1 0097   aa                         100.0                                                     aaaa444444444444444444444", "...40true-1.0097.04444444444444444444444444444444444...A A A A ", "...i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi......i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi......i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi......i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi......i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi......i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi......i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi......i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi......i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi....");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test28204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28204");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterType("                                               100.0                                                ");
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, ' ', 24, 0);
        int int7 = org.apache.commons.lang3.StringUtils.indexOfAny("    A   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI", strArray2);
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "           A         A         A         A         A         A         A         A         A         A         A         A         A         A ..");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void test28205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28205");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.split("a", "44444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444");
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!" };
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.stripAll(strArray9);
        java.lang.String[] strArray13 = org.apache.commons.lang3.StringUtils.split("44444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444", '4');
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.replaceEach("100.0", strArray10, strArray13);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.endsWithAny("a", strArray10);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray10);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.replaceEach("4444444..444444444444444440true-1.0097...44444444444444444444444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...", strArray5, strArray10);
        java.lang.String[] strArray21 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("4444444...", "a", (int) '4');
        java.lang.String str22 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray21);
        java.lang.String str23 = org.apache.commons.lang3.StringUtils.replaceEach("", strArray5, strArray21);
        int int24 = org.apache.commons.lang3.StringUtils.indexOfAny("0true-1.0097.00true-1.0097.00true-1.0097.00tr a 0true-1.0097.00true-1.0097.00true-1.0097.00tr", strArray5);
        java.lang.String str25 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "100.0" + "'", str14, "100.0");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "4444444..444444444444444440true-1.0097...44444444444444444444444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444..." + "'", str17, "4444444..444444444444444440true-1.0097...44444444444444444444444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...");
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "4444444..." + "'", str22, "4444444...");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 46 + "'", int24 == 46);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "a" + "'", str25, "a");
    }

    @Test
    public void test28206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28206");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test28207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28207");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("4444################################################################################################", "                                                                                               100.", 95);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.concatWith("", (java.lang.Object[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "4444################################################################################################" + "'", str5, "4444################################################################################################");
    }

    @Test
    public void test28208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28208");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("A A ###################################", "       aaaa0aaaaa                     ...");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test28209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28209");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "Aa00a       a000a       a000a       a00");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test28210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28210");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("", "A0true-1.0097.00true-1.0097.00true-1.0097.00tr");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test28211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28211");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "AAAAAAAAAAAAAAAAAAAAAAAAAAA                     AAAA0AAAAA           AAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test28212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28212");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("aaaaaaaaaaaaaaaaaaa0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.00....444444440tr...aaaaaaaaaaaaaaaaaa", "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test28213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28213");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(638.0d, (double) 570.0f, 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 638.0d + "'", double3 == 638.0d);
    }

    @Test
    public void test28214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28214");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("...40true-1.0097.04444444444", 0, 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test28215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28215");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("0");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0" + "'", str1, "0");
    }

    @Test
    public void test28216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28216");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "4444a44444                                                                                                                                           ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test28217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28217");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("444...44444444444444444444444444444444440TRUE-1.0097...44444...4444444444444", "A   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test28218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28218");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A", "444444444444444444444444444444444444444444444444444444444444E-1.0         0097.00TR    A     0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test28219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28219");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("444444444", "            444444444444444  444444444444444             ..");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "            444444444444444  444444444444444             .." + "'", str2, "            444444444444444  444444444444444             ..");
    }

    @Test
    public void test28220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28220");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 35 + "'", int1 == 35);
    }

    @Test
    public void test28221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28221");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test28222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28222");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("44444444444444444444444444444444444.7900.1-eurt0444444444444444444444444444444444444444444444.7900.1-eurt0444444444444444444444444444444444444", "RT00.7900.1-EURT00.7900.1-EURT00.7900.1-EURT0aaaaaaaaaaRT00.7900.1-EURT00.7900.1-EURT00.7900.1-EURT0");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44444444444444444444444444444444444.7900.1-eurt0444444444444444444444444444444444444444444444.7900.1-eurt0444444444444444444444444444444444444" + "'", str2, "44444444444444444444444444444444444.7900.1-eurt0444444444444444444444444444444444444444444444.7900.1-eurt0444444444444444444444444444444444444");
    }

    @Test
    public void test28223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28223");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("HI...I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI......I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI......I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI......I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI......I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI......I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI......I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI......I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI......I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI....!");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test28224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28224");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("true-1...97.............................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................", "");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test28225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28225");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "A hi!hi!hi!hi!hi!hi!hi!hi!hi!hi... AA hi!hi!hi!hi!0true-1 0097 044444444444444444444444444 4");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "a hi!hi!hi!hi!hi!hi!hi!hi!hi!hi... AA hi!hi!hi!hi!0true-1 0097 044444444444444444444444444 4" + "'", str1, "a hi!hi!hi!hi!hi!hi!hi!hi!hi!hi... AA hi!hi!hi!hi!0true-1 0097 044444444444444444444444444 4");
    }

    @Test
    public void test28226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28226");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("                 ", (short) -1);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) -1 + "'", short2 == (short) -1);
    }

    @Test
    public void test28227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28227");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("  ", 'a');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test28228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28228");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("                                                                                               100.", "4444444444444444444444444444444444444444444true-1.97.4444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test28229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28229");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("                                                       true-1.00                                           true-1.97.                                                        ");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test28230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28230");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("...                             ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                             ..." + "'", str1, "                             ...");
    }

    @Test
    public void test28231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28231");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "                                                 ###0.001##");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                 ###0.001##" + "'", str1, "                                                 ###0.001##");
    }

    @Test
    public void test28232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28232");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) 10, (short) -1, (short) 100);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test28233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28233");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) ".ih!ih!ih!ih!ih!ih!ih!ih!ih!ih AA ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih AA ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih AA ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih AA ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih AA ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih AA ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih AA ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih AA ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih AA ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih AA ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih AA ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih AA ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih AA ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih AA ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih AA ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih AA ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih AA ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih AA ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih AA ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih AA ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih AA ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih A");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test28234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28234");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("            1000    a         a", "");
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("", "                       A                             ", 41);
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.splitByCharacterType("4             ");
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("1aaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaa", strArray8, strArray10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = org.apache.commons.lang3.StringUtils.replaceEach("...                     aaaaa0aaaa                     aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...                     aaaaa0aaaa                     aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.....", strArray3, strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 3 vs 2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1aaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaa" + "'", str11, "1aaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaa");
    }

    @Test
    public void test28235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28235");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("", 130, 13);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test28236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28236");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty(".4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...", "100.0###");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ".4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444..." + "'", str2, ".4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...");
    }

    @Test
    public void test28237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28237");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("0true-1.0097.04444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444", "!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", 52);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0true-1.0097.04444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444" + "'", str4, "0true-1.0097.04444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444");
    }

    @Test
    public void test28238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28238");
        java.lang.Object[] objArray0 = null;
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(objArray0, "0TRUE-1.04444444444444444444444444444444444444444444", 141, 0);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test28239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28239");
        long[] longArray5 = new long[] { (byte) 1, (byte) 10, (short) -1, (byte) 10, (short) 10 };
        long long6 = org.apache.commons.lang3.math.NumberUtils.min(longArray5);
        long long7 = org.apache.commons.lang3.math.NumberUtils.max(longArray5);
        long long8 = org.apache.commons.lang3.math.NumberUtils.max(longArray5);
        long long9 = org.apache.commons.lang3.math.NumberUtils.min(longArray5);
        long long10 = org.apache.commons.lang3.math.NumberUtils.max(longArray5);
        long long11 = org.apache.commons.lang3.math.NumberUtils.max(longArray5);
        long long12 = org.apache.commons.lang3.math.NumberUtils.max(longArray5);
        org.junit.Assert.assertNotNull(longArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray5), "[1, 10, -1, 10, 10]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 10L + "'", long8 == 10L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 10L + "'", long10 == 10L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 10L + "'", long11 == 10L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 10L + "'", long12 == 10L);
    }

    @Test
    public void test28240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28240");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "                                              0true-1.0097.00true-1.0097.00true-1.0097.00tr    A     0true-1.0097.00true-1.0097.00true-1.0097.00tr");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                              0true-1.0097.00true-1.0097.00true-1.0097.00tr    A     0true-1.0097.00true-1.0097.00true-1.0097.00tr" + "'", str1, "                                              0true-1.0097.00true-1.0097.00true-1.0097.00tr    A     0true-1.0097.00true-1.0097.00true-1.0097.00tr");
    }

    @Test
    public void test28241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28241");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("7900.1-eurt0444100.0");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "7900.1-eurt0444100.0" + "'", str1, "7900.1-eurt0444100.0");
    }

    @Test
    public void test28242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28242");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "      a         a         a         a         a");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test28243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28243");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("...00true-1.0097.00true-1.0097.00tr...00true-1.009700#######000#######000#######0011...00true-1.0097.00true-1.0097.00tr...00true-1.0097.", "    A     .7900.1-eurt0444444444444444444...", 623);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test28244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28244");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa    A     ", 43);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test28245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28245");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA   #################################################");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test28246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28246");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "                                                                ...444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test28247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28247");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("444444444444444444444444444444444444444444444444444", "A0000000000", "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI", 146);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "444444444444444444444444444444444444444444444444444" + "'", str4, "444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test28248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28248");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("44444444444444444444444444444444444444444440true-1.0097. A 44444444444444444440true-1.0097. A 4444444444444444444444444444444444444444444440true-1.0097. A 4444444444444444444444444444444444444444444440true-1.0097. A 4444444444444444444444444444444444444444444440true-1.0097. A 4444444444444444444444444444444444444444444440true-1.0097. A 4444444444444444444444444444444444444444444440true-1.0097. A 4444444444444444444444444444444444444444444440true-1.0097. A 4444444444444444444444444444444444444444444440true-1.0097. A 444444444444444444444444444444444444444444444", "                                                 ###0.001##");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test28249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28249");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("                                       444...44444444444444444444444444444444440TRUE-1.0097################################################################################################################################################################################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                       444...44444444444444444444444444444444440true-1.0097################################################################################################################################################################################" + "'", str1, "                                       444...44444444444444444444444444444444440true-1.0097################################################################################################################################################################################");
    }

    @Test
    public void test28250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28250");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.00...############################################################################");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test28251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28251");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  ", "!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!iH");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test28252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28252");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("###################################################################################################...######################a######################################################");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test28253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28253");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("    A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A!hi!h!hi!h", (byte) 1);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 1 + "'", byte2 == (byte) 1);
    }

    @Test
    public void test28254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28254");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("            aaaa0aaaaa0aaaa0aaaaa0aaaa0aaaaa0aaaa0a", 657, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "            aaaa0aaaaa0aaaa0aaaaa0aaaa0aaaaa0aaaa0a444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str3, "            aaaa0aaaaa0aaaa0aaaaa0aaaa0aaaaa0aaaa0a444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test28255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28255");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("aaa4444444...4444444...4444444...4  ", "true-1.0097.00true-1.0097.00true-1.0097.00trA0t", 253);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test28256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28256");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaa...aaaaaaaaaaaaaaaaaaaaaaaaa...aaaaaaaaaaaaaaaaaaaaaaaaHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H", "A A A A                        a                       ...aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test28257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28257");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("44444444444444444444444444444444444444444444444444444444444444444444444!44444444444444444444444444444444444444444444444444444444444444444444444!44444444444444444444444444444444444444444444444444444444444444444444444!44444444444444444444444444444444444444444444444444444444444444444444444!44444444444444444444444444444444444444444444444444444444444444444444444!44444444444444444444444444444444444444444444444444444444444444444444444!44444444444444444444444444444444444444444444444444444444444444444444444!44444444444444444444444444444444444444444444444444444444444444444444444!44444444444444444444444444444444444444444444444444444444444444444444444!44444444444444444444444444444444444444444444444444444444444444444444444!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "44444444444444444444444444444444444444444444444444444444444444444444444!44444444444444444444444444444444444444444444444444444444444444444444444!44444444444444444444444444444444444444444444444444444444444444444444444!44444444444444444444444444444444444444444444444444444444444444444444444!44444444444444444444444444444444444444444444444444444444444444444444444!44444444444444444444444444444444444444444444444444444444444444444444444!44444444444444444444444444444444444444444444444444444444444444444444444!44444444444444444444444444444444444444444444444444444444444444444444444!44444444444444444444444444444444444444444444444444444444444444444444444!44444444444444444444444444444444444444444444444444444444444444444444444!" + "'", str1, "44444444444444444444444444444444444444444444444444444444444444444444444!44444444444444444444444444444444444444444444444444444444444444444444444!44444444444444444444444444444444444444444444444444444444444444444444444!44444444444444444444444444444444444444444444444444444444444444444444444!44444444444444444444444444444444444444444444444444444444444444444444444!44444444444444444444444444444444444444444444444444444444444444444444444!44444444444444444444444444444444444444444444444444444444444444444444444!44444444444444444444444444444444444444444444444444444444444444444444444!44444444444444444444444444444444444444444444444444444444444444444444444!44444444444444444444444444444444444444444444444444444444444444444444444!");
    }

    @Test
    public void test28258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28258");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("                                                                                                                                  0AAAA                                                                                                                                  ", "                                      100.0                ...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test28259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28259");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        ...44444444444444444444444444444444440true-1.0097...44444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test28260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28260");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444444444444444444444444444444444444444A A A A                        a                             true-1.A A A A                        a                             97.A A A A                        a                             4444444444444444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test28261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28261");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(131, 671, 670);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 131 + "'", int3 == 131);
    }

    @Test
    public void test28262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28262");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!                            100.0                                                     aaaahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test28263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28263");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("0444...44444444444444444444444444444444440TRUE-1.0097...40444...44444444444444444444444444444444440TRUE-1.0097...40444...44444444444444444444444444444444440TRUE-1.0097...40444...44444444444444444444444444444444440TRUE-1.0097...40444...44444444444444444444444444444444440TRUE-1.0097...40444...44444444444444444444444444444444440TRUE-1.0097...40444...4444444444444444444444444444444444444444444444444444444444...true-1.4444444...97.4444444...44444444444444444444444444444444444444444440444...44444444444444444444444444444444440TRUE-1.0097...40444...44444444444444444444444444444444440TRUE-1.0097...40444...44444444444444444444444444444444440TRUE-1.0097...40444...44444444444444444444444444444444440TRUE-1.0097...40444...44444444444444444444444444444444440TRUE-1.0097...40444...44444444444444444444444444444444440TRUE-1.0097...40444...444444444");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test28264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28264");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min(245.0f, (float) 895L, (float) 156L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 156.0f + "'", float3 == 156.0f);
    }

    @Test
    public void test28265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28265");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("4444444444444444444444444444444444444444444                                                                                                                                                                                                                                                                          0.79                                                                                                                                                                                                                                                                          0.1-eurt                                                                                                                                                                                                                                                                          04444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4444444444444444444444444444444444444444444 0.79 0.1-eurt 04444444444444444444444444444444444444444444" + "'", str1, "4444444444444444444444444444444444444444444 0.79 0.1-eurt 04444444444444444444444444444444444444444444");
    }

    @Test
    public void test28266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28266");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("0true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "a rt00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt0", "        HI!H4444404444HI!HI.A A A ");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test28267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28267");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("0true-1.0097.0444444444444444444444444444444444444444444", "aaaa0.7900.1-eurt0aaaaaaaaaaaaaaaaaaaaaaaaaaa0.7900.1-eurt0A    ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih   A");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0true-1.0097.0444444444444444444444444444444444444444444" + "'", str2, "0true-1.0097.0444444444444444444444444444444444444444444");
    }

    @Test
    public void test28268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28268");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("   444444444444444444444444...44444a   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    0true-1.00-1.0097.04444444444444444444444444444444444444444444");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"   444444444444444444444444...44444a   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    0true-1.00-1.0097.04444444444444444444444444444444444444444444\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test28269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28269");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("                                            0true-1.0                                               41004.404                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                ", 645, "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI.A A A");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                            0true-1.0                                               41004.404                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                " + "'", str3, "                                            0true-1.0                                               41004.404                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                ");
    }

    @Test
    public void test28270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28270");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("                                                                                                                                                                                                                                                                                                                                            HI!                                                                                                                                                                                                                                                                                                                                            ", "aaaaaaaaaaaaaaaaaaaA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    A0T");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                                                            HI!                                                                                                                                                                                                                                                                                                                                            " + "'", str2, "                                                                                                                                                                                                                                                                                                                                            HI!                                                                                                                                                                                                                                                                                                                                            ");
    }

    @Test
    public void test28271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28271");
        char[] charArray15 = new char[] { ' ', '4', 'a', 'a', 'a' };
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "100.0", charArray15);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray15);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsAny("44444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444", charArray15);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "0true-1.0097.00true-1.0097.00true-1.0097.00tr    A     0true-1.0097.00true-1.0097.00true-1.0097.00t", charArray15);
        int int20 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray15);
        boolean boolean21 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "4444444...", charArray15);
        int int22 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "4444444...", charArray15);
        boolean boolean23 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "                     aaaa0aaaaa                     ", charArray15);
        int int24 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                                       ", charArray15);
        boolean boolean25 = org.apache.commons.lang3.StringUtils.containsAny("aaaaaaaaaaaaaaaaaaaaaaaaa", charArray15);
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test28272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28272");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("           A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A!hi!h!hi!hA", "...44444444444444444444440TRUE-1.0440true-1.0097.0aaaa0aaaaa...44444444444444444444440TRUE-1.04");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test28273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28273");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("0TRUE-1.0097.00TRUE-1....0true-1.0097...", ' ');
        int int4 = org.apache.commons.lang3.StringUtils.indexOfAny("                                                                                                          HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH             A                                                                                                                ", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test28274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28274");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("###################    a   HI!HI!...#################");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test28275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28275");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("                                                                                     4444444444444444444444444444444444444444444atrue-1.a97.a4444444444444444444444444444444444444444444                                                                                     ", ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444444444444444444444444444444444444444atrue-1.a97.a4444444444444444444444444444444444444444444" + "'", str2, "4444444444444444444444444444444444444444444atrue-1.a97.a4444444444444444444444444444444444444444444");
    }

    @Test
    public void test28276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28276");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                              ...44444...true-1.4444444...97.4444444...4444444444444...4                               ", '#');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test28277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28277");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("", 48, 449);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test28278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28278");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("                            100.0                                                     aaaa", "                       #a#44444444444444444444#...#444444444444444444444444444444444444444444444", "A    ", 51);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "                            100.0                                                     aaaa" + "'", str4, "                            100.0                                                     aaaa");
    }

    @Test
    public void test28279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28279");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("AA44444A44444A44444A44444A44444A44444A44444A44444A44444100.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test28280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28280");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("44444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "44444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097." + "'", str1, "44444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.");
    }

    @Test
    public void test28281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28281");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches(".0097.00tr.0097.00tr.0097.00tr.0097.00tr.0097.00tr.0097.00tr.0097.00tr.0097.00tr.0097.00tr                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               ", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test28282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28282");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "             rue-1.0097.0");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test28283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28283");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "a   hi!hi!...truea   hi!hi!...-a   hi!hi!...a   hi!hi!...a   hi!hi!...97a   hi!hi!...a   hi!hi!...", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               0true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.00..");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test28284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28284");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("44444444444444444444444a", "0HI!HI!HI!HI!HI!HI!HI!HI!HI!HI.A A A1.00HI!HI!HI!HI!HI!HI!HI!HI!HI!HI.A A A1.00HI!HI!HI!HI!HI!HI!HI!HI!HI!HI.A A A.0HI!HI!HI!HI!HI!HI!HI!HI!HI!HI.A A AA   hi!hi!hi!haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test28285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28285");
        char[] charArray16 = new char[] { ' ', '4', 'a', 'a', 'a' };
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "100.0", charArray16);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray16);
        boolean boolean19 = org.apache.commons.lang3.StringUtils.containsAny("44444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444", charArray16);
        int int20 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "0true-1.0097.00true-1.0097.00true-1.0097.00tr    A     0true-1.0097.00true-1.0097.00true-1.0097.00t", charArray16);
        int int21 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "0true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444", charArray16);
        int int22 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "4444A44444", charArray16);
        int int23 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "4444444...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", charArray16);
        int int24 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                                      100.0                                                      ", charArray16);
        boolean boolean25 = org.apache.commons.lang3.StringUtils.containsAny("...44444444444...", charArray16);
        boolean boolean26 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "#######################################################################################################################################################################4 0true-1.0097.04444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444", charArray16);
        int int27 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "44444444444444444444444444444444444444444444444444444444444444444444TRUE-1.97.4444444444444444444444444444444444444444444                                                   ", charArray16);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray16), " 4aaa");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray16), " 4aaa");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray16), "[ , 4, a, a, a]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 45 + "'", int20 == 45);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 14 + "'", int21 == 14);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 7 + "'", int23 == 7);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test28286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28286");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("444444444444444444444444444444444444444444true-1.97.4444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "444444444444444444444444444444444444444444true-1.97.4444444444444444444444444444444444444444444" + "'", str1, "444444444444444444444444444444444444444444true-1.97.4444444444444444444444444444444444444444444");
    }

    @Test
    public void test28287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28287");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("aaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaa", 259, "1AAAAAAAAAAA4444444...4444444...4444444...4");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1AAAAAAAAAAA4444444...4444444...4444444...41AAAAAAAAAAA4444444...4444444...4444444...41AAAAAAAAAAA444aaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaa1AAAAAAAAAAA4444444...4444444...4444444...41AAAAAAAAAAA4444444...4444444...4444444...41AAAAAAAAAAA4444" + "'", str3, "1AAAAAAAAAAA4444444...4444444...4444444...41AAAAAAAAAAA4444444...4444444...4444444...41AAAAAAAAAAA444aaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaa1AAAAAAAAAAA4444444...4444444...4444444...41AAAAAAAAAAA4444444...4444444...4444444...41AAAAAAAAAAA4444");
    }

    @Test
    public void test28288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28288");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "                                      100.0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test28289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28289");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("  aa     aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               ", "...#####...true-1.#######...97.#######...#############...                  #0000####################################################################000#########################################0000####################################################################000#########################################0000####################################################################000#########################################0000####################################################################000#########################################0000####################################################################000#########################################0000########");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "  aa     aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               " + "'", str2, "  aa     aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               ");
    }

    @Test
    public void test28290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28290");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("                                                0097.                                                 ", "44444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test28291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28291");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "444440true-1.0097...4444440true-1.0097...4444440444444444444444444444444444444440true-1.0097...4444440true-1.0097...4444440", 61);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, '#', 645, 113);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test28292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28292");
        java.lang.String[] strArray1 = null;
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny("...I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HhI!7.44444444444444444444444444444444444444444444", strArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test28293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28293");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("0a44444444444444444444444444444444444444444440true-1.0097.0a0a44444444444444444444444444444444444444444440true-1.0097.0a0a44444444444444444444444444444444444444444440true-1.0097.0a0a44444444444444444444444444444444444444444440true-1.0097.0a0a44444444444444444444444444444444444444444440true-1.0097.0a0a44444444444444444444444444444444444444444440true-1.0097.0a0a44444444444444444444444444444444444444444440true-1.0097.0a0a44444444444444444444444444444444444444444440true-1.0097.0a0a44444444444444444444444444444444444444444440true-1.0097.0a0a44444444444444444444444...a", "....4444444444444444444444444444...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa....4444444444444444444444444444...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa....4444444444444444444444444444...hI!################################hI!################################hI!################################hI!################################hI!################################hI!################################hI!################################hI!################################hI!################################hI!################################hI!################################hI!################################hI!################################hI!################################hI!################################hI!################################hI!#######################");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test28294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28294");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) ".0097.00tr.0097.00tr.0097.00tr.0097.00tr.0097.00tr.0097.00tr.0097.00tr.0097.00tr.0097.00tr                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               ", "hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test28295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28295");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("4444444...444444           aaaaaaaaaaa");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: 4444444...444444           aaaaaaaaaaa is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test28296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28296");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("   AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "44444444444444444444444444444444444444444444444444...TRUE-1.4444444...97.4444444...444444444444444444444444444444444444444444444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...44444444444444444444444444...7900.1-eurt044444444444444444..4444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test28297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28297");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "4444444444444444444444444444440T                                                                                               ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 127 + "'", int1 == 127);
    }

    @Test
    public void test28298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28298");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits(".. A...444444444...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test28299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28299");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("uuuuuuuuHI!HI!HI!HI!HI!HI!HI!HI!HI!HI444uuuuuuuuuaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "0444...44444444444444444444444444444444440TRUE-1.0097...44");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test28300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28300");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("A0000000000", ' ');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test28301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28301");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR4444a444440TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00T", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "444440TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00Ta0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR4444" + "'", str2, "444440TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00Ta0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR4444");
    }

    @Test
    public void test28302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28302");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("44444444444444444444...40004000400040004000400040004000400040004000400040004000400040004000400040004000400040004000400040004000400040004000400040004000400040004000400040004000400040004000400040004000400040004000400040004000400040004000400040004000400040004000400040004000400040004000400040004000400040004000400040004000400040004000400040004000400040004000400040004000400040004000400040004000400040004000400040004000400040004000400040004000400040004000400040004000400040004000400040004000400040004000400040004000400040004000400040004000400040004000400040004000400040004000400040004000400040004000400040004000400040004000400040004000400040004000400040004000400040004", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44444444444444444444...40004000400040004000400040004000400040004000400040004000400040004000400040004000400040004000400040004000400040004000400040004000400040004000400040004000400040004000400040004000400040004000400040004000400040004000400040004000400040004000400040004000400040004000400040004000400040004000400040004000400040004000400040004000400040004000400040004000400040004000400040004000400040004000400040004000400040004000400040004000400040004000400040004000400040004000400040004000400040004000400040004000400040004000400040004000400040004000400040004000400040004000400040004000400040004000400040004000400040004000400040004000400040004000400040004000400040004" + "'", str2, "44444444444444444444...40004000400040004000400040004000400040004000400040004000400040004000400040004000400040004000400040004000400040004000400040004000400040004000400040004000400040004000400040004000400040004000400040004000400040004000400040004000400040004000400040004000400040004000400040004000400040004000400040004000400040004000400040004000400040004000400040004000400040004000400040004000400040004000400040004000400040004000400040004000400040004000400040004000400040004000400040004000400040004000400040004000400040004000400040004000400040004000400040004000400040004000400040004000400040004000400040004000400040004000400040004000400040004000400040004000400040004");
    }

    @Test
    public void test28303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28303");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("                       #A#44444444444444444444#...#44444444444444444444444444444444444444...", (double) 57);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 57.0d + "'", double2 == 57.0d);
    }

    @Test
    public void test28304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28304");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "...aaaa...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test28305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28305");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("4444aaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4444aaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "4444aaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test28306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28306");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(232, 502, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void test28307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28307");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("true-1.97.4444444444444444444444444444444444444444444                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            ", 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "true-1...." + "'", str2, "true-1....");
    }

    @Test
    public void test28308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28308");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 96.0f, (double) 52.0f, (double) 94L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 96.0d + "'", double3 == 96.0d);
    }

    @Test
    public void test28309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28309");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H" + "'", str1, "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H");
    }

    @Test
    public void test28310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28310");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", 175, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "                   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test28311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28311");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("0444444444...4444444444........444444444444444444.444444444...4444444444........4444444444444444440010444444444...4444444444........444444444444444444.444444444...4444444444........4444444444444444440444444444...4444444444........444444444444444444hi");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ih444444444444444444........4444444444...4444444440444444444444444444........4444444444...444444444.444444444444444444........4444444444...4444444440100444444444444444444........4444444444...444444444.444444444444444444........4444444444...4444444440" + "'", str1, "ih444444444444444444........4444444444...4444444440444444444444444444........4444444444...444444444.444444444444444444........4444444444...4444444440100444444444444444444........4444444444...444444444.444444444444444444........4444444444...4444444440");
    }

    @Test
    public void test28312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28312");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("##100.0###", 164, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "##100.0###4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str3, "##100.0###4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test28313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28313");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("aaaaaaaaaaa444##444440true-1.0097...4444444444444444444440true-1#0097###444444444444##444440true-1.0097...4444444444444444444440true-1#0097###44...444##444440true-1.0097...4444444444444444444440true-1#0097###444444444444##444440true-1.0097...4444444444444444444440true-1#0097###44...444##444440true-1.0097...4444444444444444444440true-1#0097###444444444444##444440true-1.0097...4444444444444444444440true-1#0097###44...444##444440true-1.0097...4444444444444444444440true-1#0097###444444##444440true-1.0097...4444444444444444444440true-1#0097###44...444##444440true-1.0097...4444444444444444444440true-1#0097###44aaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test28314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28314");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "a0aaaaa              0true-1.0097.00true-1.0097.00trAaaaaaaaaaa4444444...4444444...4444444...4a0aaaaa              0true-1.0097.00true-1.0097.00tr");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test28315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28315");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test28316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28316");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("TRUE-1.0aaaaA44444...", "0true-1.0                                               41004.404                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test28317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28317");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444 a4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test28318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28318");
        char[] charArray10 = new char[] { ' ', '4', 'a', 'a', 'a' };
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "100.0", charArray10);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray10);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "44444444444444444444444444444444444444444444true-1.497.44444444444444444444444444444444444444444444", charArray10);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "...44444444444444444444444444444444440true-1.0097...", charArray10);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "                                            100.01aaaaaaaaaaa4444444...4444444...4444444...41aaaaaaaaaaa4444444...4444444...4444444...41aaaaaaaaaaa4444444...4444444...4444444...41aaaaaaaaaaa4444444...4444444...4444444...41aaaaaaaaaaa4444444...4444444...4444444...41aaaaaaaaaaa4444444...4444444...4444444...41aaaaaaaaaaa4444444...4444444...4444444...41aaaaaaaaaaa4444444...4444444...4444444...41aaaaaaaaaaa4444444...4444444...4444444...41aaaaaaaaaaa4444444...4444444...4444444...41aaaaaaaaaaa4444444...4444444...4444444...41aaaaaaaaaaa4444444...444444", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), " 4aaa");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), " 4aaa");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[ , 4, a, a, a]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 44 + "'", int13 == 44);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 44 + "'", int15 == 44);
    }

    @Test
    public void test28319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28319");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("###########################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test28320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28320");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...444444", "0aaaa 0aaaa 0aaaa", "1");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...444444" + "'", str3, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...444444");
    }

    @Test
    public void test28321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28321");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("                                                                ...", 93, "A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "A         A                                                                  ...A         A  " + "'", str3, "A         A                                                                  ...A         A  ");
    }

    @Test
    public void test28322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28322");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort(" 0044444440004444444000444444400");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test28323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28323");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt044444444444444444444444444440TRUE-1.0097.04444444444444444444444444444444444444444440TRUE-1.0097.0444444444444444444444444444", "A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt044444444444444444444444444440TRUE-1.0097.04444444444444444444444444444444444444444440TRUE-1.0097.0444444444444444444444444444" + "'", str2, "aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt044444444444444444444444444440TRUE-1.0097.04444444444444444444444444444444444444444440TRUE-1.0097.0444444444444444444444444444");
    }

    @Test
    public void test28324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28324");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("4444444...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                                                                                   ", (byte) 100);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 100 + "'", byte2 == (byte) 100);
    }

    @Test
    public void test28325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28325");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "                 aaaa0aaaaa    ", (java.lang.CharSequence) "                                                  4444444444444444444444444444444444444444444TRUE-1.97.4444444444444444444444444444444444444444444444444444444444444444444444444444444444444TRUE-1.97.4444444444444444444444444444444444444444444                                                   ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 17 + "'", int2 == 17);
    }

    @Test
    public void test28326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28326");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!                            100.0                                                     aaaahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h", 236, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!                            100.0                                                     aaaahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h4444444444444444444444444444444444444444444444444444444" + "'", str3, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!                            100.0                                                     aaaahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h4444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test28327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28327");
        float[] floatArray6 = new float[] { (short) 1, 9, 100.0f, 86, (byte) -1, (byte) 0 };
        float float7 = org.apache.commons.lang3.math.NumberUtils.max(floatArray6);
        float float8 = org.apache.commons.lang3.math.NumberUtils.min(floatArray6);
        float float9 = org.apache.commons.lang3.math.NumberUtils.min(floatArray6);
        float float10 = org.apache.commons.lang3.math.NumberUtils.max(floatArray6);
        float float11 = org.apache.commons.lang3.math.NumberUtils.min(floatArray6);
        float float12 = org.apache.commons.lang3.math.NumberUtils.max(floatArray6);
        float float13 = org.apache.commons.lang3.math.NumberUtils.min(floatArray6);
        float float14 = org.apache.commons.lang3.math.NumberUtils.min(floatArray6);
        float float15 = org.apache.commons.lang3.math.NumberUtils.min(floatArray6);
        float float16 = org.apache.commons.lang3.math.NumberUtils.max(floatArray6);
        float float17 = org.apache.commons.lang3.math.NumberUtils.min(floatArray6);
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray6), "[1.0, 9.0, 100.0, 86.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 100.0f + "'", float7 == 100.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + (-1.0f) + "'", float8 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + (-1.0f) + "'", float9 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 100.0f + "'", float10 == 100.0f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + (-1.0f) + "'", float11 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 100.0f + "'", float12 == 100.0f);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + (-1.0f) + "'", float13 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + (-1.0f) + "'", float14 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + (-1.0f) + "'", float15 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 100.0f + "'", float16 == 100.0f);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + (-1.0f) + "'", float17 == (-1.0f));
    }

    @Test
    public void test28328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28328");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("                                      4444400       0444444                                      ", "                                                                                                      ", 44);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test28329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28329");
        java.lang.String[] strArray0 = null;
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.stripAll(strArray0, "44444444444                                                                                                 44444444444");
        org.junit.Assert.assertNull(strArray2);
    }

    @Test
    public void test28330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28330");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid(".79  .1-EURT44eurt", 60, 99);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test28331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28331");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("                                     100.0                                                     aaaa                                     ", 96, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                     100.0                                                     aaaa                                     " + "'", str3, "                                     100.0                                                     aaaa                                     ");
    }

    @Test
    public void test28332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28332");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("0true-1.00", 'a');
        boolean boolean4 = org.apache.commons.lang3.StringUtils.startsWithAny("...444444440 true - 1 . 0097 . 04444444444444444444444444444444444444444440 true - 1 . 0097 . 0444444444444444444444444444444...", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test28333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28333");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA   #################################################", ' ');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test28334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28334");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("04true4-414.400974.4004true4-414.400974.4004true4-414.400974.4004tr4 4A4 ", 400);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test28335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28335");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaatrue4-4449744", "...44444444444444444444444444444444440TRUE-1.0097...a...44444444444444444444444444444444440TRUE-1.0097... ...44444444444444444444444444444444440TRUE-1.0097...a...44444444444444444444444444444444440TRUE-1.0097... ...44444444444444444444444444444444440TRUE-1.0097...100...44444444444444444444444444444444440TRUE-1.0097.......44444444444444444444444444444444440TRUE-1.0097...0...44444444444444444444444444444444440TRUE-1.0097... ...44444444444444444444444444444444440TRUE-1.0097...a...44444444444444444444444444444444440TRUE-1.0097... ...44444444444444444444444444444444440TRUE-1.0097...a...44444444444444444444444444444444440TRUE-1.00");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test28336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28336");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("", "0aaaa 0aaaa 0aaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test28337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28337");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("H!ih!h!ih!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test28338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28338");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(168, 788, 149);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 149 + "'", int3 == 149);
    }

    @Test
    public void test28339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28339");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A!hi!h!hi!h");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a!HI!H!HI!H" + "'", str1, "a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a!HI!H!HI!H");
    }

    @Test
    public void test28340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28340");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("0TRUE-1.0aaaaA44444...", "4444444444444444444444444444444444444444444TRUE-1.97.4444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0TRUE-1.0aaaaA44444..." + "'", str2, "0TRUE-1.0aaaaA44444...");
    }

    @Test
    public void test28341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28341");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("44........4444444444444444444444444444444.....4444444444444444444444444444...4444444444........4444444444444444444444444444...4444444444........4444444444444444444444444444.", "#true#-#1#.#0097#.#04444444444444444444444444444444444444444440#true#-#1#.#0097#.#04444444444444444444444444444444444444444440#true#-#1#.#0097#.#04444444444444444444444444444444444444444440#true#-#1#.#0097#.#04444444444444444444444444444444444444444440#true#-#1#.#0097#.#04444444444444444444444444444444444444444440#true#-#1#.#0097#.#04444444444444444444444444444444444444444440#true#-#1#.#0097#.#04444444444444444444444444444444444444444440#true#-#1#.#0097#.#04444444444444444444444444444444444444444440#true#-#1#.#0097#.#04444444444444444444444444444444444444444440#true#-#1#.#0097#.#0444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44........4444444444444444444444444444444.....4444444444444444444444444444...4444444444........4444444444444444444444444444...4444444444........4444444444444444444444444444." + "'", str2, "44........4444444444444444444444444444444.....4444444444444444444444444444...4444444444........4444444444444444444444444444...4444444444........4444444444444444444444444444.");
    }

    @Test
    public void test28342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28342");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("                                                                                     a A 1000 A A                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ", "4A4 4rt4004.479004.414-4eurt4004.47444444444444444444444444444444444444444444444444444 4A4 4rt4004.479004.414-4eurt4004.47                                       A HI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                                                                                                                                                                                                                                                                                                                                                                                                                 ", "...7.044444444444444444444444444...");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                     a A 1000 A A                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    " + "'", str3, "                                                                                     a A 1000 A A                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ");
    }

    @Test
    public void test28343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28343");
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
        java.lang.String[] strArray38 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "hi!hi!hi!");
        java.lang.String str39 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("A   HI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAA", strArray23, strArray38);
        java.lang.String[] strArray42 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("a0a", "0true-1.0097.044444444444444444444444444444444444444444");
        java.lang.String str44 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray42, '#');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str45 = org.apache.commons.lang3.StringUtils.replaceEach("RT00.7900.1-EURT00.7900.1-EURT00.7900.1-EURT0ART00.7900.1-EURT00.7900.1-EURT00.7900.1-E", strArray38, strArray42);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 1 vs 2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "A   HI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str39, "A   HI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "a#a" + "'", str44, "a#a");
    }

    @Test
    public void test28344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28344");
        java.lang.CharSequence charSequence4 = null;
        char[] charArray11 = new char[] { '4', '4', ' ' };
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "0", charArray11);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsAny("a", charArray11);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "44444444444444444444444444444444444444444440true-1.0097.0", charArray11);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsOnly(charSequence4, charArray11);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "                                                                                               100.0", charArray11);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsAny("  A      A                            100.0                                                     aaaa", charArray11);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "4444444444444444444444444444444444444444444true-1.97.4444444444444444444444444444444444444444444444444444444444444444444444444444444444444true-1.97.4444444444444444444444444444444444444444444", charArray11);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "44 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "44 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[4, 4,  ]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 43 + "'", int18 == 43);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
    }

    @Test
    public void test28345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28345");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("                                                                                                 ", "aaaaaaa44444444444444444444444444444444444444444440true-1.0097.  A    44444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    44444444!hi!hi!hi...    A0true-1.0097.0aaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1.0097.0aaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaa44444444444444444444444444444444444444444440true-1.0097.  A    44444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    44444444!hi!hi!hi...    A0true-1.0097.0aaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1.0097.0aaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "aaaaaaa44444444444444444444444444444444444444444440true-1.0097.  A    44444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    44444444!hi!hi!hi...    A0true-1.0097.0aaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1.0097.0aaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test28346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28346");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("A   hi0hi0hi0hi0hi0hi0hi0hi0hi0hi...    AA   hi0hi0hi0hi0hi0hi0hi0hi0hi0hi...    AA   hi0hi0hi0hi0hi0hi0hi0hi0hi0hi...    AA   hi0hi0hi0hi0hi0hi0hi0hi0hi0hi...    AA   hi0hi0hi0hi0hi0hi0hi0hi0hi0hi...    AA   hi0hi0hi0hi0hi0hi0hi0hi0hi0hi...    AA   hi0hi0hi0hi0hi0hi0hi0hi0hi0hi...    AA   hi0hi0hi0hi0hi0hi0hi0hi0hi0hi...    AA   hi0hi0hi0hi0hi0hi0hi0hi0hi0hi...    AA   hi0hi0hi0hi0hi0hi0hi0hi0hi0hi...    AA   hi0hi0hi0hi0hi0hi0hi0hi0hi0hi...    AA   hi0hi0hi0hi0hi0hi0hi0hi0hi0hi...    AA   hi0hi0hi0hi0hi0hi0hi0hi0hi0hi...    AA   hi0hi0hi0hi0hi0hi0hi0hi0hi0hi...    AA   hi0hi0hi0hi0hi0hi0hi0hi0hi0hi...    AA   hi0hi0hi0hi0hi0hi0hi0hi0hi0hi...    AA   hi0hi0hi0hi0hi0hi0hi0hi0hi0hi...    AA   hi0hi0hi0hi0hi0hi0hi0hi0hi0hi...    AA   hi0hi0hi0hi0hi0hi0hi0hi0hi0hi...    AA   hi0hi0hi0hi0hi0hi0hi0hi0hi0hi...    AA   hi0hi0hi0hi0hi0hi0hi0hi0hi0hi...    AA   hi0hi0hi0hi0hi0hi0hi0hi0hi0hi.");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test28347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28347");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                   4aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 841);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 841 + "'", int2 == 841);
    }

    @Test
    public void test28348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28348");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("          TRUE  ", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaAAAAAAAAAAAAAAAAAAAAAAAAAAAAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaAAAAAAAAAAAAAAAAAAAAAAAAAAAAhI!################################hI!################################hI!################################hI!################################hI!################################hI!################################hI!################################hI!################################hI!################################hI!################################hI!################################hI!################################hI!################################hI!################################hI!################################hI!################################hI!#######################");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test28349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28349");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("    ");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                               A44444                                               ", '4');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = org.apache.commons.lang3.StringUtils.replaceEach("Rue-1.0097.0", strArray2, strArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 1 vs 6");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test28350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28350");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("                                 4444444444444444444444444444444444444444444TRUE-1.97.4444444444444444444444444444444444444444444444444444444444444444444444444444444444444TRUE-1.97.4444444444444444444444444444444444444444444", '4', 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaTRUE-1.97.aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaTRUE-1.97.aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "                                 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaTRUE-1.97.aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaTRUE-1.97.aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test28351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28351");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("4444444444444444444444444444444444444444444444444444444444", 20, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4444444444444444444444444444444444444444444444444444444444" + "'", str3, "4444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test28352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28352");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", (java.lang.CharSequence) "44444444444444444444444444444444444444444440TRUE-1.0097.     A    4444444444444444444444444444444444444444444440TRUE-1.0097.     A    4444444444444444444444444444444444444444444440TRUE-1.0097.     A    4444444444444444444444444444444444444444444440TRUE-1.0097.     A    4444444444444444444444444444444444444444444440TRUE-1.0097.     A    4444444444444444444444444444444444444444444440TRUE-1.0097.     A    4444444444444444444444444444444444444444444440TRUE-1.0097.     A    4444444444444444444444444444444444444444444440TRUE-1.0097.     A    4444444444444444444444444444444444444444444440TRUE-1.0097.     A    4444444444444444444444444444444444444444444440TRUE-1.0097.");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test28353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28353");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("                                                                                                                   ", 648);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test28354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28354");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "...44");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test28355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28355");
        java.lang.String[] strArray1 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithAny("                                      100.0", strArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test28356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28356");
        java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("11111111111111111111111111111111111111111");
        org.junit.Assert.assertNotNull(number1);
    }

    @Test
    public void test28357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28357");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("44444aaaa0aaaaaaaaa0aaaaaaaaa0aaa...0...444444444444444444444444...44444444444444444444444444444...4444444444444444444444444444");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"4444aaaa0\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test28358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28358");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("...44444444444...                 aaaaaaaaaaa aaaa0aaaaa                                                                                                       aaaa0aaaaa                                                                                                       aaaa0aaaaa                                                                                                       aaaa0aaaaa                                                                                                       aaaa0aaaaa                                                                                                       aaaa0aaaaa                                    ", 40, "a0aaaaa0true-1.0097.0444");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...44444444444...                 aaaaaaaaaaa aaaa0aaaaa                                                                                                       aaaa0aaaaa                                                                                                       aaaa0aaaaa                                                                                                       aaaa0aaaaa                                                                                                       aaaa0aaaaa                                                                                                       aaaa0aaaaa                                    " + "'", str3, "...44444444444...                 aaaaaaaaaaa aaaa0aaaaa                                                                                                       aaaa0aaaaa                                                                                                       aaaa0aaaaa                                                                                                       aaaa0aaaaa                                                                                                       aaaa0aaaaa                                                                                                       aaaa0aaaaa                                    ");
    }

    @Test
    public void test28359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28359");
        char[] charArray14 = new char[] { ' ', '4', 'a', 'a', 'a' };
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "100.0", charArray14);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray14);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsAny("44444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444", charArray14);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "0true-1.0097.00true-1.0097.00true-1.0097.00tr    A     0true-1.0097.00true-1.0097.00true-1.0097.00t", charArray14);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!", charArray14);
        boolean boolean20 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "444444444444", charArray14);
        boolean boolean21 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...", charArray14);
        boolean boolean22 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "444                                      100.0                                                     aaaa444444444444444444444", charArray14);
        int int23 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "4A4 4rt4004.479004.414-4eurt4004.47444444444444444444444444444444444444444444444444444 4A4 4rt4004.479004.414-4eurt4004.47                                                                                     ", charArray14);
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
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
    }

    @Test
    public void test28360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28360");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("                                                                                                                                                        ...44444444444...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test28361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28361");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaa444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "                                       4true4-4449744                                        ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test28362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28362");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) 4, (short) 10, (short) (byte) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
    }

    @Test
    public void test28363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28363");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 608.0f, (double) 53.0f, (double) 96);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 608.0d + "'", double3 == 608.0d);
    }

    @Test
    public void test28364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28364");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444aaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444AAAA" + "'", str1, "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444AAAA");
    }

    @Test
    public void test28365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28365");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("##############################################################################################################################################################################################################################################################################################################################################################################HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH             A     ", "                         ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "##############################################################################################################################################################################################################################################################################################################################################################################HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH             A" + "'", str2, "##############################################################################################################################################################################################################################################################################################################################################################################HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH             A");
    }

    @Test
    public void test28366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28366");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h...", "0TRUE-1.0097.00T..0TRUE-1.0097.00T                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test28367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28367");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("TR.0097.00TR.0097.00TR.0097.00TR.0097.00TR.0097.00TR", 3, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test28368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28368");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("                                                                                                                                                                                                                                                                                                                                                        004444444000444444400044444440011                                                                                                                                                                                                                                                                                                                                                        ", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test28369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28369");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "RT00.7900.1-EURT00.7900.1-EURT00.7900.1-EURT0 A RT00.7900.1-EURT00.7900.1-EURT00.7900.1-EURT0##############################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test28370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28370");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("0true-");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test28371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28371");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("                                                                                                                                                                                                                        ", "##############################true-1.97.############################################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                        " + "'", str2, "                                                                                                                                                                                                                        ");
    }

    @Test
    public void test28372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28372");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "...44                             ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test28373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28373");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("A rt00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt", '4');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test28374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28374");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("4444444440097...##########################################0444##############################################4444444440097...#############################################################################################4444444440097...#############################################################################################4444444440097...#################################A hi!hi!hi!hi!hi!hi!hi!hi!hi!hi... A");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4444444440097...##########################################0444##############################################4444444440097...#############################################################################################4444444440097...#############################################################################################4444444440097...#################################A hi!hi!hi!hi!hi!hi!hi!hi!hi!hi... A" + "'", str1, "4444444440097...##########################################0444##############################################4444444440097...#############################################################################################4444444440097...#############################################################################################4444444440097...#################################A hi!hi!hi!hi!hi!hi!hi!hi!hi!hi... A");
    }

    @Test
    public void test28375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28375");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("!hi!hi!hi...    A0true-1.0097.0aaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1.0097.0aaaaaaaaaaaaaaaaaaaaaaa40true-1.0097.     A    40true-1.0097.     A    40true-1.0097.  A    4aaaaaaa444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test28376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28376");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("    A         A         A  A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A!hi!h!hi!h");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test28377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28377");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("   A         ", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "   A         " + "'", str2, "   A         ");
    }

    @Test
    public void test28378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28378");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                         100.097.044444444444444444444444444...                                                                                                                                                                                                                                                                                                          ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test28379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28379");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 123.0f, 589.0d, 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 589.0d + "'", double3 == 589.0d);
    }

    @Test
    public void test28380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28380");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("...                                                                                                                             ...", 201, 243);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test28381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28381");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("0true-1.0aaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...44444444444444444444444444444444440TRUE-1.0097");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test28382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28382");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("###########################################################################################################################################################################################################################################################################################################00       000       000       00A###########################################################################################################################################################################################################################################################################################################", "", "44444AAAA0AAAAAAAAA0AAAAAAAAA0AAA...0...444444444444444444444444...44444444444444444444444444444...4444444444444444444444444444");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test28383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28383");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("...A ..", "...444###################################################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...A .." + "'", str2, "...A ..");
    }

    @Test
    public void test28384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28384");
        java.lang.CharSequence charSequence1 = null;
        char[] charArray10 = new char[] { '4', '4', ' ' };
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "0", charArray10);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsAny("a", charArray10);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsAny("                  4                   0true-1.0097.04444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444", charArray10);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsAny("00       000       000       00a", charArray10);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "44444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444", charArray10);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAny(charSequence1, charArray10);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "#a######################...##############################################", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "44 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "44 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[4, 4,  ]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 43 + "'", int15 == 43);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test28385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28385");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("                                                                                                                                                                                                                                                                          ", 741, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                                                                                                                                                                                                          " + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                                                                                                                                                                                                          ");
    }

    @Test
    public void test28386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28386");
        char[] charArray9 = new char[] { '4', '4', ' ' };
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "0", charArray9);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444", charArray9);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "    A     ", charArray9);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "TRUE-1.  97.", charArray9);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "IH", charArray9);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "                 ...                                                     AAAAAAAAAAAAAAAAAAAAAAAAA", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "44 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "44 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[4, 4,  ]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 17 + "'", int15 == 17);
    }

    @Test
    public void test28387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28387");
        float[] floatArray4 = new float[] { 100, (byte) -1, (short) 1, (byte) -1 };
        float float5 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        float float6 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        float float7 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        float float8 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        float float9 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        float float10 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        float float11 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        float float12 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
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
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + (-1.0f) + "'", float12 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 100.0f + "'", float13 == 100.0f);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + (-1.0f) + "'", float14 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + (-1.0f) + "'", float15 == (-1.0f));
    }

    @Test
    public void test28388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28388");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("..........................................", "hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhTRUEhh");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray3);
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.split("0097...#############################################################################################", "44444444444444444444444444444444444444444440                                                                                                                                                                                                                                                                          true-1.0                                                                                                                                                                                                                                                                          97.0                                                                                                                                                                                                                                                                          4444444444444444444444444444444444444444444");
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("                                                                                                                                                                                                                                                                                                                                                                                     4444444444444444444444444444444444444444444true-1.97.4444444444444444444444444444444444444444444                                                                                                                                                                                                                                                                                                                                                                                     ", strArray3, strArray7);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ".........................................." + "'", str4, "..........................................");
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                     4444444444444444444444444444444444444444444true-1.97.4444444444444444444444444444444444444444444                                                                                                                                                                                                                                                                                                                                                                                     " + "'", str8, "                                                                                                                                                                                                                                                                                                                                                                                     4444444444444444444444444444444444444444444true-1.97.4444444444444444444444444444444444444444444                                                                                                                                                                                                                                                                                                                                                                                     ");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + ".........................................." + "'", str9, "..........................................");
    }

    @Test
    public void test28389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28389");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4                                                   ", "00000e0000");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4                                                   " + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4                                                   ");
    }

    @Test
    public void test28390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28390");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("0true-1.0097.044444444444444444444444444...");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test28391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28391");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("aaaaaaaaa", "                                                                                                                                   ", 57);
        java.lang.Class<?> wildcardClass4 = strArray3.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test28392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28392");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("###############################################################################################", '#');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test28393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28393");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "100.0aaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test28394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28394");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("4444444..444444444444444440T", 232, "a0aaaaa              0true-1.0097.00true-1.0097.00true-1.0097.00tr    A     0true-1.0097.00true-1.0097.00true-1.0097.00tr");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4444444..444444444444444440Ta0aaaaa              0true-1.0097.00true-1.0097.00true-1.0097.00tr    A     0true-1.0097.00true-1.0097.00true-1.0097.00tra0aaaaa              0true-1.0097.00true-1.0097.00true-1.0097.00tr    A     0true-1" + "'", str3, "4444444..444444444444444440Ta0aaaaa              0true-1.0097.00true-1.0097.00true-1.0097.00tr    A     0true-1.0097.00true-1.0097.00true-1.0097.00tra0aaaaa              0true-1.0097.00true-1.0097.00true-1.0097.00tr    A     0true-1");
    }

    @Test
    public void test28395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28395");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "     4A4    ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test28396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28396");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat("                                                                                                                                                                                                                                                                                                                                                                             444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test28397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28397");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "hI!################################");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test28398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28398");
        char[] charArray11 = new char[] { '4', '4', ' ' };
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "0", charArray11);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444", charArray11);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "    A     ", charArray11);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", charArray11);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "44444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444", charArray11);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsAny("", charArray11);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "0true-1.0097.044444444444444444444444444 ...aaaaaaaaaaaaaaaaaaaaaaaaa...aaaaaaaaaaaaaa###0.001##...aaaaaaaaaaaaaaaaaaaaaaaaa...aaaaaaaaaaaaaa", charArray11);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", charArray11);
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
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 14 + "'", int18 == 14);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test28399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28399");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("A         A         A         A         A         A         A         A         A         A         A         A         A         A ...", "                                                                                                                                                                                                                        4444A44444                                                                                                                                                                                                                          ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test28400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28400");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("                                                                                                                                                                                                                                                                                                                                                                                                              444440true-1.0097...4                                                                                                                                                                                                                                                                                                                                                                                                              ");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test28401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28401");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("AHI!HI!HI!HI!HI!HI!HI!HI!HI!HI...AAHI!HI!HI!HI!HI!HI!HI!HI!HI!HI...AAHI!HI!HI!HI!HI!HI!HI!HI!HI!HI...AAHI!HI!HI!HI!HI!HI!HI!HI!HI!HI...AAHI!HI!HI!HI!HI!HI!HI!HI!HI!HI..444444444444444444444444444440TRUE-1.0097.A4444444444444444444444444444444444444444444440TRUE-1.0097.A4444444444444444444444444444444444444444444440TRUE-1.0097.A4444444444444444444444444444444444444444444440TRUE-1.0097.A4444444444444444444444444444444444444444444440TRUE-1.0097.A4444444444444444444444444444444444444444444440TRUE-1.0097.A4444444444444444444444444444444444444444444440TRUE-1.0097.A4444444444444444444444444444444444444444444440TRUE-1.0097.A4444444444444444444444444444444444444444444440TRUE-1.0097.A4444444444444444444444444444444444444444444440TRUE-1.0097.", "....4444444444444444444444444444..", "4044444444444444444444444444                                                                                    0true-1.0097.044444444444444444444444444");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test28402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28402");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("a0aaaaa              0true-1.0097.0444", 29);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "a0aaaaa              0true-1.0097.0444" + "'", str2, "a0aaaaa              0true-1.0097.0444");
    }

    @Test
    public void test28403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28403");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("0a44444444444444444444444444444444444444444440true-1.0097.0a0a44444444444444444444444444444444444444444440true-1.0097.0a0a44444444444444444444444444444444444444444440true-1.0097.0a0a44444444444444444444444444444444444444444440true-1.0097.0a0a44444444444444444444444444444444444444444440true-1.0097.0a0a44444444444444444444444444444444444444444440true-1.0097.0a0a44444444444444444444444444444444444444444440true-1.0097.0a0a44444444444444444444444444444444444444444440true-1.0097.0a0a44444444444444444444444444444444444444444440true-1.0097.0a0a44444444444444444444444...a1414141444444444444444444444444", 660);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0a44444444444444444444444444444444444444444440true-1.0097.0a0a44444444444444444444444444444444444444444440true-1.0097.0a0a44444444444444444444444444444444444444444440true-1.0097.0a0a44444444444444444444444444444444444444444440true-1.0097.0a0a44444444444444444444444444444444444444444440true-1.0097.0a0a44444444444444444444444444444444444444444440true-1.0097.0a0a44444444444444444444444444444444444444444440true-1.0097.0a0a44444444444444444444444444444444444444444440true-1.0097.0a0a44444444444444444444444444444444444444444440true-1.0097.0a0a44444444444444444444444...a1414141444444444444444444444444" + "'", str2, "0a44444444444444444444444444444444444444444440true-1.0097.0a0a44444444444444444444444444444444444444444440true-1.0097.0a0a44444444444444444444444444444444444444444440true-1.0097.0a0a44444444444444444444444444444444444444444440true-1.0097.0a0a44444444444444444444444444444444444444444440true-1.0097.0a0a44444444444444444444444444444444444444444440true-1.0097.0a0a44444444444444444444444444444444444444444440true-1.0097.0a0a44444444444444444444444444444444444444444440true-1.0097.0a0a44444444444444444444444444444444444444444440true-1.0097.0a0a44444444444444444444444...a1414141444444444444444444444444");
    }

    @Test
    public void test28404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28404");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("AAAAAAA...", (float) 266L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 266.0f + "'", float2 == 266.0f);
    }

    @Test
    public void test28405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28405");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("", "                                               100.0                                                ", (int) (short) 100);
        java.lang.String[] strArray12 = new java.lang.String[] { "a", "444444444444444444444444...44444444444444444444444444444444440true-1.0097...444444444444444444444444", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", "4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...", "44444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444" };
        java.lang.String[] strArray14 = org.apache.commons.lang3.StringUtils.splitByCharacterType("");
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.replaceEach("0true-1.0097.00true-1.0097.00true-1.0097.00tr    A     0true-1.0097.00true-1.0097.00true-1.0097.00t", strArray12, strArray14);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("                                            100.0", strArray5, strArray12);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray12);
        java.lang.String[] strArray18 = org.apache.commons.lang3.StringUtils.stripAll(strArray12);
        java.lang.String[] strArray19 = org.apache.commons.lang3.StringUtils.stripAll(strArray18);
        java.lang.String str23 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray19, "                     aaaa0aaaaa              ", (int) (byte) 100, (-1));
        boolean boolean24 = org.apache.commons.lang3.StringUtils.startsWithAny("100.0                                                     aaaa", strArray19);
        java.lang.String str25 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray19);
        java.lang.Class<?> wildcardClass26 = strArray19.getClass();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "0true-1.0097.00true-1.0097.00true-1.0097.00tr    A     0true-1.0097.00true-1.0097.00true-1.0097.00t" + "'", str15, "0true-1.0097.00true-1.0097.00true-1.0097.00tr    A     0true-1.0097.00true-1.0097.00true-1.0097.00t");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "                                            100.0" + "'", str16, "                                            100.0");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "a444444444444444444444444...44444444444444444444444444444444440true-1.0097...444444444444444444444444hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...44444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444" + "'", str25, "a444444444444444444444444...44444444444444444444444444444444440true-1.0097...444444444444444444444444hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...44444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444");
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test28406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28406");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("a rt00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt0", 664, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "a rt00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt0                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         " + "'", str3, "a rt00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt0                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ");
    }

    @Test
    public void test28407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28407");
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
        byte byte15 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
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
        org.junit.Assert.assertTrue("'" + byte15 + "' != '" + (byte) 10 + "'", byte15 == (byte) 10);
    }

    @Test
    public void test28408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28408");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("444444444444444444444444...44444444444444444444444444444444440true-1.0097...444444444444444444444444", ' ', '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "444444444444444444444444...44444444444444444444444444444444440true-1.0097...444444444444444444444444" + "'", str3, "444444444444444444444444...44444444444444444444444444444444440true-1.0097...444444444444444444444444");
    }

    @Test
    public void test28409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28409");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("    A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A     ", "aaaaaaaaa");
        boolean boolean4 = org.apache.commons.lang3.StringUtils.startsWithAny("...4...4444444...4444444...4444444                                                                                                                          0", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test28410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28410");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "aaaa0aaaaa0aaaa0aaaaa0aaaa0aaaaa0aaaa0aaaaa0aaaa0aaaaa0aaaa0aaaaa0aaaa0aaaaa0aaaa0aaaaa0aaaa0aaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test28411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28411");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("IHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIH", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test28412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28412");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) 0, (short) (byte) -1, (short) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test28413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28413");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa444                                                   44444444444444444444444444444444444444444444444444444444444444444444444444444");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa444                                                   44444444444444444444444444444444444444444444444444444444444444444444444444444\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test28414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28414");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("7.4444444444444444444444444444444444444444444", "                                                                                                                                                                                                                                                            0true-1.0097.044444444444444444444444444...                                                                                                                                                                                                                                                             ", 12);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test28415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28415");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("   4444444...aaaaaaaaa44444444444444444444444444444444444444444", "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444                                                                                                aaaa", 479);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test28416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28416");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("                                                                                                                                                                                                                                                                                       0TRUE-1.04444444444444444444444444444444444444444444                                                                                                                                                                                                                                                                                                                                                                                                           ", "4444444444444444444444A A A A 444444444444444440TRUE-1.0097.  A    44444444444444444440TRUE-1.0097.     A    4444444444444444444444444444444444444444444440TRUE-1.0097.     A    4444444444444444444444444444444444444444444440TRUE-1.0097.     A    4444444444444444444444444444444444444444444440TRUE-1.0097.     A    4444444444444444444444444444444444444444444440TRUE-1.0097.     A    4444444444444444444444444444444444444444444440TRUE-1.0097.     A    4444444444444444444444444444444444444444444440TRUE-1.0097.     A    4444444444444444444444444444444444444444444440TRUE-1.0097.     A    4444444444444444444444444444444444444444444440TRUE-1.0097");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                       0TRUE-1.04444444444444444444444444444444444444444444                                                                                                                                                                                                                                                                                                                                                                                                           " + "'", str2, "                                                                                                                                                                                                                                                                                       0TRUE-1.04444444444444444444444444444444444444444444                                                                                                                                                                                                                                                                                                                                                                                                           ");
    }

    @Test
    public void test28417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28417");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("a0true-1.0097.04444444444444444444444444444444444444444440true-1.0097.044444444444444444444444444aa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "a0true-1.0097.04444444444444444444444444444444444444444440true-1.0097.044444444444444444444444444aa" + "'", str1, "a0true-1.0097.04444444444444444444444444444444444444444440true-1.0097.044444444444444444444444444aa");
    }

    @Test
    public void test28418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28418");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min(0L, 37L, (long) 138);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test28419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28419");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test28420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28420");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("...A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A...", "...........");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A..." + "'", str2, "...A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A...");
    }

    @Test
    public void test28421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28421");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("    ...44444444444444444444444444444444440TRUE-1.0097...a...44444444444444444444444444444444440TRUE-1.0097...         ...44444444444444444444444444444444440TRUE-1.0097...a...44444444444444444444444444444444440TRUE-1.0097...                                                     ...44444444444444444444444444444444440TRUE-1.0097...100...44444444444444444444444444444444440TRUE-1.0097.......44444444444444444444444444444444440TRUE-1.0097...0...44444444444444444444444444444444440TRUE-1.0097...    ...44444444444444444444444444444444440TRUE-1.0097...a...44444444444444444444444444444444440TRUE-1.0097...         ...44444444444444444444444444444444440TRUE-1.0097...a...44444444444444444444444444444444440TRUE-1.0097...         ", 419);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 419 + "'", int2 == 419);
    }

    @Test
    public void test28422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28422");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("", "   A         ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test28423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28423");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "...I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...", (java.lang.CharSequence) "4 0true-1.0097.04444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 95 + "'", int2 == 95);
    }

    @Test
    public void test28424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28424");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference(" 1aaaaaaaaaaa4444444...4444444...4444444...4  ", "                                                                                                                                                                                                                                                                                                                                            !IH                                                                                                                                                                                                                                                                                                                                            ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                                                           !IH                                                                                                                                                                                                                                                                                                                                            " + "'", str2, "                                                                                                                                                                                                                                                                                                                                           !IH                                                                                                                                                                                                                                                                                                                                            ");
    }

    @Test
    public void test28425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28425");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "a HI!HI!HI!HI!HI!HI!HI!HI!HI!HI... a               a HI!HI!HI!HI!HI!HI!HI!HI!HI!HI... a               a HI!HI!HI!HI!HI!HI!HI!HI!HI!HI... a               a HI!HI!HI!HI!HI!HI!HI!HI!HI!HI... a               a HI!HI!HI!HI!HI!HI!HI!HI!HI!HI..444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test28426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28426");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "aaaaaaaaa4                                                   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test28427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28427");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("                                      100.0                                                ");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, '4');
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray1);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, "aaaaaaaaaaaaaaaaaaaaaaaaaaa                     AAAA0AAAAA           aaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                      41004.404                                                " + "'", str3, "                                      41004.404                                                ");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaa                     AAAA0AAAAA           aaaaaaaaaaaaaaaaaaaaaaaaaaaa100aaaaaaaaaaaaaaaaaaaaaaaaaaa                     AAAA0AAAAA           aaaaaaaaaaaaaaaaaaaaaaaaaaaa.aaaaaaaaaaaaaaaaaaaaaaaaaaa                     AAAA0AAAAA           aaaaaaaaaaaaaaaaaaaaaaaaaaaa0aaaaaaaaaaaaaaaaaaaaaaaaaaa                     AAAA0AAAAA           aaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str6, "aaaaaaaaaaaaaaaaaaaaaaaaaaa                     AAAA0AAAAA           aaaaaaaaaaaaaaaaaaaaaaaaaaaa100aaaaaaaaaaaaaaaaaaaaaaaaaaa                     AAAA0AAAAA           aaaaaaaaaaaaaaaaaaaaaaaaaaaa.aaaaaaaaaaaaaaaaaaaaaaaaaaa                     AAAA0AAAAA           aaaaaaaaaaaaaaaaaaaaaaaaaaaa0aaaaaaaaaaaaaaaaaaaaaaaaaaa                     AAAA0AAAAA           aaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test28428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28428");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "    a  ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test28429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28429");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("a         a    0001                       aaaaaaaaaaaaaaaaaaa0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.00....444444440tr...aaaaaaaaaaaaaaaaaa", "97 true-1.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "a         a    0001                       aaaaaaaaaaaaaaaaaaa0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.00....444444440tr...aaaaaaaaaaaaaaaaaa" + "'", str2, "a         a    0001                       aaaaaaaaaaaaaaaaaaa0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.00....444444440tr...aaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test28430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28430");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "        04true4-414.400974.4004true4-414.400974.4004true4-414.400974.4004tr4 4A4", "                                                                                                                                  aaaa0                                                                                                                                  ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test28431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28431");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("     a    44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444", "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test28432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28432");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "00aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test28433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28433");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("44444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-eurt04444444444444444444444444444444444444444444", "00true-1.0097.00trA0true-1.0097.00true-1.0097.00true-1.0097.00tr", "          aaaa");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "44444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-eurt04444444444444444444444444444444444444444444" + "'", str3, "44444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-eurt04444444444444444444444444444444444444444444");
    }

    @Test
    public void test28434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28434");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("   AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA44444444444444444440true-1.0097.444444444444444444444444                                                                                                                                                                                                                                                                                                                                                           ", "aA44444A44a44444aA44444A44a44444aA44444A44a44444aA44444A44a44444aA44444A44a44444aA44444A44a44444aA44444A44a44444aA44444A44a44444aA44444A44a44444aA44444A44a44444aA44444A44a44444aA44444A44a44444aA44444A44a44444aA44444A44a44444aA44444A44a44444aA44444A44a44444aA44444A44a44444aA44444A44a44444aA44444A44a44444aA44444A44a4444444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444#44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444#44444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444", "                                                                                                                                  0AAAA                                                                                                                                  ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                " + "'", str3, "                                                                                                                                                                                                                                                                                                                                                                                                                                                ");
    }

    @Test
    public void test28435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28435");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfBlank((java.lang.CharSequence) "0true-1.0              ...", (java.lang.CharSequence) "...7900...7900...7900...7900");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "0true-1.0              ..." + "'", charSequence2, "0true-1.0              ...");
    }

    @Test
    public void test28436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28436");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("att-------ttt-------ttt-------tt");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ATT-------TTT-------TTT-------TT" + "'", str1, "ATT-------TTT-------TTT-------TT");
    }

    @Test
    public void test28437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28437");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "           a");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "           a" + "'", str1, "           a");
    }

    @Test
    public void test28438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28438");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("0    -1.0097.00    -1.0097.00    -1.0097.00   a 0    -1.0097.00    -1.0097.00    -1.0097.00", 123, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi!hi!hi!hi0true-1.0097.00true-1.0097.00true-1.0097.00trA0t...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0    -1.0097.00    -1.0097.00    -1.0097.00   a 0    -1.0097.00    -1.0097.00    -1.0097.00aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "0    -1.0097.00    -1.0097.00    -1.0097.00   a 0    -1.0097.00    -1.0097.00    -1.0097.00aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test28439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28439");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("###########################################true-197############################################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "###########################################true-197############################################" + "'", str1, "###########################################true-197############################################");
    }

    @Test
    public void test28440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28440");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   0true-1.0097.00true-1.0097.00true-1.0097.00trA0true-1.0097.00true-1.0097.00true-1.0097.00tr", (java.lang.CharSequence) "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test28441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28441");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("                                                                                                                                                                                            ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: A blank string is not a valid number");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test28442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28442");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("4444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444" + "'", str2, "4444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444");
    }

    @Test
    public void test28443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28443");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 100, (byte) 100 };
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        byte byte8 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte10 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte11 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        byte byte12 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[10, 100, 100]");
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 100 + "'", byte4 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 100 + "'", byte5 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 10 + "'", byte6 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 10 + "'", byte7 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 100 + "'", byte8 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 100 + "'", byte9 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte10 + "' != '" + (byte) 100 + "'", byte10 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) 10 + "'", byte11 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte12 + "' != '" + (byte) 10 + "'", byte12 == (byte) 10);
    }

    @Test
    public void test28444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28444");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "    a  ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "    a  " + "'", str1, "    a  ");
    }

    @Test
    public void test28445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28445");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("...444444444444444444444444444444444444444444444     4    444444444444444444444444444444444444444444444           444444444444444444444444444444444444444444444     4    444444444444444444444444444444444444444444444 ", '4');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test28446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28446");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("4444################################################################################################");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test28447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28447");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.split("                                             A    ", "0#true#-#1#.#0097#.#04444444444444444444444444444444444444444440#true#-#1#.#0097#.#04444444444444444444444444444444444444444440#true#-#1#.#0097#.#04444444444444444444444444444444444444444440#true#-#1#.#0097#.#04444444444444444444444444444444444444444440#true#-#1#.#0097#.#04444444444444444444444444444444444444444440#true#-#1#.#0097#.#04444444444444444444444444444444444444444440#true#-#1#.#0097#.#04444444444444444444444444444444444444444440#true#-#1#.#0097#.#04444444444444444444444444444444444444444440#true#-#1#.#0097#.#04444444444444444444444444444444444444444440#true#-#1#.#0097#.#0444444444444444444444444444444444444444444", 58);
        int int6 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("...44                            ", strArray5);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.concatWith("44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444true-1.00true-1.97.44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", (java.lang.Object[]) strArray5);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray5, '4');
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "                                             A    " + "'", str7, "                                             A    ");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "                                             A    " + "'", str9, "                                             A    ");
    }

    @Test
    public void test28448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28448");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "4444444444444444444444444444444444444444444TRUE4444444444444444444444444444444444444444444444444444444444444444444444444444444444444TRUE4444444444444444444444444444444444444444444", "97.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0a");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test28449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28449");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("###############################################################################################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "###############################################################################################" + "'", str1, "###############################################################################################");
    }

    @Test
    public void test28450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28450");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("0       000       00790       000       000       00-0       00eurt0       000       000       00790       000       000       00-0       00eurt0       000       000       00790       000       000       00-0       00eurt0       000       000       00790       000       000       00-0       00eurt0       000       000       00790       000       000       00-0       00eurt0       000       000       00790       000       000       00-0       00eurt0       000       000       00790       000       000       00-0       00eurt0       000       000       00790       000       000       00-0       00eurt0       000       000       00790       000       000       00-0       00eurt0       00", "####################aaa...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1.0097...aa                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       ######################################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0       000       00790       000       000       00-0       00eurt0       000       000       00790       000       000       00-0       00eurt0       000       000       00790       000       000       00-0       00eurt0       000       000       00790       000       000       00-0       00eurt0       000       000       00790       000       000       00-0       00eurt0       000       000       00790       000       000       00-0       00eurt0       000       000       00790       000       000       00-0       00eurt0       000       000       00790       000       000       00-0       00eurt0       000       000       00790       000       000       00-0       00eurt0       00" + "'", str2, "0       000       00790       000       000       00-0       00eurt0       000       000       00790       000       000       00-0       00eurt0       000       000       00790       000       000       00-0       00eurt0       000       000       00790       000       000       00-0       00eurt0       000       000       00790       000       000       00-0       00eurt0       000       000       00790       000       000       00-0       00eurt0       000       000       00790       000       000       00-0       00eurt0       000       000       00790       000       000       00-0       00eurt0       000       000       00790       000       000       00-0       00eurt0       00");
    }

    @Test
    public void test28451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28451");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.split("4444444..444444444444444440true-1.0097...44444444444444444444444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...", "                                      ...                                                     ");
        int int6 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("true-1.4444444...97", strArray5);
        int int7 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("7900.1-eurt0444444444444444444444444444444444444444444444    A     .7900.1-eurt0444444444444444444444444444444444444444444444    A     .7900.1-eurt0444444444444444444444444444444444444444444444    A     .7900.1-eurt0444444444444444444444444444444444444444444444    A     .7900.1-eurt0444444444444444444444444444444444444444444444    A     .7900.1-eurt0444444444444444444444444444444444444444444444    A     .7900.1-eurt0444444444444444444444444444444444444444444444    A     .7900.1-eurt0444444444444444444444444444444444444444444444    A     .7900.1-eurt0444444444444444444444444444444444444444444444    A     .7900.1-eurt04444444444444444444444444444444444444444444", strArray5);
        int int8 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("...#####...true-1.#######...97.#######...#############...                  #0000####################################################################000#########################################0000####################################################################000#########################################0000####################################################################000#########################################0000####################################################################000#########################################0000####################################################################000#########################################0000########", strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 7 + "'", int6 == 7);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 660 + "'", int7 == 660);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test28452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28452");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("#A#44444444444444444444#...#444444444444444444444444444444444444444444444     ", "00       0true00       0-00       000                                                        ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test28453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28453");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "a A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A...", (java.lang.CharSequence) ".true-1...97..44444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "a A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A..." + "'", charSequence2, "a A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A...");
    }

    @Test
    public void test28454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28454");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "44444444444444...7900.1-eurt044444");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 34 + "'", int1 == 34);
    }

    @Test
    public void test28455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28455");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("a0044444440004444444000444444400", (double) 73.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 73.0d + "'", double2 == 73.0d);
    }

    @Test
    public void test28456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28456");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("                                                ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: empty String");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test28457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28457");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "A HI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test28458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28458");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("0HHHH0HHHHH0TRUE-1H0097H0HHHH0HHHHH0TRUE-1H0097H0HHHH0HHHHH0TRUE-1H0097H0HHHH0HHHHH0TRUE-1H0097H0HHHH0HHHHH0TRUE-1H0097H0HHHH0HHHHH0TRUE-1H0097H0HHHH0HHHHH0TRUE-1H0097H0HHHH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHHH0H7900H1-EURT0HHHHH0HHHH0H7900H1-EURT0HHHHH0HHHH0H7900H1-EURT0HHHHH0HHHH0H7900H1-EURT0HHHHH0HHHH0H7900H1-EURT0HHHHH0HHHH0H7900H1-EURT0HHHHH0HHHH0H7900H1-EURT0HHHHH0HHHH0" + "'", str1, "HHHH0H7900H1-EURT0HHHHH0HHHH0H7900H1-EURT0HHHHH0HHHH0H7900H1-EURT0HHHHH0HHHH0H7900H1-EURT0HHHHH0HHHH0H7900H1-EURT0HHHHH0HHHH0H7900H1-EURT0HHHHH0HHHH0H7900H1-EURT0HHHHH0HHHH0");
    }

    @Test
    public void test28459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28459");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(156L, 111L, (long) 60);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 156L + "'", long3 == 156L);
    }

    @Test
    public void test28460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28460");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aa...", "       aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test28461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28461");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("00000e0000");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test28462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28462");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444400       000       000       00a");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test28463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28463");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(1, 451, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 451 + "'", int3 == 451);
    }

    @Test
    public void test28464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28464");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("                                                                                                                                                                              0    -1.0097.00    -1.0097.00    -1.0097.00   A 0    -1.0097.00    -1.0097.00    -1.0097.00  ", "                                 4444444444444444444444444444444444444444444TRUE-1.97.4444444444444444444444444444444444444444444444444444444444444444444444444444444444444TRUE-1.97.4444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test28465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28465");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR    A     0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR", "444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test28466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28466");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("100.0                                                     aaaa0true-1.0097.044444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "100.0                                                     aaaa0true-1.0097.044444444444444444444444" + "'", str1, "100.0                                                     aaaa0true-1.0097.044444444444444444444444");
    }

    @Test
    public void test28467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28467");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("   a         ", "                                                                                                                                  aaaa0                                                                                                                                  ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test28468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28468");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("                                                                                                               ", "a#a", "a HI!HI!HI!HI!HI!HI!HI!HI!HI!HI... a               a HI!HI!HI!HI!HI!HI!HI!HI!HI!HI... a   ...");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test28469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28469");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("0true-10aaaa00970aaaa0###################################    a   HI!HI!#########################", "A44444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0true-10aaaa00970aaaa0###################################    a   HI!HI!#########################" + "'", str2, "0true-10aaaa00970aaaa0###################################    a   HI!HI!#########################");
    }

    @Test
    public void test28470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28470");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "A   hi0hi0hi0hi0hi0hi0hi0hi0hi0hi...    AA   hi0hi0hi0hi0hi0hi0hi0hi0hi0hi...    AA   hi0hi0hi0hi0hi0hi0hi0hi0hi0hi...    AA   hi0hi0hi0hi0hi0hi0hi0hi0hi0hi...    AA   hi0hi0hi0hi0hi0hi0hi0hi0hi0hi...    AA   hi0hi0hi0hi0hi0hi0hi0hi0hi0hi...    AA   hi0hi0hi0hi0hi0hi0hi0hi0hi0hi...    AA   hi0hi0hi0hi0hi0hi0hi0hi0hi0hi...    AA   hi0hi0hi0hi0hi0hi0hi0hi0hi0hi...    AA   hi0hi0hi0hi0hi0hi0hi0hi0hi0hi...    AA   hi0hi0hi0hi0hi0hi0hi0hi0hi0hi...    AA   hi0hi0hi0hi0hi0hi0hi0hi0hi0hi...    AA   hi0hi0hi0hi0hi0hi0hi0hi0hi0hi...    AA   hi0hi0hi0hi0hi0hi0hi0hi0hi0hi...    AA   hi0hi0hi0hi0hi0hi0hi0hi0hi0hi...    AA   hi0hi0hi0hi0hi0hi0hi0hi0hi0hi...    AA   hi0hi0hi0hi0hi0hi0hi0hi0hi0hi...    AA   hi0hi0hi0hi0hi0hi0hi0hi0hi0hi...    AA   hi0hi0hi0hi0hi0hi0hi0hi0hi0hi...    AA   hi0hi0hi0hi0hi0hi0hi0hi0hi0hi...    AA   hi0hi0hi0hi0hi0hi0hi0hi0hi0hi...    AA   hi0hi0hi0hi0hi0hi0hi0hi0hi0hi.", "...                             ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test28471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28471");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfBlank("aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...", "44444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA..." + "'", str2, "aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...");
    }

    @Test
    public void test28472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28472");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("      #a######################...##############################################", "                 aaaa0aaaaa    ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test28473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28473");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("HI!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: HI! is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test28474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28474");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("4444444...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "...             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test28475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28475");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("                       a                   TRUE-1.0097.0                       a                    ", "4444444444444444444444444440.7900.1-EURT04444444444444444444444444444444444444444440.7900.1-EURT044444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                       a                   TRUE-1.0097.0                       a                    " + "'", str2, "                       a                   TRUE-1.0097.0                       a                    ");
    }

    @Test
    public void test28476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28476");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi" + "'", str1, "i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi");
    }

    @Test
    public void test28477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28477");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("...                     aaaaa0aaaa                     aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...                     aaaaa0aaaa                     aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.....", "...      aaaa0a", 91);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test28478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28478");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "...44444444444...");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 17 + "'", int1 == 17);
    }

    @Test
    public void test28479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28479");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("A    4444444444444444444444444444444444444444444              4444444444444444444444444444444444444444444", 72.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 72.0d + "'", double2 == 72.0d);
    }

    @Test
    public void test28480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28480");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong(".0097.00true-1.0097.00true-1.0097.00tr", 44L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 44L + "'", long2 == 44L);
    }

    @Test
    public void test28481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28481");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test28482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28482");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("AAAAAAAAAAAAAAAAAAAAAAAAAAAA", "0true-1.0097.00true-1.0097.00true-1.0097.00tr    a     0true-1.0097.00true-1.0097.00true-1.0097.00tr");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str2, "AAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test28483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28483");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "                     aaaa0aaaaa   ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                     aaaa0aaaaa   " + "'", str1, "                     aaaa0aaaaa   ");
    }

    @Test
    public void test28484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28484");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("000", 119, "###################################    a   hi!hi!...");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "###################################    a   hi!hi!...######000###################################    a   hi!hi!...######" + "'", str3, "###################################    a   hi!hi!...######000###################################    a   hi!hi!...######");
    }

    @Test
    public void test28485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28485");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("...44444...TRUE-1.4444444...97.4444444...4444444444444...                  4", "", 62);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 62 + "'", int3 == 62);
    }

    @Test
    public void test28486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28486");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("00.0                                                     aaaa0true-1.0097.044444444444444444444444", 22L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 22L + "'", long2 == 22L);
    }

    @Test
    public void test28487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28487");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("         a        ", "0true-1.0aaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test28488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28488");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("0true-1.0                                               41004.404", "       444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test28489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28489");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("                                                                                                                                          ");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray1);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, ' ');
        int int5 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                          " + "'", str2, "                                                                                                                                          ");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "                                                                                                                                          " + "'", str4, "                                                                                                                                          ");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test28490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28490");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("                                      a                                                     ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                      A                                                     " + "'", str1, "                                      A                                                     ");
    }

    @Test
    public void test28491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28491");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("aaaaa0aaaaaaaaa0a");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test28492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28492");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("  a    TRUETRUETRUET", 842, 104);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  a    TRUETRUETRUET" + "'", str3, "  a    TRUETRUETRUET");
    }

    @Test
    public void test28493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28493");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase(".44444444444444444444444444444444A    4");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".44444444444444444444444444444444a    4" + "'", str1, ".44444444444444444444444444444444a    4");
    }

    @Test
    public void test28494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28494");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("a   HI!HI!..    a   HI!HI!..    a   HI!HI!..");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "a   HI!HI!..    a   HI!HI!..    a   HI!HI!." + "'", str1, "a   HI!HI!..    a   HI!HI!..    a   HI!HI!.");
    }

    @Test
    public void test28495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28495");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("     4A4    ", 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                 4A4                                                " + "'", str2, "                                                 4A4                                                ");
    }

    @Test
    public void test28496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28496");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "                                              ...44444444444444444444444444444444440TRUE-1.0097...                                                                 ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test28497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28497");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("", "                                                                                               100.", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test28498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28498");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("                                                            0aaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaa0                                                            " + "'", str1, "aaa0                                                            ");
    }

    @Test
    public void test28499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28499");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "                                        ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test28500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28500");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("00       000       000       00");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "00       000       000       0" + "'", str1, "00       000       000       0");
    }
}

