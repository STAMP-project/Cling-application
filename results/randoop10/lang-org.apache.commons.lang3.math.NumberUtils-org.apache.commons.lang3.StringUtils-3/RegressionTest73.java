import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest73 {

    public static boolean debug = false;

    @Test
    public void test36501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36501");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("       AAAA0AAAAA44444444444444444444444444444444444444444440TRUE-1.0097.0AAAA0AAAAA44444444444444444444444444444444444444444440TRUE-1.0097.0AAAA0AAAAA44444444444444444444444444444444444444444440TRUE-1.0097.0AAAA0AAAAA44444444444444444444444444444444444444444440TRUE-1.0097.0AAAA0AAAAA44444444444444444444444444444444444444444440TRUE-1.0097.0AAAA0AAAAA44444444444444444444444444444444444444444440TRUE-1.0097.0AAAA0AAAAA44444444444444444444444444444444444444444440TRUE-1.0097.0AAAA0AAAAA44444444444444444444444444444444444444444440TRUE-1.0097.0AAAA0AAAAA44444444444444444444444444444444444444444440TRUE-1.0097.0AAAA0AAAAA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "       AAAA0AAAAA44444444444444444444444444444444444444444440TRUE-1.0097.0AAAA0AAAAA44444444444444444444444444444444444444444440TRUE-1.0097.0AAAA0AAAAA44444444444444444444444444444444444444444440TRUE-1.0097.0AAAA0AAAAA44444444444444444444444444444444444444444440TRUE-1.0097.0AAAA0AAAAA44444444444444444444444444444444444444444440TRUE-1.0097.0AAAA0AAAAA44444444444444444444444444444444444444444440TRUE-1.0097.0AAAA0AAAAA44444444444444444444444444444444444444444440TRUE-1.0097.0AAAA0AAAAA44444444444444444444444444444444444444444440TRUE-1.0097.0AAAA0AAAAA44444444444444444444444444444444444444444440TRUE-1.0097.0AAAA0AAAA" + "'", str1, "       AAAA0AAAAA44444444444444444444444444444444444444444440TRUE-1.0097.0AAAA0AAAAA44444444444444444444444444444444444444444440TRUE-1.0097.0AAAA0AAAAA44444444444444444444444444444444444444444440TRUE-1.0097.0AAAA0AAAAA44444444444444444444444444444444444444444440TRUE-1.0097.0AAAA0AAAAA44444444444444444444444444444444444444444440TRUE-1.0097.0AAAA0AAAAA44444444444444444444444444444444444444444440TRUE-1.0097.0AAAA0AAAAA44444444444444444444444444444444444444444440TRUE-1.0097.0AAAA0AAAAA44444444444444444444444444444444444444444440TRUE-1.0097.0AAAA0AAAAA44444444444444444444444444444444444444444440TRUE-1.0097.0AAAA0AAAA");
    }

    @Test
    public void test36502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36502");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi", 840);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          " + "'", str2, "i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          ");
    }

    @Test
    public void test36503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36503");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("!hi!h!hi!h44444444444440.7900.1-EURT04444444444444444444444444444444444444444444", "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 80 + "'", int2 == 80);
    }

    @Test
    public void test36504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36504");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) 147, (long) 267, 650L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 650L + "'", long3 == 650L);
    }

    @Test
    public void test36505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36505");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("a    ...IH!IH!IH!IH!IH!IH!IH!IH!IH!IH   a", "                                                                                                                                                                                                                                                                                                                                                                                                              444440true-1.0097...4                                                                                                                                                                                                                                                                                                                                                                                                              ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "a    ...IH!IH!IH!IH!IH!IH!IH!IH!IH!IH   a" + "'", str2, "a    ...IH!IH!IH!IH!IH!IH!IH!IH!IH!IH   a");
    }

    @Test
    public void test36506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36506");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp(" rteurt  rteurt                                                                                     ", "#############################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################0.00");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " rteurt  rteurt                                                                                     " + "'", str2, " rteurt  rteurt                                                                                     ");
    }

    @Test
    public void test36507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36507");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444                                                                                                aaaa", 138, "44444444          TRUE  44444444");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444                                                                                                aaaa" + "'", str3, "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444                                                                                                aaaa");
    }

    @Test
    public void test36508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36508");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("4444444444444444444444444444444444444444444 a A A A 97.A a A A A true-1.A a A A A 4444444444444444444444444444444444444444444", "AAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444444444444444444444444444444444444444 a A A A 97.A a A A A true-1.A a A A A 4444444444444444444444444444444444444444444" + "'", str2, "4444444444444444444444444444444444444444444 a A A A 97.A a A A A true-1.A a A A A 4444444444444444444444444444444444444444444");
    }

    @Test
    public void test36509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36509");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("4true4");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"4true4\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test36510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36510");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "                                                      ...                           ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test36511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36511");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("A A A A                        a                       ...aaaa0aaaaa###########################################0true-1.0097.0aaaa0aaaaa###########################################0true-1.0097.0aaaa0aaaaa###########################################0true-1.0097.0aaaa0aaaaa###########################################0true-1.0097.0aaaa0aaaaa###########################################0true-1.0097.0aaaa0aaaaa###########################################0true-1.0097.0aaaa0aaaaa###########################################0true-1.0097.0aaaa0aaaaa###########################################0true-1.0097.0aaaa0aaaaa###########################################0true", "444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "A A A A                        a                       ...aaaa0aaaaa###########################################0true-1.0097.0aaaa0aaaaa###########################################0true-1.0097.0aaaa0aaaaa###########################################0true-1.0097.0aaaa0aaaaa###########################################0true-1.0097.0aaaa0aaaaa###########################################0true-1.0097.0aaaa0aaaaa###########################################0true-1.0097.0aaaa0aaaaa###########################################0true-1.0097.0aaaa0aaaaa###########################################0true-1.0097.0aaaa0aaaaa###########################################0true" + "'", str2, "A A A A                        a                       ...aaaa0aaaaa###########################################0true-1.0097.0aaaa0aaaaa###########################################0true-1.0097.0aaaa0aaaaa###########################################0true-1.0097.0aaaa0aaaaa###########################################0true-1.0097.0aaaa0aaaaa###########################################0true-1.0097.0aaaa0aaaaa###########################################0true-1.0097.0aaaa0aaaaa###########################################0true-1.0097.0aaaa0aaaaa###########################################0true-1.0097.0aaaa0aaaaa###########################################0true");
    }

    @Test
    public void test36512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36512");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "...         aaaa0aaaaaTRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test36513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36513");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("444444444444444444444444...44444444444444444444444444444444440TRUE-1.0097...444444444444444444444444", "4444444..444444444444444440Ta0aaaaa              0true-1.0097.00true-1.0097.00true-1.0097.00tr    A     0true-1.0097.00true-1.0097.00true-1.0097.00tra0aaaaa              0true-1.0097.00true-1.0097.00true-1.0097.00tr    A     0true-1");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test36514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36514");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("                                         AAAA0AAAA");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test36515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36515");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi!hi!hi!hi0true-1.0097.00true-1.0097.00true-1.0097.00trA0t...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 229 + "'", int1 == 229);
    }

    @Test
    public void test36516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36516");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("a44444", "!hi!hi!hi...    A0true-1.0097.0aaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1.0097.0aaaaaaaaaaaaaaaaaaaaaaa40true-1.0097.     A    40true-1.0097.     A    40true-1.0097.  A    4aaaaaaa444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", 817, 256);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "a44444!hi!hi!hi...    A0true-1.0097.0aaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1.0097.0aaaaaaaaaaaaaaaaaaaaaaa40true-1.0097.     A    40true-1.0097.     A    40true-1.0097.  A    4aaaaaaa444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str4, "a44444!hi!hi!hi...    A0true-1.0097.0aaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1.0097.0aaaaaaaaaaaaaaaaaaaaaaa40true-1.0097.     A    40true-1.0097.     A    40true-1.0097.  A    4aaaaaaa444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test36517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36517");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("444444444...4444444444........444444444444444444", "aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa    ");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.concatWith("Aaaaaaaaaaa4444444...4444444...4444444...4", (java.lang.Object[]) strArray4);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "444444444...4444444444........444444444444444444" + "'", str5, "444444444...4444444444........444444444444444444");
    }

    @Test
    public void test36518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36518");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("...7900.1-eurt0", 146.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 146.0d + "'", double2 == 146.0d);
    }

    @Test
    public void test36519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36519");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("04444444444444444444444444", "                                                                                                                                                                                                                                                                                                            0TRUE-1.0097.044444444444444444444444444 ...AAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAA0.001...AAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "04444444444444444444444444" + "'", str2, "04444444444444444444444444");
    }

    @Test
    public void test36520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36520");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("4", "HI!", 1);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.split("aaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaa", " A rt00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt0", 47);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("", strArray4, strArray8);
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.stripAll(strArray8);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray10, '#', 0, 0);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test36521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36521");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("aaaa0aaaaa", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", 0);
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray4);
        int int6 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray4);
        java.lang.Class<?> wildcardClass8 = strArray4.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "aaaa0aaaaa" + "'", str5, "aaaa0aaaaa");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "aaaa0aaaaa" + "'", str7, "aaaa0aaaaa");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test36522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36522");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("100.0                                                     aaaa                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ", 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test36523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36523");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 56, 12);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test36524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36524");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "4true4-4449744", (java.lang.CharSequence) "                                              0true-1.00...44444...true-1.4444444...97.4444444...4444444444444...0true-1.00...44444...true-1.4444444...97.4444444...4444444444444...0true-1.00...44444...true-1.4444444...97.4444444...4444444444444...0tr    A     0true-1.00...44444...true-1.4444444...97.4444444...4444444444444...0true-1.00...44444...true-1.4444444...97.4444444...4444444444444...0true-1.00...44444...true-1.4444444...97.4444444...4444444444444...0tr");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "4true4-4449744" + "'", charSequence2, "4true4-4449744");
    }

    @Test
    public void test36525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36525");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterType("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        boolean boolean3 = org.apache.commons.lang3.StringUtils.endsWithAny("4a4444444444444444444444...4444444444444444444444444444444444444444444444", strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test36526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36526");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "                                                                               aAAAAAAAAAAAAAAAA......aAAAAAAAAAAAAAAAA...0aAAAAAAAAAAAAAAAA......");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test36527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36527");
        java.lang.CharSequence charSequence0 = null;
        java.lang.CharSequence charSequence4 = null;
        char[] charArray11 = new char[] { '4', '4', ' ' };
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "0", charArray11);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444", charArray11);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "    A     ", charArray11);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAnyBut(charSequence4, charArray11);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsAny("444...44444444444444444444444444444444440true-1.0097...44", charArray11);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "4444444...", charArray11);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "...0...", charArray11);
        boolean boolean19 = org.apache.commons.lang3.StringUtils.containsNone(charSequence0, charArray11);
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
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test36528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36528");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("", 551, 451);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test36529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36529");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast(".1-eurt00.7900.1-eurt", "                                         AAAA0AAAA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test36530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36530");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("0true-1.0097.00true-1.0097.00true-1.0097.00tr    A     0true-1.0097.00true-1.0097.00true-1.0097.00t", "0true-1.0097.0");
        boolean boolean4 = org.apache.commons.lang3.StringUtils.startsWithAny("...A     ..", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test36531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36531");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "rt00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt0aaaaaaaaaart00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt0");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "rt00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt0aaaaaaaaaart00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt0" + "'", str1, "rt00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt0aaaaaaaaaart00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt0");
    }

    @Test
    public void test36532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36532");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("                        ", 71, " 0044444440004444444000444444400");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " 0044444440004444444000                         00444444400044444440004" + "'", str3, " 0044444440004444444000                         00444444400044444440004");
    }

    @Test
    public void test36533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36533");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("true                 ...                                                                      ...                                                                      ...                                                                      ...                            44444444444444444444444444444444444444444440true-1.0097.  a    44444444444444444440true-1.0097.     a    4444444444444444444444444444444444444444444440true-1.0097.     a    4444444444444444444444444444444444444444444440true-1.0097.     a    4444444444444444444444444444444444444444444440true-1.0097.     a    4444444444444444444444444444444444444444444440true-1.0097.     a    4444444444444444444444444444444444444444444440true-1.0097.     a    4444444444444444444444444444444444444444444440true-1.0097.     a    4444444444444444444444444444444444444444444440true-1.0097.     a    4444444444444444444444444444444444444444444440true-1.0097                 ...                                                     ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                     ...                 7900.1-eurt0444444444444444444444444444444444444444444444    a     .7900.1-eurt0444444444444444444444444444444444444444444444    a     .7900.1-eurt0444444444444444444444444444444444444444444444    a     .7900.1-eurt0444444444444444444444444444444444444444444444    a     .7900.1-eurt0444444444444444444444444444444444444444444444    a     .7900.1-eurt0444444444444444444444444444444444444444444444    a     .7900.1-eurt0444444444444444444444444444444444444444444444    a     .7900.1-eurt0444444444444444444444444444444444444444444444    a     .7900.1-eurt04444444444444444444    a  .7900.1-eurt04444444444444444444444444444444444444444444                            ...                                                                      ...                                                                      ...                                                                      ...                 eurt" + "'", str1, "                                                     ...                 7900.1-eurt0444444444444444444444444444444444444444444444    a     .7900.1-eurt0444444444444444444444444444444444444444444444    a     .7900.1-eurt0444444444444444444444444444444444444444444444    a     .7900.1-eurt0444444444444444444444444444444444444444444444    a     .7900.1-eurt0444444444444444444444444444444444444444444444    a     .7900.1-eurt0444444444444444444444444444444444444444444444    a     .7900.1-eurt0444444444444444444444444444444444444444444444    a     .7900.1-eurt0444444444444444444444444444444444444444444444    a     .7900.1-eurt04444444444444444444    a  .7900.1-eurt04444444444444444444444444444444444444444444                            ...                                                                      ...                                                                      ...                                                                      ...                 eurt");
    }

    @Test
    public void test36534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36534");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("...AAAAAAAAAAAAAAAAAAAAAAAAAAAAH!IH!IH!IH000A...");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test36535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36535");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) 279, (long) 115, (long) 144);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 279L + "'", long3 == 279L);
    }

    @Test
    public void test36536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36536");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min(817.0f, (float) 179, (float) 8L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 8.0f + "'", float3 == 8.0f);
    }

    @Test
    public void test36537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36537");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("                                                                                                                                                                                                                                                                                                                             9EURT79EURT                                                                                                                                                                                                                                                                                                                             ", 368, 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test36538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36538");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("                                                                                                                                  0aaaa                                                                                                                                   ", "...                     aaaaa0aaaa                     aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...                     aaaaa0aaaa                     a...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                  0aaaa                                                                                                                                   " + "'", str2, "                                                                                                                                  0aaaa                                                                                                                                   ");
    }

    @Test
    public void test36539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36539");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("                                                                                                                                                                                                                                                                                                                                                                                                                                                                 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                     aaaa0aaaaa                     ", "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444a4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", 668);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test36540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36540");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 16L, (double) 449, (double) 951);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 16.0d + "'", double3 == 16.0d);
    }

    @Test
    public void test36541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36541");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT04444444444444444444444444444444444444444444");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test36542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36542");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("444444444444444444444444...790true-1.0097.0444444444444444444444444444444444444444440true-1.0097.044444444444444444444444444444444444444444.1-EURT0true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444...444444444444444444444444", "444...4444Aaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "444444444444444444444444...790true-1.0097.0444444444444444444444444444444444444444440true-1.0097.044444444444444444444444444444444444444444.1-EURT0true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444...444444444444444444444444" + "'", str2, "444444444444444444444444...790true-1.0097.0444444444444444444444444444444444444444440true-1.0097.044444444444444444444444444444444444444444.1-EURT0true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444...444444444444444444444444");
    }

    @Test
    public void test36543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36543");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("", 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test36544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36544");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi...aahi!hi!hi!hi!hi!hi!hi!hi!hi!hi...aahi!hi!hi!hi!hi!hi!hi!hi!hi!hi...aahi!hi!hi!hi!hi!hi!hi!hi!hi!hi...aahi!hi!hi!hi!hi!hi!hi!hi!hi!hi..444444444444444444444444444440true-1.0097.a4444444444444444444444444444444444444444444440true-1.0097.a4444444444444444444444444444444444444444444440true-1.0097.a4444444444444444444444444444444444444444444440true-1.0097.a4444444444444444444444444444444444444444444440true-1.0097.a4444444444444444444444444444444444444444444440true-1.0097.a4444444444444444444444444444444444444444444440true-1.0097.a4444444444444444444444444444444444444444444440true-1.0097.a4444444444444444444444444444444444444444444440true-1.0097.a4444444444444444444444444444444444444444444440true-1.0097.");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test36545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36545");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("RT00I00I##EURT00I00I##EURT00I00I##EURT0#####A####RT00I00I##EURT00I00I##EURT00I00I##E", "    A         A                                                     100.0    A         A     ...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "RT00I00I##EURT00I00I##EURT00I00I##EURT0#####A####RT00I00I##EURT00I00I##EURT00I00I##E" + "'", str2, "RT00I00I##EURT00I00I##EURT00I00I##EURT0#####A####RT00I00I##EURT00I00I##EURT00I00I##E");
    }

    @Test
    public void test36546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36546");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("...                aaaaa0aaaa                     ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test36547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36547");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("                       ", 91);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test36548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36548");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("###########################################################################################################################################################################################################################00.1-eurt0                                                                                                    ", 146.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 146.0d + "'", double2 == 146.0d);
    }

    @Test
    public void test36549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36549");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "0097..###############################################################################################################################################", "0097.00T44444444444444444444444444444444444444444444444444...true-1.4444444...97.4444444...4444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test36550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36550");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("RT00I00I##EURT00I00I##EURT00I00I##EURT0#####A####RT00I00I##EURT00I00I##EURT00I00I##E", "true 1.  97.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "RT00I00I##EURT00I00I##EURT00I00I##EURT0#####A####RT00I00I##EURT00I00I##EURT00I00I##E" + "'", str2, "RT00I00I##EURT00I00I##EURT00I00I##EURT0#####A####RT00I00I##EURT00I00I##EURT00I00I##E");
    }

    @Test
    public void test36551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36551");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("                                                                                                                                                                                                                                 444...44444444444444444444444444444444440TRUE-1.0097                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               ", "                               0                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            ", "A   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    A0097...###################################################################################");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                                                                                                                                 444...44444444444444444444444444444444440TRUE-1.0097                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               " + "'", str3, "                                                                                                                                                                                                                                 444...44444444444444444444444444444444440TRUE-1.0097                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               ");
    }

    @Test
    public void test36552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36552");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "RT00.7900.1-EURT00.7900.1-EURT00.7900.1-EURT0 A RT00.7900.1-EURT00.7900.1-EURT00.7900.1-EURT0", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa    ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void test36553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36553");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("...44444...4444444...4...aaaaaa...", 96, 243);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test36554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36554");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "0true-1.0097.044444444444444444444444444 40true-1.0097.044444444444444444444444444 40true-1.0097.04444444444444444444000true-1.0097.044444444444444444444444444 40true-1.0097.044444444444444444444444444 40true-1.0097.044444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test36555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36555");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("                                                               AAAA0AAAA                      ", 14);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test36556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36556");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("", 550);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test36557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36557");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR4444444440TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00T", 'a');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test36558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36558");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("                                                          ", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            Aaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                          " + "'", str2, "                                                          ");
    }

    @Test
    public void test36559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36559");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("0true-1.0097.044444444444444444444444444 ", "a0aaaaaaaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " " + "'", str2, " ");
    }

    @Test
    public void test36560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36560");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "100.0100.0100.0100.0100.0100.0100.0100.0100.0");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test36561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36561");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("AAAA0AAAAAAAAA0AAAAAAAAA0AAA...0...", ".4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...", 608);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test36562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36562");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##############################################0097.aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "       true-1.97.                                                                                   ", "A A A A                        a                       ...aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##############################################00   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##############################################00   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test36563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36563");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("...0true-1.0097...", 330, 88);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test36564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36564");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(4.4444042E9f, (float) 111, (float) 99);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 4.4444042E9f + "'", float3 == 4.4444042E9f);
    }

    @Test
    public void test36565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36565");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 344, 434);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test36566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36566");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("                       #a#44444444444444444444#...#444444444444444444444444444444444444444444444", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                       ##44444444444444444444#...#444444444444444444444444444444444444444444444" + "'", str2, "                       ##44444444444444444444#...#444444444444444444444444444444444444444444444");
    }

    @Test
    public void test36567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36567");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("        0aaaa         ", "  4444444444444444444444444 true - 1 . 97 . 44444444444444444444444444444444444444444444444444444444444444444444444444444444444444 true - 1 . 97 . 44444444444444444444444444444444444444444444444444444444444444444444444444444444444444 true - 1 . 97 . 4444444444444444444444444444444444444444444974444444444444444444444444444444444444444444 true - 1 . 97 . 44444444444444444444444444444444444444444444444444444444444444444444444444444444444444 true - 1 . 97 . 4444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test36568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36568");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "                     AAAA0AAAAA              ", (java.lang.CharSequence) "                                                                                         #######################################################################################################################################################################4 0true-1.0097.04444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444                                                                                          ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 21 + "'", int2 == 21);
    }

    @Test
    public void test36569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36569");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("044444444444444444444444444....IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I.......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: multiple points");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test36570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36570");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 100, (byte) 100 };
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte8 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        byte byte10 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte11 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        byte byte12 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        byte byte13 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte14 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        byte byte15 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        byte byte16 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[10, 100, 100]");
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 100 + "'", byte4 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 10 + "'", byte5 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 10 + "'", byte6 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 100 + "'", byte7 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 100 + "'", byte8 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 10 + "'", byte9 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte10 + "' != '" + (byte) 100 + "'", byte10 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) 10 + "'", byte11 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte12 + "' != '" + (byte) 10 + "'", byte12 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte13 + "' != '" + (byte) 100 + "'", byte13 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte14 + "' != '" + (byte) 10 + "'", byte14 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte15 + "' != '" + (byte) 10 + "'", byte15 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte16 + "' != '" + (byte) 10 + "'", byte16 == (byte) 10);
    }

    @Test
    public void test36571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36571");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("444444A444444444444444444        ", "100.0#####100.0##", (int) '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "444444A444444444444444444        " + "'", str3, "444444A444444444444444444        ");
    }

    @Test
    public void test36572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36572");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("0TRUE-1.0", "aaaaatrue0aaaa0.aaatruaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "TRUE-1" + "'", str2, "TRUE-1");
    }

    @Test
    public void test36573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36573");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("44444444444444444444444444444444444444444440TRUE-1.0097.     A    4444444444444444444444444444444444444444444440TRUE-1.0097.     A    4444444444444444444444444444444444444444444440TRUE-1.0097.     A    4444444444444444444444444444444444444444444440TRUE-1.0097.     A    4444444444444444444444444444444444444444444440TRUE-1.0097.     A    4444444444444444444444444444444444444444444440TRUE-1.0097.     A    4444444444444444444444444444444444444444444440TRUE-1.0097.     A    4444444444444444444444444444444444444444444440TRUE-1.0097.     A    4444444444444444444444444444444444444444444440TRUE-1.0097.     A    4444444444444444444444444444444444444444444440TRUE-1.0097.");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "44444444444444444444444444444444444444444440TRUE-1.0097.     A    4444444444444444444444444444444444444444444440TRUE-1.0097.     A    4444444444444444444444444444444444444444444440TRUE-1.0097.     A    4444444444444444444444444444444444444444444440TRUE-1.0097.     A    4444444444444444444444444444444444444444444440TRUE-1.0097.     A    4444444444444444444444444444444444444444444440TRUE-1.0097.     A    4444444444444444444444444444444444444444444440TRUE-1.0097.     A    4444444444444444444444444444444444444444444440TRUE-1.0097.     A    4444444444444444444444444444444444444444444440TRUE-1.0097.     A    4444444444444444444444444444444444444444444440TRUE-1.0097" + "'", str1, "44444444444444444444444444444444444444444440TRUE-1.0097.     A    4444444444444444444444444444444444444444444440TRUE-1.0097.     A    4444444444444444444444444444444444444444444440TRUE-1.0097.     A    4444444444444444444444444444444444444444444440TRUE-1.0097.     A    4444444444444444444444444444444444444444444440TRUE-1.0097.     A    4444444444444444444444444444444444444444444440TRUE-1.0097.     A    4444444444444444444444444444444444444444444440TRUE-1.0097.     A    4444444444444444444444444444444444444444444440TRUE-1.0097.     A    4444444444444444444444444444444444444444444440TRUE-1.0097.     A    4444444444444444444444444444444444444444444440TRUE-1.0097");
    }

    @Test
    public void test36574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36574");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfBlank("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                 aaaa0aaaaa    aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "04444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                 aaaa0aaaaa    aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                 aaaa0aaaaa    aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test36575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36575");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("                                                                                                                                                                                                                                                                                                                                                      hI!                                                                                                                                                                                                                                                                                                                                                                                                                               ", "HHHH0H7900H1-EURT0HHHHH0HHHH0H7900H1-EURT0HHHHH0HHHH0H7900H1-EURT0HHHHH0HHHH0H7900H1-EURT0HHHHH0HHHH0H7900H1-EURT0HHHHH0HHHH0H7900H1-EURT0HHHHH0HHHH0H7900H1-EURT0HHHHH0HHHH0");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HHHH0H7900H1-EURT0HHHHH0HHHH0H7900H1-EURT0HHHHH0HHHH0H7900H1-EURT0HHHHH0HHHH0H7900H1-EURT0HHHHH0HHHH0H7900H1-EURT0HHHHH0HHHH0H7900H1-EURT0HHHHH0HHHH0H7900H1-EURT0HHHHH0HHHH0" + "'", str2, "HHHH0H7900H1-EURT0HHHHH0HHHH0H7900H1-EURT0HHHHH0HHHH0H7900H1-EURT0HHHHH0HHHH0H7900H1-EURT0HHHHH0HHHH0H7900H1-EURT0HHHHH0HHHH0H7900H1-EURT0HHHHH0HHHH0H7900H1-EURT0HHHHH0HHHH0");
    }

    @Test
    public void test36576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36576");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(0, 2, 141);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 141 + "'", int3 == 141);
    }

    @Test
    public void test36577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36577");
        java.lang.CharSequence charSequence0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance(charSequence0, (java.lang.CharSequence) "A.7900.1-eurt0444444444444444444444444444444444444444444444A.7900.1-eurt04444444444444444444A.7900.1-eurt04444444444444444444444444444444444444444444");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Strings must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test36578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36578");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("A                             ###    A   hi!hi!...###    A   hi!hi!...###", 41);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test36579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36579");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min(9.0f, (float) 650L, 69.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 9.0f + "'", float3 == 9.0f);
    }

    @Test
    public void test36580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36580");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("a    44", 147);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test36581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36581");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("Aaaaaaaaaaa44.                                  aaaa.", "                                                                                                                                                                                  100.                                                                                    ", "                                      0.001                                               ");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test36582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36582");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("tr...", "                                                                                                                            ", "0.7900.1-EURT0AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                                   4AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA    A");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test36583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36583");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "...aaaa0aaaaa44444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test36584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36584");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("                                                                                    .001                                                                                                                                                                                  ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                                                                                                                  100.                                                                                    " + "'", str1, "                                                                                                                                                                                  100.                                                                                    ");
    }

    @Test
    public void test36585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36585");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("444444444444444440true-1.0097...444444444444444444444444                                                                                        100.444444444444444440true-1.0097...444444444444444444444444                                                                                        100.444444444444444440true-1.0097...444444444444444444444444                                                                                        100.444444444444444440true-1.0097...444444444444444444444444                                     ", 37.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 37.0f + "'", float2 == 37.0f);
    }

    @Test
    public void test36586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36586");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("97atrue-1.", "0444444444444444444444444444444444444444444444444444444444444e-1.0097.00true-1.0097.00true-1.0097.00tr    a     0true-1.0097.00true-1.0097.00true-1.0097.00tr.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.00...", 36);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "97atrue-1." + "'", str3, "97atrue-1.");
    }

    @Test
    public void test36587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36587");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("...A ...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...A ..." + "'", str1, "...A ...");
    }

    @Test
    public void test36588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36588");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("...44444444444444444444440TRUE-1.044444444444444444444444444444444444444444440TRUE-1.044444444444444444444444444444444444444444440TRUE-1.044444444444444444444444444444444444444444440TRUE-1.044444444444444444444444444444444444444444440TRUE-1.044444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test36589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36589");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("0true-1.00                           aaaa0aaaaa                                             aaaa0a", 'a', ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0true-1.00                               0                                                      0 " + "'", str3, "0true-1.00                               0                                                      0 ");
    }

    @Test
    public void test36590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36590");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "4444444444444444444444444444444444444444444                                                                                true-1.                                                                                97.                                                                                4444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test36591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36591");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("a", ' ');
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "444##444440true-1.0097...4444444444444444444440true-1#0097###44");
        java.lang.Class<?> wildcardClass5 = strArray4.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test36592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36592");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("true-1.       ...97true-1.       ...97", 0, "TRUE-1.0097.00TRUE-1....");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "true-1.       ...97true-1.       ...97" + "'", str3, "true-1.       ...97true-1.       ...97");
    }

    @Test
    public void test36593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36593");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("4444444...aaaaaaaaaaaaaaaaaaaaaaaaa", "                                                                                                                                                          ...                                                                                                                                                                                                                                                                                            ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444...aaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "4444444...aaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test36594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36594");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH             A         A   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    A    A   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    A    A   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    A    A   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    A    A   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    A    A   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    A    A   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    A    A   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    A    A   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    A    A   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    A    A   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    A    A   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    A    A   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI.", "aaa...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1.0097...aa                                                                                            A    44                                                                                            A    44                                                                                            A    44                                                                                            A    44                                                                                            A    44                                                                                            A    44", 68);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test36595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36595");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("####################################                                         AAAA0AAAAA####################################", "      aaaaaaaaa...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test36596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36596");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...", 51, 88);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test36597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36597");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "a0aaaaaaaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0atrue 1.  97.a0aaaaaaaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aa", "...4444.....");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 17 + "'", int2 == 17);
    }

    @Test
    public void test36598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36598");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("444444A444444444444444444", "4444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "444444A44444444" + "'", str2, "444444A44444444");
    }

    @Test
    public void test36599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36599");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(0, 557, 125);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 557 + "'", int3 == 557);
    }

    @Test
    public void test36600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36600");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("#######################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!", (byte) 10);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 10 + "'", byte2 == (byte) 10);
    }

    @Test
    public void test36601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36601");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("                                                                                                                                                                                                                                                      AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                                                                                                                                                                                                                                                                                                                                                                                 ", "444444444444444444444444444444444444444444true-1.97.4444444444444444444444444444444444444444444                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test36602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36602");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("true                 ...                                                                      ...                                                                      ...                                                                      ...                            44444444444444444444444444444444444444444440true-1.0097.  a    44444444444444444440true-1.0097.     a    4444444444444444444444444444444444444444444440true-1.0097.     a    4444444444444444444444444444444444444444444440true-1.0097.     a    4444444444444444444444444444444444444444444440true-1.0097.     a    4444444444444444444444444444444444444444444440true-1.0097.     a    4444444444444444444444444444444444444444444440true-1.0097.     a    4444444444444444444444444444444444444444444440true-1.0097.     a    4444444444444444444444444444444444444444444440true-1.0097.     a    4444444444444444444444444444444444444444444440true-1.0097                 ...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "true............44444444444444444444444444444444444444444440true-1.0097.a44444444444444444440true-1.0097.a4444444444444444444444444444444444444444444440true-1.0097.a4444444444444444444444444444444444444444444440true-1.0097.a4444444444444444444444444444444444444444444440true-1.0097.a4444444444444444444444444444444444444444444440true-1.0097.a4444444444444444444444444444444444444444444440true-1.0097.a4444444444444444444444444444444444444444444440true-1.0097.a4444444444444444444444444444444444444444444440true-1.0097.a4444444444444444444444444444444444444444444440true-1.0097..." + "'", str1, "true............44444444444444444444444444444444444444444440true-1.0097.a44444444444444444440true-1.0097.a4444444444444444444444444444444444444444444440true-1.0097.a4444444444444444444444444444444444444444444440true-1.0097.a4444444444444444444444444444444444444444444440true-1.0097.a4444444444444444444444444444444444444444444440true-1.0097.a4444444444444444444444444444444444444444444440true-1.0097.a4444444444444444444444444444444444444444444440true-1.0097.a4444444444444444444444444444444444444444444440true-1.0097.a4444444444444444444444444444444444444444444440true-1.0097...");
    }

    @Test
    public void test36603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36603");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("                                                          ", "4444444444444444444aaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                          " + "'", str2, "                                                          ");
    }

    @Test
    public void test36604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36604");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("aaaaHi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!###########################################################################################################################################################################################################################################################################################################################################################################################################################################");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, ' ', 12, 40);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 12");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test36605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36605");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("AAAAAAA...00.7900.1-EURT00.79...AAAAAAA", "          ###    a   HI!HI!.           ", "uuuuuuuuHI!HI!HI!HI!HI!HI!HI!HI!HI!HI444uuuuuuuuuaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 224);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "AAAAAAA...00.7900.1-EURT00.79...AAAAAAA" + "'", str4, "AAAAAAA...00.7900.1-EURT00.79...AAAAAAA");
    }

    @Test
    public void test36606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36606");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("...44444...true-1.4444444...97.4444444...4444444444444...4");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test36607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36607");
        java.lang.CharSequence charSequence0 = null;
        java.lang.CharSequence charSequence5 = null;
        char[] charArray12 = new char[] { '4', '4', ' ' };
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "0", charArray12);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444", charArray12);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "    A     ", charArray12);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAnyBut(charSequence5, charArray12);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsAny("444...44444444444444444444444444444444440true-1.0097...44", charArray12);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "4444444...", charArray12);
        boolean boolean19 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "                       a                   TRUE-1.0097.0                       a                    ", charArray12);
        boolean boolean20 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "aaaa0.7900.1-eurt0aaaaaaaaaaaaaaaaaaaaaaaaaaa0.7900.1-eurt0A    ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih   A", charArray12);
        boolean boolean21 = org.apache.commons.lang3.StringUtils.containsNone(charSequence0, charArray12);
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
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test36608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36608");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("44444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT04444444444444444444444444444444444444444444             ");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test36609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36609");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("4             ", '4');
        boolean boolean4 = org.apache.commons.lang3.StringUtils.startsWithAny("444...44444444444444444444444444444444440true-1.0097...44                                        ", strArray3);
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "");
        java.lang.Class<?> wildcardClass7 = strArray6.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test36610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36610");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "uuuuuuuuHI!HI!HI!HI!HI!HI!HI!HI!HI!HI444uuuuuuuuuaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test36611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36611");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("4444444... 4444444... 4444444... 4444444... 4444444... 4444444... 4444444... 4444444... 4444444... 4444444... 4444444... 4444444... 4444444... 4444444... 4444444... 4444444... 4444444... 4444444... 4444444... 4444444... 4444444... 4444444... 4444444... 4444444..974", (double) 9L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.0d + "'", double2 == 9.0d);
    }

    @Test
    public void test36612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36612");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4                                                   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "44444                                               aaaaa", 63);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test36613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36613");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "                 ...                                                     444444444444444440true-1.0097...444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                 ...                                                     444444444444444440true-1.0097...444444444444444444444444" + "'", str1, "                 ...                                                     444444444444444440true-1.0097...444444444444444444444444");
    }

    @Test
    public void test36614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36614");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT04444444444444444444444444444444444444444444             ", ".0097.00tr.0097.00tr.0097.00tr.0097.00tr.0097.00tr.0097.00tr.0097.00tr.0097.00tr.0097.00tr                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               ", 15);
        boolean boolean5 = org.apache.commons.lang3.StringUtils.startsWithAny("    a                     ", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT04444444444444444444444444444444444444444444             " + "'", str6, "444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT04444444444444444444444444444444444444444444             ");
    }

    @Test
    public void test36615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36615");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("rt00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt", 344, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                                                      rt00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt                                                                                                                                                      " + "'", str3, "                                                                                                                                                      rt00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt                                                                                                                                                      ");
    }

    @Test
    public void test36616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36616");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("    ", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test36617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36617");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("100.0I!4I!4I!4I!4I!4I!4I!4I!4I!4I!4I!4I!4I!4I!4I!4I444444444444444444444444444444", "AHI!HI!HI!HI!HI!HI!HI!HI!HI!HI");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "100.0I!4I!4I!4I!4I!4I!4I!4I!4I!4I!4I!4I!4I!4I!4I!4I444444444444444444444444444444" + "'", str2, "100.0I!4I!4I!4I!4I!4I!4I!4I!4I!4I!4I!4I!4I!4I!4I!4I444444444444444444444444444444");
    }

    @Test
    public void test36618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36618");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("0 ", "4444444444444444444444444444444444440true-1.0097.4444444444444444444444444444444444444444444440true-1.0097.4444444444444444444444444444444444444444444440true-1.0097.4444444444444444444444444444444444444444444440true-1.0097.4444444444444444444444444444444444444444444440true-1.0097.4444444444444444444444444444444444444444444440true-1.0097.4444444444444444444444444444444444444444444440true-1.0097.4444444444444444444444444444444444444444444440true-1.0097.4444444444444444444444444444444444444444444440true-1.0097.4444444444444444444444444444444444444444444440true-1.0097.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0 " + "'", str2, "0 ");
    }

    @Test
    public void test36619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36619");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 116, (double) 625.0f, 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test36620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36620");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) 93, 136L, 38L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 136L + "'", long3 == 136L);
    }

    @Test
    public void test36621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36621");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("44444444444true444444444444444444444444444444444444444", "aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa4444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test36622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36622");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("...        A      A  444440444                                                     0.001                            A      A  444440444                                                     0.001                            A      A  444440444                                                     0.001                            A      A  444440444                                                     0.001                            A      A  ", 201, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...        A      A  444440444                                                     0.001                            A      A  444440444                                                     0.001                            A      A  444440444                                                     0.001                            A      A  444440444                                                     0.001                            A      A  " + "'", str3, "...        A      A  444440444                                                     0.001                            A      A  444440444                                                     0.001                            A      A  444440444                                                     0.001                            A      A  444440444                                                     0.001                            A      A  ");
    }

    @Test
    public void test36623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36623");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("0true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444" + "'", str1, "0true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444");
    }

    @Test
    public void test36624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36624");
        char[] charArray12 = new char[] { '4', '4', ' ' };
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "0", charArray12);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444", charArray12);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "    A     ", charArray12);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", charArray12);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "44444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444", charArray12);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsAny("", charArray12);
        boolean boolean19 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "                                                  4444444444444444444444444444444444444444444TRUE-1.97.4444444444444444444444444444444444444444444444444444444444444444444444444444444444444TRUE-1.97.4444444444444444444444444444444444444444444                                                   ", charArray12);
        boolean boolean20 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "                   .0097.00tr          ...", charArray12);
        boolean boolean21 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "44444444444444444444444444444444444444444444444...", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "44 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "44 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[4, 4,  ]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 43 + "'", int17 == 43);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test36625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36625");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("                                                                                                                                                                                       A0                                                                                                                                                                                       ", "444...4444Aaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "444...4444Aaaaaaaaa" + "'", str2, "444...4444Aaaaaaaaa");
    }

    @Test
    public void test36626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36626");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("...    0true-1.0097.00true-1.0097.00true-1.0097.00tr", "4444444..444444444444444440true-1.0097...44444444444444444444444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...    0true-1.0097.00true-1.0097.00true-1.0097.00tr" + "'", str2, "...    0true-1.0097.00true-1.0097.00true-1.0097.00tr");
    }

    @Test
    public void test36627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36627");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("100.0aaaa", '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "100.0aaaa" + "'", str2, "100.0aaaa");
    }

    @Test
    public void test36628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36628");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfBlank("", "                 ...                                                     AAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                 ...                                                     AAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str2, "                 ...                                                     AAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test36629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36629");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa444                                                   ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test36630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36630");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("...00.7900.1-eurt00.79...", "", "                                  aaaa", 86);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "...00.7900.1-eurt00.79..." + "'", str4, "...00.7900.1-eurt00.79...");
    }

    @Test
    public void test36631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36631");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!                            100.0                                                     AAAAHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H", "      a   HI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAA       ", "                                                     ...                                      ");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test36632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36632");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "                                                                                                                                                                                                                                                                                  a        HI!HI!HI!HI!HI!HI!HI!HI!HI!HI.A A A HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...        HI!HI!HI!HI!HI!HI!HI!HI!HI!HI.A A A a                                                                                                                                                                                                                                                                                  ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test36633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36633");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("A                                               ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "A" + "'", str1, "A");
    }

    @Test
    public void test36634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36634");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("    a   HI!HI!HI!HI!HI!HI!H");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test36635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36635");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("ahi       TRUE!       TRUEhi       TRUE!       TRUEhi       TRUE!       TRUEhaaaaaaaaaaaaaaa       TRUE44444       TRUEaaaaaaaaaaaaaaaaaaaaaaaa", "####################################                                         AAAA0AAAAA####################################");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test36636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36636");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a4444444...aaaaaa...", 79);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test36637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36637");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("", 14);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test36638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36638");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("...aaaa...", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...aaaa..." + "'", str2, "...aaaa...");
    }

    @Test
    public void test36639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36639");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("       ", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test36640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36640");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("...aaaaaaaaaaaaaaa...    A         A         A  A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A!hi!h!hi!h");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: multiple points");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test36641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36641");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("4444444444444444444444444...aaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test36642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36642");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "4444444...                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           0aaaa                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test36643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36643");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "4444444444444444444444444444444444444444444 true - 1 . 97 . 4444444444444444444444444444444444444444444true4444444444444444444444444444444444444444444 true - 1 . 97 . 4444444444444444444444444444444444444444444-4444444444444444444444444444444444444444444 true - 1 . 97 . 44444444444444444444444444444444444444444444444444444444444444444444444444444444444444 true - 1 . 97 . 44444444444444444444444444444444444444444444444444444444444444444444444444444444444444 true - 1 . 97 . 4444444444444444444444444444444444444444444974444444444444444444444444444444444444444444 true - 1 . 97 . 44444444444444444444444444444444444444444444444444444444444444444444444444444444444444 true - 1 . 97 . 4444444444444444444444444444444444444444444", "11111111111111111111111111111111111111111");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test36644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36644");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HH", (byte) 0);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 0 + "'", byte2 == (byte) 0);
    }

    @Test
    public void test36645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36645");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("444444444444444444444444444444444444444444444444444444444444444444444444444444aA44444A44444A44444A44444A44444A44444A44444A44444A44444100.044444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444440TRUE-1.009...", "a44444444444444444444...444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "444444444444444444444444444444444444444444444444444444444444444444444444444444aA44444A44444A44444A44444A44444A44444A44444A44444A44444100.044444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444440TRUE-1.009..." + "'", str2, "444444444444444444444444444444444444444444444444444444444444444444444444444444aA44444A44444A44444A44444A44444A44444A44444A44444A44444100.044444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444440TRUE-1.009...");
    }

    @Test
    public void test36646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36646");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) 957, (long) 173, 52L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 52L + "'", long3 == 52L);
    }

    @Test
    public void test36647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36647");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("                                                                                                                                                                              0    -1.0097.00    -1.0097.00    -1.0097.00   a 0    -1.00", '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                              0    -1.0097.00    -1.0097.00    -1.0097.00   a 0    -1.00" + "'", str2, "                                                                                                                                                                              0    -1.0097.00    -1.0097.00    -1.0097.00   a 0    -1.00");
    }

    @Test
    public void test36648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36648");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("4444444...", "44444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444", 10);
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("4444444...", "44444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444", 10);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.replaceEach("44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444", strArray5, strArray9);
        java.lang.String[] strArray11 = org.apache.commons.lang3.StringUtils.stripAll(strArray9);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray9, "");
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray9, '#');
        boolean boolean16 = org.apache.commons.lang3.StringUtils.endsWithAny("...aaaaaaaaaaaaaaa...    A         A         A  A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A!hi!h!hi!h", strArray9);
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray9, "", 75, 4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444" + "'", str10, "44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "." + "'", str13, ".");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "#########." + "'", str15, "#########.");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test36649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36649");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHIHIHIHA                                                                                                         ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test36650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36650");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test36651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36651");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("444...44444444444444444444444444444444440true-1.0097...44", "A         A         A        ...");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "44444444444444444444444444444444444440true-1009744" + "'", str3, "44444444444444444444444444444444444440true-1009744");
    }

    @Test
    public void test36652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36652");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("4444444444444444444444444444444444444444444 0.79 0.1-eurt 04444444444444444444444444444444444444444444", 435);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test36653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36653");
        short[] shortArray6 = new short[] { (byte) 100, (short) -1, (byte) -1, (short) 100, (byte) 10, (short) 10 };
        short short7 = org.apache.commons.lang3.math.NumberUtils.min(shortArray6);
        short short8 = org.apache.commons.lang3.math.NumberUtils.min(shortArray6);
        short short9 = org.apache.commons.lang3.math.NumberUtils.min(shortArray6);
        short short10 = org.apache.commons.lang3.math.NumberUtils.min(shortArray6);
        short short11 = org.apache.commons.lang3.math.NumberUtils.min(shortArray6);
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray6), "[100, -1, -1, 100, 10, 10]");
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) -1 + "'", short7 == (short) -1);
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) -1 + "'", short8 == (short) -1);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) -1 + "'", short9 == (short) -1);
        org.junit.Assert.assertTrue("'" + short10 + "' != '" + (short) -1 + "'", short10 == (short) -1);
        org.junit.Assert.assertTrue("'" + short11 + "' != '" + (short) -1 + "'", short11 == (short) -1);
    }

    @Test
    public void test36654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36654");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) (byte) -1, 982.0d, (double) 136.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 982.0d + "'", double3 == 982.0d);
    }

    @Test
    public void test36655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36655");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("                                                                                                                                                                                                                                                                                                                                     ...44444444444...                                                                                                                                                                                                                                                                                                                                     ", "                                            100.0", 30);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test36656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36656");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("...44444...TRUE-1.4444444.....4444444...4444444...4444444...4444444...4444444...4444444...4444444...44444...TRUE-1.4444444...", 754);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...44444...TRUE-1.4444444.....4444444...4444444...4444444...4444444...4444444...4444444...4444444...44444...TRUE-1.4444444..." + "'", str2, "...44444...TRUE-1.4444444.....4444444...4444444...4444444...4444444...4444444...4444444...4444444...44444...TRUE-1.4444444...");
    }

    @Test
    public void test36657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36657");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("                                   ", "4444444... 4444444... 4444444... 4444444... 4444444... 4444444... 4444444... 4444444... 4444444... 4                                                                                                                                                                                                                                                                           4444444... 4444444... 4444444... 4444444... 4444444... 4444444... 4444444... 4444444... 4444444... 44");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test36658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36658");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("...t0444444444444444444444444444...", "...I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI44444444444444444444444444444444444444444444true-1.497.44444444444444444444444444444444444444444444 ", 46);
        int int4 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray3);
        int int5 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test36659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36659");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("44444444444444444444444444444444444444444440TRUE-1.009...", 451, 125);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test36660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36660");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("                                                                 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaatrue-1.a97.aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test36661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36661");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("                                                        44...AAAAAAAAAAAAAAAAAAAAAAAAAAAAH!                                                                       0true-1.00");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "44...AAAAAAAAAAAAAAAAAAAAAAAAAAAAH!                                                                       0true-1.00" + "'", str1, "44...AAAAAAAAAAAAAAAAAAAAAAAAAAAAH!                                                                       0true-1.00");
    }

    @Test
    public void test36662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36662");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("true-1.00true-1.97.true-1.00true-1.97.true-1.00true-1.97.true-1.00true-1.97.true-1.00true-1.97.true-1.00true-1.97.true-1.00true-1.97.true-1.00true-1.97.true-1.00true-1.97.true-1.00true-1.97.true-1.00true-1.97.true-1.00true-1.97.true-1.00true-1.97.true-1.00true-1.97.true-                                                                                                                                                                                                                                                      aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                                                                                                                                                                                                                                                                                                                                 ", "...                     4444444444444444444444444444444444444444444TRUE-1.97.4444444444444444444444444444444444444444444444444444444444444444444444444444444444444TRUE-1.97.4444444444444444444444444444444444444444444");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test36663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36663");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("                                                                                                                                                                                                                                           ...A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A...", 614, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "######################################################################################################################################################################################################################################                                                                                                                                                                                                                                           ...A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A..." + "'", str3, "######################################################################################################################################################################################################################################                                                                                                                                                                                                                                           ...A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A...");
    }

    @Test
    public void test36664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36664");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444444444444444444444444444444444444444444444444...true-1.4444444...97.4444444...4444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444444444444444444444444444444444444444444444444...true-1.4444444...97.4444444...4444444444444444444444444444444444444444444" + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444444444444444444444444444444444444444444444444...true-1.4444444...97.4444444...4444444444444444444444444444444444444444444");
    }

    @Test
    public void test36665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36665");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("0097444444a444HI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAA4444444...");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"097444444a444HI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAA4444444...\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test36666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36666");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("100.0 aaaa0true-1.0097.044444444444444444444444");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test36667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36667");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("AAAAAAAAAAAAAA                         ", 554, 77);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "AAAAAAAAAAAAAA                         " + "'", str3, "AAAAAAAAAAAAAA                         ");
    }

    @Test
    public void test36668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36668");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("####################aaa...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1.0097...aa                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       ######################################", "a        HI!HI!HI!HI!HI!HI!HI!HI!HI!HI.A A A HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...        HI!HI!HI!HI!HI!HI!HI!HI!HI!HI.A A A a");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test36669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36669");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "4444444...444444           aaaaaaaaaaa", (java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test36670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36670");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("4444444...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test36671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36671");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "                                       444...44444444444444444444444444444444440true-1.0097...44444...44444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test36672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36672");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("...0aaaa0aaaaa44444444444444444444444444444444...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...0aaaa0aaaaa44444444444444444444444444444444..." + "'", str1, "...0aaaa0aaaaa44444444444444444444444444444444...");
    }

    @Test
    public void test36673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36673");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "####################################    A     0true-1.0097.00true-1.0097.00true-1.0097.00trHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HH#####################################");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test36674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36674");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 69, (float) 216, (float) (byte) 1);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.0f + "'", float3 == 1.0f);
    }

    @Test
    public void test36675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36675");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "true-1.0097.00true-1.0097.00tr", (int) 'a');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test36676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36676");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("A A A        ", "     a    ");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test36677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36677");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("            0000000", "", "    A         A                                                     1000    A         A         ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "            0000000" + "'", str3, "            0000000");
    }

    @Test
    public void test36678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36678");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("...                                                                                                                             ...", "                                                                                                                                                                                                                                                                                                                                                                                                                                                           4444a44444                                                                                                                                                                                                                          ", 840);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test36679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36679");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("                                                     0.001                            A      A  ", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                     0.001                            A      A  " + "'", str2, "                                                     0.001                            A      A  ");
    }

    @Test
    public void test36680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36680");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...", 5, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa..." + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...");
    }

    @Test
    public void test36681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36681");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("444444444444", "...44444444444444444444444444444444440true-1.0097...");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3);
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("0true-1.0097.00true-1.0097.00true-1.0097.00tr    A     0true-1.0097.00true-1.0097.00true-1.0097.00t");
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("97.000true-1.0097.000true-1.0097.000true-1.0097.000true-1.0097.000true-1.0097.000true-1.0097.0", strArray3, strArray6);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray6, '4');
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "97.000true-1.0097.000true-1.0097.000true-1.0097.000true-1.0097.000true-1.0097.000true-1.0097.0" + "'", str7, "97.000true-1.0097.000true-1.0097.000true-1.0097.000true-1.0097.000true-1.0097.000true-1.0097.0");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "04true4-414.400974.4004true4-414.400974.4004true4-414.400974.4004tr4    4A4     404true4-414.400974.4004true4-414.400974.4004true4-414.400974.4004t" + "'", str9, "04true4-414.400974.4004true4-414.400974.4004true4-414.400974.4004tr4    4A4     404true4-414.400974.4004true4-414.400974.4004true4-414.400974.4004t");
    }

    @Test
    public void test36682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36682");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("....4444444444444444444444444444...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa....4444444444444444444444444444...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa....4444444444444444444444444444...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "....4444444444444444444444444444...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa....4444444444444444444444444444...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa....4444444444444444444444444444..." + "'", str1, "....4444444444444444444444444444...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa....4444444444444444444444444444...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa....4444444444444444444444444444...");
    }

    @Test
    public void test36683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36683");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test36684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36684");
        java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("114");
        org.junit.Assert.assertNotNull(bigInteger1);
    }

    @Test
    public void test36685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36685");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("aaa...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1.0097...aa                                                                                            A    44                                                                                            A    44                                                                                            A    44                                                                                            A    44                                                                                            A    44                                                                                            A    44                                                                      ", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test36686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36686");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4aaaaa##############44444444444444000");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test36687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36687");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0097      A   HI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAA       ...", "                                       aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test36688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36688");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "7900.1-eurt0aaaaaaaaaaaaaaaaaaaaaaaaaaa0.7900.1-eurt0A    ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih   A");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test36689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36689");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa", "...##########hihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihitrue-1.00-1.0097.04444444444444444444444444444444A   hi!hi!hi!h#####################...", 618);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test36690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36690");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("a hi!hi!hi!hi!hi!hi!hi!hi!hi!hi... AA hi!hi!hi!hi!0true-1 0097 044444444444444444444444444 4", 175);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 175 + "'", int2 == 175);
    }

    @Test
    public void test36691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36691");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa4444444444444444444444444444444444444444444", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test36692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36692");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "4444444440.7900.1-EURT04444444444444444444444444444444444444444444.790.7900.1-EURT04444444444444444444444444444444444444444444.1-EURT0.7900.1-EURT044444444444444444444444444444444444444444444444444444444444444444444444444444444444444", (java.lang.CharSequence) "4444444...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!aaaaaaaaaaaaaaaaaa4444444...aaaaaa444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444 a4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7 + "'", int2 == 7);
    }

    @Test
    public void test36693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36693");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("...44444444444444444444444444444444444444444444444444444...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test36694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36694");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "                                                      ", (java.lang.CharSequence) "        HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...         444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 8 + "'", int2 == 8);
    }

    @Test
    public void test36695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36695");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) ".. A         A         A         A         A         A         A         A         A         A         A         A         A         A           ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".. A         A         A         A         A         A         A         A         A         A         A         A         A         A           " + "'", str1, ".. A         A         A         A         A         A         A         A         A         A         A         A         A         A           ");
    }

    @Test
    public void test36696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36696");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("True - 97", "AAAAAAAAAAAAAA                         ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "True - 97" + "'", str2, "True - 97");
    }

    @Test
    public void test36697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36697");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0true-100970", 657, 170);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0true-100970" + "'", str3, "...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0true-100970");
    }

    @Test
    public void test36698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36698");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "0true-10aaaa00970aaaa0", (java.lang.CharSequence) "A hi!hi!hi!hi!hi!hi!hi!hi!hi!hi... AA hi!hi!hi!hi!hi!hi!hi!hi!hi!hi... AA hi!hi!hi!hi!hi!hi!hi!hi!hi!hi... AA hi!hi!hi!hi!hi!hi!hi!hi!hi!hi... AA hi!hi!hi!hi!hi!hi!hi!hi!hi!hi... AA hi!hi!hi!hi!hi!hi!hi!hi!hi!hi... AA hi!hi!hi!hi!hi!hi!hi!hi!hi!hi... AA hi!hi!hi!hi!hi!hi!hi!hi!hi!hi... AA hi!hi!hi!hi!hi!hi!hi!hi!hi!hi... AA hi!hi!hi!hi!hi!hi!hi!hi!hi!hi... AA hi!hi!hi!hi!hi!hi!hi!hi!hi!hi... AA hi!hi!hi!hi!hi!hi!hi!hi!hi!hi... AA hi!hi!hi!hi!hi!hi!hi!hi!hi!hi... AA hi!hi!hi!hi!hi!hi!hi!hi!hi!hi... AA hi!hi!hi!hi!hi!hi!hi!hi!hi!hi... AA hi!hi!hi!hi!hi!hi!hi!hi!hi!hi... AA hi!hi!hi!hi!hi!hi!hi!hi!hi!hi... AA hi!hi!hi!hi!hi!hi!hi!hi!hi!hi... AA hi!hi!hi!hi!hi!hi!hi!hi!hi!hi... AA hi!hi!hi!hi!hi!hi!hi!hi!hi!hi... AA hi!hi!hi!hi!hi!hi!hi!hi!hi!hi... AA hi!hi!hi!hi!hi!hi!hi!hi!hi!hi.");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 788 + "'", int2 == 788);
    }

    @Test
    public void test36699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36699");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         " + "'", str2, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ");
    }

    @Test
    public void test36700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36700");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("a444444444444444444444444...44444444444444444444444444444444440true-1.0097...444444444444444444444444hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...44444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444", "########################################################################################################################################                                                                                                                                                            ");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test36701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36701");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("ahi       TRUE!       TRUEhi       TRUE!       TRUEhi       TRUE!       TRUEhaaaaaaaaaaaaaaa       TRUE44444       TRUEaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test36702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36702");
        java.lang.CharSequence charSequence0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance(charSequence0, (java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                 aaaa0aaaaa    aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Strings must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test36703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36703");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("#true-#.############################################################################################################################################################################################                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      ", 451);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test36704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36704");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("444...44444444444444444444444444444444440true-1.0097...44");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray1, "...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...44444444444444444444444444...7900.1-eurt044444444444444444..4444444");
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, "  aa     aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               ", 842, 78);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test36705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36705");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("aaaaaaaaaaaaaaaaaaa hi!hi!hi!hi!hi!hi!hi!hi!hi!hi... 0true-1.0097.0aaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1.0097.0aaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test36706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36706");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!", ' ');
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!" + "'", str3, "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!");
    }

    @Test
    public void test36707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36707");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("0444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0444444444444444444444444444444444444444444" + "'", str1, "0444444444444444444444444444444444444444444");
    }

    @Test
    public void test36708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36708");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("                                                                ...", 0, "                 ...                                                     AAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                ..." + "'", str3, "                                                                ...");
    }

    @Test
    public void test36709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36709");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("444444444444444444444444...7900.1-eurt044444444444444444", "###    a   HI!HI!.", 243);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test36710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36710");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("100.0 aaaa0true-1.0097.044444444444444444444444", "AAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test36711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36711");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("-1.0097... ...44444444444444444444444444444444440TRUE-1.0097...a...44444444444444444444444444444444440TRUE-1.0097... ...4444444444444444444");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"-1.0097... ...44444444444444444444444444444444440TRUE-1.0097...a...44444444444444444444444444444444440TRUE-1.0097... ...4444444444444444444\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test36712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36712");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("0true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.000.7900.1-eurt0444444444444444444444444444444444444444444400.7900.1-eurt0444444444444444444444444444444444444444444400.790                    ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.000.7900.1-eurt0444444444444444444444444444444444444444444400.7900.1-eurt0444444444444444444444444444444444444444444400.790                    " + "'", str1, "0true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.000.7900.1-eurt0444444444444444444444444444444444444444444400.7900.1-eurt0444444444444444444444444444444444444444444400.790                    ");
    }

    @Test
    public void test36713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36713");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("444444444444444444444444444444444444444444479-eurt44444444444444444444444444444444444444444447979-eurt4444444444444444444444444444444444444444444-eurt79-eurt44444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "444444444444444444444444444444444444444444479-eurt44444444444444444444444444444444444444444447979-eurt4444444444444444444444444444444444444444444-eurt79-eurt44444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str3, "444444444444444444444444444444444444444444479-eurt44444444444444444444444444444444444444444447979-eurt4444444444444444444444444444444444444444444-eurt79-eurt44444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test36714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36714");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test36715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36715");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                0true-1.0097.044444444444444444444444444..");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                0true-1.0097.044444444444444444444444444.." + "'", str1, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                0true-1.0097.044444444444444444444444444..");
    }

    @Test
    public void test36716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36716");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("A A A A                        A                             ", "0true-1.0097.00true-1.0097.00true-1.0097.00trHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HH");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "A A A A                        A                             " + "'", str2, "A A A A                        A                             ");
    }

    @Test
    public void test36717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36717");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("                                                                                                                                                                      4444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + Float.POSITIVE_INFINITY + "'", float1 == Float.POSITIVE_INFINITY);
    }

    @Test
    public void test36718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36718");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("            A   hi!hi!hi!haaaaaaaaaaaaaaaaaaaaaaaaaaaa       ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "            A   hi!hi!hi!haaaaaaaaaaaaaaaaaaaaaaaaaaaa       " + "'", str1, "            A   hi!hi!hi!haaaaaaaaaaaaaaaaaaaaaaaaaaaa       ");
    }

    @Test
    public void test36719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36719");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("0true-10aaaa00970aaaa0                                                                                                                                       A    aaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "                                       a HI!HI!HI!HI!HI!HI!HI!HI!HI!HI... a   ");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test36720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36720");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa", "                                             ...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test36721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36721");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("    100.0      0true-1.0097.00true-1.0097.00true-1.0097.00tr4444A444440true-1.0097.00true-1.0097.00true-1.0097.00t                                                                                100.0                                                                                      100.0                                                                                      100.0", "                                                                                               ...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test36722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36722");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "  4444444444444444444444444 true - 1 . 97 . 44444444444444444444444444444444444444444444444444444444444444444444444444444444444444 true - 1 . 97 . 44444444444444444444444444444444444444444444444444444444444444444444444444444444444444 true - 1 . 97 . 4444444444444444444444444444444444444444444974444444444444444444444444444444444444444444 true - 1 . 97 . 44444444444444444444444444444444444444444444444444444444444444444444444444444444444444 true - 1 . 97 . 4444444444444444444444444444444444444444444", (java.lang.CharSequence) "7900.1-eurt0444444444444444444444444444444444444444444444    A     .7900.1-eurt0444444444444444444444444444444444444444444444    A     .7900.1-eurt0444444444444444444444444444444444444444444444    A     .7900.1-eurt0444444444444444444444444444444444444444444444    A     .7900.1-eurt0444444444444444444444444444444444444444444444    A     .7900.1-eurt0444444444444444444444444444444444444444444444    A     .7900.1-eurt0444444444444444444444444444444444444444444444    A     .7900.1-eurt0444444444444444444444444444444444444444444444    A     .7900.1-eurt0444444444444444444444444444444444444444444444    A     .7900.1-eurt044444444444444444444444444444..IH!IH!IH!IH!IH!IH!IH!IH!IH!IH a               a ...IH!IH!IH!IH!IH!IH!IH!IH!IH!IH a               a ...IH!IH!IH!IH!IH!IH!IH!IH!IH!IH a               a ...IH!IH!IH!IH!IH!IH!IH!IH!IH!IH a               a ...IH!IH!IH!IH!IH!IH!IH!IH!IH!IH");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test36723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36723");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("                                                                                                                                                                                                                                                                                                                                     ...44444444444...                                                                                                                                                                                                     ...", ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...44444444444......" + "'", str2, "...44444444444......");
    }

    @Test
    public void test36724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36724");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("0true-1.0097.044444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0true-1.0097.044444444444444444444444444444444444444444" + "'", str1, "0true-1.0097.044444444444444444444444444444444444444444");
    }

    @Test
    public void test36725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36725");
        char[] charArray14 = new char[] { ' ', '4', 'a', 'a', 'a' };
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "100.0", charArray14);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray14);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "44444444444444444444444444444444444444444444true-1.497.44444444444444444444444444444444444444444444", charArray14);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "...44444444444444444444444444444444440true-1.0097...", charArray14);
        boolean boolean19 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "444444444444", charArray14);
        boolean boolean20 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "     a    ", charArray14);
        boolean boolean21 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "4true-1.4497.4444444444444444444444444444", charArray14);
        boolean boolean22 = org.apache.commons.lang3.StringUtils.containsAny("44444444444444444440true-1.0097.", charArray14);
        int int23 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "000044444444444444444444444444AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA###000##AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", charArray14);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray14), " 4aaa");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray14), " 4aaa");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray14), "[ , 4, a, a, a]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 44 + "'", int17 == 44);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 4 + "'", int23 == 4);
    }

    @Test
    public void test36726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36726");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("....4444444444444444444444444444..", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA0true-10aaaa00970aaaa0AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA100.");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test36727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36727");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) (byte) -1, (short) -1, (short) 4);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 4 + "'", short3 == (short) 4);
    }

    @Test
    public void test36728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36728");
        java.lang.CharSequence charSequence1 = null;
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "i!4i!4i!4i!4i!4i!4i!4i!4i!4i!4i!4i!4i!4i!4i!4i44444444444444444444444444444444444444444444TRUE-10497044444444444444444444444444444444444444444444 ", charSequence1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test36729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36729");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.split("444444444444444444444444444444444444444444444444444444444444e-1.0097.00true-1.0097.00true-1.0097.00tr    a     0true-1.0097.00true-1.0097.00true-1.0097.00tr", "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", 156);
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.stripAll(strArray5, "                 ...                                                     aaaaaaaaaaaaaaaaaaaaaaaaaa");
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.concatWith("0true-1.00-1.0097.0444444444444444444444444444444......       aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa4444444444444444444", (java.lang.Object[]) strArray5);
        java.lang.String[] strArray13 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("", "  A      A                            100.0                                                     AAAA", 98);
        java.lang.String[] strArray16 = org.apache.commons.lang3.StringUtils.split("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...", "44444444444444444440true-1.0097.");
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.replaceEach("", strArray13, strArray16);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.replaceEach("444444444444444444444444444444444440true-1.0097. A 4444444444444444444444444444444444444444444440true-1.0097. A 4444444444444444444444444444444444444444444440true-1.0097. A 4444444444444444444444444444444444444444444440true-1.0097. A 4444444444444444444444444444444444444444444440true-1.0097. A 4444444444444444444444444444444444444444444440true-1.0097. A 4444444444444444444444444444444444444444444440true-1.0097. A 4444444444444444444444444444444444444444444440true-1.0097. A 4444444444444444444444444444444444444444444440true-1.0097.", strArray5, strArray13);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "e-1.0097.00true-1.0097.00true-1.0097.00tr    a     0true-1.0097.00true-1.0097.00true-1.0097.00tr" + "'", str8, "e-1.0097.00true-1.0097.00true-1.0097.00tr    a     0true-1.0097.00true-1.0097.00true-1.0097.00tr");
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "444444444444444444444444444444444440true-1.0097. A 4444444444444444444444444444444444444444444440true-1.0097. A 4444444444444444444444444444444444444444444440true-1.0097. A 4444444444444444444444444444444444444444444440true-1.0097. A 4444444444444444444444444444444444444444444440true-1.0097. A 4444444444444444444444444444444444444444444440true-1.0097. A 4444444444444444444444444444444444444444444440true-1.0097. A 4444444444444444444444444444444444444444444440true-1.0097. A 4444444444444444444444444444444444444444444440true-1.0097." + "'", str18, "444444444444444444444444444444444440true-1.0097. A 4444444444444444444444444444444444444444444440true-1.0097. A 4444444444444444444444444444444444444444444440true-1.0097. A 4444444444444444444444444444444444444444444440true-1.0097. A 4444444444444444444444444444444444444444444440true-1.0097. A 4444444444444444444444444444444444444444444440true-1.0097. A 4444444444444444444444444444444444444444444440true-1.0097. A 4444444444444444444444444444444444444444444440true-1.0097. A 4444444444444444444444444444444444444444444440true-1.0097.");
    }

    @Test
    public void test36730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36730");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("4true4", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4true4" + "'", str2, "4true4");
    }

    @Test
    public void test36731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36731");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("A A A A                        A                       ...AAAA0AAAAA44444444444444444444444444444444444444444440TRUE-1.0097.0AAAA0AAAAA44444444444444444444444444444444444444444440TRUE-1.0097.0AAAA0AAAAA44444444444444444444444444444444444444444440TRUE-1.0097.0AAAA0AAAAA44444444444444444444444444444444444444444440TRUE-1.0097.0AAAA0AAAAA44444444444444444444444444444444444444444440TRUE-1.0097.0AAAA0AAAAA44444444444444444444444444444444444444444440TRUE-1.0097.0AAAA0AAAAA44444444444444444444444444444444444444444440TRUE-1.0097.0AAAA0AAAAA44444444444444444444444444444444444444444440TRUE-1.0097.0AAAA0AAAAA44444444444444444444444444444444444444444440TRUE", (short) (byte) 100);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 100 + "'", short2 == (short) 100);
    }

    @Test
    public void test36732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36732");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("4A4 4rt4004.479004.414-4eurt4004.47444444444444444444444444444444444444444444444444444 4A4 4rt4004.479004.414-4eurt4004.47", "444444444444444444444444                                                                                        100.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4A4 4rt4004.479004.414-4eurt4004.47444444444444444444444444444444444444444444444444444 4A4 4rt4004.479004.414-4eurt4004.47" + "'", str2, "4A4 4rt4004.479004.414-4eurt4004.47444444444444444444444444444444444444444444444444444 4A4 4rt4004.479004.414-4eurt4004.47");
    }

    @Test
    public void test36733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36733");
        short[] shortArray1 = new short[] { (byte) -1 };
        short short2 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short3 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        short short4 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short5 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        short short6 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        short short7 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short8 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        short short9 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
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
    }

    @Test
    public void test36734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36734");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("...                     aaaaa0aaaa                     aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...                     aaaaa0aaaa                     aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.....", "            aaaa0aaaaa0aaaa0aaaaa0aaaa0aaaaa0aaaa0a");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test36735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36735");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("A    4444444444444444444444444444444444444444444440true-1.0097.     A    44444444444444444444", "                                                                                                                                                                                               ", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaa              aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "A    4444444444444444444444444444444444444444444440true-1.0097.     A    44444444444444444444" + "'", str3, "A    4444444444444444444444444444444444444444444440true-1.0097.     A    44444444444444444444");
    }

    @Test
    public void test36736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36736");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("                   rt00.7900.                   ", "      #a######################...##############################################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                   rt00.7900.                   " + "'", str2, "                   rt00.7900.                   ");
    }

    @Test
    public void test36737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36737");
        char[] charArray11 = new char[] { '4', '4', ' ' };
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "0", charArray11);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "44444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444", charArray11);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "aaaa0aaaaa", charArray11);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) " true-1.  97. ", charArray11);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "...4444...                       a                       a                       a                       a                       a                       a  ", charArray11);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "                                                                                                                                                                                                                                                                   ", charArray11);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "44444444444444444444444444444444444444444444444...", charArray11);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                                           444444444444", charArray11);
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
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test36738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36738");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("                                                                                            A    44", (long) 245);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 245L + "'", long2 == 245L);
    }

    @Test
    public void test36739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36739");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "aHI!HI!HI!HI!HI!HI!HI!HI!HI!HI...aaHI!HI!HI!HI!HI!HI!HI!HI!HI!HI...aaHI!HI!HI!HI!HI!HI!HI!HI!HI!HI...aaHI!HI!HI!HI!HI!HI!HI!HI!HI!HI...aaHI!HI!HI!HI!HI!HI!HI!HI!HI!HI..444444444444444444444444444440true-1.0097.A4444444444444444444444444444444444444444444440true-1.0097.A4444444444444444444444444444444444444444444440true-1.0097.A4444444444444444444444444444444444444444444440true-1.0097.A4444444444444444444444444444444444444444444440true-1.0097.A4444444444444444444444444444444444444444444440true-1.0097.A4444444444444444444444444444444444444444444440true-1.0097.A4444444444444444444444444444444444444444444440true-1.0097.A4444444444444444444444444444444444444444444440true-1.0097.A4444444444444444444444444444444444444444444440true-1.0097");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test36740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36740");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("Hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        4444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test36741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36741");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A", '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A" + "'", str2, "A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A");
    }

    @Test
    public void test36742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36742");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("", "A0A0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR    A     0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test36743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36743");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "                         AAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test36744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36744");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "...44444444444...                                                                                                                                                                                                       ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test36745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36745");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...444444");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test36746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36746");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfBlank((java.lang.CharSequence) "TRUE", (java.lang.CharSequence) "4444444...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "TRUE" + "'", charSequence2, "TRUE");
    }

    @Test
    public void test36747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36747");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("aHI!HI!HI!HI!HI!HI!HI!HI!HI!HI...aaHI!HI!HI!HI!HI!HI!HI!HI!HI!HI...aaHI!HI!HI!HI!HI!HI!HI!HI!HI!HI...aaHI!HI!HI!HI!HI!HI!HI!HI!HI!HI...aaHI!HI!HI!HI!HI!HI!HI!HI!HI!HI..444444444444444444444444444440true-1.0097.A4444444444444444444444444444444444444444444440true-1.0097.A4444444444444444444444444444444444444444444440true-1.0097.A4444444444444444444444444444444444444444444440true-1.0097.A4444444444444444444444444444444444444444444440true-1.0097.A4444444444444444444444444444444444444444444440true-1.0097.A4444444444444444444444444444444444444444444440true-1.0097.A4444444444444444444444444444444444444444444440true-1.0097.A4444444444444444444444444444444444444444444440true-1.0097.A4444444444444444444444444444444444444444444440true-1.0097.", "4444444...", 55);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test36748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36748");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("true-1.97.", "                                1aaaaaaaaaaa4444444...4444444...4444444...4  ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test36749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36749");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(54, 68, 88);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 54 + "'", int3 == 54);
    }

    @Test
    public void test36750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36750");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("444444444444444440true-1.0097...444444444444444444444444#####################################################################################################################################################################################", "...I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HhI!7.44444444444444444444444444444444444444444444 ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test36751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36751");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("a0aaaaa              0true-1.0097.00true-1.0097.00true-1.0097.00tr    A     0true-1.0097.00true-1.0097.00true-1.0097.00tr     A    44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444     A    44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444     A    44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444     A    44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444     A    44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"a0aaaaa              0true-1.0097.00true-1.0097.00true-1.0097.00tr    A     0true-1.0097.00true-1.0097.00true-1.0097.00tr     A    44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444     A    44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444     A    44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444     A    44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444     A    44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test36752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36752");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("                                                                                                                                                                                               ", "aaaaaaaaaaaaaaaaaaaA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    A0T", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                                                                                               " + "'", str3, "                                                                                                                                                                                               ");
    }

    @Test
    public void test36753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36753");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("a HI!HI!HI!HI!HI!HI!HI!HI!HI!HI... a", 202, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "a HI!HI!HI!HI!HI!HI!HI!HI!HI!HI... a                                                                                                                                                                      " + "'", str3, "a HI!HI!HI!HI!HI!HI!HI!HI!HI!HI... a                                                                                                                                                                      ");
    }

    @Test
    public void test36754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36754");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("...444###################################################44444444444444444444444", "Ahi!hi!hi!haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444444444444444444444444444444444444444440true-1.0097.  A    44444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    44444444!hi!hi!hi...    A0true-1.0097.0aaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1.0097.0aaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "###################################################44444444444444444444444" + "'", str2, "###################################################44444444444444444444444");
    }

    @Test
    public void test36755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36755");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "0 true - 1 ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test36756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36756");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("...                                                                             ......                                                                             ......                                                                             ......                                                                             ......                                                                             ......      ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test36757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36757");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!                            100.0                                                     aaaahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h4444444444444444444444444444444444444444444444444444444", "4444444...true-1.4444444...97.4444444...4444444444444444444444444444444444444444444", 61);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test36758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36758");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "########################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################0true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.00...", "A4A4A4A444444444444444444444444a44444444444444444444444...aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test36759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36759");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray2);
        boolean boolean4 = org.apache.commons.lang3.StringUtils.startsWithAny("44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444A    ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih   A44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test36760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36760");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str1, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test36761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36761");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("A A 1000 A A", ".. A...444444444...", 256);
        boolean boolean6 = org.apache.commons.lang3.StringUtils.startsWithAny("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", strArray5);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.concatWith("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (java.lang.Object[]) strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1000aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str7, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1000aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test36762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36762");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "aaaaa0aaaa0.7900.1-eurt0#4aaaaa0aaaa0.7900.1-eurt0#4aaaaa0aaaa0.7900.1-eurt0#4aaaaa0aaaa0.7900.1-eurt0#4aaaaa0aaaa0.7900.1-eurt0#4aaaaa0aaaa0.7900.1-eurt0#4aaaaa0aaaa0.7900.1-eurt0#4aaaaa0aaaa0.7900.1-eurt0#4aaaaa0aaaa0.7900.1-eurt0#4aaaaa0aaaa     ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test36763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36763");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("4444444444444444444444444444444444444444444440true-1.0097 A 4444444444444444444444444444444444444444444440true-1.0097. A 4444444444444444444444444444444444444444444440true-1.0097. A 4444444444444444444444444444444444444444444440true-1.0097. A 44444444444444", ".", 78);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test36764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36764");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("                     AAAA0AAAAA                     ...i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", (float) 957L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 957.0f + "'", float2 == 957.0f);
    }

    @Test
    public void test36765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36765");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("A    44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test36766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36766");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("444444444444444444444444444444444444444444444     4    44444444444444444444444444444444444444444444444                                      100.0                                                     aaaa444444444444444444444", "            444444444444444  444444444444444             ..", 0, 79);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "            444444444444444  444444444444444             ..44444444444444444444444                                      100.0                                                     aaaa444444444444444444444" + "'", str4, "            444444444444444  444444444444444             ..44444444444444444444444                                      100.0                                                     aaaa444444444444444444444");
    }

    @Test
    public void test36767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36767");
        short[] shortArray1 = new short[] { (byte) -1 };
        short short2 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short3 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        short short4 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short5 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        short short6 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short7 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short8 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        short short9 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
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
    }

    @Test
    public void test36768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36768");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("100.0100.0100.0100.0100.0100.0100.0100.0100.0", 165, 202);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test36769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36769");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("    A         A         A  A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A!hi!h!hi!h", 168, 69);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "         A         A         A         A         A         A         " + "'", str3, "         A         A         A         A         A         A         ");
    }

    @Test
    public void test36770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36770");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("AAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAA", "", "4444444444444444444444444444444444444444444true-1.97.4444444444444444444444444444444444444444444444444444444444444444444444444444444444444true-1.97.444444444444444444444444444444444444444444");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test36771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36771");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("                  4                   0TRUE-1.0097.04444444444444444444444444444444444444444440TRUE-1.0097.04444444444444444444444444", "TRUE-1.00TRUE-1.97.                                      ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test36772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36772");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("Rue-1.0097.0", "!HAAAAAAAAAAAAAAAAAAAAAAAAAAAA...44");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Rue-1.0097.0" + "'", str2, "Rue-1.0097.0");
    }

    @Test
    public void test36773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36773");
        char[] charArray9 = new char[] { '4', '4', ' ' };
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "0", charArray9);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444", charArray9);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "    A     ", charArray9);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", charArray9);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "0444444444444444444444444444444444444444444444444444444444444e-1.0097.00true-1.0097.00true-1.0097.00tr    a     0true-1.0097.00true-1.0097.00true-1.0097.00tr.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.00...", charArray9);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsAny("...##########hihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihitrue-1.00-1.0097.04444444444444444444444444444444A   hi!hi!hi!h#####################...", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "44 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "44 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[4, 4,  ]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test36774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36774");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("44444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT04444444444444444444444444444444444444444444             ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "44444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT04444444444444444444444444444444444444444444" + "'", str1, "44444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT04444444444444444444444444444444444444444444");
    }

    @Test
    public void test36775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36775");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 30, 43.0d, (double) 55.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 30.0d + "'", double3 == 30.0d);
    }

    @Test
    public void test36776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36776");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("true-1...97.............................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "TRUE-1...97............................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................." + "'", str1, "TRUE-1...97.............................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................");
    }

    @Test
    public void test36777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36777");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("#########################################################", "aHI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test36778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36778");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 156.0f, 45.0d, (double) 138);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 156.0d + "'", double3 == 156.0d);
    }

    @Test
    public void test36779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36779");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 28.0f, 557.0d, (double) 625);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 28.0d + "'", double3 == 28.0d);
    }

    @Test
    public void test36780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36780");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase(".7900.1-eurt0444444444444444444444444444444444444444444444    A     .7900.1-eurt0444444444444444444444444444444444444444444444    A     .7900.1-eurt0444444444444444444444444444444444444444444444    A     .7900.1-eurt0444444444444444444444444444444444444444444444    A     .7900.1-eurt0444444444444444444444444444444444444444444444    A     .7900.1-eurt0444444444444444444444444444444444444444444444    A     .7900.1-eurt0444444444444444444444444444444444444444444444    A     .7900.1-eurt0444444444444444444444444444444444444444444444    A     .7900.1-eurt0444444444444444444444444444444444444444444444    A     .7900.1-eurt044444444444444444444444444444..IH!IH!IH!IH!IH!IH!IH!IH!IH!IH a               a ...IH!IH!IH!IH!IH!IH!IH!IH!IH!IH a               a ...IH!IH!IH!IH!IH!IH!IH!IH!IH!IH a               a ...IH!IH!IH!IH!IH!IH!IH!IH!IH!IH a               a ...IH!IH!IH!IH!IH!IH!IH!IH!IH!IH a", "aahaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test36781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36781");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("                                                                                                               ", "0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HH 0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.0", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        A   hi!hi!hi!haaaaaaaaaaaaaaaaaaaaaaaaaaaa       ");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test36782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36782");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("...444444");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test36783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36783");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("A A A        ");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.stripAll(strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test36784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36784");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("4444444444444444444                                                                ", "ART00.7900.1-EURT00.7900.1-EURT00.7900.1-EURT0 A RT00.7900.1-EURT00.7900.1-EURT00.7900.1-EURT0      A         A         A         A         A         A         A         A         A         A         A         A         A         A", "ue", 150);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4444444444444444444                                                                " + "'", str4, "4444444444444444444                                                                ");
    }

    @Test
    public void test36785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36785");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(734, 98, 109);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
    }

    @Test
    public void test36786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36786");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("4444444...4444444...44a1a4444444...4444444...44...a1     a    44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test36787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36787");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("0true-1.0097.00true-1.0097.00true-1.0097.00tr A", "44444444444444444444444444444444444444444440true-1.0097. A 44444444444444444440true-1.0097. A 4444444444444444444444444444444444444444444440true-1.0097. A 4444444444444444444444444444444444444444444440true-1.0097. A 4444444444444444444444444444444444444444444440true-1.0097. A 4444444444444444444444444444444444444444444440true-1.0097. A 4444444444444444444444444444444444444444444440true-1.0097. A 4444444444444444444444444444444444444444444440true-1.0097. A 4444444444444444444444444444444444444444444440true-1.0097. A 4444444444444444444444444444444444444444444440true-1.0097");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test36788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36788");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("                                         ...      ", 449, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                         ...      444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str3, "                                         ...      444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test36789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36789");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min(56.0d, 91.0d, (double) 585.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 56.0d + "'", double3 == 56.0d);
    }

    @Test
    public void test36790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36790");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("", 150, 650);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test36791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36791");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(0L, (long) 123, (long) 32);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 123L + "'", long3 == 123L);
    }

    @Test
    public void test36792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36792");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("hi!Hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        A   hi!hi!hi!haaaaaaaaaaaaaaaaaaaaaaaaaaaa      ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!Hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str2, "hi!Hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test36793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36793");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                     aaaa0aaaaa                    ", "4444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444");
        int int4 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("Hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test36794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36794");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR4444A444440TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00T", 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test36795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36795");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("                                                                                                                                                          ...                                                                                                                                                                                                                                                                                            ", "aAAAAAAAAAAAAAAAA......aAAAAAAAAAAAAAAAA...0aAAAAAAAAAAAAAAAA......", "444444A44444444");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                                                          ...                                                                                                                                                                                                                                                                                            " + "'", str3, "                                                                                                                                                          ...                                                                                                                                                                                                                                                                                            ");
    }

    @Test
    public void test36796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36796");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "444444444444444444440TRUE-    A     ...A   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    A");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test36797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36797");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("444444444444444444444444...7900.1-eurt044444444444444444", "                                                                                                                                                                                                                                                                                                                   aaaa0aaaaa0aaaa0aaaaa0aaaa0aaaaa0aaaa0aa                                                                                                                                                                                                                                                                                                                    ", 92);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test36798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36798");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("aaa...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1.0097...aa                                                                                            A    44                                                                                            A    44                                                                                            A    44                                                                                            A    44                                                                                            A    44                                                                                            A    44                                                                      ", "AHI!HI!HI!HI!HI!HI!HI!HI!HI!HI...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test36799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36799");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("...44444444444..", 2, "0true-1.0097.00true-1.0097.00true-1.0097.00trA0true-1.0097.00true-1.0097.00true-1.0097.00tr");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...44444444444.." + "'", str3, "...44444444444..");
    }

    @Test
    public void test36800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36800");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("     hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...           hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...           hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...           hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...           hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...           hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...           hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...           hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    a00       000       000       00aaaaaaaaaaaaaaaaaaaaaaaaaa00       000       000       00aa  A      A                            100.0                                                     aaaa", "HHHH0H7900H1-EURT0HHHHH0HHHH0H7900H1-EURT0HHHHH0HHHH0H7900H1-EURT0HHHHH0HHHH0H7900H1-EURT0HHHHH0HHHH0H7900H1-EURT0HHHHH0HHHH0H7900H1-EURT0HHHHH0HHHH0H7900H1-EURT0HHHHH0HHHH0");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test36801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36801");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a!HI!H!HI!H");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a!HI!H!HI!" + "'", str1, "a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a!HI!H!HI!");
    }

    @Test
    public void test36802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36802");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("0aaaa 0aaaa 0aaaa", "aHI!HI!HI!HI!HI!HI!HI!HI!HI!HIaaHI!HI!HI!HI!HI!HI!HI!HI!HI!HIa", 87);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test36803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36803");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "#########################################HI!HI!HI!HI!HI!HI!HI!HI!HI!HI#############################################################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "#########################################HI!HI!HI!HI!HI!HI!HI!HI!HI!HI#############################################################" + "'", str1, "#########################################HI!HI!HI!HI!HI!HI!HI!HI!HI!HI#############################################################");
    }

    @Test
    public void test36804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36804");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("aaaaaaaaa4444444444444444444444444444444444444444444true-1aaaaaaaaa4444444444444444444444444444444444444444444true-1aaaaaaaaa4444444444444444444444444444444444444444444true-1aaaaaaaaa4444444444444444444444444444444444444444444true-1aaaaaaaaa4444444444444444444444444444444444444444444true-1aaaaaaaaa4444444444444444444444444444444444444444444true-1aaaaaaaaa4444444444444444444444444444444444444444444true-1aaaaaaaaa4444444444444444444444444444444444444444444true-1aaaaaaaaa4444444444444444444444444444444444444444444");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"aaaaaaaaa4444444444444444444444444444444444444444444true-1aaaaaaaaa4444444444444444444444444444444444444444444true-1aaaaaaaaa4444444444444444444444444444444444444444444true-1aaaaaaaaa4444444444444444444444444444444444444444444true-1aaaaaaaaa4444444444444444444444444444444444444444444true-1aaaaaaaaa4444444444444444444444444444444444444444444true-1aaaaaaaaa4444444444444444444444444444444444444444444true-1aaaaaaaaa4444444444444444444444444444444444444444444true-1aaaaaaaaa4444444444444444444444444444444444444444444\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test36805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36805");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("....IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I...", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444444444...                            ", 26);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test36806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36806");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(243, 657, 43);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 657 + "'", int3 == 657);
    }

    @Test
    public void test36807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36807");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited(".....4444444444444444444444444444...4444444444........4444444444444444444444444444...4444444444........4444444444444444444444444444444.....4444444444444444444444444444...4444444444........4444444444444444444444444444...4444444444........4444444444444444444444444444.", ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ".....4444444444444444444444444444...4444444444........4444444444444444444444444444...4444444444........4444444444444444444444444444444.....4444444444444444444444444444...4444444444........4444444444444444444444444444...4444444444........4444444444444444444444444444." + "'", str2, ".....4444444444444444444444444444...4444444444........4444444444444444444444444444...4444444444........4444444444444444444444444444444.....4444444444444444444444444444...4444444444........4444444444444444444444444444...4444444444........4444444444444444444444444444.");
    }

    @Test
    public void test36808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36808");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("IH", "HHHHHHHHHHHHHHHHHHHrue-1.0097.0             a");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test36809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36809");
        float[] floatArray4 = new float[] { 100, (byte) -1, (short) 1, (byte) -1 };
        float float5 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        float float6 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        float float7 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        float float8 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        float float9 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        float float10 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        float float11 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        float float12 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        float float13 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        java.lang.Class<?> wildcardClass14 = floatArray4.getClass();
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
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + (-1.0f) + "'", float13 == (-1.0f));
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test36810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36810");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "444444444444444444       4444444440");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test36811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36811");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("    ");
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.stripAll(strArray8);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray9);
        java.lang.String[] strArray14 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("4444444...", "a", (int) '4');
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444", strArray9, strArray14);
        java.lang.String[] strArray17 = org.apache.commons.lang3.StringUtils.stripAll(strArray9, "44444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444");
        boolean boolean18 = org.apache.commons.lang3.StringUtils.endsWithAny("                                      100.0                                                      ", strArray9);
        java.lang.String[] strArray21 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("4444444...");
        java.lang.String[] strArray23 = org.apache.commons.lang3.StringUtils.stripAll(strArray21, "##100.0###");
        java.lang.String[] strArray24 = org.apache.commons.lang3.StringUtils.stripAll(strArray23);
        boolean boolean25 = org.apache.commons.lang3.StringUtils.endsWithAny(" A rt00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt0", strArray23);
        java.lang.String str26 = org.apache.commons.lang3.StringUtils.replaceEach("4", strArray9, strArray23);
        java.lang.String[] strArray27 = org.apache.commons.lang3.StringUtils.stripAll(strArray23);
        java.lang.String str28 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray23);
        java.lang.String str29 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("444...44444444444444444444444444444444440true-1.0097...44                                        ", strArray3, strArray23);
        java.lang.String str30 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray3);
        java.lang.String str32 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, ' ');
        boolean boolean33 = org.apache.commons.lang3.StringUtils.startsWithAny("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAATRUE97TRUE97AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444" + "'", str15, "44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444");
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "4" + "'", str26, "4");
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "4444444" + "'", str28, "4444444");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "444...44444444444444444444444444444444440true-1.0097...444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str29, "444...44444444444444444444444444444444440true-1.0097...444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "    " + "'", str30, "    ");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "    " + "'", str32, "    ");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test36812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36812");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H...", '#', 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H..." + "'", str3, "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H...");
    }

    @Test
    public void test36813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36813");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("44444...");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"44444...\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test36814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36814");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("           A         A         A         A         A         A         A         A         A         A         A         A         A         A ..", '#');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test36815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36815");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("444444444444444444444444...", '4');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test36816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36816");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("000044444444444444444444444444AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA###000##AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  ", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "000044444444444444444444444444AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA###000##AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  " + "'", str2, "000044444444444444444444444444AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA###000##AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  ");
    }

    @Test
    public void test36817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36817");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("                                                                                                                                  aaaa0                                                                                                                                  ", "444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                  aaaa0                                                                                                                                  " + "'", str2, "                                                                                                                                  aaaa0                                                                                                                                  ");
    }

    @Test
    public void test36818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36818");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            ...4A   HI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAA...44");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test36819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36819");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("4444444..0aaaa hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi", ".0097.00true-1.0097.00true-1.0097.00tr", 16);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test36820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36820");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("                                                                                                                                                                                                                                                                                                                                                                                                               44                     aaaa0aaaaa                                          aaaa0aaaaa                                          aaaa0aaaaa       ...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "44                     aaaa0aaaaa                                          aaaa0aaaaa                                          aaaa0aaaaa       ..." + "'", str1, "44                     aaaa0aaaaa                                          aaaa0aaaaa                                          aaaa0aaaaa       ...");
    }

    @Test
    public void test36821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36821");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("00       0", "  4444444444444444444444444 true - 1 . 97 . 44444444444444...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test36822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36822");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     ", "0h!ih!h!ih!.h!ih!h!ih!0010h!ih!h!ih!.h!ih!h!ih!0h!ih!h!ih!hi");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test36823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36823");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("                                   ...                                   ", "...........#######################################################################################", 732);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test36824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36824");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "4000                                                                                                                                                     HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...         444444444444444444444444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4000                                                                                                                                              ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 570 + "'", int1 == 570);
    }

    @Test
    public void test36825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36825");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("", "444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0true-1.44444444444444444444444444444444444444444440true-1.0097.097.44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444", 0);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.concatWith("444444444444444444444444...44444444444444444444444444444444440TRUE-1.0097...444444444444444444444444", (java.lang.Object[]) strArray5);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray5);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray5);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray5, "HI!", 56, 47);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray5, 'a');
        int int15 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray5);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.concatWith("true-1.       ...97", (java.lang.Object[]) strArray5);
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray5, '4', 36, 1);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test36826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36826");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("1.0097.04444444444444444444444444", "                                                                                                                                                                                   ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test36827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36827");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("a                             ###    A   hi!hi!...###    A   hi!hi!...###", "#########################################################################################################################################################", 400);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "a                             ###    A   hi!hi!...###    A   hi!hi!...###" + "'", str3, "a                             ###    A   hi!hi!...###    A   hi!hi!...###");
    }

    @Test
    public void test36828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36828");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("#############################################################################################################################################################################################################################################################4ue-1.0097...444444444444444444444444########################################################################################100.44##############################################################################################################################################################################################################################################################");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: #############################################################################################################################################################################################################################################################4ue-1.0097...444444444444444444444444########################################################################################100.44############################################################################################################################################################################################################################################################## is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test36829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36829");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("aaaaaaaaaaa444##444440true-1.0097...4444444444444444444440true-1#0097###444444444444##444440true-1.0097...4444444444444444444440true-1#0097###44...444##444440true-1.0097...4444444444444444444440true-1#0097###444444444444##444440true-1.0097...4444444444444444444440true-1#0097###44...444##444440true-1.0097...4444444444444444444440true-1#0097###444444444444##444440true-1.0097...4444444444444444444440true-1#0097###44...444##444440true-1.0097...4444444444444444444440true-1#0097###444444##444440true-1.0097...4444444444444444444440true-1#0097###44...444##444440true-1.0097...4444444444444444444440true-1#0097###44aaaaaaaaaaa", "                                                     0.001                            a      a  444440444                                                     0.001                            a      a  444440444                                                     0.001                            a      a  444440444                                                     0.001                            a      a  444440444                                                     0.001                            a      a  444440444                                                     0.001                            a      a  444440444                                                     0.001                            a      a  ", 35);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test36830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36830");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("                      aaaa 0 aaaaa               ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                      aaaa 0 aaaaa               " + "'", str1, "                      aaaa 0 aaaaa               ");
    }

    @Test
    public void test36831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36831");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("444440true-1.0097...4444440true-1.0097...4444440444444444444444444444444444444440true-1.0097...4444440true-1.0097...4444440", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "444440true-1.0097...4444440true-1.0097...4444440444444444444444444444444444444440true-1.0097...4444440true-1.0097...4444440" + "'", str2, "444440true-1.0097...4444440true-1.0097...4444440444444444444444444444444444444440true-1.0097...4444440true-1.0097...4444440");
    }

    @Test
    public void test36832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36832");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("4444444444444444444444A A A A 444444444444444440TRUE-1.0097.  A    44444444444444444440TRUE-1.0097.     A    4444444444444444444444444444444444444444444440TRUE-1.0097.     A    4444444444444444444444444444444444444444444440TRUE-1.0097.     A    4444444444444444444444444444444444444444444440TRUE-1.0097.     A    4444444444444444444444444444444444444444444440TRUE-1.0097.     A    4444444444444444444444444444444444444444444440TRUE-1.0097.     A    4444444444444444444444444444444444444444444440TRUE-1.0097.     A    4444444444444444444444444444444444444444444440TRUE-1.0097.     A    4444444444444444444444444444444444444444444440TRUE-1.0097", "AHI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test36833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36833");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("0true-1.0097.044444444444444444444444444 ...a                               ", "                                                                                                                                                                                                                                                                                                                                                                    444444444..");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                    444444444.." + "'", str2, "                                                                                                                                                                                                                                                                                                                                                                    444444444..");
    }

    @Test
    public void test36834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36834");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test36835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36835");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("                       0aaa                        ", (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                       0aaa                        " + "'", str2, "                       0aaa                        ");
    }

    @Test
    public void test36836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36836");
        double[] doubleArray6 = new double[] { 181.0f, 57L, 4.4444042E9f, 444, 50.0d, 25L };
        double double7 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray6);
        double double8 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray6);
        double double9 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray6);
        double double10 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[181.0, 57.0, 4.444404224E9, 444.0, 50.0, 25.0]");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 25.0d + "'", double7 == 25.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 25.0d + "'", double8 == 25.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 4.444404224E9d + "'", double9 == 4.444404224E9d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 4.444404224E9d + "'", double10 == 4.444404224E9d);
    }

    @Test
    public void test36837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36837");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("                                                                                                                                                                                                                        4444A44444                                                                                                                                                                                                                          ", "..................................");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                        4444A44444                                                                                                                                                                                                                          " + "'", str2, "                                                                                                                                                                                                                        4444A44444                                                                                                                                                                                                                          ");
    }

    @Test
    public void test36838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36838");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("a0aaaaa##############0true-1.0097.0444", 25);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "a0aaaaa##############0true-1.0097.0444" + "'", str2, "a0aaaaa##############0true-1.0097.0444");
    }

    @Test
    public void test36839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36839");
        java.lang.CharSequence charSequence1 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "A    4", charSequence1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test36840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36840");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("4444444... 4444444... 4444444... 4444444... 4444444... 4444444... 4444444... 4444444... 4444444... 4444444... 4444444... 4444444... 4444444... 4444444... 4444444... 4444444... 4444444... 4444444... 4444444... 4444444... 4444444... 4444444... 4444444... 4444444...", "4444444...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!", "A 0true-1.0097.00true-1.0097.00true-1.0097.00tr");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test36841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36841");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa       ...", (float) 614);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 614.0f + "'", float2 == 614.0f);
    }

    @Test
    public void test36842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36842");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) ".44444444444444444444444444444444A    4");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".44444444444444444444444444444444A    4" + "'", str1, ".44444444444444444444444444444444A    4");
    }

    @Test
    public void test36843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36843");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("4444444###4444444###4444444###4###", "                                                                                                          HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH             A                                                                                                                ", 62);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                  4                  ", ".ih!ih!ih!ih!ih!ih!ih!ih!ih!ih AA ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih AA ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih AA ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih AA ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih AA ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih AA ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih AA ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih AA ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih AA ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih AA ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih AA ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih AA ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih AA ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih AA ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih AA ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih AA ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih AA ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih AA ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih AA ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih AA ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih AA ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih A", 229);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("A   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    A", strArray4, strArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 1 vs 37");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test36844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36844");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("A A A A                        a                       ...aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test36845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36845");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("444444444444444444444444...44444", "true - 97", (int) (short) 100, 820);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "444444444444444444444444...44444true - 97" + "'", str4, "444444444444444444444444...44444true - 97");
    }

    @Test
    public void test36846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36846");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("a", "44444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444");
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.stripAll(strArray8);
        java.lang.String[] strArray12 = org.apache.commons.lang3.StringUtils.split("44444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444", '4');
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.replaceEach("100.0", strArray9, strArray12);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.endsWithAny("a", strArray9);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray9);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.replaceEach("4444444..444444444444444440true-1.0097...44444444444444444444444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...", strArray4, strArray9);
        int int17 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa    A     ", strArray9);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray9);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray9);
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray9);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "100.0" + "'", str13, "100.0");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "4444444..444444444444444440true-1.0097...44444444444444444444444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444..." + "'", str16, "4444444..444444444444444440true-1.0097...44444444444444444444444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test36847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36847");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("                                                                                                                                                                                                                                                                                                                                         ih0.0100.0                                                                                                                                                                                                                                                                                                                                        ", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA0TRUE-1A009AAA", 571, 128);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "                                                                                                                                AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA0TRUE-1A009AAA                                                                                                " + "'", str4, "                                                                                                                                AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA0TRUE-1A009AAA                                                                                                ");
    }

    @Test
    public void test36848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36848");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("...7900...7900...7900...7900", (byte) 0);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 0 + "'", byte2 == (byte) 0);
    }

    @Test
    public void test36849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36849");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("4444444444444444444444444444444444444444444true-1.97.44444444444444444444444444444444444444444444", 655);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444444444444444444444444444444444444444true-1.97.44444444444444444444444444444444444444444444" + "'", str2, "4444444444444444444444444444444444444444444true-1.97.44444444444444444444444444444444444444444444");
    }

    @Test
    public void test36850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36850");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("                                                                                                                                           0true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.0", 253, 384);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "rue-1.0097.00true-1.0097.0" + "'", str3, "rue-1.0097.00true-1.0097.0");
    }

    @Test
    public void test36851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36851");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "                                                                                                                                                                                                                                                                                         rue-1.0097.0                                                                                                                                                                                                                                                               ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test36852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36852");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("##100.0###4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test36853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36853");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "      a         a         a         a         a                                                                                                                                      ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test36854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36854");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("04444444444444444444444444", 551, 648);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test36855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36855");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("...........#######################################################################################", "0TRUE-1.0097.00T..0TRUE-1.0097.00T                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ", 570);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...........#######################################################################################" + "'", str3, "...........#######################################################################################");
    }

    @Test
    public void test36856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36856");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("aaa444444444444444440true-1a0097aaa444444444444444444444444", 12);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaa444444444444444440true-1a0097aaa444444444444444444444444" + "'", str2, "aaa444444444444444440true-1a0097aaa444444444444444444444444");
    }

    @Test
    public void test36857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36857");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("000                                                                                                                                                                                                                                                                                                                                                                                       ", "ue-1.0097...444444444444444444444444########################################################################################100.", 57);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "000                                                                                                                                                                                                                                                                                                                                                                                       " + "'", str3, "000                                                                                                                                                                                                                                                                                                                                                                                       ");
    }

    @Test
    public void test36858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36858");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "A44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444", "4444444444444444444444444444440ta4444444444444444444444444444440t    4444444444444444444444444444440t44");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test36859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36859");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("####################################################################################################################################################################################################################################################################################hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh             a     4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...444444", "...!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi...", 159);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test36860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36860");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 842.0f, (double) 368, (double) 667L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 842.0d + "'", double3 == 842.0d);
    }

    @Test
    public void test36861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36861");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "0TRUE-1.00-1.0097.0444444444444444", (java.lang.CharSequence) "      aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa      ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test36862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36862");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("                                                                                                         aHI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "uuuuuuuuHI!HI!HI!HI!HI!HI!HI!HI!HI!HI444uuuuuuuuu");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                         aHI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str2, "                                                                                                         aHI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test36863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36863");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("44444444444444444444444444444444444440TRUE-1.0097.     A    4444444444444444444444444444444444444444444440TRUE-1.0097.     A    4444444444444444444444444444444444444444444440TRUE-1.0097.     A    4444444444444444444444444444444444444444444440TRUE-1.0097.     A    4444444444444444444444444444444444444444444440TRUE-1.0097.     A    4444444444444444444444444444444444444444444440TRUE-1.0097.     A    4444444444444444444444444444444444444444444440TRUE-1.0097.     A    4444444444444444444444444444444444444444444440TRUE-1.0097.     A    4444444444444444444444444444444444444444444440TRUE-1.0097.     A    4444444444444444444444444444444444444444444440TRUE-1.0097.");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test36864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36864");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("44444444444444444444444444", "");
        boolean boolean4 = org.apache.commons.lang3.StringUtils.endsWithAny("...aaaa0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test36865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36865");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("Aaaa                                                     0.001                            A      A  ", ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "A A 0.001 Aaaa" + "'", str2, "A A 0.001 Aaaa");
    }

    @Test
    public void test36866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36866");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min(18.0f, (float) 479, (float) 62L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 18.0f + "'", float3 == 18.0f);
    }

    @Test
    public void test36867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36867");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("ue-144444444444444444444444444444444########################################################################################1444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ue-144444444444444444444444444444444########################################################################################144444444444444444444444444444444444444444444444444444" + "'", str1, "ue-144444444444444444444444444444444########################################################################################144444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test36868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36868");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("44444444444444444444444444444444444444444AAAAAAAAA...4444444   ", "TRUE-1.0097.00TRUE-1....");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44444444444444444444444444444444444444444AAAAAAAAA...4444444   " + "'", str2, "44444444444444444444444444444444444444444AAAAAAAAA...4444444   ");
    }

    @Test
    public void test36869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36869");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("444444440.7900.1-EURT04444444444444444444444444444444444444444440.7900.1-EURT044444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaa", 550);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "444444440.7900.1-EURT04444444444444444444444444444444444444444440.7900.1-EURT044444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaa" + "'", str2, "444444440.7900.1-EURT04444444444444444444444444444444444444444440.7900.1-EURT044444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaa");
    }

    @Test
    public void test36870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36870");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444E-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR    A     0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test36871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36871");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA", "...aaaaaaaaaaaaaaaaaaaaaaaaa                                 ", 259);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test36872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36872");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("...                                                                                               a        HI!HI!HI!HI!HI!HI!HI!HI!HI!HI.A A A HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...        HI!HI!HI!HI!HI!...");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...aHI!HI!HI!HI!HI!HI!HI!HI!HI!HI.AAAHI!HI!HI!HI!HI!HI!HI!HI!HI!HI...HI!HI!HI!HI!HI!..." + "'", str2, "...aHI!HI!HI!HI!HI!HI!HI!HI!HI!HI.AAAHI!HI!HI!HI!HI!HI!HI!HI!HI!HI...HI!HI!HI!HI!HI!...");
    }

    @Test
    public void test36873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36873");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("                                                                                                  ", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test36874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36874");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("   A        ", "                                                                                                                             ", "H!ih!h!ih!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test36875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36875");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test36876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36876");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                         aaaa0aaaaa    ", "0true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                         aaaa0aaaaa    " + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                         aaaa0aaaaa    ");
    }

    @Test
    public void test36877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36877");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("1aaaaaaaaaaa4444444...4444444...44...aaaaaaaaaaaaaaaaaaaaaaaaa1aaaaaaaaaaa4444444...4444444...44", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test36878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36878");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("                                                                            ###    A   hi!hi!.                                                                              ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"                                                                            ###    A   hi!hi!.                                                                              \"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test36879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36879");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("i!4i!4i!4i!4i!4i!4i!4i!4i!4i!4i!4i!4i!4i!4i!4i44444444444444444444444444444444444444444444TRUE-10497044444444444444444444444444444444444444444444 ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "i!4i!4i!4i!4i!4i!4i!4i!4i!4i!4i!4i!4i!4i!4i!4i44444444444444444444444444444444444444444444TRUE-10497044444444444444444444444444444444444444444444" + "'", str1, "i!4i!4i!4i!4i!4i!4i!4i!4i!4i!4i!4i!4i!4i!4i!4i44444444444444444444444444444444444444444444TRUE-10497044444444444444444444444444444444444444444444");
    }

    @Test
    public void test36880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36880");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!0097      A   hi!hi!hi!haaaaaaaaaaaaaaaaaaaaaaaaaaaa       ...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!", "                                                                                                                                                                                                                                                         4444444440097...##########################################0444##############################################4444444440097...#############################################################################################4444444440097...#############################################################################################4444444440097...#################################A HI!HI!HI!HI!HI!HI!HI!HI!HI!HI... A", 93);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test36881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36881");
        int[] intArray5 = new int[] { 57, 267, (byte) -1, 9, 5 };
        int int6 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        int int7 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        int int8 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int9 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        int int10 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int11 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int12 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        int int13 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int14 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[57, 267, -1, 9, 5]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 267 + "'", int8 == 267);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 267 + "'", int10 == 267);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 267 + "'", int11 == 267);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 267 + "'", int13 == 267);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 267 + "'", int14 == 267);
    }

    @Test
    public void test36882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36882");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("        art           tra                            ", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 188);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test36883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36883");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("4444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444" + "'", str1, "4444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444");
    }

    @Test
    public void test36884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36884");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         ...", 16, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         ..." + "'", str3, "A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         ...");
    }

    @Test
    public void test36885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36885");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("!hi!h!hi!h44444444444440.7900.1-EURT04444444444444444444444444444444444444444444", 133);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                          !hi!h!hi!h44444444444440.7900.1-EURT04444444444444444444444444444444444444444444                           " + "'", str2, "                          !hi!h!hi!h44444444444440.7900.1-EURT04444444444444444444444444444444444444444444                           ");
    }

    @Test
    public void test36886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36886");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("0true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444", "a A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A aaaaaaaaaaaaaaaaaaaa00 0true00 0-00 000 000 09700 000 0");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test36887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36887");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("4444444444444444444444...444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "AAA   AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA0TRUE-1 0097   AA                                        ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444444444444444444...444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str2, "4444444444444444444444...444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test36888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36888");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!" };
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.split("44444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444", '4');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.replaceEach("100.0", strArray4, strArray7);
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.stripAll(strArray4);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray9, "aaaaaaaaaaaaaaaaaaaA hi!hi!hi!hi!hi!hi!hi!hi!hi!hi... A0true-1.0097.0aaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1.0097.0aaaaaaaaaaaaaaaaaaaaaaa", 39, 34);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.startsWithAny("       ", strArray9);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "100.0" + "'", str8, "100.0");
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test36889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36889");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...44444444444444444444444444444444440TRUE-1.009", "...4444...                       a                       a                       a                       a                       a                       a  ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0TRUE-1.009" + "'", str2, "0TRUE-1.009");
    }

    @Test
    public void test36890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36890");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...44444444444444444444444444444444440TRUE-1.009", "0aaaa 0aaaa 0aaaa", 4444444);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test36891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36891");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("1aaaaaaaaaaa4444444...4444444...4444444...4    aaaaa0aaaa                                                                             aaaaa0aaaa                                                                             aaaaa0aaaa                                                                             aaaaa0aaaa                                                                             aaaaa0aaaa                                        ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1AAAAAAAAAAA4444444...4444444...4444444...4    AAAAA0AAAA                                                                             AAAAA0AAAA                                                                             AAAAA0AAAA                                                                             AAAAA0AAAA                                                                             AAAAA0AAAA                                        " + "'", str1, "1AAAAAAAAAAA4444444...4444444...4444444...4    AAAAA0AAAA                                                                             AAAAA0AAAA                                                                             AAAAA0AAAA                                                                             AAAAA0AAAA                                                                             AAAAA0AAAA                                        ");
    }

    @Test
    public void test36892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36892");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "                       4a4444444444444444444444...4444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test36893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36893");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         " + "'", str1, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ");
    }

    @Test
    public void test36894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36894");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("4444444444444444444444444444444444444444444 true - 1 . 97 . 4444444444444444444444444444444444444444444", "HI");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test36895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36895");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test36896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36896");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("aaaaaaa44444444444444444444444444444444444444444440true-1.0097.  A    44444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    44444444!hi!hi!hi...    A0true-1.0097.0aaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1.0097.0aaaaaaaaaaaaaaaaaaaaaaa", 545);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test36897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36897");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("HI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAA ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAA " + "'", str1, "HI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAA ");
    }

    @Test
    public void test36898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36898");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("Ue-1.0097...444444444444444444444444########################################################################################100.aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "!HI!HI!HI!HI!HI!HI!HI!HI!HI... a   ...");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test36899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36899");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("                100.0aaaa                 ", "                       #a######################...##############################################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                100.0aaaa                 " + "'", str2, "                100.0aaaa                 ");
    }

    @Test
    public void test36900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36900");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("                                                                           A444444               a   hi!hi!...A444444               a   hi!hi!...A444444               a   hi!hi!......                                                                            ", "aa0aaaaaaaaa0aaaaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test36901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36901");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("a         a    0001                       aaaaaaaaaaaaaaaaaaa0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.00....444444440tr...aaaaaaaaaaaaaaaaa", "A A 1000 A A", 502);
        boolean boolean5 = org.apache.commons.lang3.StringUtils.startsWithAny("A HI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAA", strArray4);
        int int6 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test36902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36902");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                                                                                   ", ' ');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test36903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36903");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 144, (double) 86, (double) 754.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 86.0d + "'", double3 == 86.0d);
    }

    @Test
    public void test36904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36904");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("", "##100.0###4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test36905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36905");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfBlank("0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.00...", "44444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.00..." + "'", str2, "0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.00...");
    }

    @Test
    public void test36906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36906");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                 ");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray1);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, "0true-1.00                               0                                                      0 ", 124, 93);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test36907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36907");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(24, 88, 461);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 24 + "'", int3 == 24);
    }

    @Test
    public void test36908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36908");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("     ");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test36909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36909");
        char[] charArray9 = new char[] { ' ', '4', 'a', 'a', 'a' };
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "100.0", charArray9);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsAny("HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!", charArray9);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "0true-1.0AAAAa44444...", charArray9);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "a A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A aaaaaaaaaaaaaaaaaaaa00       0true00       0-00       000       000       09700       000       0", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), " 4aaa");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), " 4aaa");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[ , 4, a, a, a]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 13 + "'", int12 == 13);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test36910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36910");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("                                          ", "                           aaaa0aaaaa                  ", 98);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "4444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444", 20, 33);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test36911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36911");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) -1, (short) (byte) -1, (short) (byte) 100);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test36912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36912");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("...            ...            ...            ...            ...            ...            ...         ...4#444hi!hi!hi!h############################...44");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...            ...            ...            ...            ...            ...            ...         ...4#444hi!hi!hi!h############################...4" + "'", str1, "...            ...            ...            ...            ...            ...            ...         ...4#444hi!hi!hi!h############################...4");
    }

    @Test
    public void test36913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36913");
        long[] longArray5 = new long[] { (byte) 1, (byte) 10, (short) -1, (byte) 10, (short) 10 };
        long long6 = org.apache.commons.lang3.math.NumberUtils.min(longArray5);
        long long7 = org.apache.commons.lang3.math.NumberUtils.max(longArray5);
        long long8 = org.apache.commons.lang3.math.NumberUtils.max(longArray5);
        long long9 = org.apache.commons.lang3.math.NumberUtils.max(longArray5);
        long long10 = org.apache.commons.lang3.math.NumberUtils.min(longArray5);
        long long11 = org.apache.commons.lang3.math.NumberUtils.min(longArray5);
        long long12 = org.apache.commons.lang3.math.NumberUtils.max(longArray5);
        long long13 = org.apache.commons.lang3.math.NumberUtils.max(longArray5);
        long long14 = org.apache.commons.lang3.math.NumberUtils.max(longArray5);
        long long15 = org.apache.commons.lang3.math.NumberUtils.min(longArray5);
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
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 10L + "'", long14 == 10L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1L) + "'", long15 == (-1L));
    }

    @Test
    public void test36914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36914");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("                     aaaa0aaaaa                     ...I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!                     aaaa0aaaaa                     ...I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!                     aaaa0aaaaa                     ...I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!                     aaaa0aaaaa                     ...I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!                     aaaa0aaaaa                     ...I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!                     aaaa0aaaaa                     ...I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!                     aaaa0aaaaa                     ...I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!                     aaaa0aaaaa                     ...I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!                     aaaa0aaaaa         A         A", "0 ... 0TRUE-1.0097... 0 ... 0TRUE-1.0097... 0 ... 0TRUE-1.0097... 0 ... 0TRUE-1.0097... 0 ... 0TRUE-1.0097... 0 ... 0TRUE-1.0097... 0 ... ...true-1. ...97. ... 0 ... 0TRUE-1.0097... 0 ... 0TRUE-1.0097... 0 ... 0TRUE-1.0097... 0 ... 0TRUE-1.0097... 0 ... 0TRUE-1.0097... 0 ... 0TRUE-1.0097... 0 ...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 21 + "'", int2 == 21);
    }

    @Test
    public void test36915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36915");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) 10, (short) 100, (short) (byte) 100);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test36916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36916");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("                                                                                                                                                                                                                                          44444444444444444440true-1.0097");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test36917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36917");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 349, (double) 754L, (double) 59);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 59.0d + "'", double3 == 59.0d);
    }

    @Test
    public void test36918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36918");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("...A..", 788);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...A.." + "'", str2, "...A..");
    }

    @Test
    public void test36919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36919");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test36920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36920");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("                                                                        44444                                                                        ", '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                        44444                                                                        " + "'", str2, "                                                                        44444                                                                        ");
    }

    @Test
    public void test36921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36921");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "aaTRUE-1.  97.aa");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 16 + "'", int1 == 16);
    }

    @Test
    public void test36922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36922");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("44444444444444444444444444444444444444444440true-1.0097. A 44444444444444444440true-1.0097. A 4444444444444444444444444444444444444444444440true-1.0097. A 4444444444444444444444444444444444444444444440true-1.0097. A 4444444444444444444444444444444444444444444440true-1.0097. A 4444444444444444444444444444444444444444444440true-1.0097. A 4444444444444444444444444444444444444444444440true-1.0097. A 4444444444444444444444444444444444444444444440true-1.0097. A 4444444444444444444444444444444444444444444440true-1.0097. A 4444444444444444444444444444444444444444444440true-1.0097", "                                                                                                                                                                                                                                                                                                                                                                                 04true4-414.400974.4004true4-414.400974.4004true4-414.400974.4004tr4 4A4");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                 04true4-414.400974.4004true4-414.400974.4004true4-414.400974.4004tr4 4A4" + "'", str2, "                                                                                                                                                                                                                                                                                                                                                                                 04true4-414.400974.4004true4-414.400974.4004true4-414.400974.4004tr4 4A4");
    }

    @Test
    public void test36923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36923");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("0444444444       44444A   hi!hi!0444444444       44444a a a a a", "                               44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444A    ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih   A44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               0true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.00..", 561);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test36924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36924");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("...4A   HI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAA...44", ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAA...44 ...4A" + "'", str2, "HI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAA...44 ...4A");
    }

    @Test
    public void test36925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36925");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("                                                                                                                                                                                                                                                                                                                                                                                                                                                           4444a44444                                                                                                                                                                                                                          ", (int) (short) 10, 75);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test36926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36926");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("   4444444...aaaaaaaaa44444444444444444444444444444444444444444", (float) 754);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 754.0f + "'", float2 == 754.0f);
    }

    @Test
    public void test36927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36927");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("A    44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444", "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "A    44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444" + "'", str2, "A    44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444");
    }

    @Test
    public void test36928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36928");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "...             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0");
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "0true-1.0097.00true-1.0097.00true-1.0097.00tr    a     0true-1.0097.00true-1.0097.00true-1.0097.00tr", 147, 0);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test36929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36929");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("a rt00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt0                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ", "4444...44444", 14);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test36930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36930");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("A A 1000 A A");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test36931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36931");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("aaaaaaa...00.7900.1-eurt00.79...aaaaaaa", 35, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaa...00.7900.1-eurt00.79...aaaaaaa" + "'", str3, "aaaaaaa...00.7900.1-eurt00.79...aaaaaaa");
    }

    @Test
    public void test36932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36932");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("0TRUE-1.0097.00T..0TRUE-1.0097.00T                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ", "    a   HI!HI!HI!HI!HI!HI!H                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test36933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36933");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "44444444444444444444444444444444444444444444444444444444444444444444TRUE-1.97.4444444444444444444444444444444444444444444                                                   ", (java.lang.CharSequence) "                   rt00.7900.                   ##################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test36934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36934");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("444444444444444444444440.7900.1-eurt0aaaa0.001");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, ' ');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "444444444444444444444440.7900.1-eurt0aaaa0.001" + "'", str3, "444444444444444444444440.7900.1-eurt0aaaa0.001");
    }

    @Test
    public void test36935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36935");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("                                                                                    0.001                                                            44444444444444444440true-1.0097.", "rue-1.AA97.AAtrue-1.AA97.AAtrue-1.AA97.AAtr");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                    0.001                                                            44444444444444444440true-1.0097." + "'", str2, "                                                                                    0.001                                                            44444444444444444440true-1.0097.");
    }

    @Test
    public void test36936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36936");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("444444444444444444444444444444444444444444444AAAA0AAAAA", 660, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test36937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36937");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("...I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI......I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI......I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI......I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI......I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI......I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI......I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI......I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI......I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI....", "                             100.0");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test36938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36938");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "aAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...", (java.lang.CharSequence) "0true-144444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR009744444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR0");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test36939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36939");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("...444444444444444444444444444444444444444444444     4    444444444444444444444444444444444444444444444           444444444444444444444444444444444444444444444     4    444444444444444444444444444444444444444444444 ", (long) 667);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 667L + "'", long2 == 667L);
    }

    @Test
    public void test36940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36940");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase(" true - 1 . 97 . ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + " TRUE - 1 . 97 . " + "'", str1, " TRUE - 1 . 97 . ");
    }

    @Test
    public void test36941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36941");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("       aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa" + "'", str1, "aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa");
    }

    @Test
    public void test36942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36942");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("aaa...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1.0097...aa                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"aaa...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1.0097...aa\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test36943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36943");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("", "444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0true-1.44444444444444444444444444444444444444444440true-1.0097.097.44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444", 0);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.concatWith("444444444444444444444444...44444444444444444444444444444444440TRUE-1.0097...444444444444444444444444", (java.lang.Object[]) strArray4);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray4);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, "HI!", 56, 47);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, 'a');
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray4);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, ' ');
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test36944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36944");
        char[] charArray9 = new char[] { '4', '4', ' ' };
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "0", charArray9);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsAny("                                      100.0                                                      ", charArray9);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "...44444...true-1.4444444...97.4444444...4444444444444...", charArray9);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "A     0true-1.0097.00true-1.0097.00true-1.0097.00tr", charArray9);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "...4444...", charArray9);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "                                                0444", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "44 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "44 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[4, 4,  ]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 48 + "'", int15 == 48);
    }

    @Test
    public void test36945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36945");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("4444444444444444444444444444444444444444444#true#-#1#.#97#.#4444444444444444444444444444444444444444444true4444444444444444444444444444444444444444444#true#-#1#.#97#.#4444444444444444444444444444444444444444444-4444444444444444444444444444444444444444444#true#-#1#.#97#.#44444444444444444444444444444444444444444444444444444444444444444444444444444444444444#true#-#1#.#97#.#44444444444444444444444444444444444444444444444444444444444444444444444444444444444444#true#-#1#.#97#.#4444444444444444444444444444444444444444444974444444444444444444444444444444444444444444#true#-#1#.#97#.#44444444444444444444444444444444444444444444444444444444444444444444444444444444444444#true#-#1#.#97#.#4444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4444444444444444444444444444444444444444444#.#79#.#1#-#eurt#44444444444444444444444444444444444444444444444444444444444444444444444444444444444444#.#79#.#1#-#eurt#4444444444444444444444444444444444444444444794444444444444444444444444444444444444444444#.#79#.#1#-#eurt#44444444444444444444444444444444444444444444444444444444444444444444444444444444444444#.#79#.#1#-#eurt#44444444444444444444444444444444444444444444444444444444444444444444444444444444444444#.#79#.#1#-#eurt#4444444444444444444444444444444444444444444-4444444444444444444444444444444444444444444#.#79#.#1#-#eurt#4444444444444444444444444444444444444444444eurt4444444444444444444444444444444444444444444#.#79#.#1#-#eurt#4444444444444444444444444444444444444444444" + "'", str1, "4444444444444444444444444444444444444444444#.#79#.#1#-#eurt#44444444444444444444444444444444444444444444444444444444444444444444444444444444444444#.#79#.#1#-#eurt#4444444444444444444444444444444444444444444794444444444444444444444444444444444444444444#.#79#.#1#-#eurt#44444444444444444444444444444444444444444444444444444444444444444444444444444444444444#.#79#.#1#-#eurt#44444444444444444444444444444444444444444444444444444444444444444444444444444444444444#.#79#.#1#-#eurt#4444444444444444444444444444444444444444444-4444444444444444444444444444444444444444444#.#79#.#1#-#eurt#4444444444444444444444444444444444444444444eurt4444444444444444444444444444444444444444444#.#79#.#1#-#eurt#4444444444444444444444444444444444444444444");
    }

    @Test
    public void test36946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36946");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("0TRUE-1.0097.00T..0TRUE-1.0097.00T                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ", "A         A                                                     100.0    A         A");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test36947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36947");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("44...AAAAAAAAAAAAAAAAAAAAAAAAAAAAH!                                                                       0true-1.00");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"44...AAAAAAAAAAAAAAAAAAAAAAAAAAAAH!                                                                       0true-1.00\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test36948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36948");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("...aaaaaa");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test36949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36949");
        java.lang.Object[] objArray0 = null;
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.join(objArray0, "A A A A                        A                             ");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test36950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36950");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a!HI!H!HI!");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test36951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36951");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("0true-1.0097.04444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ", "                                       444...44444444444444444444444444444444440true-1.0097...44444...44444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0true-1.0097.04444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             " + "'", str2, "0true-1.0097.04444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ");
    }

    @Test
    public void test36952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36952");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.repeat("                                                                                                                                                                                                                                                                                                                                                                                                aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                                                                                                                                                                                                                                                                                                                                 ", "hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh###############################################################################", (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test36953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36953");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "TRUETRUE", "4444444..444444444444444440TRUE-1.0097...44444444444444444444444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test36954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36954");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("                                             ", "E-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR    A     0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR", "            444444444444444  444444444444444             ..");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test36955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36955");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaa4true-1.4497.4444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test36956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36956");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("                                                                                                                                                                                                                                          44444444444444444440true-1.0097", "RT00.7900.1-EURT00.7900.1-EURT00.7900.1-EURT0ART00.7900.1-EURT00.7900.1-EURT00.7900.1-EURT");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                          44444444444444444440true-1.0097" + "'", str2, "                                                                                                                                                                                                                                          44444444444444444440true-1.0097");
    }

    @Test
    public void test36957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36957");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("0097.00T44444444444444444444444444444444444444444444444444...true-1.4444444...97.4444444...4444444444444444444444444444444444444444444", (double) 61L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 61.0d + "'", double2 == 61.0d);
    }

    @Test
    public void test36958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36958");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("44444444444444444440true-1.0097.", 'a');
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "                                                                                                                                                                                                                                                                                                                                                      hI!                                                                                                                                                                                                                                                                                                                                                                                                                               ");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "44444444444444444440true-1.0097." + "'", str4, "44444444444444444440true-1.0097.");
    }

    @Test
    public void test36959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36959");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA!hi!h!hi!hA0true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA!hi!h!hi!hA0true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa444444444" + "'", str1, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA!hi!h!hi!hA0true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa444444444");
    }

    @Test
    public void test36960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36960");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444444444444444444444444444444444444444444444444444444444444444444   !    aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (java.lang.CharSequence) "4444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test36961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36961");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("######################################044444444444444444444444444", "AAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "######################################044444444444444444444444444" + "'", str2, "######################################044444444444444444444444444");
    }

    @Test
    public void test36962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36962");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("aaaaaaaaaaaaaaaaaaaaaaaaa", 205);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaa                                                                                                                                                                                    " + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaa                                                                                                                                                                                    ");
    }

    @Test
    public void test36963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36963");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("...T0444444444444444444444444444...", "444444...4444444444........4444444444444444444444444444.#######################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...T0444444444444444444444444444..." + "'", str2, "...T0444444444444444444444444444...");
    }

    @Test
    public void test36964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36964");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("0    -1.0097.00    -1.0097.00    -1.0097.00   A 0    -1.0097.00    -1.0097.00    -1.0097.00", "a4a4a4a444444444444444444444444A44444444444444444444444...AAAA0AAAAA44444444444444444444444444444444444444444440TRUE-1.0097.0AAAA0AAAAA44444444444444444444444444444444444444444440TRUE-1.0097.0AAAA0AAAAA44444444444444444444444444444444444444444440TRUE-1.0097.0AAAA0AAAAA44444444444444444444444444444444444444444440TRUE-1.0097.0AAAA0AAAAA44444444444444444444444444444444444444444440TRUE-1.0097.0AAAA0AAAAA44444444444444444444444444444444444444444440TRUE-1.0097.0AAAA0AAAAA44444444444444444444444444444444444444444440TRUE-1.0097.0AAAA0AAAAA44444444444444444444444444444444444444444440TRUE-1.0097.0AAAA0AAAAA44444444444444444444444444444444444444444440TRUE-1.0097.0AAAA0AAA");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test36965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36965");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("                                                                                                                                                                                                                                                                     aaaaa0aaaa                     ", "4444444444444444444444444444444444444444444#true#-#1#.#97#.#4444444444444444444444444444444444444444444true4444444444444444444444444444444444444444444#true#-#1#.#97#.#4444444444444444444444444444444444444444444-4444444444444444444444444444444444444444444#true#-#1#.#97#.#44444444444444444444444444444444444444444444444444444444444444444444444444444444444444#true#-#1#.#97#.#44444444444444444444444444444444444444444444444444444444444444444444444444444444444444#true#-#1#.#97#.#4444444444444444444444444444444444444444444974444444444444444444444444444444444444444444#true#-#1#.#97#.#44444444444444444444444444444444444444444444444444444444444444444444444444444444444444#true#-#1#.#97#.#4444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test36966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36966");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("  a    TRUETRUETRUET", "44444444    A     .7900.1-eurt0444444444444444444444444444444444444444444444    A     .7900.1-eurt04444444444444444444    A  .7900.1-eurt04444444444444444444444444444444444444444444", 220);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, '4', (int) 'a', 329);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test36967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36967");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("h!ih!h!ih!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"h\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test36968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36968");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("444444444444444444444444444444444440true-1.0097.     a    4444444444444444444444444444444444444444444440true-1.0097.     a    4444444444444444444444444444444444444444444440true-1.0097.     a    4444444444444444444444444444444444444444444440true-1.0097.     a    4444444444444444444444444444444444444444444440true-1.0097.     a    4444444444444444444444444444444444444444444440true-1.0097.     a    4444444444444444444444444444444444444444444440true-1.0097.     a    4444444444444444444444444444444444444444444440true-1.0097.     a    4444444444444444444444444444444444444444444440true-1.0097.");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test36969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36969");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("                                                                                ", 87, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                aaaaaaa" + "'", str3, "                                                                                aaaaaaa");
    }

    @Test
    public void test36970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36970");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("00aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 164);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                             " + "'", str2, "00aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                             ");
    }

    @Test
    public void test36971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36971");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("          ###    a   HI!HI!.           ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "###    a   HI!HI!." + "'", str1, "###    a   HI!HI!.");
    }

    @Test
    public void test36972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36972");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("4444################################################################################################", (int) (short) 100, "aa..");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4444################################################################################################" + "'", str3, "4444################################################################################################");
    }

    @Test
    public void test36973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36973");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 100, (byte) -1 };
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.min(byteArray4);
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.max(byteArray4);
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.max(byteArray4);
        byte byte8 = org.apache.commons.lang3.math.NumberUtils.max(byteArray4);
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.min(byteArray4);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[10, 0, 100, -1]");
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) -1 + "'", byte5 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 100 + "'", byte6 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 100 + "'", byte7 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 100 + "'", byte8 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) -1 + "'", byte9 == (byte) -1);
    }

    @Test
    public void test36974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36974");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("4444404444", "0097...#############################################################################################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444404444" + "'", str2, "4444404444");
    }

    @Test
    public void test36975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36975");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR4444a444440TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00T", "                                                   ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR4444a444440TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00T" + "'", str2, "0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR4444a444440TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00T");
    }

    @Test
    public void test36976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36976");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test36977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36977");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("           rt00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt0 a rt00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt0            ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "rt00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt0 a rt00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt0" + "'", str1, "rt00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt0 a rt00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt0");
    }

    @Test
    public void test36978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36978");
        short[] shortArray5 = new short[] { (byte) 1, (short) 0, (byte) 1, (short) 10, (byte) 100 };
        short short6 = org.apache.commons.lang3.math.NumberUtils.max(shortArray5);
        short short7 = org.apache.commons.lang3.math.NumberUtils.min(shortArray5);
        short short8 = org.apache.commons.lang3.math.NumberUtils.max(shortArray5);
        short short9 = org.apache.commons.lang3.math.NumberUtils.min(shortArray5);
        short short10 = org.apache.commons.lang3.math.NumberUtils.min(shortArray5);
        short short11 = org.apache.commons.lang3.math.NumberUtils.max(shortArray5);
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray5), "[1, 0, 1, 10, 100]");
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 100 + "'", short6 == (short) 100);
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 0 + "'", short7 == (short) 0);
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 100 + "'", short8 == (short) 100);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 0 + "'", short9 == (short) 0);
        org.junit.Assert.assertTrue("'" + short10 + "' != '" + (short) 0 + "'", short10 == (short) 0);
        org.junit.Assert.assertTrue("'" + short11 + "' != '" + (short) 100 + "'", short11 == (short) 100);
    }

    @Test
    public void test36979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36979");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "079001-eurt0");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test36980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36980");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "                  4                   ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                  4                   " + "'", str1, "                  4                   ");
    }

    @Test
    public void test36981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36981");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("4444444444444444444444444444444444444444444true-1.97.4444444444444444444444444444444444444444444                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  ", "0true-1.0097.00true-1.0097.00true-1.0097.00t                                                                                100.0                                         ...00true-1.0097.00tru...4A4    100.0      0true-1.0097.00true-1.0097.00true-1.0097.00tr");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test36982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36982");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("UE-1.0097.", "                                                    444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test36983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36983");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444                       a4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444.04444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                       a4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str2, "                       a4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test36984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36984");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("                                                                                                                                                                                                                                                                         0                                                                                                                                                                                                                                                                         0                                                                                                    4444a44444                  ", 234);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test36985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36985");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("4444", "HI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test36986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36986");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           0aaaa                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test36987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36987");
        java.lang.CharSequence charSequence1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "...7.044444444444444444444444444...", charSequence1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Strings must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test36988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36988");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterType("                                                                                                                                                                                                                                                                                                                                      aahI!aa                                                                                                                                                                                                                                                                                                                                       ");
        boolean boolean3 = org.apache.commons.lang3.StringUtils.endsWithAny("0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR    A     0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR0TRUE-1.0097.00TRUE-Ahi!hi!hi!haaaaaaaaaaaaaaaaaaaaaaaaaaaa0HI!HI!HI", strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test36989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36989");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("uuuuuuuuHI!HI!HI!HI!HI!HI!HI!HI!HI!HI444uuuuuuuuu", "###########################################true-197############################################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "uuuuuuuuHI!HI!HI!HI!HI!HI!HI!HI!HI!HI444uuuuuuuuu" + "'", str2, "uuuuuuuuHI!HI!HI!HI!HI!HI!HI!HI!HI!HI444uuuuuuuuu");
    }

    @Test
    public void test36990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36990");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("                                                   aaaaa0aaaa                                                                         ", "      A   hi!hi!hi!haaaaaaaaaaaaaaaaaaaaaaaaaaaa       ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test36991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36991");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("         ......00.7900.1-eurt00.79......aaaa", 4.4444446E25f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.4444446E25f + "'", float2 == 4.4444446E25f);
    }

    @Test
    public void test36992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36992");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAH!IH!IH!IHa                                                                                                         ", 344, 165);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test36993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36993");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("...AAAAAA0AAAAAAAAA0AAA...0...                   ...");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: multiple points");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test36994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36994");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 788.0f, (double) 237, (double) 237);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 788.0d + "'", double3 == 788.0d);
    }

    @Test
    public void test36995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36995");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("0AAAAaTRUE-aaaa97aaaTRUE-aaaa97aaaTRUE-aaaa97aaaTR4444A44444aTRUE-aaaa97aaaTRUE-aaaa97aaaTRUE-aaaa97aaa", "44444444444444444444444444444444444444444440.7900.1-EURT04444444444444444444444444444444444444444444.790.7900.1-EURT04444444444444444444444444444444444444444444.1-EURT0.7900.1-EURT044444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test36996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36996");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("                                                                                                                                                                                                                                                                           ", "444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0true-1.44444444444444444444444444444444444444444440true-1.0097.097.44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test36997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36997");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("                                                                                0true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.00..                                                                                ", 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                0true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.00..                                                                                " + "'", str2, "                                                                                0true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.00..                                                                                ");
    }

    @Test
    public void test36998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36998");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("a44444!hi!hi!hi...    A0true-1.0097.0aaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1.0097.0aaaaaaaaaaaaaaaaaaaaaaa40true-1.0097.     A    40true-1.0097.     A    40true-1.0097.  A    4aaaaaaa444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", 368);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaa40true-1.0097.     A    40true-1.0097.     A    40true-1.0097.  A    4aaaaaaa444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str2, "aaaaaaaaaaaaaaaaaa40true-1.0097.     A    40true-1.0097.     A    40true-1.0097.  A    4aaaaaaa444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test36999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36999");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("                                                                                                                                                                                                                                                                       ", 56);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test37000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test37000");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "rT00.7900.1-EURT00.7900.1-EURT00.7900.1-EURT0     A    RT00.7900.1-EURT00.7900.1-EURT00.7900.1-E");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "RT00.7900.1-EURT00.7900.1-EURT00.7900.1-EURT0     A    RT00.7900.1-EURT00.7900.1-EURT00.7900.1-E" + "'", str1, "RT00.7900.1-EURT00.7900.1-EURT00.7900.1-EURT0     A    RT00.7900.1-EURT00.7900.1-EURT00.7900.1-E");
    }
}

