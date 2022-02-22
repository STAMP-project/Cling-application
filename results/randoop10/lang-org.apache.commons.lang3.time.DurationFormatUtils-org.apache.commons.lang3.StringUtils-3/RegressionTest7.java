import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest7 {

    public static boolean debug = false;

    @Test
    public void test03501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03501");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("44 days", "'p'YYYY'y'm'm'D'dt'h'");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44 days" + "'", str2, "44 days");
    }

    @Test
    public void test03502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03502");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("P0Y0M0DT0H0M0.020S", "SDNOCESSDNOCEShiSDNOCESSDNOCEShiSDNOCESSDNOCEShiSDNOCESSDNOCEShiSDNOCESSDNOCEShiSDNOCESSDNOCEShiSDNOCESSDNOCEShiSDNOCESSDNOCEShiSDNOCESSDNOCEShiSDNOCESSDNOCEShiSDNOCESSDNOCEShiSDNOCESSDNOCEShiSDNOCESSDNOCEShiSDNOCESSDNOCEShiSDNOCESSDNOCEShiSDNOCESSDNOCEShiSDNOCESSDNOCEShiSDNOCESSDNOCEShiSDNOCESSDNOCEShiSDNOCESSDNOCES");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test03503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03503");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference(" AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  " + "'", str2, " HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  ");
    }

    @Test
    public void test03504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03504");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "  I!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "  I!" + "'", str1, "  I!");
    }

    @Test
    public void test03505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03505");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("P0Y0M", "8010.00000TD000Y0Ph", "Aahi!'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S", 30);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "P0Y0M" + "'", str4, "P0Y0M");
    }

    @Test
    public void test03506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03506");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("", "000000000000000000000000000000000I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test03507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03507");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("H", "230.00:00:0                                                                               ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03508");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid(" aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0Y0M0DT0H0M0.001Saaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 5, (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "a" + "'", str3, "a");
    }

    @Test
    public void test03509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03509");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "hi!                   S540.0M0H0TD0M0Y0Paaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!                    ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test03510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03510");
        java.lang.CharSequence charSequence1 = null;
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "P0Y0hP0Y0M", charSequence1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test03511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03511");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  -10 0 0 hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi! 4", "", "hi!P0Y0M0DT0H0M0.099Shi!P0Y0M0DT0H0M0.099SP0Y0M0DT0H0M0.099SP0Y0M0DT0H0M0.099Shi!P0Y0M0DT0H0M0.099");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test03512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03512");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "                                            0:00:00.032                                            ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test03513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03513");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("  hi!   hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!       HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  hi!   hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!       HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  hi!", 33, "                                                                                                                      'P'yyyy'Y'M'M'd'DT'H'                                       hI!hI!h...hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  hi!   hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!       HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  hi!   hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!       HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  hi!" + "'", str3, "  hi!   hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!       HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  hi!   hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!       HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  hi!");
    }

    @Test
    public void test03514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03514");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("T H H", "hi!P0Y0M0DT0H0M0.099Shi!P0Y0M0DT0H0M0.099SP0Y0M0DT0H0M0.099SP0Y0M0DT0H0M0.099Shi!P0Y0M0DT0H0M0.099", (int) (byte) 1);
        int int5 = org.apache.commons.lang3.StringUtils.indexOfAny("i!", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test03515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03515");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459", "0:00:00.001");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test03516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03516");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("AAHI!P0000Y0M0DT0H0M0.99S", "noce0  ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AAHI!P0000Y0M0DT0H0M0.99S" + "'", str2, "AAHI!P0000Y0M0DT0H0M0.99S");
    }

    @Test
    public void test03517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03517");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("h!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih", "0 seconds");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test03518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03518");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("                                                                                                                      'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'44                                                                                                                                ", 900);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                      'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'44                                                                                                                                " + "'", str2, "                                                                                                                      'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'44                                                                                                                                ");
    }

    @Test
    public void test03519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03519");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI ", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA0I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!", "                                                                                       Hi!Hi!H...", (-1));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI " + "'", str4, "I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI ");
    }

    @Test
    public void test03520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03520");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test03521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03521");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfBlank("HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!", "Hi!Hi!hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!" + "'", str2, "HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!");
    }

    @Test
    public void test03522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03522");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "   HI!  HI!  HI!  HI!  HI!  HI", (java.lang.CharSequence) "P0Y0M0DT0H0M0.097");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test03523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03523");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "P-1Y11M30DT23H59M59.972S");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test03524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03524");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  S0 S0 S0 hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi! ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  S0 S0 S0 hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi! " + "'", str1, "Hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  S0 S0 S0 hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi! ");
    }

    @Test
    public void test03525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03525");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("aahi!P0000Y0-10DT07430-10.993599991", 43, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aahi!P0000Y0-10DT07430-10.99359999144444444" + "'", str3, "aahi!P0000Y0-10DT07430-10.99359999144444444");
    }

    @Test
    public void test03526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03526");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("1", "hi!4hi!444hi!40i!0i!0i!0i!0i!0i!0i!0i!0i!                                                                                             aahi!", " !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test03527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03527");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("P0Y0M0DT0H0M0.271S");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "p0y0m0dt0h0m0.271s" + "'", str1, "p0y0m0dt0h0m0.271s");
    }

    @Test
    public void test03528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03528");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  -10 0 0 hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi! ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test03529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03529");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("4444444444444444444444444444HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H4", 90);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444444444444444444444444HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H4" + "'", str2, "4444444444444444444444444444HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H4");
    }

    @Test
    public void test03530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03530");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "4444444444444444444444444444HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H4");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test03531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03531");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("hi!P0Y0M0DT0H0M0.099Shi!P0Y0M0DT0H0M0.099SP0Y0M0DT0H0M0.099SP0Y0M0DT0H0M0.099Shi!P0Y0M0DT0H0M0.099S", "0:00:00.032");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03532");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center(" HI!  HI..", 34, "hi!4hi!444hi!40i!0i!0i!0i!0i!0i!0i!0i!0i!                                                                                             aahi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!4hi!444hi HI!  HI..hi!4hi!444hi" + "'", str3, "hi!4hi!444hi HI!  HI..hi!4hi!444hi");
    }

    @Test
    public void test03533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03533");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  -10 0 0 hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi! 4");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  -10 0 0 hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi! 4" + "'", str1, "hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  -10 0 0 hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi! 4");
    }

    @Test
    public void test03534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03534");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("AAHI!P0000Y0M0DT0H0M0.99S", "HI!                                                                                       Hi!Hi!H...HI!                                                                                       Hi!Hi!H...HI!                                                                                       Hi!Hi!H...HI!                                                                                       Hi!Hi!H...HI!                                                                                       Hi!Hi!H...HI!                                                                                       Hi!Hi!H...HI!                                                                                       Hi!Hi!H...HI!                                                                                       Hi!Hi!H...HI!                                                                                       Hi!Hi!H...HI");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test03535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03535");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("aahi!P0000Y0-10DT07430-10.99359999144444444", 115);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aahi!P0000Y0-10DT07430-10.99359999144444444" + "'", str2, "aahi!P0000Y0-10DT07430-10.99359999144444444");
    }

    @Test
    public void test03536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03536");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "P0Y00P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0PD");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "P0Y00P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0PD" + "'", str1, "P0Y00P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0PD");
    }

    @Test
    public void test03537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03537");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!s0s0s0HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!", "P0Y0M0DT0H0M0.010S");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, " HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  ");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!s0s0s0HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!" + "'", str4, "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!s0s0s0HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!");
    }

    @Test
    public void test03538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03538");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("!", ".s's");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03539");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("'P'yyyy'Y'M'M'd'DT'H'");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "'P'yyyy'Y'M'M'd'DT'H'" + "'", str1, "'P'yyyy'Y'M'M'd'DT'H'");
    }

    @Test
    public void test03540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03540");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "00noce0  ", (java.lang.CharSequence) "h!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!i");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "00noce0  " + "'", charSequence2, "00noce0  ");
    }

    @Test
    public void test03541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03541");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("'p'YYYY'y'm'm'D'dt'h'h'M'm'S.s's'hI!", (int) (byte) 100, "hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "'p'YYYY'y'm'm'D'dt'h'h'M'm'S.s's'hI!hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!h" + "'", str3, "'p'YYYY'y'm'm'D'dt'h'h'M'm'S.s's'hI!hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!h");
    }

    @Test
    public void test03542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03542");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "  I!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "  I!" + "'", str1, "  I!");
    }

    @Test
    public void test03543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03543");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("aaaaaaaaaaaaaaaaaaaaaaaaaaaa!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ihaa", 95, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaa!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ihaa" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaa!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ihaa");
    }

    @Test
    public void test03544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03544");
        char[] charArray4 = new char[] { '4' };
        int int5 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray4);
        int int6 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "          Hi!                                                           hi!", charArray4);
        boolean boolean7 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "aahi!aaaaaaaaaaaaaaaaaaaaaaaaaaaa", charArray4);
        java.lang.Class<?> wildcardClass8 = charArray4.getClass();
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[4]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test03545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03545");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("sdnoces 0", "P0Y0M0DT0H0M0.271S");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "sdnoces 0" + "'", str2, "sdnoces 0");
    }

    @Test
    public void test03546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03546");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("", '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test03547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03547");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("aahi!", 'a');
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3);
        boolean boolean5 = org.apache.commons.lang3.StringUtils.startsWithAny("P0Y0M0DT0H0M0.099S", strArray3);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, '4');
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "44hi!" + "'", str7, "44hi!");
    }

    @Test
    public void test03548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03548");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test03549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03549");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("4444444444444444444444444444444444444444444444aahi!4444444444444444444444444444444444444444444444", '#');
        int int4 = org.apache.commons.lang3.StringUtils.indexOfAny("hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!H", strArray3);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, '4');
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "4444444444444444444444444444444444444444444444aahi!4444444444444444444444444444444444444444444444" + "'", str6, "4444444444444444444444444444444444444444444444aahi!4444444444444444444444444444444444444444444444");
    }

    @Test
    public void test03550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03550");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("Hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h", "0i!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test03551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03551");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I", "P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000D0:00:00.030P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test03552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03552");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("Y0M0DT0H0");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Y0M0DT0H0" + "'", str1, "Y0M0DT0H0");
    }

    @Test
    public void test03553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03553");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("743i!i!i! ", "i!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03554");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 3, "P0Y00P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0PD", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y00P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0PD" + "'", str3, "P0Y00P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0PD");
    }

    @Test
    public void test03555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03555");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("0i!0i!0i!0i!0i!0i!0i!0i!0i!", 2);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "i!" + "'", str2, "i!");
    }

    @Test
    public void test03556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03556");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("0 SECOND");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0SECOND" + "'", str1, "0SECOND");
    }

    @Test
    public void test03557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03557");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("p000000t0h000.0000", "AAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test03558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03558");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("p0Y0M0DT0H0M0.002S", "0 SECONDS");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test03559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03559");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("hi!4hi!444hi!4", 98, 128);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test03560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03560");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("aahi!P0000Y0-10DT07430-10.99359999144444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AAHI!p0000y0-10dt07430-10.99359999144444444" + "'", str1, "AAHI!p0000y0-10dt07430-10.99359999144444444");
    }

    @Test
    public void test03561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03561");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("                                                                                                                      'P'yyyy'Y'M'M'd'DT'H'0 second");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                                                      'P'yyyy'Y'M'M'd'DT'H'0 second" + "'", str1, "                                                                                                                      'P'yyyy'Y'M'M'd'DT'H'0 second");
    }

    @Test
    public void test03562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03562");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationWords((long) 18, false, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0 days" + "'", str3, "0 days");
    }

    @Test
    public void test03563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03563");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!H", "0:00:00.051", "hi!4hi!444hi HI!  HI..hi!4hi!444hi");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!H" + "'", str3, "hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!H");
    }

    @Test
    public void test03564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03564");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("'p'YYYY'y'm'm'D'dt'h'", "743I!I!I! ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test03565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03565");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("HI!HI!HI! ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test03566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03566");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!H", "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H", 52);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test03567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03567");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("Hi!P0Y0M0DT0H0M0.002Shi!P0Y  i!", "sdnoces  ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test03568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03568");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "T H H");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test03569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03569");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459", 51);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459");
    }

    @Test
    public void test03570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03570");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("aaaa0:00:00.018", '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaa0:00:00.018" + "'", str2, "aaaa0:00:00.018");
    }

    @Test
    public void test03571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03571");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi! hi! hi! hi!hhhhi! hi! hi! hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi! hi! hi! hi!hhhhi! hi! hi! hi!" + "'", str1, "Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi! hi! hi! hi!hhhhi! hi! hi! hi!");
    }

    @Test
    public void test03572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03572");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("!4444444444444444444444444444444444444444444444aahi!444444444444444444444444444444444444444444...", 151, 19);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test03573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03573");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("H        ", (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H        " + "'", str2, "H        ");
    }

    @Test
    public void test03574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03574");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "                                                                                              ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test03575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03575");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "0:00:00.051");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test03576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03576");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty(" HI! HI! HI! HI! HI! HI! HI! HI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI! HI! HI! HI! HI! HI! HI! HI!" + "'", str1, "HI! HI! HI! HI! HI! HI! HI! HI!");
    }

    @Test
    public void test03577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03577");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("4444444444444444444444444444444444444444444444aahi!4444444444444444444444444444444444444444444444", "P0Y0M0D...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03578");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "h!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!i");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test03579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03579");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("4444444444444444444444444444444444444444444444aa.099-1hi!P0Y000DT00000.099-1.099-1hi!P0Y000DT00000.099-1.099-1hi!P0Y000DT00000.099-14444444444444444444444444444444444444444444444", 495, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444aa.099-1hi!P0Y000DT00000.099-1.099-1hi!P0Y000DT00000.099-1.099-1hi!P0Y000DT00000.099-14444444444444444444444444444444444444444444444" + "'", str3, "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444aa.099-1hi!P0Y000DT00000.099-1.099-1hi!P0Y000DT00000.099-1.099-1hi!P0Y000DT00000.099-14444444444444444444444444444444444444444444444");
    }

    @Test
    public void test03580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03580");
        java.lang.CharSequence charSequence1 = null;
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfBlank((java.lang.CharSequence) "0i!0i!0i!0i!0i!0i!0i!0i!0i!                                                                                             aahi!", charSequence1);
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "0i!0i!0i!0i!0i!0i!0i!0i!0i!                                                                                             aahi!" + "'", charSequence2, "0i!0i!0i!0i!0i!0i!0i!0i!0i!                                                                                             aahi!");
    }

    @Test
    public void test03581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03581");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("'p'YYYY'y'm'm'D'dt'h'                               ", 31);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "'p'YYYY'y'm'm'D'dt'h'                               " + "'", str2, "'p'YYYY'y'm'm'D'dt'h'                               ");
    }

    @Test
    public void test03582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03582");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H", 32);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H" + "'", str2, "!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H");
    }

    @Test
    public void test03583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03583");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf(" S0 S0 S0 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "0:00:00.035", (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test03584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03584");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("P-1Y11030DT23059059.9839", "0:00:00.035");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03585");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("hi!", "hi!hi!hi!#######################", "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI", (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test03586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03586");
        java.lang.String str1 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationISO((long) 135);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "P0Y0M0DT0H0M0.135S" + "'", str1, "P0Y0M0DT0H0M0.135S");
    }

    @Test
    public void test03587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03587");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("h!ih!ih!ih!i  i!h!ih!ih!ih!i");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "i!hi!hi!hi!h!i  i!hi!hi!hi!h" + "'", str1, "i!hi!hi!hi!h!i  i!hi!hi!hi!h");
    }

    @Test
    public void test03588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03588");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                                                               hi! ", 'a');
        int int4 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray3);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.concatWith("P0Y0M0DT0H0M0.99S", (java.lang.Object[]) strArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "sdnoces  ", 5, 27);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "                                                                                               hi! " + "'", str5, "                                                                                               hi! ");
    }

    @Test
    public void test03589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03589");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("hi!P0Y0M0DT0H0M0.002Shi!P0Y0M0DT0H0M0.002Shi!", "!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test03590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03590");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("                                               DAYS                                               ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                               DAYS                                               " + "'", str1, "                                               DAYS                                               ");
    }

    @Test
    public void test03591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03591");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "                                                                                                                                444S4S4M4m4H4H4TD4d4M4M4Y4yyyy4P4                                                                                                                               ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test03592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03592");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("P00-1", 95, "::.99");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "::.99::.99::.99::.99::.99::.99::.99::.99::.99::.99::.99::.99::.99::.99::.99::.99::.99::.99P00-1" + "'", str3, "::.99::.99::.99::.99::.99::.99::.99::.99::.99::.99::.99::.99::.99::.99::.99::.99::.99::.99P00-1");
    }

    @Test
    public void test03593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03593");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("aaaaaaaaaaaaaaaaaaaaaaaaaaaa", 20);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test03594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03594");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("p0y0m0dt0h0m0.271s", "                                                                                                                      'P'yyyy'Y'M'M'd'DT'H'                                       hI!hI!h...hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test03595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03595");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("############i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h", "0 days 0 hours 0 minutes 0 seconds", 1, 281);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#0 days 0 hours 0 minutes 0 seconds" + "'", str4, "#0 days 0 hours 0 minutes 0 seconds");
    }

    @Test
    public void test03596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03596");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("                                                                                                                                                                                                                                                                    'P'yyyy'Y'M'M'd'DT'H'0 seconds", "000000000");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test03597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03597");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("                                             Hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h                                              ", "hI!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03598");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("0         ", 'a');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test03599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03599");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("'p'YYYY'y'm'm'D'dt'h'h'M'm'S.s's'hI!hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!h", "i!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi", 961);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test03600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03600");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "                                                                                                                                44's's.s'm'm'h'h'td'd'm'm'y'yyyy'p'                                                                                                                               ", (java.lang.CharSequence) "Hi!Hi!hi!");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "                                                                                                                                44's's.s'm'm'h'h'td'd'm'm'y'yyyy'p'                                                                                                                               " + "'", charSequence2, "                                                                                                                                44's's.s'm'm'h'h'td'd'm'm'y'yyyy'p'                                                                                                                               ");
    }

    @Test
    public void test03601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03601");
        char[] charArray10 = new char[] { ' ', '#', ' ', ' ' };
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "Hi!", charArray10);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsAny("'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'", charArray10);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "0 days 0 hours 0 minutes 0 seconds", charArray10);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsAny("                                                                                                                      'P'yyyy'Y'M'M'd'DT'H'", charArray10);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsAny("                                                                                                                                44'S'S.s'M'm'H'H'TD'd'M'M'Y'yyyy'P'                                                                                                                               ", charArray10);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "Y0M0DT0H0M", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), " #  ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), " #  ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[ , #,  ,  ]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test03602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03602");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("aahi!P0000Y0-10DT07430-10.99359999", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03603");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("hi!hi!h...", "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!hi!h..." + "'", str2, "hi!hi!h...");
    }

    @Test
    public void test03604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03604");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("HI! HI! HI! HI! HI! HI! HI! HI!", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test03605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03605");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("H         ", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 151, 90);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H         aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str4, "H         aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test03606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03606");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("aaaaaaaaaaaaaa0i0aaaaaaaaaaaaaaa", "hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaa0i0aaaaaaaaaaaaaaa" + "'", str2, "aaaaaaaaaaaaaa0i0aaaaaaaaaaaaaaa");
    }

    @Test
    public void test03607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03607");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("...3H59M59.872S", "1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 32);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test03608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03608");
        java.lang.Object[] objArray0 = null;
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(objArray0, "::.99aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 43, 290);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test03609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03609");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("                                                                                               hi! ", "P0Y0M0DT0a0M0a99S", "HI!HI!HI! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                               hi! " + "'", str3, "                                                                                               hi! ");
    }

    @Test
    public void test03610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03610");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("hP0Y0M0DT0H0M0.010S", "                                                                    S                                                                      ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test03611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03611");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("0:00:00.290", "AAAAAAAAAA");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test03612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03612");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("HI!                                                                                       Hi!Hi!H...HI!                                                                                       Hi!Hi!H...HI!                                                                                       Hi!Hi!H...HI!                                                                                       Hi!Hi!H...HI!                                                                                       Hi!Hi!H...HI!                                                                                       Hi!Hi!H...HI!                                                                                       Hi!Hi!H...HI!                                                                                       Hi!Hi!H...HI!                                                                                       Hi!Hi!H...HI", (int) ' ');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test03613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03613");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("0DAYS");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0DAYS" + "'", str1, "0DAYS");
    }

    @Test
    public void test03614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03614");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast(" HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI", "0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test03615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03615");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (byte) 0, (-1L), "M30DT23H59M59.872S");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-130DT2374359-159.8723599999" + "'", str3, "-130DT2374359-159.8723599999");
    }

    @Test
    public void test03616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03616");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("######################################hp0y000dt00000.01010#######################################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "######################################hp0y000dt00000.01010#######################################" + "'", str1, "######################################hp0y000dt00000.01010#######################################");
    }

    @Test
    public void test03617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03617");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("hi!                                                                                       hI!hI!h...hi!                                                                                       hI!hI!h...hi!                                                                                       hI!hI!h...hi!                                                                                       hI!hI!h...hi!                                                                                       hI!hI!h...hi!                                                                                       hI!hI!h...hi!                                                                                       hI!hI!h...hi!                                                                                       hI!hI!h...hi!                                                                                       hI!hI!h...hi!", "H         aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!                                                                                       hI!hI!h...hi!                                                                                       hI!hI!h...hi!                                                                                       hI!hI!h...hi!                                                                                       hI!hI!h...hi!                                                                                       hI!hI!h...hi!                                                                                       hI!hI!h...hi!                                                                                       hI!hI!h...hi!                                                                                       hI!hI!h...hi!                                                                                       hI!hI!h...hi!" + "'", str2, "hi!                                                                                       hI!hI!h...hi!                                                                                       hI!hI!h...hi!                                                                                       hI!hI!h...hi!                                                                                       hI!hI!h...hi!                                                                                       hI!hI!h...hi!                                                                                       hI!hI!h...hi!                                                                                       hI!hI!h...hi!                                                                                       hI!hI!h...hi!                                                                                       hI!hI!h...hi!");
    }

    @Test
    public void test03618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03618");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("  i!", "hi!  hi!  hi!  hi!  hi!  hi..");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03619");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("hi!", '#');
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4);
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("aahi!");
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray7, "aahi!", (int) (byte) 10, 0);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray7, ' ');
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.replaceEach("Hi!Hi!H...", strArray4, strArray7);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.endsWithAny("P0Y0M0DT0H0M0.271S", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "aahi!" + "'", str13, "aahi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hi!Hi!H..." + "'", str14, "Hi!Hi!H...");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test03620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03620");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("P0Y0000DT0a00a9915", 32, 19);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test03621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03621");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI", "000000000");
        java.lang.Class<?> wildcardClass3 = strArray2.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test03622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03622");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("I  I  I  I  I  I");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test03623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03623");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "                                                                                            P0Y0M0DT0H0M0.000S");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 110 + "'", int1 == 110);
    }

    @Test
    public void test03624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03624");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("Hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh", "", "S0 S0 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test03625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03625");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("AAHI!P0000Y0M0DT0H0M0.99S", 31, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "   AAHI!P0000Y0M0DT0H0M0.99S   " + "'", str3, "   AAHI!P0000Y0M0DT0H0M0.99S   ");
    }

    @Test
    public void test03626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03626");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("H         aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 18);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03627");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("", 961);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test03628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03628");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi! hi! hi! hi!hhhhi! hi! hi! hi!", 32, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi! hi! hi! hi!hhhhi! hi! hi! hi!" + "'", str3, "Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi! hi! hi! hi!hhhhi! hi! hi! hi!");
    }

    @Test
    public void test03629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03629");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi! hi! hi! hi!hhhhi! hi! hi! hi!", (-1), '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi! hi! hi! hi!hhhhi! hi! hi! hi!" + "'", str3, "Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi! hi! hi! hi!hhhhi! hi! hi! hi!");
    }

    @Test
    public void test03630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03630");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("4444444444444444444444444444444444444444444444aahi!4444444444444444444444444444444444444444444444", 52);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444444444444444444444444444444444444444444aahi!4444444444444444444444444444444444444444444444" + "'", str2, "4444444444444444444444444444444444444444444444aahi!4444444444444444444444444444444444444444444444");
    }

    @Test
    public void test03631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03631");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'44");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test03632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03632");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("P0Y0M0DT0H0M0.000S", "hi!hi!hi! ");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray4);
        int int6 = org.apache.commons.lang3.StringUtils.indexOfAny(" HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI", strArray4);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y0M0DT0H0M0.000S" + "'", str5, "P0Y0M0DT0H0M0.000S");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test03633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03633");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("P00-1Y11M30DT23H59M59.964S44                                                                                                                                ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "P00-1Y11M30DT23H59M59.964S44                                                                                                                                " + "'", str1, "P00-1Y11M30DT23H59M59.964S44                                                                                                                                ");
    }

    @Test
    public void test03634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03634");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("P-1Y11M30DT23H59M59.972S", 27, "Hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HP-1Y11M30DT23H59M59.972SHh" + "'", str3, "HP-1Y11M30DT23H59M59.972SHh");
    }

    @Test
    public void test03635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03635");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "hi!4hi!444hi!40i!0i!0i!0i!0i!0i!0i!0i!0i!                                                                                             aahi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test03636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03636");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("a", 27, 34);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test03637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03637");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "000AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAp000000t0h000.0450");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test03638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03638");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "i!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!", "                            HI");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03639");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("", (-1), "4444444444444444444444444444444444444444444444aahi!4444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test03640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03640");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("noce0  ", "0         ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "noce" + "'", str2, "noce");
    }

    @Test
    public void test03641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03641");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("p0y0m0dt0h0m0.271s", "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI", 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test03642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03642");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("0         ");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("hi!P0Y0M0DT0H0M0.099Shi!P0Y0M0DT0H0M0.099SP0Y0M0DT0H0M0.099SP0Y0M0DT0H0M0.099Shi!P0Y0M0DT0H0M0.099S", strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
    }

    @Test
    public void test03643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03643");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("Hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi...", "0 SECONDS", 97);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test03644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03644");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens(" 0 D ", "   AAHI!P0000Y0M0DT0H0M0.99S   ", 8);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test03645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03645");
        java.lang.String str1 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationISO((long) 151);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "P0Y0M0DT0H0M0.151S" + "'", str1, "P0Y0M0DT0H0M0.151S");
    }

    @Test
    public void test03646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03646");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("                                            0:00:00.032                                            ", "hi!P0Y0M0DT0H0M0.099Shi!P0Y0M0DT0H0M0.099SP0Y0M0DT0H0M0.099SP0Y0M0DT0H0M0.099Shi!P0Y0M0DT0H0M0.099S", "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                            I:II:IIII32                                            " + "'", str3, "                                            I:II:IIII32                                            ");
    }

    @Test
    public void test03647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03647");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween(" DAYS                                                                                               ", "0 second");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test03648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03648");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("                                                                                                                                44's's.s'm'm'h'h'td'd'm'm'y'yyyy'p'                                                                                                                               ", "aaP0Y000DT00000.0459");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03649");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("0i!0i!0i!0i!0i!0i!0i!0i!0i!                                                                                             aahi!", 15, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0i!0i!0i!0i!0i!0i!0i!0i!0i!                                                                                             aahi!" + "'", str3, "0i!0i!0i!0i!0i!0i!0i!0i!0i!                                                                                             aahi!");
    }

    @Test
    public void test03650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03650");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("0:00:00.135", "                                                                                                                      'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'44                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test03651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03651");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("aaaaaaaaaaaaaaaaaaaaaaaaaaaa!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ihaa", "Hi!Hi!H..", "                                            I:II:IIII32                                            ");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test03652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03652");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("P0Y0M0DT0H0M0.071Shi!4hi!444hi!4P0Y0M0DT0H0M0.071Shi!4hi!444hi!4P0Y0M0DT0H0M0.071Shi!4hi!444hi!4P0Y0M0DT0H0M0.071Shi!4hi!444hi!4P0Y0M0DT0H0M0.071Shi!4hi!444hi!4P0Y0M0DT0H0M0.071Shi!4hi!444hi!4P0Y0M0DT0H0M0.071Shi!4hi!444hi!4P0Y0M0DT0H0M0.071Shi!4hi!444hi!4P0Y0M0DT0H0M0.071Shi!4hi!444hi!4P0Y0M0DT0H0M0.071S", "444S4S4M4m4H4H4TD4d4M4M4Y4yyyy4P4");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.071Shi!4hi!444hi!4P0Y0M0DT0H0M0.071Shi!4hi!444hi!4P0Y0M0DT0H0M0.071Shi!4hi!444hi!4P0Y0M0DT0H0M0.071Shi!4hi!444hi!4P0Y0M0DT0H0M0.071Shi!4hi!444hi!4P0Y0M0DT0H0M0.071Shi!4hi!444hi!4P0Y0M0DT0H0M0.071Shi!4hi!444hi!4P0Y0M0DT0H0M0.071Shi!4hi!444hi!4P0Y0M0DT0H0M0.071Shi!4hi!444hi!4P0Y0M0DT0H0M0.071S" + "'", str2, "P0Y0M0DT0H0M0.071Shi!4hi!444hi!4P0Y0M0DT0H0M0.071Shi!4hi!444hi!4P0Y0M0DT0H0M0.071Shi!4hi!444hi!4P0Y0M0DT0H0M0.071Shi!4hi!444hi!4P0Y0M0DT0H0M0.071Shi!4hi!444hi!4P0Y0M0DT0H0M0.071Shi!4hi!444hi!4P0Y0M0DT0H0M0.071Shi!4hi!444hi!4P0Y0M0DT0H0M0.071Shi!4hi!444hi!4P0Y0M0DT0H0M0.071Shi!4hi!444hi!4P0Y0M0DT0H0M0.071S");
    }

    @Test
    public void test03653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03653");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("sdnoces  ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test03654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03654");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("0:00:00.100");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0:00:00.100" + "'", str1, "0:00:00.100");
    }

    @Test
    public void test03655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03655");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi! hi! hi! hi!hhhhi! hi! hi! hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI! HI! HI! HI!HHHHI! HI! HI! HI!" + "'", str1, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI! HI! HI! HI!HHHHI! HI! HI! HI!");
    }

    @Test
    public void test03656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03656");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("  HI!  HI!  HI!  HI!  HI!  HI..", "28010.00000TD000Y0Ph");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test03657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03657");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("HI!  HI!  HI!  HI!  HI!  HI..", "hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  -10 0 0 hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi! ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03658");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("Hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  S0 S0 S0 hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi! ", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03659");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("HI!", 139, (int) '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HI!" + "'", str3, "HI!");
    }

    @Test
    public void test03660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03660");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("aAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA0000000000000000000000000000000000I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!", "HHHAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAp0y0m0dt0h0m0.045s");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03661");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("HI!44HI!44HI!44HI!44HI!44HI..", "hi!Hi!hi!Hi!Hi!Hi!hi!Hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!44HI!44HI!44HI!44HI!44HI.." + "'", str2, "HI!44HI!44HI!44HI!44HI!44HI..");
    }

    @Test
    public void test03662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03662");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "p0y0  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi! ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test03663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03663");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "   hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!       HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test03664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03664");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("T H H", "P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000D0:00:00.030P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "T H H" + "'", str2, "T H H");
    }

    @Test
    public void test03665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03665");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("0SECOND", " S0 S0 S0 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 135);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0SECOND" + "'", str3, "0SECOND");
    }

    @Test
    public void test03666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03666");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("        0:00:00.032        ", 31);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test03667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03667");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "'p'YYYY'y'm'm'D'dt'h'");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test03668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03668");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.repeat("!hi!hi!h", "230.00:00:0", 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test03669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03669");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                                                                                                                      'P'YYYY'Y'M'M'D'DT'H'H'M'M'S.S'S'44                                                                                                                                ", "h!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!i");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test03670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03670");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("0i!", "  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!", "  I!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0i!" + "'", str3, "0i!");
    }

    @Test
    public void test03671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03671");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "00000000000000000000000000004444444444444444444444444444HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H4I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test03672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03672");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("0:00:00.135", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03673");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("hi!hi!hi!", (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!hi!hi!" + "'", str2, "hi!hi!hi!");
    }

    @Test
    public void test03674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03674");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("hi!0S 0S 00S 0S 00S 0S 00S 0S 00S ", '#', '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!0S 0S 00S 0S 00S 0S 00S 0S 00S " + "'", str3, "hi!0S 0S 00S 0S 00S 0S 00S 0S 00S ");
    }

    @Test
    public void test03675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03675");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (short) 100, (long) 900, "T H H");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "T 00 " + "'", str3, "T 00 ");
    }

    @Test
    public void test03676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03676");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "0i!4444444444444444444444444444444444444444444444aahi!4444444444444444444444444444444444444444444444 days");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0i!4444444444444444444444444444444444444444444444aahi!4444444444444444444444444444444444444444444444 days" + "'", str1, "0i!4444444444444444444444444444444444444444444444aahi!4444444444444444444444444444444444444444444444 days");
    }

    @Test
    public void test03677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03677");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'Hi!", "P0Y000DT00000.01010");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03678");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("i!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!H", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y0M0DT0H0M0.045S", 290);
        java.lang.Class<?> wildcardClass4 = strArray3.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test03679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03679");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("hi!4hi!444hi!4", '4');
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "P0Y0M0DT0H0M0.002S");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, '#', 11, 28);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 11");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!P0Y0M0DT0H0M0.002Shi!P0Y0M0DT0H0M0.002Shi!" + "'", str4, "hi!P0Y0M0DT0H0M0.002Shi!P0Y0M0DT0H0M0.002Shi!");
    }

    @Test
    public void test03680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03680");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("444444444444444  hi!444444444444444", 19);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test03681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03681");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!", "##", (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test03682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03682");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("hi! hi! hi! hi!hhhhi! hi! hi! hi!", "4444444444", 63);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test03683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03683");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("Hi!0S 0S 00S 0S 00S 0S 00S 0S 00S ", " DAYS", 139);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Hi!0S 0S 00S 0S 00S 0S 00S 0S 00S " + "'", str3, "Hi!0S 0S 00S 0S 00S 0S 00S 0S 00S ");
    }

    @Test
    public void test03684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03684");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 24, (long) 900, "i!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03685");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("h                                                                                                                               P00-1Y11M30DT23H59M59.964S44                                                                                                                                0Y0M0DT0H0M0.010S", "                                                                                               hi! ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "h                                                                                                                               P00-1Y11M30DT23H59M59.964S44                                                                                                                                0Y0M0DT0H0M0.010S" + "'", str2, "h                                                                                                                               P00-1Y11M30DT23H59M59.964S44                                                                                                                                0Y0M0DT0H0M0.010S");
    }

    @Test
    public void test03686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03686");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("P0Y0M0DT0H0M0.031S");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "S130.0M0H0TD0M0Y0P" + "'", str1, "S130.0M0H0TD0M0Y0P");
    }

    @Test
    public void test03687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03687");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("hHHAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAp0y0m0dt0h0m0.045s", 289, (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test03688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03688");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("4444P0Y000DT00000.099104444", 191);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444P0Y000DT00000.099104444" + "'", str2, "4444P0Y000DT00000.099104444");
    }

    @Test
    public void test03689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03689");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("00000000000000000000000000004444444444444444444444444444HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H4I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I", "hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test03690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03690");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("hi!   hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!       HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  hi!   hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!       HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  hi!", (int) (short) 100, 96);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test03691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03691");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("0:00:00.043", 24, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4444440:00:00.0434444444" + "'", str3, "4444440:00:00.0434444444");
    }

    @Test
    public void test03692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03692");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "0 SECOND");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0 SECOND" + "'", str1, "0 SECOND");
    }

    @Test
    public void test03693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03693");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("0I!p0y000dt00000.099-1HI!p0", 43, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0I!p0y000dt00000.099-1HI!p0aaaaaaaaaaaaaaaa" + "'", str3, "0I!p0y000dt00000.099-1HI!p0aaaaaaaaaaaaaaaa");
    }

    @Test
    public void test03694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03694");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "aahi!'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test03695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03695");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring(" DAYS", 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test03696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03696");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("0...", 289);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03697");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("4444444444444444444444444444444444444444444444aahi!4444444444444444444444444444444444444444444444", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444444444444444444444444444444444444444444aahi!4444444444444444444444444444444444444444444444" + "'", str2, "4444444444444444444444444444444444444444444444aahi!4444444444444444444444444444444444444444444444");
    }

    @Test
    public void test03698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03698");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444aa.099-1hi!P0Y000DT00000.099-1.099-1hi!P0Y000DT00000.099-1.099-1hi!P0Y000DT00000.099-14444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444aa.099-1hi!P0Y000DT00000.099-1.099-1hi!P0Y000DT00000.099-1.099-1hi!P0Y000DT00000.099-14444444444444444444444444444444444444444444444" + "'", str1, "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444aa.099-1hi!P0Y000DT00000.099-1.099-1hi!P0Y000DT00000.099-1.099-1hi!P0Y000DT00000.099-14444444444444444444444444444444444444444444444");
    }

    @Test
    public void test03699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03699");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "hi!                                                                                       hI!hI!h...hi!                                                                                       hI!hI!h...hi!                                                                                       hI!hI!h...hi!                                                                                       hI!hI!h...hi!                                                                                       hI!hI!h...hi!                                                                                       hI!hI!h...hi!                                                                                       hI!hI!h...hi!                                                                                       hI!hI!h...hi!                                                                                       hI!hI!h...hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test03700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03700");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("P00-1Y11M30DT23H59M59.964S44                                                                                                                                ", "HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P00-1Y11M30DT23H59M59.964S44                                                                                                                                " + "'", str2, "P00-1Y11M30DT23H59M59.964S44                                                                                                                                ");
    }

    @Test
    public void test03701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03701");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("0 D", 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03702");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("i!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!H", "'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'Hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test03703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03703");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test03704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03704");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H", 96);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H" + "'", str2, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H");
    }

    @Test
    public void test03705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03705");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "HI!  HI!  HI!  HI!  HI!  HI..");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test03706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03706");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("##hi!", " DAYS");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "##hi!" + "'", str2, "##hi!");
    }

    @Test
    public void test03707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03707");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "P-1Y11M30DT23H59M59.937S");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 24 + "'", int1 == 24);
    }

    @Test
    public void test03708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03708");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "p0y0m0dt0h0m0.271s", (java.lang.CharSequence) "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444440320:00:00.0320:00:00.0320:00:00.0320:00:00.0320:00:00.0320:00:00.0320:00:00.032");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test03709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03709");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("hhh", 100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03710");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("h!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'Hi!h!ih!ih!ih!ih!ih!ih!ih!ih!ih!i", "P-1Y11M30DT23H59M59.110S");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03711");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!", "AAAAAAAAAAAAAAA...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03712");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("############i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "############i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h" + "'", str1, "############i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h");
    }

    @Test
    public void test03713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03713");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "0I!p0y000dt00000.099-1HI!p0y000dt00000.099-1p0y000dt00000.099-1p0y000dt00000.09", (java.lang.CharSequence) "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03714");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("", "M30DT23H59M59.872S", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test03715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03715");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("                                             Hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h                                              ", 191, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                             Hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h                                              " + "'", str3, "                                             Hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h                                              ");
    }

    @Test
    public void test03716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03716");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("44 days", 35, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "              44 days              " + "'", str3, "              44 days              ");
    }

    @Test
    public void test03717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03717");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "hi!                                                                                       hI!hI!h...hi!                                                                                       hI!hI!h...hi!                                                                                       hI!hI!h...hi!                                                                                       hI!hI!h...hi!                                                                                       hI!hI!h...hi!                                                                                       hI!hI!h...hi!                                                                                       hI!hI!h...hi!                                                                                       hI!hI!h...hi!                                                                                       hI!hI!h...hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test03718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03718");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("P0Y0M0DT0H0M0.001S", 52, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                 P0Y0M0DT0H0M0.001S                 " + "'", str3, "                 P0Y0M0DT0H0M0.001S                 ");
    }

    @Test
    public void test03719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03719");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "4444444444444444444444444444HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H4");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test03720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03720");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("P0Y0M0DT0H0M0.031S", "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.031S" + "'", str2, "P0Y0M0DT0H0M0.031S");
    }

    @Test
    public void test03721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03721");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("  i!", 282, 289);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test03722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03722");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("                                                                                              hi!", 28, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                              hi!" + "'", str3, "                                                                                              hi!");
    }

    @Test
    public void test03723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03723");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("                P0Y0M0DT0H0M0.100S");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "P0Y0M0DT0H0M0.100S" + "'", str1, "P0Y0M0DT0H0M0.100S");
    }

    @Test
    public void test03724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03724");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("I", 2);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03725");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationWords((long) 31, true, false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0 seconds" + "'", str3, "0 seconds");
    }

    @Test
    public void test03726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03726");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.repeat("0:00:00.135", " HI!  HI..", 5);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:00:00.135 HI!  HI..0:00:00.135 HI!  HI..0:00:00.135 HI!  HI..0:00:00.135 HI!  HI..0:00:00.135" + "'", str3, "0:00:00.135 HI!  HI..0:00:00.135 HI!  HI..0:00:00.135 HI!  HI..0:00:00.135 HI!  HI..0:00:00.135");
    }

    @Test
    public void test03727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03727");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi! hi! hi! hi!hhhhi! hi! hi! hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test03728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03728");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("I  I  I  I  I  I", "                                                                               0:00:00.032", 21);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test03729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03729");
        char[] charArray1 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("", charArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03730");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("P0Y00P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0PD", "0i!0i!0i!0i!0i!0i!0i!0i!0i!                                                                                             aahi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03731");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("0 seconds");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0 seconds" + "'", str2, "0 seconds");
    }

    @Test
    public void test03732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03732");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("P0Y0M0DT0H0M0.135S", "HP-1Y11M30DT23H59M59.972SHh");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.135S" + "'", str2, "P0Y0M0DT0H0M0.135S");
    }

    @Test
    public void test03733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03733");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("hi!        hi!                        hi!        ", "  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!        hi!                        hi!        " + "'", str2, "hi!        hi!                        hi!        ");
    }

    @Test
    public void test03734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03734");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'44");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'44" + "'", str1, "'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'44");
    }

    @Test
    public void test03735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03735");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (byte) 1, "Hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0i!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!" + "'", str3, "0i!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!");
    }

    @Test
    public void test03736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03736");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("HP-1Y11M30DT23H59M59.972SHh", 961, 5);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test03737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03737");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) " aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0Y0M0DT0H0M0.001Saaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test03738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03738");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("sdnoces 0");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "SDNOCES 0" + "'", str1, "SDNOCES 0");
    }

    @Test
    public void test03739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03739");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("h                                                                                                                               P00-1Y11M30DT23H59M59.964S44                                                                                                                                0Y0M0DT0H0M0.010S");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h P00-1Y11M30DT23H59M59.964S44 0Y0M0DT0H0M0.010S" + "'", str1, "h P00-1Y11M30DT23H59M59.964S44 0Y0M0DT0H0M0.010S");
    }

    @Test
    public void test03740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03740");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("                     0                              ", 37);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                     0                              " + "'", str2, "                     0                              ");
    }

    @Test
    public void test03741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03741");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("0SECOND");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0SECOND" + "'", str1, "0SECOND");
    }

    @Test
    public void test03742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03742");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("h!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!i", "p0y0m0dt0h0m0.000s");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "h!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!i" + "'", str2, "h!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!i");
    }

    @Test
    public void test03743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03743");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("hi!");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test03744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03744");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("28010.00000TD000Y0Ph", "                                                                                                                      'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'44                                                                                                                                ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test03745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03745");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) 21, (long) 128);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.107S" + "'", str2, "P0Y0M0DT0H0M0.107S");
    }

    @Test
    public void test03746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03746");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationWords((long) 135, false, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0 days" + "'", str3, "0 days");
    }

    @Test
    public void test03747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03747");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("hi!hi!hi!", "Hi!Hi!H...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03748");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("p0Y000DT00000.01010", "                                                                                                 ", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "p0Y000DT00000.01010" + "'", str3, "p0Y000DT00000.01010");
    }

    @Test
    public void test03749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03749");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("i!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi", "'P'yyyy'Y'M'M'd'DT'H'");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "'P'yyyy'Y'M'M'd'DT'H'" + "'", str2, "'P'yyyy'Y'M'M'd'DT'H'");
    }

    @Test
    public void test03750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03750");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfBlank((java.lang.CharSequence) "      HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!", (java.lang.CharSequence) "hi!                                                                                       hI!hI!h...hi!                                                                                       hI!hI!h...hi!                                                                                       hI!hI!h...hi!                                                                                       hI!hI!h...hi!                                                                                       hI!hI!h...hi!                                                                                       hI!hI!h...hi!                                                                                       hI!hI!h...hi!                                                                                       hI!hI!h...hi!                                                                                       hI!hI!h...hi!");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "      HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!" + "'", charSequence2, "      HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!");
    }

    @Test
    public void test03751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03751");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!HHi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!HHi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!HHi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!HHi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!HHi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!HHi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!HHi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!HHi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!H");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!HHi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!HHi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!HHi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!HHi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!HHi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!HHi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!HHi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!HHi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!H" + "'", str1, "Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!HHi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!HHi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!HHi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!HHi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!HHi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!HHi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!HHi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!HHi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!H");
    }

    @Test
    public void test03752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03752");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase(" days", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa'S'S.s'M'm'H'H'TD'd'M'M'Y'yyyy'P'aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " days" + "'", str2, " days");
    }

    @Test
    public void test03753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03753");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("", "P00-1Y11M30DT23H59M59.964S44", 98);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test03754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03754");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("                                                                                                                               P00-1Y11M30DT23H59M59.964S44                                                                                                                                ", "p0Y0M0DT0H0M0.045S", "444444444HI!HI!HI!4444444444");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test03755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03755");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("0i!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!", '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0i!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!" + "'", str2, "0i!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!");
    }

    @Test
    public void test03756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03756");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("  hi!hi!hi!#######################", "                                                                                                 ", "hi! hi!   hi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  hi!hi!hi!#######################" + "'", str3, "  hi!hi!hi!#######################");
    }

    @Test
    public void test03757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03757");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast(" HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI", "aaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI" + "'", str2, " HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI");
    }

    @Test
    public void test03758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03758");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "00noce000noce00I00noce000noce00I00noce000noce00I00noce000noce00I00noce000noce00I00noce000noce00I00noce000noce00I00noce000noce00I00noce000noce00I00noce000noce00I00noce000noce00I00noce000noce00I00noce000noce00I00noce000noce00I00noce000noce00I00noce000noce00I00noce000noce00I00noce000noce00I00noce000noce00I00noce000noce0");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test03759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03759");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray12 = new java.lang.String[] { "hi!", "hi!", "", "", "hi!", "" };
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("", strArray5, strArray12);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.startsWithAny("Hi!", strArray5);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray5, "                                                                                            P0Y0M0DT0H0M0.000S");
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "                                                                                            P0Y0M0DT0H0M0.000S                                                                                            P0Y0M0DT0H0M0.000Shi!" + "'", str16, "                                                                                            P0Y0M0DT0H0M0.000S                                                                                            P0Y0M0DT0H0M0.000Shi!");
    }

    @Test
    public void test03760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03760");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("i!", "HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "i!" + "'", str2, "i!");
    }

    @Test
    public void test03761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03761");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("sdnoces  ", "hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!H", 32);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "   HI!  HI!  HI!  HI!  HI!  HI", 20, 99);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 20");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test03762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03762");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("0s 0s 0", "P0Y0M0DT0H0M0.009S");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "0 D0 D0 D0 D0 D0 'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'44", (int) 'a', 191);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test03763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03763");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("P00-1Y11M30DT23H59M59.964S44                                                                                                                                ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "P00-1Y11M30DT23H59M59.964S44" + "'", str1, "P00-1Y11M30DT23H59M59.964S44");
    }

    @Test
    public void test03764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03764");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("H         H         H         H         H         H         H         H         H         H         H aahi!'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHHHHHHHHHHaahi!'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S" + "'", str1, "HHHHHHHHHHHaahi!'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S");
    }

    @Test
    public void test03765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03765");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("0I!", 38, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                   0I!" + "'", str3, "                                   0I!");
    }

    @Test
    public void test03766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03766");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  ", "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test03767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03767");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("hi! ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!" + "'", str1, "hi!");
    }

    @Test
    public void test03768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03768");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("                                                                                                                               'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'44                                                                                                                                ", "-1Y11M30DT23H59M59.964S44                                                                                                                                ", "aaaaaaaaaaaaaa0i0aaaaaaaaaaaaaaa");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test03769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03769");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "P yyyy Y        T", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test03770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03770");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 289, (long) (byte) 0, "                                                                                                                                444S4S4M4m4H4H4TD4d4M4M4Y4yyyy4P4                                                                                                                               ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                                44459711441145942344TD43041144Y400-14P4                                                                                                                               " + "'", str3, "                                                                                                                                44459711441145942344TD43041144Y400-14P4                                                                                                                               ");
    }

    @Test
    public void test03771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03771");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("!4444444444444444444444444444444444444444444444aahi!4444444444444444444444444444444444444444444444", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "hi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!a", 38);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "!4444444444444444444444444444444444444444444444aahi!4444444444444444444444444444444444444444444444" + "'", str4, "!4444444444444444444444444444444444444444444444aahi!4444444444444444444444444444444444444444444444");
    }

    @Test
    public void test03772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03772");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("00noce0  ", "Hi!Hi!H...", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test03773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03773");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("P yyyy Y        T", "HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI" + "'", str2, "HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI");
    }

    @Test
    public void test03774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03774");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "-130DT2374359-159.8723599999");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 28 + "'", int1 == 28);
    }

    @Test
    public void test03775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03775");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("aaaa0:00:00.018", "H         ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03776");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("     743i!i!i! ", "hi!4444444sdnoces  4444444444444444a4444444444444444444444444444444444444444444444", 37);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test03777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03777");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("                                                                                            P0Y0M0DT0H0M0.000S                                                                                            P0Y0M0DT0H0M0.000Shi!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test03778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03778");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "HHHAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAp0y0m0dt0h0m0.045s");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHHAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAp0y0m0dt0h0m0.045s" + "'", str1, "HHHAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAp0y0m0dt0h0m0.045s");
    }

    @Test
    public void test03779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03779");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) 289, (long) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P-1Y11M30DT23H59M59.808S" + "'", str2, "P-1Y11M30DT23H59M59.808S");
    }

    @Test
    public void test03780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03780");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "P0Y0M0DT0H0M0.065S", "HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03781");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("", "743i!i!i! ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test03782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03782");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  S0 S0 S0 hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!", 115, (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test03783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03783");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("##'P'yyyy'");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "##'P'yyyy'" + "'", str1, "##'P'yyyy'");
    }

    @Test
    public void test03784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03784");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 961, "                                                                                              hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                              hi!" + "'", str2, "                                                                                              hi!");
    }

    @Test
    public void test03785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03785");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("0:00:00.079", 95, 282);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test03786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03786");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "H         aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (java.lang.CharSequence) "0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03787");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("  hi!", "                                                                                              hi!");
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "                                                                                                                      'P'YYYY'Y'M'M'D'DT'H'H'M'M'S.S'S'44                                                                                                                                ", 33, 21);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test03788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03788");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("Hi!", 90);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                       Hi!" + "'", str2, "                                                                                       Hi!");
    }

    @Test
    public void test03789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03789");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("h!ih!ih!ih!i  i!h!ih!ih!ih!i");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h!ih!ih!ih!i  i!h!ih!ih!ih!i" + "'", str1, "h!ih!ih!ih!i  i!h!ih!ih!ih!i");
    }

    @Test
    public void test03790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03790");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("P-1Y11M30DT23H59M59.999");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "P-1Y11M30DT23H59M59.999" + "'", str1, "P-1Y11M30DT23H59M59.999");
    }

    @Test
    public void test03791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03791");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI" + "'", str1, "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI");
    }

    @Test
    public void test03792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03792");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone(charSequence0, "S");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test03793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03793");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("P0Y0M0DT0H0M0.99S", (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0Y0M0DT0H0M0.99S" + "'", str2, "0Y0M0DT0H0M0.99S");
    }

    @Test
    public void test03794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03794");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "Phh-1Y11M3hDT23H59M59M964S44                                                                                                                                ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test03795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03795");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("HI!44HI!44HI!44!HI!44HI!44HI!44H", "  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!44HI!44HI!44!HI!44HI!44HI!44H" + "'", str2, "HI!44HI!44HI!44!HI!44HI!44HI!44H");
    }

    @Test
    public void test03796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03796");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "0i!P0Y000DT00000.099-1hi!P0", (java.lang.CharSequence) "######################################hp0y000dt00000.01010#######################################");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test03797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03797");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat("hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  S0 S0 S0 hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!", 3);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  S0 S0 S0 hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  S0 S0 S0 hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  S0 S0 S0 hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!" + "'", str2, "hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  S0 S0 S0 hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  S0 S0 S0 hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  S0 S0 S0 hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!");
    }

    @Test
    public void test03798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03798");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("4444444444444444444444444444444444444444444444aa.099-1hi!P0Y000DT00000.099-1.099-1hi!P0Y000DT00000.099-1.099-1hi!P0Y000DT00000.099-14444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test03799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03799");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("", "   HI!  HI!  HI!  HI!  HI!  HI...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test03800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03800");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("  hi!  hi!  hi!  hi!  hi!  hi...", 15);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03801");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("0I!0I!0I!0IP0Y00P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0PD", "p0Y000DT00000.010100Y0M0DT0H0M0.001S");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0I!0I!0I!0IP0Y00P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0PD" + "'", str2, "0I!0I!0I!0IP0Y00P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0PD");
    }

    @Test
    public void test03802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03802");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("0:00:00.079", "aaaaaaaaaaaaaaaaaaaaaaaa", "                                                                                                      aahi!'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:00:00.079" + "'", str3, "0:00:00.079");
    }

    @Test
    public void test03803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03803");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("hHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray1, " P yyyy Y        T H H          ");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray1);
        java.lang.Class<?> wildcardClass5 = strArray1.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test03804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03804");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("                     0                              ", '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                     0                              " + "'", str2, "                     0                              ");
    }

    @Test
    public void test03805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03805");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "000AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAp000000t0h000.0450");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "000AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAp000000t0h000.0450" + "'", str1, "000AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAp000000t0h000.0450");
    }

    @Test
    public void test03806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03806");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("I!I!I!", (int) (short) 0, 33);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test03807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03807");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  -10 0 0 hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi! 4", 38, "P0Y0  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  -10 0 0 hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi! 4" + "'", str3, "hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  -10 0 0 hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi! 4");
    }

    @Test
    public void test03808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03808");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!hi!hi! ", '4');
        int int4 = org.apache.commons.lang3.StringUtils.indexOfAny("sdnoces  ", strArray3);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "P0Y0M0DT0H0M0.101S");
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!hi!hi! " + "'", str6, "hi!hi!hi! ");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!hi!hi! " + "'", str7, "hi!hi!hi! ");
    }

    @Test
    public void test03809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03809");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "0:00:00.018");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test03810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03810");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "                     H                              ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test03811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03811");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("i!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!H", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y0M0DT0H0M0.045S", 290);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.concatWith("      HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!", (java.lang.Object[]) strArray5);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                                                                                      'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'44                                                                                                                                ");
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.replaceEach("", strArray5, strArray8);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray8);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "i!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!H" + "'", str6, "i!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!H");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test03812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03812");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("HI!44HI!44HI!44!HI!44HI!44HI!44H", 4);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03813");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("i!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!H", "hi!4hi!444hi!40i!0i!0i!0i!0i!0i!0i!0i!0i!                                                                                             aahi!", 31);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test03814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03814");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'Hi!", "I!                                                                                       Hi!Hi!H...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'" + "'", str2, "'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'");
    }

    @Test
    public void test03815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03815");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("aahi!P0000Y0-10DT07430-10.99359999");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AAHI!p0000y0-10dt07430-10.99359999" + "'", str1, "AAHI!p0000y0-10dt07430-10.99359999");
    }

    @Test
    public void test03816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03816");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "230.00:00:0                                                                               ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 90 + "'", int1 == 90);
    }

    @Test
    public void test03817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03817");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("Hi!Hi!H...Hi!Hi!H...Hi!Hi!H...Hi!Hi!H...Hi!Hi!H.!i0Hi!Hi!H...Hi!Hi!H...Hi!Hi!H...Hi!Hi!H...Hi!Hi!H..", "  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test03818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03818");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("  HI!  HI!  HI!  HI!  HI!  HI...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI!  HI!  HI!  HI!  HI!  HI..." + "'", str1, "HI!  HI!  HI!  HI!  HI!  HI...");
    }

    @Test
    public void test03819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03819");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("P0Y000DT00000.09910", "                                                                                                                                444S4S4M4m4H4H4TD4d4M4M4Y4yyyy4P4                                                                                                                               ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.09910" + "'", str2, "P0Y000DT00000.09910");
    }

    @Test
    public void test03820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03820");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfBlank((java.lang.CharSequence) "P-1Y11M30DT23H59M59.999S", (java.lang.CharSequence) "Hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "P-1Y11M30DT23H59M59.999S" + "'", charSequence2, "P-1Y11M30DT23H59M59.999S");
    }

    @Test
    public void test03821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03821");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "P0Y0M0DT0H0M0.033S", (java.lang.CharSequence) " 0 D ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test03822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03822");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("0i!4444444444444444444444444444444444444444444444aahi!444444444444444444444444444444444444444444444", 101, "0:00:00.001");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:0i!4444444444444444444444444444444444444444444444aahi!444444444444444444444444444444444444444444444" + "'", str3, "0:0i!4444444444444444444444444444444444444444444444aahi!444444444444444444444444444444444444444444444");
    }

    @Test
    public void test03823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03823");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "HI");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test03824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03824");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat("hi!", 139);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str2, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test03825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03825");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!" + "'", str1, "hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!");
    }

    @Test
    public void test03826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03826");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "0:00:00.032");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test03827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03827");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) 100, (long) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.000S" + "'", str2, "P0Y0M0DT0H0M0.000S");
    }

    @Test
    public void test03828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03828");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("0:00:00.018", "P-1Y11030DT23059059.9839");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03829");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("S130.0M0H0TD0M0Y0P");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "S130.0M0H0TD0M0Y0P" + "'", str1, "S130.0M0H0TD0M0Y0P");
    }

    @Test
    public void test03830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03830");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("  i!", "        0:00:00.032        ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03831");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("HI!  HI!  HI!  HI!  HI!  HI...", 95);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!  HI!  HI!  HI!  HI!  HI...                                                                 " + "'", str2, "HI!  HI!  HI!  HI!  HI!  HI...                                                                 ");
    }

    @Test
    public void test03832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03832");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("0:00:00.290", " HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.290" + "'", str2, "0:00:00.290");
    }

    @Test
    public void test03833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03833");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 282, (long) 31, "hi!   hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!       HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  hi!   hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!       HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  hi!", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03834");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("h!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih", "   HI!  HI!  HI!  HI!  HI!  HI", 20);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test03835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03835");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("", "                                                                                                                      'P'yyyy'Y'M'M'd'DT'H'", "P-1Y11M30DT23H59M59.110S");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test03836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03836");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("", 151, 24);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test03837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03837");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf(" HI!  HI..", "010.00:00:0", 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test03838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03838");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!", 128, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!" + "'", str3, "  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!");
    }

    @Test
    public void test03839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03839");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("I");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfAny("P-1Y11M30DT23H59M59.937S", strArray2);
        java.lang.Class<?> wildcardClass4 = strArray2.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test03840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03840");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "p0Y000DT00000.01010");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test03841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03841");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H", "h!ih!ih!ih!i  i!h!ih!ih!ih!i", "noce");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test03842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03842");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("                                                                                                                      'P'YYYY'Y'M'M'D'DT'H'H'M'M'S.S'S'44                                                                                                                                ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "'P'YYYY'Y'M'M'D'DT'H'H'M'M'S.S'S'44" + "'", str1, "'P'YYYY'Y'M'M'D'DT'H'H'M'M'S.S'S'44");
    }

    @Test
    public void test03843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03843");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("P0Y0M0DT0H0M0.003SP0Y0M0DT0H0M0.003SP0Y0M00");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "p0y0m0dt0h0m0.003sp0y0m0dt0h0m0.003sp0y0m00" + "'", str1, "p0y0m0dt0h0m0.003sp0y0m0dt0h0m0.003sp0y0m00");
    }

    @Test
    public void test03844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03844");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("hi!hi!hi! ", "  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  ");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test03845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03845");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable(charSequence0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test03846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03846");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("'m'm'D'dt'h'h'M'm'S.s's'hI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "'M'M'd'DT'H'H'm'M's.S'S'Hi!" + "'", str1, "'M'M'd'DT'H'H'm'M's.S'S'Hi!");
    }

    @Test
    public void test03847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03847");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("                                                                                                                                                                                                                                                                    'P'yyyy'Y'M'M'd'DT'H'0 seconds", "0:00:00.032                                                                                              HI!0:00:00.032                                                                                              HI!0:00:00.032");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "'P'yyyy'Y'M'M'd'DT'H'0 seconds" + "'", str2, "'P'yyyy'Y'M'M'd'DT'H'0 seconds");
    }

    @Test
    public void test03848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03848");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("P0Y000DT00000.09910", (int) (byte) 1, 110);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test03849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03849");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "P00-1Y11M30DT23H59M59.999S00000000000000000000000000000023i!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test03850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03850");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!  hi!  hi!  hi!  hi!  hi..", " HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test03851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03851");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("1", 289);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1" + "'", str2, "1");
    }

    @Test
    public void test03852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03852");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("230.00:00:0                                                                               ", "hi!                   S540.0M0H0TD0M0Y0Paaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!                    ", 281, 97);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "230.00:00:0                                                                               hi!                   S540.0M0H0TD0M0Y0Paaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!                    " + "'", str4, "230.00:00:0                                                                               hi!                   S540.0M0H0TD0M0Y0Paaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!                    ");
    }

    @Test
    public void test03853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03853");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("hi!4hi!444hi!4hi!4hi!444hi!4hi!4hi!4440i!hi!4hi!444hi!4hi!4hi!444hi!4hi!4hi!444", "P0Y0M0DT0H0M0.033S", "0 days 0 hours 0 minutes 0 seconds");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!4hi!444hi!4hi!4hi!444hi!4hi!4hi!4440i!hi!4hi!444hi!4hi!4hi!444hi!4hi!4hi!444" + "'", str3, "hi!4hi!444hi!4hi!4hi!444hi!4hi!4hi!4440i!hi!4hi!444hi!4hi!4hi!444hi!4hi!4hi!444");
    }

    @Test
    public void test03854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03854");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween(".s's", "0i0", "0i!4444444444444444444444444444444444444444444444aahi!444444444444444444444444444444444444444444444");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test03855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03855");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("HI!  HI!  HI!  HI!  HI!  HI...", " DAYS                                                                                               ", "  hi!hi!hi!#######################", 33);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HI!  HI!  HI!  HI!  HI!  HI..." + "'", str4, "HI!  HI!  HI!  HI!  HI!  HI...");
    }

    @Test
    public void test03856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03856");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("hi!4hi!444hi!40i!0i!0i!0i!0i!0i!0i!0i!0i!                                                                                             aahi!", "                                                                                                0");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test03857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03857");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("P0Y000DT00000.01010", 191, 128);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test03858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03858");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("P0Y0M0DT0H0M0.010S", "P0Y0M0DT0H0M0.003S");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03859");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("0i!0i!0i!0i!0i!0i!0i!0i!0i!                                                                                             aahi!", "743I!I!I! ", 961, 110);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0i!0i!0i!0i!0i!0i!0i!0i!0i!                                                                                   743I!I!I! " + "'", str4, "0i!0i!0i!0i!0i!0i!0i!0i!0i!                                                                                   743I!I!I! ");
    }

    @Test
    public void test03860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03860");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("0I!p0y000dt00000.099-1HI!p0", 33);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test03861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03861");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("I!I!I!", (int) (byte) 1, 47);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!I!I!" + "'", str3, "!I!I!");
    }

    @Test
    public void test03862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03862");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("Phh-1Y11M3hDT23H59M59M964S44                                                                                                                                ", "::.99::.99::.99::.99::.99::.99::.99::.99::.99::.99::.99::.99::.99::.99::.99::.99::.99::.99P00-1");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test03863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03863");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  ", (int) (short) 100, "D");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  " + "'", str3, "sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  ");
    }

    @Test
    public void test03864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03864");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("0320:00:00.0320:00:00.0320:00:00.0320:00:00.0320:00:00.0320:00:00.0320:00:00.032");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0320:00:00.0320:00:00.0320:00:00.0320:00:00.0320:00:00.0320:00:00.0320:00:00.032" + "'", str1, "0320:00:00.0320:00:00.0320:00:00.0320:00:00.0320:00:00.0320:00:00.0320:00:00.032");
    }

    @Test
    public void test03865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03865");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("000000000");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test03866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03866");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("P00-1Y11-130DT2374359-159.999359998900000000000000000000000000000023i!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I", "P0Y0M0D...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-1Y11-130DT2374359-159.999359998900000000000000000000000000000023i!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I" + "'", str2, "-1Y11-130DT2374359-159.999359998900000000000000000000000000000023i!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I");
    }

    @Test
    public void test03867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03867");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("", "P-1Y11M30DT23H59M59.110S", "0 SECONDS");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test03868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03868");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("I!I!I!", "0I!p0y000dt00000.099-1HI!p0y000dt00000.099-1p0y000dt00000.099-1p0y000dt00000.099-1HI!p0y000dt00000.099-1");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test03869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03869");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("0 D", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test03870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03870");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("230.00:00:0                                                                               ", "Aahi!'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03871");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("  hP00-1Y11030DT23059059.9994800000000000000000000000000000023i!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!hP00-1Y11030DT23059059.9994800000000000000000000000000000023i!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!P00-1Y11030DT23059059.9994800000000000000000000000000000023i!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!P00-1Y11030DT23059059.9994800000000000000000000000000000023i!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!hP00-1Y11030DT23059059.9994800000000000000000000000000000023i!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!i!", "HI!                                                                                       Hi!Hi!H...HI!                                                                                       Hi!Hi!H...HI!                                                                                       Hi!Hi!H...HI!                                                                                       Hi!Hi!H...HI!                                                                                       Hi!Hi!H...HI!                                                                                       Hi!Hi!H...HI!                                                                                       Hi!Hi!H...HI!                                                                                       Hi!Hi!H...HI!                                                                                       Hi!Hi!H...HI!", "010.00:00:0", 63);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "  hP00-1Y11030DT23059059.9994800000000000000000000000000000023i!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!hP00-1Y11030DT23059059.9994800000000000000000000000000000023i!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!P00-1Y11030DT23059059.9994800000000000000000000000000000023i!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!P00-1Y11030DT23059059.9994800000000000000000000000000000023i!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!hP00-1Y11030DT23059059.9994800000000000000000000000000000023i!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!i!" + "'", str4, "  hP00-1Y11030DT23059059.9994800000000000000000000000000000023i!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!hP00-1Y11030DT23059059.9994800000000000000000000000000000023i!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!P00-1Y11030DT23059059.9994800000000000000000000000000000023i!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!P00-1Y11030DT23059059.9994800000000000000000000000000000023i!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!hP00-1Y11030DT23059059.9994800000000000000000000000000000023i!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!i!");
    }

    @Test
    public void test03872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03872");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "h!ih!ih!ih!i  i!h!ih!ih!ih!i");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test03873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03873");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("SDNOCES 0", 0, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test03874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03874");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("0i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i0", "hi!");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "P0Y0M0DT0H0M0.002S");
        java.lang.String[] strArray6 = null;
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.replaceEach("", strArray3, strArray6);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test03875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03875");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("D");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "D" + "'", str1, "D");
    }

    @Test
    public void test03876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03876");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("0:00:00.290", ' ');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test03877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03877");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("sdnoces 0", 139, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaasdnoces 0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaasdnoces 0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test03878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03878");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 35, "              44 days              ", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "              44 0a00              " + "'", str3, "              44 0a00              ");
    }

    @Test
    public void test03879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03879");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("0:00:00.051", "SDNOCES 0", 11);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test03880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03880");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "D");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test03881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03881");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test03882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03882");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("T 00 ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "T 00" + "'", str1, "T 00");
    }

    @Test
    public void test03883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03883");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("####", 139, (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test03884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03884");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("0i!", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0i!" + "'", str2, "0i!");
    }

    @Test
    public void test03885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03885");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationWords((long) 3, true, false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0 seconds" + "'", str3, "0 seconds");
    }

    @Test
    public void test03886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03886");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfBlank((java.lang.CharSequence) "Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!H", (java.lang.CharSequence) "010.00:00:0");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!H" + "'", charSequence2, "Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!H");
    }

    @Test
    public void test03887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03887");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("#0 days 0 hours 0 minutes 0 seconds", 37);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " #0 days 0 hours 0 minutes 0 seconds " + "'", str2, " #0 days 0 hours 0 minutes 0 seconds ");
    }

    @Test
    public void test03888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03888");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("P0Y0M0DT0H0M0.045S", 900, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y0M0DT0H0M0.045S444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str3, "P0Y0M0DT0H0M0.045S444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test03889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03889");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim(" days");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "days" + "'", str1, "days");
    }

    @Test
    public void test03890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03890");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("0I!", (int) '#', 96);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test03891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03891");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("P0Y0M0DT0H0M0.051S", "                    ", 5);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test03892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03892");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("", "I");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test03893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03893");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y0M0DT0H0M0.045S", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", 18);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test03894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03894");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("4444444444444444444444444444444444444444444444aa.099-1hi!P0Y000DT00000.099-1.099-1hi!P0Y000DT00000.099-1.099-1hi!P0Y000DT00000.099-14444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4444444444444444444444444444444444444444444444aa.099-1hi!P0Y000DT00000.099-1.099-1hi!P0Y000DT00000.099-1.099-1hi!P0Y000DT00000.099-14444444444444444444444444444444444444444444444" + "'", str1, "4444444444444444444444444444444444444444444444aa.099-1hi!P0Y000DT00000.099-1.099-1hi!P0Y000DT00000.099-1.099-1hi!P0Y000DT00000.099-14444444444444444444444444444444444444444444444");
    }

    @Test
    public void test03895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03895");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("", 19, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaa" + "'", str3, "aaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test03896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03896");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 20, (long) 281, "", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03897");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                                                               hi! ", 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "H   hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!       HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!", 110, 135);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 110");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test03898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03898");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("hP0Y0M0DT0H0M0.010S");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hP0Y0M0DT0H0M0.010S" + "'", str1, "hP0Y0M0DT0H0M0.010S");
    }

    @Test
    public void test03899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03899");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("P0Y0M", "aaaaaaaaaaaaaa0i0aaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M" + "'", str2, "P0Y0M");
    }

    @Test
    public void test03900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03900");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("Y0M0DT0H0M", "  hi!  hi!  hi!  hi!  hi!  hi!  hi", 5, 15);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Y0M0D  hi!  hi!  hi!  hi!  hi!  hi!  hi" + "'", str4, "Y0M0D  hi!  hi!  hi!  hi!  hi!  hi!  hi");
    }

    @Test
    public void test03901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03901");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("'P'yyyy'Y'M'M'd'DT'H'0 seconds", "'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test03902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03902");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("AAAAAAAAAA", 8, (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "AAAAAAAAAA" + "'", str3, "AAAAAAAAAA");
    }

    @Test
    public void test03903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03903");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("  HI!  HI!  HI!  HI!  HI!  HI..", 282);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03904");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI!" + "'", str1, "HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI!");
    }

    @Test
    public void test03905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03905");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("hi!  hi!  hi!  hi!  hi!  hi..hi!", 28);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!  hi!  hi!  hi!  hi!  hi..hi!" + "'", str2, "hi!  hi!  hi!  hi!  hi!  hi..hi!");
    }

    @Test
    public void test03906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03906");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "0DAYS");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test03907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03907");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "hI!hI!h..");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 9 + "'", int1 == 9);
    }

    @Test
    public void test03908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03908");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("aahi!aaaaaaaaaaaaaaaaaaaaaaaaaaaa", "P", (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test03909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03909");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("                                                                                                                                44's's.s'm'm'h'h'td'd'm'm'y'yyyy'p'                                                                                                                               ", 97);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                               44's's.s'm'm'h'h'td'd'm'm'y'yyyy'p'                                                                                                                               " + "'", str2, "                               44's's.s'm'm'h'h'td'd'm'm'y'yyyy'p'                                                                                                                               ");
    }

    @Test
    public void test03910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03910");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("0Y0M0DT0H0M0.001S", 52, (int) 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test03911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03911");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("HI!                                                                                       Hi!Hi!H...HI!                                                                                       Hi!Hi!H...HI!                                                                                       Hi!Hi!H...HI!                                                                                       Hi!Hi!H...HI!                                                                                       Hi!Hi!H...HI!                                                                                       Hi!Hi!H...HI!                                                                                       Hi!Hi!H...HI!                                                                                       Hi!Hi!H...HI!                                                                                       Hi!Hi!H...HI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI! Hi!Hi!H...HI! Hi!Hi!H...HI! Hi!Hi!H...HI! Hi!Hi!H...HI! Hi!Hi!H...HI! Hi!Hi!H...HI! Hi!Hi!H...HI! Hi!Hi!H...HI! Hi!Hi!H...HI!" + "'", str1, "HI! Hi!Hi!H...HI! Hi!Hi!H...HI! Hi!Hi!H...HI! Hi!Hi!H...HI! Hi!Hi!H...HI! Hi!Hi!H...HI! Hi!Hi!H...HI! Hi!Hi!H...HI! Hi!Hi!H...HI!");
    }

    @Test
    public void test03912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03912");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("  hi!  hi!  hi!  hi!  hi!  hi!  hi", (int) '#', 5);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test03913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03913");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "                                   0I!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                   0I!" + "'", str1, "                                   0I!");
    }

    @Test
    public void test03914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03914");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("                                                                                                                                                                                                                                                                    'P'YYYY'Y'M'M'D'DT'H'0 SECONDS");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                                                                                                                                                                                                    'p'yyyy'y'm'm'd'dt'h'0 seconds" + "'", str1, "                                                                                                                                                                                                                                                                    'p'yyyy'y'm'm'd'dt'h'0 seconds");
    }

    @Test
    public void test03915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03915");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("0:00:00.0320:00:00.0320:00:00.0320:00:00.0320:00:00.0320:00:00.0320:00:00.0320:00:00.0320:00:00.0320:00:00.032", (int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test03916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03916");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "                                            0:00:00.032                                            ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test03917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03917");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "'p'YYYY'y'm'm'D'dt'h'");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test03918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03918");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("H", "aahi!aaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test03919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03919");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "HI!                                                                                       Hi!Hi!H...HI!                                                                                       Hi!Hi!H...HI!                                                                                       Hi!Hi!H...HI!                                                                                       Hi!Hi!H...HI!                                                                                       Hi!Hi!H...HI!                                                                                       Hi!Hi!H...HI!                                                                                       Hi!Hi!H...HI!                                                                                       Hi!Hi!H...HI!                                                                                       Hi!Hi!H...HI");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test03920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03920");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("P0Y0M0DT0H0M0.100S", "aaaaaaaaaaaap0Y0M0DT0H0M0.045S");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.100S" + "'", str2, "P0Y0M0DT0H0M0.100S");
    }

    @Test
    public void test03921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03921");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("p0y0m0dt0h0m0.000s", "############i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!HP0Y000DT00000.01010");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test03922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03922");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "0:00:00.051");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test03923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03923");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "...3H59M59.872S");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test03924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03924");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444aa.099-1hi!P0Y000DT00000.099-1.099-1hi!P0Y000DT00000.099-1.099-1hi!P0Y000DT00000.099-14444444444444444444444444444444444444444444444", "0:00:00.004");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test03925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03925");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444440320:00:00.0320:00:00.0320:00:00.0320:00:00.0320:00:00.0320:00:00.0320:00:00.032");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test03926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03926");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("S540.0M0H0TD0M0Y0Paaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 35);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "S540.0M0H0TD0M0Y0Paaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "S540.0M0H0TD0M0Y0Paaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test03927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03927");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("h!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'Hi!h!ih!ih!ih!ih!ih!ih!ih!ih!ih!i", 30, "P yyyy Y        T");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "h!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'Hi!h!ih!ih!ih!ih!ih!ih!ih!ih!ih!i" + "'", str3, "h!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'Hi!h!ih!ih!ih!ih!ih!ih!ih!ih!ih!i");
    }

    @Test
    public void test03928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03928");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test03929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03929");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase(" S0 S0 S0 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", " 0 D ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03930");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H", "0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I", 10);
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "D");
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray5);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H" + "'", str6, "!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H");
    }

    @Test
    public void test03931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03931");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("P0Y0M0DT0H0M0.071Shi!4hi!444hi!4P0Y0M0DT0H0M0.071Shi!4hi!444hi!4P0Y0M0DT0H0M0.071Shi!4hi!444hi!4P0Y0M0DT0H0M0.071Shi!4hi!444hi!4P0Y0M0DT0H0M0.071Shi!4hi!444hi!4P0Y0M0DT0H0M0.071Shi!4hi!444hi!4P0Y0M0DT0H0M0.071Shi!4hi!444hi!4P0Y0M0DT0H0M0.071Shi!4hi!444hi!4P0Y0M0DT0H0M0.071Shi!4hi!444hi!4P0Y0M0DT0H0M0.071S", "4444444444444444444444444444444444444444444444aa.099-1hi!P0Y000DT00000.099-1.099-1hi!P0Y000DT00000.099-1.099-1hi!P0Y000DT00000.099-14444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03932");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "0:0i!4444444444444444444444444444444444444444444444aahi!444444444444444444444444444444444444444444444", (java.lang.CharSequence) "I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test03933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03933");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 1, "S0 S0 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "010 0 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "010 0 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test03934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03934");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationWords((long) 52, true, false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0 seconds" + "'", str3, "0 seconds");
    }

    @Test
    public void test03935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03935");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("                                               DAYS                                               ", 110);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test03936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03936");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("HI!  HI!  HI!  HI!  HI!  HI...                                                                 ", "HP0Y000DT00000.01010", "aahi!'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'SocesHIsdnocessdnocesHIsdnocessdnocesHIsdnocessdnocesHIsdnocessdnocesHIsdnocessdnocesHIsdnocessdnocesHIsdnocessdnocesHIsdnocessdnocesHIsdnocessdnocesHIsdnocessdnocesHIsdnocessdnocesHIsdnocessdnocesHIsdnocessdnocesHIsdnocessdnocesHIsdnocessdnocesHIsdnocessdnocesHIsdnocessdnocesHIsdnocessdnocesHIsdnocessdnoces", 38);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HI!  HI!  HI!  HI!  HI!  HI...                                                                 " + "'", str4, "HI!  HI!  HI!  HI!  HI!  HI...                                                                 ");
    }

    @Test
    public void test03937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03937");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'44", "aahi!'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test03938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03938");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!s0s0s0HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!", 191);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!s0s0s0HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!" + "'", str2, "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!s0s0s0HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!");
    }

    @Test
    public void test03939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03939");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "H         aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "P0Y0M0DT0H0M0.097S");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03940");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!", "0:00:00.0320:00:00.0320:00:00.0320:00:00.0320:00:00.0320:00:00.0320:00:00.0320:00:00.0320:00:00.0320:00:00.032");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03941");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("Hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi...", 115);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi..." + "'", str2, "Hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi...");
    }

    @Test
    public void test03942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03942");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("####", 0, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "####" + "'", str3, "####");
    }

    @Test
    public void test03943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03943");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove(" P yyyy Y        T H H          ", '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " P yyyy Y        T H H          " + "'", str2, " P yyyy Y        T H H          ");
    }

    @Test
    public void test03944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03944");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H" + "'", str1, "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H");
    }

    @Test
    public void test03945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03945");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("       T H H         ", "P-1Y11M30DT23H59M59.972S");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "       T H H         " + "'", str2, "       T H H         ");
    }

    @Test
    public void test03946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03946");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test03947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03947");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "P0Y000DT00000.01010", (java.lang.CharSequence) "aaaa0:00:00.018");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 11 + "'", int2 == 11);
    }

    @Test
    public void test03948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03948");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (java.lang.CharSequence) "Hi!P0Y0M0DT0H0M0.099Shi!P0Y0M0DT0H0M0.099SP0Y0M0DT0H0M0.099SP0Y0M0DT0H0M0.099Shi!P0Y0M0DT0H0M0.099S");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 134 + "'", int2 == 134);
    }

    @Test
    public void test03949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03949");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("743I!I!I! ", "Aahi!'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S", 96);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.split(" P yyyy Y        T H H          ", "0:00:00.000", 5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = org.apache.commons.lang3.StringUtils.replaceEach(" HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  ", strArray4, strArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 4 vs 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test03950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03950");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "0i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i0");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test03951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03951");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("hi!", "");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray2);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "P0Y0M");
        int int6 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test03952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03952");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp(" !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih", "aahi!P0000Y0M0DT0H0M0.99S");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih" + "'", str2, " !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih");
    }

    @Test
    public void test03953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03953");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("0i!0i!0i!0i!0i!0i!0i!0i!0i!                                                                                             aahi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0i!0i!0i!0i!0i!0i!0i!0i!0i! aahi!" + "'", str1, "0i!0i!0i!0i!0i!0i!0i!0i!0i! aahi!");
    }

    @Test
    public void test03954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03954");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "0 SECONDS");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test03955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03955");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y0M0DT0H0M0.045S", 282, 191);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test03956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03956");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("hP00-1Y11030DT23059059.9994800000000000000000000000000000023i!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!hP00-1Y11030DT23059059.9994800000000000000000000000000000023i!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!P00-1Y11030DT23059059.9994800000000000000000000000000000023i!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!P00-1Y11030DT23059059.9994800000000000000000000000000000023i!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!hP00-1Y11030DT23059059.9994800000000000000000000000000000023i!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!", "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 608 + "'", int2 == 608);
    }

    @Test
    public void test03957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03957");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("I  I  I  I  I  I", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03958");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase(" AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03959");
        java.lang.CharSequence charSequence1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S", charSequence1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Strings must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03960");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "010.00:00:0");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "010.00:00:0" + "'", str1, "010.00:00:0");
    }

    @Test
    public void test03961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03961");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterType("28010.00000TD000Y0Ph");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.concatWith("'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'Hi!", (java.lang.Object[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "28010'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'Hi!.'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'Hi!00000'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'Hi!TD'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'Hi!000'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'Hi!Y'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'Hi!0'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'Hi!P'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'Hi!h" + "'", str3, "28010'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'Hi!.'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'Hi!00000'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'Hi!TD'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'Hi!000'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'Hi!Y'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'Hi!0'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'Hi!P'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'Hi!h");
    }

    @Test
    public void test03962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03962");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.045");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test03963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03963");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("D", "P00-");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test03964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03964");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HIhi!", 115);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03965");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("hi!", "0:00:00.032", 0);
        int int4 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray3);
        java.lang.Class<?> wildcardClass5 = strArray3.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test03966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03966");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  -10 0 0 hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi! 4", (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test03967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03967");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) " DAYS");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test03968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03968");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("4444444444", 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444444" + "'", str2, "4444444444");
    }

    @Test
    public void test03969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03969");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("", "hi!", (int) (short) 1);
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray4);
        int int6 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h", strArray5);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test03970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03970");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "'P'yyyy'Y'M'M'd'DT'H'", (java.lang.CharSequence) "                                                                                                                      'P'yyyy'Y'M'M'd'DT'H'");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03971");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("hi!P0Y0M0DT0H0M0.099Shi!P0Y0M0DT0H0M0.099SP0Y0M0DT0H0M0.099SP0Y0M0DT0H0M0.099Shi!P0Y0M0DT0H0M0.099S");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test03972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03972");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("P0Y0M0DT0H0M0.100S", (-1), 28);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test03973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03973");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'44", 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum abbreviation width is 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03974");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("000000000");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "000000000" + "'", str1, "000000000");
    }

    @Test
    public void test03975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03975");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens(" P yyyy Y        T H H         ", "Y0M0DT0H0");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test03976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03976");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("0Y0M0DT0H0M0.001S", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03977");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterType("hHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, " P yyyy Y        T H H          ");
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.split("P0Y0M0DT0H0M0.002S", "0 D0 D0 D0 hi!P0Y0M0DT0H0M0.099Shi!P0Y0M0DT0H0M0.099SP0Y0M0DT0H0M0.099SP0Y0M0DT0H0M0.099Shi!P0Y0M0DT0H0M0.099SM'M'd'DT'H'H'm'M's.S'S'44");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("##", strArray4, strArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 68 vs 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void test03978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03978");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("P0Y0M0DT0H0M0.100S", (int) '#', ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "        P0Y0M0DT0H0M0.100S         " + "'", str3, "        P0Y0M0DT0H0M0.100S         ");
    }

    @Test
    public void test03979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03979");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("H!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH", "                                                                                       Hi!", 24);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test03980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03980");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("", 289, 2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test03981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03981");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("0:00:00.032");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, '#');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:00:00.032" + "'", str3, "0:00:00.032");
    }

    @Test
    public void test03982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03982");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("0i!4444444444444444444444444444444444444444444444aahi!4444444444444444444444444444444444444444444444", "hi!P0Y000DT00000.099495hi!P0Y000DT00000.099495P0Y000DT00000.099495P0Y000DT00000.099495hi!P0Y000DT00000.099495");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0i!4444444444444444444444444444444444444444444444aahi!4444444444444444444444444444444444444444444444" + "'", str2, "0i!4444444444444444444444444444444444444444444444aahi!4444444444444444444444444444444444444444444444");
    }

    @Test
    public void test03983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03983");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("                                                                                       Hi!", 96, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "444                                                                                       Hi!444" + "'", str3, "444                                                                                       Hi!444");
    }

    @Test
    public void test03984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03984");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) '4', (long) 27, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test03985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03985");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("P00-1Y11-130DT2374359-159.999359998900000000000000000000000000000023i!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I", "P0Y0M0DT0H0M0.099S");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03986");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("0i0");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test03987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03987");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "P0Y0M0DT0H0M0.009S");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test03988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03988");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("Phh-1Y11M3hDT23H59M59M964S44                                                                                                                                ", "0 seconds", 35);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, "  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  ", 961, 0);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.endsWithAny("'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test03989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03989");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi! hi! hi! hi!hhhhi! hi! hi! hi!", "HI!                                                                                       Hi!Hi!H...HI!                                                                                       Hi!Hi!H...HI!                                                                                       Hi!Hi!H...HI!                                                                                       Hi!Hi!H...HI!                                                                                       Hi!Hi!H...HI!                                                                                       Hi!Hi!H...HI!                                                                                       Hi!Hi!H...HI!                                                                                       Hi!Hi!H...HI!                                                                                       Hi!Hi!H...HI!", " S0 S0 S0 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi! hi! hi! hi!hhhhi! hi! hi! hi!" + "'", str3, "Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi! hi! hi! hi!hhhhi! hi! hi! hi!");
    }

    @Test
    public void test03990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03990");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("M30DT23H59M59.872S", (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "M59.872S" + "'", str2, "M59.872S");
    }

    @Test
    public void test03991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03991");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("hi!        hi!                        hi!        ", 1, 495);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!        hi!                        hi!        " + "'", str3, "hi!        hi!                        hi!        ");
    }

    @Test
    public void test03992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03992");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("0 DAYS", "Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!H");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test03993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03993");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H", "hi!4444444sdnoces  4444444444444444a4444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03994");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("HP-1Y11M30DT23H59M59.972SHh", "H         H         H         H         H         H         H         H         H         H         H aahi!'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HP-1Y11M30DT23H59M59.972SHh" + "'", str2, "HP-1Y11M30DT23H59M59.972SHh");
    }

    @Test
    public void test03995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03995");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("                                            I:II:IIII32                                            ", (int) (short) -1, 30);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test03996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03996");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "P00-");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test03997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03997");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("8010.00000TD000Y0Ph");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "8010.00000TD000Y0Ph" + "'", str1, "8010.00000TD000Y0Ph");
    }

    @Test
    public void test03998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03998");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("                                                                                              HI!", "hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03999");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HP0Y0M0DT0H0M0.097S", (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HP0Y0M0DT0H0M0.097S" + "'", str2, "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HP0Y0M0DT0H0M0.097S");
    }

    @Test
    public void test04000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test04000");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("P0Y0M0DT0H0M0.003SP0Y0M0DT0H0M0.003SP0Y0M00", "hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459", 90);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y0M0DT0H0M0.003SP0Y0M0DT0H0M0.003SP0Y0M00" + "'", str3, "P0Y0M0DT0H0M0.003SP0Y0M0DT0H0M0.003SP0Y0M00");
    }
}

