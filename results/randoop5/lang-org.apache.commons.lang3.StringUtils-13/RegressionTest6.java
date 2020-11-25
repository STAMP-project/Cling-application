import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest6 {

    public static boolean debug = false;

    @Test
    public void test3001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3001");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "14001aaaaaaa", "-1.0   aaaaaaa10040.");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test3002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3002");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("aaaaaaahi!444444444444444444444444444444444444444444", 51);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4" + "'", str2, "4");
    }

    @Test
    public void test3003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3003");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("AAAA10041", "HI!ihaaaaaa                                      aaaaaaahi!HI!ihaaaaaa                                      aaaaaaahi!HI!ihaaaaaa                                      aaaaaaahi!HI!ihaaaaaa                                      aaaaaaahi!HI!ihaaaaaa                                      aaaaaaahi!HI!ihaaaaaa                                      aaaaaaahi!HI!ihaaaaaa                                      aaaaaaahi!HI!ihaaaaaa                                      aaaaaaahi!HI!ihaaaaaa                                      aaaaaaahi!HI", "                                   ");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test3004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3004");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("                                                                    ", "1.0     0.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test3005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3005");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("                                                                                                    ", "1.0  0.0 ", 4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3006");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("#############################################0.0     0.1-                                        ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "#############################################0.0     0.1-                                        " + "'", str1, "#############################################0.0     0.1-                                        ");
    }

    @Test
    public void test3007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3007");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("", "   aaaaaaa1004   aaaaaaa1004   aaaaaaa1004   aaaaaaa1004   aaaaaaa1004   aaaaaaa1004   aaaaaaa1004   aaaaaaa1004   aaaaaaa1004   aaaaaaa1004   aaaaaaa1004   aaaaaaa1004   aaaaaaa1004", (int) ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test3008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3008");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("AAAAAAA", "-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 ", "aaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaah100");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "AAAAAAA" + "'", str3, "AAAAAAA");
    }

    @Test
    public void test3009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3009");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("-1.0   AAAAAAA10040.", "1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3010");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "                                        -1.0     0.                                        -1.0     0.                                        -1.0     0.                                        -1.0     0.                                        -1.0     0.                                        -1.0     0.                                        -1.0     0.                                        -1.0     0.                                        -1.0     0.                                        -1.0     0.                                        -1.0     0.aaaaaaahi!aaaaaa1                                        -1.0     0.                                        -1.0     0.41");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3011");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("hi!AAAAAA10041", '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!AAAAAA10041" + "'", str2, "hi!AAAAAA10041");
    }

    @Test
    public void test3012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3012");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("aaaaaaa                                                                                          ", "                                AAAAAAAHI!AAAAAA1004", 39);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3013");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "aa   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3014");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace(".0#####0.1-#!IHAAAAAAA#############", "HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!", "#############AAAAAAAHI!#-1.0#####0.");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ".0#####0.1-#!IHAAAAAAA#############" + "'", str3, ".0#####0.1-#!IHAAAAAAA#############");
    }

    @Test
    public void test3015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3015");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "1.0  0.0                                  ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3016");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("1.0  0.0 ", "aaaaaaaaaa", 109);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test3017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3017");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("-1.00.0#############################################", "HI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3018");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("        -1.0     0.0", "                                                 -1.0  0.0                                                  ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                         -1.0  0.0                                                  " + "'", str2, "                                         -1.0  0.0                                                  ");
    }

    @Test
    public void test3019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3019");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("Aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaah1004", 91, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaah1004" + "'", str3, "Aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaah1004");
    }

    @Test
    public void test3020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3020");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("1.0  0.0                                  ", 97);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1.0  0.0                                  " + "'", str2, "1.0  0.0                                  ");
    }

    @Test
    public void test3021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3021");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens(".HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HIAAAAAAAhi!AAAAAA10041", "h", 5);
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.splitByCharacterType("444444444444444444444440.1- .04444444444444444444444");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("                              0.0  0.1-                                                        ", strArray4, strArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 5 vs 7");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3022");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("0.00.0", '#');
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, 'a');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, "-1.0  0.0", 8, 8);
        int int11 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("", strArray4);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.startsWithAny("-", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0.00.0" + "'", str6, "0.00.0");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3023");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "#############################################0.0     0.1-                                        ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3024");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("hi!AAAAAA10041", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test3025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3025");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("aAAAAAA1004aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "        ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3026");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("-...", 86);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test3027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3027");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "#################################Aaaaaaahi!aaaaaa10041##################################");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test3028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3028");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("", "AAAAAAAhi!AAAAAA10041", 51);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test3029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3029");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase(".HI...", "#############");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3030");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) " 100");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
    }

    @Test
    public void test3031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3031");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("AAAAAAAhi!AAAAAA1001AAAAAAAhi!AAAAAA1001AAAAAAAi!iAAAAAAAhi!AAAAAA1001AAAAAAAhi!AAAAAA1001AAAAAAAh", "                                                                                                   100");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test3032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3032");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "                                                 -1.0  0.0                                                  ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3033");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 ", "AAAAAAAhi!AAAAAA10041AAAAAAAhi!AAAAAA10041AAAAAAAi!iAAAAAAAhi!AAAAAA10041AAAAAAAhi!AAAAAA10041AAA...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test3034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3034");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("AAAAAAAHI!AAAAAA10041", 0, "                                                                                       aaaaaaahi!HI!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "AAAAAAAHI!AAAAAA10041" + "'", str3, "AAAAAAAHI!AAAAAA10041");
    }

    @Test
    public void test3035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3035");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "                                         1.0     0.                                          ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3036");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("                                              ", (int) (short) 10, 18);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                  " + "'", str3, "                  ");
    }

    @Test
    public void test3037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3037");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "IH!IHAAAAAAA                                                                                       0.00.0");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 105 + "'", int1 == 105);
    }

    @Test
    public void test3038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3038");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("                                               i!                                               ", "0.00.0                                    ", "!ih!IHAAAAAAA                                                                                          !ih!IHAAAAAAA                                                                                          !ih!IHAAAAAAA                                                                                          !ih!IHAAAAAAA                                                                                          !ih!IHAAAAAAA                                                                                          !ih!IHAAAAAAA                                                                                          !ih!IHAAAAAAA                                                                                          !ih!IHAAAAAAA                                                                                          !ih!IHAAAAAAA                                                                                          !i!ihaaaaaaa");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAi!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str3, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAi!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test3039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3039");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("-1.0     0", "4!ihaaaaaaa                                                                                                                                                                                          ", 939);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3040");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("#############aaaaaaahi!#-1.0#####0.-1.0   AAAAAAA10040.", '4');
        boolean boolean5 = org.apache.commons.lang3.StringUtils.endsWithAny("                                                                            AAAAAAAhi!AAAAAA10041", strArray4);
        boolean boolean6 = org.apache.commons.lang3.StringUtils.startsWithAny("                                                                     10041", strArray4);
        java.lang.Class<?> wildcardClass7 = strArray4.getClass();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3041");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                                                    !ihaaaaaaa", "-1.0a a a0.0");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test3042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3042");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa10041");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3043");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("-1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + " 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1-" + "'", str1, " 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1-");
    }

    @Test
    public void test3044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3044");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "                                                                                                    ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                                    " + "'", str1, "                                                                                                    ");
    }

    @Test
    public void test3045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3045");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!", "!ihaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!" + "'", str2, "aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!");
    }

    @Test
    public void test3046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3046");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "ihaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3047");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("#################################################0.0##################################################", '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#################################################0.0##################################################" + "'", str2, "#################################################0.0##################################################");
    }

    @Test
    public void test3048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3048");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("                                               hi!                                               ", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                               hi!                                               " + "'", str2, "                                               hi!                                               ");
    }

    @Test
    public void test3049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3049");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("                                               hi!                                               ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!" + "'", str1, "hi!");
    }

    @Test
    public void test3050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3050");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("AAAAAA1001", "1004");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3051");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("                                        ", "-1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  00.00.00  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test3052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3052");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test3053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3053");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("!ihaaaaaaa                                                                                         ", "100");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3054");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("        -1.0     0.0", "!iha!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa", "AAAAAAA1004");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test3055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3055");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("hi!ihaaaaaaa", "!ihaaaaaaa");
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, '4');
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.concatWith("!IHAAAAAAA", (java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi4" + "'", str5, "hi4");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!IHAAAAAAA" + "'", str6, "hi!IHAAAAAAA");
    }

    @Test
    public void test3056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3056");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("#############aaaaaaahi!#-1.0#####0.");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "#############aaaaaaahi!#-1.0#####0." + "'", str1, "#############aaaaaaahi!#-1.0#####0.");
    }

    @Test
    public void test3057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3057");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("", "################################################################################## 0.0  0.1.0     0.1", 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3058");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("0.0a a a0.1-", "           AAAAAAAHI!AAAAAA10041");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0.0a a a0.1-" + "'", str2, "0.0a a a0.1-");
    }

    @Test
    public void test3059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3059");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("                                                             ####4", "aaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaah100", 11);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3060");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("", "aaaaaaa                              0.0  0.1-HI!hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3061");
        java.lang.String[] strArray1 = null;
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                                         1.0     0.                                          ", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...");
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.replaceEach("", strArray1, strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test3062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3062");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("A");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "A" + "'", str1, "A");
    }

    @Test
    public void test3063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3063");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("#                                                                                          aaaaaaahi!", "AAAAAAAHI!HI!AAAAAAAHI!HI!AAAAAAAHI!HI!AAAAAAAHI!HI!AAAAAAAHI!HI!AAAAAAAHI!HI!AAAAAAAHI!HI!AAAAAAAHI!HI!AAAAAAAHI!HI", (int) (short) -1);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test3064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3064");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("1", "14001aaaaaa!ihaaaaaaA", "       AAAAAAA1004aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa      ###################aaaaaaahi!#-1.0#####0.-1.0   AAAAAAA10040.                #######");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test3065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3065");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("-1.0  0.0", ' ');
        boolean boolean4 = org.apache.commons.lang3.StringUtils.endsWithAny("#################################Aaaaaaahi!aaaaaa10041##################################", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test3066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3066");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("0. -1.00.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-", "hi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi" + "'", str2, "hi");
    }

    @Test
    public void test3067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3067");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-" + "'", str1, "1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-");
    }

    @Test
    public void test3068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3068");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "                                                  a                                                                                                    a                                                                                                    a                                 0.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0                                                  a                                                                                                    a                                                                                                    a                                 ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3069");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("#############################################0.0     0.1-                                        ", 911);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              #############################################0.0     0.1-                                        " + "'", str2, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              #############################################0.0     0.1-                                        ");
    }

    @Test
    public void test3070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3070");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterType("                                               hi!                                               ");
        boolean boolean3 = org.apache.commons.lang3.StringUtils.startsWithAny("        ...", strArray2);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray2);
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray2);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray5);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "                                               hi!                                               " + "'", str4, "                                               hi!                                               ");
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test3071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3071");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("4", "-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 ");
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.split("                                        -1.0     0.0", "HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!", (int) (short) 100);
        int int9 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("-1.0a a a0.0", strArray8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = org.apache.commons.lang3.StringUtils.replaceEach("AAAAAA10041                        ", strArray3, strArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 1 vs 2");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
    }

    @Test
    public void test3072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3072");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("AAAAAAAHI!I!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!", 92);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3073");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "#############");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "#############" + "'", str1, "#############");
    }

    @Test
    public void test3074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3074");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("-1.0  0.0 ", 105, (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test3075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3075");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("10041", "AAAAAAAHI!");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.split("", "aaaaaaa10041");
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.replaceEach("-1.0     0.", strArray3, strArray6);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, ' ', 93, (int) (byte) -1);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1.0     0." + "'", str7, "-1.0     0.");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test3076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3076");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("aaaaaaaaaaaaaaaaaaaaaaaaa!ihaaaaaaa", "0.00.0");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray3);
        boolean boolean5 = org.apache.commons.lang3.StringUtils.startsWithAny("                                                  a                                                                                                    a                                                                                                    a                                 0.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0                                                  a                                                                                                    a                                                                                                    a                                 ", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaa!ihaaaaaaa" + "'", str4, "aaaaaaaaaaaaaaaaaaaaaaaaa!ihaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test3077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3077");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) " 0.0  0.1-");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test3078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3078");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("                                                                                      ", 105, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4444444444444444444                                                                                      " + "'", str3, "4444444444444444444                                                                                      ");
    }

    @Test
    public void test3079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3079");
        char[] charArray10 = new char[] { '#', '4', ' ', '4' };
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "", charArray10);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "hi!ihaaaaaaa", charArray10);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "-1.0     0.0", charArray10);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "-1.00.0#############################################", charArray10);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "#############aaaaaaahi!#-1.0#####0.", charArray10);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "                                                                                     -1.0  0.0 ", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "#4 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "#4 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[#, 4,  , 4]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test3080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3080");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("444444AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!", "4####-     ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3081");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim(".0  0.1-");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".0  0.1-" + "'", str1, ".0  0.1-");
    }

    @Test
    public void test3082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3082");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("aaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaah100", "                                                                                       AAAAAAAHI!HI!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3083");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("4                                      AAAAAAAhi!AAAAAA100414                                       ", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3084");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("14001aaaaaa!ihaaaaaaa                                                                            ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test3085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3085");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("aaaaaaahi!i!                                                                                          AAAAAAAHI!hi!                                                                                          AAAAAAAHI!hi!                                                                                          AAAAAAAHI!hi!                                                                                          AAAAAAAHI!hi!                                                                                          AAAAAAAHI!hi!                                                                                          AAAAAAAHI!hi!                                                                                          AAAAAAAHI!hi!                                                                                          AAAAAAAHI!hi!                                                                                          AAAAAAAHI!hi!", "hi!AAAAAA10041");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test3086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3086");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("                                               hi!                                               ", "100");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                               hi!                                               " + "'", str2, "                                               hi!                                               ");
    }

    @Test
    public void test3087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3087");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("HI!IH       ", (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test3088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3088");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("        ...", "hi!AAAAAA10041hi!AAAAAA10041hi!AAAAAA10041hi!AAAAAA10041hi!AAAAAA10041hi!AAAAAA10041hi!AAAAAA10041hi!AAAAAA10041hi!AAAAAA10041hi!AAAAAA10041hi!AAAAAA10041hi!AAAAAA10041hi!AAAAAA10041hi!AAAAAA10041hi!AAAAAA10041hi!AAAAAA10041hi!AAAAAA10041hi!AAAAAA10041hi!AAAAAA10041hi!AAAAAA10041hi!AAAAAA10041hi!AAAAAA10041hi!AAAAAA10041hi!AAAAAA10041hi!AAAAAA10041hi!AAAAAA10041hi!AAAAAA10041hi!AAAAAA10041hi!AAAAAA10041hi!AAAAAA10041hi!AAAAAA10041hi!AAAAAA10041hi!AAAAAA10041hi!AAAAAA10041hi!AAAAAA10041hi!AAAAAA10041hi!AAAAAA10041hi!AAAAAA10041hi!AAAAAA10041hi!AAAAAA10041hi!AAAAAA10041hi!AAAAAA10041hi!AAAAAA10041hi!AAAAAA10041hi!AAAAAA10041hi!AAAAAA10041hi!AAAAAA10041hi!AAAAAA10041hi!AAAAAA10041hi!AAAAAA10041hi!AAAAAA10041hi!AAAAAA10041hi!AAAAAA10041hi!AAAAAA10041hi!AAAAAA10041hi!AAAAAA10041hi!AAAAAA10041hi!AAAAAA10041hi!AAAAAA10041hi!AAAAAA10041hi!AAAAAA10041hi!AAAAAA10041hi!AAAAAA10041hi!AAAAAA10041hi!AAAAAA10041hi!AAAAAA10041hi!AAAAAAA10041");
        int int4 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("                                        -1.0     0.                                        -1.0     0.                                        -1.0     0.                                        -1.0     0.                                        -1.0     0.                                        -1.0     0.                                        -1.0     0.                                        -1.0     0.                                        -1.0     0.                                        -1.0     0.                                        -1.0     0.aaaaaaahi!aaaaaa1                                        -1.0     0.                                        -1.0     0.41", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test3089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3089");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "          ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test3090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3090");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("      ", "                                        ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3091");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("iH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "iH" + "'", str1, "iH");
    }

    @Test
    public void test3092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3092");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "aaaaaaahi!HI!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3093");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("4", "                                                                               aaaaaaahi!hi!                                                                                          aaaaaaahi!hi!                                                                                          aaaaaaahi!hi!                                                                                          aaaaaaahi!hi!                                                                                          aaaaaaahi!hi!                                                                                          aaaaaaahi!hi!                                                                                          aaaaaaahi!hi!                                                                                          aaaaaaahi!hi!                                                                                          aaaaaaahi!hi", (int) '4');
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test3094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3094");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("   aaaaaaa1004", "   aaaaaaa1004", 910);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test3095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3095");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "!ihaaaaaaa                                                                                         ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3096");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "#############AAAAAAAHI!#-1.0#####0.");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3097");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) " ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test3098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3098");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("444444444444440.1- .04444444444444444444444", 0, 97);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3099");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("444444444444444444444440.1-.04444444444444444444444", 0, 939);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3100");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("                                                                                  ########", "4###");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                  " + "'", str2, "                                                                                  ");
    }

    @Test
    public void test3101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3101");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("", "4####-     ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3102");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("aaaaaaaaaaaaaaaaaaaaaaaaa!ihaaaaaaa", "iH");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test3103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3103");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("        -1.0     0.0", "  ", (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 12 + "'", int3 == 12);
    }

    @Test
    public void test3104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3104");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("A   AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", 0, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "A   AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str3, "A   AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test3105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3105");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("AAAAAA1001", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AAAAAA1001" + "'", str2, "AAAAAA1001");
    }

    @Test
    public void test3106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3106");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 ##########################################################################################", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              #############################################0.0     0.1-                                        ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3107");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("                                                                                     ...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "..." + "'", str1, "...");
    }

    @Test
    public void test3108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3108");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("4001AAAAAAA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4001AAAAAAA" + "'", str1, "4001AAAAAAA");
    }

    @Test
    public void test3109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3109");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("h", (int) '4', '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "444444444444444444444444444444444444444444444444444h" + "'", str3, "444444444444444444444444444444444444444444444444444h");
    }

    @Test
    public void test3110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3110");
        char[] charArray7 = new char[] {};
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "-1.0     0.0", charArray7);
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "HI!", charArray7);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsAny("                                               hi!                                               ", charArray7);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsAny("", charArray7);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "-1.0   aaaaaaa10040.", charArray7);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "aaaaaaahi!aaaaaa10041", charArray7);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "                                        -1.0     0.0", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test3111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3111");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("iH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "i" + "'", str1, "i");
    }

    @Test
    public void test3112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3112");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                ###################aaaaaaahi!#-1.0#####0.-1.0   AAAAAAA10040.                #######4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 106);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "-1.0  0.");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "                ###################-1.0  0.-1.0  0.-1.0  0.-1.0  0.-1.0  0.-1.0  0.-1.0  0.hi!#-1.0#####0.-1.0   AAAAAAA10040.                #######4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str5, "                ###################-1.0  0.-1.0  0.-1.0  0.-1.0  0.-1.0  0.-1.0  0.-1.0  0.hi!#-1.0#####0.-1.0   AAAAAAA10040.                #######4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test3113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3113");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("                                                                                                    ", "                                                                                                    ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test3114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3114");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("!ih!IHAAAAAAA                                                                                          !ih!IHAAAAAAA                                                                                          !ih!IHAAAAAAA                                                                                          !ih!IHAAAAAAA                                                                                          !ih!IHAAAAAAA                                                                                          !ih!IHAAAAAAA                                                                                          !ih!IHAAAAAAA                                                                                          !ih!IHAAAAAAA                                                                                          !ih!IHAAAAAAA                                                                                          !i!ihaaaaaaa", "0.0  0.1-");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!ih!IHAAAAAAA                                                                                          !ih!IHAAAAAAA                                                                                          !ih!IHAAAAAAA                                                                                          !ih!IHAAAAAAA                                                                                          !ih!IHAAAAAAA                                                                                          !ih!IHAAAAAAA                                                                                          !ih!IHAAAAAAA                                                                                          !ih!IHAAAAAAA                                                                                          !ih!IHAAAAAAA                                                                                          !i!ihaaaaaaa" + "'", str2, "!ih!IHAAAAAAA                                                                                          !ih!IHAAAAAAA                                                                                          !ih!IHAAAAAAA                                                                                          !ih!IHAAAAAAA                                                                                          !ih!IHAAAAAAA                                                                                          !ih!IHAAAAAAA                                                                                          !ih!IHAAAAAAA                                                                                          !ih!IHAAAAAAA                                                                                          !ih!IHAAAAAAA                                                                                          !i!ihaaaaaaa");
    }

    @Test
    public void test3115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3115");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "aaahi!i!                                                                                          AAAAAAAHI!hi!                                                                                          AAAAAAAHI!hi!                                                                                          AAAAAAAHI!hi!                                                                                          AAAAAAAHI!hi!                                                                                          AAAAAAAHI!hi!                                                                                          AAAAAAAHI!hi!                                                                                          AAAAAAAHI!hi!                                                                                          AAAAAAAHI!hi!                                                                                          AAAAAAAHI!hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 935 + "'", int1 == 935);
    }

    @Test
    public void test3116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3116");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("                                                                                          aaaaaaa10041", (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3117");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA!IHAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "####### AAAAAAA10040. ###################aaaaaaahi!#-1.0#####0.-1.0 AAAAAAA1004aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 41 + "'", int2 == 41);
    }

    @Test
    public void test3118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3118");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3119");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("hi!ihaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!ihaaaaaaa" + "'", str1, "hi!ihaaaaaaa");
    }

    @Test
    public void test3120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3120");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("AAAAAAA", "hi!ih       ");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "           AAAAAAAHI!AAAAAA10041                                                          ");
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray2);
        int int6 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "AAAAAAA" + "'", str4, "AAAAAAA");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "AAAAAAA" + "'", str5, "AAAAAAA");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test3121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3121");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByCharacterType("                                               hi!                                               ");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("-1.0     0.");
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.replaceEach("", strArray3, strArray5);
        boolean boolean7 = org.apache.commons.lang3.StringUtils.endsWithAny("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              #############################################0.0     0.1-                                        ", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test3122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3122");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("4444444444444444444444444444440.0440.1-", ".0  0.");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3123");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("AAAAAAAhi!AAAAAA10041", " 001AAAAAAA");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "AAAAAAAhi!AAAAAA10041" + "'", str3, "AAAAAAAhi!AAAAAA10041");
    }

    @Test
    public void test3124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3124");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("10041", 40, 24);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3125");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("        4####                                                             ", "AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "        4####                                                             " + "'", str2, "        4####                                                             ");
    }

    @Test
    public void test3126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3126");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("0.00.0...", "001aaaaaa!ihaaaaaaa41");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0.00.0..." + "'", str2, "0.00.0...");
    }

    @Test
    public void test3127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3127");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("aaaaaaa1004", "444444444444444444444440.1- .04444444444444444444444", "                                                                               AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI", 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "aaaaaaa1004" + "'", str4, "aaaaaaa1004");
    }

    @Test
    public void test3128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3128");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAi!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", (java.lang.CharSequence) "0.1- #############################################0.0");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test3129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3129");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "4####");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3130");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("0.0", "       AAAAAAA1004aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa      ###################aaaaaaahi!#-1.0#####0.-1.0   AAAAAAA10040.                #######");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0.0" + "'", str2, "0.0");
    }

    @Test
    public void test3131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3131");
        char[] charArray7 = new char[] {};
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "-1.0     0.0", charArray7);
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "HI!", charArray7);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsAny("                                               hi!                                               ", charArray7);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "                                        -1.0     0.0", charArray7);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "-1.00.0#############################################", charArray7);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "                                                    ", charArray7);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "0.0a a a0.1-", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test3132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3132");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("AAAAAAAHI!", 939);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3133");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("14001AAAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih14001AAAAAA!ih", "aaaaaaa                              0.0  0.1-HI!hi!", "aaaaaaahi!aaaaaa1004");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4AAAAAAA4AAAAAA4AAAAAA4AAAAAA4AAAAAA4AAAAAA4AAAAAA4AAAAAA4AAAAAA4AAAAAA4AAAAAA4AAAAAA4AAAAAA4AAAAAA4AAAAAA4AAAAAA4AAAAAA4AAAAAA4AAAAAA4AAAAAA4AAAAAA4AAAAAA4AAAAAA4AAAAAA4AAAAAA4AAAAAA4AAAAAA4AAAAAA4AAAAAA4AAAAAA4AAAAAA4AAAAAA4AAAAAA4AAAAAA4AAAAAA4AAAAAA4AAAAAA4AAAAAA4AAAAAA4AAAAAA4AAAAAA4AAAAAA4AAAAAA4AAAAAA4AAAAAA4AAAAAA4AAAAAA4AAAAAA4AAAAAA4AAAAAA4AAAAAA4AAAAAA4AAAAAA4AAAAAA4AAAAAA4AAAAAA4AAAAAA4AAAAAA4AAAAAA4AAAAAA4AAAAAA4AAAAAA4AAAAAA4AAAAAA4AAAAAA4AAAAAA4AAAAAA" + "'", str3, "4AAAAAAA4AAAAAA4AAAAAA4AAAAAA4AAAAAA4AAAAAA4AAAAAA4AAAAAA4AAAAAA4AAAAAA4AAAAAA4AAAAAA4AAAAAA4AAAAAA4AAAAAA4AAAAAA4AAAAAA4AAAAAA4AAAAAA4AAAAAA4AAAAAA4AAAAAA4AAAAAA4AAAAAA4AAAAAA4AAAAAA4AAAAAA4AAAAAA4AAAAAA4AAAAAA4AAAAAA4AAAAAA4AAAAAA4AAAAAA4AAAAAA4AAAAAA4AAAAAA4AAAAAA4AAAAAA4AAAAAA4AAAAAA4AAAAAA4AAAAAA4AAAAAA4AAAAAA4AAAAAA4AAAAAA4AAAAAA4AAAAAA4AAAAAA4AAAAAA4AAAAAA4AAAAAA4AAAAAA4AAAAAA4AAAAAA4AAAAAA4AAAAAA4AAAAAA4AAAAAA4AAAAAA4AAAAAA4AAAAAA4AAAAAA4AAAAAA4AAAAAA4AAAAAA");
    }

    @Test
    public void test3134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3134");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("-1.0  0.0                              ", "aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  ", 91);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test3135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3135");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("hI!                                                                                          ", "", " 100", 95);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hI!                                                                                          " + "'", str4, "hI!                                                                                          ");
    }

    @Test
    public void test3136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3136");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("0.00.0                                                                                       aaaaaaahi!HI");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0.00.0                                                                                       aaaaaaahi!HI" + "'", str1, "0.00.0                                                                                       aaaaaaahi!HI");
    }

    @Test
    public void test3137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3137");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "-1.0a a a0.0");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "-1.0a a a0.0" + "'", str1, "-1.0a a a0.0");
    }

    @Test
    public void test3138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3138");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("                                                  a                                                                                                    a                                                                                                    a                                 0.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0                                                  a                                                                                                    a                                                                                                    a                                 ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test3139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3139");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0", "-1.0  0.0 44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test3140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3140");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("aaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AAAAAAA" + "'", str1, "AAAAAAA");
    }

    @Test
    public void test3141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3141");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("4                                      AAAAAAAhi!AAAAAA100414                                       ", "hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test3142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3142");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("                                                                                                    ", (int) (byte) 1, 49);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                 " + "'", str3, "                                                 ");
    }

    @Test
    public void test3143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3143");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("iH", 935, 9);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3144");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 ##########################################################################################", "aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 ##########################################################################################" + "'", str2, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 ##########################################################################################");
    }

    @Test
    public void test3145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3145");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "0. -1.0");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3146");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "hi!AAAAAA10041hi!AAAAAA10041hi!AAAAAA10041hi!AAAAAA10041hi!AAAAAA10041hi!AAAAAA10041hi!AAAAAA10041hi!AAAAAA10041hi!AAAAAA10041hi!AAAAAA10041hi!AAAAAA10041hi!AAAAAA10041hi!AAAAAA10041hi!AAAAAA10041hi!AAAAAA10041hi!AAAAAA10041hi!AAAAAA10041hi!AAAAAA10041hi!AAAAAA10041hi!AAAAAA10041hi!AAAAAA10041hi!AAAAAA10041hi!AAAAAA10041hi!AAAAAA10041hi!AAAAAA10041hi!AAAAAA10041hi!AAAAAA10041hi!AAAAAA10041hi!AAAAAA10041hi!AAAAAA10041hi!AAAAAA10041hi!AAAAAA10041hi!AAAAAA10041hi!AAAAAA10041hi!AAAAAA10041hi!AAAAAA10041hi!AAAAAA10041hi!AAAAAA10041hi!AAAAAA10041hi!AAAAAA10041hi!AAAAAA10041hi!AAAAAA10041hi!AAAAAA10041hi!AAAAAA10041hi!AAAAAA10041hi!AAAAAA10041hi!AAAAAA10041hi!AAAAAA10041hi!AAAAAA10041hi!AAAAAA10041hi!AAAAAA10041hi!AAAAAA10041hi!AAAAAA10041hi!AAAAAA10041hi!AAAAAA10041hi!AAAAAA10041hi!AAAAAA10041hi!AAAAAA10041hi!AAAAAA10041hi!AAAAAA10041hi!AAAAAA10041hi!AAAAAA10041hi!AAAAAA10041hi!AAAAAA10041hi!AAAAAA10041hi!AAAAAA10041hi!AAAAAAA10041");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3147");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("                                                                            aaaaaaahi!aaaaaa10041", "-1.0     0.0");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                            aaaaaaahi!aaaaaa10041" + "'", str2, "                                                                            aaaaaaahi!aaaaaa10041");
    }

    @Test
    public void test3148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3148");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("aaaaaaahi!aaaaaa10041", 438, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaahi!aaaaaa10041                                                                                                                                                                                                                                                                                                                                                                                                                                 " + "'", str3, "aaaaaaahi!aaaaaa10041                                                                                                                                                                                                                                                                                                                                                                                                                                 ");
    }

    @Test
    public void test3149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3149");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("                                                                                  ########", " 100");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3150");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("!ihaaaaaaa                                                                                         ", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3151");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("                                                                               aaaaaaahi!hi!                                                                                          aaaaaaahi!hi!                                                                                          aaaaaaahi!hi!                                                                                          aaaaaaahi!hi!                                                                                          aaaaaaahi!hi!                                                                                          aaaaaaahi!hi!                                                                                          aaaaaaahi!hi!                                                                                          aaaaaaahi!hi!                                                                                          aaaaaaahi!hi", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa-...", "           AAAAAAAHI!AAAAAA10041                                                          ");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test3152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3152");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("1004", (int) '#', "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                1.0     0.                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "               1004                " + "'", str3, "               1004                ");
    }

    @Test
    public void test3153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3153");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "                                                                                      ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 86 + "'", int1 == 86);
    }

    @Test
    public void test3154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3154");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("AAAAAA1001", 88);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AAAAAA1001" + "'", str2, "AAAAAA1001");
    }

    @Test
    public void test3155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3155");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "   aaaaaaa1004", (java.lang.CharSequence) "AAAAAAAHI!I!aaaaaaahi!HI!aaaaaaahi!HI!aaaaaaahi!HI!aaaaaaahi!HI!aaaaaaahi!HI!aaaaaaahi!HI!aaaaaaahi!HI!aaaaaaahi!HI!aaaaaaahi!HI!");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "   aaaaaaa1004" + "'", charSequence2, "   aaaaaaa1004");
    }

    @Test
    public void test3156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3156");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("!ih!IHAAAAAAA                                 ...", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!ih!IHAAAAAAA                                 ..." + "'", str2, "!ih!IHAAAAAAA                                 ...");
    }

    @Test
    public void test3157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3157");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("44444444444444444444440. -1.044444444444444444444444", "", "4001AAAAAA!IHAAAAAAA           ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "44444444444444444444440. -1.044444444444444444444444" + "'", str3, "44444444444444444444440. -1.044444444444444444444444");
    }

    @Test
    public void test3158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3158");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("-1.0  0.0 ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "-1.0  0.0" + "'", str1, "-1.0  0.0");
    }

    @Test
    public void test3159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3159");
        char[] charArray1 = null;
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "...    ...", charArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3160");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "4AAAAAAAhi!AAAAAA100414", "-1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3161");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "4###4###4###4###4###4###4###4###4###4###");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3162");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("                                                                            AAAAAAAhi!AAAAAA10041", ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AAAAAAAhi!AAAAAA10041" + "'", str2, "AAAAAAAhi!AAAAAA10041");
    }

    @Test
    public void test3163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3163");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("hi!IHAAAAAAA", "14001AAAAAA!IHAAAAAAA           ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3164");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI", "                                                                                           -1.0  0.0");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test3165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3165");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("AAAA10041", "                                AAAAAAAHI!AAAAAA1004");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test3166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3166");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("aaaaaaahi.aaaaaaahi.aaaaaaahi.aaaaaaahi.aaaaaaahi.aaaaaaahi.aaaaaaahi.aaaaaaahi.aaaaaaahi.aaaaaaah", "HI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!", "                                                  a                                                  ");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test3167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3167");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("-1.0  0.0 ", "!ih!IHAAAAAAA                                                                                          !ih!IHAAAAAAA                                                                                          !ih!IHAAAAAAA                                                                                          !ih!IHAAAAAAA                                                                                          !ih!IHAAAAAAA                                                                                          !ih!IHAAAAAAA                                                                                          !ih!IHAAAAAAA                                                                                          !ih!IHAAAAAAA                                                                                          !ih!IHAAAAAAA                                                                                          !i!ihaaaaaaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3168");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0." + "'", str1, "-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.");
    }

    @Test
    public void test3169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3169");
        char[] charArray6 = new char[] {};
        boolean boolean7 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "-1.0     0.0", charArray6);
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                                                                                          aaaaaaahi!", charArray6);
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0", charArray6);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "                                                                                       aaaaaaahi!HI!", charArray6);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsAny("                                                 -1.0  0.0                                                   ", charArray6);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "10041", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test3170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3170");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("-1.0 0.0", "4", 935);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3171");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("10041");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1);
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "10041" + "'", str2, "10041");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "10041" + "'", str3, "10041");
    }

    @Test
    public void test3172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3172");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("444444444444440.1- .04444444444444444444444", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "444444444444440.1- .04444444444444444444444" + "'", str2, "444444444444440.1- .04444444444444444444444");
    }

    @Test
    public void test3173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3173");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("#############################################0.0     0.1-                                        ", 4, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#############################################0.0     0.1-                                        " + "'", str3, "#############################################0.0     0.1-                                        ");
    }

    @Test
    public void test3174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3174");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase(".0  0.1-");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".0  0.1-" + "'", str1, ".0  0.1-");
    }

    @Test
    public void test3175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3175");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("0.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0", 16);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3176");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("                              0.0  0.1-                                                        ", " 0.0  0.1-");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 29 + "'", int2 == 29);
    }

    @Test
    public void test3177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3177");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("####", "-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 ");
        int int4 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray3);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.concatWith("                  ", (java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "####" + "'", str5, "####");
    }

    @Test
    public void test3178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3178");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("14001aaaaaa!ihaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "14001aaaaaa!ihaaaaaaa" + "'", str1, "14001aaaaaa!ihaaaaaaa");
    }

    @Test
    public void test3179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3179");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 ", '4');
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 " + "'", str4, "-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 ");
    }

    @Test
    public void test3180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3180");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "1.0  0.0 ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3181");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("                                                 -1.0  0.0                                                  ", "!ihaaaaaaa                                                                                          ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test3182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3182");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart(".", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "." + "'", str2, ".");
    }

    @Test
    public void test3183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3183");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("AAAAAAAHI!I!aaaaaaahi!HI!aaaaaaahi!HI!aaaaaaahi!HI!aaaaaaahi!HI!aaaaaaahi!HI!aaaaaaahi!HI!aaaaaaahi!HI!aaaaaaahi!HI!aaaaaaahi!HI!", "                                                  a                                                  ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3184");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("                                        -1.0     0.0", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 ##########################################################################################", 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3185");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "4AAAAAAA4AAAAAA4AAAAAA4AAAAAA4AAAAAA4AAAAAA4AAAAAA4AAAAAA4AAAAAA4AAAAAA4AAAAAA4AAAAAA4AAAAAA4AAAAAA4AAAAAA4AAAAAA4AAAAAA4AAAAAA4AAAAAA4AAAAAA4AAAAAA4AAAAAA4AAAAAA4AAAAAA4AAAAAA4AAAAAA4AAAAAA4AAAAAA4AAAAAA4AAAAAA4AAAAAA4AAAAAA4AAAAAA4AAAAAA4AAAAAA4AAAAAA4AAAAAA4AAAAAA4AAAAAA4AAAAAA4AAAAAA4AAAAAA4AAAAAA4AAAAAA4AAAAAA4AAAAAA4AAAAAA4AAAAAA4AAAAAA4AAAAAA4AAAAAA4AAAAAA4AAAAAA4AAAAAA4AAAAAA4AAAAAA4AAAAAA4AAAAAA4AAAAAA4AAAAAA4AAAAAA4AAAAAA4AAAAAA4AAAAAA4AAAAAA4AAAAAA4AAAAAA");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3186");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "100");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test3187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3187");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("#############################################0.0     0.1-                                        ", "                                                    ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test3188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3188");
        java.lang.CharSequence charSequence0 = null;
        char[] charArray4 = new char[] {};
        boolean boolean5 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "-1.0     0.0", charArray4);
        int int6 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "-1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 ", charArray4);
        int int7 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA!IHAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", charArray4);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsOnly(charSequence0, charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test3189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3189");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("-1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  00.00.00  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test3190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3190");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("-1.0a a a0.0", "aaaaaaAAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3191");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("", 825);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test3192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3192");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("                                                                               aaaaaaahi!hi!                                                                                          aaaaaaahi!hi!                                                                                          aaaaaaahi!hi!                                                                                          aaaaaaahi!hi!                                                                                          aaaaaaahi!hi!                                                                                          aaaaaaahi!hi!                                                                                          aaaaaaahi!hi!                                                                                          aaaaaaahi!hi!                                                                                          aaaaaaahi!hi", "               1004                ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test3193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3193");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("        4####                                                             ", 4);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "    " + "'", str2, "    ");
    }

    @Test
    public void test3194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3194");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "14001aaaaaa!ihaaaaaaA", "#############################################0.0     0.1-");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test3195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3195");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByCharacterType("                                               hi!                                               ");
        boolean boolean4 = org.apache.commons.lang3.StringUtils.startsWithAny("        ...", strArray3);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray3);
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        boolean boolean7 = org.apache.commons.lang3.StringUtils.endsWithAny("-...", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "                                               hi!                                               " + "'", str5, "                                               hi!                                               ");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test3196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3196");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("hi4", "aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  ", 92);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test3197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3197");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("                ##########################################################################################", "!ihaaaaaaa", "0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                ##########################################################################################" + "'", str3, "                ##########################################################################################");
    }

    @Test
    public void test3198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3198");
        char[] charArray13 = new char[] { '#', '4', ' ', '4' };
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "", charArray13);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                                                                                          aaaaaaa10041", charArray13);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "                                                                                          aaaaaaa10041", charArray13);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "hi!ihaaaaaaa", charArray13);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsAny("                                               hi!                                               ", charArray13);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                                                                                          aaaaaaahi!", charArray13);
        int int20 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                                        -1.0     0.", charArray13);
        boolean boolean21 = org.apache.commons.lang3.StringUtils.containsAny("                                                                                          ", charArray13);
        int int22 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa######", charArray13);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "#4 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "#4 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[#, 4,  , 4]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 144 + "'", int22 == 144);
    }

    @Test
    public void test3199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3199");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("10041");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.concatWith("4                                                                                                ", (java.lang.Object[]) strArray2);
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "10041" + "'", str3, "10041");
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test3200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3200");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("                                               i!                                               ", 438, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "###########################################################################################################################################################################                                               i!                                               ###########################################################################################################################################################################" + "'", str3, "###########################################################################################################################################################################                                               i!                                               ###########################################################################################################################################################################");
    }

    @Test
    public void test3201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3201");
        char[] charArray4 = new char[] {};
        boolean boolean5 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "-1.0     0.0", charArray4);
        int int6 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                                                                                          aaaaaaahi!", charArray4);
        boolean boolean7 = org.apache.commons.lang3.StringUtils.containsAny(" 0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 ", charArray4);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "   4", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test3202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3202");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "4                                                                                                ", 74);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3203");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("#############", (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "##########" + "'", str2, "##########");
    }

    @Test
    public void test3204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3204");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("!ihaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!ihaaaaaaa" + "'", str1, "!ihaaaaaaa");
    }

    @Test
    public void test3205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3205");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("-1.0a a a0.0-1.0  0.0 -1.0a a a0.0-1.0  0.0 -1.0a a a0.0-1.0  0.0 -1.0a a a0.0-1.0  0.0 -1.0a a a0.0-1.0  0.0 -1.0a a a0.0-1.0  0.0 -1.0a a a0.0-1.0  0.0 -1.0a a a0.0-1.0  0.0 -1.0a a a0.0-1.0  0.0 -1", "AAAAAAA...");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test3206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3206");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "                                                                            AAAAAAAhi!AAAAAA10041");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test3207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3207");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                                                                                           -1.0  0.0", "                                                                            AAAAAAAHI!AAAAAA10041", (int) '4');
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test3208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3208");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...", "AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!", 93);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3209");
        char[] charArray7 = new char[] {};
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "-1.0     0.0", charArray7);
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "HI!", charArray7);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsAny("                                               hi!                                               ", charArray7);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "                                        -1.0     0.0", charArray7);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "-1.00.0#############################################", charArray7);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "                                                    ", charArray7);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "!ihaaaaaaa                                                                                         ", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test3210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3210");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("                                         1.0     0.                                          ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1.0     0." + "'", str1, "1.0     0.");
    }

    @Test
    public void test3211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3211");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAAA1--41", "                                                                               AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3212");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("hi!IHAAAAAAA", "hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!IHAAAAAAA" + "'", str2, "hi!IHAAAAAAA");
    }

    @Test
    public void test3213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3213");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("14001aaaaaa!ihaaaaaaa                                                                            ", 6, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "14001aaaaaa!ihaaaaaaa                                                                            " + "'", str3, "14001aaaaaa!ihaaaaaaa                                                                            ");
    }

    @Test
    public void test3214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3214");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("                                                                  AAAAAAAHI!AAAAAA10041       ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AAAAAAAHI!AAAAAA10041" + "'", str1, "AAAAAAAHI!AAAAAA10041");
    }

    @Test
    public void test3215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3215");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left(".00.1-", 17);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ".00.1-" + "'", str2, ".00.1-");
    }

    @Test
    public void test3216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3216");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("                                               hi!                                               ", "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3217");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("        -1.0     0.0", 54, 9);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test3218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3218");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("                                                                                          AAAAAAA1004", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3219");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("           aaaaaaahi!aaaaaa10041", (int) (short) 10, "aaaaaaaaaaaaaaaaaaaaaaaaa!ihaaaaaaa");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "           aaaaaaahi!aaaaaa10041" + "'", str3, "           aaaaaaahi!aaaaaa10041");
    }

    @Test
    public void test3220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3220");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("", "                ###################aaaaaaahi!#-1.0#####0.-1.0   AAAAAAA10040.                #######4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3221");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("########", " 100");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " 100" + "'", str2, " 100");
    }

    @Test
    public void test3222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3222");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("hi!AAAAAA10041", "                                                                                       aaaaaaahi!HI!", (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "AAAAAAA10041", 24, 92);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 24");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test3223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3223");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("                                                                     10041", "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444-1.0  0.0");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test3224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3224");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "AAAAAAA");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test3225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3225");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("a0.0 a -1.0a 0.0 a0.0-1.0 a -1.0a 0.0 a0.0-1.0 a -1.0a 0.0 a0.0-1.0 a -1.0a 0.0 a0.0-1.0 a -1.0a 0.0 a0.0-1.0 a -1.0a 0.0 a0.0-1.0 a -1.0a 0.0 a0.0-1.0 a -1.0a 0.0 a0.0-1.0 a -1.0a 0.0 a0.0-1.0 a -1.0a", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                1.0     0.                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3226");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("aAAAAA1001", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3227");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("", 'a');
        boolean boolean4 = org.apache.commons.lang3.StringUtils.startsWithAny("HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HIAAAAAAAhi!AAAAAA10041", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test3228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3228");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("!IHAAAAAAA", "AAAAAAAhi!AAAAAA1001AAAAAAAhi!AAAAAA1001AAAAAAAi!iAAAAAAAhi!AAAAAA1001AAAAAAAhi!AAAAAA1001AAAAAAAh", 88);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3229");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test3230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3230");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("               1004                ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1004" + "'", str1, "1004");
    }

    @Test
    public void test3231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3231");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAAA1--41", "-1.0  0.0                              ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAAA1--41" + "'", str2, "hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAA1--41hi!AAAAAAA1--41");
    }

    @Test
    public void test3232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3232");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("                                                                                          aaaaaaa1004", "#############", 29);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3233");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "                                                  a                                                  ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3234");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("4!ihaaaaaaa                                                                                                                                                                                          ", "AA   AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4!ihaaaaaaa                                                                                                                                                                                          " + "'", str2, "4!ihaaaaaaa                                                                                                                                                                                          ");
    }

    @Test
    public void test3235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3235");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("                                                                                     ...", "0. -1.0");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                     ..." + "'", str2, "                                                                                     ...");
    }

    @Test
    public void test3236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3236");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "      ", "                                                                                  AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test3237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3237");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("aaaaaaa", "44444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3238");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("14001AAAAAA!IHAAAAAAA           ", "                                         -1.0  0.0                                                  ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3239");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("IH", "aaaaaaa1004", 40);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3240");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "                                                                            aaaaaaahi!aaaaaa10041", "HI!ihaaaaaa                                      aaaaaaahi!HI!ihaaaaaa                                      aaaaaaahi!HI!ihaaaaaa                                      aaaaaaahi!HI!ihaaaaaa                                      aaaaaaahi!HI!ihaaaaaa                                      aaaaaaahi!HI!ihaaaaaa                                      aaaaaaahi!HI!ihaaaaaa                                      aaaaaaahi!HI!ihaaaaaa                                      aaaaaaahi!HI!ihaaaaaa                                      aaaaaaahi!HI");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3241");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens(" 0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 ", "aaaaaaa1004");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " . -..-.  . -..-.  . -..-.  . -..-.  . -..-.  . -..-.  . -..-.  . -..-.  . -..-.  . -..-.  . -..-.  . -..-.  . -..-.  . -..-.  . -..-.  . -..-.  . -..-.  . -..-.  . -..-.  . -..-.  . -..-.  . -..-.  . -..-.  . -..-.  . -..-.  . -..-.  . " + "'", str3, " . -..-.  . -..-.  . -..-.  . -..-.  . -..-.  . -..-.  . -..-.  . -..-.  . -..-.  . -..-.  . -..-.  . -..-.  . -..-.  . -..-.  . -..-.  . -..-.  . -..-.  . -..-.  . -..-.  . -..-.  . -..-.  . -..-.  . -..-.  . -..-.  . -..-.  . -..-.  . ");
    }

    @Test
    public void test3242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3242");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("HI!");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, ".");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HI!" + "'", str3, "HI!");
    }

    @Test
    public void test3243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3243");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("aaaaaaahi", "AAAAAAA...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AAAAAAA..." + "'", str2, "AAAAAAA...");
    }

    @Test
    public void test3244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3244");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("               1004                ", "aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaah1004");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "               1004                " + "'", str2, "               1004                ");
    }

    @Test
    public void test3245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3245");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("4001AAAAAAA#", "h");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4001AAAAAAA#" + "'", str2, "4001AAAAAAA#");
    }

    @Test
    public void test3246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3246");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("0. -1.00.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-", "4444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0. -1.00.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-" + "'", str2, "0. -1.00.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-");
    }

    @Test
    public void test3247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3247");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test3248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3248");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("14001aaaaaa!ihaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "14001AAAAAA!IHAAAAAAA" + "'", str1, "14001AAAAAA!IHAAAAAAA");
    }

    @Test
    public void test3249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3249");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("           AAAAAAAHI!AAAAAA1004");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "           AAAAAAAHI!AAAAAA1004" + "'", str1, "           AAAAAAAHI!AAAAAA1004");
    }

    @Test
    public void test3250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3250");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("-1.0a a a0.0-1.0  0.0 -1.0a a a0.0-1.0  0.0 -1.0a a a0.0-1.0  0.0 -1.0a a a0.0-1.0  0.0 -1.0a a a0.0-1.0  0.0 -1.0a a a0.0-1.0  0.0 -1.0a a a0.0-1.0  0.0 -1.0a a a0.0-1.0  0.0 -1.0a a a0.0-1.0  0.0 -1.0a a a0.0", "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", (int) (byte) 100);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray3);
        int int5 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1.0a a a0.0-1.0  0.0 -1.0a a a0.0-1.0  0.0 -1.0a a a0.0-1.0  0.0 -1.0a a a0.0-1.0  0.0 -1.0a a a0.0-1.0  0.0 -1.0a a a0.0-1.0  0.0 -1.0a a a0.0-1.0  0.0 -1.0a a a0.0-1.0  0.0 -1.0a a a0.0-1.0  0.0 -1.0a a a0.0" + "'", str4, "-1.0a a a0.0-1.0  0.0 -1.0a a a0.0-1.0  0.0 -1.0a a a0.0-1.0  0.0 -1.0a a a0.0-1.0  0.0 -1.0a a a0.0-1.0  0.0 -1.0a a a0.0-1.0  0.0 -1.0a a a0.0-1.0  0.0 -1.0a a a0.0-1.0  0.0 -1.0a a a0.0-1.0  0.0 -1.0a a a0.0");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test3251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3251");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "AAAAAAAHI!I!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 939 + "'", int1 == 939);
    }

    @Test
    public void test3252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3252");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("4!ihaaaaaaa                                                                                                                                                                                          ", 42);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4!ihaaaaaaa                            ..." + "'", str2, "4!ihaaaaaaa                            ...");
    }

    @Test
    public void test3253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3253");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "        4####                                                             ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3254");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("hi!aaaaaa1004", 9);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3255");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("!ihaaaaaaa                                                                                          ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test3256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3256");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                                                                                          aaaaaaa10041", "aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!");
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "-1.0a a a0.0", (int) (short) 100, 24);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test3257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3257");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("4                                      AAAAAAAhi!AAAAAA100414                                       ", "-1.00.0#############################################");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3258");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("!ihaaaaaaa", "444444444444444444444440.1- .04444444444444444444444");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test3259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3259");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...", "                ###################aaaaaaahi!#-1.0#####0.-1.0   AAAAAAA10040.                #######4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa..." + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...");
    }

    @Test
    public void test3260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3260");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("4                                      AAAAAAAhi!AAAAAA100414                                       ", "                                                                                      ", 910);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3261");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("1.0     0.1.0  0.0 ##################################################################################");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test3262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3262");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("444444444444440.1- .04444444444444444444444", (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "444444444444440.1- .044444444..." + "'", str2, "444444444444440.1- .044444444...");
    }

    @Test
    public void test3263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3263");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("-1.0a a a0.0-1.0  0.0 -1.0a a a0.0-1.0  0.0 -1.0a a a0.0-1.0  0.0 -1.0a a a0.0-1.0  0.0 -1.0a a a0.0-1.0  0.0 -1.0a a a0.0-1.0  0.0 -1.0a a a0.0-1.0  0.0 -1.0a a a0.0-1.0  0.0 -1.0a a a0.0-1.0  0.0 -1", "                                                                  AAAAAAAHI!AAAAAA10041       ", (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3264");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "!ihaaaaaaa... ...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3265");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("                                        -1.0     0.", (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                        -1.0     0." + "'", str2, "                                        -1.0     0.");
    }

    @Test
    public void test3266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3266");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "HI!IH       ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3267");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("i", 32);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "i                               " + "'", str2, "i                               ");
    }

    @Test
    public void test3268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3268");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("hi4444444444444444444444444444440.0440.1-!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi4444444444444444444444444444440.0440.1-!" + "'", str1, "hi4444444444444444444444444444440.0440.1-!");
    }

    @Test
    public void test3269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3269");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase(charSequence0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3270");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("14001aaaaaa!ihaaaaaaa                                                                            ", "                                                                    ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3271");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("#############################################0.0     0.1-", "-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 ", "AA   AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test3272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3272");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("aaaaaaaaaaaaaaaaaaaaaaaaa!ihaaaaaaa", "                ##########################################################################################", 105);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3273");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("4001AAAAAAA", (int) (byte) 10, 5);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "A" + "'", str3, "A");
    }

    @Test
    public void test3274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3274");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("   aaaaaaa1004   aaaaaaa1004   aaaaaaa1004   aaaaaaa1004   aaaaaaa1004   aaaaaaa1004   aaaaaaa1004   aaaaaaa1004   aaaaaaa1004   aaaaaaa1004   aaaaaaa1004   aaaaaaa1004   aaaaaaa1004", "########################################-1.0#####0.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "   aaaaaaa1004   aaaaaaa1004   aaaaaaa1004   aaaaaaa1004   aaaaaaa1004   aaaaaaa1004   aaaaaaa1004   aaaaaaa1004   aaaaaaa1004   aaaaaaa1004   aaaaaaa1004   aaaaaaa1004   aaaaaaa1004" + "'", str2, "   aaaaaaa1004   aaaaaaa1004   aaaaaaa1004   aaaaaaa1004   aaaaaaa1004   aaaaaaa1004   aaaaaaa1004   aaaaaaa1004   aaaaaaa1004   aaaaaaa1004   aaaaaaa1004   aaaaaaa1004   aaaaaaa1004");
    }

    @Test
    public void test3275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3275");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!", 35, "AAAAAAA...");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!" + "'", str3, "AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!");
    }

    @Test
    public void test3276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3276");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("hi", (int) ' ', ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "               hi               " + "'", str3, "               hi               ");
    }

    @Test
    public void test3277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3277");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("aaaaaaAAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!", 35, (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...!AAA..." + "'", str3, "...!AAA...");
    }

    @Test
    public void test3278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3278");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("aAAAAA1001");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aAAAAA1001" + "'", str1, "aAAAAA1001");
    }

    @Test
    public void test3279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3279");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("        4####                                                             ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "        4####                                                             " + "'", str1, "        4####                                                             ");
    }

    @Test
    public void test3280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3280");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("   4", " ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4" + "'", str2, "4");
    }

    @Test
    public void test3281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3281");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("1.0     0.", 825);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test3282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3282");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "44444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 35 + "'", int1 == 35);
    }

    @Test
    public void test3283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3283");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("                                                                     10041", ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "10041" + "'", str2, "10041");
    }

    @Test
    public void test3284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3284");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("                                                 -1.0  0.0                                                  ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "-1.0  0.0" + "'", str1, "-1.0  0.0");
    }

    @Test
    public void test3285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3285");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "4###4###4###4###4###4###4###4###4###4###");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4###4###4###4###4###4###4###4###4###4###" + "'", str1, "4###4###4###4###4###4###4###4###4###4###");
    }

    @Test
    public void test3286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3286");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("                                              ");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, 'a');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                              " + "'", str3, "                                              ");
    }

    @Test
    public void test3287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3287");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("aaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaa" + "'", str1, "aaaaa");
    }

    @Test
    public void test3288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3288");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("-1.0a a a0.0-1.0  0.0 -1.0a a a0.0-1.0  0.0 -1.0a a a0.0-1.0  0.0 -1.0a a a0.0-1.0  0.0 -1.0a a a0.0-1.0  0.0 -1.0a a a0.0-1.0  0.0 -1.0a a a0.0-1.0  0.0 -1.0a a a0.0-1.0  0.0 -1.0a a a0.0-1.0  0.0 -1", ".HI...", 11);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3289");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("                ###################aaaaaaahi!#-1.0#####0.-1.0   AAAAAAA10040.                #######", "aaaaaahi", "-1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                ###################a-1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 !#-1.0#####0.-1.0   AAAAAAA10040.                #######" + "'", str3, "                ###################a-1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 !#-1.0#####0.-1.0   AAAAAAA10040.                #######");
    }

    @Test
    public void test3290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3290");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfBlank("44444444444444444444444444444444", "14001AAAAAA!IHAAAAAAA           ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44444444444444444444444444444444" + "'", str2, "44444444444444444444444444444444");
    }

    @Test
    public void test3291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3291");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("444444444444444444444440.1- .04444444444444444444444", (int) (short) 0, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "444444444444444444444440.1- .04444444444444444444444" + "'", str3, "444444444444444444444440.1- .04444444444444444444444");
    }

    @Test
    public void test3292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3292");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("                                                                    ", "1004");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                    " + "'", str2, "                                                                    ");
    }

    @Test
    public void test3293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3293");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA!IHAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "4                                                                                                ", 11);
        int int5 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("                                                                                  AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test3294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3294");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi", 24);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi" + "'", str2, "aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi");
    }

    @Test
    public void test3295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3295");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("                ###################-1.0  0.-1.0  0.-1.0  0.-1.0  0.-1.0  0.-1.0  0.-1.0  0.hi!#-1.0#####0.-1.0   AAAAAAA10040.                #######4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test3296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3296");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("                              0.0  0.1-");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                              0.0  0.1-" + "'", str1, "                              0.0  0.1-");
    }

    @Test
    public void test3297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3297");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "1.0     0.1.0  0.0 ##################################################################################", (java.lang.CharSequence) "aa        ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test3298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3298");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("-1.0     0.0", "", 100);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, 'a');
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-1.0a0.0" + "'", str5, "-1.0a0.0");
    }

    @Test
    public void test3299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3299");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("                              0.0  0.1-", 'a');
        int int4 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("14001AAAAAA!IHAAAAAAA           ", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test3300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3300");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("                                                    ", "4");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                    " + "'", str2, "                                                    ");
    }

    @Test
    public void test3301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3301");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "aaaaaaAAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!", " . -..-.  . -..-.  . -..-.  . -..-.  . -..-.  . -..-.  . -..-.  . -..-.  . -..-.  . -..-.  . -..-.  . -..-.  . -..-.  . -..-.  . -..-.  . -..-.  . -..-.  . -..-.  . -..-.  . -..-.  . -..-.  . -..-.  . -..-.  . -..-.  . -..-.  . -..-.  . ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3302");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("aaaaaaaaaa", "#############################################0.0     0.1-");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaa" + "'", str2, "aaaaaaaaaa");
    }

    @Test
    public void test3303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3303");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "aaaaaaa10041");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Aaaaaaa10041" + "'", str1, "Aaaaaaa10041");
    }

    @Test
    public void test3304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3304");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("                                                                            AAAAAAAhi!AAAAAA10041", "hi!ih");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3305");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("!ihaaaaaaa");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, "                                                 ", 3, 16);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test3306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3306");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("0. -1.00.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3307");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("-1.0     0.0");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "-1.0     0.0" + "'", str1, "-1.0     0.0");
    }

    @Test
    public void test3308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3308");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("", "-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test3309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3309");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("IH!IHAAAAAAA                                                                                       0.00.0");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "IH!IHAAAAAAA 0.00.0" + "'", str1, "IH!IHAAAAAAA 0.00.0");
    }

    @Test
    public void test3310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3310");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("aaahi!i!                                                                                          aaaaaaahi!hi!                                                                                          aaaaaaahi!hi!                                                                                          aaaaaaahi!hi!                                                                                          aaaaaaahi!hi!                                                                                          aaaaaaahi!hi!                                                                                          aaaaaaahi!hi!                                                                                          aaaaaaahi!hi!                                                                                          aaaaaaahi!hi!                                                                                          aaaaaaahi!hi!####", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!i!                                                                                          hi!hi!                                                                                          hi!hi!                                                                                          hi!hi!                                                                                          hi!hi!                                                                                          hi!hi!                                                                                          hi!hi!                                                                                          hi!hi!                                                                                          hi!hi!                                                                                          hi!hi!####" + "'", str2, "hi!i!                                                                                          hi!hi!                                                                                          hi!hi!                                                                                          hi!hi!                                                                                          hi!hi!                                                                                          hi!hi!                                                                                          hi!hi!                                                                                          hi!hi!                                                                                          hi!hi!                                                                                          hi!hi!####");
    }

    @Test
    public void test3311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3311");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("!ihaaaaaaa                                                   ", 0, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3312");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("           AAAAAAAHI!AAAAAA1004", 13);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3313");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("                                                                            AAAAAAAHI!AAAAAA10041", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test3314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3314");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate(" 0.0  0.1-", 17, 101);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " 0.0  0.1-" + "'", str3, " 0.0  0.1-");
    }

    @Test
    public void test3315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3315");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("aa   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaahi!i!                                                                                          AAAAAAAHI!hi!                                                                                          AAAAAAAHI!hi!                                                                                          AAAAAAAHI!hi!                                                                                          AAAAAAAHI!hi!                                                                                          AAAAAAAHI!hi!                                                                                          AAAAAAAHI!hi!                                                                                          AAAAAAAHI!hi!                                                                                          AAAAAAAHI!hi!                                                                                          AAAAAAAHI!hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test3316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3316");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("AAAAAAAHI!I!aaaaaaahi!HI!aaaaaaahi!HI!aaaaaaahi!HI!aaaaaaahi!HI!aaaaaaahi!HI!aaaaaaahi!HI!aaaaaaahi!HI!aaaaaaahi!HI!aaaaaaahi!HI!", 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AAAAAAAHI!I!aaaaaaahi!HI!aaaaaaahi!HI!aaaaaaahi!HI!aaaaaaahi!HI!aaaaaaahi!HI!aaaaaaahi!HI!aaaaaaahi!HI!aaaaaaahi!HI!aaaaaaahi!HI!" + "'", str2, "AAAAAAAHI!I!aaaaaaahi!HI!aaaaaaahi!HI!aaaaaaahi!HI!aaaaaaahi!HI!aaaaaaahi!HI!aaaaaaahi!HI!aaaaaaahi!HI!aaaaaaahi!HI!aaaaaaahi!HI!");
    }

    @Test
    public void test3317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3317");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("-1.0  0.0 44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "aaaaaaahi!i!                                                                                          AAAAAAAHI!hi!                                                                                          AAAAAAAHI!hi!                                                                                          AAAAAAAHI!hi!                                                                                          AAAAAAAHI!hi!                                                                                          AAAAAAAHI!hi!                                                                                          AAAAAAAHI!hi!                                                                                          AAAAAAAHI!hi!                                                                                          AAAAAAAHI!hi!                                                                                          AAAAAAAHI!hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3318");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("AAAAAAAHI!I!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AAAAAAAHI!I!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!" + "'", str1, "AAAAAAAHI!I!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!");
    }

    @Test
    public void test3319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3319");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("", 825, "0. -1.0");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1." + "'", str3, "0. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.");
    }

    @Test
    public void test3320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3320");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("4444444444444444444                                                                                      ", "100", (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3321");
        char[] charArray3 = new char[] {};
        boolean boolean4 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "-1.0     0.0", charArray3);
        int int5 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "                                                                                          aaaaaaahi!", charArray3);
        int int6 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "#############aaaaaaahi!#-1.0#####0.-1.0   AAAAAAA10040.", charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test3322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3322");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("aaaaaaa10041", "               hi               ", 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaa10041" + "'", str3, "aaaaaaa10041");
    }

    @Test
    public void test3323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3323");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("!ihaaaaaaa                                                   ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                   aaaaaaahi!" + "'", str1, "                                                   aaaaaaahi!");
    }

    @Test
    public void test3324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3324");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "                                                                                  ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                  " + "'", str1, "                                                                                  ");
    }

    @Test
    public void test3325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3325");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "-1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  00.00.00  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3326");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("        ", "##########################################################################################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "        " + "'", str2, "        ");
    }

    @Test
    public void test3327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3327");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("aaaaaaahi!aaaaaa10041", "####### AAAAAAA10040. ###################aaaaaaahi!#-1.0#####0.-1.0 AAAAAAA1004aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3328");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("#############aaaaaaahi!#-1.0#####0.", (int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3329");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0", "...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3330");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("               !IHAAAAAAA               ", ' ');
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!IHAAAAAAA" + "'", str3, "!IHAAAAAAA");
    }

    @Test
    public void test3331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3331");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "aaaaaaahi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test3332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3332");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("!iha!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa", "                                               hi!                                               ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "a!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa" + "'", str2, "a!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa");
    }

    @Test
    public void test3333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3333");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("                                                                               AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI", "1.0     0.1.0  0.0 ##################################################################################");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3334");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("#############", 10, "                                        -1.0     0.");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#############" + "'", str3, "#############");
    }

    @Test
    public void test3335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3335");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("4444444444444444444444444444440.0440.1-", (int) (byte) 0, 7);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4444444" + "'", str3, "4444444");
    }

    @Test
    public void test3336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3336");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("hi!ihaaaaaaa                ###################aaaaaaahi!#-1.0#####0.-1.0   AAAAAAA10040.                #######", 105);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test3337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3337");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("                                                                  AAAAAAAHI!AAAAAA10041       ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AAAAAAAHI!AAAAAA10041" + "'", str1, "AAAAAAAHI!AAAAAA10041");
    }

    @Test
    public void test3338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3338");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("-1.00.0", "aaaaaaahi!");
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "                                   ", (int) (byte) 10, (int) (byte) 0);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1.00.0" + "'", str7, "-1.00.0");
    }

    @Test
    public void test3339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3339");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("", "                ###################aaaaaaahi!#-1.0#####0.-1.0   AAAAAAA10040.                #######", (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3340");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty(".0  0.", "a!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ".0  0." + "'", str2, ".0  0.");
    }

    @Test
    public void test3341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3341");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("HI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!", "aaaaaaa1004", 24);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test3342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3342");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("1004", "0.00.0");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3343");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("########");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "########" + "'", str1, "########");
    }

    @Test
    public void test3344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3344");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("0.00.0                                                                                       aaaaaaahi!HI", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0.00.0                                                                                       aaaaaaahi!HI" + "'", str2, "0.00.0                                                                                       aaaaaaahi!HI");
    }

    @Test
    public void test3345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3345");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("aaaaaaahi!444444444444444444444444444444444444444444", "aaaaaaahi!aaaaaa10041                                                                                                                                                                                                                                                                                                                                                                                                                                 ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaahi!444444444444444444444444444444444444444444" + "'", str2, "aaaaaaahi!444444444444444444444444444444444444444444");
    }

    @Test
    public void test3346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3346");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("", "0.0");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3347");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("AAAAAAAHI!AAAAAA1004", "HI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI", 42);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test3348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3348");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("aaaaaaahi!", "aaaaaaahi!", (int) (short) 10);
        java.lang.Class<?> wildcardClass4 = strArray3.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test3349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3349");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "aaahi!i!                                                                                          AAAAAAAHI!hi!                                                                                          AAAAAAAHI!hi!                                                                                          AAAAAAAHI!hi!                                                                                          AAAAAAAHI!hi!                                                                                          AAAAAAAHI!hi!                                                                                          AAAAAAAHI!hi!                                                                                          AAAAAAAHI!hi!                                                                                          AAAAAAAHI!hi!                                                                                          AAAAAAAHI!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3350");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("hI!                                                                                          ", "0.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3351");
        char[] charArray8 = new char[] { '#', '4', ' ', '4' };
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "", charArray8);
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                                                                                          aaaaaaa10041", charArray8);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsAny("aaaaaaa", charArray8);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HIAAAAAAAhi!AAAAAA10041", charArray8);
        java.lang.Class<?> wildcardClass13 = charArray8.getClass();
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "#4 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "#4 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[#, 4,  , 4]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3352");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "                                       a                                                                                                    a                                                                                                    a                                 0.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0                                                  a                                                                                                    a                                                                                                    a                                 ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3353");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("44444!IHAAAAAAA4444444444444444440.0440.1-", (int) (byte) 10, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "44444!IHAAAAAAA4444444444444444440.0440.1-" + "'", str3, "44444!IHAAAAAAA4444444444444444440.0440.1-");
    }

    @Test
    public void test3354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3354");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("AAAAAAAHI!AAAAAA10041", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3355");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("", "                                AAAAAAAHI!AAAAAA1004");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test3356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3356");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("", "44444444444444444444440. -1.044444444444444444444444", (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3357");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("", "        -1.0     0.0");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test3358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3358");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("-1.0     0.", "                                   ");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "   aaaaaaa1004");
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray2);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, 'a', (int) (short) 10, 41);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1.0   aaaaaaa10040." + "'", str4, "-1.0   aaaaaaa10040.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-1.00." + "'", str5, "-1.00.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test3359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3359");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                                        -1.0     0.                                        -1.0     0.                                        -1.0     0.                                        -1.0     0.                                        -1.0     0.                                        -1.0     0.                                        -1.0     0.                                        -1.0     0.                                        -1.0     0.                                        -1.0     0.                                        -1.0     0.aaaaaaahi!aaaaaa1                                        -1.0     0.                                        -1.0     0.41", "AAAAAA1001");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test3360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3360");
        java.lang.String[] strArray1 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithAny("10041", strArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3361");
        java.lang.String[] strArray1 = null;
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("               !IHAAAAAAA               ", strArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3362");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("aaaaaaa");
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, '#', 6, 3);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test3363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3363");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("#                                                                                          aaaaaaahi!", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#                                                                                          aaaaaaahi!" + "'", str2, "#                                                                                          aaaaaaahi!");
    }

    @Test
    public void test3364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3364");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfBlank("                                                                              ####4                 ", "-");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                              ####4                 " + "'", str2, "                                                                              ####4                 ");
    }

    @Test
    public void test3365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3365");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "aa   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "a0.0 a -1.0a 0.0 a0.0-1.0 a -1.0a 0.0 a0.0-1.0 a -1.0a 0.0 a0.0-1.0 a -1.0a 0.0 a0.0-1.0 a -1.0a 0.0 a0.0-1.0 a -1.0a 0.0 a0.0-1.0 a -1.0a 0.0 a0.0-1.0 a -1.0a 0.0 a0.0-1.0 a -1.0a 0.0 a0.0-1.0 a -1.0a");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test3366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3366");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("A", '#');
        boolean boolean4 = org.apache.commons.lang3.StringUtils.endsWithAny("                                                  a                                                                                                    a                                                                                                    a                                 0.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0                                                  a                                                                                                    a                                                                                                    a                                 ", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test3367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3367");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate(" 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1-", 630, 95);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "... 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1..." + "'", str3, "... 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1...");
    }

    @Test
    public void test3368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3368");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("!ihaaaaaaa");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.concatWith("aaaaaaa                                                                                          ", (java.lang.Object[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!aaaaaaa                                                                                          ihaaaaaaa" + "'", str3, "!aaaaaaa                                                                                          ihaaaaaaa");
    }

    @Test
    public void test3369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3369");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("AAAAAAAHI!AAAAAA10041AAAAAAAHI!AAAAAA10041AAAAAAAI!IAAAAAAAHI!AAAAAA10041AAAAAAAHI!AAAAAA10041AAA...", "                                                                                      ", "44444444444444444444444444444444                                          ", 16);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "AAAAAAAHI!AAAAAA10041AAAAAAAHI!AAAAAA10041AAAAAAAI!IAAAAAAAHI!AAAAAA10041AAAAAAAHI!AAAAAA10041AAA..." + "'", str4, "AAAAAAAHI!AAAAAA10041AAAAAAAHI!AAAAAA10041AAAAAAAI!IAAAAAAAHI!AAAAAA10041AAAAAAAHI!AAAAAA10041AAA...");
    }

    @Test
    public void test3370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3370");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                                                          ");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "-1.0  0.0 ");
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.split("                              0.0  0.1-", 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("aaaaa", strArray2, strArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 91 vs 1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 " + "'", str4, "-1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 ");
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void test3371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3371");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("                                               i!                                               ", '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                               i!                                               " + "'", str2, "                                               i!                                               ");
    }

    @Test
    public void test3372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3372");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("14001AAAAAA!IHAAAAAAA                                                                  ", "aAAAAAAhi!AAAAAA10041AAAAAAAhi!AAAAAA10041AAAAAAAi!iAAAAAAAhi!AAAAAA10041AAAAAAAhi!AAAAAA10041AAA...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "IHAAAAAAA                                                                  " + "'", str2, "IHAAAAAAA                                                                  ");
    }

    @Test
    public void test3373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3373");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0" + "'", str1, "-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0-1.0  0.0");
    }

    @Test
    public void test3374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3374");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("... ...", "  .    . -");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3375");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("-1.0     0-1.0     0-1.0     0-1.0     0", '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-1.0     0-1.0     0-1.0     0-1.0     0" + "'", str2, "-1.0     0-1.0     0-1.0     0-1.0     0");
    }

    @Test
    public void test3376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3376");
        char[] charArray5 = new char[] { '#', '4', '4', '#' };
        int int6 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "        ...", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "#44#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "#44#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[#, 4, 4, #]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test3377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3377");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("Aaaaaaahi!aaaaaa10041", "                                                                                                   100", 32);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test3378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3378");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("aaaaaaa                                                                                          ", "ih!IHAAAAAAA                                                                                       0.00.0");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaa                                                                                          " + "'", str2, "aaaaaaa                                                                                          ");
    }

    @Test
    public void test3379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3379");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("444444444444440.1- .04444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "444444444444440.1- .04444444444444444444444" + "'", str1, "444444444444440.1- .04444444444444444444444");
    }

    @Test
    public void test3380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3380");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("                                                                                     -1.0  0.0 ", 35, (int) '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                 " + "'", str3, "                 ");
    }

    @Test
    public void test3381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3381");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("aaaaa", "AAAAAAAHI!I!aaaaaaahi!HI!aaaaaaahi!HI!aaaaaaahi!HI!aaaaaaahi!HI!aaaaaaahi!HI!aaaaaaahi!HI!aaaaaaahi!HI!aaaaaaahi!HI!aaaaaaahi!HI!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3382");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("       AAAAAAA1004aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa      ###################aaaaaaahi!#-1.0#####0.-1.0   AAAAAAA10040.                #######", "0. -1.0");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3383");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("-1.00.0", "               hi               ", 6);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3384");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("!ihAAAAAAA       ", "aaaaaaa10041");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test3385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3385");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("-1.0   AAAAAAA10040.", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-1.0   AAAAAAA10040." + "'", str2, "-1.0   AAAAAAA10040.");
    }

    @Test
    public void test3386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3386");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("aaaaaaahi!aaaaaa10041", "A   AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaahi!aaaaaa10041" + "'", str2, "aaaaaaahi!aaaaaa10041");
    }

    @Test
    public void test3387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3387");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "    ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test3388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3388");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("#############################################0.0     0.1-", "AAAAAAA1004");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3389");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("a0.0 a -1.0a 0.0 a0.0-1.0 a -1.0a 0.0 a0.0-1.0 a -1.0a 0.0 a0.0-1.0 a -1.0a 0.0 a0.0-1.0 a -1.0a 0.0 a0.0-1.0 a -1.0a 0.0 a0.0-1.0 a -1.0a 0.0 a0.0-1.0 a -1.0a 0.0 a0.0-1.0 a -1.0a 0.0 a0.0-1.0 a -1.0a", "                                                                                          aaaaaaa10041");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3390");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("hi!i!                                                                                          hi!hi!                                                                                          hi!hi!                                                                                          hi!hi!                                                                                          hi!hi!                                                                                          hi!hi!                                                                                          hi!hi!                                                                                          hi!hi!                                                                                          hi!hi!                                                                                          hi!hi!####", 86);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3391");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("        4####                                                             ", "4                                                                                                ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "        4####                                                             " + "'", str2, "        4####                                                             ");
    }

    @Test
    public void test3392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3392");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("-1.0  0.0", "aaaaaaahi!");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("-1.0     0.0", "", 100);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.replaceEach("", strArray4, strArray8);
        int int10 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray4);
        java.lang.String[] strArray11 = org.apache.commons.lang3.StringUtils.stripAll(strArray4);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(strArray11);
    }

    @Test
    public void test3393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3393");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("hi4444444444444444444444444444440.0440.1-!", " 0.0  0.1-", "AAAAAAAhi!AAAAAA10041", (int) 'a');
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi4444444444444444444444444444440.0440.1-!" + "'", str4, "hi4444444444444444444444444444440.0440.1-!");
    }

    @Test
    public void test3394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3394");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("", "-1.0  0.0 ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3395");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("#                                                                                          aaaaaaahi!", 61);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                              aaaaaaahi!" + "'", str2, "                              aaaaaaahi!");
    }

    @Test
    public void test3396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3396");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("4", ' ');
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4" + "'", str4, "4");
    }

    @Test
    public void test3397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3397");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("1.0     0.");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test3398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3398");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("                                                 -1.0  0.0                                                  ", 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3399");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "0.0");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0.0" + "'", str1, "0.0");
    }

    @Test
    public void test3400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3400");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ", "0.0");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3401");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("hi!aaaaaa1004", "                                                                                  AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!aaaaaa1004" + "'", str3, "hi!aaaaaa1004");
    }

    @Test
    public void test3402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3402");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("HI!                                                                                          aaaa", "                                                  a                                                                                                    a                                                                                                    a                                 0.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0                                                  a                                                                                                    a                                                                                                    a                                 ");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test3403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3403");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("", "0. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.00. -1.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test3404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3404");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "HI!                                                                                          ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI!                                                                                          " + "'", str1, "HI!                                                                                          ");
    }

    @Test
    public void test3405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3405");
        char[] charArray12 = new char[] { '#', '4', ' ', '4' };
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "", charArray12);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                                                                                          aaaaaaa10041", charArray12);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "                                                                                          aaaaaaa10041", charArray12);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "hi!ihaaaaaaa", charArray12);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsAny("                                               hi!                                               ", charArray12);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                                                                                          aaaaaaahi!", charArray12);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "aaaaaaahi!aaaaaa10041", charArray12);
        boolean boolean20 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "0.1- #############################################0.0", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "#4 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "#4 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[#, 4,  , 4]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test3406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3406");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("aaaaaaa1004", "0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3407");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "aAAAAAAhi!AAAAAA10041AAAAAAAhi!AAAAAA10041AAAAAAAi!iAAAAAAAhi!AAAAAA10041AAAAAAAhi!AAAAAA10041AAA...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test3408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3408");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("-1.0 0.0", "                                           aaaaaaahi!HI!                                            ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                           aaaaaaahi!HI!                                            " + "'", str2, "                                           aaaaaaahi!HI!                                            ");
    }

    @Test
    public void test3409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3409");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 95);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                          aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                           " + "'", str2, "                          aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                           ");
    }

    @Test
    public void test3410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3410");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("                                          ", "1.0  0.0                                  ", 74);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3411");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("aaahi!i!                                                                                          aaaaaaahi!hi!                                                                                          aaaaaaahi!hi!                                                                                          aaaaaaahi!hi!                                                                                          aaaaaaahi!hi!                                                                                          aaaaaaahi!hi!                                                                                          aaaaaaahi!hi!                                                                                          aaaaaaahi!hi!                                                                                          aaaaaaahi!hi!                                                                                          aaaaaaahi!hi!", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test3412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3412");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf(" 0.0  0.1-", "hI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3413");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("AAAAAAAHI!I!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!", "-1.0     0.0");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test3414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3414");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("AAAAAAA1004", "                                                             ####4");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, '#');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "AAAAAAA1004" + "'", str4, "AAAAAAA1004");
    }

    @Test
    public void test3415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3415");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("                                        -1.0     0.                                        -1.0     0.                                        -1.0     0.                                        -1.0     0.                                        -1.0     0.                                        -1.0     0.                                        -1.0     0.                                        -1.0     0.                                        -1.0     0.                                        -1.0     0.                                        -1.0     0.aaaaaaahi!aaaaaa1                                        -1.0     0.                                        -1.0     0.41", "4AAAAAAA4AAAAAA4AAAAAA4AAAAAA4AAAAAA4AAAAAA4AAAAAA4AAAAAA4AAAAAA4AAAAAA4AAAAAA4AAAAAA4AAAAAA4AAAAAA4AAAAAA4AAAAAA4AAAAAA4AAAAAA4AAAAAA4AAAAAA4AAAAAA4AAAAAA4AAAAAA4AAAAAA4AAAAAA4AAAAAA4AAAAAA4AAAAAA4AAAAAA4AAAAAA4AAAAAA4AAAAAA4AAAAAA4AAAAAA4AAAAAA4AAAAAA4AAAAAA4AAAAAA4AAAAAA4AAAAAA4AAAAAA4AAAAAA4AAAAAA4AAAAAA4AAAAAA4AAAAAA4AAAAAA4AAAAAA4AAAAAA4AAAAAA4AAAAAA4AAAAAA4AAAAAA4AAAAAA4AAAAAA4AAAAAA4AAAAAA4AAAAAA4AAAAAA4AAAAAA4AAAAAA4AAAAAA4AAAAAA4AAAAAA4AAAAAA4AAAAAA4AAAAAA");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test3416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3416");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("4", ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4" + "'", str2, "4");
    }

    @Test
    public void test3417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3417");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("aaaaaaaaaa");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.stripAll(strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test3418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3418");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("aaaaaahi", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3419");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("4###", 20, 41);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3420");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("100410.00.0                                    ", 74, (int) 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test3421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3421");
        char[] charArray6 = new char[] {};
        boolean boolean7 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "-1.0     0.0", charArray6);
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                                                                                          aaaaaaahi!", charArray6);
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "aaaaaaahi!", charArray6);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsAny("-1.0  0.0 ", charArray6);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "0", charArray6);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "                ###################aaaaaaahi!#-1.0#####0.-1.0   AAAAAAA10040.                #######", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test3422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3422");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("AAAA10041", "hI!                                                                                          ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3423");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("                                               hi!                                               ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!" + "'", str1, "hi!");
    }

    @Test
    public void test3424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3424");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "44444441004");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test3425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3425");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("AAAAAAAhi!AAAAAA10041AAAAAAAhi!AAAAAA10041AAAAAAAi!iAAAAAAAhi!AAAAAA10041AAAAAAAhi!AAAAAA10041AAAAAAAh");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AAAAAAAhi!AAAAAA10041AAAAAAAhi!AAAAAA10041AAAAAAAi!iAAAAAAAhi!AAAAAA10041AAAAAAAhi!AAAAAA10041AAAAAAAh" + "'", str1, "AAAAAAAhi!AAAAAA10041AAAAAAAhi!AAAAAA10041AAAAAAAi!iAAAAAAAhi!AAAAAA10041AAAAAAAhi!AAAAAA10041AAAAAAAh");
    }

    @Test
    public void test3426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3426");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("-1.0a0.0");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "-1.0a0.0" + "'", str1, "-1.0a0.0");
    }

    @Test
    public void test3427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3427");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HIAAAAAAAhi!AAAAAA10041", 'a');
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test3428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3428");
        char[] charArray13 = new char[] { '#', '4', ' ', '4' };
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "", charArray13);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                                                                                          aaaaaaa10041", charArray13);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "                                                                                          aaaaaaa10041", charArray13);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "hi!ihaaaaaaa", charArray13);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsAny("                                               hi!                                               ", charArray13);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                                                                                          aaaaaaahi!", charArray13);
        int int20 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "-1.0     0.0", charArray13);
        boolean boolean21 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "#################################################0.0##################################################", charArray13);
        int int22 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!AAAAAA10041", charArray13);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "#4 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "#4 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[#, 4,  , 4]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 12 + "'", int22 == 12);
    }

    @Test
    public void test3429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3429");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf(".0  0.1-", "aaaaaahi", 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3430");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "#############################################0.0     0.1-                                        ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3431");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "                              aaaaaaahi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3432");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("-1.0  0.0", "", 0);
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "                                        -1.0     0.0");
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray5, "44444444444444444444444444444444");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test3433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3433");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfAny("####### AAAAAAA10040. ###################aaaaaaahi!#-1.0#####0.-1.0 AAAAAAA1004aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
    }

    @Test
    public void test3434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3434");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("-1.0     0.");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test3435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3435");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("aaaaaaa                                                                                          ", "-1.0     0.0");
        boolean boolean4 = org.apache.commons.lang3.StringUtils.startsWithAny("HI!ihaaaaaa                                      aaaaaaahi!HI!ihaaaaaa                                      aaaaaaahi!HI!ihaaaaaa                                      aaaaaaahi!HI!ihaaaaaa                                      aaaaaaahi!HI!ihaaaaaa                                      aaaaaaahi!HI!ihaaaaaa                                      aaaaaaahi!HI!ihaaaaaa                                      aaaaaaahi!HI!ihaaaaaa                                      aaaaaaahi!HI!ihaaaaaa                                      aaaaaaahi!HI", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test3436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3436");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("aa        ", (int) (byte) 100, (-1));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test3437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3437");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("           aaaaaaahi!aaaaaa10041", "AAAAAAAhi!AAAAAA10041AAAAAAAhi!AAAAAA10041AAAAAAAi!iAAAAAAAhi!AAAAAA10041AAAAAAAhi!AAAAAA10041AAAAAAAh");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test3438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3438");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("-1.0a a a0.0", 105);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-1.0a a a0.0" + "'", str2, "-1.0a a a0.0");
    }

    @Test
    public void test3439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3439");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3440");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("hi!i", "aaaaaaahi!aaaaaa10041                                                                                                                                                                                                                                                                                                                                                                                                                                 ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!i" + "'", str2, "hi!i");
    }

    @Test
    public void test3441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3441");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("        4####                                                             ", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "        4####                                                             " + "'", str2, "        4####                                                             ");
    }

    @Test
    public void test3442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3442");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("444444444444440.1- .044444444...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test3443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3443");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "                                                                                          aaaaaaa10041");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3444");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("IH!IHAAAAAAA 0.00.0", (int) (byte) 10, 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3445");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!aaaaaa1004", "                                                 -1.0  0.0                                                  ", (int) '#');
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, 'a', 106, 0);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test3446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3446");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad(".HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HIAAAAAAAhi!AAAAAA10041", 939);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ".HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HIAAAAAAAhi!AAAAAA10041" + "'", str2, ".HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HIAAAAAAAhi!AAAAAA10041");
    }

    @Test
    public void test3447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3447");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa10041");
        boolean boolean3 = org.apache.commons.lang3.StringUtils.endsWithAny("aaaaaaahi!i!                                                                                          AAAAAAAHI!hi!                                                                                          AAAAAAAHI!hi!                                                                                          AAAAAAAHI!hi!                                                                                          AAAAAAAHI!hi!                                                                                          AAAAAAAHI!hi!                                                                                          AAAAAAAHI!hi!                                                                                          AAAAAAAHI!hi!                                                                                          AAAAAAAHI!hi!                                                                                          AAAAAAAHI!hi!", strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test3448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3448");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("... ...");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test3449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3449");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByCharacterType("        ...");
        boolean boolean5 = org.apache.commons.lang3.StringUtils.endsWithAny("0.00.0                                    ", strArray4);
        int int6 = org.apache.commons.lang3.StringUtils.indexOfAny("                                                                                          ", strArray4);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.stripAll(strArray4, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray8, "", 42, 4);
        java.lang.String[] strArray14 = org.apache.commons.lang3.StringUtils.stripAll(strArray8, "######################################################");
        boolean boolean15 = org.apache.commons.lang3.StringUtils.startsWithAny("IH!IHAAAAAAA 0.00.0", strArray14);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test3450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3450");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("-1.0     0", 94, "aaaaaaahi!aaaaaa1004");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-1.0     0aaaaaaahi!aaaaaa1004aaaaaaahi!aaaaaa1004aaaaaaahi!aaaaaa1004aaaaaaahi!aaaaaa1004aaaa" + "'", str3, "-1.0     0aaaaaaahi!aaaaaa1004aaaaaaahi!aaaaaa1004aaaaaaahi!aaaaaa1004aaaaaaahi!aaaaaa1004aaaa");
    }

    @Test
    public void test3451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3451");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "-1.0     0.0");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3452");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3453");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("4!ihaaaaaaa                            ...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4!ihaaaaaaa                            ..." + "'", str1, "4!ihaaaaaaa                            ...");
    }

    @Test
    public void test3454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3454");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase(".00.1-", "a!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3455");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("AAAAAAA10041", "aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!", 3);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3456");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("               !IHAAAAAAA               ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test3457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3457");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("                                                 ", "aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test3458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3458");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("                                                                                     ...", "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444-1.0  0.0", 41);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test3459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3459");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("AAAAAAA10041", "!ih!IHAAAAAAA                                 ...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3460");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "########################################-1.0#####0.");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "########################################-1.0#####0." + "'", str1, "########################################-1.0#####0.");
    }

    @Test
    public void test3461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3461");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "###########################################################################################################################################################################                                               i!                                               ###########################################################################################################################################################################");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3462");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("-1.0  0.0                               ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test3463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3463");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase(" . -..-.  . -..-.  . -..-.  . -..-.  . -..-.  . -..-.  . -..-.  . -..-.  . -..-.  . -..-.  . -..-.  . -..-.  . -..-.  . -..-.  . -..-.  . -..-.  . -..-.  . -..-.  . -..-.  . -..-.  . -..-.  . -..-.  . -..-.  . -..-.  . -..-.  . -..-.  . ", "                                                    ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " . -..-.  . -..-.  . -..-.  . -..-.  . -..-.  . -..-.  . -..-.  . -..-.  . -..-.  . -..-.  . -..-.  . -..-.  . -..-.  . -..-.  . -..-.  . -..-.  . -..-.  . -..-.  . -..-.  . -..-.  . -..-.  . -..-.  . -..-.  . -..-.  . -..-.  . -..-.  . " + "'", str2, " . -..-.  . -..-.  . -..-.  . -..-.  . -..-.  . -..-.  . -..-.  . -..-.  . -..-.  . -..-.  . -..-.  . -..-.  . -..-.  . -..-.  . -..-.  . -..-.  . -..-.  . -..-.  . -..-.  . -..-.  . -..-.  . -..-.  . -..-.  . -..-.  . -..-.  . -..-.  . ");
    }

    @Test
    public void test3464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3464");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "HI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI", "1.00.0");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3465");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!", 102, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!##########################################" + "'", str3, "AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!##########################################");
    }

    @Test
    public void test3466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3466");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("0.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0-1.00.0", "                                                                  AAAAAAAHI!AAAAAA10041");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test3467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3467");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) ".0  0.1-");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test3468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3468");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("14001AAAAAA!IHAAAAAAA           ", "!ihaaaaaaa                                                                                          ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3469");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa-...", "   ");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test3470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3470");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "AAAAAAAHI!I!aaaaaaahi!HI!aaaaaaahi!HI!aaaaaaahi!HI!aaaaaaahi!HI!aaaaaaahi!HI!aaaaaaahi!HI!aaaaaaahi!HI!aaaaaaahi!HI!aaaaaaahi!HI!", 92);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3471");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("   4");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "   4" + "'", str1, "   4");
    }

    @Test
    public void test3472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3472");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfBlank((java.lang.CharSequence) "hi!AAAAAA10041", (java.lang.CharSequence) "0.00.0...");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "hi!AAAAAA10041" + "'", charSequence2, "hi!AAAAAA10041");
    }

    @Test
    public void test3473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3473");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad(" 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1-", (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1-" + "'", str2, " 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1- 0.0  0.1-");
    }

    @Test
    public void test3474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3474");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("44444441004", "44444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44444441004" + "'", str2, "44444441004");
    }

    @Test
    public void test3475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3475");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("0.0a a a0.1-", "14001aaaaaa!ihaaaaaaa", 40);
        java.lang.Class<?> wildcardClass4 = strArray3.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test3476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3476");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("0.00.0", "aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  aaaaaaah  ", 16);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test3477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3477");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "-1.00.0#############################################");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 52 + "'", int1 == 52);
    }

    @Test
    public void test3478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3478");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "444444444444440.1- .044444444...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3479");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("aaaaaaa                              0.0  0.1-HI!hi!", "                                                  a                                                  ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3480");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                                                                               AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI", "                                         -1.0  0.0                                                  ", 6);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test3481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3481");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.", "                                   ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0." + "'", str2, "-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.");
    }

    @Test
    public void test3482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3482");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("aaaaaaahi!", "#############################################0.0     0.1-", 95);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test3483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3483");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) ".0#####0.1-#!IHAAAAAAA#############");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3484");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("AAAAAAAHI!HI!AAAAAAAHI!HI!AAAAAAAHI!HI!AAAAAAAHI!HI!AAAAAAAHI!HI!AAAAAAAHI!HI!AAAAAAAHI!HI!AAAAAAAHI!HI!AAAAAAAHI!HI", 'a', '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "AAAAAAAHI!HI!AAAAAAAHI!HI!AAAAAAAHI!HI!AAAAAAAHI!HI!AAAAAAAHI!HI!AAAAAAAHI!HI!AAAAAAAHI!HI!AAAAAAAHI!HI!AAAAAAAHI!HI" + "'", str3, "AAAAAAAHI!HI!AAAAAAAHI!HI!AAAAAAAHI!HI!AAAAAAAHI!HI!AAAAAAAHI!HI!AAAAAAAHI!HI!AAAAAAAHI!HI!AAAAAAAHI!HI!AAAAAAAHI!HI");
    }

    @Test
    public void test3485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3485");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("#################################Aaaaaaahi!aaaaaa10041##################################");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test3486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3486");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("4", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test3487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3487");
        java.lang.CharSequence charSequence0 = null;
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty(charSequence0, (java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        HI!");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        HI!" + "'", charSequence2, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        HI!");
    }

    @Test
    public void test3488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3488");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("-1.0a0.0", 0, "aaaaaaahi");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-1.0a0.0" + "'", str3, "-1.0a0.0");
    }

    @Test
    public void test3489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3489");
        char[] charArray10 = new char[] { '#', '4', ' ', '4' };
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "", charArray10);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                                                                                          aaaaaaa10041", charArray10);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "                                                                                          aaaaaaa10041", charArray10);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                                                                                                    ", charArray10);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "           AAAAAAAHI!AAAAAA10041", charArray10);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "#############aaaaaaahi!#-1.0#####0.", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "#4 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "#4 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[#, 4,  , 4]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 11 + "'", int15 == 11);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test3490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3490");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "-", (java.lang.CharSequence) "                                                 -1.0  0.0                                                  ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test3491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3491");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("0.00.0                                                                                       aaaaaaahi!HI!", "####### AAAAAAA10040. ###################aaaaaaahi!#-1.0#####0.-1.0 AAAAAAA1004aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3492");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("4!ihaaaaaaa                                                                                                                                                                                          ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test3493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3493");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("-1.0a a a0.0-1.0a a a0.0-1.0a a a0.0-1.0a a a0.0-1.0a a a0.0-1.0a a a0.0-1.0a a a0.0-1.0a a a0.0-1.0a a a0.0-1.0a a a0.0-1.0a a a0.0-1.0a a a0.0-1.0a a a0.0-1.0a a a0.0-1.0a a a0.0-1.0a a a0.0-1.0a a a0.0-1.0a a a0.0-1h-1.0a a a0.0-1.0a a a0.0-1.0a a a0.0-1.0a a a0.0-1.0a a a0.0-1.0a a a0.0-1.0a a a0.0-1.0a a a0.0-1.0a a a0.0-1.0a a a0.0-1.0a a a0.0-1.0a a a0.0-1.0a a a0.0-1.0a a a0.0-1.0a a a0.0-1.0a a a0.0-1.0a a a0.0-1.0a a a0.0-1.", 106, "aaaaaaa1004");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-1.0a a a0.0-1.0a a a0.0-1.0a a a0.0-1.0a a a0.0-1.0a a a0.0-1.0a a a0.0-1.0a a a0.0-1.0a a a0.0-1.0a a a0.0-1.0a a a0.0-1.0a a a0.0-1.0a a a0.0-1.0a a a0.0-1.0a a a0.0-1.0a a a0.0-1.0a a a0.0-1.0a a a0.0-1.0a a a0.0-1h-1.0a a a0.0-1.0a a a0.0-1.0a a a0.0-1.0a a a0.0-1.0a a a0.0-1.0a a a0.0-1.0a a a0.0-1.0a a a0.0-1.0a a a0.0-1.0a a a0.0-1.0a a a0.0-1.0a a a0.0-1.0a a a0.0-1.0a a a0.0-1.0a a a0.0-1.0a a a0.0-1.0a a a0.0-1.0a a a0.0-1." + "'", str3, "-1.0a a a0.0-1.0a a a0.0-1.0a a a0.0-1.0a a a0.0-1.0a a a0.0-1.0a a a0.0-1.0a a a0.0-1.0a a a0.0-1.0a a a0.0-1.0a a a0.0-1.0a a a0.0-1.0a a a0.0-1.0a a a0.0-1.0a a a0.0-1.0a a a0.0-1.0a a a0.0-1.0a a a0.0-1.0a a a0.0-1h-1.0a a a0.0-1.0a a a0.0-1.0a a a0.0-1.0a a a0.0-1.0a a a0.0-1.0a a a0.0-1.0a a a0.0-1.0a a a0.0-1.0a a a0.0-1.0a a a0.0-1.0a a a0.0-1.0a a a0.0-1.0a a a0.0-1.0a a a0.0-1.0a a a0.0-1.0a a a0.0-1.0a a a0.0-1.0a a a0.0-1.");
    }

    @Test
    public void test3494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3494");
        java.lang.Object[] objArray0 = null;
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(objArray0, '4', (int) ' ', 911);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test3495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3495");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("HI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3496");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 ##########################################################################################", "                 ", (int) (short) -1);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test3497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3497");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("-1.0  0.0                               ", 18, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-1.0  0.0                               " + "'", str3, "-1.0  0.0                               ");
    }

    @Test
    public void test3498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3498");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("......");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test3499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3499");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("hi!AAAAAA10041", 16, 74);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!AAAAAA10041" + "'", str3, "hi!AAAAAA10041");
    }

    @Test
    public void test3500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3500");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip(".0#####0.1-#!IHAAAAAAA#############", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ".0#####0.1-#!IHAAAAAAA#############" + "'", str2, ".0#####0.1-#!IHAAAAAAA#############");
    }
}

