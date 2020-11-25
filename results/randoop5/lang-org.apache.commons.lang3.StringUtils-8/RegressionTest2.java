import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest2 {

    public static boolean debug = false;

    @Test
    public void test1001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1001");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("           AAAAAAAHI!AAAAAA10041", "4", (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1002");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("                                                                                          AAAAAAA1004");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AAAAAAA1004" + "'", str1, "AAAAAAA1004");
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1003");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("hi!", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA!IHAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1004");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "AAAAAAAHI!I!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1005");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "AAAAAAA1004", (java.lang.CharSequence) "-1.0     0.");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1006");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("AAAAAAA1004", (int) (byte) 10, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "AAAAAAA1004" + "'", str3, "AAAAAAA1004");
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1007");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("0.0a a a0.1-", (int) (short) 10, 939);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0.0a a a0.1-" + "'", str3, "0.0a a a0.1-");
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1008");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("AAAAAAAhi!AAAAAA10041AAAAAAAhi!AAAAAA10041AAAAAAAi!iAAAAAAAhi!AAAAAA10041AAAAAAAhi!AAAAAA10041AAAAAAAh", (int) (byte) 0, (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "AAAAAAAhi!AAAAAA10041AAAAAAAhi!AAAAAA10041AAAAAAAi!iAAAAAAAhi!AAAAAA10041AAAAAAAhi!AAAAAA10041AAA..." + "'", str3, "AAAAAAAhi!AAAAAA10041AAAAAAAhi!AAAAAA10041AAAAAAAi!iAAAAAAAhi!AAAAAA10041AAAAAAAhi!AAAAAA10041AAA...");
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1009");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("", (int) '4', "                                                                                          AAAAAAA1004");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                    " + "'", str3, "                                                    ");
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1010");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("           AAAAAAAHI!AAAAAA1004", "                                                 0.0                                                  ", "                                        -1.0     0.");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1011");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0" + "'", str1, "-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0");
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1012");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfBlank((java.lang.CharSequence) "HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!", (java.lang.CharSequence) "... ...");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!" + "'", charSequence2, "HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!");
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1013");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("-1.0     0.0");
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "#################################################0.0##################################################", 4, 3);
        int int7 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("#############################################0.0     0.1-                                        ", strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1014");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("           AAAAAAAHI!AAAAAA1004");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AAAAAAAHI!AAAAAA1004" + "'", str1, "AAAAAAAHI!AAAAAA1004");
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1015");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "... ...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1016");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("aaaaaaahi!i!                                                                                          AAAAAAAHI!hi!                                                                                          AAAAAAAHI!hi!                                                                                          AAAAAAAHI!hi!                                                                                          AAAAAAAHI!hi!                                                                                          AAAAAAAHI!hi!                                                                                          AAAAAAAHI!hi!                                                                                          AAAAAAAHI!hi!                                                                                          AAAAAAAHI!hi!                                                                                          AAAAAAAHI!hi!", 93, "-1.0  0.");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaahi!i!                                                                                          AAAAAAAHI!hi!                                                                                          AAAAAAAHI!hi!                                                                                          AAAAAAAHI!hi!                                                                                          AAAAAAAHI!hi!                                                                                          AAAAAAAHI!hi!                                                                                          AAAAAAAHI!hi!                                                                                          AAAAAAAHI!hi!                                                                                          AAAAAAAHI!hi!                                                                                          AAAAAAAHI!hi!" + "'", str3, "aaaaaaahi!i!                                                                                          AAAAAAAHI!hi!                                                                                          AAAAAAAHI!hi!                                                                                          AAAAAAAHI!hi!                                                                                          AAAAAAAHI!hi!                                                                                          AAAAAAAHI!hi!                                                                                          AAAAAAAHI!hi!                                                                                          AAAAAAAHI!hi!                                                                                          AAAAAAAHI!hi!                                                                                          AAAAAAAHI!hi!");
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1017");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("AAAAAAA1004");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4001AAAAAAA" + "'", str1, "4001AAAAAAA");
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1018");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("...    ...", "0.0");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...    ..." + "'", str2, "...    ...");
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1019");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("0.00.0", "-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0.00.0" + "'", str2, "0.00.0");
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1020");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("hi!ih       ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI!IH       " + "'", str1, "HI!IH       ");
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1021");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("", "4001AAAAAAA", (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1022");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("##########################################################################################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "##########################################################################################" + "'", str1, "##########################################################################################");
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1023");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("aaaaaaahi!i!                                                                                          AAAAAAAHI!hi!                                                                                          AAAAAAAHI!hi!                                                                                          AAAAAAAHI!hi!                                                                                          AAAAAAAHI!hi!                                                                                          AAAAAAAHI!hi!                                                                                          AAAAAAAHI!hi!                                                                                          AAAAAAAHI!hi!                                                                                          AAAAAAAHI!hi!                                                                                          AAAAAAAHI!hi!", 102, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaahi!i!                                                                                          AAAAAAAHI!hi!                                                                                          AAAAAAAHI!hi!                                                                                          AAAAAAAHI!hi!                                                                                          AAAAAAAHI!hi!                                                                                          AAAAAAAHI!hi!                                                                                          AAAAAAAHI!hi!                                                                                          AAAAAAAHI!hi!                                                                                          AAAAAAAHI!hi!                                                                                          AAAAAAAHI!hi!" + "'", str3, "aaaaaaahi!i!                                                                                          AAAAAAAHI!hi!                                                                                          AAAAAAAHI!hi!                                                                                          AAAAAAAHI!hi!                                                                                          AAAAAAAHI!hi!                                                                                          AAAAAAAHI!hi!                                                                                          AAAAAAAHI!hi!                                                                                          AAAAAAAHI!hi!                                                                                          AAAAAAAHI!hi!                                                                                          AAAAAAAHI!hi!");
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1024");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("10041", "!ihaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1025");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("                                                                                                    ", "AAAAAAAHI!I!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!", 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1026");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("           aaaaaaahi!aaaaaa10041");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "           aaaaaaahi!aaaaaa10041" + "'", str1, "           aaaaaaahi!aaaaaa10041");
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1027");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("0.00.0                                                                                       aaaaaaahi!HI!", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0.00.0                                                                                       aaaaaaahi!HI" + "'", str2, "0.00.0                                                                                       aaaaaaahi!HI");
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1028");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("   aaaaaaa1004", "aaaaaaahi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1029");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "0.00.0");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0.00.0" + "'", str1, "0.00.0");
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1030");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "...    ...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...    ..." + "'", str1, "...    ...");
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1031");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("AAAAAAAHI!", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA!IHAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1032");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("1.0     0.", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1033");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("#############AAAAAAAHI!#-1.0#####0.", "########################################-1.0#####0.");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1034");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("           AAAAAAAHI!AAAAAA1004", 0, "####");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "           AAAAAAAHI!AAAAAA1004" + "'", str3, "           AAAAAAAHI!AAAAAA1004");
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1035");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("0", "AAAAAAAhi!AAAAAA10041AAAAAAAhi!AAAAAA10041AAAAAAAi!iAAAAAAAhi!AAAAAA10041AAAAAAAhi!AAAAAA10041AAAAAAAh", "...    ...");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1036");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "-1.0  0.");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1037");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                                        -1.0     0.0#############################################", "AAAAAAAHI!", 1);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, '4', (int) (short) 0, (int) (byte) -1);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "1.0     0.");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "                                        -1.0     0.0#############################################" + "'", str9, "                                        -1.0     0.0#############################################");
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1038");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("HI!", "#############AAAAAAAHI!#-1.0#####0.");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1039");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "0.00.0                                                                                       aaaaaaahi!HI");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1040");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaah1004", "aaaaaaahi!aaaaaa10041");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1041");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("!ihaaaaaaa                                                                                          ", "AAAAAAAhi!AAAAAA10041AAAAAAAhi!AAAAAA10041AAAAAAAi!iAAAAAAAhi!AAAAAA10041AAAAAAAhi!AAAAAA10041AAA...", "aaaaaaahi!i!                                                                                          AAAAAAAHI!hi!                                                                                          AAAAAAAHI!hi!                                                                                          AAAAAAAHI!hi!                                                                                          AAAAAAAHI!hi!                                                                                          AAAAAAAHI!hi!                                                                                          AAAAAAAHI!hi!                                                                                          AAAAAAAHI!hi!                                                                                          AAAAAAAHI!hi!                                                                                          AAAAAAAHI!hi!");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1042");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("1004");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1004" + "'", str1, "1004");
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1043");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("-1.0     0.0", "", 100);
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, "... ...", 7, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 7");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1044");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("                                        -1.0     0.0#############################################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "-1.00.0#############################################" + "'", str1, "-1.00.0#############################################");
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1045");
        java.lang.String[] strArray1 = null;
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("                                                    ", strArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1046");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "-1.0  0.");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 8 + "'", int1 == 8);
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1047");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "                                        -1.0     0.");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1048");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("                                                 0.0                                                  ", "10041");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1049");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("##########################################################################################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "##########################################################################################" + "'", str1, "##########################################################################################");
    }

    @Test
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1050");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("...    ...", "hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1051");
        char[] charArray4 = new char[] {};
        boolean boolean5 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "-1.0     0.0", charArray4);
        int int6 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                                                                                          aaaaaaahi!", charArray4);
        int int7 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "aaaaaaahi!", charArray4);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "                                                    ", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1052");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "AAAAAAAhi!AAAAAA10041AAAAAAAhi!AAAAAA10041AAAAAAAi!iAAAAAAAhi!AAAAAA10041AAAAAAAhi!AAAAAA10041AAAAAAAh");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1053");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("10041", "                                                                                          aaaaaaahi!", (int) ' ');
        boolean boolean6 = org.apache.commons.lang3.StringUtils.startsWithAny("                                               hi!                                               ", strArray5);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.concatWith("hi!aaaaaa1004", (java.lang.Object[]) strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10041" + "'", str7, "10041");
    }

    @Test
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1054");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("                                                                                          ", 4);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                      " + "'", str2, "                                                                                      ");
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1055");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("hi!aaaaaa1004", "4001AAAAAA!IHAAAAAAA           ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1056");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        HI!", "-1.0  0.0                               ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        HI!" + "'", str2, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        HI!");
    }

    @Test
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1057");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("                                        -1.0     0.0", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1058");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("           AAAAAAAHI!AAAAAA1004");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AAAAAAAHI!AAAAAA1004" + "'", str1, "AAAAAAAHI!AAAAAA1004");
    }

    @Test
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1059");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("           AAAAAAAHI!AAAAAA10041", "                                                 0.0                                                  ", 101);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1060");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("!ihaaaaaaa                                                                                          ", "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1061");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("h");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
    }

    @Test
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1062");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 7);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1063");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByCharacterType("hi!");
        boolean boolean4 = org.apache.commons.lang3.StringUtils.endsWithAny("aaaaaaahi!", strArray3);
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.substringsBetween("", "-1.00.0", "                                               hi!                                               ");
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray9, "");
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.replaceEach("                                                                                          aaaaaaahi!", strArray3, strArray9);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "                                                                                          aaaaaaahi!" + "'", str12, "                                                                                          aaaaaaahi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1064");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("HI!IH       ", (int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1065");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("HI!IH       ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!ih       " + "'", str1, "hi!ih       ");
    }

    @Test
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1066");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("-...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "-..." + "'", str1, "-...");
    }

    @Test
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1067");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("####", '#');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1068");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("HI!                                                                                          aaaa", "4                                                                                                ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1069");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("                                                                                       aaaaaaahi!HI!", '#', 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                       aaaaaaahi!HI!" + "'", str3, "                                                                                       aaaaaaahi!HI!");
    }

    @Test
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1070");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "0");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1071");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("   aaaaaaa1004");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1072");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("", 6);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "      " + "'", str2, "      ");
    }

    @Test
    public void test1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1073");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("aaaaaaa10041", "0.00.0                                                                                       aaaaaaahi!HI", 95);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1074");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("-1.00.");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "-1.00." + "'", str1, "-1.00.");
    }

    @Test
    public void test1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1075");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "-1.0     0.");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1076");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("0.00.0                                                                                       aaaaaaahi!HI", "aaaaaaahi!aaaaaa10041");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0.00.0                                                                                       aaaaaaahi!HI" + "'", str2, "0.00.0                                                                                       aaaaaaahi!HI");
    }

    @Test
    public void test1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1077");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa10041", "!ihaaaa...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa10041" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa10041");
    }

    @Test
    public void test1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1078");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace(charSequence0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1079");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("-...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "-..." + "'", str1, "-...");
    }

    @Test
    public void test1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1080");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                                                                                          aaaaaaa10041", "                                               hi!                                               ", (int) (byte) 10);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "hi!ih       ");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray6, '4', 42, (int) (byte) 10);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray6, ' ');
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "                                                                                          aaaaaaa10041" + "'", str5, "                                                                                          aaaaaaa10041");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "aaaaaaa10041" + "'", str12, "aaaaaaa10041");
    }

    @Test
    public void test1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1081");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("HI!IH       ", "-1.0  0.0                               ");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1082");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("-1.0   aaaaaaa10040.");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "-1.0   AAAAAAA10040." + "'", str1, "-1.0   AAAAAAA10040.");
    }

    @Test
    public void test1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1083");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("... ...", "-1.0   AAAAAAA10040.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "... ..." + "'", str2, "... ...");
    }

    @Test
    public void test1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1084");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "-1.0a a a0.0");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1085");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("AAAAAAAhi!AAAAAA10041AAAAAAAhi!AAAAAA10041AAAAAAAi!iAAAAAAAhi!AAAAAA10041AAAAAAAhi!AAAAAA10041AAAAAAAh", "HI!IH       ", 90);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1086");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("                                ", "0.0a a a0.1-");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                " + "'", str2, "                                ");
    }

    @Test
    public void test1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1087");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("hi!ihaaaaaaa", "1.0  0.0 ", 90);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1088");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("                                                                                                    ", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        HI!", "14001aaaaaa!ihaaaaaaA");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                    " + "'", str3, "                                                                                                    ");
    }

    @Test
    public void test1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1089");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("1.0     0.", "AAAAAAA", "aaaaaaa10041");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1090");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("1004", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1004" + "'", str2, "1004");
    }

    @Test
    public void test1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1091");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaah1004", "hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1092");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("                                                                                      ", 40);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                              " + "'", str2, "                                              ");
    }

    @Test
    public void test1093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1093");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "0.00.0                                                                                       aaaaaaahi!HI!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1094");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "                                        -1.0     0.");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 51 + "'", int1 == 51);
    }

    @Test
    public void test1095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1095");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", 11);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str2, "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test1096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1096");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("", 3);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1097");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("4", "Aaaaaaahi!aaaaaa10041", "-1.0   AAAAAAA10040.");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test1098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1098");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("AAAAAAAhi!AAAAAA1001AAAAAAAhi!AAAAAA1001AAAAAAAi!iAAAAAAAhi!AAAAAA1001AAAAAAAhi!AAAAAA1001AAAAAAAh", 101);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1099");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("AAAAAAAhi!AAAAAA10041AAAAAAAhi!AAAAAA10041AAAAAAAi!iAAAAAAAhi!AAAAAA10041AAAAAAAhi!AAAAAA10041AAA...", "-1.0  0.0");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1100");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "AAAAAAAhi!AAAAAA10041");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1101");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("!IHAAAAAAA", 40);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "               !IHAAAAAAA               " + "'", str2, "               !IHAAAAAAA               ");
    }

    @Test
    public void test1102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1102");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("4001AAAAAAA", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1103");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!", "0. -1.0");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!" + "'", str2, "AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!");
    }

    @Test
    public void test1104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1104");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("4");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4" + "'", str1, "4");
    }

    @Test
    public void test1105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1105");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("-1.0  0.0", "aaaaaaahi!");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray2);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1.0  0.0" + "'", str4, "-1.0  0.0");
    }

    @Test
    public void test1106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1106");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("hi!ih", (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!ih" + "'", str2, "hi!ih");
    }

    @Test
    public void test1107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1107");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("HI!", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1108");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("!ihaaaaaaa                                                                                          ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!ihaaaaaaa                                                                                         " + "'", str1, "!ihaaaaaaa                                                                                         ");
    }

    @Test
    public void test1109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1109");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!", 100, "                                                                                       aaaaaaahi!HI!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!" + "'", str3, "aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!");
    }

    @Test
    public void test1110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1110");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("      ", 95, 11);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1111");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("-1.0  0.0", 4, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-1.0  0.0" + "'", str3, "-1.0  0.0");
    }

    @Test
    public void test1112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1112");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("#################################################0.0##################################################", "!ihaaaaaaa");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test1113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1113");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("-1.0  0.", (int) (short) 10, (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test1114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1114");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "#############AAAAAAAHI!#-1.0#####0.");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1115");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test1116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1116");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("-1.0  0.0");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0.0  0.1-" + "'", str1, "0.0  0.1-");
    }

    @Test
    public void test1117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1117");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("                                                                                                    ", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa10041", "0.00.0                                                                                       aaaaaaahi!HI");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                    " + "'", str3, "                                                                                                    ");
    }

    @Test
    public void test1118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1118");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("aaaaaaa10041", "HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1119");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("!ihaaaa...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!ihaaaa..." + "'", str1, "!ihaaaa...");
    }

    @Test
    public void test1120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1120");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("hi!ihaaaaaaa", 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!ihaaaaaaa" + "'", str2, "hi!ihaaaaaaa");
    }

    @Test
    public void test1121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1121");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("                                               hi!                                               ", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1122");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test1123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1123");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("#############AAAAAAAHI!#-1.0#####0.");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "#############aaaaaaahi!#-1.0#####0." + "'", str1, "#############aaaaaaahi!#-1.0#####0.");
    }

    @Test
    public void test1124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1124");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("!ihaaaaaaa                                                                                          ", "#############aaaaaaahi!#-1.0#####0.");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1125");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("      ", "                                                 0.0                                                  ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "      " + "'", str2, "      ");
    }

    @Test
    public void test1126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1126");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("-1.0  0.0", "                                        -1.0     0.0");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1127");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("##########################################################################################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "##########################################################################################" + "'", str1, "##########################################################################################");
    }

    @Test
    public void test1128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1128");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("10041", "AAAAAAAhi!AAAAAA10041AAAAAAAhi!AAAAAA10041AAAAAAAi!iAAAAAAAhi!AAAAAA10041AAAAAAAhi!AAAAAA10041AAA...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "10041" + "'", str2, "10041");
    }

    @Test
    public void test1129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1129");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 ", "-1.0a a a0.0");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test1130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1130");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("                                        -1.0     0.0#############################################", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa10041", (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                        -1.0     0.0#############################################" + "'", str3, "                                        -1.0     0.0#############################################");
    }

    @Test
    public void test1131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1131");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("-1.00.0", (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1.00.0" + "'", str2, "1.00.0");
    }

    @Test
    public void test1132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1132");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("aaaaaaahi!i!                                                                                          AAAAAAAHI!hi!                                                                                          AAAAAAAHI!hi!                                                                                          AAAAAAAHI!hi!                                                                                          AAAAAAAHI!hi!                                                                                          AAAAAAAHI!hi!                                                                                          AAAAAAAHI!hi!                                                                                          AAAAAAAHI!hi!                                                                                          AAAAAAAHI!hi!                                                                                          AAAAAAAHI!hi!", "hi!", (int) (short) 100);
        java.lang.Class<?> wildcardClass4 = strArray3.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1133");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "AAAAAAAhi!AAAAAA1001AAAAAAAhi!AAAAAA1001AAAAAAAi!iAAAAAAAhi!AAAAAA1001AAAAAAAhi!AAAAAA1001AAAAAAAh");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1134");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("0.00.0                                                                                       aaaaaaahi!HI");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0.00.0                                                                                       AAAAAAAHI!hi" + "'", str1, "0.00.0                                                                                       AAAAAAAHI!hi");
    }

    @Test
    public void test1135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1135");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("##########################################################################################", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        HI!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "##########################################################################################" + "'", str2, "##########################################################################################");
    }

    @Test
    public void test1136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1136");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("-1.0a a a0.0", '#');
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "#############################################0.0     0.1-                                        ", 42, 4);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test1137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1137");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "                                                    ", "hi!ih");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1138");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("1.0  0.0 ", "...    ...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1.0  0.0" + "'", str2, "1.0  0.0");
    }

    @Test
    public void test1139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1139");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("                                        -1.0     0.0", "4", "0. -1.0");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                        -1.0     0.0" + "'", str3, "                                        -1.0     0.0");
    }

    @Test
    public void test1140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1140");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("-1.0  0.0                               ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "-1.0  0.0                              " + "'", str1, "-1.0  0.0                              ");
    }

    @Test
    public void test1141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1141");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("0.0  0.1-", "AAAAAAA1004", (int) (byte) 0);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test1142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1142");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("1.0     0.", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1143");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("4001AAAAAAA", "-1.00.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4001AAAAAAA" + "'", str2, "4001AAAAAAA");
    }

    @Test
    public void test1144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1144");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("                                                                                          aaaaaaa10041");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaa10041" + "'", str1, "aaaaaaa10041");
    }

    @Test
    public void test1145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1145");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "               !IHAAAAAAA               ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test1146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1146");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("                                                                                          aaaaaaahi!");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaahi!" + "'", str2, "aaaaaaahi!");
    }

    @Test
    public void test1147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1147");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("-1.0  0.", "0.0a a a0.1-", 102);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1148");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("           aaaaaaahi!aaaaaa10041", ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaahi!aaaaaa10041" + "'", str2, "aaaaaaahi!aaaaaa10041");
    }

    @Test
    public void test1149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1149");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("AAAAAAAHI!", 101);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1150");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("-1.0     0.");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        HI!", strArray2, strArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 1 vs 7");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test1151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1151");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("           AAAAAAAHI!AAAAAA10041", "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444-1.0  0.0");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1152");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("-1.0a a a0.0-1.0  0.0 -1.0a a a0.0-1.0  0.0 -1.0a a a0.0-1.0  0.0 -1.0a a a0.0-1.0  0.0 -1.0a a a0.0-1.0  0.0 -1.0a a a0.0-1.0  0.0 -1.0a a a0.0-1.0  0.0 -1.0a a a0.0-1.0  0.0 -1.0a a a0.0-1.0  0.0 -1.0a a a0.0", (int) (byte) 0, (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
    }

    @Test
    public void test1153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1153");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfBlank((java.lang.CharSequence) "HI!                                                                                          aaaa", (java.lang.CharSequence) "hi!");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "HI!                                                                                          aaaa" + "'", charSequence2, "HI!                                                                                          aaaa");
    }

    @Test
    public void test1154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1154");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("!ihaaaaaaa                                                                                          ", (int) (short) 0, (-1));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!ihaaaaaaa                                                                                         " + "'", str3, "!ihaaaaaaa                                                                                         ");
    }

    @Test
    public void test1155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1155");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("... ...", "aaaaaaahi!aaaaaa10041", 109);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1156");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("4001AAAAAA!IHAAAAAAA           ", "0.00.0                                                                                       AAAAAAAHI!hi");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1157");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1158");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("-1.0  0.0                              ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                              0.0  0.1-" + "'", str1, "                              0.0  0.1-");
    }

    @Test
    public void test1159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1159");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!", "HI!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1160");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("-1.0     0.", "                                   ");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "   aaaaaaa1004");
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "AAAAAAAhi!AAAAAA10041AAAAAAAhi!AAAAAA10041AAAAAAAi!iAAAAAAAhi!AAAAAA10041AAAAAAAhi!AAAAAA10041AAAAAAAh", 100, 101);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1.0   aaaaaaa10040." + "'", str4, "-1.0   aaaaaaa10040.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-1.00." + "'", str5, "-1.00.");
    }

    @Test
    public void test1161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1161");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("1004");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1004" + "'", str1, "1004");
    }

    @Test
    public void test1162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1162");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("HI!", "10041");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1163");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!", "-1.0     0.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!" + "'", str2, "AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!");
    }

    @Test
    public void test1164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1164");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("                                   ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test1165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1165");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "####");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "####" + "'", str1, "####");
    }

    @Test
    public void test1166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1166");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("-1.0  0.0                              ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "-1.0  0.0" + "'", str1, "-1.0  0.0");
    }

    @Test
    public void test1167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1167");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "!IHAAAAAAA");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test1168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1168");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                                   ", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA!IHAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", 90);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test1169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1169");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("-1.00.", "1.00.0");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1170");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("", "-1.0  0.0                              ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1171");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("AAAAAAAHI!", "               !IHAAAAAAA               ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "               !IHAAAAAAA               " + "'", str2, "               !IHAAAAAAA               ");
    }

    @Test
    public void test1172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1172");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("10041");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "10041" + "'", str1, "10041");
    }

    @Test
    public void test1173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1173");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("aaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaa" + "'", str1, "aaaaaa");
    }

    @Test
    public void test1174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1174");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("hi!ih       ", "                                                                                      ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!ih" + "'", str2, "hi!ih");
    }

    @Test
    public void test1175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1175");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("   4");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "   " + "'", str1, "   ");
    }

    @Test
    public void test1176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1176");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("4                                                                                                ", "AAAAAAAhi!AAAAAA10041");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1177");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("#############AAAAAAAHI!#-1.0#####0.");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "#############AAAAAAAHI!#-1.0#####0." + "'", str1, "#############AAAAAAAHI!#-1.0#####0.");
    }

    @Test
    public void test1178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1178");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("10041", "                                                                                          aaaaaaahi!", (int) ' ');
        boolean boolean5 = org.apache.commons.lang3.StringUtils.startsWithAny("                                               hi!                                               ", strArray4);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, '#', 0, 1);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, "                                   ", 3, 8);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "10041" + "'", str9, "10041");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "10041" + "'", str10, "10041");
    }

    @Test
    public void test1179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1179");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("                                                                                       aaaaaaahi!HI!", 11);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "        ..." + "'", str2, "        ...");
    }

    @Test
    public void test1180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1180");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "10041");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test1181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1181");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("                                              ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test1182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1182");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("-1.0a a a0.0");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "-1.0a a a0.0" + "'", str1, "-1.0a a a0.0");
    }

    @Test
    public void test1183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1183");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "1.0  0.0");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1184");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA!IHAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA!IHAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str1, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA!IHAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test1185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1185");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("-1.0     0.", "hi!ihaaaaaaa", "0.00.0                                                                                       aaaaaaahi!HI!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-1.0     0." + "'", str3, "-1.0     0.");
    }

    @Test
    public void test1186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1186");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("AAAAAAAhi!AAAAAA10041AAAAAAAhi!AAAAAA10041AAAAAAAi!iAAAAAAAhi!AAAAAA10041AAAAAAAhi!AAAAAA10041AAAAAAAh", "AAAAAAA");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 94 + "'", int2 == 94);
    }

    @Test
    public void test1187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1187");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("4001AAAAAAA", "Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1188");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "                                   ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test1189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1189");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("-...", (int) 'a', 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa-..." + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa-...");
    }

    @Test
    public void test1190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1190");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("!ihaaaaaaa                                                                                         ", "-1.0     0.0");
        int int4 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test1191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1191");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("AAAAAAAhi!AAAAAA10041", "HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI", (-1), 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HIAAAAAAAhi!AAAAAA10041" + "'", str4, "HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HIAAAAAAAhi!AAAAAA10041");
    }

    @Test
    public void test1192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1192");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "hi!ih       ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!ih       " + "'", str2, "hi!ih       ");
    }

    @Test
    public void test1193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1193");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("   4", '#');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test1194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1194");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("hi!", "hi!ihaaaaaaa", (int) '4');
        boolean boolean5 = org.apache.commons.lang3.StringUtils.startsWithAny("HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!", strArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, 'a');
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test1195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1195");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "                                ", (java.lang.CharSequence) "0.00.0                                                                                       aaaaaaahi!HI!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 74 + "'", int2 == 74);
    }

    @Test
    public void test1196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1196");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!", "-1.0  0.0                              ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1197");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("aaaaaaa10041");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "14001aaaaaaa" + "'", str1, "14001aaaaaaa");
    }

    @Test
    public void test1198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1198");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", "HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1199");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("... ...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "... ..." + "'", str1, "... ...");
    }

    @Test
    public void test1200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1200");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("!ihaaaaaaa                                                                                         ", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!ihaaaaaaa                                                                                         " + "'", str2, "!ihaaaaaaa                                                                                         ");
    }

    @Test
    public void test1201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1201");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "AAAAAAAHI!I!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1202");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI" + "'", str1, "HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI");
    }

    @Test
    public void test1203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1203");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("14001aaaaaaa", "   ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1204");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("aaaaaaahi!aaaaaa10041", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        HI!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1205");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("                              0.0  0.1-", "                                                                                          aaaaaaa1004", "aaaaaaa10041");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                              0.0  0.1-" + "'", str3, "                              0.0  0.1-");
    }

    @Test
    public void test1206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1206");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "#################################################0.0##################################################");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1207");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("... ...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "... ..." + "'", str1, "... ...");
    }

    @Test
    public void test1208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1208");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "aaaaaaa10041", "AAAAAAA1004");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7 + "'", int2 == 7);
    }

    @Test
    public void test1209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1209");
        java.lang.String[] strArray1 = null;
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("0.00.0", '#');
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", strArray1, strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str5, "Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test1210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1210");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("i!i", "-1.0  0.0 ");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test1211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1211");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("10041", 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                     10041" + "'", str2, "                                                                     10041");
    }

    @Test
    public void test1212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1212");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                        -1.0     0.0#############################################", "                                                                                          aaaaaaa10041", 40);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test1213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1213");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("aaaaaaahi!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaahi!" + "'", str2, "aaaaaaahi!");
    }

    @Test
    public void test1214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1214");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "0.00.0                                                                                       aaaaaaahi!HI");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1215");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444-1.0  0.0", 'a', '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444-1.0  0.0" + "'", str3, "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444-1.0  0.0");
    }

    @Test
    public void test1216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1216");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("0");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("-1.00.0", "aaaaaaahi!");
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray5, "                                   ", (int) (byte) 10, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("0.00.0                                                                                       aaaaaaahi!HI", strArray2, strArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: TimeToLive of -1 is less than 0: -1.-1.00.0-1.00.0.-1.00.0.-1.-1.00.0-1.00.0.-1.00.0-1.-1.00.0-1.00.0.-1.00.0.-1.-1.00.0-1.00.0.-1.00.0                                                                                       aaaaaaahi!HI");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1217");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!", "0.0", (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1218");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("0.00.0                                                                                       aaaaaaahi!HI!", "AAAAAAAhi!AAAAAA10041AAAAAAAhi!AAAAAA10041AAAAAAAi!iAAAAAAAhi!AAAAAA10041AAAAAAAhi!AAAAAA10041AAAAAAAh");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1219");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("AAAAAAA", "                                        -1.0     0.");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1220");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 ", (int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1221");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("AAAAAAAhi!AAAAAA10041", "HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HIAAAAAAAhi!AAAAAA10041", "        ...");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " " + "'", str3, " ");
    }

    @Test
    public void test1222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1222");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("0.00.0", "HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HIAAAAAAAhi!AAAAAA10041");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1223");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("", "                                                 0.0                                                  ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1224");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("##########################################################################################", 94, 109);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "##########################################################################################" + "'", str3, "##########################################################################################");
    }

    @Test
    public void test1225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1225");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.substringsBetween("", "-1.00.0", "                                               hi!                                               ");
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, "");
        int int7 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("Aaaaaaahi!aaaaaa10041", strArray4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, '4', (-1), 74);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test1226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1226");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("1004", (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1227");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("           aaaaaaahi!aaaaaa10041", "HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI", "10041");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test1228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1228");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("AAAAAAAhi!AAAAAA10041", 7, 939);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!AAAAAA10041" + "'", str3, "hi!AAAAAA10041");
    }

    @Test
    public void test1229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1229");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("                                                                                          aaaaaaahi!", "-1.00.", "AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                          aaaaaaahi!" + "'", str3, "                                                                                          aaaaaaahi!");
    }

    @Test
    public void test1230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1230");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("                                        -1.0     0.", "                                                                                          aaaaaaahi!");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test1231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1231");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("aaaaaaahi!aaaaaa10041", "aaaaaaahi!i!                                                                                          AAAAAAAHI!hi!                                                                                          AAAAAAAHI!hi!                                                                                          AAAAAAAHI!hi!                                                                                          AAAAAAAHI!hi!                                                                                          AAAAAAAHI!hi!                                                                                          AAAAAAAHI!hi!                                                                                          AAAAAAAHI!hi!                                                                                          AAAAAAAHI!hi!                                                                                          AAAAAAAHI!hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "10041" + "'", str2, "10041");
    }

    @Test
    public void test1232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1232");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("0", "", "AAAAAAAHI!AAAAAA1004");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test1233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1233");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("AAAAAAAhi!AAAAAA10041AAAAAAAhi!AAAAAA10041AAAAAAAi!iAAAAAAAhi!AAAAAA10041AAAAAAAhi!AAAAAA10041AAA...", 7, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa-...");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "AAAAAAAhi!AAAAAA10041AAAAAAAhi!AAAAAA10041AAAAAAAi!iAAAAAAAhi!AAAAAA10041AAAAAAAhi!AAAAAA10041AAA..." + "'", str3, "AAAAAAAhi!AAAAAA10041AAAAAAAhi!AAAAAA10041AAAAAAAi!iAAAAAAAhi!AAAAAA10041AAAAAAAhi!AAAAAA10041AAA...");
    }

    @Test
    public void test1234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1234");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444-1.0  0.0", "                                                                                                    ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1235");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("!ihaaaaaaa", "... ...", 90, 42);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "!ihaaaaaaa... ..." + "'", str4, "!ihaaaaaaa... ...");
    }

    @Test
    public void test1236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1236");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        HI!", "-1.00.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        HI!" + "'", str2, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        HI!");
    }

    @Test
    public void test1237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1237");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "i!i", (java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 88 + "'", int2 == 88);
    }

    @Test
    public void test1238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1238");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("aaaaaaahi!444444444444444444444444444444444444444444", "                                                                                       aaaaaaahi!HI!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1239");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("14001aaaaaaa", "AAAAAAA1004");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AAAAAAA1004" + "'", str2, "AAAAAAA1004");
    }

    @Test
    public void test1240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1240");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("-1.0  0.0                              ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test1241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1241");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("-1.0     0.");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "-1.0     0" + "'", str1, "-1.0     0");
    }

    @Test
    public void test1242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1242");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!", 94);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1243");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "i!i", "                                               hi!                                               ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1244");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "0.00.0                                                                                       aaaaaaahi!HI!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 106 + "'", int1 == 106);
    }

    @Test
    public void test1245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1245");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("                                                                                       aaaaaaahi!HI!", "AAAAAAA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                       aaaaaaahi!HI!" + "'", str2, "                                                                                       aaaaaaahi!HI!");
    }

    @Test
    public void test1246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1246");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1247");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("aaaaaaahi!i!                                                                                          AAAAAAAHI!hi!                                                                                          AAAAAAAHI!hi!                                                                                          AAAAAAAHI!hi!                                                                                          AAAAAAAHI!hi!                                                                                          AAAAAAAHI!hi!                                                                                          AAAAAAAHI!hi!                                                                                          AAAAAAAHI!hi!                                                                                          AAAAAAAHI!hi!                                                                                          AAAAAAAHI!hi!", 4);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaahi!i!                                                                                          AAAAAAAHI!hi!                                                                                          AAAAAAAHI!hi!                                                                                          AAAAAAAHI!hi!                                                                                          AAAAAAAHI!hi!                                                                                          AAAAAAAHI!hi!                                                                                          AAAAAAAHI!hi!                                                                                          AAAAAAAHI!hi!                                                                                          AAAAAAAHI!hi!                                                                                          AAAAAAAHI!hi!" + "'", str2, "aaahi!i!                                                                                          AAAAAAAHI!hi!                                                                                          AAAAAAAHI!hi!                                                                                          AAAAAAAHI!hi!                                                                                          AAAAAAAHI!hi!                                                                                          AAAAAAAHI!hi!                                                                                          AAAAAAAHI!hi!                                                                                          AAAAAAAHI!hi!                                                                                          AAAAAAAHI!hi!                                                                                          AAAAAAAHI!hi!");
    }

    @Test
    public void test1248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1248");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "#############################################0.0     0.1-                                        ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1249");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA!IHAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test1250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1250");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "                                                                                       aaaaaaahi!HI!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1251");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("-1.0     0.");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "-1.00." + "'", str1, "-1.00.");
    }

    @Test
    public void test1252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1252");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("14001aaaaaa!ihaaaaaaA", "-1.0  0.0 ", "        ...");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "14001aaaaaa!ihaaaaaaA" + "'", str3, "14001aaaaaa!ihaaaaaaA");
    }

    @Test
    public void test1253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1253");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("aaaaaaa", "                                        -1.0     0.0", (int) (short) 10);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "aaaaaaa" + "'", str5, "aaaaaaa");
    }

    @Test
    public void test1254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1254");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "!ihaaaaaaa                                                                                         ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "A" + "'", str2, "A");
    }

    @Test
    public void test1255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1255");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("h", "HI!                                                                                          aaaa", 6);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test1256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1256");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("0.0a a a0.1-", "!ihaaaaaaa                                                                                          ", 94);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test1257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1257");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("AAAAAAAhi!AAAAAA10041AAAAAAAhi!AAAAAA10041AAAAAAAi!iAAAAAAAhi!AAAAAA10041AAAAAAAhi!AAAAAA10041AAAAAAAh", "                                                                                                    ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1258");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!" + "'", str1, "hi!");
    }

    @Test
    public void test1259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1259");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("", "-1.00.0", "                                               hi!                                               ");
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "");
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test1260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1260");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ", "                                              ", 6);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test1261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1261");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("AAAAAAAHI!AAAAAA1004");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaahi!aaaaaa1004" + "'", str1, "aaaaaaahi!aaaaaa1004");
    }

    @Test
    public void test1262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1262");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("1004", "aaahi!i!                                                                                          AAAAAAAHI!hi!                                                                                          AAAAAAAHI!hi!                                                                                          AAAAAAAHI!hi!                                                                                          AAAAAAAHI!hi!                                                                                          AAAAAAAHI!hi!                                                                                          AAAAAAAHI!hi!                                                                                          AAAAAAAHI!hi!                                                                                          AAAAAAAHI!hi!                                                                                          AAAAAAAHI!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1263");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("                                              ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test1264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1264");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("      ", (-1));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1265");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "                                                                                      ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1266");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0", "10041", (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1267");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("", (int) ' ', '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "44444444444444444444444444444444" + "'", str3, "44444444444444444444444444444444");
    }

    @Test
    public void test1268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1268");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("1.0     0.", "aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1269");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("AAAAAAAhi!AAAAAA10041AAAAAAAhi!AAAAAA10041AAAAAAAi!iAAAAAAAhi!AAAAAA10041AAAAAAAhi!AAAAAA10041AAA...", 51);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1270");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("#############################################0.0     0.1-                                        ", "           AAAAAAAHI!AAAAAA10041");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1271");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa-...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa-..." + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa-...");
    }

    @Test
    public void test1272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1272");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("h", "#############AAAAAAAHI!#-1.0#####0.");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1273");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("4                                                                                                ", "                                   ", "####");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4####                                                             " + "'", str3, "4####                                                             ");
    }

    @Test
    public void test1274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1274");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "HI!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1275");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("-1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 ", "!IHAAAAAAA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 " + "'", str2, "-1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 ");
    }

    @Test
    public void test1276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1276");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaah1004", (int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1277");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("0.0", "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444-1.0  0.0");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test1278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1278");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!", "#############################################0.0     0.1-                                        ");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "AAAAAAAhi!AAAAAA10041AAAAAAAhi!AAAAAA10041AAAAAAAi!iAAAAAAAhi!AAAAAA10041AAAAAAAhi!AAAAAA10041AAA...");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test1279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1279");
        java.lang.CharSequence charSequence1 = null;
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "                                                 0.0                                                  ", charSequence1);
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "                                                 0.0                                                  " + "'", charSequence2, "                                                 0.0                                                  ");
    }

    @Test
    public void test1280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1280");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444-1.0  0.0");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444-1.0  0.0" + "'", str1, "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444-1.0  0.0");
    }

    @Test
    public void test1281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1281");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "0. -1.0");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0. -1.0" + "'", str1, "0. -1.0");
    }

    @Test
    public void test1282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1282");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0", "44444444444444444444444444444444", (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1283");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("1.0  0.0 ", 'a', 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1.0  0.0 " + "'", str3, "1.0  0.0 ");
    }

    @Test
    public void test1284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1284");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "44444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1285");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty(charSequence0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test1286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1286");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("aaaaaa", "-1.0     0.0");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1287");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "!ihaaaaaaa                                                                                         ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1288");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("                                        -1.0     0.0#############################################", 939);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                        -1.0     0.0#############################################" + "'", str2, "                                        -1.0     0.0#############################################");
    }

    @Test
    public void test1289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1289");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("", 7, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaa" + "'", str3, "aaaaaaa");
    }

    @Test
    public void test1290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1290");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("i!i");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "i!i" + "'", str1, "i!i");
    }

    @Test
    public void test1291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1291");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaah1004", "                                                                                      ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1292");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("##########################################################################################", "4001AAAAAA!IHAAAAAAA           ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4001AAAAAA!IHAAAAAAA           " + "'", str2, "4001AAAAAA!IHAAAAAAA           ");
    }

    @Test
    public void test1293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1293");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("                                                                                          aaaaaaa1004");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaa1004" + "'", str1, "aaaaaaa1004");
    }

    @Test
    public void test1294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1294");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("   aaaaaaa1004", (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4" + "'", str2, "4");
    }

    @Test
    public void test1295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1295");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("0. -1.0", (int) '#', 106);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1296");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("aaaaaaahi!aaaaaa10041", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1297");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "               !IHAAAAAAA               ", 4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1298");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!" + "'", str1, "aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!");
    }

    @Test
    public void test1299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1299");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("-1.0  0.0", "HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HIAAAAAAAhi!AAAAAA10041");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-1.0  0.0" + "'", str2, "-1.0  0.0");
    }

    @Test
    public void test1300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1300");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("-1.0a a a0.0-1.0  0.0 -1.0a a a0.0-1.0  0.0 -1.0a a a0.0-1.0  0.0 -1.0a a a0.0-1.0  0.0 -1.0a a a0.0-1.0  0.0 -1.0a a a0.0-1.0  0.0 -1.0a a a0.0-1.0  0.0 -1.0a a a0.0-1.0  0.0 -1.0a a a0.0-1.0  0.0 -1.0a a a0.0", "!ihaaaa...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1301");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("!IHAAAAAAA", 97);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!IHAAAAAAA" + "'", str2, "!IHAAAAAAA");
    }

    @Test
    public void test1302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1302");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("      ", 97, 35);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1303");
        char[] charArray9 = new char[] { '#', '4', ' ', '4' };
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "", charArray9);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                                                                                          aaaaaaa10041", charArray9);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "                                                                                          aaaaaaa10041", charArray9);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                                                                                                    ", charArray9);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "!ihaaaaaaa... ...", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "#4 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "#4 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[#, 4,  , 4]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1304");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa10041", "4");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test1305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1305");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("!ihaaaaaaa... ...", "                                                                                          AAAAAAA1004");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1306");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.repeat("####", "!ihaaaa...", (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "####" + "'", str3, "####");
    }

    @Test
    public void test1307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1307");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "AAAAAAA");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test1308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1308");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("!ihaaaaaaa                                                                                         ", "!ihaaaaaaa                                                                                          ", 102);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1309");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "aaaaaaahi!aaaaaa1004");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1310");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("-1.0  0.", 90, 4);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test1311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1311");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("... ...", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1312");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "-");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test1313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1313");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("HI!                                                                                          aaaa", "HI!", 102);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1314");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!", "14001aaaaaa!ihaaaaaaA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI" + "'", str2, "HI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI");
    }

    @Test
    public void test1315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1315");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("#############AAAAAAAHI!#-1.0#####0.", "-1.00.0#############################################", "AAAAAAA");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test1316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1316");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("", "#############################################0.0     0.1-                                        ", (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test1317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1317");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid(" 0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 ", (int) (byte) 10, 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "." + "'", str3, ".");
    }

    @Test
    public void test1318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1318");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("4");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4" + "'", str1, "4");
    }

    @Test
    public void test1319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1319");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (java.lang.CharSequence) "HI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1320");
        java.lang.String[] strArray1 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithAny("-1.00.0#############################################", strArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1321");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("HI!                                                                                          aaaa", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1322");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("4001AAAAAAA", "-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4001AAAAAAA" + "'", str2, "4001AAAAAAA");
    }

    @Test
    public void test1323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1323");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1324");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("-1.0a a a0.0-1.0  0.0 -1.0a a a0.0-1.0  0.0 -1.0a a a0.0-1.0  0.0 -1.0a a a0.0-1.0  0.0 -1.0a a a0.0-1.0  0.0 -1.0a a a0.0-1.0  0.0 -1.0a a a0.0-1.0  0.0 -1.0a a a0.0-1.0  0.0 -1.0a a a0.0-1.0  0.0 -1.0a a a0.0", 3, (int) '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1325");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("-...", 88);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1326");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("##########################################################################################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "##########################################################################################" + "'", str1, "##########################################################################################");
    }

    @Test
    public void test1327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1327");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("-1.0  0.");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".0  0.1-" + "'", str1, ".0  0.1-");
    }

    @Test
    public void test1328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1328");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           " + "'", str1, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ");
    }

    @Test
    public void test1329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1329");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("aaaaaaa1004", "aaaaaaa");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test1330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1330");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaah1004", 51);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1331");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("           AAAAAAAHI!AAAAAA10041", "                                               hi!                                               ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "           AAAAAAAHI!AAAAAA10041" + "'", str2, "           AAAAAAAHI!AAAAAA10041");
    }

    @Test
    public void test1332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1332");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("                                               hi!                                               ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test1333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1333");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("... ...", "HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HIAAAAAAAhi!AAAAAA10041", (int) (short) 1, 109);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ".HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HIAAAAAAAhi!AAAAAA10041" + "'", str4, ".HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HIAAAAAAAhi!AAAAAA10041");
    }

    @Test
    public void test1334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1334");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("aaaaaaahi!aaaaaa1004", "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaahi!aaaaaa1004" + "'", str2, "aaaaaaahi!aaaaaa1004");
    }

    @Test
    public void test1335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1335");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1336");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("1.0  0.0 ", "-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1.0  0.0 " + "'", str2, "1.0  0.0 ");
    }

    @Test
    public void test1337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1337");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("0. -1.0", "-1.0  0.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0. -1.0" + "'", str2, "0. -1.0");
    }

    @Test
    public void test1338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1338");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("-1.0  0.0 ", 109);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                 -1.0  0.0                                                   " + "'", str2, "                                                 -1.0  0.0                                                   ");
    }

    @Test
    public void test1339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1339");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("A", (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "A" + "'", str2, "A");
    }

    @Test
    public void test1340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1340");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("-1.0a a a0.0", "AAAAAAAhi!AAAAAA10041");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1341");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("0", "                                                 0.0                                                  ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0" + "'", str2, "0");
    }

    @Test
    public void test1342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1342");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("aaaaaaahi!aaaaaa10041");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1343");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("10041", "AAAAAAAHI!");
        java.lang.String[] strArray4 = null;
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", strArray3, strArray4);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str5, "Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test1344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1344");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "-1.0     0.0");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str2, "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test1345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1345");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("                                                                                                    ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test1346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1346");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("44444444444444444444444444444444", 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44444444444444444444444444444444                                          " + "'", str2, "44444444444444444444444444444444                                          ");
    }

    @Test
    public void test1347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1347");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "########################################-1.0#####0.");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1348");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "                                                 -1.0  0.0                                                   ", (java.lang.CharSequence) "4001AAAAAA!IHAAAAAAA           ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1349");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("aaaaaaahi!", "-1.0a a a0.0-1.0  0.0 -1.0a a a0.0-1.0  0.0 -1.0a a a0.0-1.0  0.0 -1.0a a a0.0-1.0  0.0 -1.0a a a0.0-1.0  0.0 -1.0a a a0.0-1.0  0.0 -1.0a a a0.0-1.0  0.0 -1.0a a a0.0-1.0  0.0 -1.0a a a0.0-1.0  0.0 -1.0a a a0.0");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test1350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1350");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("   ", "AAAAAAAHI!I!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "   " + "'", str2, "   ");
    }

    @Test
    public void test1351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1351");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("1.0  0.0", "HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1.0  0.0" + "'", str2, "1.0  0.0");
    }

    @Test
    public void test1352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1352");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("", "hi!aaaaaa1004", 6);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1353");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!", 106, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaAAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!" + "'", str3, "aaaaaaAAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!");
    }

    @Test
    public void test1354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1354");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("                                                                     10041", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                     10041" + "'", str2, "                                                                     10041");
    }

    @Test
    public void test1355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1355");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa10041", "                                ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1356");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444-1.0  0.0");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test1357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1357");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("4", "#############################################0.0     0.1-                                        ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1358");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("-", "-", 74);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1359");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "0.0a a a0.1-");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1360");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("", "-1.00.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1361");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("hi!AAAAAA10041", "-1.0  0.0 ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1362");
        java.lang.CharSequence charSequence0 = null;
        char[] charArray2 = new char[] {};
        boolean boolean3 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "-1.0     0.0", charArray2);
        int int4 = org.apache.commons.lang3.StringUtils.indexOfAnyBut(charSequence0, charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test1363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1363");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("44444444444444444444444444444444", "-1.00.0");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1364");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("0");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test1365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1365");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("hi!AAAAAA10041", "                                                                                          aaaaaaahi!", "Aaaaaaahi!aaaaaa10041");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "AAAAAA10041" + "'", str3, "AAAAAA10041");
    }

    @Test
    public void test1366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1366");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("-1.0  0.0 ", 40);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-1.0  0.0 " + "'", str2, "-1.0  0.0 ");
    }

    @Test
    public void test1367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1367");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("aaaaaaahi!aaaaaa1004", (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaahi!aaaaaa1004" + "'", str2, "aaaaaaahi!aaaaaa1004");
    }

    @Test
    public void test1368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1368");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("", "HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HIAAAAAAAhi!AAAAAA10041");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1369");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "           AAAAAAAHI!AAAAAA1004");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1370");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("", "4001AAAAAAA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1371");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "                                                                                          aaaaaaahi!", (java.lang.CharSequence) "                                              ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1372");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "44444444444444444444444444444444                                          ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1373");
        java.lang.Object[] objArray0 = null;
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(objArray0, "aaaaaa", (int) ' ', 8);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test1374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1374");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("aaaaaaa", "Aaaaaaahi!aaaaaa10041", 8);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1375");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("AAAAAAA1004", 51, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "AAAAAAA1004aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "AAAAAAA1004aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test1376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1376");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("4####                                                             ", " 0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4####                                                             " + "'", str2, "4####                                                             ");
    }

    @Test
    public void test1377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1377");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.substringsBetween("", "-1.00.0", "                                               hi!                                               ");
        int int5 = org.apache.commons.lang3.StringUtils.indexOfAny("aaaaaaAAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test1378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1378");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("hi!ih", "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1379");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("-1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 -1.0  0.0 ", "AAAAAA10041", "                                                                     10041");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test1380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1380");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI", "                                               hi!                                               ", ".0  0.1-");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test1381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1381");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("                                                                                          aaaaaaa1004", 51, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                          aaaaaaa1004" + "'", str3, "                                                                                          aaaaaaa1004");
    }

    @Test
    public void test1382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1382");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("        ...", (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1383");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("1.0  0.0 ", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa10041", (int) ' ');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1384");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaah1004", " ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaah1004" + "'", str2, "aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaah1004");
    }

    @Test
    public void test1385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1385");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("", "-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0");
        int int4 = org.apache.commons.lang3.StringUtils.indexOfAny("                                               hi!                                               ", strArray3);
        int int5 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test1386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1386");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("-1.00.", '#');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test1387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1387");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("-1.0a a a0.0-1.0  0.0 -1.0a a a0.0-1.0  0.0 -1.0a a a0.0-1.0  0.0 -1.0a a a0.0-1.0  0.0 -1.0a a a0.0-1.0  0.0 -1.0a a a0.0-1.0  0.0 -1.0a a a0.0-1.0  0.0 -1.0a a a0.0-1.0  0.0 -1.0a a a0.0-1.0  0.0 -1.0a a a0.0", "#############################################0.0     0.1-                                        ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test1388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1388");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "aaaaaaa10041", (java.lang.CharSequence) "aaaaaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6 + "'", int2 == 6);
    }

    @Test
    public void test1389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1389");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("aaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaa" + "'", str1, "aaaaaa");
    }

    @Test
    public void test1390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1390");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("                              0.0  0.1-", "... ...", (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1391");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("hi!AAAAAA10041", 35, 88);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1392");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "      ", "-1.0  0.0 ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1393");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("4", "Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4" + "'", str2, "4");
    }

    @Test
    public void test1394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1394");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("aaaaaaahi!i!                                                                                          AAAAAAAHI!hi!                                                                                          AAAAAAAHI!hi!                                                                                          AAAAAAAHI!hi!                                                                                          AAAAAAAHI!hi!                                                                                          AAAAAAAHI!hi!                                                                                          AAAAAAAHI!hi!                                                                                          AAAAAAAHI!hi!                                                                                          AAAAAAAHI!hi!                                                                                          AAAAAAAHI!hi!", "-1.0  0.0 ", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaahi!i!                                                                                          AAAAAAAHI!hi!                                                                                          AAAAAAAHI!hi!                                                                                          AAAAAAAHI!hi!                                                                                          AAAAAAAHI!hi!                                                                                          AAAAAAAHI!hi!                                                                                          AAAAAAAHI!hi!                                                                                          AAAAAAAHI!hi!                                                                                          AAAAAAAHI!hi!                                                                                          AAAAAAAHI!hi!" + "'", str3, "aaaaaaahi!i!                                                                                          AAAAAAAHI!hi!                                                                                          AAAAAAAHI!hi!                                                                                          AAAAAAAHI!hi!                                                                                          AAAAAAAHI!hi!                                                                                          AAAAAAAHI!hi!                                                                                          AAAAAAAHI!hi!                                                                                          AAAAAAAHI!hi!                                                                                          AAAAAAAHI!hi!                                                                                          AAAAAAAHI!hi!");
    }

    @Test
    public void test1395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1395");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("AAAAAAAhi!AAAAAA10041AAAAAAAhi!AAAAAA10041AAAAAAAi!iAAAAAAAhi!AAAAAA10041AAAAAAAhi!AAAAAA10041AAAAAAAh", "... ...", "-1.0  0.0                              ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "AAAAAAAhi!AAAAAA10041AAAAAAAhi!AAAAAA10041AAAAAAAi!iAAAAAAAhi!AAAAAA10041AAAAAAAhi!AAAAAA10041AAAAAAAh" + "'", str3, "AAAAAAAhi!AAAAAA10041AAAAAAAhi!AAAAAA10041AAAAAAAi!iAAAAAAAhi!AAAAAA10041AAAAAAAhi!AAAAAA10041AAAAAAAh");
    }

    @Test
    public void test1396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1396");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "-1.0  0.0                               ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1397");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("                                                 -1.0  0.0                                                   ", ".");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                 -1.0  0.0                                                   " + "'", str2, "                                                 -1.0  0.0                                                   ");
    }

    @Test
    public void test1398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1398");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("AAAAAAAHI!AAAAAA1004", (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                AAAAAAAHI!AAAAAA1004" + "'", str2, "                                AAAAAAAHI!AAAAAA1004");
    }

    @Test
    public void test1399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1399");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("!ihaaaaaaa                                                                                          ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!ihaaaaaaa" + "'", str1, "!ihaaaaaaa");
    }

    @Test
    public void test1400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1400");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "A");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test1401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1401");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("", '#');
        int int4 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI", strArray3);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa-...");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test1402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1402");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat("0.0  0.1-", (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-" + "'", str2, "0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-");
    }

    @Test
    public void test1403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1403");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("                                                                                       aaaaaaahi!HI!", "hi!AAAAAA10041");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1404");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                                               hi!                                               ", "                                                                                          ");
        int int4 = org.apache.commons.lang3.StringUtils.indexOfAny("HI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test1405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1405");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("HI!", "AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1406");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("", "-1.0     0.0", "                                                                                          aaaaaaa10041");
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "0.0");
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, 'a', 90, 40);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1407");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("10041", "", 7);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5 + "'", int3 == 5);
    }

    @Test
    public void test1408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1408");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "HI!                                                                                          aaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI!                                                                                          aaaa" + "'", str1, "HI!                                                                                          aaaa");
    }

    @Test
    public void test1409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1409");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "AAAAAAAhi!AAAAAA10041");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1410");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("        ...", "########################################-1.0#####0.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "        ..." + "'", str2, "        ...");
    }

    @Test
    public void test1411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1411");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("!ihaaaaaaa... ...", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa-...", "AAAAAAAHI!I!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!ihAAAAAAA       " + "'", str3, "!ihAAAAAAA       ");
    }

    @Test
    public void test1412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1412");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("aaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaa" + "'", str1, "aaaaaa");
    }

    @Test
    public void test1413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1413");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("aaaaaaahi!aaaaaa10041", "#############################################0.0     0.1-                                        ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaahi!aaaaaa10041" + "'", str2, "aaaaaaahi!aaaaaa10041");
    }

    @Test
    public void test1414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1414");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("-1.0a a a0.0-1.0  0.0 -1.0a a a0.0-1.0  0.0 -1.0a a a0.0-1.0  0.0 -1.0a a a0.0-1.0  0.0 -1.0a a a0.0-1.0  0.0 -1.0a a a0.0-1.0  0.0 -1.0a a a0.0-1.0  0.0 -1.0a a a0.0-1.0  0.0 -1.0a a a0.0-1.0  0.0 -1.0a a a0.0", "0.00.0                                                                                       aaaaaaahi!HI!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-1.0a a a0.0-1.0  0.0 -1.0a a a0.0-1.0  0.0 -1.0a a a0.0-1.0  0.0 -1.0a a a0.0-1.0  0.0 -1.0a a a0.0-1.0  0.0 -1.0a a a0.0-1.0  0.0 -1.0a a a0.0-1.0  0.0 -1.0a a a0.0-1.0  0.0 -1.0a a a0.0-1.0  0.0 -1" + "'", str2, "-1.0a a a0.0-1.0  0.0 -1.0a a a0.0-1.0  0.0 -1.0a a a0.0-1.0  0.0 -1.0a a a0.0-1.0  0.0 -1.0a a a0.0-1.0  0.0 -1.0a a a0.0-1.0  0.0 -1.0a a a0.0-1.0  0.0 -1.0a a a0.0-1.0  0.0 -1.0a a a0.0-1.0  0.0 -1");
    }

    @Test
    public void test1415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1415");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA!IHAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "           AAAAAAAHI!AAAAAA10041");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA!IHAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str2, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA!IHAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test1416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1416");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("                                                                                       aaaaaaahi!HI!", "aaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                       aaaaaaahi!HI!" + "'", str2, "                                                                                       aaaaaaahi!HI!");
    }

    @Test
    public void test1417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1417");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("                                                                                          aaaaaaa10041", "aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                          aaaaaaa10041" + "'", str2, "                                                                                          aaaaaaa10041");
    }

    @Test
    public void test1418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1418");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("                                        -1.0     0.0", "aaaaaaahi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1419");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("   ", 4, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1420");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.repeat("4####                                                             ", "-1.0     0.0", (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4####                                                             " + "'", str3, "4####                                                             ");
    }

    @Test
    public void test1421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1421");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("HI!                                                                                          aaaa", (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1422");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("-1.0  0.0                               ", "HI!IH       ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-1.0  0.0" + "'", str2, "-1.0  0.0");
    }

    @Test
    public void test1423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1423");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("#############aaaaaaahi!#-1.0#####0.", "-1.0   AAAAAAA10040.", 939, 40);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#############aaaaaaahi!#-1.0#####0.-1.0   AAAAAAA10040." + "'", str4, "#############aaaaaaahi!#-1.0#####0.-1.0   AAAAAAA10040.");
    }

    @Test
    public void test1424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1424");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa-...", "0.00.0                                                                                       AAAAAAAHI!hi");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1425");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("   aaaaaaa1004", "0.00.0                                                                                       aaaaaaahi!HI", 88);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1426");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("4                                                                                                ", "-1.0  0.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4" + "'", str2, "4");
    }

    @Test
    public void test1427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1427");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("                                                                                          aaaaaaahi!", "-", 8);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1428");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("44444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "44444444444444444444444444444444" + "'", str1, "44444444444444444444444444444444");
    }

    @Test
    public void test1429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1429");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("########################################-1.0#####0.", "AAAAAAAHI!AAAAAA1004");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1430");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfBlank((java.lang.CharSequence) "   4", (java.lang.CharSequence) "0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "   4" + "'", charSequence2, "   4");
    }

    @Test
    public void test1431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1431");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("aaaaaaa", (int) '#', 93);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1432");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("-1.0a a a0.0-1.0  0.0 -1.0a a a0.0-1.0  0.0 -1.0a a a0.0-1.0  0.0 -1.0a a a0.0-1.0  0.0 -1.0a a a0.0-1.0  0.0 -1.0a a a0.0-1.0  0.0 -1.0a a a0.0-1.0  0.0 -1.0a a a0.0-1.0  0.0 -1.0a a a0.0-1.0  0.0 -1", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1433");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("-1.0  0.0", 93);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-1.0  0.0" + "'", str2, "-1.0  0.0");
    }

    @Test
    public void test1434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1434");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("!ihaaaa...", "0.00.0                                                                                       AAAAAAAHI!hi");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1435");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("####", "aaaaaaa1004");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1436");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.substringsBetween("", "-1.0     0.0", "                                                                                          aaaaaaa10041");
        boolean boolean6 = org.apache.commons.lang3.StringUtils.endsWithAny("i!i", strArray5);
        boolean boolean7 = org.apache.commons.lang3.StringUtils.startsWithAny("", strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1437");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("                                                 -1.0  0.0                                                   ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                 -1.0  0.0                                                  " + "'", str1, "                                                 -1.0  0.0                                                  ");
    }

    @Test
    public void test1438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1438");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "-1.00.");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1439");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("", "", "!ihaaaaaaa... ...");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test1440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1440");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test1441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1441");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase(" 0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 ", "-1.00.");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1442");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("...    ...", "#############aaaaaaahi!#-1.0#####0.-1.0   AAAAAAA10040.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#############aaaaaaahi!#-1.0#####0.-1.0   AAAAAAA10040." + "'", str2, "#############aaaaaaahi!#-1.0#####0.-1.0   AAAAAAA10040.");
    }

    @Test
    public void test1443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1443");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("aaahi!i!                                                                                          AAAAAAAHI!hi!                                                                                          AAAAAAAHI!hi!                                                                                          AAAAAAAHI!hi!                                                                                          AAAAAAAHI!hi!                                                                                          AAAAAAAHI!hi!                                                                                          AAAAAAAHI!hi!                                                                                          AAAAAAAHI!hi!                                                                                          AAAAAAAHI!hi!                                                                                          AAAAAAAHI!hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaahi!i!                                                                                          aaaaaaahi!hi!                                                                                          aaaaaaahi!hi!                                                                                          aaaaaaahi!hi!                                                                                          aaaaaaahi!hi!                                                                                          aaaaaaahi!hi!                                                                                          aaaaaaahi!hi!                                                                                          aaaaaaahi!hi!                                                                                          aaaaaaahi!hi!                                                                                          aaaaaaahi!hi!" + "'", str1, "aaahi!i!                                                                                          aaaaaaahi!hi!                                                                                          aaaaaaahi!hi!                                                                                          aaaaaaahi!hi!                                                                                          aaaaaaahi!hi!                                                                                          aaaaaaahi!hi!                                                                                          aaaaaaahi!hi!                                                                                          aaaaaaahi!hi!                                                                                          aaaaaaahi!hi!                                                                                          aaaaaaahi!hi!");
    }

    @Test
    public void test1444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1444");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("aaaaaaAAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!", "                                                                                          aaaaaaa1004");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1445");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "                                               hi!                                               ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                               hi!                                               " + "'", str1, "                                               hi!                                               ");
    }

    @Test
    public void test1446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1446");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "   aaaaaaa1004", "aaaaaaahi!444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void test1447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1447");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "                                                                                       aaaaaaahi!HI!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1448");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("#############################################0.0     0.1-                                        ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "#############################################0.0     0.1-" + "'", str1, "#############################################0.0     0.1-");
    }

    @Test
    public void test1449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1449");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("-...", "!IHAAAAAAA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-..." + "'", str2, "-...");
    }

    @Test
    public void test1450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1450");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI", "                                        -1.0     0.0");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI" + "'", str2, "HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI!                                                                                          AAAAAAAHI!HI");
    }

    @Test
    public void test1451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1451");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("!IHAAAAAAA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AAAAAAAHI!" + "'", str1, "AAAAAAAHI!");
    }

    @Test
    public void test1452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1452");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("AAAAAA10041");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AAAAAA10041" + "'", str1, "AAAAAA10041");
    }

    @Test
    public void test1453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1453");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("           AAAAAAAHI!AAAAAA1004");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test1454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1454");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("hi!ih       ", "aaaaaaahi!aaaaaa10041");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!ih       " + "'", str2, "hi!ih       ");
    }

    @Test
    public void test1455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1455");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("                                                    ", 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                    " + "'", str2, "                                                    ");
    }

    @Test
    public void test1456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1456");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("0. -1.0", (int) '4', '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "44444444444444444444440. -1.044444444444444444444444" + "'", str3, "44444444444444444444440. -1.044444444444444444444444");
    }

    @Test
    public void test1457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1457");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("10041", "                                                                                          aaaaaaahi!", (int) ' ');
        java.lang.Class<?> wildcardClass4 = strArray3.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1458");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("                                                                                                    ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                                    " + "'", str1, "                                                                                                    ");
    }

    @Test
    public void test1459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1459");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitByCharacterType("hi!");
        boolean boolean6 = org.apache.commons.lang3.StringUtils.endsWithAny("aaaaaaahi!", strArray5);
        int int7 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray5);
        int int8 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("", strArray5);
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAny("                                   ", strArray5);
        int int10 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("                                        -1.0     0.0#############################################", strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test1460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1460");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "aaahi!i!                                                                                          aaaaaaahi!hi!                                                                                          aaaaaaahi!hi!                                                                                          aaaaaaahi!hi!                                                                                          aaaaaaahi!hi!                                                                                          aaaaaaahi!hi!                                                                                          aaaaaaahi!hi!                                                                                          aaaaaaahi!hi!                                                                                          aaaaaaahi!hi!                                                                                          aaaaaaahi!hi!", "-1.0     0");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1461");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("                                AAAAAAAHI!AAAAAA1004", "#############aaaaaaahi!#-1.0#####0.-1.0   AAAAAAA10040.", "1004");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                AAAAAAAHI!AAAAAA1004" + "'", str3, "                                AAAAAAAHI!AAAAAA1004");
    }

    @Test
    public void test1462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1462");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("aaaaaaa10041", (int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1463");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("aaaaaaa10041", "0.0  0.1-");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1464");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("1.0  0.0", "-1.0a a a0.0-1.0  0.0 -1.0a a a0.0-1.0  0.0 -1.0a a a0.0-1.0  0.0 -1.0a a a0.0-1.0  0.0 -1.0a a a0.0-1.0  0.0 -1.0a a a0.0-1.0  0.0 -1.0a a a0.0-1.0  0.0 -1.0a a a0.0-1.0  0.0 -1.0a a a0.0-1.0  0.0 -1");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1465");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "   aaaaaaa1004", (java.lang.CharSequence) "0.00.0");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1466");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace(".HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HIAAAAAAAhi!AAAAAA10041");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".HI! aaaaaaahi!HI! aaaaaaahi!HI! aaaaaaahi!HI! aaaaaaahi!HI! aaaaaaahi!HI! aaaaaaahi!HI! aaaaaaahi!HI! aaaaaaahi!HI! aaaaaaahi!HIAAAAAAAhi!AAAAAA10041" + "'", str1, ".HI! aaaaaaahi!HI! aaaaaaahi!HI! aaaaaaahi!HI! aaaaaaahi!HI! aaaaaaahi!HI! aaaaaaahi!HI! aaaaaaahi!HI! aaaaaaahi!HI! aaaaaaahi!HIAAAAAAAhi!AAAAAA10041");
    }

    @Test
    public void test1467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1467");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("", "                                              ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1468");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("AAAAAAAhi!AAAAAA10041AAAAAAAhi!AAAAAA10041AAAAAAAi!iAAAAAAAhi!AAAAAA10041AAAAAAAhi!AAAAAA10041AAA...", "                                                 -1.0  0.0                                                  ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1469");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("aaaaaaa1004", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaa1004" + "'", str2, "aaaaaaa1004");
    }

    @Test
    public void test1470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1470");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("AAAAAAAhi!AAAAAA10041", (int) (short) 100, "4                                                                                                ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4                                      AAAAAAAhi!AAAAAA100414                                       " + "'", str3, "4                                      AAAAAAAhi!AAAAAA100414                                       ");
    }

    @Test
    public void test1471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1471");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "!IHAAAAAAA");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test1472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1472");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("-1.0  0.0 ", "0.00.0");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1473");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("aaaaaaAAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!", "AAAAAAAHI!I!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaAAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!" + "'", str2, "aaaaaaAAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!");
    }

    @Test
    public void test1474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1474");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        HI!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1475");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("0.00.0                                                                                       AAAAAAAHI!hi", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1476");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-0.0  0.1-", "14001aaaaaa!ihaaaaaaA");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1477");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("                                                                                          aaaaaaa10041");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                          aaaaaaa10041" + "'", str1, "                                                                                          aaaaaaa10041");
    }

    @Test
    public void test1478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1478");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "   4", (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1479");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("                                                                                          aaaaaaa1004", "HI!IH       ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1480");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("##########################################################################################", 106, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                ##########################################################################################" + "'", str3, "                ##########################################################################################");
    }

    @Test
    public void test1481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1481");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("-1.0  0.0 ", 'a');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test1482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1482");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("#############aaaaaaahi!#-1.0#####0.-1.0   AAAAAAA10040.", (int) (short) 100, "                ##########################################################################################");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                ###################aaaaaaahi!#-1.0#####0.-1.0   AAAAAAA10040.                #######" + "'", str3, "                ###################aaaaaaahi!#-1.0#####0.-1.0   AAAAAAA10040.                #######");
    }

    @Test
    public void test1483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1483");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("##########################################################################################", "                ##########################################################################################", 106);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1484");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi" + "'", str1, "aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi");
    }

    @Test
    public void test1485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1485");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("-1.0     0.", "                                                                                                    ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1486");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test1487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1487");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("#############################################0.0     0.1-                                        ", 109, 4);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test1488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1488");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("!ihaaaaaaa", "hi!AAAAAA10041");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1489");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("                                              ", 109, 74);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1490");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444-1.0  0.0");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1491");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("AAAAAAAhi!AAAAAA10041", (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                            AAAAAAAhi!AAAAAA10041" + "'", str2, "                                                                            AAAAAAAhi!AAAAAA10041");
    }

    @Test
    public void test1492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1492");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "#############aaaaaaahi!#-1.0#####0.", (java.lang.CharSequence) "-1.0  0.");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1493");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("-1.0  0.0", "", 0);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, 'a');
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-1.0  0.0" + "'", str5, "-1.0  0.0");
    }

    @Test
    public void test1494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1494");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("1.00.0", (int) (byte) 0, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1.00.0" + "'", str3, "1.00.0");
    }

    @Test
    public void test1495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1495");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("-", (int) (short) 100, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1496");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "0. -1.0");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 7 + "'", int1 == 7);
    }

    @Test
    public void test1497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1497");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "aaaaaaa10041");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test1498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1498");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty(" 0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0" + "'", str1, "0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0 -1.00.0-1.0  0.0");
    }

    @Test
    public void test1499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1499");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("-1.00.", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1500");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("AAAAAAAhi!AAAAAA10041AAAAAAAhi!AAAAAA10041AAAAAAAi!iAAAAAAAhi!AAAAAA10041AAAAAAAhi!AAAAAA10041AAA...", ".HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HI!                                                                                          aaaaaaahi!HIAAAAAAAhi!AAAAAA10041", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ");
        org.junit.Assert.assertNull(str3);
    }
}

