import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest78 {

    public static boolean debug = false;

    @Test
    public void test39001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39001");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.00....444444440tr...", "....4444444444444444444444444444...aaaaaaa7.44444444444444444444444444444444A    4aaaaaa....4444444444444444444444444444...");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test39002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39002");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("###################################################44444444444444444444444");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test39003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39003");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", 463);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test39004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39004");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "...                                                   ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test39005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39005");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("        a4444444444444444444444444444444         ", 658);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         a4444444444444444444444444444444         " + "'", str2, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         a4444444444444444444444444444444         ");
    }

    @Test
    public void test39006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39006");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("a HI!HI!HI!HI!HI!HI!HI!HI!HI!HI... a a HI!HI!HI!HI!HI!HI!HI!HI!HI!HI... a ...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "A HI!HI!HI!HI!HI!HI!HI!HI!HI!HI... A A HI!HI!HI!HI!HI!HI!HI!HI!HI!HI... A ..." + "'", str1, "A HI!HI!HI!HI!HI!HI!HI!HI!HI!HI... A A HI!HI!HI!HI!HI!HI!HI!HI!HI!HI... A ...");
    }

    @Test
    public void test39007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39007");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("", "...44444444444444444444444         000");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test39008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39008");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(434, 0, 625);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 625 + "'", int3 == 625);
    }

    @Test
    public void test39009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39009");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("...44444444444444444444444444444444440true-1.0097...", "4A4 4rt4004.479004.414-4eurt4004.479004.414-4eurt4004.479004.414-4eurt4");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...44444444444444444444444444444444440true-1.0097..." + "'", str2, "...44444444444444444444444444444444440true-1.0097...");
    }

    @Test
    public void test39010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39010");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("            0000000", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test39011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39011");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("4444444444444444444444444444444444444444444TRUE4444444444444444444444444444444444444444444444444444444444444444444444444444444444444TRUE4444444444444444444444444444444444444444444");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test39012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39012");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("444444444444444444444444...7900.1-eurt044444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "444444444444444444444444...7900.1-eurt044444444444444444" + "'", str1, "444444444444444444444444...7900.1-eurt044444444444444444");
    }

    @Test
    public void test39013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39013");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "                                                                                                                                           0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.0", (java.lang.CharSequence) "                   AAAAAAAAAA                    ");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "                                                                                                                                           0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.0" + "'", charSequence2, "                                                                                                                                           0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.0");
    }

    @Test
    public void test39014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39014");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test39015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39015");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("HI!", 'a');
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        boolean boolean5 = org.apache.commons.lang3.StringUtils.startsWithAny("                                                                                                                                                                                                                                                                                                                HI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                                                                                                                                                                                                                                                                                                  ", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test39016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39016");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("0 true - 1 . ");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test39017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39017");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("...   #a#4444...", 982);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...   #a#4444...                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      " + "'", str2, "...   #a#4444...                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      ");
    }

    @Test
    public void test39018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39018");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("a   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    a4true4-44497                                                                                                          ", "aAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA       ...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "a   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    a4true4-44497                                                                                                          " + "'", str2, "a   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    a4true4-44497                                                                                                          ");
    }

    @Test
    public void test39019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39019");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "AAAAAAAAAAAAAAAAAAAAAAAAAAAAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaAAAAAAAAAAAAAAAAAAAAAAAAAAAAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaAAAAAAAAAAAAAAAAAAAAAAAAAAAAhI!################################hI!################################hI!################################hI!################################hI!################################hI!################################hI!################################hI!################################hI!################################hI!################################hI!################################hI!################################hI!################################hI!################################hI!################################hI!################################hI!#######################");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test39020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39020");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("IH  ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "IH" + "'", str1, "IH");
    }

    @Test
    public void test39021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39021");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("0044444440004aatrue-aaaa97aaatrue-aaaa97aaatrue-aaaa97aaatr044444440011");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0044444440004aatrue-aaaa97aaatrue-aaaa97aaatrue-aaaa97aaatr044444440011" + "'", str1, "0044444440004aatrue-aaaa97aaatrue-aaaa97aaatrue-aaaa97aaatr044444440011");
    }

    @Test
    public void test39022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39022");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "                                                    444444444444444444444444444444444444444444", (java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 178 + "'", int2 == 178);
    }

    @Test
    public void test39023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39023");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!" };
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray2);
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444");
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, 'a');
        int int8 = org.apache.commons.lang3.StringUtils.lastIndexOfAny(".######################a#      ##############################################...######################a#      44444444444444444444444444                    .7900.1-EURT04444444444444444444", strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test39024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39024");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "0true-1.0097.00true-1.0097.00true-1.0097.00tr    A     0true-1.0097.00true-1.0097.00true-1.0097.00tr");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test39025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39025");
        char[] charArray1 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("                                                 4A4                                                ", charArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test39026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39026");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("     a    44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444", "A0true-1.0097.0aaaa0aaaaa40true-1.0097.0aaaa0aaaaa40true-1.0097.0aaaa0aaaaa40true-1.0097.0aaaa0aaaaa40true-1.0097.0aaaa0aaaaa40true-1.0097.0aaaa0aaaaa40true-1.0097.0aaaa0aaaaa40true-1.0097.0aaaa0aaaaa40true-1.0097.0aaaa0aaaaa4...aaaa0aaaaa4a4A4A4A4A");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test39027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39027");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("aA44444A44a44444aA44444A44a44444aA44444A44a44444aA44444A44a44444aA44444A44a44444aA44444A44a44444aA44444A44a44444aA44444A44a44444aA44444A44a44444aA44444A44a44444aA44444A44a44444aA44444A44a44444aA44444A44a44444aA44444A44a44444aA44444A44a44444aA44444A44a44444aA44444A44a44444aA44444A44a44444aA44444A44a44444aA44444A44a4444444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444#44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444#44444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aA44444A44a44444aA44444A44a44444aA44444A44a44444aA44444A44a44444aA44444A44a44444aA44444A44a44444aA44444A44a44444aA44444A44a44444aA44444A44a44444aA44444A44a44444aA44444A44a44444aA44444A44a44444aA44444A44a44444aA44444A44a44444aA44444A44a44444aA44444A44a44444aA44444A44a44444aA44444A44a44444aA44444A44a44444aA44444A44a4444444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444#44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444#44444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444" + "'", str1, "aA44444A44a44444aA44444A44a44444aA44444A44a44444aA44444A44a44444aA44444A44a44444aA44444A44a44444aA44444A44a44444aA44444A44a44444aA44444A44a44444aA44444A44a44444aA44444A44a44444aA44444A44a44444aA44444A44a44444aA44444A44a44444aA44444A44a44444aA44444A44a44444aA44444A44a44444aA44444A44a44444aA44444A44a44444aA44444A44a4444444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444#44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444#44444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444");
    }

    @Test
    public void test39028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39028");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("0true-1.0097.00true-1.0097.00true-1.0097.00tr A", "                                0.7900.1-EURT0AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                                   4AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA    A     0.7900.1-EURT0AAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test39029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39029");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("4                                                 100.0                                                                             AAAA0AAAAA", "    a                     ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4                                                 100.0                                                                             AAAA0AAAAA" + "'", str2, "4                                                 100.0                                                                             AAAA0AAAAA");
    }

    @Test
    public void test39030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39030");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("rue-1.AA97.AAtrue-1.AA97.AAtrue-1.AA97.AAtr", 561);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "rue-1.AA97.AAtrue-1.AA97.AAtrue-1.AA97.AAtr" + "'", str2, "rue-1.AA97.AAtrue-1.AA97.AAtrue-1.AA97.AAtr");
    }

    @Test
    public void test39031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39031");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("444444444444444444444444444444444440true-1.0097. A 4444444444444444444444444444444444444444444440true-1.0097. A 4444444444444444444444444444444444444444444440true-1.0097. A 4444444444444444444444444444444444444444444440true-1.0097. A 4444444444444444444444444444444444444444444440true-1.0097. A 4444444444444444444444444444444444444444444440true-1.0097. A 4444444444444444444444444444444444444444444440true-1.0097. A 4444444444444444444444444444444444444444444440true-1.0097. A 4444444444444444444444444444444444444444444440true-1.0097.", "0ATRUEA-A1A.A0097A.A0");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "444444444444444444444444444444444440true-1.0097. A 4444444444444444444444444444444444444444444440true-1.0097. A 4444444444444444444444444444444444444444444440true-1.0097. A 4444444444444444444444444444444444444444444440true-1.0097. A 4444444444444444444444444444444444444444444440true-1.0097. A 4444444444444444444444444444444444444444444440true-1.0097. A 4444444444444444444444444444444444444444444440true-1.0097. A 4444444444444444444444444444444444444444444440true-1.0097. A 4444444444444444444444444444444444444444444440true-1.0097." + "'", str2, "444444444444444444444444444444444440true-1.0097. A 4444444444444444444444444444444444444444444440true-1.0097. A 4444444444444444444444444444444444444444444440true-1.0097. A 4444444444444444444444444444444444444444444440true-1.0097. A 4444444444444444444444444444444444444444444440true-1.0097. A 4444444444444444444444444444444444444444444440true-1.0097. A 4444444444444444444444444444444444444444444440true-1.0097. A 4444444444444444444444444444444444444444444440true-1.0097. A 4444444444444444444444444444444444444444444440true-1.0097.");
    }

    @Test
    public void test39032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39032");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("   a   HI!HI!                                                                                      ", "A A A A A4A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444", "444444444444444440TRUE-1.0097...444444444444444444444444444444444444444440TRUE-1.0097...444444444444444444444444444444444444444440TRUE-1.0097...444444444444444444444444444444444444444440TRUE-1.0097...444444444444444444444444444444444444444440TRUE-1.0097...444444444444444444444444444444444444444440TRUE-1.0097...444444444444444444444444444444444444444440TRUE-1.0097...444444444444444444444444444444444444444440TRUE-1.0097...444444444444444444444444444444444444444440TRUE-1.0097...444444444444444444444444444444444444444440TRUE-1.0097...444444444444444444444444444444444444444440TRUE-1.0097...444444444444444444444444444444444444444440TRUE-1.0097...44444444444444444444444                 ...                                                     ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "444a444HI!HI!44444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str3, "444a444HI!HI!44444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test39033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39033");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444AAAA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444AAAA" + "'", str1, "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444AAAA");
    }

    @Test
    public void test39034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39034");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("       0true-1.0097.00true-1.0097.00true-1.0097.00tr    a     0true-1.0097.00true-1.0097.00true-1.0097.00tr        ", "                                                    ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test39035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39035");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("444                                      100.0                                                     aaaa444444444444444444444", "4444444444444444444444444440.7900.1-eurt04444444444444444444444444444444444444444440.7900.1-eurt0");
        boolean boolean4 = org.apache.commons.lang3.StringUtils.startsWithAny("444", strArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, 'a', 0, 68);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test39036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39036");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "000044444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa###000##aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test39037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39037");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("       ...a0a                                          a0a                                          a0a                                                                                                                                                                                                                                                                                                                                                                                                               44                     ", "A A A");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "       ...a0a                                          a0a                                          a0a                                                                                                                                                                                                                                                                                                                                                                                                               44                     " + "'", str2, "       ...a0a                                          a0a                                          a0a                                                                                                                                                                                                                                                                                                                                                                                                               44                     ");
    }

    @Test
    public void test39038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39038");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop(".001                                                                                                                                                                                                                                                                                                                                                                                                                                           444440true-1.0097...4                                                                                                                                                                                                                                                                                                                                                                                                              ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".001                                                                                                                                                                                                                                                                                                                                                                                                                                           444440true-1.0097...4                                                                                                                                                                                                                                                                                                                                                                                                             " + "'", str1, ".001                                                                                                                                                                                                                                                                                                                                                                                                                                           444440true-1.0097...4                                                                                                                                                                                                                                                                                                                                                                                                             ");
    }

    @Test
    public void test39039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39039");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "#########################...#########################...########################HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test39040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39040");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("                                                                                                                                                                                                                                                                                                                  aaaaaaaaaa                                                                                                                                                                                                                                                                                                                   ", "...4...4444444...4444444...4444444                      0", "                 ...");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test39041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39041");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("                                                                                                                                                                                                                                                                                                                                                                                     4444444444444444444444444444444444444444444TRUE-1.97.4444444444444444444444444444444444444444444", "                                                                                               100.0");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                     4444444444444444444444444444444444444444444TRUE-1.97.4444444444444444444444444444444444444444444" + "'", str2, "                                                                                                                                                                                                                                                                                                                                                                                     4444444444444444444444444444444444444444444TRUE-1.97.4444444444444444444444444444444444444444444");
    }

    @Test
    public void test39042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39042");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("4444444...444444           aaaaaaaaaaa44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test39043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39043");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444att-------ttt-------ttt-------tt", (float) 441);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 441.0f + "'", float2 == 441.0f);
    }

    @Test
    public void test39044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39044");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("Ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!0097      a   HI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAA       ...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!", 418);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!0097      a   HI!HI!H..." + "'", str2, "Ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!0097      a   HI!HI!H...");
    }

    @Test
    public void test39045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39045");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("                                                                                                   ", 168);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                   " + "'", str2, "                                                                                                   ");
    }

    @Test
    public void test39046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39046");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("4ue-1.0097...444444444444444444444444########################################################################################100.44", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test39047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39047");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart(" true 1.  97.                            ", "                                                    97atrue-1.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test39048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39048");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 100, (byte) 100 };
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte8 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        byte byte10 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte11 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte12 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        byte byte13 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[10, 100, 100]");
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 100 + "'", byte4 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 10 + "'", byte5 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 10 + "'", byte6 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 100 + "'", byte7 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 100 + "'", byte8 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 10 + "'", byte9 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte10 + "' != '" + (byte) 100 + "'", byte10 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) 100 + "'", byte11 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte12 + "' != '" + (byte) 10 + "'", byte12 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte13 + "' != '" + (byte) 10 + "'", byte13 == (byte) 10);
    }

    @Test
    public void test39049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39049");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("                                                                                            A    44", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444TRUETRUEaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                            A    44" + "'", str2, "                                                                                            A    44");
    }

    @Test
    public void test39050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39050");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens(".                                  aaaa.", "0 00aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (int) (byte) 1);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test39051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39051");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("                               44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444A    ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih   A44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   ", "0TRUE-1.0097.0AAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                               44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444A    ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih   A44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   " + "'", str2, "                               44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444A    ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih   A44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   ");
    }

    @Test
    public void test39052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39052");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore(".7900.1-eurt0444444444444444444444444444444444444444444444 A .7900.1-eurt0444444444444444444444444444444444444444444444 A .7900.1-eurt0444444444444444444444444444444444444444444444 A .7900.1-eurt0444444444444444444444444444444444444444444444 A .7900.1-eurt0444444444444444444444444444444444444444444444 A .7900.1-eurt0444444444444444444444444444444444444444444444 A .7900.1-eurt0444444444444444444444444444444444444444444444 A .7900.1-eurt0444444444444444444444444444444444444444444444 A .7900.1-eurt0444444444444444444444444444444444444444444444 A .7900.1-eurt044444444444444444444444444444..IH!IH!IH!IH!IH!IH!IH!IH!IH!IH a a ...IH!IH!IH!IH!IH!IH!IH!IH!IH!IH a a ...IH!IH!IH!IH!IH!IH!IH!IH!IH!IH a a ...IH!IH!IH!IH!IH!IH!IH!IH!IH!IH a a ...IH!IH!IH!IH!IH!IH!IH!IH!IH!IH a", "44");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ".7900.1-eurt0" + "'", str2, ".7900.1-eurt0");
    }

    @Test
    public void test39053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39053");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("0true-1.00-1.0097.0444444444444444444444444444444...", 17L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 17L + "'", long2 == 17L);
    }

    @Test
    public void test39054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39054");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) 10, (short) (byte) -1, (short) 100);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test39055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39055");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("    A   HI!HI!HI!HI!HI!HI!HI!HI!HI!H", "4000                                                                                                                                                     HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...         444444444444444444444444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4000                                                                                                                                              ", 0, 630);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4000                                                                                                                                                     HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...         444444444444444444444444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4000                                                                                                                                              " + "'", str4, "4000                                                                                                                                                     HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...         444444444444444444444444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4000                                                                                                                                              ");
    }

    @Test
    public void test39056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39056");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("...40true-1.0097.04444444444444444444444444444444444...", "4444444444444444444444444440.7900.1-eurt04444444444444444444444444444444444444444440.7900.1-eurt0", 608);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test39057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39057");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 39L, (float) 451, (float) 826);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 826.0f + "'", float3 == 826.0f);
    }

    @Test
    public void test39058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39058");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("4444444444444444444444444444440T                                                                                               ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4444444444444444444444444444440T" + "'", str1, "4444444444444444444444444444440T");
    }

    @Test
    public void test39059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39059");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("aaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Aaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaa" + "'", str1, "Aaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaa");
    }

    @Test
    public void test39060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39060");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("0true-1.0097.044444444444444444444444444 40true-1.0097.044444444444444444444444444 40true-1.0097.04444444444444444444000true-1.0097.044444444444444444444444444 40true-1.0097.044444444444444444444444444 40true-1.0097.044444444444444444444", "    A         A         A         A         A       Aaaaaaaaa A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A     ", 842);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test39061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39061");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444...");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test39062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39062");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("#############################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################0atruea-a1a.a0097a.a0", "!hi!hitttttti!h");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!hi!hitttttti!h" + "'", str2, "!hi!hitttttti!h");
    }

    @Test
    public void test39063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39063");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("7.44444444444444444444444444444444A    4", (long) 534);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 534L + "'", long2 == 534L);
    }

    @Test
    public void test39064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39064");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("                                             ...", 135, 34);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test39065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39065");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) -1, (short) 0, (short) (byte) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test39066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39066");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("true-1.97.4444444444444444444444444444444444444444444                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "true-1.97.4444444444444444444444444444444444444444444" + "'", str1, "true-1.97.4444444444444444444444444444444444444444444");
    }

    @Test
    public void test39067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39067");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("", ".0097.00true-1.00");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test39068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39068");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("a HI!#######...#######...#######...#######...#######...#######...#######...#######...######           ", "44444444444444444444444444true-1.97.4444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test39069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39069");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("44444444444444444444444444444444444444444440TRUE-1.0097.A4444444444444444444444444444444444444444444440TRUE-1.0097.A4444444444444444444444444444444444444444444440TRUE-1.0097.A4444444444444444444444444444444444444444444440TRUE-1.0097.A4444444444444444444444444444444444444444444440TRUE-1.0097.A4444444444444444444444444444444444444444444440TRUE-1.0097.A4444444444444444444444444444444444444444444440TRUE-1.0097.A4444444444444444444444444444444444444444444440TRUE-1.0097.A4444444444444444444444444444444444444444444440TRUE-1.0097.A4444444444444444444444444444444444444444444440TRUE-1.0097.", " 4...7900.1-EURT04444444444444444444444444444444444...4440");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test39070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39070");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "                                                                               aAAAAAAAAAAAAAAAA......aAAAAAAAAAAAAAAAA...0aAAAAAAAAAAAAAAAA......");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test39071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39071");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("truetruetruetruetruetruetruetruetrue", '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "truetruetruetruetruetruetruetruetrue" + "'", str2, "truetruetruetruetruetruetruetruetrue");
    }

    @Test
    public void test39072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39072");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "...444###################################################", "#########.");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test39073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39073");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("...4444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097....", "HI");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test39074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39074");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "h!ih!h!ih!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test39075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39075");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("       aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa4444444444444444444444444444444444444a0aaaaa       aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444", 36);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "444444444444444444444444444444444444" + "'", str2, "444444444444444444444444444444444444");
    }

    @Test
    public void test39076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39076");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test39077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39077");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("h!ih!h!ih!h!ih!h!ih!h!ih!h!ih!h!ih!h!ih!h!ih!h!ih!", "...444                                                   ");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test39078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39078");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0.7900.1-eurt0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0.7900.1-eurt0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0.7900.1-eurt0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0.7900.1-eurt0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0.7900.1-eurt0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0.7900.1-eurt0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0.7900.1-eurt0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0.7900.1-eurt0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0.7900.1-eurt0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0.7900.1-eurt0", 178);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0.7900.1-eurt0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0.7900.1-eurt0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0.7900.1-eurt0aaaaaaa..." + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0.7900.1-eurt0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0.7900.1-eurt0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0.7900.1-eurt0aaaaaaa...");
    }

    @Test
    public void test39079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39079");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("A rt00.7900.1-eurt00.7 A rt00.7900.1-eurt00.7                                                                                    ", (float) 234);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 234.0f + "'", float2 == 234.0f);
    }

    @Test
    public void test39080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39080");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, "...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0ue-1.0097...444444444444444444444444########################################################################################100.");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa" + "'", str3, "aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa");
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test39081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39081");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("", "                                               100.0                                                ", (int) (short) 100);
        java.lang.String[] strArray12 = new java.lang.String[] { "a", "444444444444444444444444...44444444444444444444444444444444440true-1.0097...444444444444444444444444", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", "4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...", "44444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444" };
        java.lang.String[] strArray14 = org.apache.commons.lang3.StringUtils.splitByCharacterType("");
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.replaceEach("0true-1.0097.00true-1.0097.00true-1.0097.00tr    A     0true-1.0097.00true-1.0097.00true-1.0097.00t", strArray12, strArray14);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("                                            100.0", strArray5, strArray12);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray12);
        java.lang.String[] strArray19 = org.apache.commons.lang3.StringUtils.stripAll(strArray12, "0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HH");
        boolean boolean20 = org.apache.commons.lang3.StringUtils.endsWithAny("                                                                ...             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             ", strArray19);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "0true-1.0097.00true-1.0097.00true-1.0097.00tr    A     0true-1.0097.00true-1.0097.00true-1.0097.00t" + "'", str15, "0true-1.0097.00true-1.0097.00true-1.0097.00tr    A     0true-1.0097.00true-1.0097.00true-1.0097.00t");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "                                            100.0" + "'", str16, "                                            100.0");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test39082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39082");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("###0.001##                         ", 416);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test39083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39083");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min(53L, 0L, (long) 542);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test39084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39084");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("                                  aaaa", "aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa    ");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.split("aaaa0aaaaa");
        int int7 = org.apache.commons.lang3.StringUtils.lastIndexOfAny(" ", strArray6);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.stripAll(strArray6);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.replaceEach("                                                                         aaaa0aaaaa    ", strArray3, strArray6);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "0097..");
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, 'a');
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "                                                                         aaaa0aaaaa    " + "'", str9, "                                                                         aaaa0aaaaa    ");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test39085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39085");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("100.0aaaa100100.0aaaa.100.0aaaa0100.0aaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "100.0aaaa100100.0aaaa.100.0aaaa0100.0aaaa" + "'", str1, "100.0aaaa100100.0aaaa.100.0aaaa0100.0aaaa");
    }

    @Test
    public void test39086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39086");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test39087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39087");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("aaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaa");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test39088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39088");
        char[] charArray6 = new char[] { '4', '4', ' ' };
        int int7 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "0", charArray6);
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "0true-1.0097.0444444444444444444444444444444444444444444", charArray6);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsAny("                                                                                                                                                                                                                                                                                                                                                                                     4444444444444444444444444444444444444444444true-1.97.4444444444444444444444444444444444444444444                                                                                                                                                                                                                                                                                                                                                                                     ", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "44 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "44 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[4, 4,  ]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 14 + "'", int8 == 14);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test39089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39089");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "ue-1.0097...444444444444444444444444########################################################################################100.");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test39090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39090");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "44444444444444444444444444444444444444444444444444...true-1.4444444...97.4444444...4444444444444444444444444444444444444444444      #a######################...##############################################      #a######################.                          ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test39091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39091");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444444444444444444444444444444444444444A A A A                        a                             true-1.A A A A                        a                             97.A A A A                        a                             4444444444444444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test39092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39092");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("...aaaa0aaaaa", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test39093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39093");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("###################    a   HI!HI!...#################");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test39094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39094");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("4444444444444a00a.a1a-atruea0", '#');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test39095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39095");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a       44444444444444444444444444444444444444444444444444...true-1.4444444...97.4444444...4444444444444444444444444444444444444444444                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a", ' ');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test39096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39096");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("4A4 4rt4004.479004.414-4eurt4004.479004.414-4eurt4004.479004.414-4eurt4", (long) 16);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 16L + "'", long2 == 16L);
    }

    @Test
    public void test39097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39097");
        java.lang.CharSequence charSequence2 = null;
        char[] charArray13 = new char[] { ' ', '4', 'a', 'a', 'a' };
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "100.0", charArray13);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray13);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsAny("44444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444", charArray13);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "97.04444444444444444444444444444444444444444440true-1.0097.044444444444444444444444444", charArray13);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "                                          ", charArray13);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAnyBut(charSequence2, charArray13);
        int int20 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                                                                                            4444444444444444444444444444440TA4444444444444444444444444444440T    4444444444444444444444444444440T44", charArray13);
        int int21 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "IH  ", charArray13);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), " 4aaa");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), " 4aaa");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[ , 4, a, a, a]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
    }

    @Test
    public void test39098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39098");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi", "4444444true-1.00                                           true-1.97.");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test39099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39099");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("############################################0H!IH!H!IH!.H!IH!H!IH!0010H!IH!H!IH!.H!IH!H!IH!0H!IH!H!IH!HI");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test39100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39100");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("100.0aaaa100100.0aaaa.100.0aaaa0100.0aaaa", "        HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...         444444444444444444444444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "100.0aaaa100100.0aaaa.100.0aaaa0100.0" + "'", str2, "100.0aaaa100100.0aaaa.100.0aaaa0100.0");
    }

    @Test
    public void test39101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39101");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("true-1.0097.00true-1.0097.00true-1.0097.00trA0t", 29);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "rue-1.0097.00trA0t" + "'", str2, "rue-1.0097.00trA0t");
    }

    @Test
    public void test39102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39102");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("0TRUE-1.0097.0AAAAAAAAAAAAAAAAAAAAAAAAAAA                                                                                                                                                                                                                                                                                                                                                                                                                                      ", "                                      4444400       0444444                                     ", 188);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test39103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39103");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!" };
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray2);
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.split("44444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444", '4');
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.replaceEach("100.0", strArray3, strArray6);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray6, '4');
        int int10 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray6);
        java.lang.String[] strArray12 = org.apache.commons.lang3.StringUtils.stripAll(strArray6, "0TRUE-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray6, "                                                                                                                                                                                                                    0true-1.0097.0444444444444444444444444444");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "100.0" + "'", str7, "100.0");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0true-1.0097.0" + "'", str9, "0true-1.0097.0");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "0true-1.0097.0" + "'", str14, "0true-1.0097.0");
    }

    @Test
    public void test39104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39104");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("              ", 262, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444              4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str3, "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444              4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test39105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39105");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi.", (java.lang.CharSequence) "         ...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void test39106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39106");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("", "0TRUE-");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test39107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39107");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("a#a", "aaaaaaaaa.", 63);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test39108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39108");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("...44444444444...                                                                                                                                                                                                       ", "aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa", "########################################################################################################################################################################");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#################                                                                                                                                                                                                       " + "'", str3, "#################                                                                                                                                                                                                       ");
    }

    @Test
    public void test39109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39109");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 721.0f, 131.0d, (double) 969.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 131.0d + "'", double3 == 131.0d);
    }

    @Test
    public void test39110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39110");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("0.7900.1-eurt04444444444444444444444444444444444444444440.7900.1-eurt04", "0true-1.0097.00t..0true-1.0097.00t                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0.7900.1-eurt04444444444444444444444444444444444444444440.7900.1-eurt04" + "'", str2, "0.7900.1-eurt04444444444444444444444444444444444444444440.7900.1-eurt04");
    }

    @Test
    public void test39111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39111");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("4444444444444444444444444444444444444444444 97.0 true-1.0 44444444444444444444444444444444444444444440", "4444444true-1.00                                           true-1.97.                                                                                       ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test39112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39112");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("#######################################################################################################################################################################4 0true-1.0097.04444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444", "                                                                                                                                                                                                                                                                                                  ", 655);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test39113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39113");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("#A#44444444444444444444#...#444444444444444444444444444444444444444444444     #A#44444444444444444444#...#444444444444444444444444444444444444444444444     #A#44444444444444444444#...#444444444444444444444444444444444444444444444     #A#44444444444444444444#...#444444444444444444444444444444444444444444444     #A#44444444444444444444#...#44444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1.0097.00true-1.0097.00true-1.0097.00tr A#A#44444444444444444444#...#444444444444444444444444444444444444444444444     #A#44444444444444444444#...#444444444444444444444444444444444444444444444     #A#44444444444444444444#...#444444444444444444444444444444444444444444444     #A#44444444444444444444#...#444444444444444444444444444444444444444444444     #A#44444444444444444444#...#44444444444444444", "44444444444444444444444444444444440true-140097", " A");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test39114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39114");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("#A#44444444444444444444#...#44444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test39115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39115");
        double[] doubleArray5 = new double[] { (-1.0d), 10.0d, '#', 10.0d, (-1.0f) };
        double double6 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        double double7 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double8 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        double double9 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double10 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double11 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        double double12 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double13 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double14 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, 35.0, 10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 35.0d + "'", double7 == 35.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 35.0d + "'", double9 == 35.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 35.0d + "'", double10 == 35.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 35.0d + "'", double12 == 35.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 35.0d + "'", double13 == 35.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14 == (-1.0d));
    }

    @Test
    public void test39116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39116");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("0true-1.0097.044444444444444444444444444 ...a                               ");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test39117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39117");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("    A         A         A         A         A       Aaaaaaaaa A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A    ", "   1000    .         .         ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test39118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39118");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("A         A", "                                                                                                 I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HII!HI!HI!HI!HI!HI!HI!HI!HI");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test39119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39119");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("A     0true-1.0097.00true-1.0097.00true-1.0097.00trHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HH", "4A4 4rt4004.47                  4                   0true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444A4 4rt4004.479", "aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa       ...");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "A     0true-1.0097.00true-1.0097.00true-1.0097.00trHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HH" + "'", str3, "A     0true-1.0097.00true-1.0097.00true-1.0097.00trHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HH");
    }

    @Test
    public void test39120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39120");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("444444444 ...", "A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A!hi!h!hi!h", 164);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test39121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39121");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444 aaaa", 561);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test39122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39122");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("444444444444444444444444444444444444444444", 0, "0true-1.0097.04444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "444444444444444444444444444444444444444444" + "'", str3, "444444444444444444444444444444444444444444");
    }

    @Test
    public void test39123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39123");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("0true-1.0                                               41004.404                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   ", 188, 83);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...                                                                             ..." + "'", str3, "...                                                                             ...");
    }

    @Test
    public void test39124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39124");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("444444444..444444444444..444444444444..444444444444..444444444444..444444444444..444444444444444", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "444444444..444444444444..444444444444..444444444444..444444444444..444444444444..444444444444444" + "'", str2, "444444444..444444444444..444444444444..444444444444..444444444444..444444444444..444444444444444");
    }

    @Test
    public void test39125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39125");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("    a0a                 0true-1.0A A A A            ", "44444444444444444444...40004000400040004000400040004000400040004000400040004000400040004000400040004000400040004000400040004000400040004000400040004000400040004000400040004000400040004000400040004000400040004000400040004000400040004000400040004000400040004000400040004000400040004000400040004000400040004000400040004000400040004000400040004000400040004000400040004000400040004000400040004000400040004000400040004000400040004000400040004000400040004000400040004000400040004000400040004000400040004000400040004000400040004000400040004000400040004000400040004000400040004000400040004000400040004000400040004000400040004000400040004000400040004000400040004000400040004");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "    a0a                 0true-1.0A A A A            " + "'", str2, "    a0a                 0true-1.0A A A A            ");
    }

    @Test
    public void test39126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39126");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("100.0#####100.0###100.0#####100.0###100.0#####100.0###100.0#####100.0###100.0#####100.0###100.0#####100.0###100.0#####100.0###100.0#####100.0###100.0#####100.0###100.0#####100.0###100.0#####100.0###100.0#####100.0###100.0#####100.0###100.0#####100.0###100.0#####100.0###100.0#####100.0###100.0#####100.0###100.0#####100.0###100.0#####100.0###100.0#####100.0###100.0#####100.0###100.0#####100.0###100.0#####100.0###100.0#####100.0###100.0#####100.0###100.0#####100.0###100.0#####100.0###100.0#####100.0###100.0#####100.0###100.0#####100.0###100.0#####100.0###100.0#####100.0###100.0#####100.0###100.0#####100.0###100.0#####100.0###100.0#####100.0###100.0#####100.0###100.0#####100.0###100.0#####100.0###100.0#####100.0###100.0#####100.0###100.0#####100.0###100.0#####100.0###100.0#####100.0###100.0#####100.0###", "a0aaaaa              0true-1.0097.00true-1.0097.00true-1.0097.00tr    A     0true-1.0097.00true-1.0097.00true-1.0097.00tr     A    44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444     A    44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444     A    44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444     A    44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444     A    44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "100.0#####100.0###100.0#####100.0###100.0#####100.0###100.0#####100.0###100.0#####100.0###100.0#####100.0###100.0#####100.0###100.0#####100.0###100.0#####100.0###100.0#####100.0###100.0#####100.0###100.0#####100.0###100.0#####100.0###100.0#####100.0###100.0#####100.0###100.0#####100.0###100.0#####100.0###100.0#####100.0###100.0#####100.0###100.0#####100.0###100.0#####100.0###100.0#####100.0###100.0#####100.0###100.0#####100.0###100.0#####100.0###100.0#####100.0###100.0#####100.0###100.0#####100.0###100.0#####100.0###100.0#####100.0###100.0#####100.0###100.0#####100.0###100.0#####100.0###100.0#####100.0###100.0#####100.0###100.0#####100.0###100.0#####100.0###100.0#####100.0###100.0#####100.0###100.0#####100.0###100.0#####100.0###100.0#####100.0###100.0#####100.0###100.0#####100.0###100.0#####100.0###" + "'", str2, "100.0#####100.0###100.0#####100.0###100.0#####100.0###100.0#####100.0###100.0#####100.0###100.0#####100.0###100.0#####100.0###100.0#####100.0###100.0#####100.0###100.0#####100.0###100.0#####100.0###100.0#####100.0###100.0#####100.0###100.0#####100.0###100.0#####100.0###100.0#####100.0###100.0#####100.0###100.0#####100.0###100.0#####100.0###100.0#####100.0###100.0#####100.0###100.0#####100.0###100.0#####100.0###100.0#####100.0###100.0#####100.0###100.0#####100.0###100.0#####100.0###100.0#####100.0###100.0#####100.0###100.0#####100.0###100.0#####100.0###100.0#####100.0###100.0#####100.0###100.0#####100.0###100.0#####100.0###100.0#####100.0###100.0#####100.0###100.0#####100.0###100.0#####100.0###100.0#####100.0###100.0#####100.0###100.0#####100.0###100.0#####100.0###100.0#####100.0###100.0#####100.0###");
    }

    @Test
    public void test39127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39127");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) ".7900.1-eurt0444444444444444444444444444444444444444444444    A   ...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test39128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39128");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "-1.0097.0                                                  44444444444444444444444444444444444444444444true-1.497.44444444444444444444444444444444444444444444                                                  44444444444444444444444444444444444444444444true-1.497.44444444444444444444444444444444444444444444                                                  44444444444444444444444444444444444444444444true-1.497.44444444444444444444444444444444444444444444                                                  44444444444444444444444444444444444444444444true", "                                                                                                                                                                                  100.                                                                                    ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test39129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39129");
        int[] intArray3 = new int[] { 267, (byte) -1, 267 };
        int int4 = org.apache.commons.lang3.math.NumberUtils.max(intArray3);
        int int5 = org.apache.commons.lang3.math.NumberUtils.max(intArray3);
        int int6 = org.apache.commons.lang3.math.NumberUtils.min(intArray3);
        int int7 = org.apache.commons.lang3.math.NumberUtils.max(intArray3);
        int int8 = org.apache.commons.lang3.math.NumberUtils.max(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[267, -1, 267]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 267 + "'", int4 == 267);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 267 + "'", int5 == 267);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 267 + "'", int7 == 267);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 267 + "'", int8 == 267);
    }

    @Test
    public void test39130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39130");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "4                                                 100.0                                                                             aaaa0aaaaa       ...", (java.lang.CharSequence) "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test39131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39131");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(125, 651, 61);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 651 + "'", int3 == 651);
    }

    @Test
    public void test39132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39132");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("", "true44TRUE-1.  97.");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test39133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39133");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad(".44444444444444444444444444444444a    4", 45, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ".44444444444444444444444444444444a    4######" + "'", str3, ".44444444444444444444444444444444a    4######");
    }

    @Test
    public void test39134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39134");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "    a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a     ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test39135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39135");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "!hi!h!hi!h", (java.lang.CharSequence) "true-1.       ...97");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test39136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39136");
        long[] longArray4 = new long[] { 'a', (byte) 100, 52L, 44 };
        long long5 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        long long6 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        long long7 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        long long8 = org.apache.commons.lang3.math.NumberUtils.max(longArray4);
        long long9 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        long long10 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray4), "[97, 100, 52, 44]");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 44L + "'", long5 == 44L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 44L + "'", long6 == 44L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 44L + "'", long7 == 44L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 44L + "'", long9 == 44L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 44L + "'", long10 == 44L);
    }

    @Test
    public void test39137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39137");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("a#4#...");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test39138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39138");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(187, 182, 788);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 788 + "'", int3 == 788);
    }

    @Test
    public void test39139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39139");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "a00       000       000       00aaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 57 + "'", int1 == 57);
    }

    @Test
    public void test39140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39140");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "aHI!HI!HI!HI!HI!HI!HI!HI!HI!HI...aaHI!HI!HI!HI!HI!HI!HI!HI!HI!HI...aaHI!HI!HI!HI!HI!HI!HI!HI!HI!HI...aaHI!HI!HI!HI!HI!HI!HI!HI!HI!HI...aaHI!HI!HI!HI!HI!HI!HI!HI!HI!HI..444444444444444444444444444440true-1.0097.A4444444444444444444444444444444444444444444440true-1.0097.A4444444444444444444444444444444444444444444440true-1.0097.A4444444444444444444444444444444444444444444440true-1.0097.A4444444444444444444444444444444444444444444440true-1.0097.A4444444444444444444444444444444444444444444440true-1.0097.A4444444444444444444444444444444444444444444440true-1.0097.A4444444444444444444444444444444444444444444440true-1.0097.A4444444444444444444444444444444444444444444440true-1.0097.A4444444444444444444444444444444444444444444440true-1.0097.");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test39141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39141");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000...44444444444444444444444444444444440true-1.0097...44444");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test39142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39142");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("Aaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaAaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaAaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaAaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaAaaaaaaaaaa4444444...4444444...44hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!Aaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaAaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaAaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaAaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaAaaaaaaaaaa4444444...4444444...444", "Aaaaaaaaaaa4444444...4444444...4444444...4");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...aaaaaaaaaaa" + "'", str2, "...aaaaaaaaaaa");
    }

    @Test
    public void test39143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39143");
        double[] doubleArray5 = new double[] { (-1.0d), 10.0d, '#', 10.0d, (-1.0f) };
        double double6 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        double double7 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double8 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        double double9 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double10 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        double double11 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        double double12 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, 35.0, 10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 35.0d + "'", double7 == 35.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 35.0d + "'", double9 == 35.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 35.0d + "'", double12 == 35.0d);
    }

    @Test
    public void test39144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39144");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(114.0f, (float) 130L, (float) 156);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 156.0f + "'", float3 == 156.0f);
    }

    @Test
    public void test39145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39145");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("                              ...44444...true-1.4444444...97.4444444...4444444444444...4                               ", "                                      hI!HI!HI!HI!HI!HI!HI!HI!Htrue-1.00                                           true-1.97.");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test39146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39146");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "a###ahi!hi!...###ahi!hi!...###");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "a###ahi!hi!...###ahi!hi!...###" + "'", str1, "a###ahi!hi!...###ahi!hi!...###");
    }

    @Test
    public void test39147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39147");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("  aa     aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               ");
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, "A A A A A", 170, 59);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test39148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39148");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("...44444444444...                                                                                                                                                              ", "               #######    a   HI!HI!...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test39149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39149");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##############################################0097.aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test39150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39150");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR", "AHI!", "                                                                                                                                                                                                                                                                                                         0true-1.0097.044444444444444444444444444...                                                                                                                                                                                                                                                                                                         ", 167);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR" + "'", str4, "TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR");
    }

    @Test
    public void test39151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39151");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 463L, (float) 202, (float) 216L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 202.0f + "'", float3 == 202.0f);
    }

    @Test
    public void test39152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39152");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("rue-1.0097.00trA0t", 205);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "rue-1.0097.00trA0t" + "'", str2, "rue-1.0097.00trA0t");
    }

    @Test
    public void test39153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39153");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("                   rt00.7900.                   ", "#############################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################0.00");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                   rt00.7900.                   " + "'", str2, "                   rt00.7900.                   ");
    }

    @Test
    public void test39154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39154");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "H!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I..");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test39155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39155");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444 aaaa", (short) (byte) 0);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 0 + "'", short2 == (short) 0);
    }

    @Test
    public void test39156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39156");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("44444444444444444444444444444444444444444440true-1.0097.  A    44444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    44444444", "                     ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                     " + "'", str2, "                     ");
    }

    @Test
    public void test39157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39157");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("###################################################44444444444444444444444", ' ');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test39158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39158");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("a4a4aaaaaaaaaaaaaaaaaaa4TRUE-4.497.4TRUE-4.497.4TRUE-4.497.4TRUE-4.497.4TRUE-4.497.4TRUE-4.497.4TRUE-4.4....444444444tr...aaaaaaaaaaaaaaaaa", "AAAAAAAAAAAAAAAAAA       TRUE       TRUE       TRUE ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test39159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39159");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("..00.1-eurt0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               ", "4444444...   4444444...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test39160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39160");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA4444444...", "HI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAA...44 ...4A");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA4444444..." + "'", str2, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA4444444...");
    }

    @Test
    public void test39161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39161");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("##########################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################4444444440097...#############################################################################################", "Aaaaaaa      a         a         a         a         aaaaaaaa", "!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HH");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "##########################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################4444444440097...#############################################################################################" + "'", str3, "##########################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################4444444440097...#############################################################################################");
    }

    @Test
    public void test39162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39162");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("                                                                                                                                  aaaa0                                                                                                                                 ", "ahi!hi!hi!haaaaaaaaaaaaaaa44444aaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test39163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39163");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("TRUE97TRUE9", 670, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444TRUE97TRUE9444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str3, "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444TRUE97TRUE9444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test39164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39164");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("", 819, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str3, "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test39165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39165");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("0.7900.1-eurt0aaaaaaaaaaaaaaaaaaaaa", 449);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test39166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39166");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("..44440TRUE-1.A00       000       000       00", "0097.00true-1.00");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test39167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39167");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("true-1.0097.00true-1.0097.00tr", "0true-1.00                                           true-1.97.                                                                                           04true4-414.400974.4004true4-414.400974.4004true4-414.400974.4004tr4 4A4        04true4-414.400974.4004true4-414.400974.4004true4-414.400974.4004tr4 4A4        04true4-414.400974.4004true4-414.400974.4004true4-414.400974.4004tr4 4A4        04true4-414.400974.4004true4-414.400974.4004true4-414.400974.4004tr4 4A4        04true4-414.400974.4004true4-414.400974.4004true4-414.400974.4004tr4 4A4        04true4-414.400974.4004true4-414.400974.4004true4-414.400974.4004tr4 4A4        04true4-414.40", "0AAAA4444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test39168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39168");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("444444444444444444444444444444444444444444true-1.97.4444444444444444444444444444444444444444444", "0true-1.0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 817);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test39169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39169");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                               true  ", (byte) -1);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) -1 + "'", byte2 == (byte) -1);
    }

    @Test
    public void test39170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39170");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "#a#44444444444444444444#...#444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "#a#44444444444444444444#...#444444444444444444444444444444444444444444444" + "'", str1, "#a#44444444444444444444#...#444444444444444444444444444444444444444444444");
    }

    @Test
    public void test39171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39171");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("!", 'a');
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("aaaa0aaaaa", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", 0);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray7, "                       #A#44444444444444444444#...#444444444444444444444444444444444444444444444", 850, 0);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray7);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray7, "A    44");
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("", strArray3, strArray7);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "aaaa0aaaaa" + "'", str14, "aaaa0aaaaa");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test39172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39172");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "0true-1.0                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 ", (java.lang.CharSequence) "4444444444444444444444444444444444444444444true-1.97.44444444444444444444444444444444444444444444                                       true-1.4444444444444444444444444444444444444444444true-1.97.44444444444444444444444444444444444444444444                                       hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!4444444444444444444444444444444444444444444true-1.97.44444444444444444444444444444444444444444444                                       4444444444444444444444444444444444444444444true-1.97.44444444444444444444444444444444444444444444                                       true-1.0097.");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "0true-1.0                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 " + "'", charSequence2, "0true-1.0                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 ");
    }

    @Test
    public void test39173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39173");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("aa0aaaaaaaaa0aaaaa", (byte) 10);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 10 + "'", byte2 == (byte) 10);
    }

    @Test
    public void test39174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39174");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("                          rue-1.0097.0", "                    0true-1.0097.00true-1.0097.00true-1.0097.00trHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HH 0true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.0", 130);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test39175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39175");
        char[] charArray17 = new char[] { ' ', '4', 'a', 'a', 'a' };
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "100.0", charArray17);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray17);
        boolean boolean20 = org.apache.commons.lang3.StringUtils.containsAny("44444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444", charArray17);
        int int21 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "0true-1.0097.00true-1.0097.00true-1.0097.00tr    A     0true-1.0097.00true-1.0097.00true-1.0097.00t", charArray17);
        int int22 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "0true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444", charArray17);
        int int23 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "4444A44444", charArray17);
        int int24 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "4444444...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", charArray17);
        int int25 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                                      100.0                                                      ", charArray17);
        boolean boolean26 = org.apache.commons.lang3.StringUtils.containsAny("...44444444444...", charArray17);
        boolean boolean27 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "#######################################################################################################################################################################4 0true-1.0097.04444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444", charArray17);
        boolean boolean28 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "44444444444444444444444a444444444444444444444444", charArray17);
        int int29 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "044444444444444444444444444....IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I.......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH", charArray17);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray17), " 4aaa");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray17), " 4aaa");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray17), "[ , 4, a, a, a]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 45 + "'", int21 == 45);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 14 + "'", int22 == 14);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 7 + "'", int24 == 7);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test39176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39176");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("4444444444444444444444444444444444444444444 true - 1 . 97 . 4444444444444444444444444444444444444...", 80, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4444444444444444444444444444444444444444444 true - 1 . 97 . 4444444444444444444444444444444444444..." + "'", str3, "4444444444444444444444444444444444444444444 true - 1 . 97 . 4444444444444444444444444444444444444...");
    }

    @Test
    public void test39177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39177");
        java.lang.String[] strArray1 = null;
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.split("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "0", (-1));
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.replaceEach("", strArray1, strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test39178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39178");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("                                                                ...44444444444444444444444444444444440TRUE-1.0097...                                                                 ", 49);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 107 + "'", int2 == 107);
    }

    @Test
    public void test39179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39179");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "                       a                   TRUE-1.0097.0                       a                                           a44444444444444444444...444444444444444444444444444444444444444444444                       a44444444444444444444...4444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test39180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39180");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("444444444444444444444444...44444444444444444444444444444444440true-1.0097...444444444444444444444444");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test39181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39181");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("A rt00.7900.1-eurt00.7 A rt00.7900.1-eurt00.7                                                                                    ", "RT00 7900 1-EURT00 7900 1-EURT00 7900 1-EURT0      ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "RT00 7900 1-EURT00 7900 1-EURT00 7900 1-EURT0      " + "'", str2, "RT00 7900 1-EURT00 7900 1-EURT00 7900 1-EURT0      ");
    }

    @Test
    public void test39182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39182");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("4000");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray1);
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4000" + "'", str2, "4000");
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test39183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39183");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("0444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0444444444444444444444444444444444444444444" + "'", str1, "0444444444444444444444444444444444444444444");
    }

    @Test
    public void test39184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39184");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "A   hi!hi!...truea   hi!hi!...-a   hi!hi!...a   hi!hi!...a   hi!hi!...97a   hi!hi!...a   hi!hi!...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test39185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39185");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("aaaaa0aaaa0.7900.1-eurt04444444444444444...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test39186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39186");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("444...44444444444444444444444444444444440TRUE-1.0097...44", "                                                                                                                                                                                                                                                                         a44444a444444a444444444444444444a44444a                                                                                                                                                                                                                                                                          ", "444444a4444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "444...44444444444444444444444444444444440TRUE-1.0097...44" + "'", str3, "444...44444444444444444444444444444444440TRUE-1.0097...44");
    }

    @Test
    public void test39187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39187");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("AAAAAAA...00.7900.1-EURT00.79...AAAAAAA", 28, "00");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "AAAAAAA...00.7900.1-EURT00.79...AAAAAAA" + "'", str3, "AAAAAAA...00.7900.1-EURT00.79...AAAAAAA");
    }

    @Test
    public void test39188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39188");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("   4444444...aaaaaaaaa44444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4444444...aaaaaaaaa44444444444444444444444444444444444444444" + "'", str1, "4444444...aaaaaaaaa44444444444444444444444444444444444444444");
    }

    @Test
    public void test39189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39189");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("", (int) (byte) 100, 123);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test39190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39190");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("", 589.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 589.0f + "'", float2 == 589.0f);
    }

    @Test
    public void test39191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39191");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("          aHI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA           ", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test39192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39192");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "...0TRUE-1.0097...######################################################################################################444444444444444440true-1.0097...444444444444444444444444                                                                                        100.######################################################################################################444444444444444440true-1.0097...444444444444444444444444                                                                                        100.###########################################", (java.lang.CharSequence) "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA       ...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 551 + "'", int2 == 551);
    }

    @Test
    public void test39193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39193");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("0true-1.00                                           true-1.97.                                                                                           04true4-414.400974.4004true4-414.400974.4004true4-414.400974.4004tr4 4A4        04true4-414.400974.4004true4-414.400974.4004true4-414.400974.4004tr4 4A4        04true4-414.400974.4004true4-414.400974.4004true4-414.400974.4004tr4 4A4        04true4-414.400974.4004true4-414.400974.4004true4-414.400974.4004tr4 4A4        04true4-414.400974.4004true4-414.400974.4004true4-414.400974.4004tr4 4A4        04true4-414.400974.4004true4-414.400974.4004true4-414.400974.4004tr4 4A4        04true4-414.40");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0true-1.00                                           true-1.97.                                                                                           04true4-414.400974.4004true4-414.400974.4004true4-414.400974.4004tr4 4A4        04true4-414.400974.4004true4-414.400974.4004true4-414.400974.4004tr4 4A4        04true4-414.400974.4004true4-414.400974.4004true4-414.400974.4004tr4 4A4        04true4-414.400974.4004true4-414.400974.4004true4-414.400974.4004tr4 4A4        04true4-414.400974.4004true4-414.400974.4004true4-414.400974.4004tr4 4A4        04true4-414.400974.4004true4-414.400974.4004true4-414.400974.4004tr4 4A4        04true4-414.40" + "'", str1, "0true-1.00                                           true-1.97.                                                                                           04true4-414.400974.4004true4-414.400974.4004true4-414.400974.4004tr4 4A4        04true4-414.400974.4004true4-414.400974.4004true4-414.400974.4004tr4 4A4        04true4-414.400974.4004true4-414.400974.4004true4-414.400974.4004tr4 4A4        04true4-414.400974.4004true4-414.400974.4004true4-414.400974.4004tr4 4A4        04true4-414.400974.4004true4-414.400974.4004true4-414.400974.4004tr4 4A4        04true4-414.400974.4004true4-414.400974.4004true4-414.400974.4004tr4 4A4        04true4-414.40");
    }

    @Test
    public void test39194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39194");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("                                                                                                                                                                                                                                                                                                    ", 424, 144);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...                                                                                                                                             " + "'", str3, "...                                                                                                                                             ");
    }

    @Test
    public void test39195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39195");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa", "rt00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt0 a rt00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt0");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test39196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39196");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("100.0#####100.0###");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"100.0#####100.0###\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test39197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39197");
        char[] charArray10 = new char[] { '4', '4', ' ' };
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "0", charArray10);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444", charArray10);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsAny("h", charArray10);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", charArray10);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "...44444444444444444444440TRUE-1.0440true-1.0097.0aaaa0aaaaa...44444444444444444444440TRUE-1.04", charArray10);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "    100.0      0true-1.0097.00true-1.0097.00true-1.0097.00tr4444A444440true-1.0097.00true-1.0097.00true-1.0097.00t                                                                                100.0                                                                                      100.0                                                                                      100.0", charArray10);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                                                                                         #######################################################################################################################################################################4 0true-1.0097.04444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444                                                                                          ", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "44 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "44 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[4, 4,  ]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test39198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39198");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("...444###################################################44444444444444444444444                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...444###################################################44444444444444444444444                                                                                                                                                                                                                                                                                                                                                                                                                                                                         " + "'", str1, "...444###################################################44444444444444444444444                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ");
    }

    @Test
    public void test39199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39199");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("44444444444444444440TRUE-1.0097.                                                                      ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "44444444444444444440true-1.0097.                                                                      " + "'", str1, "44444444444444444440true-1.0097.                                                                      ");
    }

    @Test
    public void test39200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39200");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("0TRUE-1.0097.0AAAA0AAAAA44444444444444444444444444444444444444444440TRUE-1.0097.0AAAA0AAAAA44444444444444444444444444444444444444444440TRUE-1.0097.0AAAA0AAAAA44444444444444444444444444444444444444444440TRUE-1.0097.0AAAA0AAAAA44444444444444444444444444444444444444444440TRUE-1.0097.0AAAA0AAAAA44444444444444444444444444444444444444444440TRUE-1.0097.0AAAA0AAAAA44444444444444444444444444444444444444444440TRUE-1.0097.0AAAA0AAAAA444444444", "    a0a                 0true-1.0A A A A            ", 441);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test39201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39201");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("        04true4-414.400974.4004true4-414.400974.4004true4-414.400974.4004tr4 4A4");
        java.lang.Class<?> wildcardClass2 = strArray1.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test39202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39202");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("0097      A   hi!hi!hi!haaaaaaaaaaaaaaaaaaaaaaaaaaaa       ...", "EURT044444444444444444444444444444444444444444444444444444444444444444444444444444444!hi!h!hi!h44444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT04444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0097      A   hi!hi!hi!haaaaaaaaaaaaaaaaaaaaaaaaaaaa       " + "'", str2, "0097      A   hi!hi!hi!haaaaaaaaaaaaaaaaaaaaaaaaaaaa       ");
    }

    @Test
    public void test39203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39203");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) 957, 46L, 842L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 46L + "'", long3 == 46L);
    }

    @Test
    public void test39204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39204");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("I!HI!HI!HI!HI!HI!HI!HI!HI!HI", "44444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test39205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39205");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("0097...40097...4", ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0097...40097...4" + "'", str2, "0097...40097...4");
    }

    @Test
    public void test39206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39206");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "    A");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test39207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39207");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("                                            100.01aaaaaaaaaaa4444444...4444444...4444444...41aaaaaaaaaaa4444444...4444444...4444444...41aaaaaaaaaaa4444444...4444444...4444444...41aaaaaaaaaaa4444444...4444444...4444444...41aaaaaaaaaaa4444444...4444444...4444444...41aaaaaaaaaaa4444444...4444444...4444444...41aaaaaaaaaaa4444444...4444444...4444444...41aaaaaaaaaaa4444444...4444444...4444444...41aaaaaaaaaaa4444444...4444444...4444444...41aaaaaaaaaaa4444444...4444444...4444444...41aaaaaaaaaaa4444444...4444444...4444444...41aaaaaaaaaaa4444444...444444");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test39208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39208");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(891, 188, 638);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 188 + "'", int3 == 188);
    }

    @Test
    public void test39209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39209");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("ahi!", 21, "                                                                                                                                                                                                                                                                         0");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "        ahi!         " + "'", str3, "        ahi!         ");
    }

    @Test
    public void test39210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39210");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "               ...", 638);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("4444444...");
        boolean boolean9 = org.apache.commons.lang3.StringUtils.endsWithAny("", strArray8);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.concatWith("", (java.lang.Object[]) strArray8);
        java.lang.String[] strArray11 = org.apache.commons.lang3.StringUtils.stripAll(strArray8);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.replaceEach("                                                                                                                                                                                                                                                                                                         0true-1.0097.044444444444444444444444444...                                                                                                                                                                                                                                                                                                          ", strArray4, strArray11);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "4444444..." + "'", str10, "4444444...");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "                                                                                                                                                                                                                                                                                                         0true-1.0097.044444444444444444444444444...                                                                                                                                                                                                                                                                                                          " + "'", str12, "                                                                                                                                                                                                                                                                                                         0true-1.0097.044444444444444444444444444...                                                                                                                                                                                                                                                                                                          ");
    }

    @Test
    public void test39211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39211");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444444444444444444444444444444444444444444444444444444444444444444 ! aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 173, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444444444444444444444444444444444444444444444444444444444444444444 ! aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444444444444444444444444444444444444444444444444444444444444444444 ! aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test39212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39212");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "                     AAAH                     AAA");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test39213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39213");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                   4aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 128, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                   4aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                   4aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test39214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39214");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("H!ih!h!ih!");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test39215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39215");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("0.001");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test39216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39216");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "0true-1.0097.00true-1.0097.00true-1.0097.00trHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HH", "1aaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test39217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39217");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 80, 546.0f, (float) 127);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 80.0f + "'", float3 == 80.0f);
    }

    @Test
    public void test39218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39218");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("##############################################0true-1.00...44444...true-1.4444444...97.4444444...4444444444444...0true-1.00...44444...true-1.4444444...97.4444444...4444444444444...0true-1.00...44444...true-1.4444444...97.4444444...4444444444444...0tr####A#####0true-1.00...44444...true-1.4444444...97.4444444...4444444444444...0true-1.00...44444...true-1.4444444...97.4444444...4444444444444...0true-1.00...44444...true-1.4444444...97.4444444...4444444444444...0tr", "...444444444444444444444444444444444444444444444     4    444444444444444444444444444444444444444444444           444444444444444444444444444444444444444444444     4    444444444444444444444444444444444444444444444 ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test39219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39219");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "0true-10aaaa00970aaaa0                                                                                                                                       A    aaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 175 + "'", int1 == 175);
    }

    @Test
    public void test39220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39220");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("                       #a#44444444444444444444#...#444444444444444444444444444444444444444444444                       #a#44444444444444444444#...#444444444444444444444444444444444444444444444                       #a#44444444444444444444#...#444444444444444444444444444444444444444444444                     444444444444444444444444444444444444444444                       #a#44444444444444444444#...#444444444444444444444444444444444444444444444                       #a#44444444444444444444#...#444444444444444444444444444444444444444444444                       #a#44444444444444444444#...#444444444444444444444444444444444444444444444                     ", "aaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                       #a#44444444444444444444#...#444444444444444444444444444444444444444444444                       #a#44444444444444444444#...#444444444444444444444444444444444444444444444                       #a#44444444444444444444#...#444444444444444444444444444444444444444444444                     444444444444444444444444444444444444444444                       #a#44444444444444444444#...#444444444444444444444444444444444444444444444                       #a#44444444444444444444#...#444444444444444444444444444444444444444444444                       #a#44444444444444444444#...#444444444444444444444444444444444444444444444                     " + "'", str2, "                       #a#44444444444444444444#...#444444444444444444444444444444444444444444444                       #a#44444444444444444444#...#444444444444444444444444444444444444444444444                       #a#44444444444444444444#...#444444444444444444444444444444444444444444444                     444444444444444444444444444444444444444444                       #a#44444444444444444444#...#444444444444444444444444444444444444444444444                       #a#44444444444444444444#...#444444444444444444444444444444444444444444444                       #a#44444444444444444444#...#444444444444444444444444444444444444444444444                     ");
    }

    @Test
    public void test39221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39221");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                                                                                                                                                                                                                                           ...A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A...", "                   rt00.7900.                   ##################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################", 4);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test39222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39222");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("44444444444444444440true-1.0097.                                                                      ", "...4#444hi!hi!hi!h############################...44");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44444444444444444440true-1.0097.                                                                      " + "'", str2, "44444444444444444440true-1.0097.                                                                      ");
    }

    @Test
    public void test39223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39223");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("a004444444000444444400044444440");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"a004444444000444444400044444440\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test39224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39224");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("                                                                                                                                                                                                         0TRUE-1.0097.044444444444444444444444444..", ".##################################################");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test39225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39225");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "100.0                                                     aaaa0true-1.0097.044444444444444444444444", "...44aaaaaaaaaaaaaaaaaaaaaaaaaaa                     AAAA0AAAAA           aaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test39226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39226");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "####");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test39227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39227");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "7900.1-eurt0aaaaaaaaaaaaaaaaaaaaaaaaaaa0.7900.1-eurt0A    ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih   A");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test39228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39228");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("A                             ###    A   hi!hi!...###    A   hi!hi!...###", '#', ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "A                                    A   hi!hi!...       A   hi!hi!...   " + "'", str3, "A                                    A   hi!hi!...       A   hi!hi!...   ");
    }

    @Test
    public void test39229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39229");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("                                                                                                                               ...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test39230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39230");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("0TRUE-1.0097.044444444444444444444444444...", "0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.00...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test39231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39231");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "    a   HI!HI!HI!HI!HI!HI!H");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test39232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39232");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("                                                                                               100.0", "444444444444");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.split("    A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A     ", "aaaaaaaaa");
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray6);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.replaceEach("                     aaaaa0aaaa                     ", strArray3, strArray6);
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "    A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A     " + "'", str7, "    A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A     ");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "                     aaaaa0aaaa                     " + "'", str8, "                     aaaaa0aaaa                     ");
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "                                                                                               100.0" + "'", str11, "                                                                                               100.0");
    }

    @Test
    public void test39233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39233");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("A0true-1.0097.0aaaa0aaaaa40true-1.0097.0aaaa0aaaaa40true-1.0097.0aaaa0aaaaa40true-1.0097.0aaaa0aaaaa40true-1.0097.0aaaa0aaaaa40true-1.0097.0aaaa0aaaaa40true-1.0097.0aaaa0aaaaa40true-1.0097.0aaaa0aaaaa40true-1.0097.0aaaa0aaaaa4...aaaa0aaaaa4a4A4A4A4A", "                                                                                                           ...      ", 578);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test39234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39234");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("h!ih!h!ih!h!ih!h!ih!h!ih!h!ih!h!ih!h!ih!h!ih!h!ih!", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           0aaaa                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test39235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39235");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("", "444444444444444444444444444444444444444444444444444444444444e-1.0097.00true-1.0097.00true-1.0097.00tr    a     0true-1.0097.00true-1.0097.00true-1.0097.00tr", "                                                                                                                                                                                                                                                                                                                                                                                     4444444444444444444444444444444444444444444true-1.97.4444444444444444444444444444444444444444444                                                                                                                                                                                                                                                                                                                                                                                     ");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test39236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39236");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("a A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A aaaaaaaaaaaaaaaaaaaa00 0true00 0-00 000 000 09700 000 0", "04true4-414.400974.4004true4-414.400974.4004true4-414.400974.4004tr4 4A4 ", "                                 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaTRUE-1.97.aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaTRUE-1.97.aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "a A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A aaaaaaaaaaaaaaaaaaaa00 0true00 0-00 000 000 09700 000 0" + "'", str3, "a A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A aaaaaaaaaaaaaaaaaaaa00 0true00 0-00 000 000 09700 000 0");
    }

    @Test
    public void test39237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39237");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test39238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39238");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("", 127);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test39239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39239");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "                               44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444A    ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih   A44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               0true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.00..", 60);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test39240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39240");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("4444..4444", 'a');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test39241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39241");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("###################################################################################################################################################################################################################################################44444444444444444444444 aaa  aaaaaa  aaaa                                                      a  a###################################################################################################################################################################################################################################################", "A   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test39242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39242");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("aaaa0", "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444...", "");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test39243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39243");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("", 232, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str3, "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test39244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39244");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("aaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaa");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test39245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39245");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("444                                      100.0                                                     aaaa444444444444444444444", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##100.0###", 33);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test39246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39246");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("Hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test39247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39247");
        char[] charArray12 = new char[] { '4', '4', ' ' };
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "0", charArray12);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsAny("a", charArray12);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "    A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A     ", charArray12);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "444444444444444444444444...44444444444444444444444444444444440true-1.0097...444444444444444444444444", charArray12);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "     A    ", charArray12);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR4444A444440TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00T", charArray12);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", charArray12);
        boolean boolean20 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi", charArray12);
        int int21 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "                                0.7900.1-EURT0AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                                   4AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA    A     0.7900.1-EURT0AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                                   4AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA    A     0.7900.1-EURT0AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                                   4AAAAAAAAAAAAAAAAAAAAAAA", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "44 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "44 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[4, 4,  ]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 24 + "'", int16 == 24);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 5 + "'", int17 == 5);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 45 + "'", int18 == 45);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 32 + "'", int21 == 32);
    }

    @Test
    public void test39248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39248");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("Hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", "                       #A#44444444444444444444#...#444444444444444444444444444444444444444444444", 589);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str4, "Hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test39249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39249");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "                          #...#4#A#");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test39250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39250");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("0true-1.00", "   444444444444444444444444...44444a   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    ", 37);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0true-1.00" + "'", str4, "0true-1.00");
    }

    @Test
    public void test39251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39251");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("AAAAAAAAAAAAAAAAAAAAAAAAAAAA", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAaaaaaaaaaaaaaaaaaaaa000true000-00000000097000000", "a A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A aaaaaaaaaaaaaaaaaaaa00       0true00       0-00       000       000       09700       000       0");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test39252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39252");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("444444444444444440true-1.0097...444444444444444444444444                                                                                        100.0", 11, 42);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test39253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39253");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("...1-eurt00.7900.1-eurt", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...1-eurt00.7900.1-eurt" + "'", str2, "...1-eurt00.7900.1-eurt");
    }

    @Test
    public void test39254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39254");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("                  4                  ", "                                                                                                                                     ", 132);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test39255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39255");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("4                                                 100.0                                                                             AAAA0AAAAA", "                                      00       0                                     ", 0);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test39256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39256");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("Ahi!hi!hi!haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "                                              aaaaaaaaa.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Ahi!hi!hi!haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "Ahi!hi!hi!haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test39257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39257");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "44444444444444444444444444444440true0true-1.0097.00true-1.0097.00true-1.0097.00trA0t...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test39258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39258");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("...4444444444444444444444444440t...", "4444444...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, '#', 660, 449);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test39259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39259");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("true4-4449744                                       ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "TRUE4-4449744                                       " + "'", str1, "TRUE4-4449744                                       ");
    }

    @Test
    public void test39260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39260");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("0TRUE-1.0097.0AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA0TRUE-1.0097.0AAAAAAAAAAAAAAAAAAAAAAAAAAA", "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444...4444444444444444444444", 146);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.concatWith("####################aaa...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1.0097...aa                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       ######################################", (java.lang.Object[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "0TRUE-1.0097.0AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA0TRUE-1.0097.0AAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str5, "0TRUE-1.0097.0AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA0TRUE-1.0097.0AAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test39261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39261");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "aaaaaaaaaaa4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...444444           44444444444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...444444           ...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...444444           44444444444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...444444           ...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...444444           44444444444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...444444           ...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...444444           44444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...444444           ...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...444444           aaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test39262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39262");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "!hi!hi!hi...    A0true-1.0097.0aaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1.0097.0aaaaaaaaaaaaaaaaaaaaaaa40true-1.0097.     A    40true-1.0097.     A    40true-1.0097.  A    4aaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test39263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39263");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("......44444444444444444444444444444444440TRUE-1.0097...         a...44444444444444444444444444444444440TRUE-1.0097...         ...44444444444444444444444444444444440TRUE-1.0097...a...44444444444444444444444444444444440TRUE-1.0097...                                                     ...44444444444444444444444444444444440TRUE-1.0097...100...44444444444444444444444444444444440TRUE-1.0097.......44444444444444444444444444444444440TRUE-1.0097...0...44444444444444444444444444444444440TRUE-1.0097...    ...44444444444444444444444444444444440TRUE-1.0097...a...44444444444444444444444444444444440TRUE-1.0097...         ...44444444444444444444444444444444440TRUE-1.0097...a    ...44444444444444444444444444444444440TRUE-1.0097...4444444444444444444444", "a44444!hi!hi!hi...    A0true-1.0097.0aaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1.0097.0aaaaaaaaaaaaaaaaaaaaaaa40true-1.0097.     A    40true-1.0097.     A    40true-1.0097.  A    4aaaaaaa444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", 52);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test39264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39264");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "                 ...                                                     AAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test39265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39265");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("0097...40097...4");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test39266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39266");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("0true-1.00-1.0097.04444444444444444444444444444444Ahi!hi!hi!haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                       ", "                             00       0                 ", "    A   HI!HI!...    A   HI!HI!...    A   HI!HI!...    A   HI!HI!...    A   HI!HI!...    A   HI!HI!...    A   HI!HI!......7900.1-EURT0");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0true-1.00-1.0097.04444444444444444444444444444444Ahi!hi!hi!haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                       " + "'", str3, "0true-1.00-1.0097.04444444444444444444444444444444Ahi!hi!hi!haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                       ");
    }

    @Test
    public void test39267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39267");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("00aaaaaaaaaaaaa...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "00aaaaaaaaaaaaa..." + "'", str1, "00aaaaaaaaaaaaa...");
    }

    @Test
    public void test39268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39268");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test39269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39269");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("....4444444444444444444444444444...aaaaaaa7.44444444444444444444444444444444A    4aaaaaa....4444444444444444444444444444...", 18);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 18 + "'", int2 == 18);
    }

    @Test
    public void test39270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39270");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("AAA", "44444444444444444444444444444444440true-    A     ...44444444444444444444444444444444440true-");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AAA" + "'", str2, "AAA");
    }

    @Test
    public void test39271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39271");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("4444444444true-1.  97                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ", "AHI!HI!HI!HI!HI!HI!HI!HI!HI!HI...AAHI!HI!HI!HI!HI!HI!HI!HI!HI!HI...AAHI!HI!HI!HI!HI!HI!HI!HI!HI!HI...AAHI!HI!HI!HI!HI!HI!HI!HI!HI!HI...AAHI!HI!HI!HI!HI!HI!HI!HI!HI!HI..444444444444444444444444444440TRUE-1.0097.A4444444444444444444444444444444444444444444440TRUE-1.0097.A4444444444444444444444444444444444444444444440TRUE-1.0097.A4444444444444444444444444444444444444444444440TRUE-1.0097.A4444444444444444444444444444444444444444444440TRUE-1.0097.A4444444444444444444444444444444444444444444440TRUE-1.0097.A4444444444444444444444444444444444444444444440TRUE-1.0097.A4444444444444444444444444444444444444444444440TRUE-1.0097.A4444444444444444444444444444444444444444444440TRUE-1.0097.A4444444444444444444444444444444444444444444440TRUE-1.0097.");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test39272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39272");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("                                1aaaaaaaaaaa4444444...4444444...4444444...4  ", "0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HH 0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.0");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaa4444444...4444444...4444444...4" + "'", str2, "aaaaaaaaaaa4444444...4444444...4444444...4");
    }

    @Test
    public void test39273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39273");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("aaaaaaaaaaaaaaaaaaaA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    A0T");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    A0T" + "'", str1, "aaaaaaaaaaaaaaaaaaaA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    A0T");
    }

    @Test
    public void test39274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39274");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "0    -1.0097.00    -1.0097.00    -1.0097.00   A 0    -1.0097.00    -1.0097.00    -1.0097.00", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAtrueAA");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test39275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39275");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "                  4                   0TRUE-1.0097.04444444444444444444444444444444444444444440TRUE-1.0097.04444444444444444444444444", (java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                            HI!                                                                                                                                                                                                                                                                                                                                            ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 18 + "'", int2 == 18);
    }

    @Test
    public void test39276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39276");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast(" TRUE - 1 . 97 . ", "4444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " TRUE - 1 . 97 . " + "'", str2, " TRUE - 1 . 97 . ");
    }

    @Test
    public void test39277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39277");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("                                                                                                                                                                                                                                                                                                                                     ...44444444444...                                                                                                                                                                                                                                                                                                                                     ", 250);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                           ...44444444444...                                                                                                                                                                                                                                                                                                                                     " + "'", str2, "                                                                           ...44444444444...                                                                                                                                                                                                                                                                                                                                     ");
    }

    @Test
    public void test39278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39278");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("                                  444444444444444444444444...44444                                  ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "444444444444444444444444...44444" + "'", str1, "444444444444444444444444...44444");
    }

    @Test
    public void test39279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39279");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("                                                                                                                                                                                                                                                                                                                                                                                                                           AAAAAAAAAAAAAAAAAAAAAAAAAAAAH!IH!IH!IH ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test39280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39280");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444aaaa", "...44");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test39281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39281");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("44444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444", 632, 445);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test39282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39282");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("true 1.  97.", 13);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "true 1.  97. " + "'", str2, "true 1.  97. ");
    }

    @Test
    public void test39283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39283");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("                                                                                                                                                                                                                                                                                                            0true-1.0097.044444444444444444444444444 ...aaaaaaaaaaaaaaaaaaaaaaaaa...aaaaaaaaaaaaaa0.001...aaaaaaaaaaaaaaaaaaaaaaaaa...aaaaaaaaaaaaaa", 17, "true-1.00-1.0097.04444444444444444444444444444444a   hi!hi!hi!h##########################################hihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihitrue-1.00-1.0097.04444444444444444444444444444444a   hi!hi!hi!h###########################################");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                                                                                                                                                                                                            0true-1.0097.044444444444444444444444444 ...aaaaaaaaaaaaaaaaaaaaaaaaa...aaaaaaaaaaaaaa0.001...aaaaaaaaaaaaaaaaaaaaaaaaa...aaaaaaaaaaaaaa" + "'", str3, "                                                                                                                                                                                                                                                                                                            0true-1.0097.044444444444444444444444444 ...aaaaaaaaaaaaaaaaaaaaaaaaa...aaaaaaaaaaaaaa0.001...aaaaaaaaaaaaaaaaaaaaaaaaa...aaaaaaaaaaaaaa");
    }

    @Test
    public void test39284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39284");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("A         ", (byte) 1);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 1 + "'", byte2 == (byte) 1);
    }

    @Test
    public void test39285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39285");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test39286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39286");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("...                                                     aaaaaaaaaaaaaaaaaaaaaaaaaa", "...aaaa0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR", 216);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test39287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39287");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("A HI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "...44444444444444444444440TRUE-1.044444444444444444444444444444444444444444440TRUE-1.044444444444444444444444444444444444444444440TRUE-1.044444444444444444444444444444444444444444440TRUE-1.044444444444444444444444444444444444444444440TRUE-1.044444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test39288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39288");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("a0aaaaaaaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0atrue 1.  97.a0aaaaaaaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aa");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test39289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39289");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "Aaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaAaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaAaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaAaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaAaaaaaaaaaa4444444...4444444...44hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!Aaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaAaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaAaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaAaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaAaaaaaaaaaa4444444...4444444...444");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test39290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39290");
        java.lang.String[] strArray6 = new java.lang.String[] { "a", "444444444444444444444444...44444444444444444444444444444444440true-1.0097...444444444444444444444444", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", "4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...", "44444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444" };
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.splitByCharacterType("");
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.replaceEach("0true-1.0097.00true-1.0097.00true-1.0097.00tr    A     0true-1.0097.00true-1.0097.00true-1.0097.00t", strArray6, strArray8);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray6, "A    4444444444444444444444444444444444444444444440true-1.0097.     A    44444444444444444444", 330, 116);
        java.lang.Class<?> wildcardClass14 = strArray6.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0true-1.0097.00true-1.0097.00true-1.0097.00tr    A     0true-1.0097.00true-1.0097.00true-1.0097.00t" + "'", str9, "0true-1.0097.00true-1.0097.00true-1.0097.00tr    A     0true-1.0097.00true-1.0097.00true-1.0097.00t");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test39291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39291");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA100.");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test39292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39292");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("#################################################AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "...a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a...", 19);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test39293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39293");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ", '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           " + "'", str2, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ");
    }

    @Test
    public void test39294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39294");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI", 539);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test39295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39295");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4                                                   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "44........4444444444444444444444444444444.....4444444444444444444444444444...4444444444........4444444444444444444444444444...4444444444........4444444444444444444444444444.");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test39296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39296");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "Ahi!hi!hi!haaaaaaaaaaaaaaa44444aaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test39297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39297");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("Hi!hi!hi!haaaaaaaaaaaaaaaaaaaaaaaaaaaa 0TRUE-1.00-1.0097.0444444444444444444444444444444...", "");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test39298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39298");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "    A    ...IH!IH!IH!IH!IH!IH!IH!IH!IH!IH   A    ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test39299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39299");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) 63, (long) 0, 167L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test39300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39300");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("0true-1.0097.00true-1.0097.00true-1.0097.00trHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HH", "4444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa#####################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0true-1.0097.00true-1.0097.00true-1.0097.00trHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HH" + "'", str2, "0true-1.0097.00true-1.0097.00true-1.0097.00trHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HH");
    }

    @Test
    public void test39301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39301");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("...A..", 615);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...A.." + "'", str2, "...A..");
    }

    @Test
    public void test39302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39302");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("aaaaaaaaaaaaaaaaaaaaaaaaa0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.00...############################################################################aaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test39303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39303");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("    A    ...IH!IH!IH!IH!IH!IH!IH!IH!IH!IH   A    ", (int) (byte) 1, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "    A    ...IH!IH!IH!IH!IH!IH!IH!IH!IH!IH   A    " + "'", str3, "    A    ...IH!IH!IH!IH!IH!IH!IH!IH!IH!IH   A    ");
    }

    @Test
    public void test39304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39304");
        double[] doubleArray5 = new double[] { (-1.0d), 10.0d, '#', 10.0d, (-1.0f) };
        double double6 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        double double7 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        double double8 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        double double9 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double10 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double11 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, 35.0, 10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 35.0d + "'", double9 == 35.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 35.0d + "'", double10 == 35.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
    }

    @Test
    public void test39305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39305");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("000044444444444444444444444444AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA###000##AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I..44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "000044444444444444444444444444AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA###000##AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str2, "000044444444444444444444444444AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA###000##AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test39306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39306");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("aaaaaaaaaaa4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...444444           44444444444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...444444           ...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...444444           44444444444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...444444           ...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...444444           44444444444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...444444           ...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...444444           44444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...444444           ...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...444444           aaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AAAAAAAAAAA4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...444444           44444444444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...444444           ...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...444444           44444444444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...444444           ...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...444444           44444444444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...444444           ...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...444444           44444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...444444           ...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...444444           AAAAAAAAAAA" + "'", str1, "AAAAAAAAAAA4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...444444           44444444444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...444444           ...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...444444           44444444444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...444444           ...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...444444           44444444444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...444444           ...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...444444           44444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...444444           ...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...444444           AAAAAAAAAAA");
    }

    @Test
    public void test39307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39307");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("A   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    ", "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 40 + "'", int2 == 40);
    }

    @Test
    public void test39308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39308");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                                                     4444444444444444444444444444444444444444444TRUE-1.97.4444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test39309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39309");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 150, (float) 30, (float) 216);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 30.0f + "'", float3 == 30.0f);
    }

    @Test
    public void test39310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39310");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("     444444444444444444444444444444444444444444", "0aaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test39311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39311");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR A 0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  aaaaa0aaaa0.7900.1-eurt04444444444444444...", 444);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test39312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39312");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "true-1.0097.0444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test39313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39313");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove(" 4A4 4rt4004.479004.414-4eurt4004.47444444444444444444444444444444444444444444444444444 4A4 4rt4004.479004.414-4eurt4004.47", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " 4A4 4rt4004.479004.414-4eurt4004.47444444444444444444444444444444444444444444444444444 4A4 4rt4004.479004.414-4eurt4004.47" + "'", str2, " 4A4 4rt4004.479004.414-4eurt4004.47444444444444444444444444444444444444444444444444444 4A4 4rt4004.479004.414-4eurt4004.47");
    }

    @Test
    public void test39314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39314");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("                                                                                                                                                                                                                                                                                                                                                                                                               44                     aaaa0aaaaa                                          aaaa0aaaaa                                          aaaa0aaaaa       ...", "A A A                              ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                               44                     aaaa0aaaaa                                          aaaa0aaaaa                                          aaaa0aaaaa       ..." + "'", str2, "                                                                                                                                                                                                                                                                                                                                                                                                               44                     aaaa0aaaaa                                          aaaa0aaaaa                                          aaaa0aaaaa       ...");
    }

    @Test
    public void test39315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39315");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("", (byte) 0);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 0 + "'", byte2 == (byte) 0);
    }

    @Test
    public void test39316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39316");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("                     aaaa0aaaaa                                          aaaa0aaaaa                                          aaaa0aaaaa       ...", '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                     aaaa0aaaaa                                          aaaa0aaaaa                                          aaaa0aaaaa       ..." + "'", str2, "                     aaaa0aaaaa                                          aaaa0aaaaa                                          aaaa0aaaaa       ...");
    }

    @Test
    public void test39317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39317");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI", 168);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 168 + "'", int2 == 168);
    }

    @Test
    public void test39318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39318");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               true-1.  97");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test39319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39319");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("44444444444444444444444444444444444444444444444444a...atruea-a1a.a4444444a...a97a.a4444444a...a4444444444444444444444444444444444444444444", "A   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    A0true-1.0097.0aaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1.0097.0aaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test39320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39320");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("                                                          ...####################################..", "rt00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt044444a4444rt00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt", "a   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    a");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                          hhh####################################hh" + "'", str3, "                                                          hhh####################################hh");
    }

    @Test
    public void test39321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39321");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfBlank("                                               A44444                                               ", "                                      a                                                     ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                               A44444                                               " + "'", str2, "                                               A44444                                               ");
    }

    @Test
    public void test39322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39322");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("                                        44...7900.1-eurt04444444444444444444444444444444444...444");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("     A    44");
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.concatWith("0TRUE-1.0097.0", (java.lang.Object[]) strArray5);
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.stripAll(strArray5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI", strArray2, strArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 11 vs 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.0A0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.044" + "'", str6, "0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.0A0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.044");
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void test39323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39323");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "...00.7900.1-eurt00.7900.1-eurt0");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test39324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39324");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("true - 97", "###0.001##");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "true - 97" + "'", str2, "true - 97");
    }

    @Test
    public void test39325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39325");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "#######################################################################################################################################################################4 0true-1.0097.04444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test39326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39326");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaA         A         A        ...", "                                       4true4-4449744                                        ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test39327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39327");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "A A ###################################");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test39328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39328");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "4444444true-1.00                                           true-1.97.                                                                                       ", "                                            100.01aaaaaaaaaaa4444444...4444444...4444444...41aaaaaaaaaaa4444444...4444444...4444444...41aaaaaaaaaaa4444444...4444444...4444444...41aaaaaaaaaaa4444444...4444444...4444444...41aaaaaaaaaaa4444444...4444444...4444444...41aaaaaaaaaaa4444444...4444444...4444444...41aaaaaaaaaaa4444444...4444444...4444444...41aaaaaaaaaaa4444444...4444444...4444444...41aaaaaaaaaaa4444444...4444444...4444444...41aaaaaaaaaaa4444444...4444444...4444444...41aaaaaaaaaaa4444444...4444444...4444444...41aaaaaaaaaaa4444444...444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test39329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39329");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("!hi!hi!hi...    A0true-1.0097.0aaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1.0097.0aaaaaaaaaaaaaaaaaaaaaaa40true-1.0097.     A    40true-1.0097.     A    40true-1.0097.  A    4aaaaaa");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test39330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39330");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("0true-", 'a');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test39331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39331");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444444444444444444444444444444444444444444444444...true-1.4444444...97.4444444...4444444444444444444444444444444444444444444");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test39332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39332");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("0true-1.00                               0                                                      0 ", "00       0true00       0-00       000                                                       ", "0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRA0TRUE-1.0097.00TRUE-1.0097.0...", 175);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0true-1.00                               0                                                      0 " + "'", str4, "0true-1.00                               0                                                      0 ");
    }

    @Test
    public void test39333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39333");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("                                                                                                                                                                                                                                                                                                                                                          0true-1.0097.044444444444444444444444444 ...aaaaaaaaaaaaaaaaaaaaaaaaa...aaaaaaaaaaaaaa###0.001##...aaaaaaaaaaaaaaaaaaaaaaaaa...aaaaaaaaaaaaaa                                                                                                                                                                                                                                                                                                                                                          ", "44444444444444444444444444444444444444444440true-1.0097.", 259);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test39334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39334");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("                                                                                aaaaaaa", "...44444...true-1.4444444...97.4444444...4444444444444...                  4000044444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa###000##aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa000044444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa###000##aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa000044444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa###000##aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa000044444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa###000##aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa000044444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa###000##aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 63);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test39335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39335");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa    A     ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test39336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39336");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("aaaaaaaaaaaaaaaaaaaaaaaaaaaaa              aaaaaa", "                                                                                                                                                        ...44444444444...");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test39337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39337");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("4444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa" + "'", str1, "4444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa");
    }

    @Test
    public void test39338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39338");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("                  4                   ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4" + "'", str1, "4");
    }

    @Test
    public void test39339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39339");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0true-1.44444444444444444444444444444444444444444440true-1.0097.097.44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...", (int) (byte) 1);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray5, " ", 100, 35);
        int int10 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("                     aaaaa0aaaa                     ", strArray5);
        int int11 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("a###ahi!hi!...###ahi!hi!...###", strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test39340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39340");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa444aaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test39341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39341");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("...44444444444444444444440TRUE-1.0440true-1.0097.0aaaa0aaaaa...44444444444444444444440TRUE-1.04");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: multiple points");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test39342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39342");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa100.", "a00       000       000       00aaaaaaaaaaaaaaaaaaaaaaaaa");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray2);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "                                                                                     ");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa100." + "'", str5, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa100.");
    }

    @Test
    public void test39343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39343");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("...44440true-1.0097.00true-1.0097.00true-1.0097.00tr", "0       000       00790       000       000       00-0       00eurt0       000       000       00790       000       000       00-0       00eurt0       000       000       00790       000       000       00-0       00eurt0       000       000       00790       000       000       00-0       00eurt0       000       000       00790       000       000       00-0       00eurt0       000       000       00790       000       000       00-0       00eurt0       000       000       00790       000       000       00-0       00eurt0       000       000       00790       000       000       00-0       00eurt0       000       000       00790       000       000       00-0       00eurt0       00", 147);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test39344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39344");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("44444444444444444444444444444444", "44444444444444444444444444444444444444444440true-1.0097", "#########...##########........###########", 56);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "44444444444444444444444444444444" + "'", str4, "44444444444444444444444444444444");
    }

    @Test
    public void test39345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39345");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min(102.0f, (float) 167, (float) 57L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 57.0f + "'", float3 == 57.0f);
    }

    @Test
    public void test39346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39346");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("", "...00.7900.1-eurt00.79......aaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test39347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39347");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("                                                                                                                                                                                                                                                                     aaaaa0aaaa                     ", "0true-1.0097.00true-1.0097.00true-1.0097.00trA0t...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                     aaaaa0aaaa                     " + "'", str2, "                                                                                                                                                                                                                                                                     aaaaa0aaaa                     ");
    }

    @Test
    public void test39348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39348");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR    A     0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR0TRUE-1.0097.00TRUE-Ahi!hi!hi!haaaaaaaaaaaaaaaaaaaaaaaaaaaa0HI!HI!HI");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR    A     0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR0TRUE-1.0097.00TRUE-Ahi!hi!hi!haaaaaaaaaaaaaaaaaaaaaaaaaaaa0HI!HI!HI" + "'", str1, "0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR    A     0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR0TRUE-1.0097.00TRUE-Ahi!hi!hi!haaaaaaaaaaaaaaaaaaaaaaaaaaaa0HI!HI!HI");
    }

    @Test
    public void test39349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39349");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) ".............................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................79...1-eurt");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test39350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39350");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("Aaaaaaa      a         a         a         a         aaaaaaaa", "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 61 + "'", int2 == 61);
    }

    @Test
    public void test39351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39351");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH", '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH" + "'", str2, "!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH");
    }

    @Test
    public void test39352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39352");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("true-1971");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1791-eurt" + "'", str1, "1791-eurt");
    }

    @Test
    public void test39353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39353");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("    A   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    A    ", 135.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 135.0f + "'", float2 == 135.0f);
    }

    @Test
    public void test39354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39354");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("aaaa0aaaaa", "                            100.0                                                     aaaa", 49);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4);
        boolean boolean6 = org.apache.commons.lang3.StringUtils.startsWithAny("##100.0###", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test39355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39355");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str1, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test39356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39356");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "HI!HI...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI!HI..." + "'", str1, "HI!HI...");
    }

    @Test
    public void test39357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39357");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("", 87, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test39358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39358");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("                                                  0.001                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0.001" + "'", str1, "0.001");
    }

    @Test
    public void test39359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39359");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("                                                                                               100.0", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                               100.0" + "'", str2, "                                                                                               100.0");
    }

    @Test
    public void test39360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39360");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("100.0                                                                                      100.0                                                                                      100.0                                                                                      100.0                                                                                      100.0                                                                                      100.0                                                                                      100.0                                                                                      100.0                                                                                      100.0                                                                                      100.0", "AaaaaaaaaaaaaAaaaaaaaaaaaaAaaaaaaaaaaaa...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "100.0                                                                                      100.0                                                                                      100.0                                                                                      100.0                                                                                      100.0                                                                                      100.0                                                                                      100.0                                                                                      100.0                                                                                      100.0                                                                                      100.0" + "'", str2, "100.0                                                                                      100.0                                                                                      100.0                                                                                      100.0                                                                                      100.0                                                                                      100.0                                                                                      100.0                                                                                      100.0                                                                                      100.0                                                                                      100.0");
    }

    @Test
    public void test39361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39361");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("...0TRUE-1.0097...", 23, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "     ...0TRUE-1.0097..." + "'", str3, "     ...0TRUE-1.0097...");
    }

    @Test
    public void test39362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39362");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) 61, (long) 28, (long) 277);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 277L + "'", long3 == 277L);
    }

    @Test
    public void test39363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39363");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("44444444444", "    a   HI!HI!..");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test39364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39364");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("                                         0true-1.0097.00true-1.0097.00true-1.0097.00tr    A     0true-1.0097.00true-1.0097.00true-1.0097.00tr", (short) (byte) 0);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 0 + "'", short2 == (short) 0);
    }

    @Test
    public void test39365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39365");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("                                      100.0                                                     aaaa100100.0                                                     aaaa.100.0                                                     aaaa0100.0                                                     aaaa                                                ", "4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...444444          ", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test39366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39366");
        double[] doubleArray6 = new double[] { 181.0f, 57L, 4.4444042E9f, 444, 50.0d, 25L };
        double double7 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray6);
        double double8 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray6);
        double double9 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray6);
        double double10 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray6);
        double double11 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[181.0, 57.0, 4.444404224E9, 444.0, 50.0, 25.0]");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 25.0d + "'", double7 == 25.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 25.0d + "'", double8 == 25.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 25.0d + "'", double9 == 25.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 25.0d + "'", double10 == 25.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 4.444404224E9d + "'", double11 == 4.444404224E9d);
    }

    @Test
    public void test39367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39367");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("44444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT04444444444444444444444444444444444444444444", 21);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "444444444444444444444" + "'", str2, "444444444444444444444");
    }

    @Test
    public void test39368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39368");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("...44444...true-1.4444444...97.4444444...444444...44444...true-1.4444444...97.4444444...4444444", '4');
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.split("                     aaaa0aaaaa    ", "0true-1.0097.00true-1.0097.00true-1.0097.00tr A ");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("aaaaa 44444", strArray3, strArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 52 vs 2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test39369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39369");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfBlank("", "4                     aaaa0aaaaa                                          aaaa0aaaaa                                          aaaa0aaaaa       ...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4                     aaaa0aaaaa                                          aaaa0aaaaa                                          aaaa0aaaaa       ..." + "'", str2, "4                     aaaa0aaaaa                                          aaaa0aaaaa                                          aaaa0aaaaa       ...");
    }

    @Test
    public void test39370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39370");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("                                                                                            4444444444444444444444444444440ta4444444444444444444444444444440t    4444444444444444444444444444440t44", "...         aaaa0aaaaaTRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.0", 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test39371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39371");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad(".001                                                                                                                                                                                                                                                                                                                                                                                                                                           444440true-1.0097...4                                                                                                                                                                                                                                                                                                                                                                                                              ", 20, "                                                                                                                                                                                            ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ".001                                                                                                                                                                                                                                                                                                                                                                                                                                           444440true-1.0097...4                                                                                                                                                                                                                                                                                                                                                                                                              " + "'", str3, ".001                                                                                                                                                                                                                                                                                                                                                                                                                                           444440true-1.0097...4                                                                                                                                                                                                                                                                                                                                                                                                              ");
    }

    @Test
    public void test39372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39372");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("          TRUE  ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test39373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39373");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi!hi!hi!hi0true-1.0097.00true-1.0097.00true-1.0097.00trA0t...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi!hi!hi!hi0true-1.0097.00true-1.0097.00true-1.0097.00trA0t...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test39374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39374");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("                         AAAAAAAAAAAAAA", "rt00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt0     a    rt00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt0");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test39375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39375");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "444                                                   ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test39376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39376");
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
        java.lang.String str24 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray5, "aaa");
        java.lang.String[] strArray26 = org.apache.commons.lang3.StringUtils.stripAll(strArray5, "");
        java.lang.String str27 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray26);
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
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
    }

    @Test
    public void test39377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39377");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("44444444444444444444444A444444444444444444444444");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test39378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39378");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) '#', (double) 101, (double) 135.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 35.0d + "'", double3 == 35.0d);
    }

    @Test
    public void test39379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39379");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("a HI!HI!HI!HI!HI!HI!HI!HI!HI!HI... a               ", 660, "                                     ...                                                     4444444444444444444444444 true - 1 . 97 . 44444444444444444444444444444444444444444444444444444444444444444444444444444444444444 true - 1 . 97 . 44444444444444444444444444444444444444444444444444444444444444444444444444444444444444 true - 1 . 97 . 4444444444444444444444444444444444444444444974444444444444444444444444444444444444444444 true - 1 . 97 . 44444444444444444444444444444444444444444444444444444444444444444444444444444444444444 true - 1 . 97 . 4444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                     ...                                                     4444444444444444444444444 true - 1 . 97 . 44444444444444444444444444444444444444444444444444444444444444444444444444444444444444 true - 1 . 97 . 44444444444444444444444444444444444444444444444444444444444444444444444444444444444444 true - 1 . 97 . 4444444444444444444444444444444444444444444974444444444444444444444444444444444444444444 true - 1 . 97 . 44444444444444444444444444444444444444444444444444444444444444444444444444444444444444 true - 1 . 97 . 4444444444444444444444444444444444444444444                 a HI!HI!HI!HI!HI!HI!HI!HI!HI!HI... a               " + "'", str3, "                                     ...                                                     4444444444444444444444444 true - 1 . 97 . 44444444444444444444444444444444444444444444444444444444444444444444444444444444444444 true - 1 . 97 . 44444444444444444444444444444444444444444444444444444444444444444444444444444444444444 true - 1 . 97 . 4444444444444444444444444444444444444444444974444444444444444444444444444444444444444444 true - 1 . 97 . 44444444444444444444444444444444444444444444444444444444444444444444444444444444444444 true - 1 . 97 . 4444444444444444444444444444444444444444444                 a HI!HI!HI!HI!HI!HI!HI!HI!HI!HI... a               ");
    }

    @Test
    public void test39380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39380");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("... aaaa0aaaaa##################################################################################################################################################################################################################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "... AAAA0AAAAA##################################################################################################################################################################################################################" + "'", str1, "... AAAA0AAAAA##################################################################################################################################################################################################################");
    }

    @Test
    public void test39381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39381");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                 A A A A A");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test39382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39382");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("44444444444444444444444444444444444444444440true-1.0097. A 44444444444444444440true-1.0097. A 4444444444444444444444444444444444444444444440true-1.0097. A 4444444444444444444444444444444444444444444440true-1.0097. A 4444444444444444444444444444444444444444444440true-1.0097. A 4444444444444444444444444444444444444444444440true-1.0097. A 4444444444444444444444444444444444444444444440true-1.0097. A 4444444444444444444444444444444444444444444440true-1.0097. A 4444444444444444444444444444444444444444444440true-1.0097. A 444444444444444444444444444444444444444444444", "A A ###################################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44444444444444444444444444444444444444444440true-1.0097. A 44444444444444444440true-1.0097. A 4444444444444444444444444444444444444444444440true-1.0097. A 4444444444444444444444444444444444444444444440true-1.0097. A 4444444444444444444444444444444444444444444440true-1.0097. A 4444444444444444444444444444444444444444444440true-1.0097. A 4444444444444444444444444444444444444444444440true-1.0097. A 4444444444444444444444444444444444444444444440true-1.0097. A 4444444444444444444444444444444444444444444440true-1.0097. A 444444444444444444444444444444444444444444444" + "'", str2, "44444444444444444444444444444444444444444440true-1.0097. A 44444444444444444440true-1.0097. A 4444444444444444444444444444444444444444444440true-1.0097. A 4444444444444444444444444444444444444444444440true-1.0097. A 4444444444444444444444444444444444444444444440true-1.0097. A 4444444444444444444444444444444444444444444440true-1.0097. A 4444444444444444444444444444444444444444444440true-1.0097. A 4444444444444444444444444444444444444444444440true-1.0097. A 4444444444444444444444444444444444444444444440true-1.0097. A 444444444444444444444444444444444444444444444");
    }

    @Test
    public void test39383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39383");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("4444444444444444444444444444444444444444444                                                                                true-1.                                                                                97", ".1-EURT00.7900.1-EURT");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test39384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39384");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("...                                                     aaaaaaaaaaaaaaaaaaaaaaaaaa", "                  4                   0true-1.0097.04444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test39385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39385");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("4444...44444                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                ", "    A         A                                                     100.0    A         A     ...");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test39386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39386");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("4444444...");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "##100.0###");
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray5, "                        ");
        java.lang.String[] strArray11 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("A         A                                  ", "...44444444444444444444444444444444440true-1.0097...");
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny("", strArray11);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...", strArray5, strArray11);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.endsWithAny("                                                                                                                                                                                                                             #0true-1.0097.0##########################################0true-1.0097.0############################                                                                                                                                                                                                                              ", strArray11);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "4444444" + "'", str7, "4444444");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi..." + "'", str13, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test39387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39387");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("Hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi", "...00true-1.0097.00true-1.0097.00tr", 9);
        java.lang.Class<?> wildcardClass4 = strArray3.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test39388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39388");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("100.", 463, 243);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test39389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39389");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("aaaaaa                                                                ...44444", 120);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                          aaaaaa                                                                ...44444" + "'", str2, "                                          aaaaaa                                                                ...44444");
    }

    @Test
    public void test39390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39390");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min(99L, (long) 92, (long) 451);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 92L + "'", long3 == 92L);
    }

    @Test
    public void test39391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39391");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!Hi!hi!hi!hi!hTRUETRUE", 53, "Ahi!hi!hi!haaaaaaaaaaaaaaA44444aaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!Hi!hi!hi!hi!hTRUETRUE" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!Hi!hi!hi!hi!hTRUETRUE");
    }

    @Test
    public void test39392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39392");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test39393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39393");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "aaaaa0aaaa0.7900.1-eurt04444444444444444...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test39394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39394");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("A   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    A");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test39395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39395");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444AAAA", "100.0                                                                                      100.0                                                                                      100.0                                            ...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444AAAA" + "'", str2, "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444AAAA");
    }

    @Test
    public void test39396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39396");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("                                                                                                                                                                                           ", "aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test39397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39397");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("###################################################44444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "44444444444444444444444###################################################" + "'", str1, "44444444444444444444444###################################################");
    }

    @Test
    public void test39398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39398");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("###############################################################################################################################################################################################################################                                                                                                                                                                        ###############################################################################################################################################################################################################################", "AAAAAAAAAAAA0TRUE-1.0097.     A    AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA0TRUE-1.0097.     A    AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA0TRUE-1.0097.     A    AAAAAAAAAAAAAAAAAAAAAA", 31);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test39399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39399");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("      a         a         a         a         a                                                                                                                                      ", "!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test39400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39400");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str1, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test39401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39401");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("4444444...", "44444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444", 10);
        java.lang.String[] strArray5 = null;
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.replaceEach("97atrue-1.", strArray4, strArray5);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "97atrue-1." + "'", str6, "97atrue-1.");
    }

    @Test
    public void test39402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39402");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444#44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444#44444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444", '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444#44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444#44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444" + "'", str2, "44444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444#44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444#44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444");
    }

    @Test
    public void test39403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39403");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                0TRUE-1.0097.044444444444444444444444444..", (short) 0);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 0 + "'", short2 == (short) 0);
    }

    @Test
    public void test39404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39404");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens(" true-1.  97. ", '#');
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("aaaa0aaaaa", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", 0);
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.stripAll(strArray8);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray9);
        java.lang.String[] strArray11 = org.apache.commons.lang3.StringUtils.stripAll(strArray9);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.replaceEach("4a4444444444444444444444...4444444444444444444444444444444444444444444444", strArray4, strArray9);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.startsWithAny("...44444...TRUE-1.4444444...97.4444444...4444444444444...", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "aaaa0aaaaa" + "'", str10, "aaaa0aaaaa");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "4a4444444444444444444444...4444444444444444444444444444444444444444444444" + "'", str12, "4a4444444444444444444444...4444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test39405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39405");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("TRUETRUE                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       ", "                                                                                                                                                                                                                                                                                                                                                                                                                     44444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "TRUETRUE                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       " + "'", str2, "TRUETRUE                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       ");
    }

    @Test
    public void test39406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39406");
        char[] charArray11 = new char[] { '4', '4', ' ' };
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "0", charArray11);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444", charArray11);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "    A     ", charArray11);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsAny("0aaaa", charArray11);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "                 ...                                                     ", charArray11);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsAny("I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H", charArray11);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "     A44444      Aaaaaaaaaaa4444444...4444444...4444444...4", charArray11);
        boolean boolean19 = org.apache.commons.lang3.StringUtils.containsAny("44444444444                                                                                                 44444444444", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "44 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "44 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[4, 4,  ]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test39407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39407");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "...44444...true-1.4444444...97.4444444...444444...44444...true-1.4444444...97.4444444...4444444", (java.lang.CharSequence) "                                           ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test39408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39408");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) (byte) 1, (short) 0, (short) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test39409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39409");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "0                     ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test39410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39410");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("                                                               !hi!hi!hi!hi!hi!hi!hi!hi!hi...    A    ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message:                                                                !hi!hi!hi!hi!hi!hi!hi!hi!hi...    A     is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test39411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39411");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) 94, (long) 97, (long) 48);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 48L + "'", long3 == 48L);
    }

    @Test
    public void test39412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39412");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("true-1. 97. 444444444444444444444444444444444444444444 true-1. 97. 44444444444444444444444444", "        a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       4444444444444444444444444444444444444444444...4444444.79...4444444.1-EURT...44444444444444444444444444444444444444444444444444       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test39413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39413");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("44444444444444444444444444444444444444444440true-1.0097.  a    44444444444444444440true-1.0097.     a    4444444444444444444444444444444444444444444440true-1.0097.     a    4444444444444444444444444444444444444444444440true-1.0097.     a    4444444444444444444444444444444444444444444440true-1.0097.     a    4444444444444444444444444444444444444444444440true-1.0097.     a    4444444444444444444444444444444444444444444440true-1.0097.     a    4444444444444444444444444444444444444444444440true-1.0097.     a    4444444444444444444444444444444444444444444440true-1.0097.     a    4444444444444444444444444444444444444444444440true-1.0097                 ...                                                     ", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test39414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39414");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "79  .1-eurt 444444440 true - 1 . 44444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test39415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39415");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI44444444444444444444444444444444444444444444true-1.497.44444444444444444444444444444444444444444444 ");
        boolean boolean3 = org.apache.commons.lang3.StringUtils.startsWithAny("0aaaa                                                                                                                                                                                                                                                                     0aaaa                                                                                                                                                                                                                                                                     0", strArray2);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray2);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI44444444444444444444444444444444444444444444true-1.497.44444444444444444444444444444444444444444444 " + "'", str4, "I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI44444444444444444444444444444444444444444444true-1.497.44444444444444444444444444444444444444444444 ");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test39416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39416");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "                                         ...      444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test39417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39417");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("Ahi!hi!hi!haaaaaaaaaaaaaaaaaaaaaaaaaaaa", '4');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test39418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39418");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444...44444...true-1.4444444...97.4444444...4444444444444...                  4                       ", "                                                                                                                                                                                                                                                                                                                                                                                                                     44444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444...44444...true-1.4444444...97.4444444...4444444444444...                  4                       " + "'", str2, "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444...44444...true-1.4444444...97.4444444...4444444444444...                  4                       ");
    }

    @Test
    public void test39419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39419");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR    A     0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR0TRUE-1.0097.00TRUE-Ahi!hi!hi!haaaaaaaaaaaaaaaaaaaaaaaaaaaa0HI!HI!HI", (java.lang.CharSequence) "a    44");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR    A     0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR0TRUE-1.0097.00TRUE-Ahi!hi!hi!haaaaaaaaaaaaaaaaaaaaaaaaaaaa0HI!HI!HI" + "'", charSequence2, "0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR    A     0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR0TRUE-1.0097.00TRUE-Ahi!hi!hi!haaaaaaaaaaaaaaaaaaaaaaaaaaaa0HI!HI!HI");
    }

    @Test
    public void test39420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39420");
        float[] floatArray4 = new float[] { 100, (byte) -1, (short) 1, (byte) -1 };
        float float5 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        float float6 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        float float7 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        float float8 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        float float9 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        float float10 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        float float11 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        float float12 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        float float13 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        float float14 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        float float15 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        float float16 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        float float17 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        float float18 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
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
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + (-1.0f) + "'", float13 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 100.0f + "'", float14 == 100.0f);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 100.0f + "'", float15 == 100.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 100.0f + "'", float16 == 100.0f);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + (-1.0f) + "'", float17 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 100.0f + "'", float18 == 100.0f);
    }

    @Test
    public void test39421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39421");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("Hi!hi!hi!haaaaaaaaaaaaaaaaaaaaaaaaaaaa 0TRUE-1.00-1.0097.0444444444444444444444444444444...");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"Hi!hi!hi!haaaaaaaaaaaaaaaaaaaaaaaaaaaa 0TRUE-1.00-1.0097.0444444444444444444444444444444...\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test39422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39422");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("########################################################################################################################################################################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "########################################################################################################################################################################" + "'", str1, "########################################################################################################################################################################");
    }

    @Test
    public void test39423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39423");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(614, 750, 557);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 750 + "'", int3 == 750);
    }

    @Test
    public void test39424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39424");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("100.0 0true-1.0097.00true-1.0097.00true-1.0097.00tr4444A444440true-1.0097.00true-1.0097.00true-1.0097.00t 100.0 100.0 100.0", "444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "100.0 0true-1.0097.00true-1.0097.00true-1.0097.00tr4444A444440true-1.0097.00true-1.0097.00true-1.0097.00t 100.0 100.0 100.0" + "'", str2, "100.0 0true-1.0097.00true-1.0097.00true-1.0097.00tr4444A444440true-1.0097.00true-1.0097.00true-1.0097.00t 100.0 100.0 100.0");
    }

    @Test
    public void test39425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39425");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                       a HI!HI!HI!HI!HI!HI!HI!HI!HI!HI... a   ", "100.0                                                     aaaa0true-1.0097.044444444444444444444444", 58);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, '#');
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray3);
        int int7 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#########################################HI!HI!HI!HI!HI!HI!HI!HI!HI!HI########" + "'", str5, "#########################################HI!HI!HI!HI!HI!HI!HI!HI!HI!HI########");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test39426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39426");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("                                                                                           ", "aaa   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa               aa                                       ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test39427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39427");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("                                       A         A         A  A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A!hi!h!hi!h", 78);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test39428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39428");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("4444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa444", 116);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444" + "'", str3, "4444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444");
    }

    @Test
    public void test39429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39429");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("..                          ...", "97..######################################97atrue-1.#########################################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "..                          ..." + "'", str2, "..                          ...");
    }

    @Test
    public void test39430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39430");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("aa..");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test39431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39431");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("0true-1.0097...444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444100.0", "...4...4444444...4444444...4444444                                                                                                                          0");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2);
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "true-1971" + "'", str3, "true-1971");
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test39432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39432");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("a   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    AA   hi!hi!hi!hi!0true-1 0097 044444444444444444444444444 4", (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test39433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39433");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("aaaaaaaaaaa00       000       000       00aaaaaaaaaaaa00       000       000       00aaaaaaaaaaaa00       000       000       00aaaaaaaaaaaa00       000       000       00aaaaaaaaaaaa00       000       000       00aaaaaaaaaaaa00       000       000       00aaaaaaaaaaaa00       000       000       00aaaaaaaaaaaa00       000       000       00aaaaaaaaaaaa00       000       000       00aaaaaaaaaaaa", "                                                          ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaa00       000       000       00aaaaaaaaaaaa00       000       000       00aaaaaaaaaaaa00       000       000       00aaaaaaaaaaaa00       000       000       00aaaaaaaaaaaa00       000       000       00aaaaaaaaaaaa00       000       000       00aaaaaaaaaaaa00       000       000       00aaaaaaaaaaaa00       000       000       00aaaaaaaaaaaa00       000       000       00aaaaaaaaaaaa" + "'", str2, "aaaaaaaaaaa00       000       000       00aaaaaaaaaaaa00       000       000       00aaaaaaaaaaaa00       000       000       00aaaaaaaaaaaa00       000       000       00aaaaaaaaaaaa00       000       000       00aaaaaaaaaaaa00       000       000       00aaaaaaaaaaaa00       000       000       00aaaaaaaaaaaa00       000       000       00aaaaaaaaaaaa00       000       000       00aaaaaaaaaaaa");
    }

    @Test
    public void test39434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39434");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("00       0true00       0-00       000                                                       ", "4444444...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA0h!ih!h!ih!.h!ih!h!ih!0010h!ih!h!ih!.h!ih!h!ih!0h!ih!h!ih!hi4444444...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA0h!ih!h!ih!.h!ih!h!ih!0010h!ih!h!ih!.h!ih!h!ih!0h!ih!h!ih!hi4444444...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA0h!ih!h!ih!.h!ih!h!ih!0010h!ih!h!ih!.h!ih!h!ih!0h!ih!h!ih!hi4444444...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test39435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39435");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("4444444..444444444444444440T");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4444444..444444444444444440T" + "'", str1, "4444444..444444444444444440T");
    }

    @Test
    public void test39436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39436");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("AE444444444444444444444", '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AE444444444444444444444" + "'", str2, "AE444444444444444444444");
    }

    @Test
    public void test39437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39437");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("", 842, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "##########################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################" + "'", str3, "##########################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################");
    }

    @Test
    public void test39438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39438");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("aaaaaaaaaaaaaaaaaa40true-1.0097.     A    40true-1.0097.     A    40true-1.0097.  A    4aaaaaaa444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444                       a4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test39439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39439");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("44444444444444444444444444444444444444444444444444...true-1.4444444...97.4444444...444444444444444444444444444444444444444444", 578, "444444444444.");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "444444444444.444444444444.444444444444.444444444444.444444444444.444444444444.444444444444.444444444444.444444444444.444444444444.444444444444.444444444444.444444444444.444444444444.444444444444.444444444444.444444444444.444444444444.444444444444.444444444444.444444444444.444444444444.444444444444.444444444444.444444444444.444444444444.444444444444.444444444444.444444444444.444444444444.444444444444.444444444444.444444444444.444444444444.4444444444444444444444444444444444444444444444444444444444444...true-1.4444444...97.4444444...444444444444444444444444444444444444444444" + "'", str3, "444444444444.444444444444.444444444444.444444444444.444444444444.444444444444.444444444444.444444444444.444444444444.444444444444.444444444444.444444444444.444444444444.444444444444.444444444444.444444444444.444444444444.444444444444.444444444444.444444444444.444444444444.444444444444.444444444444.444444444444.444444444444.444444444444.444444444444.444444444444.444444444444.444444444444.444444444444.444444444444.444444444444.444444444444.4444444444444444444444444444444444444444444444444444444444444...true-1.4444444...97.4444444...444444444444444444444444444444444444444444");
    }

    @Test
    public void test39440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39440");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(125L, (long) 479, 182L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 479L + "'", long3 == 479L);
    }

    @Test
    public void test39441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39441");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("0444", 259);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0444" + "'", str2, "0444");
    }

    @Test
    public void test39442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39442");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("0AAAA A 0AAAA", 234);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test39443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39443");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("0atruea-a1a.a0097a.a0", "0444444444...4444444444........444444444444444444.444444444...4444444444........4444444444444444440010444444444...4444444444........444444444444444444.444444444...4444444444........4444444444444444440444444444...4444444444........444444444444444444hi");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test39444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39444");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("A44444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444", "ue-144444444444444444444444444444444########################################################################################1444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test39445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39445");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("4444444440097...#############################################################################################4444444440097...#############################################################################################4444444440097...#############################################################################################4444444440097...#############################################################################################4444444440097...#############################################################################################4444444440097...#############################################################################################4444444440097...#############################################################################################4444444440097...#############################################################################################4444444440097...#################################a HI!HI!HI!HI!HI!HI!HI!HI!HI!HI... a");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4444444440097...#############################################################################################4444444440097...#############################################################################################4444444440097...#############################################################################################4444444440097...#############################################################################################4444444440097...#############################################################################################4444444440097...#############################################################################################4444444440097...#############################################################################################4444444440097...#############################################################################################4444444440097...#################################a HI!HI!HI!HI!HI!HI!HI!HI!HI!HI... a" + "'", str1, "4444444440097...#############################################################################################4444444440097...#############################################################################################4444444440097...#############################################################################################4444444440097...#############################################################################################4444444440097...#############################################################################################4444444440097...#############################################################################################4444444440097...#############################################################################################4444444440097...#############################################################################################4444444440097...#################################a HI!HI!HI!HI!HI!HI!HI!HI!HI!HI... a");
    }

    @Test
    public void test39446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39446");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("a A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A aaaaaaaaaaaaaaaaaaaa00 0true00 0-00 000 000 09700 000 0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"a A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A aaaaaaaaaaaaaaaaaaaa00 0true00 0-00 000 000 09700 000 0\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test39447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39447");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("444...4444Aaaaaaaaa", "4444444...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test39448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39448");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("    A         A                                                     100.0    A         A         ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "A         A                                                     100.0    A         A" + "'", str1, "A         A                                                     100.0    A         A");
    }

    @Test
    public void test39449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39449");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("A44444444444444444444444444444444444444444444444444444444444444444444444444444444444444", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test39450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39450");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("4                                                 100.0                                                                             aaaa0aaaaa       ...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4                                                 100.0                                                                             aaaa0aaaaa       ..." + "'", str1, "4                                                 100.0                                                                             aaaa0aaaaa       ...");
    }

    @Test
    public void test39451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39451");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("                     aaaa0aaaaa                     ...I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!                     aaaa0aaaaa                     ...I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!                     aaaa0aaaaa                     ...I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!                     aaaa0aaaaa                     ...I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!                     aaaa0aaaaa                     ...I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!                     aaaa0aaaaa                     ...I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!                     aaaa0aaaaa                     ...I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!                     aaaa0aaaaa                     ...I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!                     aaaa0aaaaa         A         A", "aaaa0aaaaa                                             aaaa0a                                                                                                                                                                                                                                                                                       ", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                     aaaa0aaaaa                     ...I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!                     aaaa0aaaaa                     ...I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!                     aaaa0aaaaa                     ...I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!                     aaaa0aaaaa                     ...I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!                     aaaa0aaaaa                     ...I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!                     aaaa0aaaaa                     ...I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!                     aaaa0aaaaa                     ...I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!                     aaaa0aaaaa                     ...I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!                     aaaa0aaaaa         A         A" + "'", str3, "                     aaaa0aaaaa                     ...I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!                     aaaa0aaaaa                     ...I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!                     aaaa0aaaaa                     ...I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!                     aaaa0aaaaa                     ...I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!                     aaaa0aaaaa                     ...I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!                     aaaa0aaaaa                     ...I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!                     aaaa0aaaaa                     ...I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!                     aaaa0aaaaa                     ...I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!                     aaaa0aaaaa         A         A");
    }

    @Test
    public void test39452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39452");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("100.0                                                                                      100.0                                                                                      100.0                                                                                      100.0                                                                                      100.0                                                                                      100.0                                                                                      1...", 721);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "100.0                                                                                      100.0                                                                                      100.0                                                                                      100.0                                                                                      100.0                                                                                      100.0                                                                                      1..." + "'", str2, "100.0                                                                                      100.0                                                                                      100.0                                                                                      100.0                                                                                      100.0                                                                                      100.0                                                                                      1...");
    }

    @Test
    public void test39453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39453");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("                                      hI!HI!HI!HI!HI!HI!HI!HI!HI!HI");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hI!HI!HI!HI!HI!HI!HI!HI!HI!HI" + "'", str1, "hI!HI!HI!HI!HI!HI!HI!HI!HI!HI");
    }

    @Test
    public void test39454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39454");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 87, "    A   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    A    ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "    A   HI!HI!HI!HI!HI!HI!HI!HIaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "    A   HI!HI!HI!HI!HI!HI!HI!HIaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test39455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39455");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase(" true 1.  97.", "                 ...                                                     AAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test39456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39456");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("aA44444A44a44444aA44444A44a44444aA44444A44a44444aA44444A44a44444aA44444A44a44444aA44444A44a44444aA44444A44a44444aA44444A44a44444aA44444A44a44444aA44444A44a44444aA44444A44a44444aA44444A44a44444aA44444A44a44444aA44444A44a44444aA44444A44a44444aA44444A44a44444aA44444A44a44444aA44444A44a44444aA44444A44a44444aA44444A44aAAAAAA4440true-1.0097.0AAAAAA4#AAAAAA40true-1.0097.0AAAAAA4#AAAAAA40true-1.0097.0AAAAAA");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: aA44444A44a44444aA44444A44a44444aA44444A44a44444aA44444A44a44444aA44444A44a44444aA44444A44a44444aA44444A44a44444aA44444A44a44444aA44444A44a44444aA44444A44a44444aA44444A44a44444aA44444A44a44444aA44444A44a44444aA44444A44a44444aA44444A44a44444aA44444A44a44444aA44444A44a44444aA44444A44a44444aA44444A44a44444aA44444A44aAAAAAA4440true-1.0097.0AAAAAA4#AAAAAA40true-1.0097.0AAAAAA4#AAAAAA40true-1.0097.0AAAAAA is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test39457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39457");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("a0aaaaa                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          ", "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test39458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39458");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("#a#44444444444444444444#...#444444444444444444444444444444444444444444444", (byte) -1);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) -1 + "'", byte2 == (byte) -1);
    }

    @Test
    public void test39459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39459");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("00       000       000       00", 651);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                                      00       000       000       00                                                                                                                                                                                                                                                                                                                      " + "'", str2, "                                                                                                                                                                                                                                                                                                                      00       000       000       00                                                                                                                                                                                                                                                                                                                      ");
    }

    @Test
    public void test39460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39460");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("true-1....97true-1....97", 615);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                       true-1....97true-1....97                                                                                                                                                                                                                                                                                                        " + "'", str2, "                                                                                                                                                                                                                                                                                                       true-1....97true-1....97                                                                                                                                                                                                                                                                                                        ");
    }

    @Test
    public void test39461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39461");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("...444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444...444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444...44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", 534);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444...444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444...444444444444444444444444444444444444444444444" + "'", str2, "...444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444...444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444...444444444444444444444444444444444444444444444");
    }

    @Test
    public void test39462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39462");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("!", "444440true-1.0097...4444440true-1.0097...4444440444444444444444444444444444444440true-1.0097...4444440true-1.0097...4444440");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "444440true-1.0097...4444440true-1.0097...4444440444444444444444444444444444444440true-1.0097...4444440true-1.0097...4444440" + "'", str2, "444440true-1.0097...4444440true-1.0097...4444440444444444444444444444444444444440true-1.0097...4444440true-1.0097...4444440");
    }

    @Test
    public void test39463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39463");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByCharacterType("aaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaa");
        int int4 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("4444444", strArray3);
        int int5 = org.apache.commons.lang3.StringUtils.indexOfAny("...44444444444444444444444444444444440true-    A     ...44444444444444444444444444444444440true-", strArray3);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "7.00true-1.0097.00true-1.0097.00tr    A     0true-1.0097.00true-1.0097.00true-1.0097.00tr", 216, 123);
        java.lang.String[] strArray11 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "...444444444444444444444440TRUE-1 0097 ");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 6 + "'", int4 == 6);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(strArray11);
    }

    @Test
    public void test39464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39464");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1.00..", 670);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test39465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39465");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 250L, (float) 97L, (float) 50);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 250.0f + "'", float3 == 250.0f);
    }

    @Test
    public void test39466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39466");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.00...", "    a    ...IH!IH!IH!IH!IH!IH!IH!IH!IH!IH   a    ");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test39467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39467");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("                                      100.0I!4I!4I!4I!4I!4I!4I!4I!4I!4I!4I!4I!4I!4I!4I!4I444444444444444444444444444444", "A HI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              ", 60);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test39468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39468");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("0TRUE-1.0097.04aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0TRUE-1.0097.04aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444" + "'", str1, "0TRUE-1.0097.04aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444");
    }

    @Test
    public void test39469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39469");
        java.lang.String[] strArray1 = null;
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("0       00aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("114", strArray1, strArray3);
        java.lang.Class<?> wildcardClass5 = strArray3.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "114" + "'", str4, "114");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test39470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39470");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("0true-1.0097.044444444444444444444444444 40true-1.0097.044444444444444444444444444 40true-1.0097.044444444444444444444444444 40true-1.0097.044444444444444444444444444 40true-1.0097.044444444444444444444444444 40true-1.0097.044444444444444444444444444 40true-1.0097.044444444444444444444444444 40true-1.0097.044444444444444444444444444 40true-1.0097.044444444444444444444444444 40true-1.0097.044444444444444444444444444 40true-1.0097.044444444444444444444444444 40true-1.0097.0444444444444444444!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!", "a444444444444444444444444...44444444444444444444444444444444440true-1.009...44444...true-1.4444444...97.4444444...4444444444444...4a444444444444444444444444...44444444444444444444444444444444440true-1.0097");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 40 + "'", int2 == 40);
    }

    @Test
    public void test39471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39471");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444400       0true00       0-00       000       000       09700       000       04444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "a     0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRhi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hh", 658);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test39472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39472");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("###################################    a   HI!HI!...", "                                                                                                                                                                                               ");
        int int4 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("aaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaa", strArray3);
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "             44444AAAA0AAAAAAAAA0AAAAAAAAA0AAA...0...                                                                                                                                                                                   hI!                                                                                                                                                                                                                                                                                                                                                                                                                               ");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test39473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39473");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) 76, (long) 253, 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test39474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39474");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("                                                     0.001                            A      A  ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test39475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39475");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("                   AAAAAAAAAA                    ", "0true-1.0097.00true-1.0097.00true-1.0097.00trHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HH 0true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.0");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test39476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39476");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("...aaaaaaaaaaaaaaaaaaaaaaaaa                                 ", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                                                                                   ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test39477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39477");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaA    ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih   Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test39478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39478");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("4444444444444444444444444444444true-1.97.44444444444444444444444444444444444444444444                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ", "    A   HI!HI!HI!HI!HI!HI!HI!HIaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test39479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39479");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("0TRUE...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0TRUE..." + "'", str1, "0TRUE...");
    }

    @Test
    public void test39480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39480");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("", "                                                                                                                                                                                                                                           ...A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A...");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test39481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39481");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("4444444444444444444444444444444444444444444true-1.97.4444444444444444444444444444444444444444444", "                                                                                                                                                                                                                                                                                                                                            HI!                                                                                                                                                                                                                                                                                                                                            ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test39482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39482");
        char[] charArray10 = new char[] { ' ', '4', 'a', 'a', 'a' };
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "100.0", charArray10);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray10);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "44444444444444444444444444444444444444444444true-1.497.44444444444444444444444444444444444444444444", charArray10);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) " true-1.  97. ", charArray10);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsAny("0atruea-a1a.a00aaaa4444444444444", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), " 4aaa");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), " 4aaa");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[ , 4, a, a, a]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 44 + "'", int13 == 44);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test39483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39483");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "44...7900.1-eurt04444444444444444444444444444444444...444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test39484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39484");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("...1-eurt00.7900.1-eurt");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test39485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39485");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("                                                                                                                                                    4                                                 100.0                                                                             aaaa0aaaaa       ...                                                                                                                                                     ");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test39486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39486");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) 141, (long) 554, 744L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 744L + "'", long3 == 744L);
    }

    @Test
    public void test39487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39487");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("ahi!hi!...", "AAAAAAA...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test39488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39488");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("A   0  00                                                                                                     ", "                       a44444444444444444444...444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "A   0  00                                                                                                     " + "'", str2, "A   0  00                                                                                                     ");
    }

    @Test
    public void test39489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39489");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "rue-1.0097.00true-1.0097.0");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test39490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39490");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("", "ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!0097      a   HI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAA       ...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test39491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39491");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("###########################################################################################################################################################################################################################00.1-eurt0");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "###########################################################################################################################################################################################################################00.1-eurt0" + "'", str1, "###########################################################################################################################################################################################################################00.1-eurt0");
    }

    @Test
    public void test39492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39492");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("44444444444444444444444444444444", "0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0", (int) (byte) -1);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test39493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39493");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("4444444444444444444444444444444444444444444true-1.97.44444444444444444444444444444444444444444444                           ...");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test39494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39494");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 31, (float) 28, 42.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 42.0f + "'", float3 == 42.0f);
    }

    @Test
    public void test39495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39495");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("0AAA");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test39496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39496");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) 0, (short) 100, (short) (byte) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test39497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39497");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("4444444...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!", "Rue-1.0097.0");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test39498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39498");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("...    0true-1.0097.00true-1.0097.00true-1.0097.00tr", "                                                                                100.0#####100.0###");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...    0true-1.0097.00true-1.0097.00true-1.0097.00tr" + "'", str2, "...    0true-1.0097.00true-1.0097.00true-1.0097.00tr");
    }

    @Test
    public void test39499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39499");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("                                                                                     a A 1000 A A                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ", "#######################################################################################################################################################################4 0true-1.0097.04444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test39500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39500");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!" };
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.stripAll(strArray6);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray7);
        java.lang.String[] strArray12 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("4444444...", "a", (int) '4');
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444", strArray7, strArray12);
        java.lang.String[] strArray15 = org.apache.commons.lang3.StringUtils.stripAll(strArray7, "44444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444");
        boolean boolean16 = org.apache.commons.lang3.StringUtils.endsWithAny("                                      100.0                                                      ", strArray7);
        java.lang.String[] strArray19 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("4444444...");
        java.lang.String[] strArray21 = org.apache.commons.lang3.StringUtils.stripAll(strArray19, "##100.0###");
        java.lang.String[] strArray22 = org.apache.commons.lang3.StringUtils.stripAll(strArray21);
        boolean boolean23 = org.apache.commons.lang3.StringUtils.endsWithAny(" A rt00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt0", strArray21);
        java.lang.String str24 = org.apache.commons.lang3.StringUtils.replaceEach("4", strArray7, strArray21);
        java.lang.String[] strArray27 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("A     0true-1.0097.00true-1.0097.00true-1.0097.00tr", "444...44444444444444444444444444444444440TRUE-1.0097...44");
        java.lang.String str28 = org.apache.commons.lang3.StringUtils.replaceEach("hihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihi", strArray7, strArray27);
        boolean boolean29 = org.apache.commons.lang3.StringUtils.startsWithAny("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444444444...                            ", strArray7);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444" + "'", str13, "44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444");
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "4" + "'", str24, "4");
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihi" + "'", str28, "hihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihi");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }
}

