import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest50 {

    public static boolean debug = false;

    @Test
    public void test25001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25001");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("", "", "AnihC");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test25002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25002");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("!ih!ih!ih!ih!ih!ih!ih!ih!ih!ihtedesco    !ih!ih!ih!ih!ih!ih!iJapanese");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!ih!ih!ih!ih!ih!ih!ih!ih!ih!ihtedesco    !ih!ih!ih!ih!ih!ih!iJapanese" + "'", str1, "!ih!ih!ih!ih!ih!ih!ih!ih!ih!ihtedesco    !ih!ih!ih!ih!ih!ih!iJapanese");
    }

    @Test
    public void test25003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25003");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "u Italia u                                                                          ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test25004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25004");
        java.util.Locale locale1 = new java.util.Locale("French (France)");
        java.lang.String str2 = locale1.getISO3Country();
        java.util.Set<java.lang.Character> charSet3 = locale1.getExtensionKeys();
        org.junit.Assert.assertEquals(locale1.toString(), "french (france)");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(charSet3);
    }

    @Test
    public void test25005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25005");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("                                                 ", "FRAADzAEzAFzAGzAIzALzAMzANzAOzAQzARzAzAx");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test25006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25006");
        java.util.Locale locale0 = java.util.Locale.PRC;
        java.lang.String str1 = locale0.getDisplayName();
        java.util.Set<java.lang.Character> charSet2 = locale0.getExtensionKeys();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Chinese (China)" + "'", str1, "Chinese (China)");
        org.junit.Assert.assertNotNull(charSet2);
    }

    @Test
    public void test25007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25007");
        char[] charArray9 = new char[] { ' ', '4' };
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "HI!", charArray9);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!", charArray9);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "h", charArray9);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "h", charArray9);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "iTALIAN", charArray9);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "Canada", charArray9);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsAny("ADAAEAAFAAGAAIAALAAMAANAAOAAQAARAAS", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[ , 4]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test25008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25008");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("Franz\366sisch (Frankreich)", 65);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test25009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25009");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("Italy", 44);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                   Italy                    " + "'", str2, "                   Italy                    ");
    }

    @Test
    public void test25010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25010");
        char[] charArray1 = null;
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "iTALIANiTALIANiTALIANiTALIANiTALIANiTALIANiTALIANiTALIANiTALIANiTALIANiTALIANiTALIANiTALIANiTALIANiTALIANiTALIANiTALIANiTALIANiTALIANiTALIANiTALIANiTALIANiTALIANiTALIANiTALIANiTALIANiTALIANiTALIANiTALIANiTALIANiTALIANiTALIAN", charArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test25011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25011");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("iTALIAN (ITALIAN,NGLIH", (int) '9');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "iTALIAN (ITALIAN,NGLIH                                   " + "'", str2, "iTALIAN (ITALIAN,NGLIH                                   ");
    }

    @Test
    public void test25012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25012");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("\\u0035", "E             gallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemand", 63);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\u0035" + "'", str3, "\\u0035");
    }

    @Test
    public void test25013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25013");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("s (Canada)", "2ITHI!_\\U0020_ITALIENISCH####################################################################2I");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test25014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25014");
        java.util.Locale.Category category1 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale2 = java.util.Locale.getDefault(category1);
        java.util.Locale locale3 = java.util.Locale.GERMAN;
        java.util.Locale locale4 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str5 = locale3.getDisplayName(locale4);
        java.util.Locale.setDefault(category1, locale4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.lowerCase("                                                                                                    ", locale4);
        java.lang.String str8 = locale4.toLanguageTag();
        java.lang.String str9 = locale4.getDisplayCountry();
        org.junit.Assert.assertTrue("'" + category1 + "' != '" + java.util.Locale.Category.FORMAT + "'", category1.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale2);
// flaky:         org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "de");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "allemand" + "'", str5, "allemand");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "                                                                                                    " + "'", str7, "                                                                                                    ");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "fr-CA" + "'", str8, "fr-CA");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Canada" + "'", str9, "Canada");
    }

    @Test
    public void test25015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25015");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("tanochnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn", "                                             DEUTSCH                                             ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "tanochnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn" + "'", str2, "tanochnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn");
    }

    @Test
    public void test25016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25016");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxNCHI");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test25017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25017");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("KKKKKKKKKKKKKKKKKEAGAASH", "ITALIAN_italian_eNGLISH");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test25018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25018");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("u00\\u0034\\u00                                             hcstud                                             \\u0034");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "u00\\u0034\\u00                                             hcstud                                             \\u0034" + "'", str1, "u00\\u0034\\u00                                             hcstud                                             \\u0034");
    }

    @Test
    public void test25019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25019");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.setLanguageTag("Italian");
        java.util.Locale locale4 = java.util.Locale.PRC;
        java.lang.String str5 = locale4.getDisplayName();
        java.util.Locale.Builder builder6 = builder0.setLocale(locale4);
        java.util.Locale.Builder builder7 = builder6.clear();
        java.util.Locale locale8 = java.util.Locale.KOREAN;
        java.util.Locale.Builder builder9 = builder7.setLocale(locale8);
        java.util.Locale.Builder builder10 = builder7.clearExtensions();
        java.util.Locale.Builder builder11 = builder7.clearExtensions();
        java.util.Locale.Builder builder12 = builder7.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder14 = builder7.removeUnicodeLocaleAttribute("  ");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute:    [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Chinese (China)" + "'", str5, "Chinese (China)");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "ko");
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test25020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25020");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("", "Cor\351e du Sud", (int) (short) -1);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test25021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25021");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("BBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz\\u005", "deutschdeutschdeutschdeutschdeutschdeutschdeutschdeutschdeutschdeu\\u0061");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "BBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz\\u005" + "'", str2, "BBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz\\u005");
    }

    @Test
    public void test25022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25022");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("                                            fRENCH (fRANCE)                                                \\u0068", "", 51);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 51 + "'", int3 == 51);
    }

    @Test
    public void test25023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25023");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("\uc774\ud0c8\ub9ac\uc544\uc5b4");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\uc774\ud0c8\ub9ac\uc544\uc5b4" + "'", str1, "\uc774\ud0c8\ub9ac\uc544\uc5b4");
    }

    @Test
    public void test25024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25024");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("                                                                                                                                                                                                                                                                                   \\u0034\\u0034\\u0034\\u0034\\u0034\\u0034\\u0034\\u0034\\u0034\\hi!       \\u0034\\u0034\\u0034\\u0034\\u0034\\u0034\\u0034\\u0034\\u0034\\", "\u4e2d\u6587");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test25025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25025");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("ITALIAEhcstuedITALIAEhcstuedITALIAEhcstuedITALIAEhcstuedITALIAEhcstuedITALIAEhcstuedITALIAEhcstuedITALIAEhcstuedITALIAEhcstuedITALIAEhcstuedITALIAE", "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rfra");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ITALIAEhcstuedITALIAEhcstuedITALIAEhcstuedITALIAEhcstuedITALIAEhcstuedITALIAEhcstuedITALIAEhcstuedITALIAEhcstuedITALIAEhcstuedITALIAEhcstuedITALIAE" + "'", str2, "ITALIAEhcstuedITALIAEhcstuedITALIAEhcstuedITALIAEhcstuedITALIAEhcstuedITALIAEhcstuedITALIAEhcstuedITALIAEhcstuedITALIAEhcstuedITALIAEhcstuedITALIAE");
    }

    @Test
    public void test25026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25026");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("h");
        java.lang.String str2 = languageRange1.getRange();
        java.lang.String str3 = languageRange1.getRange();
        double double4 = languageRange1.getWeight();
        java.util.Locale.Builder builder6 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder7 = builder6.clearExtensions();
        java.util.Locale locale8 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str9 = locale8.getDisplayName();
        java.util.Locale.Builder builder10 = builder7.setLocale(locale8);
        java.util.Locale.Builder builder11 = builder10.clear();
        java.util.Locale.Builder builder13 = builder11.setLanguage("ITALIAN");
        java.util.Locale locale14 = builder11.build();
        java.util.Locale.Builder builder15 = builder11.clearExtensions();
        java.util.Locale locale16 = java.util.Locale.ROOT;
        java.lang.String str17 = locale16.getISO3Country();
        java.util.Set<java.lang.String> strSet18 = locale16.getUnicodeLocaleKeys();
        java.util.Locale.Builder builder19 = builder15.setLocale(locale16);
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.lowerCase("44444444444444ITALIAN44444444444444", locale16);
        boolean boolean21 = languageRange1.equals((java.lang.Object) locale16);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "h" + "'", str2, "h");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "h" + "'", str3, "h");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "French (Canada)" + "'", str9, "French (Canada)");
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "italian");
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(strSet18);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "44444444444444italian44444444444444" + "'", str20, "44444444444444italian44444444444444");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test25027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25027");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("Azhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais cinese (cina)\\u0069h..France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)A");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=azhzhzhzhzhzhzhfrancais(france)azhzhzhzhzhzhzhzhzhzhfrancais(france)azhzhzhzhzhzhzhzhzhzhfrancaiscinese(cina)\\u0069h..france)azhzhzhzhzhzhzhzhzhzhfrancais(france)azhzhzhzhzhzhzhzhzhzhfrancais(france)azhzhzhzhzhzhzhzhzhzhfrancais(france)azhzhzhzhzhzhzhzhzhzhfrancais(france)azhzhzhzhzhzhzhzhzhzhfrancais(france)azhzhzhzhzhzhzhzhzhzhfrancais(france)azhzhzhzhzhzhzhzhzhzhfrancais(france)azhzhzhzhzhzhzhzhzhzhfrancais(france)azhzhzhzhzhzhzhzhzhzhfrancais(france)azhzhzhzhzhzhzhzhzhzhfrancais(france)azhzhzhzhzhzhzhzhzhzhfrancais(france)azhzhzhzhzhzhzhzhzhzhfrancais(france)azhzhzhzhzhzhzhzhzhzhfrancais(france)azhzhzhzhzhzhzhzhzhzhfrancais(france)azhzhzhzhzhzhzhzhzhzhfrancais(france)azhzhzhzhzhzhzhzhzhzhfrancais(france)azhzhzhzhzhzhzhzhzhzhfrancais(france)azhzhzhzhzhzhzhzhzhzhfrancais(france)a");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test25028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25028");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("                                                      !ih dalleman                                                       ", "FRANZ\326SISCH\n(FRANKREICH)");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                      !ih dalleman                                                       " + "'", str2, "                                                      !ih dalleman                                                       ");
    }

    @Test
    public void test25029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25029");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("8ian\\u0020i86 (ITALIAN (ITALIAN,ENGLISH))", "ttttttttttttttttttttt                                                                                                              ITALIEITALtttttttttttttttttttttt", "######################################ELTi_0200u\\_!#####################################ELTi_0200u\\_!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "8ian\\u0020i86 (ITALIAN (ITALIAN,ENGLISH))" + "'", str3, "8ian\\u0020i86 (ITALIAN (ITALIAN,ENGLISH))");
    }

    @Test
    public void test25030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25030");
        java.util.Locale.Category category0 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale1 = java.util.Locale.getDefault(category0);
        java.lang.String str2 = locale1.toLanguageTag();
        java.util.Locale locale3 = java.util.Locale.CHINESE;
        java.lang.String str4 = locale3.getCountry();
        java.lang.String str5 = locale3.getLanguage();
        java.lang.String str6 = locale1.getDisplayVariant(locale3);
        java.lang.String str7 = locale1.getScript();
        java.util.Locale locale8 = locale1.stripExtensions();
        java.lang.Object obj9 = locale8.clone();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale1);
// flaky:         org.junit.Assert.assertEquals(locale1.toString(), "");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "und" + "'", str2, "und");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "zh" + "'", str5, "zh");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(locale8);
// flaky:         org.junit.Assert.assertEquals(locale8.toString(), "");
        org.junit.Assert.assertNotNull(obj9);
// flaky:         org.junit.Assert.assertEquals(obj9.toString(), "");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj9), "");
// flaky:         org.junit.Assert.assertEquals(java.util.Objects.toString(obj9), "");
    }

    @Test
    public void test25031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25031");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale locale2 = java.util.Locale.FRENCH;
        java.util.Locale locale3 = java.util.Locale.ENGLISH;
        java.lang.String str4 = locale3.getDisplayCountry();
        java.lang.String str5 = locale2.getDisplayVariant(locale3);
        java.lang.String str6 = locale2.getDisplayCountry();
        java.lang.String str7 = locale2.getScript();
        java.lang.String str8 = locale2.getScript();
        java.util.Locale locale9 = java.util.Locale.FRENCH;
        java.util.Locale locale10 = java.util.Locale.ENGLISH;
        java.lang.String str11 = locale10.getDisplayCountry();
        java.lang.String str12 = locale9.getDisplayVariant(locale10);
        java.lang.String str13 = locale9.getDisplayCountry();
        java.lang.String str14 = locale9.getScript();
        java.lang.String str15 = locale9.getScript();
        java.lang.String str16 = locale2.getDisplayCountry(locale9);
        java.lang.String str17 = locale1.getDisplayVariant(locale9);
        java.util.Locale locale19 = java.util.Locale.ENGLISH;
        java.lang.String str20 = locale19.getDisplayLanguage();
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.upperCase("!IH", locale19);
        java.lang.String str22 = locale19.getCountry();
        java.lang.String str23 = locale19.getCountry();
        java.lang.String str24 = locale9.getDisplayCountry(locale19);
        java.util.Locale locale28 = new java.util.Locale("HI!       ", "\\U0020", "Italienisch#########################################################################################");
        java.util.Locale locale29 = locale28.stripExtensions();
        java.lang.String str30 = locale19.getDisplayCountry(locale29);
        java.util.Locale locale33 = new java.util.Locale("                                     fran\347ais (France)                                      ", "Chinese (China");
        java.lang.String str34 = locale19.getDisplayScript(locale33);
        java.util.Locale locale38 = new java.util.Locale("", "");
        java.util.Locale locale39 = java.util.Locale.FRENCH;
        java.util.Locale locale40 = java.util.Locale.ENGLISH;
        java.lang.String str41 = locale40.getDisplayCountry();
        java.lang.String str42 = locale39.getDisplayVariant(locale40);
        java.lang.String str43 = locale39.getDisplayCountry();
        java.lang.String str44 = locale39.getScript();
        java.lang.String str45 = locale39.getScript();
        java.lang.String str46 = locale38.getDisplayCountry(locale39);
        java.lang.String str47 = org.apache.commons.lang3.StringUtils.upperCase("hzhzhzhzhzhzhzhzhzhzAhzSAhzRAhzQAhzOAhzNAh", locale39);
        java.lang.String str48 = locale33.getDisplayLanguage(locale39);
        java.lang.String str49 = locale39.getDisplayCountry();
        java.lang.String str50 = locale39.getDisplayName();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fr");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "fr");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "en");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "English" + "'", str20, "English");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "!IH" + "'", str21, "!IH");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals(locale28.toString(), "hi!       _\\U0020_Italienisch#########################################################################################");
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "hi!       _\\U0020_Italienisch#########################################################################################");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals(locale33.toString(), "                                     fran\347ais (france)                                      _CHINESE (CHINA");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals(locale38.toString(), "");
        org.junit.Assert.assertNotNull(locale39);
        org.junit.Assert.assertEquals(locale39.toString(), "fr");
        org.junit.Assert.assertNotNull(locale40);
        org.junit.Assert.assertEquals(locale40.toString(), "en");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "HZHZHZHZHZHZHZHZHZHZAHZSAHZRAHZQAHZOAHZNAH" + "'", str47, "HZHZHZHZHZHZHZHZHZHZAHZSAHZRAHZQAHZOAHZNAH");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "                                     fran\347ais (france)                                      " + "'", str48, "                                     fran\347ais (france)                                      ");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "French" + "'", str50, "French");
    }

    @Test
    public void test25032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25032");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("HI!tttttttHI!tttttttHI!tttttttHI!tttttttHI!tttttttHI!tttttttHI!tttttttHI!tttttttHI!tttttttHI!tttttttHI!tttttttHI!tttttttHI!tttttttHI!tttttttHI!tttttttHI!", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test25033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25033");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("...N4AO4AQ4AR4AS4AT4A...", "          2cinese (cina)italianitalianitalianital", 88);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test25034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25034");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "YYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYY", (java.lang.CharSequence) "neilRtI    E");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test25035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25035");
        java.util.Locale locale0 = java.util.Locale.ITALIAN;
        java.lang.String str1 = locale0.getDisplayLanguage();
        java.util.Locale locale2 = locale0.stripExtensions();
        java.lang.String str3 = locale0.getLanguage();
        java.util.Set<java.lang.String> strSet4 = locale0.getUnicodeLocaleKeys();
        java.util.Locale locale6 = java.util.Locale.FRANCE;
        java.util.Locale locale7 = java.util.Locale.ITALIAN;
        java.lang.String str9 = locale7.getExtension('h');
        java.lang.String str10 = locale6.getDisplayScript(locale7);
        java.util.Locale locale14 = new java.util.Locale("HI!       ", "\\U0020", "Italienisch#########################################################################################");
        java.lang.String str15 = locale6.getDisplayCountry(locale14);
        java.lang.String str16 = locale14.getDisplayName();
        java.lang.String str18 = locale14.getExtension('i');
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.upperCase("iTALIAN                                                                 ", locale14);
        java.lang.String str20 = locale0.getDisplayVariant(locale14);
        java.util.Set<java.lang.Character> charSet21 = locale0.getExtensionKeys();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Italian" + "'", str1, "Italian");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "it");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "it" + "'", str3, "it");
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "it");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals(locale14.toString(), "hi!       _\\U0020_Italienisch#########################################################################################");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "France" + "'", str15, "France");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!        (\\U0020,Italienisch#########################################################################################)" + "'", str16, "hi!        (\\U0020,Italienisch#########################################################################################)");
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "ITALIAN                                                                 " + "'", str19, "ITALIAN                                                                 ");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(charSet21);
    }

    @Test
    public void test25036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25036");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.util.Locale locale1 = java.util.Locale.ITALIAN;
        java.lang.String str3 = locale1.getExtension('h');
        java.lang.String str4 = locale0.getDisplayScript(locale1);
        java.lang.String str5 = locale0.getDisplayScript();
        java.lang.String str6 = locale0.getISO3Language();
        java.lang.String str7 = locale0.toLanguageTag();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "it");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "fra" + "'", str6, "fra");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "fr-FR" + "'", str7, "fr-FR");
    }

    @Test
    public void test25037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25037");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\U0020ITALIANITALIANITALIANITALI\\U0020ITALIANITALIANITALIANITAL\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test25038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25038");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhfr-ca", "hcsineilati");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test25039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25039");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "und-CA");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test25040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25040");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("FRENCH                     ", "ZH_cn");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "FRENCH                     " + "'", str2, "FRENCH                     ");
    }

    @Test
    public void test25041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25041");
        char char1 = org.apache.commons.lang3.CharUtils.toChar("h (CCCCCCCCC,CV CW CX CY CZ DE DJ DK DM DO DZ EC EE EG EC ER ES EC FC FJ FK)");
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + 'h' + "'", char1 == 'h');
    }

    @Test
    public void test25042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25042");
        java.util.Locale locale0 = java.util.Locale.ITALY;
        java.lang.String str1 = locale0.getDisplayLanguage();
        java.util.Locale locale2 = java.util.Locale.getDefault();
        java.lang.String str3 = locale2.getLanguage();
        java.lang.String str4 = locale2.getScript();
        java.lang.String str5 = locale2.getISO3Country();
        java.lang.String str6 = locale2.getCountry();
        java.lang.String str7 = locale2.getCountry();
        java.lang.String str8 = locale0.getDisplayScript(locale2);
        java.util.Set<java.lang.String> strSet9 = locale0.getUnicodeLocaleKeys();
        java.lang.String str10 = locale0.getDisplayName();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Italian" + "'", str1, "Italian");
        org.junit.Assert.assertNotNull(locale2);
// flaky:         org.junit.Assert.assertEquals(locale2.toString(), "");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Italian (Italy)" + "'", str10, "Italian (Italy)");
    }

    @Test
    public void test25043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25043");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("!       2ITALIANITALIANITALIANITALItalienisch2ITALIANITALIANITALIANITALitalian_ITALIAN_English2ITALIANITALIANITALIANITALHI!2ITALIANITALIANITALIANITALhi!2ITALIANITALIANITALIANITALADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDED...2ITALIANITALIANITALIANITAL\\u00342ITALIANITALIANITALIANITALHI!2ITALIANITALIANITALIANITALItalian2ITALIANITALIANITALIANITAL\\u00612ITALIANITALIANITALIANITAL\\u00232ITALIANITALIANITALIANITALhi!2ITALIANITALIANITALIANITALiTALIAN2ITALIANITALIANITALIANITALChinese (China)2ITALIANITALIANITALIANITALhi!2ITALIANITALIANITALIANITALzh_CN2ITALIANITALIANITALIANITALiTALIAN2ITALIANITALIANITALIANITALen2ITALIANITALIANITALIANITALItalienisch");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
    }

    @Test
    public void test25044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25044");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("NA");
        java.lang.String str2 = locale1.getVariant();
        java.util.Locale locale4 = new java.util.Locale("");
        java.util.Locale.setDefault(locale4);
        java.util.Set<java.lang.Character> charSet6 = locale4.getExtensionKeys();
        java.util.Locale locale8 = new java.util.Locale("TA...");
        java.lang.String str9 = locale4.getDisplayCountry(locale8);
        java.lang.String str10 = locale8.getDisplayScript();
        java.lang.String str11 = locale8.getVariant();
        java.lang.String str12 = locale1.getDisplayName(locale8);
        java.util.Locale.setDefault(locale1);
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "na");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNotNull(charSet6);
        org.junit.Assert.assertEquals(locale8.toString(), "ta...");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Nauru" + "'", str12, "Nauru");
    }

    @Test
    public void test25045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25045");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("\u610f\u5927\u5229\u6587", (int) ')', "ITALIAN4");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u610f\u5927\u5229\u6587" + "'", str3, "\u610f\u5927\u5229\u6587");
    }

    @Test
    public void test25046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25046");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("               Deutschland");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Deutschland" + "'", str1, "Deutschland");
    }

    @Test
    public void test25047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25047");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "\u6cd5", (java.lang.CharSequence) "ENGLISCH");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test25048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25048");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate(" hi!       _\\U0020_Italienisch####################################################################            ", 4);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " ..." + "'", str2, " ...");
    }

    @Test
    public void test25049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25049");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "!IH!IH\\\\\\\\\\\\\\");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 13 + "'", int1 == 13);
    }

    @Test
    public void test25050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25050");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("", "Deutsch");
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.stripAll(strArray6, "franz\366sisch (frankreich)");
        boolean boolean9 = org.apache.commons.lang3.StringUtils.startsWithAny("ENGLISCH", strArray8);
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAny("itTAiT_ITA", strArray8);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.concatWith("franz\366sisch (frankreich)", (java.lang.Object[]) strArray8);
        int int12 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("eAGAASH                                                                                                                                                                                                                                                                                                                                                                                                    ", strArray8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray8, "hi!(\\U0020,Italienisch############################################hi!       ", 24, 220);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test25051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25051");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("ENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENG", "...       g                     ...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test25052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25052");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("zhazhzhzhzhzhzhzhzhzhzh", "IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIITALIAN_italian_eNGLISHIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test25053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25053");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("Chinese (China)hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh", "  \\U005    (...U0069\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069!IH\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069\\ENGLISCH)");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test25054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25054");
        java.util.Locale locale0 = java.util.Locale.ENGLISH;
        java.util.Locale locale4 = new java.util.Locale("Italian", "Italian", "English");
        java.util.Locale locale6 = java.util.Locale.FRANCE;
        java.util.Locale locale7 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str8 = locale6.getDisplayScript(locale7);
        java.lang.String str9 = locale7.getVariant();
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.lowerCase("\\u0034", locale7);
        java.lang.String str11 = locale7.getCountry();
        java.lang.String str12 = locale4.getDisplayLanguage(locale7);
        java.lang.String str13 = locale0.getDisplayScript(locale4);
        boolean boolean15 = locale0.equals((java.lang.Object) "\\U0064f (KOREAN)");
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en");
        org.junit.Assert.assertEquals(locale4.toString(), "italian_ITALIAN_English");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\\u0034" + "'", str10, "\\u0034");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "CA" + "'", str11, "CA");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "italian" + "'", str12, "italian");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test25055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25055");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("R0                                               nailati                                                ", 84);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test25056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25056");
        java.util.Locale locale2 = new java.util.Locale("8ian\\u0020i86", "italian (italian,english)");
        java.lang.String str3 = locale2.getCountry();
        java.util.Locale.Builder builder5 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder6 = builder5.clearExtensions();
        java.util.Locale locale7 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str8 = locale7.getDisplayName();
        java.util.Locale.Builder builder9 = builder6.setLocale(locale7);
        java.util.Locale.Builder builder10 = builder9.clear();
        java.util.Locale.Builder builder12 = builder10.setLanguage("ITALIAN");
        java.util.Locale locale13 = builder10.build();
        java.util.Locale.Builder builder14 = builder10.clearExtensions();
        java.util.Locale locale15 = java.util.Locale.ROOT;
        java.lang.String str16 = locale15.getISO3Country();
        java.util.Set<java.lang.String> strSet17 = locale15.getUnicodeLocaleKeys();
        java.util.Locale.Builder builder18 = builder14.setLocale(locale15);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.lowerCase("44444444444444ITALIAN44444444444444", locale15);
        java.lang.String str20 = locale15.getDisplayCountry();
        java.lang.String str21 = locale2.getDisplayName(locale15);
        java.lang.String str22 = locale15.getScript();
        org.junit.Assert.assertEquals(locale2.toString(), "8ian\\u0020i86_ITALIAN (ITALIAN,ENGLISH)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ITALIAN (ITALIAN,ENGLISH)" + "'", str3, "ITALIAN (ITALIAN,ENGLISH)");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "French (Canada)" + "'", str8, "French (Canada)");
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "italian");
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "44444444444444italian44444444444444" + "'", str19, "44444444444444italian44444444444444");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "8ian\\u0020i86 (ITALIAN (ITALIAN,ENGLISH))" + "'", str21, "8ian\\u0020i86 (ITALIAN (ITALIAN,ENGLISH))");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test25057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25057");
        java.util.Locale locale3 = new java.util.Locale("HI!       ", "\\U0020", "Italienisch#########################################################################################");
        java.util.Locale locale4 = locale3.stripExtensions();
        java.util.Locale locale5 = locale4.stripExtensions();
        java.lang.String str6 = locale4.toLanguageTag();
        java.util.Locale locale8 = new java.util.Locale("en");
        boolean boolean9 = locale8.hasExtensions();
        java.util.Set<java.lang.String> strSet10 = locale8.getUnicodeLocaleKeys();
        java.lang.String str11 = locale4.getDisplayName(locale8);
        java.util.Locale locale15 = new java.util.Locale("HI!       ", "\\U0020", "Italienisch#########################################################################################");
        java.util.Locale locale16 = locale15.stripExtensions();
        java.lang.String str17 = locale8.getDisplayName(locale16);
        java.util.Set<java.lang.String> strSet18 = locale16.getUnicodeLocaleKeys();
        java.util.Set<java.lang.String> strSet19 = locale16.getUnicodeLocaleAttributes();
        java.lang.String str20 = locale16.getDisplayName();
        java.util.Set<java.lang.Character> charSet21 = locale16.getExtensionKeys();
        org.junit.Assert.assertEquals(locale3.toString(), "hi!       _\\U0020_Italienisch#########################################################################################");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "hi!       _\\U0020_Italienisch#########################################################################################");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "hi!       _\\U0020_Italienisch#########################################################################################");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "und" + "'", str6, "und");
        org.junit.Assert.assertEquals(locale8.toString(), "en");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!        (\\U0020,Italienisch#########################################################################################)" + "'", str11, "hi!        (\\U0020,Italienisch#########################################################################################)");
        org.junit.Assert.assertEquals(locale15.toString(), "hi!       _\\U0020_Italienisch#########################################################################################");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "hi!       _\\U0020_Italienisch#########################################################################################");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "English" + "'", str17, "English");
        org.junit.Assert.assertNotNull(strSet18);
        org.junit.Assert.assertNotNull(strSet19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!        (\\U0020,Italienisch#########################################################################################)" + "'", str20, "hi!        (\\U0020,Italienisch#########################################################################################)");
        org.junit.Assert.assertNotNull(charSet21);
    }

    @Test
    public void test25058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25058");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("FR-FR    \\   ", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test25059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25059");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("GGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGG", "00000000000000000000CCCC\\CCCC0000000000000000000000000000000000000000000000000000000");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "GGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGG" + "'", str2, "GGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGG");
    }

    @Test
    public void test25060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25060");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("#########################################################################################eltI_0200U\\_!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "#########################################################################################eltI_0200U\\_!" + "'", str1, "#########################################################################################eltI_0200U\\_!");
    }

    @Test
    public void test25061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25061");
        java.util.Locale locale3 = new java.util.Locale("", "Hgerman (germany)!       ", "\\u0034\\u00                                             hcstued                                             \\u0034\\u00 (\\U0020IITALIAN\\U0020I)");
        org.junit.Assert.assertEquals(locale3.toString(), "_HGERMAN (GERMANY)!       _\\u0034\\u00                                             hcstued                                             \\u0034\\u00 (\\U0020IITALIAN\\U0020I)");
    }

    @Test
    public void test25062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25062");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("wbybzcacccdcfcgchcickclcmcncocrcucvcwcxcyczded...zho                                                                    \\u0020italianitalianitalianitali", '9', '.');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "wbybzcacccdcfcgchcickclcmcncocrcucvcwcxcyczded...zho                                                                    \\u0020italianitalianitalianitali" + "'", str3, "wbybzcacccdcfcgchcickclcmcncocrcucvcwcxcyczded...zho                                                                    \\u0020italianitalianitalianitali");
    }

    @Test
    public void test25063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25063");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("", "HhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIH");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test25064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25064");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("anglais (Canada)", (int) 't');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test25065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25065");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("zhzhzhzhzhzhzhzhzhzhFRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhAzhzhzhzhzhzhzhzhzhzh", "                                                                                               en");
        boolean boolean4 = org.apache.commons.lang3.StringUtils.endsWithAny("itaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaita", strArray3);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, '2');
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "zhzhzhzhzhzhzhzhzhzhFRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhAzhzhzhzhzhzhzhzhzhzh" + "'", str6, "zhzhzhzhzhzhzhzhzhzhFRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhAzhzhzhzhzhzhzhzhzhzh");
    }

    @Test
    public void test25066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25066");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale locale2 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str3 = locale2.getDisplayName();
        java.util.Locale.Builder builder4 = builder1.setLocale(locale2);
        java.util.Locale.Builder builder5 = builder4.clear();
        java.util.Locale.Builder builder7 = builder5.setLanguage("ITALIAN");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder9 = builder5.setRegion("                                                                                                                     ");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region:                                                                                                                       [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "French (Canada)" + "'", str3, "French (Canada)");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test25067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25067");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("zhozhozhozhozhozhozhozhozhozhozhoItaliazhozhozhozhozhozhozhozhozhozhozhoz", '\r');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + 'z' + "'", char2 == 'z');
    }

    @Test
    public void test25068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25068");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("5\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065", "HHHHHHHHH         ITAL\\u0020iItalian\\...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "5\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065" + "'", str2, "5\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065");
    }

    @Test
    public void test25069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25069");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder2 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder2.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder5 = builder3.setRegion("CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC\\u00d\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\U0020ITALIANITALIANITALIANITALI\\U0020ITALIANITALIANITALIANITAL\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\u00CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC\\u00d\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\U0020ITALIANITALIANITALIANITALI\\U0020ITALIANITALIANITALIANITAL\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\u00CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
    }

    @Test
    public void test25070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25070");
        char[] charArray6 = new char[] { 'f', '4' };
        boolean boolean7 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "Chinese (China)", charArray6);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "\\u0061ItalifnischItalifnischItalifnischItalifnischItalifnischItalifnischItalifnischItalifnischItalif", charArray6);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "French (Canada)", charArray6);
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaILATiNA...aaaaaaaaaaaaaaaaaaaaaaaaaa", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "f4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "f4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[f, 4]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test25071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25071");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "Franz\366sisch(Frankreich)", "\\u0055");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test25072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25072");
        java.util.Locale locale2 = new java.util.Locale("French", "NC_HZ");
        java.util.Locale locale3 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale7 = new java.util.Locale("Italian", "Italian", "English");
        java.lang.String str8 = locale7.getDisplayCountry();
        java.lang.String str9 = locale3.getDisplayCountry(locale7);
        java.lang.String str10 = locale2.getDisplayVariant(locale3);
        java.lang.String str11 = locale3.getDisplayCountry();
        boolean boolean12 = locale3.hasExtensions();
        org.junit.Assert.assertEquals(locale2.toString(), "french_NC_HZ");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "zh_CN");
        org.junit.Assert.assertEquals(locale7.toString(), "italian_ITALIAN_English");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ITALIAN" + "'", str8, "ITALIAN");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "China" + "'", str9, "China");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "China" + "'", str11, "China");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test25073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25073");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList6 = new java.util.ArrayList<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList6, strArray5);
        java.util.Locale.FilteringMode filteringMode8 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList9 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strList6, filteringMode8);
        java.lang.String[] strArray11 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        java.util.List<java.lang.String> strList14 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strList12);
        java.util.Locale.LanguageRange[] languageRangeArray15 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList16 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList16, languageRangeArray15);
        java.lang.String[] strArray20 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList21 = new java.util.ArrayList<java.lang.String>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList21, strArray20);
        java.util.Locale.FilteringMode filteringMode23 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList24 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList16, (java.util.Collection<java.lang.String>) strList21, filteringMode23);
        java.lang.String[] strArray26 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList27 = new java.util.ArrayList<java.lang.String>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList27, strArray26);
        java.util.List<java.lang.String> strList29 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList16, (java.util.Collection<java.lang.String>) strList27);
        java.util.List<java.lang.String> strList30 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strList27);
        java.util.Locale.LanguageRange[] languageRangeArray31 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList32 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList32, languageRangeArray31);
        java.lang.String[] strArray36 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList37 = new java.util.ArrayList<java.lang.String>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList37, strArray36);
        java.util.Locale.FilteringMode filteringMode39 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList40 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList32, (java.util.Collection<java.lang.String>) strList37, filteringMode39);
        java.util.Locale.LanguageRange[] languageRangeArray41 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList42 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList42, languageRangeArray41);
        java.lang.String[] strArray46 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList47 = new java.util.ArrayList<java.lang.String>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList47, strArray46);
        java.util.Locale.FilteringMode filteringMode49 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList50 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList42, (java.util.Collection<java.lang.String>) strList47, filteringMode49);
        java.lang.String[] strArray52 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList53 = new java.util.ArrayList<java.lang.String>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList53, strArray52);
        java.util.List<java.lang.String> strList55 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList42, (java.util.Collection<java.lang.String>) strList53);
        java.lang.String str56 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList32, (java.util.Collection<java.lang.String>) strList53);
        java.util.Locale locale57 = java.util.Locale.ITALIAN;
        java.util.Set<java.lang.Character> charSet58 = locale57.getExtensionKeys();
        java.util.Locale locale60 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale locale62 = new java.util.Locale("");
        java.util.Locale locale63 = java.util.Locale.FRANCE;
        java.util.Locale locale64 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str65 = locale63.getDisplayScript(locale64);
        java.util.Locale locale66 = java.util.Locale.ENGLISH;
        java.lang.String str67 = locale66.getDisplayCountry();
        java.util.Locale locale68 = java.util.Locale.PRC;
        java.util.Locale locale69 = java.util.Locale.US;
        java.util.Locale locale70 = java.util.Locale.FRANCE;
        java.util.Locale locale71 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str72 = locale70.getDisplayScript(locale71);
        java.util.Locale locale73 = java.util.Locale.ITALIAN;
        java.util.Set<java.lang.Character> charSet74 = locale73.getExtensionKeys();
        java.util.Locale locale75 = java.util.Locale.ITALIAN;
        java.lang.String str76 = locale75.getDisplayLanguage();
        java.util.Locale locale77 = java.util.Locale.FRENCH;
        java.util.Locale locale78 = java.util.Locale.US;
        java.util.Locale locale79 = java.util.Locale.ITALIAN;
        java.lang.String str80 = locale79.getDisplayLanguage();
        java.util.Locale locale81 = java.util.Locale.FRANCE;
        java.util.Locale[] localeArray82 = new java.util.Locale[] { locale57, locale60, locale62, locale63, locale66, locale68, locale69, locale71, locale73, locale75, locale77, locale78, locale79, locale81 };
        java.util.ArrayList<java.util.Locale> localeList83 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean84 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList83, localeArray82);
        java.util.Locale locale85 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList32, (java.util.Collection<java.util.Locale>) localeList83);
        java.util.Locale locale86 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.util.Locale>) localeList83);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap87 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList88 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap87);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap89 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList90 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList88, strMap89);
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + filteringMode8 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode8.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertNotNull(languageRangeArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + filteringMode23 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode23.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(strList29);
        org.junit.Assert.assertNotNull(strList30);
        org.junit.Assert.assertNotNull(languageRangeArray31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + filteringMode39 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode39.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList40);
        org.junit.Assert.assertNotNull(languageRangeArray41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + filteringMode49 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode49.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList50);
        org.junit.Assert.assertNotNull(strArray52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(strList55);
        org.junit.Assert.assertNull(str56);
        org.junit.Assert.assertNotNull(locale57);
        org.junit.Assert.assertEquals(locale57.toString(), "it");
        org.junit.Assert.assertNotNull(charSet58);
        org.junit.Assert.assertNotNull(locale60);
        org.junit.Assert.assertEquals(locale60.toString(), "");
        org.junit.Assert.assertEquals(locale62.toString(), "");
        org.junit.Assert.assertNotNull(locale63);
        org.junit.Assert.assertEquals(locale63.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale64);
        org.junit.Assert.assertEquals(locale64.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "" + "'", str65, "");
        org.junit.Assert.assertNotNull(locale66);
        org.junit.Assert.assertEquals(locale66.toString(), "en");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "" + "'", str67, "");
        org.junit.Assert.assertNotNull(locale68);
        org.junit.Assert.assertEquals(locale68.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale69);
        org.junit.Assert.assertEquals(locale69.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale70);
        org.junit.Assert.assertEquals(locale70.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale71);
        org.junit.Assert.assertEquals(locale71.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "" + "'", str72, "");
        org.junit.Assert.assertNotNull(locale73);
        org.junit.Assert.assertEquals(locale73.toString(), "it");
        org.junit.Assert.assertNotNull(charSet74);
        org.junit.Assert.assertNotNull(locale75);
        org.junit.Assert.assertEquals(locale75.toString(), "it");
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "Italian" + "'", str76, "Italian");
        org.junit.Assert.assertNotNull(locale77);
        org.junit.Assert.assertEquals(locale77.toString(), "fr");
        org.junit.Assert.assertNotNull(locale78);
        org.junit.Assert.assertEquals(locale78.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale79);
        org.junit.Assert.assertEquals(locale79.toString(), "it");
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "Italian" + "'", str80, "Italian");
        org.junit.Assert.assertNotNull(locale81);
        org.junit.Assert.assertEquals(locale81.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(localeArray82);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
        org.junit.Assert.assertNull(locale85);
        org.junit.Assert.assertNull(locale86);
        org.junit.Assert.assertNotNull(languageRangeList88);
        org.junit.Assert.assertNotNull(languageRangeList90);
    }

    @Test
    public void test25074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25074");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("\\u0034\\u00                                             hcstud                                             \\u0034\\u00");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\u0034\\u00                                             hcstud                                             \\u0034\\u00" + "'", str1, "\\u0034\\u00                                             hcstud                                             \\u0034\\u00");
    }

    @Test
    public void test25075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25075");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("NAC", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "NAC" + "'", str2, "NAC");
    }

    @Test
    public void test25076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25076");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("Franzosisch (Frankreich)", (double) '9');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=57.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test25077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25077");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "FRANC", (java.lang.CharSequence) "\ud55c\uad6d\uc5b4\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test25078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25078");
        char char1 = org.apache.commons.lang3.CharUtils.toChar("                                                                                           u0020italianitalianitalianitali");
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + ' ' + "'", char1 == ' ');
    }

    @Test
    public void test25079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25079");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("                                                  IT44444444444444444EN", "\u671d\u9c9c\u6587\u97e9\u56fd)");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test25080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25080");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("eeeeeeeeefraeeeeeeeeecccccccccccccccccccccccccccccccccccccccccccccccccenglischccccccccccccccccccccccccccccccccccccccc", "hhcsineilatihhcsineilatihhcsineilatihhcsineilatihhcsineilatihhcsine...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "eeeeeeeeefraeeeeeeeeecccccccccccccccccccccccccccccccccccccccccccccccccenglischccccccccccccccccccccccccccccccccccccccc" + "'", str2, "eeeeeeeeefraeeeeeeeeecccccccccccccccccccccccccccccccccccccccccccccccccenglischccccccccccccccccccccccccccccccccccccccc");
    }

    @Test
    public void test25081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25081");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.split("\\u0020iTALIANiTALIANiTALIANiTALI", "English", 4);
        boolean boolean7 = org.apache.commons.lang3.StringUtils.endsWithAny("\\u000d", strArray6);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.endsWithAny("             ", strArray6);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.concatWith("German", (java.lang.Object[]) strArray6);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\\u0020GermanTALIANGermanTALIANGermanTALIANiTALI" + "'", str9, "\\u0020GermanTALIANGermanTALIANGermanTALIANiTALI");
    }

    @Test
    public void test25082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25082");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("ienischallemanditalian_ITALIAN_EnglishallemandHI!allemandhi!allemandADAEAFAGAIA...", "                                      italian (ITALIAN,English)                                      ", 65);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test25083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25083");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "ffffffffffffffffffffffffffffffffFRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhAfffffffffffffffffffffffffffffffff");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test25084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25084");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("fr-FR", 'k');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test25085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25085");
        java.util.Locale locale1 = java.util.Locale.ITALIAN;
        java.util.Set<java.lang.Character> charSet2 = locale1.getExtensionKeys();
        java.lang.String str3 = locale1.getVariant();
        java.lang.String str4 = locale1.getDisplayName();
        java.lang.String str5 = locale1.getCountry();
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.upperCase("Deutsch\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\", locale1);
        java.lang.String str7 = locale1.getLanguage();
        java.lang.String str8 = locale1.getDisplayScript();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "it");
        org.junit.Assert.assertNotNull(charSet2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "italien" + "'", str4, "italien");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "DEUTSCH\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\" + "'", str6, "DEUTSCH\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "it" + "'", str7, "it");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test25086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25086");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.setLanguageTag("Italian");
        java.util.Locale.Builder builder4 = builder0.clearExtensions();
        java.util.Locale.Builder builder5 = builder0.clear();
        java.util.Locale.Builder builder6 = builder0.clearExtensions();
        java.util.Locale locale7 = java.util.Locale.ITALIAN;
        java.lang.String str8 = locale7.getDisplayLanguage();
        java.util.Locale locale9 = locale7.stripExtensions();
        java.util.Locale locale11 = java.util.Locale.forLanguageTag("\\u0020");
        java.lang.String str12 = locale11.getDisplayScript();
        java.lang.String str13 = locale9.getDisplayCountry(locale11);
        java.util.Set<java.lang.Character> charSet14 = locale9.getExtensionKeys();
        java.util.Locale.Builder builder15 = builder0.setLocale(locale9);
        java.util.Locale locale17 = java.util.Locale.FRENCH;
        java.util.Locale locale18 = java.util.Locale.ENGLISH;
        java.lang.String str19 = locale18.getDisplayCountry();
        java.lang.String str20 = locale17.getDisplayVariant(locale18);
        java.lang.String str21 = locale17.getDisplayCountry();
        java.lang.String str22 = locale17.getScript();
        java.lang.String str23 = locale17.getScript();
        java.util.Locale locale24 = java.util.Locale.FRENCH;
        java.util.Locale locale25 = java.util.Locale.ENGLISH;
        java.lang.String str26 = locale25.getDisplayCountry();
        java.lang.String str27 = locale24.getDisplayVariant(locale25);
        java.lang.String str28 = locale24.getDisplayCountry();
        java.lang.String str29 = locale24.getScript();
        java.lang.String str30 = locale24.getScript();
        java.lang.String str31 = locale17.getDisplayCountry(locale24);
        java.lang.String str32 = org.apache.commons.lang3.StringUtils.upperCase("\\xtalxan_ITALIAN_Englxsh", locale24);
        java.lang.String str33 = locale24.getDisplayName();
        java.util.Locale locale34 = null;
        java.lang.String str35 = locale24.getDisplayVariant(locale34);
        java.util.Set<java.lang.String> strSet36 = locale24.getUnicodeLocaleKeys();
        java.lang.String str37 = locale9.getDisplayVariant(locale24);
        java.util.Locale locale39 = java.util.Locale.forLanguageTag("\\u0020");
        java.lang.String str40 = locale39.getDisplayScript();
        java.lang.String str41 = locale39.getDisplayName();
        java.lang.String str42 = locale9.getDisplayVariant(locale39);
        java.lang.String str43 = locale9.getDisplayName();
        java.lang.String str44 = locale9.getDisplayVariant();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "it");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "italien" + "'", str8, "italien");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "it");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(charSet14);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "fr");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "en");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "fr");
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "en");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "\\XTALXAN_ITALIAN_ENGLXSH" + "'", str32, "\\XTALXAN_ITALIAN_ENGLXSH");
// flaky:         org.junit.Assert.assertEquals("'" + str33 + "' != '" + "fran\347ais" + "'", str33, "fran\347ais");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(strSet36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertNotNull(locale39);
        org.junit.Assert.assertEquals(locale39.toString(), "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
// flaky:         org.junit.Assert.assertEquals("'" + str43 + "' != '" + "italien" + "'", str43, "italien");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
    }

    @Test
    public void test25087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25087");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("######################################ELTi_0200u\\_!#####################################ELTi_0200u\\_!", "cccccccccccccccccccccccccccccccccccccccccccccccccenglischcccccccccccccccccccccccccccccccccccccccccccccccccc", 17);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test25088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25088");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("Italia", "Hi!        Italienisch italian_ITALIAN_English HI! hi! ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDED... \\u0034 HI! Italian \\u0061 \\u0023 hi! iTALIAN Chinese (China) hi! zh_CN iTALIAN en Italienisch");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test25089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25089");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("HI!tttttttHI!tttttttHI!tttttttHI!tttttttHI!tttttttHI!tttttttHI!tttttttHI!tttttttHI!tttttttHI!tttttttHI!tttttttHI!tttttttHI!tttttttHI!tttttttHI!tttttttHI!", "IFTLNZ\\SISC02");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!tttttttHI!tttttttHI!tttttttHI!tttttttHI!tttttttHI!tttttttHI!tttttttHI!tttttttHI!tttttttHI!tttttttHI!tttttttHI!tttttttHI!tttttttHI!tttttttHI!tttttttHI!" + "'", str2, "HI!tttttttHI!tttttttHI!tttttttHI!tttttttHI!tttttttHI!tttttttHI!tttttttHI!tttttttHI!tttttttHI!tttttttHI!tttttttHI!tttttttHI!tttttttHI!tttttttHI!tttttttHI!");
    }

    @Test
    public void test25090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25090");
        char[] charArray13 = new char[] { '4', '#', '#', 'a', ' ', 'a' };
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray13);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "iTALIAN", charArray13);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "8600U\\                                                                                                                  ", charArray13);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "Eagaash", charArray13);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "R0", charArray13);
        boolean boolean19 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "                                                 inglese", charArray13);
        boolean boolean20 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "!ih                            dalleman", charArray13);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "4##a a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "4##a a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[4, #, #, a,  , a]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test25091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25091");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("          2cinese (Cina)iTALIANiTALIANiTALIANiTAL", "titititititit", "\\0020ItalianItalianItalianItal");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "          2cinese (Cina)iTALIANiTALIANiTALIANiTAL" + "'", str3, "          2cinese (Cina)iTALIANiTALIANiTALIANiTAL");
    }

    @Test
    public void test25092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25092");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("...78zhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzh..                                                          ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test25093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25093");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("chinese", "AQeAReASeATeAU");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "chinese" + "'", str2, "chinese");
    }

    @Test
    public void test25094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25094");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("italiaE");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ITALIAe" + "'", str1, "ITALIAe");
    }

    @Test
    public void test25095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25095");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "french");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test25096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25096");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "\\U0069cccccccccccccccccccccccccccccccceGSCHccccccccccccccccccccccccccccccccccccccccccccccccc");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test25097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25097");
        java.util.Locale locale3 = new java.util.Locale("HcsineilatI", "", "\\u00de\\u00\\u00de\\u00\\u00d         INGLESE        ");
        org.junit.Assert.assertEquals(locale3.toString(), "hcsineilati__\\u00de\\u00\\u00de\\u00\\u00d         INGLESE        ");
    }

    @Test
    public void test25098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25098");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.setLanguageTag("Italian");
        java.util.Locale.Builder builder4 = builder0.clearExtensions();
        java.util.Locale.Builder builder5 = builder0.clear();
        java.util.Locale locale7 = java.util.Locale.forLanguageTag("\\u0020");
        java.util.Locale.Builder builder8 = builder0.setLocale(locale7);
        java.util.Locale.Builder builder9 = builder8.clear();
        java.util.Locale.Builder builder10 = builder8.clear();
        java.util.Locale.Builder builder11 = builder10.clear();
        java.util.Locale locale12 = builder11.build();
        java.util.Locale.Builder builder14 = builder11.setVariant("ITALIAN4");
        java.util.Locale.Builder builder15 = builder14.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder17 = builder14.setRegion("##############");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: ############## [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "");
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "");
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder15);
    }

    @Test
    public void test25099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25099");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("         INGLESE        ", "                                                                                            zzzChina");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test25100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25100");
        java.util.Locale locale3 = new java.util.Locale("2italianitalianitalianitali", "Franzosisch (!ih!ih!ih!ih!ih!ih!ih!ih!ih!ihtedesco    !ih!ih!ih!ih!ih!ih!ih!ih!ih!ihFranzosisch (", "\\u0032");
        java.util.Set<java.lang.String> strSet4 = locale3.getUnicodeLocaleKeys();
        org.junit.Assert.assertEquals(locale3.toString(), "2italianitalianitalianitali_FRANZOSISCH (!IH!IH!IH!IH!IH!IH!IH!IH!IH!IHTEDESCO    !IH!IH!IH!IH!IH!IH!IH!IH!IH!IHFRANZOSISCH (_\\u0032");
        org.junit.Assert.assertNotNull(strSet4);
    }

    @Test
    public void test25101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25101");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("it                   ", strMap1);
        java.util.Collection<java.lang.String> strCollection3 = null;
        java.util.Locale.LanguageRange[] languageRangeArray4 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList5 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList5, languageRangeArray4);
        java.lang.String[] strArray9 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList10 = new java.util.ArrayList<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList10, strArray9);
        java.util.Locale.FilteringMode filteringMode12 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList13 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList5, (java.util.Collection<java.lang.String>) strList10, filteringMode12);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.String> strList14 = java.util.Locale.filterTags(languageRangeList2, strCollection3, filteringMode12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(languageRangeList2);
        org.junit.Assert.assertNotNull(languageRangeArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + filteringMode12 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode12.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList13);
    }

    @Test
    public void test25102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25102");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("\u97d3\u6587\u5357\u97d3\u97d3\u6587\u5357\u97d3\u97d3\u6587\u5357\u97d3\u97d3\u6587\u5357\u97d3\u97d3\u6587\u5357\u97d3\u97d3\u6587\u5357\u97d3\u97d3\u6587\u5357\u97d3\u97d3\u6587\u5357\u97d3\u97d3\u6587\u5357\u97d3\u97d3\u6587\u5357\u97d3\u97d3\u6587\u5357\u97d3\u97d3\u6587\u5357\u97d3\u97d3\u6587\u5357\u97d3\u97d3\u6587\u5357\u97d3\u97d3\u6587\u5357\u97d3\u97d3\u6587\u5357\u97d3\u97d3\u6587\u5357\u97d3\u97d3\u6587\u5357\u97d3", '\r');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u97d3\u6587\u5357\u97d3\u97d3\u6587\u5357\u97d3\u97d3\u6587\u5357\u97d3\u97d3\u6587\u5357\u97d3\u97d3\u6587\u5357\u97d3\u97d3\u6587\u5357\u97d3\u97d3\u6587\u5357\u97d3\u97d3\u6587\u5357\u97d3\u97d3\u6587\u5357\u97d3\u97d3\u6587\u5357\u97d3\u97d3\u6587\u5357\u97d3\u97d3\u6587\u5357\u97d3\u97d3\u6587\u5357\u97d3\u97d3\u6587\u5357\u97d3\u97d3\u6587\u5357\u97d3\u97d3\u6587\u5357\u97d3\u97d3\u6587\u5357\u97d3\u97d3\u6587\u5357\u97d3" + "'", str2, "\u97d3\u6587\u5357\u97d3\u97d3\u6587\u5357\u97d3\u97d3\u6587\u5357\u97d3\u97d3\u6587\u5357\u97d3\u97d3\u6587\u5357\u97d3\u97d3\u6587\u5357\u97d3\u97d3\u6587\u5357\u97d3\u97d3\u6587\u5357\u97d3\u97d3\u6587\u5357\u97d3\u97d3\u6587\u5357\u97d3\u97d3\u6587\u5357\u97d3\u97d3\u6587\u5357\u97d3\u97d3\u6587\u5357\u97d3\u97d3\u6587\u5357\u97d3\u97d3\u6587\u5357\u97d3\u97d3\u6587\u5357\u97d3\u97d3\u6587\u5357\u97d3\u97d3\u6587\u5357\u97d3");
    }

    @Test
    public void test25103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25103");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("fr_FR");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("CHINESE (CHINA)", strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test25104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25104");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("Eallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmand", 'I', 'F');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Eallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmand" + "'", str3, "Eallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmand");
    }

    @Test
    public void test25105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25105");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("anihC");
        java.lang.String str2 = languageRange1.getRange();
        java.lang.String str3 = languageRange1.getRange();
        java.lang.String str4 = languageRange1.getRange();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "anihc" + "'", str2, "anihc");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "anihc" + "'", str3, "anihc");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "anihc" + "'", str4, "anihc");
    }

    @Test
    public void test25106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25106");
        java.util.Locale locale3 = new java.util.Locale("TALIAN", "FRA", "Undetermined");
        java.lang.String str4 = locale3.toLanguageTag();
        java.lang.String str5 = locale3.getDisplayName();
        java.lang.String str6 = locale3.getCountry();
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap8 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList9 = java.util.Locale.LanguageRange.parse("ENGLISCH", strMap8);
        java.util.Locale locale10 = java.util.Locale.ITALIAN;
        java.util.Set<java.lang.Character> charSet11 = locale10.getExtensionKeys();
        java.lang.String str12 = locale10.getVariant();
        java.lang.String str13 = locale10.getDisplayName();
        java.lang.String str14 = locale10.getCountry();
        java.util.Set<java.lang.String> strSet15 = locale10.getUnicodeLocaleKeys();
        java.lang.String str16 = java.util.Locale.lookupTag(languageRangeList9, (java.util.Collection<java.lang.String>) strSet15);
        java.util.Locale.LanguageRange[] languageRangeArray17 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList18 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList18, languageRangeArray17);
        java.lang.String[] strArray22 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList23 = new java.util.ArrayList<java.lang.String>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList23, strArray22);
        java.util.Locale.FilteringMode filteringMode25 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList26 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList18, (java.util.Collection<java.lang.String>) strList23, filteringMode25);
        java.util.Locale.LanguageRange[] languageRangeArray27 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList28 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList28, languageRangeArray27);
        java.lang.String[] strArray32 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList33 = new java.util.ArrayList<java.lang.String>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList33, strArray32);
        java.util.Locale.FilteringMode filteringMode35 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList36 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList28, (java.util.Collection<java.lang.String>) strList33, filteringMode35);
        java.lang.String[] strArray38 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList39 = new java.util.ArrayList<java.lang.String>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList39, strArray38);
        java.util.List<java.lang.String> strList41 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList28, (java.util.Collection<java.lang.String>) strList39);
        java.lang.String str42 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList18, (java.util.Collection<java.lang.String>) strList39);
        java.util.Locale.LanguageRange[] languageRangeArray43 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList44 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList44, languageRangeArray43);
        java.util.Locale.LanguageRange[] languageRangeArray46 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList47 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList47, languageRangeArray46);
        java.lang.String[] strArray51 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList52 = new java.util.ArrayList<java.lang.String>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList52, strArray51);
        java.util.Locale.FilteringMode filteringMode54 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList55 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList47, (java.util.Collection<java.lang.String>) strList52, filteringMode54);
        java.util.Locale.FilteringMode filteringMode56 = java.util.Locale.FilteringMode.AUTOSELECT_FILTERING;
        java.util.List<java.lang.String> strList57 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList44, (java.util.Collection<java.lang.String>) strList52, filteringMode56);
        java.util.Locale.LanguageRange[] languageRangeArray58 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList59 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList59, languageRangeArray58);
        java.util.Locale.LanguageRange[] languageRangeArray61 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList62 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList62, languageRangeArray61);
        java.lang.String[] strArray66 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList67 = new java.util.ArrayList<java.lang.String>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList67, strArray66);
        java.util.Locale.FilteringMode filteringMode69 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList70 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList62, (java.util.Collection<java.lang.String>) strList67, filteringMode69);
        java.util.Locale.FilteringMode filteringMode71 = java.util.Locale.FilteringMode.AUTOSELECT_FILTERING;
        java.util.List<java.lang.String> strList72 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList59, (java.util.Collection<java.lang.String>) strList67, filteringMode71);
        java.util.List<java.lang.String> strList73 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList18, (java.util.Collection<java.lang.String>) strList57, filteringMode71);
        java.util.List<java.lang.String> strList74 = java.util.Locale.filterTags(languageRangeList9, (java.util.Collection<java.lang.String>) strList73);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap75 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList76 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList9, strMap75);
        boolean boolean77 = locale3.equals((java.lang.Object) strMap75);
        org.junit.Assert.assertEquals(locale3.toString(), "talian_FRA_Undetermined");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "talian" + "'", str4, "talian");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "talian (FRA,Undetermined)" + "'", str5, "talian (FRA,Undetermined)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "FRA" + "'", str6, "FRA");
        org.junit.Assert.assertNotNull(languageRangeList9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "it");
        org.junit.Assert.assertNotNull(charSet11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "italien" + "'", str13, "italien");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(strSet15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(languageRangeArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + filteringMode25 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode25.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList26);
        org.junit.Assert.assertNotNull(languageRangeArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + filteringMode35 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode35.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList36);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(strList41);
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertNotNull(languageRangeArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(languageRangeArray46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + filteringMode54 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode54.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList55);
        org.junit.Assert.assertTrue("'" + filteringMode56 + "' != '" + java.util.Locale.FilteringMode.AUTOSELECT_FILTERING + "'", filteringMode56.equals(java.util.Locale.FilteringMode.AUTOSELECT_FILTERING));
        org.junit.Assert.assertNotNull(strList57);
        org.junit.Assert.assertNotNull(languageRangeArray58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(languageRangeArray61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(strArray66);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertTrue("'" + filteringMode69 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode69.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList70);
        org.junit.Assert.assertTrue("'" + filteringMode71 + "' != '" + java.util.Locale.FilteringMode.AUTOSELECT_FILTERING + "'", filteringMode71.equals(java.util.Locale.FilteringMode.AUTOSELECT_FILTERING));
        org.junit.Assert.assertNotNull(strList72);
        org.junit.Assert.assertNotNull(strList73);
        org.junit.Assert.assertNotNull(strList74);
        org.junit.Assert.assertNotNull(languageRangeList76);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
    }

    @Test
    public void test25107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25107");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023" + "'", str1, "u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023");
    }

    @Test
    public void test25108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25108");
        java.util.Locale locale0 = java.util.Locale.getDefault();
        java.lang.String str1 = locale0.getDisplayName();
        java.util.Locale locale2 = locale0.stripExtensions();
        java.util.Locale locale4 = java.util.Locale.forLanguageTag("         ITALIAN_italian_eNGLISH         ITALIAN_!IH");
        java.util.Locale.setDefault(locale4);
        java.util.Locale locale6 = java.util.Locale.ROOT;
        java.lang.String str7 = locale6.getISO3Language();
        java.util.Locale locale9 = new java.util.Locale("\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rzh_CN");
        java.lang.String str10 = locale6.getDisplayVariant(locale9);
        java.lang.String str11 = locale4.getDisplayName(locale6);
        java.lang.String str12 = locale0.getDisplayScript(locale4);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "na");
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "nauruan" + "'", str1, "nauruan");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "na");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals(locale9.toString(), "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rzh_cn");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test25109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25109");
        java.util.Locale locale1 = new java.util.Locale("hI!");
        org.junit.Assert.assertEquals(locale1.toString(), "hi!");
    }

    @Test
    public void test25110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25110");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle(" \\U0078 ", "bgbgbgbgbgbgbgbgbgbgbgbgbgbgbgbgbgbgbgbgbgbgbgbgbgbgbgbgbgbgtalian", 223);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \\U0078 " + "'", str3, " \\U0078 ");
    }

    @Test
    public void test25111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25111");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("", "                                                                                                                                                                                           z...\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r...                                                                                                                                                                    italian_ITALIAN_EnglisF");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test25112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25112");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("kkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkEDkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkEDkk");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test25113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25113");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("uuuuu");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "uuuuu" + "'", str1, "uuuuu");
    }

    @Test
    public void test25114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25114");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("44444444444444ITALIAN444444444444444444444444ITALIAN444444444444444444444444ITALIAN444444444444444444444444ITALIAN444444444444444444444444ITALIAN444444444444444444444444ITALIAN444444444444444444444444ITALIAN444444444444444444444444ITALIAN444444444444444444444444ITALIAN444444444444444444444444ITALIAN4444444444", "GENCE");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test25115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25115");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("franz\366sisch (kanada)franz\366s                                                                 franz\366sisch (kanada)franz\366si", 45, "CHNtttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttt");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "franz\366sisch (kanada)franz\366s                                                                 franz\366sisch (kanada)franz\366si" + "'", str3, "franz\366sisch (kanada)franz\366s                                                                 franz\366sisch (kanada)franz\366si");
    }

    @Test
    public void test25116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25116");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale locale2 = builder0.build();
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale.Builder builder4 = builder3.clearExtensions();
        java.util.Locale.Builder builder6 = builder4.setLanguage("");
        java.util.Locale.Builder builder7 = builder6.clearExtensions();
        java.util.Locale.Builder builder8 = builder7.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder11 = builder7.setUnicodeLocaleKeyword("8ian\\u0020i86", "ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDEDJDKDMDODZECEEEGEHERESETFIFJFKFMFOFRGAGBGDGEGFGGGHGIGLGMGNGPGQGRGSGTGUGWGYHKHMHNHRHTHUIDIEILIMINIOIQIRISITJEJMJOJPKEKGKHKIKMKNKPKRKWKYKZLALBLCLILKLRLSLTLULVLYMAMCMDMEMFMGMHMKMLMMMNMOMPMQMRMSMTMUMVMWMXMYMZNANCNENFNGNINLNONPNRNUNZOMPAPEPFPGPHPKPLPMPNPRPSPTPWPYQARERORSRURWSASBSCSDSESGSHSISJSKSLSMSNSOSRSSSTSVSXSYSZTCTDTFTGTHTJTKTLTMTNTOTRTTTVTWTZUAUGUMUSUYUZVAVCVEVGVIVNVUWFWSYEYTZAZMZ");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: 8ian\\u0020i86 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test25117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25117");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rchinesisch (china)", 74);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test25118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25118");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("Franz\366sischFranzosisch(Frankreich)kkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk", "e                         iItal", 115);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test25119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25119");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder2 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder2.setScript("");
        java.util.Locale.Builder builder6 = builder4.addUnicodeLocaleAttribute("zho");
        java.util.Locale locale7 = builder4.build();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "");
    }

    @Test
    public void test25120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25120");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("\uc911\uad6d\uc5b4");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\uc911\uad6d\uc5b4" + "'", str1, "\uc911\uad6d\uc5b4");
    }

    @Test
    public void test25121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25121");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("...       g                     ...");
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, 'a', 223, 16);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test25122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25122");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("TALIAN_ITALIAN_ENGLISH         ITALIAN_!IHITTAIT_ITALIAN_EGAISH", "\u5fb7\u6587");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "TALIAN_ITALIAN_ENGLISH         ITALIAN_!IHITTAIT_ITALIAN_EGAISH" + "'", str2, "TALIAN_ITALIAN_ENGLISH         ITALIAN_!IHITTAIT_ITALIAN_EGAISH");
    }

    @Test
    public void test25123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25123");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "R0                                               nailati             ", (java.lang.CharSequence) "NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNHI!NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test25124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25124");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList6 = new java.util.ArrayList<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList6, strArray5);
        java.util.Locale.FilteringMode filteringMode8 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList9 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strList6, filteringMode8);
        java.lang.String[] strArray11 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        java.util.List<java.lang.String> strList14 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strList12);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.lang.String>) strList14, "azhzhzhzhzhzhzhzhzhzh");
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.lang.String>) strList14, 'e');
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + filteringMode8 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode8.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test25125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25125");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "4300u\\                                             dutsch                                            ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test25126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25126");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.setLanguageTag("Italian");
        java.util.Locale locale4 = java.util.Locale.PRC;
        java.lang.String str5 = locale4.getDisplayName();
        java.util.Locale.Builder builder6 = builder0.setLocale(locale4);
        java.util.Locale locale8 = new java.util.Locale("\\u0034\\u0034\\u0034\\u0034\\u0034\\u0034\\u0034\\u0034\\u0034\\hi!       \\u0034\\u0034\\u0034\\u0034\\u0034\\u0034\\u0034\\u0034\\u0034\\");
        java.lang.String str9 = locale4.getDisplayName(locale8);
        java.lang.String str10 = locale8.getDisplayLanguage();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Chinese (China)" + "'", str5, "Chinese (China)");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertEquals(locale8.toString(), "\\u0034\\u0034\\u0034\\u0034\\u0034\\u0034\\u0034\\u0034\\u0034\\hi!       \\u0034\\u0034\\u0034\\u0034\\u0034\\u0034\\u0034\\u0034\\u0034\\");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Chinese (China)" + "'", str9, "Chinese (China)");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\\u0034\\u0034\\u0034\\u0034\\u0034\\u0034\\u0034\\u0034\\u0034\\hi!       \\u0034\\u0034\\u0034\\u0034\\u0034\\u0034\\u0034\\u0034\\u0034\\" + "'", str10, "\\u0034\\u0034\\u0034\\u0034\\u0034\\u0034\\u0034\\u0034\\u0034\\hi!       \\u0034\\u0034\\u0034\\u0034\\u0034\\u0034\\u0034\\u0034\\u0034\\");
    }

    @Test
    public void test25127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25127");
        java.util.Locale locale0 = java.util.Locale.FRENCH;
        java.lang.String str1 = locale0.getDisplayName();
        java.lang.String str3 = locale0.getExtension('C');
        java.lang.String str4 = locale0.getVariant();
        java.lang.String str5 = locale0.toString();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "French" + "'", str1, "French");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "fr" + "'", str5, "fr");
    }

    @Test
    public void test25128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25128");
        java.util.Locale locale3 = new java.util.Locale("Italie                         ", "", "aaaaaaaaaaaaaaaaaaaaaaaaaaILaaaaaaaaaaaaaaaaaaaaaaaaaaIL");
        java.lang.String str4 = locale3.getISO3Country();
        java.lang.String str6 = locale3.getExtension('e');
        org.junit.Assert.assertEquals(locale3.toString(), "italie                         __aaaaaaaaaaaaaaaaaaaaaaaaaaILaaaaaaaaaaaaaaaaaaaaaaaaaaIL");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test25129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25129");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("ZhozhozhozhozhozhozhozhozhozhozhoItaliazhozhozhozhozhozhozhozhozhozhozhoz", "Engl");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test25130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25130");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("\u30d5\u30e9\u30f3\u30b9\u8a9e\u30d5\u30e9\u30f3\u30b9)", "Azhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzh", 68);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test25131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25131");
        java.util.Locale locale3 = new java.util.Locale("H", "Hhhhhhhhh", "CV CW CX CY CZ DE DJ DK DM DO DZ EC EE EG EH ER ES ET FI FJ FK");
        java.lang.String str4 = locale3.toLanguageTag();
        java.lang.String str5 = locale3.getDisplayName();
        java.lang.String str6 = locale3.getDisplayLanguage();
        org.junit.Assert.assertEquals(locale3.toString(), "h_HHHHHHHHH_CV CW CX CY CZ DE DJ DK DM DO DZ EC EE EG EH ER ES ET FI FJ FK");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "und" + "'", str4, "und");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "h (HHHHHHHHH,CV CW CX CY CZ DE DJ DK DM DO DZ EC EE EG EH ER ES ET FI FJ FK)" + "'", str5, "h (HHHHHHHHH,CV CW CX CY CZ DE DJ DK DM DO DZ EC EE EG EH ER ES ET FI FJ FK)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "h" + "'", str6, "h");
    }

    @Test
    public void test25132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25132");
        java.lang.Object[] objArray0 = null;
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.join(objArray0, '7');
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test25133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25133");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("tanochnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN", "eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee8ian\\u0020i86 (ITALIAN (ITALIAN,ENGLISH))eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test25134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25134");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("                                                           ...                                                       ", "\\u0054");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test25135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25135");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("  \\u007a555555555555555555555555555555555", "  nailati                                                                                                               ", "\\u00de\\u00\\u00de\\u00\\u00d         INGLESE       O");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  \\u007a555555555555555555555555555555555" + "'", str3, "  \\u007a555555555555555555555555555555555");
    }

    @Test
    public void test25136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25136");
        char char2 = org.apache.commons.lang3.CharUtils.toChar((java.lang.Character) 'N', 'd');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + 'N' + "'", char2 == 'N');
    }

    @Test
    public void test25137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25137");
        java.util.Locale locale1 = new java.util.Locale("ZH_cnFrench (Canada)");
        org.junit.Assert.assertEquals(locale1.toString(), "zh_cnfrench (canada)");
    }

    @Test
    public void test25138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25138");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "         ITALIAN_ITALIAN_ENGLISH         ITALIAN_!IHITTAIT_ITALIAN_EGAISHE             G                          SHE             G                          SHE             G                          SHE             G                          SHE             G                          SHE             G                          SHE             G                          SHE             G                ", "fR\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\ub3c5\uc77c\uc5b4\r\r\r\r\rfraH\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\ub3c5\uc77c\uc5b4\r\r\r\r\rfrafR\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\ub3c5\uc77c\uc5b4\r\r\r\r\rfra)");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 31 + "'", int2 == 31);
    }

    @Test
    public void test25139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25139");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("Italienisch", "Frz\366cz(frkrec)");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Italienisch" + "'", str2, "Italienisch");
    }

    @Test
    public void test25140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25140");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("!ih                            dllm!ih                            dllm!ih                          ");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
    }

    @Test
    public void test25141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25141");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("", "hi!        (\\U0020,Italienisch#####Franzosisch (Kanada)##############################################################################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!        (\\U0020,Italienisch#####Franzosisch (Kanada)##############################################################################" + "'", str2, "hi!        (\\U0020,Italienisch#####Franzosisch (Kanada)##############################################################################");
    }

    @Test
    public void test25142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25142");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hzhzhzhzhzhzhzhzhzhzAhzSAhzRAhzQAhzOAhzNAhz", 'B');
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray2);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray2);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hzhzhzhzhzhzhzhzhzhzAhzSAhzRAhzQAhzOAhzNAhz" + "'", str3, "hzhzhzhzhzhzhzhzhzhzAhzSAhzRAhzQAhzOAhzNAhz");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hzhzhzhzhzhzhzhzhzhzAhzSAhzRAhzQAhzOAhzNAhz" + "'", str4, "hzhzhzhzhzhzhzhzhzhzAhzSAhzRAhzQAhzOAhzNAhz");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hzhzhzhzhzhzhzhzhzhzAhzSAhzRAhzQAhzOAhzNAhz" + "'", str5, "hzhzhzhzhzhzhzhzhzhzAhzSAhzRAhzQAhzOAhzNAhz");
    }

    @Test
    public void test25143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25143");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "...E_NAILATI...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test25144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25144");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("\u82f1\u6587");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\u82f1\u6587" + "'", str1, "\u82f1\u6587");
    }

    @Test
    public void test25145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25145");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("             FRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhA             FRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhA             FRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhA             FRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhA23", "         ITALIAN_ITALIAN_ENGLISH         ITALIAN_!IHITTAIT_ITALIAN_EGAISH", (int) '\u6cd5');
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test25146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25146");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale locale2 = java.util.Locale.FRENCH;
        java.util.Locale locale3 = java.util.Locale.ENGLISH;
        java.lang.String str4 = locale3.getDisplayCountry();
        java.lang.String str5 = locale2.getDisplayVariant(locale3);
        java.lang.String str6 = locale2.getDisplayCountry();
        java.lang.String str7 = locale2.getScript();
        java.lang.String str8 = locale2.getScript();
        java.util.Locale locale9 = java.util.Locale.FRENCH;
        java.util.Locale locale10 = java.util.Locale.ENGLISH;
        java.lang.String str11 = locale10.getDisplayCountry();
        java.lang.String str12 = locale9.getDisplayVariant(locale10);
        java.lang.String str13 = locale9.getDisplayCountry();
        java.lang.String str14 = locale9.getScript();
        java.lang.String str15 = locale9.getScript();
        java.lang.String str16 = locale2.getDisplayCountry(locale9);
        java.lang.String str17 = locale1.getDisplayVariant(locale9);
        java.util.Locale locale19 = java.util.Locale.forLanguageTag("FRANZ\326SISCH");
        java.lang.String str20 = locale19.getDisplayLanguage();
        java.lang.String str21 = locale9.getDisplayScript(locale19);
        java.lang.String str22 = locale19.getVariant();
        java.lang.String str23 = locale19.getDisplayVariant();
        java.lang.String str24 = locale19.getDisplayCountry();
        java.lang.Object obj25 = locale19.clone();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fr");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "fr");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertEquals(obj25.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj25), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj25), "");
    }

    @Test
    public void test25147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25147");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("CHINESExxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx...", "italie");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CHINESExxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx..." + "'", str2, "CHINESExxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx...");
    }

    @Test
    public void test25148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25148");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("                                                         \\u005c                                                         ");
        boolean boolean3 = org.apache.commons.lang3.StringUtils.startsWithAny("CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCcinese (cina)\\u0069h..CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC", strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test25149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25149");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale1 = java.util.Locale.getDefault(category0);
        java.util.Locale locale2 = java.util.Locale.GERMAN;
        java.util.Locale locale3 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str4 = locale2.getDisplayName(locale3);
        java.util.Locale.setDefault(category0, locale3);
        java.util.Set<java.lang.String> strSet6 = locale3.getUnicodeLocaleKeys();
        java.lang.String str7 = locale3.getLanguage();
        java.util.Locale.Category category9 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale10 = java.util.Locale.getDefault(category9);
        java.util.Locale locale11 = java.util.Locale.FRANCE;
        java.util.Locale locale12 = java.util.Locale.ITALIAN;
        java.lang.String str14 = locale12.getExtension('h');
        java.lang.String str15 = locale11.getDisplayScript(locale12);
        java.util.Locale locale16 = locale11.stripExtensions();
        java.util.Locale.setDefault(category9, locale11);
        java.util.Locale locale18 = java.util.Locale.GERMANY;
        java.util.Locale locale19 = locale18.stripExtensions();
        java.util.Locale.setDefault(category9, locale18);
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.lowerCase("E             g                                                                                     ", locale18);
        java.lang.String str22 = locale18.getLanguage();
        java.lang.String str23 = locale18.getDisplayScript();
        java.lang.String str24 = locale3.getDisplayName(locale18);
        java.util.Locale locale28 = new java.util.Locale("hi!", "English", "");
        java.util.Locale locale32 = new java.util.Locale("H", "Hhhhhhhhh", "CV CW CX CY CZ DE DJ DK DM DO DZ EC EE EG EH ER ES ET FI FJ FK");
        java.lang.String str33 = locale28.getDisplayScript(locale32);
        java.lang.String str34 = locale32.getDisplayLanguage();
        java.lang.String str35 = locale18.getDisplayName(locale32);
        java.lang.String str36 = locale32.getDisplayVariant();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale1);
// flaky:         org.junit.Assert.assertEquals(locale1.toString(), "italian");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "de");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "allemand" + "'", str4, "allemand");
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "fr" + "'", str7, "fr");
        org.junit.Assert.assertTrue("'" + category9 + "' != '" + java.util.Locale.Category.FORMAT + "'", category9.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "fr_CA");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "it");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "de_DE");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "e             g                                                                                     " + "'", str21, "e             g                                                                                     ");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "de" + "'", str22, "de");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Franz\366sisch (Kanada)" + "'", str24, "Franz\366sisch (Kanada)");
        org.junit.Assert.assertEquals(locale28.toString(), "hi!_ENGLISH");
        org.junit.Assert.assertEquals(locale32.toString(), "h_HHHHHHHHH_CV CW CX CY CZ DE DJ DK DM DO DZ EC EE EG EH ER ES ET FI FJ FK");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "h" + "'", str34, "h");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "German (Germany)" + "'", str35, "German (Germany)");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "CV CW CX CY CZ DE DJ DK DM DO DZ EC EE EG EH ER ES ET FI FJ FK" + "'", str36, "CV CW CX CY CZ DE DJ DK DM DO DZ EC EE EG EH ER ES ET FI FJ FK");
    }

    @Test
    public void test25150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25150");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("\ud55c\uad6d\uc5b4                                                                                                                       ", 81, 'e');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\ud55c\uad6d\uc5b4                                                                                                                       " + "'", str3, "\ud55c\uad6d\uc5b4                                                                                                                       ");
    }

    @Test
    public void test25151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25151");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "ad4ae4af4ag4ai4al4am4an4ao4aq4ar4as4at4au4aw4ax4az4ba4bb4bd4be4bf4bg4bh4bi4bj4bl4bm4bn4bo4bq4br4bs4bt4bv4bw...", "aDAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDED...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test25152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25152");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("                                                                                                                  \\u0068", 720, 'F');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF                                                                                                                  \\u0068FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF" + "'", str3, "FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF                                                                                                                  \\u0068FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF");
    }

    @Test
    public void test25153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25153");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("", "IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII00000000...", 7);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test25154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25154");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("Italia                                                               ", "                                                                             frn\347is(frnce)(CHINESE(CHINA)", 26);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test25155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25155");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("a)AAAAAAAAAAAAAAAAAAAAAAAAAAHIAN\\U0020IHa)AAAAAAAAAAAAAAAAAAAAAAAAAA", "                                                    fran\347ais (France)                                                     ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "a)AAAAAAAAAAAAAAAAAAAAAAAAAAHIAN\\U0020IHa)AAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str2, "a)AAAAAAAAAAAAAAAAAAAAAAAAAAHIAN\\U0020IHa)AAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test25156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25156");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale locale2 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str3 = locale2.getDisplayName();
        java.util.Locale.Builder builder4 = builder1.setLocale(locale2);
        java.util.Locale.Builder builder5 = builder1.clearExtensions();
        java.util.Locale.Builder builder6 = builder1.clearExtensions();
        java.util.Locale.Builder builder8 = builder1.setLanguage("");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder10 = builder8.setLanguage("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444en");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: 444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444en [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "French (Canada)" + "'", str3, "French (Canada)");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test25157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25157");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("ALLEMAND", " ", "iIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIITALIAN_italian_eNGLISHIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII                                             hcsfr-CueD                                                                                          hcsfr-CueD");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ALLEMAND" + "'", str3, "ALLEMAND");
    }

    @Test
    public void test25158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25158");
        java.util.Locale locale2 = new java.util.Locale("HHHHHHHHH         ITALIAN_italian_eNGLISH         ITALIAN_!IHitTAiT_ITALIAN_EgAis", "\u4e2d\u6587                                                                                                  ");
// flaky:         org.junit.Assert.assertEquals(locale2.toString(), "\u4e2d\u6587                                                                                                  ");
    }

    @Test
    public void test25159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25159");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "                                             DE_DE                                             ", (java.lang.CharSequence) "\\u0020iItalian\\u008600u\\");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "                                             DE_DE                                             " + "'", charSequence2, "                                             DE_DE                                             ");
    }

    @Test
    public void test25160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25160");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("tit", 713);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                   tit                                                                                                                                                                                                                                                                                                                                                                   " + "'", str2, "                                                                                                                                                                                                                                                                                                                                                                   tit                                                                                                                                                                                                                                                                                                                                                                   ");
    }

    @Test
    public void test25161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25161");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "GGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGG");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test25162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25162");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC##############\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rFrn", (int) 'N');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test25163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25163");
        java.util.Locale locale3 = new java.util.Locale("................................... (italian,english)", "\\u0035", "ZH_cn");
        org.junit.Assert.assertEquals(locale3.toString(), "................................... (italian,english)_\\U0035_ZH_cn");
    }

    @Test
    public void test25164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25164");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("nglish (united kingdom", 872);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test25165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25165");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "...It...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test25166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25166");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("                                                                                                                                                                    ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test25167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25167");
        java.util.Locale locale2 = java.util.Locale.forLanguageTag("");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.upperCase("", locale2);
        java.util.Locale locale4 = java.util.Locale.ITALIAN;
        java.lang.String str5 = locale4.getDisplayLanguage();
        java.util.Locale locale6 = java.util.Locale.ITALIAN;
        java.lang.String str8 = locale6.getExtension('h');
        java.lang.String str9 = locale4.getDisplayCountry(locale6);
        java.util.Set<java.lang.String> strSet10 = locale6.getUnicodeLocaleKeys();
        java.util.Locale locale12 = java.util.Locale.forLanguageTag("\\u0020");
        java.lang.String str13 = locale12.getDisplayScript();
        java.util.Locale.setDefault(locale12);
        java.lang.String str15 = locale12.getScript();
        java.lang.String str16 = locale6.getDisplayVariant(locale12);
        java.lang.String str17 = locale2.getDisplayCountry(locale6);
        java.lang.String str18 = locale6.getDisplayCountry();
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "it");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Italian" + "'", str5, "Italian");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "it");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test25168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25168");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz\\XTALXAN_ITALIAN_ENGLXSHzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz");
        java.util.Set<java.lang.Character> charSet2 = locale1.getExtensionKeys();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(charSet2);
    }

    @Test
    public void test25169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25169");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r...", "ital");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test25170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25170");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("tttttttfr-c                 ttttttt", 30);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ttfr-c                 ttttttt" + "'", str2, "ttfr-c                 ttttttt");
    }

    @Test
    public void test25171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25171");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("dddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddfranzosisch (frankreich)");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "dddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddfranzosisch(frankreich)" + "'", str1, "dddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddfranzosisch(frankreich)");
    }

    @Test
    public void test25172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25172");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("hi!       dItalienischditalian_ITALIAN_EnglishdHI!dhi!dADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDED...d\\u0034dHI!dItaliand\\u0061d\\u0023dhi!diTALIANdChinese (China)dhi!dzh_CNdiTALIANdendItalienisch", '8', 'T');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!       dItalienischditalian_ITALIAN_EnglishdHI!dhi!dADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDED...d\\u0034dHI!dItaliand\\u0061d\\u0023dhi!diTALIANdChinese (China)dhi!dzh_CNdiTALIANdendItalienisch" + "'", str3, "hi!       dItalienischditalian_ITALIAN_EnglishdHI!dhi!dADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDED...d\\u0034dHI!dItaliand\\u0061d\\u0023dhi!diTALIANdChinese (China)dhi!dzh_CNdiTALIANdendItalienisch");
    }

    @Test
    public void test25173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25173");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale locale2 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str3 = locale2.getDisplayName();
        java.util.Locale.Builder builder4 = builder1.setLocale(locale2);
        java.util.Locale.Builder builder5 = builder4.clear();
        java.util.Locale.Builder builder7 = builder5.setLanguage("ITALIAN");
        java.util.Locale.Builder builder8 = builder7.clear();
        java.util.Locale locale9 = builder7.build();
        java.util.Locale.Builder builder11 = builder7.setLanguageTag("italien");
        java.util.Locale.Builder builder12 = builder11.clearExtensions();
        java.util.Locale.Builder builder13 = builder12.clearExtensions();
        java.util.Locale.Builder builder15 = builder12.removeUnicodeLocaleAttribute("zho");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder17 = builder12.setVariant("GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "French (Canada)" + "'", str3, "French (Canada)");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "");
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
    }

    @Test
    public void test25174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25174");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("\\u0023", "\\u0023");
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "italian_ITALIAN_English");
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "franz\366sisch (frankreich)", (int) 'i', 6);
        java.lang.String[] strArray10 = java.util.Locale.getISOCountries();
        java.lang.String[] strArray12 = org.apache.commons.lang3.StringUtils.stripAll(strArray10, "");
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("\\u0034", strArray3, strArray12);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray12, '5');
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray12, '\r');
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\\u0034" + "'", str13, "\\u0034");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "AD5AE5AF5AG5AI5AL5AM5AN5AO5AQ5AR5AS5AT5AU5AW5AX5AZ5BA5BB5BD5BE5BF5BG5BH5BI5BJ5BL5BM5BN5BO5BQ5BR5BS5BT5BV5BW5BY5BZ5CA5CC5CD5CF5CG5CH5CI5CK5CL5CM5CN5CO5CR5CU5CV5CW5CX5CY5CZ5DE5DJ5DK5DM5DO5DZ5EC5EE5EG5EH5ER5ES5ET5FI5FJ5FK5FM5FO5FR5GA5GB5GD5GE5GF5GG5GH5GI5GL5GM5GN5GP5GQ5GR5GS5GT5GU5GW5GY5HK5HM5HN5HR5HT5HU5ID5IE5IL5IM5IN5IO5IQ5IR5IS5IT5JE5JM5JO5JP5KE5KG5KH5KI5KM5KN5KP5KR5KW5KY5KZ5LA5LB5LC5LI5LK5LR5LS5LT5LU5LV5LY5MA5MC5MD5ME5MF5MG5MH5MK5ML5MM5MN5MO5MP5MQ5MR5MS5MT5MU5MV5MW5MX5MY5MZ5NA5NC5NE5NF5NG5NI5NL5NO5NP5NR5NU5NZ5OM5PA5PE5PF5PG5PH5PK5PL5PM5PN5PR5PS5PT5PW5PY5QA5RE5RO5RS5RU5RW5SA5SB5SC5SD5SE5SG5SH5SI5SJ5SK5SL5SM5SN5SO5SR5SS5ST5SV5SX5SY5SZ5TC5TD5TF5TG5TH5TJ5TK5TL5TM5TN5TO5TR5TT5TV5TW5TZ5UA5UG5UM5US5UY5UZ5VA5VC5VE5VG5VI5VN5VU5WF5WS5YE5YT5ZA5ZM5ZW" + "'", str15, "AD5AE5AF5AG5AI5AL5AM5AN5AO5AQ5AR5AS5AT5AU5AW5AX5AZ5BA5BB5BD5BE5BF5BG5BH5BI5BJ5BL5BM5BN5BO5BQ5BR5BS5BT5BV5BW5BY5BZ5CA5CC5CD5CF5CG5CH5CI5CK5CL5CM5CN5CO5CR5CU5CV5CW5CX5CY5CZ5DE5DJ5DK5DM5DO5DZ5EC5EE5EG5EH5ER5ES5ET5FI5FJ5FK5FM5FO5FR5GA5GB5GD5GE5GF5GG5GH5GI5GL5GM5GN5GP5GQ5GR5GS5GT5GU5GW5GY5HK5HM5HN5HR5HT5HU5ID5IE5IL5IM5IN5IO5IQ5IR5IS5IT5JE5JM5JO5JP5KE5KG5KH5KI5KM5KN5KP5KR5KW5KY5KZ5LA5LB5LC5LI5LK5LR5LS5LT5LU5LV5LY5MA5MC5MD5ME5MF5MG5MH5MK5ML5MM5MN5MO5MP5MQ5MR5MS5MT5MU5MV5MW5MX5MY5MZ5NA5NC5NE5NF5NG5NI5NL5NO5NP5NR5NU5NZ5OM5PA5PE5PF5PG5PH5PK5PL5PM5PN5PR5PS5PT5PW5PY5QA5RE5RO5RS5RU5RW5SA5SB5SC5SD5SE5SG5SH5SI5SJ5SK5SL5SM5SN5SO5SR5SS5ST5SV5SX5SY5SZ5TC5TD5TF5TG5TH5TJ5TK5TL5TM5TN5TO5TR5TT5TV5TW5TZ5UA5UG5UM5US5UY5UZ5VA5VC5VE5VG5VI5VN5VU5WF5WS5YE5YT5ZA5ZM5ZW");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "AD\rAE\rAF\rAG\rAI\rAL\rAM\rAN\rAO\rAQ\rAR\rAS\rAT\rAU\rAW\rAX\rAZ\rBA\rBB\rBD\rBE\rBF\rBG\rBH\rBI\rBJ\rBL\rBM\rBN\rBO\rBQ\rBR\rBS\rBT\rBV\rBW\rBY\rBZ\rCA\rCC\rCD\rCF\rCG\rCH\rCI\rCK\rCL\rCM\rCN\rCO\rCR\rCU\rCV\rCW\rCX\rCY\rCZ\rDE\rDJ\rDK\rDM\rDO\rDZ\rEC\rEE\rEG\rEH\rER\rES\rET\rFI\rFJ\rFK\rFM\rFO\rFR\rGA\rGB\rGD\rGE\rGF\rGG\rGH\rGI\rGL\rGM\rGN\rGP\rGQ\rGR\rGS\rGT\rGU\rGW\rGY\rHK\rHM\rHN\rHR\rHT\rHU\rID\rIE\rIL\rIM\rIN\rIO\rIQ\rIR\rIS\rIT\rJE\rJM\rJO\rJP\rKE\rKG\rKH\rKI\rKM\rKN\rKP\rKR\rKW\rKY\rKZ\rLA\rLB\rLC\rLI\rLK\rLR\rLS\rLT\rLU\rLV\rLY\rMA\rMC\rMD\rME\rMF\rMG\rMH\rMK\rML\rMM\rMN\rMO\rMP\rMQ\rMR\rMS\rMT\rMU\rMV\rMW\rMX\rMY\rMZ\rNA\rNC\rNE\rNF\rNG\rNI\rNL\rNO\rNP\rNR\rNU\rNZ\rOM\rPA\rPE\rPF\rPG\rPH\rPK\rPL\rPM\rPN\rPR\rPS\rPT\rPW\rPY\rQA\rRE\rRO\rRS\rRU\rRW\rSA\rSB\rSC\rSD\rSE\rSG\rSH\rSI\rSJ\rSK\rSL\rSM\rSN\rSO\rSR\rSS\rST\rSV\rSX\rSY\rSZ\rTC\rTD\rTF\rTG\rTH\rTJ\rTK\rTL\rTM\rTN\rTO\rTR\rTT\rTV\rTW\rTZ\rUA\rUG\rUM\rUS\rUY\rUZ\rVA\rVC\rVE\rVG\rVI\rVN\rVU\rWF\rWS\rYE\rYT\rZA\rZM\rZW" + "'", str17, "AD\rAE\rAF\rAG\rAI\rAL\rAM\rAN\rAO\rAQ\rAR\rAS\rAT\rAU\rAW\rAX\rAZ\rBA\rBB\rBD\rBE\rBF\rBG\rBH\rBI\rBJ\rBL\rBM\rBN\rBO\rBQ\rBR\rBS\rBT\rBV\rBW\rBY\rBZ\rCA\rCC\rCD\rCF\rCG\rCH\rCI\rCK\rCL\rCM\rCN\rCO\rCR\rCU\rCV\rCW\rCX\rCY\rCZ\rDE\rDJ\rDK\rDM\rDO\rDZ\rEC\rEE\rEG\rEH\rER\rES\rET\rFI\rFJ\rFK\rFM\rFO\rFR\rGA\rGB\rGD\rGE\rGF\rGG\rGH\rGI\rGL\rGM\rGN\rGP\rGQ\rGR\rGS\rGT\rGU\rGW\rGY\rHK\rHM\rHN\rHR\rHT\rHU\rID\rIE\rIL\rIM\rIN\rIO\rIQ\rIR\rIS\rIT\rJE\rJM\rJO\rJP\rKE\rKG\rKH\rKI\rKM\rKN\rKP\rKR\rKW\rKY\rKZ\rLA\rLB\rLC\rLI\rLK\rLR\rLS\rLT\rLU\rLV\rLY\rMA\rMC\rMD\rME\rMF\rMG\rMH\rMK\rML\rMM\rMN\rMO\rMP\rMQ\rMR\rMS\rMT\rMU\rMV\rMW\rMX\rMY\rMZ\rNA\rNC\rNE\rNF\rNG\rNI\rNL\rNO\rNP\rNR\rNU\rNZ\rOM\rPA\rPE\rPF\rPG\rPH\rPK\rPL\rPM\rPN\rPR\rPS\rPT\rPW\rPY\rQA\rRE\rRO\rRS\rRU\rRW\rSA\rSB\rSC\rSD\rSE\rSG\rSH\rSI\rSJ\rSK\rSL\rSM\rSN\rSO\rSR\rSS\rST\rSV\rSX\rSY\rSZ\rTC\rTD\rTF\rTG\rTH\rTJ\rTK\rTL\rTM\rTN\rTO\rTR\rTT\rTV\rTW\rTZ\rUA\rUG\rUM\rUS\rUY\rUZ\rVA\rVC\rVE\rVG\rVI\rVN\rVU\rWF\rWS\rYE\rYT\rZA\rZM\rZW");
    }

    @Test
    public void test25175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25175");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("fra");
        java.lang.String str2 = locale1.getDisplayLanguage();
        java.util.Set<java.lang.Character> charSet3 = locale1.getExtensionKeys();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "fra");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "fra" + "'", str2, "fra");
        org.junit.Assert.assertNotNull(charSet3);
    }

    @Test
    public void test25176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25176");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("", "\\", 12);
        boolean boolean5 = org.apache.commons.lang3.StringUtils.endsWithAny("", strArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, "hic!");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test25177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25177");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("fr_fr", 241, "                EEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEE                 ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                EEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEE                                 EEEEEEEEEEEEEEEEEfr_fr                EEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEE                                 EEEEEEEEEEEEEEEEE" + "'", str3, "                EEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEE                                 EEEEEEEEEEEEEEEEEfr_fr                EEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEE                                 EEEEEEEEEEEEEEEEE");
    }

    @Test
    public void test25178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25178");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder2 = builder0.clear();
        java.util.Locale.Builder builder4 = builder2.setScript("");
        java.util.Locale.Builder builder5 = builder4.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder7 = builder4.setLanguageTag("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444en");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Invalid subtag: 444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444en [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test25179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25179");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("kkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk)hcierknarF( hcsisoznarFhcsis\366znarF", "ENGLISCH (         italian_italian_english,\\U0061");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "kkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk)hcierknarF( hcsisoznarFhcsis\366znarF" + "'", str2, "kkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk)hcierknarF( hcsisoznarFhcsis\366znarF");
    }

    @Test
    public void test25180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25180");
        java.util.Locale locale0 = java.util.Locale.UK;
        java.util.Locale.Category category1 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale2 = java.util.Locale.getDefault(category1);
        java.util.Locale locale3 = java.util.Locale.GERMAN;
        java.util.Locale locale4 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str5 = locale3.getDisplayName(locale4);
        java.util.Locale.setDefault(category1, locale4);
        java.util.Set<java.lang.String> strSet7 = locale4.getUnicodeLocaleKeys();
        java.lang.String str8 = locale0.getDisplayVariant(locale4);
        java.util.Set<java.lang.String> strSet9 = locale0.getUnicodeLocaleKeys();
        java.lang.String str10 = locale0.getCountry();
        java.lang.String str11 = locale0.getDisplayScript();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_GB");
        org.junit.Assert.assertTrue("'" + category1 + "' != '" + java.util.Locale.Category.FORMAT + "'", category1.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale2);
// flaky:         org.junit.Assert.assertEquals(locale2.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "de");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "allemand" + "'", str5, "allemand");
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "GB" + "'", str10, "GB");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test25181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25181");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat("\\u", 129);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u" + "'", str2, "\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u");
    }

    @Test
    public void test25182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25182");
        java.lang.String[] strArray0 = java.util.Locale.getISOCountries();
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray0);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray0, 'a', (int) 'f', 1);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray0, "F");
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDEDJDKDMDODZECEEEGEHERESETFIFJFKFMFOFRGAGBGDGEGFGGGHGIGLGMGNGPGQGRGSGTGUGWGYHKHMHNHRHTHUIDIEILIMINIOIQIRISITJEJMJOJPKEKGKHKIKMKNKPKRKWKYKZLALBLCLILKLRLSLTLULVLYMAMCMDMEMFMGMHMKMLMMMNMOMPMQMRMSMTMUMVMWMXMYMZNANCNENFNGNINLNONPNRNUNZOMPAPEPFPGPHPKPLPMPNPRPSPTPWPYQARERORSRURWSASBSCSDSESGSHSISJSKSLSMSNSOSRSSSTSVSXSYSZTCTDTFTGTHTJTKTLTMTNTOTRTTTVTWTZUAUGUMUSUYUZVAVCVEVGVIVNVUWFWSYEYTZAZMZW" + "'", str1, "ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDEDJDKDMDODZECEEEGEHERESETFIFJFKFMFOFRGAGBGDGEGFGGGHGIGLGMGNGPGQGRGSGTGUGWGYHKHMHNHRHTHUIDIEILIMINIOIQIRISITJEJMJOJPKEKGKHKIKMKNKPKRKWKYKZLALBLCLILKLRLSLTLULVLYMAMCMDMEMFMGMHMKMLMMMNMOMPMQMRMSMTMUMVMWMXMYMZNANCNENFNGNINLNONPNRNUNZOMPAPEPFPGPHPKPLPMPNPRPSPTPWPYQARERORSRURWSASBSCSDSESGSHSISJSKSLSMSNSOSRSSSTSVSXSYSZTCTDTFTGTHTJTKTLTMTNTOTRTTTVTWTZUAUGUMUSUYUZVAVCVEVGVIVNVUWFWSYEYTZAZMZW");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ADFAEFAFFAGFAIFALFAMFANFAOFAQFARFASFATFAUFAWFAXFAZFBAFBBFBDFBEFBFFBGFBHFBIFBJFBLFBMFBNFBOFBQFBRFBSFBTFBVFBWFBYFBZFCAFCCFCDFCFFCGFCHFCIFCKFCLFCMFCNFCOFCRFCUFCVFCWFCXFCYFCZFDEFDJFDKFDMFDOFDZFECFEEFEGFEHFERFESFETFFIFFJFFKFFMFFOFFRFGAFGBFGDFGEFGFFGGFGHFGIFGLFGMFGNFGPFGQFGRFGSFGTFGUFGWFGYFHKFHMFHNFHRFHTFHUFIDFIEFILFIMFINFIOFIQFIRFISFITFJEFJMFJOFJPFKEFKGFKHFKIFKMFKNFKPFKRFKWFKYFKZFLAFLBFLCFLIFLKFLRFLSFLTFLUFLVFLYFMAFMCFMDFMEFMFFMGFMHFMKFMLFMMFMNFMOFMPFMQFMRFMSFMTFMUFMVFMWFMXFMYFMZFNAFNCFNEFNFFNGFNIFNLFNOFNPFNRFNUFNZFOMFPAFPEFPFFPGFPHFPKFPLFPMFPNFPRFPSFPTFPWFPYFQAFREFROFRSFRUFRWFSAFSBFSCFSDFSEFSGFSHFSIFSJFSKFSLFSMFSNFSOFSRFSSFSTFSVFSXFSYFSZFTCFTDFTFFTGFTHFTJFTKFTLFTMFTNFTOFTRFTTFTVFTWFTZFUAFUGFUMFUSFUYFUZFVAFVCFVEFVGFVIFVNFVUFWFFWSFYEFYTFZAFZMFZW" + "'", str7, "ADFAEFAFFAGFAIFALFAMFANFAOFAQFARFASFATFAUFAWFAXFAZFBAFBBFBDFBEFBFFBGFBHFBIFBJFBLFBMFBNFBOFBQFBRFBSFBTFBVFBWFBYFBZFCAFCCFCDFCFFCGFCHFCIFCKFCLFCMFCNFCOFCRFCUFCVFCWFCXFCYFCZFDEFDJFDKFDMFDOFDZFECFEEFEGFEHFERFESFETFFIFFJFFKFFMFFOFFRFGAFGBFGDFGEFGFFGGFGHFGIFGLFGMFGNFGPFGQFGRFGSFGTFGUFGWFGYFHKFHMFHNFHRFHTFHUFIDFIEFILFIMFINFIOFIQFIRFISFITFJEFJMFJOFJPFKEFKGFKHFKIFKMFKNFKPFKRFKWFKYFKZFLAFLBFLCFLIFLKFLRFLSFLTFLUFLVFLYFMAFMCFMDFMEFMFFMGFMHFMKFMLFMMFMNFMOFMPFMQFMRFMSFMTFMUFMVFMWFMXFMYFMZFNAFNCFNEFNFFNGFNIFNLFNOFNPFNRFNUFNZFOMFPAFPEFPFFPGFPHFPKFPLFPMFPNFPRFPSFPTFPWFPYFQAFREFROFRSFRUFRWFSAFSBFSCFSDFSEFSGFSHFSIFSJFSKFSLFSMFSNFSOFSRFSSFSTFSVFSXFSYFSZFTCFTDFTFFTGFTHFTJFTKFTLFTMFTNFTOFTRFTTFTVFTWFTZFUAFUGFUMFUSFUYFUZFVAFVCFVEFVGFVIFVNFVUFWFFWSFYEFYTFZAFZMFZW");
    }

    @Test
    public void test25183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25183");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxNCHI");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXNCHI" + "'", str1, "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXNCHI");
    }

    @Test
    public void test25184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25184");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("Egsh");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Egsh" + "'", str1, "Egsh");
    }

    @Test
    public void test25185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25185");
        java.util.Locale locale2 = new java.util.Locale("f", "Korean");
        java.util.Set<java.lang.String> strSet3 = locale2.getUnicodeLocaleKeys();
        org.junit.Assert.assertEquals(locale2.toString(), "f_KOREAN");
        org.junit.Assert.assertNotNull(strSet3);
    }

    @Test
    public void test25186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25186");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("                                  !ih                            dalleman                                  !ih                            dalleman                                  !ih                            dalleman                                  !ih                            dalleman                                  !ih                            dalleman                                  !ih                            dalleman                                  !ih                            dalleman                ZH_CNGGGGG", "CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCEnglischCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC", 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test25187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25187");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("9hhhhhhhhhh9hhhhhhhhhh", 136, "aDAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDEDh..");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aDAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMB9hhhhhhhhhh9hhhhhhhhhhaDAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMB" + "'", str3, "aDAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMB9hhhhhhhhhh9hhhhhhhhhhaDAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMB");
    }

    @Test
    public void test25188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25188");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("FRANZ\326SISCH2(FRANKREICH)", "isch#########################################################################################nhi!iiiiiii_\\U0020_Italie");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test25189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25189");
        java.util.Locale locale0 = java.util.Locale.ITALIAN;
        java.lang.String str1 = locale0.getDisplayLanguage();
        java.util.Locale locale2 = java.util.Locale.ITALIAN;
        java.lang.String str4 = locale2.getExtension('h');
        java.lang.String str5 = locale0.getDisplayCountry(locale2);
        java.util.Locale locale8 = new java.util.Locale("\\u0066");
        java.lang.String str10 = locale8.getExtension('i');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.lowerCase("Cinese (Cina)\\u0069h...", locale8);
        java.lang.String str12 = locale8.getScript();
        java.lang.String str13 = locale2.getDisplayName(locale8);
        java.util.Locale locale16 = new java.util.Locale("                                     fran\347ais (France)                                      ", "Chinese (China");
        java.lang.String str17 = locale16.getDisplayVariant();
        java.lang.String str18 = locale8.getDisplayCountry(locale16);
        java.lang.String str19 = locale8.getDisplayName();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it");
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "italiano" + "'", str1, "italiano");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "it");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals(locale8.toString(), "\\u0066");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "cinese (cina)\\u0069h..." + "'", str11, "cinese (cina)\\u0069h...");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Italian" + "'", str13, "Italian");
        org.junit.Assert.assertEquals(locale16.toString(), "                                     fran\347ais (france)                                      _CHINESE (CHINA");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\\u0066" + "'", str19, "\\u0066");
    }

    @Test
    public void test25190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25190");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("iTALIAN                                                                 ", "ZhozhozhozhozhozhozhozhozhozhozhoItaliazhozhozhozhozhozhozhozhozhozhozhoz");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test25191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25191");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("iiiiiiiiiiiFrankreich");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "iiiiiiiiiiiFrankreich" + "'", str1, "iiiiiiiiiiiFrankreich");
    }

    @Test
    public void test25192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25192");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("0034\\U00", (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0" + "'", str2, "0");
    }

    @Test
    public void test25193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25193");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("x-lvariant-CAN", "en_US                ita                ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "x-lvariant-CAN" + "'", str2, "x-lvariant-CAN");
    }

    @Test
    public void test25194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25194");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.setLanguageTag("Italian");
        java.util.Locale.Builder builder4 = builder0.clearExtensions();
        java.util.Locale.Builder builder5 = builder0.clear();
        java.util.Locale locale7 = java.util.Locale.forLanguageTag("\\u0020");
        java.util.Locale.Builder builder8 = builder0.setLocale(locale7);
        java.util.Locale.Builder builder11 = builder0.setExtension('u', "Italian");
        java.util.Locale.Builder builder12 = builder11.clearExtensions();
        java.util.Locale.Builder builder13 = builder12.clearExtensions();
        java.util.Locale.Builder builder14 = builder13.clearExtensions();
        java.util.Locale.Builder builder15 = builder14.clearExtensions();
        java.util.Locale locale16 = builder14.build();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "");
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "");
    }

    @Test
    public void test25195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25195");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("italian_ITALIAN_English", "\\u0069hhhhhhhhhh");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "                                     fran\347ais (France)                                      ");
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray4);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray4);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, "francese");
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray4);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "talian_ITALIAN_English" + "'", str5, "talian_ITALIAN_English");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "talian_ITALIAN_English" + "'", str6, "talian_ITALIAN_English");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "talian_ITALIAN_English" + "'", str8, "talian_ITALIAN_English");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "talian_ITALIAN_English" + "'", str9, "talian_ITALIAN_English");
    }

    @Test
    public void test25196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25196");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("aTWaTZaUAaUGaUMaUSaUYaUZaVAaVCaVEaVGaVIaVNaVUaWFaWSaYEaYTaZAaZMaZW", 14);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aTWaTZaUAaUGaUMaUSaUYaUZaVAaVCaVEaVGaVIaVNaVUaWFaWSaYEaYTaZAaZMaZW" + "'", str2, "aTWaTZaUAaUGaUMaUSaUYaUZaVAaVCaVEaVGaVIaVNaVUaWFaWSaYEaYTaZAaZMaZW");
    }

    @Test
    public void test25197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25197");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("und");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap2 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList3 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList1, strMap2);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap4 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList5 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList1, strMap4);
        java.util.Locale locale6 = java.util.Locale.ITALIAN;
        java.lang.String str7 = locale6.getDisplayLanguage();
        java.util.Locale locale8 = locale6.stripExtensions();
        java.util.Locale locale10 = java.util.Locale.forLanguageTag("\\u0020");
        java.lang.String str11 = locale10.getDisplayScript();
        java.lang.String str12 = locale8.getDisplayCountry(locale10);
        java.util.Set<java.lang.Character> charSet13 = locale8.getExtensionKeys();
        java.util.Set<java.lang.String> strSet14 = locale8.getUnicodeLocaleKeys();
        java.util.Locale.LanguageRange[] languageRangeArray15 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList16 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList16, languageRangeArray15);
        java.util.Locale.LanguageRange[] languageRangeArray18 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList19 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList19, languageRangeArray18);
        java.util.Locale.LanguageRange[] languageRangeArray21 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList22 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList22, languageRangeArray21);
        java.lang.String[] strArray26 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList27 = new java.util.ArrayList<java.lang.String>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList27, strArray26);
        java.util.Locale.FilteringMode filteringMode29 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList30 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList22, (java.util.Collection<java.lang.String>) strList27, filteringMode29);
        java.util.Locale.FilteringMode filteringMode31 = java.util.Locale.FilteringMode.AUTOSELECT_FILTERING;
        java.util.List<java.lang.String> strList32 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList19, (java.util.Collection<java.lang.String>) strList27, filteringMode31);
        java.util.Locale.LanguageRange[] languageRangeArray33 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList34 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList34, languageRangeArray33);
        java.lang.String[] strArray38 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList39 = new java.util.ArrayList<java.lang.String>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList39, strArray38);
        java.util.Locale.FilteringMode filteringMode41 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList42 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList34, (java.util.Collection<java.lang.String>) strList39, filteringMode41);
        java.lang.String[] strArray62 = new java.lang.String[] { "hi!       ", "Italienisch", "italian_ITALIAN_English", "HI!", "hi!", "ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDED...", "\\u0034", "HI!", "Italian", "\\u0061", "\\u0023", "hi!", "iTALIAN", "Chinese (China)", "hi!", "zh_CN", "iTALIAN", "en", "Italienisch" };
        java.util.ArrayList<java.lang.String> strList63 = new java.util.ArrayList<java.lang.String>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList63, strArray62);
        java.util.Locale.LanguageRange[] languageRangeArray65 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList66 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList66, languageRangeArray65);
        java.lang.String[] strArray70 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList71 = new java.util.ArrayList<java.lang.String>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList71, strArray70);
        java.util.Locale.FilteringMode filteringMode73 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList74 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList66, (java.util.Collection<java.lang.String>) strList71, filteringMode73);
        java.util.List<java.lang.String> strList75 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList34, (java.util.Collection<java.lang.String>) strList63, filteringMode73);
        java.util.List<java.lang.String> strList76 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList19, (java.util.Collection<java.lang.String>) strList63);
        java.util.Locale.FilteringMode filteringMode77 = java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList78 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList16, (java.util.Collection<java.lang.String>) strList63, filteringMode77);
        java.util.List<java.lang.String> strList79 = java.util.Locale.filterTags(languageRangeList5, (java.util.Collection<java.lang.String>) strSet14, filteringMode77);
        java.lang.String str81 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.lang.String>) strList79, "a)AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAdZH_cnFrench (Cana");
        org.junit.Assert.assertNotNull(languageRangeList1);
        org.junit.Assert.assertNotNull(languageRangeList3);
        org.junit.Assert.assertNotNull(languageRangeList5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "it");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "italiano" + "'", str7, "italiano");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "it");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(charSet13);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNotNull(languageRangeArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(languageRangeArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(languageRangeArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + filteringMode29 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode29.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList30);
        org.junit.Assert.assertTrue("'" + filteringMode31 + "' != '" + java.util.Locale.FilteringMode.AUTOSELECT_FILTERING + "'", filteringMode31.equals(java.util.Locale.FilteringMode.AUTOSELECT_FILTERING));
        org.junit.Assert.assertNotNull(strList32);
        org.junit.Assert.assertNotNull(languageRangeArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + filteringMode41 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode41.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList42);
        org.junit.Assert.assertNotNull(strArray62);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(languageRangeArray65);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(strArray70);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertTrue("'" + filteringMode73 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode73.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList74);
        org.junit.Assert.assertNotNull(strList75);
        org.junit.Assert.assertNotNull(strList76);
        org.junit.Assert.assertTrue("'" + filteringMode77 + "' != '" + java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES + "'", filteringMode77.equals(java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList78);
        org.junit.Assert.assertNotNull(strList79);
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "" + "'", str81, "");
    }

    @Test
    public void test25198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25198");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("italy");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap2 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList3 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList1, strMap2);
        java.util.Locale.LanguageRange[] languageRangeArray4 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList5 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList5, languageRangeArray4);
        java.lang.String[] strArray9 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList10 = new java.util.ArrayList<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList10, strArray9);
        java.util.Locale.FilteringMode filteringMode12 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList13 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList5, (java.util.Collection<java.lang.String>) strList10, filteringMode12);
        java.util.Locale.LanguageRange[] languageRangeArray14 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList15 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList15, languageRangeArray14);
        java.lang.String[] strArray19 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList20 = new java.util.ArrayList<java.lang.String>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList20, strArray19);
        java.util.Locale.FilteringMode filteringMode22 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList23 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList15, (java.util.Collection<java.lang.String>) strList20, filteringMode22);
        java.lang.String[] strArray25 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList26 = new java.util.ArrayList<java.lang.String>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList26, strArray25);
        java.util.List<java.lang.String> strList28 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList15, (java.util.Collection<java.lang.String>) strList26);
        java.lang.String str29 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList5, (java.util.Collection<java.lang.String>) strList26);
        java.util.Locale locale30 = java.util.Locale.CANADA_FRENCH;
        java.util.Set<java.lang.String> strSet31 = locale30.getUnicodeLocaleKeys();
        java.lang.String str32 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList5, (java.util.Collection<java.lang.String>) strSet31);
        java.util.Locale.LanguageRange[] languageRangeArray33 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList34 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList34, languageRangeArray33);
        java.lang.String[] strArray38 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList39 = new java.util.ArrayList<java.lang.String>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList39, strArray38);
        java.util.Locale.FilteringMode filteringMode41 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList42 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList34, (java.util.Collection<java.lang.String>) strList39, filteringMode41);
        java.util.Locale.LanguageRange[] languageRangeArray43 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList44 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList44, languageRangeArray43);
        java.lang.String[] strArray48 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList49 = new java.util.ArrayList<java.lang.String>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList49, strArray48);
        java.util.Locale.FilteringMode filteringMode51 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList52 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList44, (java.util.Collection<java.lang.String>) strList49, filteringMode51);
        java.lang.String[] strArray54 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList55 = new java.util.ArrayList<java.lang.String>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList55, strArray54);
        java.util.List<java.lang.String> strList57 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList44, (java.util.Collection<java.lang.String>) strList55);
        java.lang.String str58 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList34, (java.util.Collection<java.lang.String>) strList55);
        java.util.Locale locale59 = java.util.Locale.ITALIAN;
        java.util.Set<java.lang.Character> charSet60 = locale59.getExtensionKeys();
        java.util.Locale locale62 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale locale64 = new java.util.Locale("");
        java.util.Locale locale65 = java.util.Locale.FRANCE;
        java.util.Locale locale66 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str67 = locale65.getDisplayScript(locale66);
        java.util.Locale locale68 = java.util.Locale.ENGLISH;
        java.lang.String str69 = locale68.getDisplayCountry();
        java.util.Locale locale70 = java.util.Locale.PRC;
        java.util.Locale locale71 = java.util.Locale.US;
        java.util.Locale locale72 = java.util.Locale.FRANCE;
        java.util.Locale locale73 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str74 = locale72.getDisplayScript(locale73);
        java.util.Locale locale75 = java.util.Locale.ITALIAN;
        java.util.Set<java.lang.Character> charSet76 = locale75.getExtensionKeys();
        java.util.Locale locale77 = java.util.Locale.ITALIAN;
        java.lang.String str78 = locale77.getDisplayLanguage();
        java.util.Locale locale79 = java.util.Locale.FRENCH;
        java.util.Locale locale80 = java.util.Locale.US;
        java.util.Locale locale81 = java.util.Locale.ITALIAN;
        java.lang.String str82 = locale81.getDisplayLanguage();
        java.util.Locale locale83 = java.util.Locale.FRANCE;
        java.util.Locale[] localeArray84 = new java.util.Locale[] { locale59, locale62, locale64, locale65, locale68, locale70, locale71, locale73, locale75, locale77, locale79, locale80, locale81, locale83 };
        java.util.ArrayList<java.util.Locale> localeList85 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean86 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList85, localeArray84);
        java.util.Locale locale87 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList34, (java.util.Collection<java.util.Locale>) localeList85);
        java.util.List<java.util.Locale> localeList88 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList5, (java.util.Collection<java.util.Locale>) localeList85);
        java.util.Locale locale89 = java.util.Locale.lookup(languageRangeList1, (java.util.Collection<java.util.Locale>) localeList88);
        org.junit.Assert.assertNotNull(languageRangeList1);
        org.junit.Assert.assertNotNull(languageRangeList3);
        org.junit.Assert.assertNotNull(languageRangeArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + filteringMode12 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode12.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNotNull(languageRangeArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + filteringMode22 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode22.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList23);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(strList28);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "fr_CA");
        org.junit.Assert.assertNotNull(strSet31);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNotNull(languageRangeArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + filteringMode41 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode41.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList42);
        org.junit.Assert.assertNotNull(languageRangeArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + filteringMode51 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode51.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList52);
        org.junit.Assert.assertNotNull(strArray54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(strList57);
        org.junit.Assert.assertNull(str58);
        org.junit.Assert.assertNotNull(locale59);
        org.junit.Assert.assertEquals(locale59.toString(), "it");
        org.junit.Assert.assertNotNull(charSet60);
        org.junit.Assert.assertNotNull(locale62);
        org.junit.Assert.assertEquals(locale62.toString(), "");
        org.junit.Assert.assertEquals(locale64.toString(), "");
        org.junit.Assert.assertNotNull(locale65);
        org.junit.Assert.assertEquals(locale65.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale66);
        org.junit.Assert.assertEquals(locale66.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "" + "'", str67, "");
        org.junit.Assert.assertNotNull(locale68);
        org.junit.Assert.assertEquals(locale68.toString(), "en");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "" + "'", str69, "");
        org.junit.Assert.assertNotNull(locale70);
        org.junit.Assert.assertEquals(locale70.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale71);
        org.junit.Assert.assertEquals(locale71.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale72);
        org.junit.Assert.assertEquals(locale72.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale73);
        org.junit.Assert.assertEquals(locale73.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "" + "'", str74, "");
        org.junit.Assert.assertNotNull(locale75);
        org.junit.Assert.assertEquals(locale75.toString(), "it");
        org.junit.Assert.assertNotNull(charSet76);
        org.junit.Assert.assertNotNull(locale77);
        org.junit.Assert.assertEquals(locale77.toString(), "it");
// flaky:         org.junit.Assert.assertEquals("'" + str78 + "' != '" + "italiano" + "'", str78, "italiano");
        org.junit.Assert.assertNotNull(locale79);
        org.junit.Assert.assertEquals(locale79.toString(), "fr");
        org.junit.Assert.assertNotNull(locale80);
        org.junit.Assert.assertEquals(locale80.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale81);
        org.junit.Assert.assertEquals(locale81.toString(), "it");
// flaky:         org.junit.Assert.assertEquals("'" + str82 + "' != '" + "italiano" + "'", str82, "italiano");
        org.junit.Assert.assertNotNull(locale83);
        org.junit.Assert.assertEquals(locale83.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(localeArray84);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + true + "'", boolean86 == true);
        org.junit.Assert.assertNull(locale87);
        org.junit.Assert.assertNotNull(localeList88);
        org.junit.Assert.assertNull(locale89);
    }

    @Test
    public void test25199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25199");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("2iT hi!       _\\U0020_Italienisch####################################################################            2i", 102, 33);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test25200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25200");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("okokok", "inglesehhhhhhhhHITTAIT_ITALIAN_EGAISH          ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "okokok" + "'", str2, "okokok");
    }

    @Test
    public void test25201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25201");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("                   deutsch                    ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test25202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25202");
        char[] charArray12 = new char[] { '4', '#', '#', 'a', ' ', 'a' };
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray12);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "         ITALIAN_italian_eNGLISH", charArray12);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "de", charArray12);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "...It...", charArray12);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "\\\\\\\\\\\\\\\\\\\\\\\\kkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkDEkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk\\\\\\\\\\\\\\\\\\\\\\\\", charArray12);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "444444444it", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "4##a a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "4##a a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[4, #, #, a,  , a]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test25203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25203");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("xxxxxxxxxxxxxxxxxxx                             ...titxxxxxxxxxxxxxxxxxx                             ...", 'R');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test25204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25204");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "\ud504\ub791\uc2a4HI!(\\U0020,ITALIENISCH#########################################################################################)");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test25205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25205");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "hzhzhzhzhzhzh");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test25206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25206");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaFranz\366sisch (Kanada)", "\\italian_ITALIAN_English");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDEDJDKDMDODZECEEEGEHERESETFIFJFKFMFOFRGAGBGDGEGFGGGHGIGLGMGNGPGQGRGSGTGUGWGYHKHMHNHRHTHUIDIEILIMINIOIQIRISITJEJMJOJPKEKGKHKIKMKNKPKRKWKYKZLALBLCLILKLRLSLTLULVLYMAMCMDMEMFMGMHMKMLMMMNMOMPMQMRMSMTMUMVMWMXMYMZNANCNENFNGNINLNONPNRNUNZOMPAPEPFPGPHPKPLPMPNPRPSPTPWPYQARERORSRURWSASBSCSDSESGSHSISJSKSLSMSNSOSRSSSTSVSXSYSZTCTDTFTGTHTJTKTLTMTNTOTRTTTVTWTZUAUGUMUSUYUZVAVCVEVGVIVNVUWFWSYEYTZAZMZW", "\\U0020");
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.replaceEach("U0020ITALIANITALIANITALIANITALI", strArray3, strArray6);
        int int8 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray6);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "U0020ITALIANITALIANITALIANITALI" + "'", str7, "U0020ITALIANITALIANITALIANITALI");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test25207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25207");
        java.util.Locale.Builder builder1 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder1.clearExtensions();
        java.util.Locale locale3 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str4 = locale3.getDisplayName();
        java.util.Locale.Builder builder5 = builder2.setLocale(locale3);
        java.util.Locale.Builder builder7 = builder2.setLanguage("und");
        java.util.Locale locale8 = builder7.build();
        java.util.Locale locale9 = builder7.build();
        java.util.Locale locale10 = builder7.build();
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.upperCase("Korean (South Korea)", locale10);
        java.lang.String str12 = locale10.getVariant();
        java.util.Locale.LanguageRange[] languageRangeArray13 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList14 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList14, languageRangeArray13);
        java.lang.String[] strArray18 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList19 = new java.util.ArrayList<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList19, strArray18);
        java.util.Locale.FilteringMode filteringMode21 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList22 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList14, (java.util.Collection<java.lang.String>) strList19, filteringMode21);
        java.util.Locale.LanguageRange[] languageRangeArray23 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList24 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList24, languageRangeArray23);
        java.lang.String[] strArray28 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList29 = new java.util.ArrayList<java.lang.String>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList29, strArray28);
        java.util.Locale.FilteringMode filteringMode31 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList32 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList24, (java.util.Collection<java.lang.String>) strList29, filteringMode31);
        java.lang.String[] strArray34 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList35 = new java.util.ArrayList<java.lang.String>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList35, strArray34);
        java.util.List<java.lang.String> strList37 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList24, (java.util.Collection<java.lang.String>) strList35);
        java.lang.String str38 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList14, (java.util.Collection<java.lang.String>) strList35);
        java.util.Locale.LanguageRange[] languageRangeArray39 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList40 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList40, languageRangeArray39);
        java.lang.String[] strArray44 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList45 = new java.util.ArrayList<java.lang.String>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList45, strArray44);
        java.util.Locale.FilteringMode filteringMode47 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList48 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList40, (java.util.Collection<java.lang.String>) strList45, filteringMode47);
        java.lang.String[] strArray50 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList51 = new java.util.ArrayList<java.lang.String>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList51, strArray50);
        java.util.List<java.lang.String> strList53 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList40, (java.util.Collection<java.lang.String>) strList51);
        java.lang.String str54 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList14, (java.util.Collection<java.lang.String>) strList51);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap55 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList56 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList14, strMap55);
        boolean boolean57 = locale10.equals((java.lang.Object) languageRangeList14);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "fr_CA");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "francese (Canada)" + "'", str4, "francese (Canada)");
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "und_CA");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "und_CA");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "und_CA");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "KOREAN (SOUTH KOREA)" + "'", str11, "KOREAN (SOUTH KOREA)");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(languageRangeArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + filteringMode21 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode21.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList22);
        org.junit.Assert.assertNotNull(languageRangeArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + filteringMode31 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode31.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList32);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(strList37);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertNotNull(languageRangeArray39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + filteringMode47 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode47.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList48);
        org.junit.Assert.assertNotNull(strArray50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(strList53);
        org.junit.Assert.assertNull(str54);
        org.junit.Assert.assertNotNull(languageRangeList56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
    }

    @Test
    public void test25208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25208");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("\\u0020iIalian\\u008600u\\U\\u0020iIalian\\u0020iUanglaisUFRZ\326CZ(FRKREC)Uialian    U                                                                                                      U!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IUzhzhzhzhzhzhzhzhzhzhFRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhAzhzhzhzhzhzhzhzhzhzhUFRZ\326CZ(FRKREC)Ucinese (Cina)\\u0069hhhhhhhhhh\\u0069hhhhhhhhhh\\u0069hhhhhhhhhh\\u0069hhU         ITALIAN_ITALIAN_ENGLISH         ITALIAN_!IHITTAIT_ITALIAN_EGAISHU                                      ...", "iiiiiiiiiiiFrankreichNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN", "                                             xx_xx                                              ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\u0020iIalian\\u008600u\\U\\u0020iIalian\\u0020iUanglaisUFRZ\326CZ(FRKREC)Uialian    U                                                                                                      U!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IUzhzhzhzhzhzhzhzhzhzhFRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhAzhzhzhzhzhzhzhzhzhzhUFRZ\326CZ(FRKREC)Ucinese (Cina)\\u0069hhhhhhhhhh\\u0069hhhhhhhhhh\\u0069hhhhhhhhhh\\u0069hhU         ITALIAN_ITALIAN_ENGLISH         ITALIAN_!IHITTAIT_ITALIAN_EGAISHU                                      ..." + "'", str3, "\\u0020iIalian\\u008600u\\U\\u0020iIalian\\u0020iUanglaisUFRZ\326CZ(FRKREC)Uialian    U                                                                                                      U!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IUzhzhzhzhzhzhzhzhzhzhFRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhAzhzhzhzhzhzhzhzhzhzhUFRZ\326CZ(FRKREC)Ucinese (Cina)\\u0069hhhhhhhhhh\\u0069hhhhhhhhhh\\u0069hhhhhhhhhh\\u0069hhU         ITALIAN_ITALIAN_ENGLISH         ITALIAN_!IHITTAIT_ITALIAN_EGAISHU                                      ...");
    }

    @Test
    public void test25209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25209");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNEnglisch (Vereinigtes K\366nigreich)Englisch (Vereinigtes K\366nigreich)Englisch (Vereinigtes K\366nigreich)Englisch (Vereinig");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test25210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25210");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder2 = builder0.clear();
        java.util.Locale.Builder builder3 = builder2.clear();
        java.util.Locale.Builder builder4 = builder2.clearExtensions();
        java.util.Locale.Builder builder7 = builder4.setExtension('h', "italian");
        java.util.Locale locale9 = new java.util.Locale("en");
        boolean boolean10 = locale9.hasExtensions();
        java.util.Set<java.lang.String> strSet11 = locale9.getUnicodeLocaleKeys();
        boolean boolean12 = locale9.hasExtensions();
        java.lang.String str13 = locale9.getCountry();
        java.lang.String str14 = locale9.getDisplayLanguage();
        java.util.Locale.Builder builder15 = builder7.setLocale(locale9);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder17 = builder15.setLanguage("\u30c9\u30a4\u30c4\u8a9e");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: ????? [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertEquals(locale9.toString(), "en");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "inglese" + "'", str14, "inglese");
        org.junit.Assert.assertNotNull(builder15);
    }

    @Test
    public void test25211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25211");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("FR_frGGGGG", (int) 'u');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                           FR_frGGGGG" + "'", str2, "                                                                                                           FR_frGGGGG");
    }

    @Test
    public void test25212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25212");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("English(UnitedKingdom)", "8600u\\                                 hsiAgE_NAILATI_TiATti                                        ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test25213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25213");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("DACFACGACHACIACKACLAC");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test25214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25214");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("Cina", 328, 'x');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxCinaxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx" + "'", str3, "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxCinaxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
    }

    @Test
    public void test25215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25215");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("it                    (\\U0034\\U00                                             HCSTUED                                             \\U0034\\U00,cinese (Cina)\\u0069hhhhhhhhhh\\u0069hhhhhhhhhh\\u0069hhhhhhhhhh\\u0069hh)", "HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!", 41);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test25216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25216");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("onailati", "FR...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "onailati" + "'", str2, "onailati");
    }

    @Test
    public void test25217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25217");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "...hbi...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test25218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25218");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiifrancese (Francia)", 40);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiifrancese (Francia)" + "'", str2, "iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiifrancese (Francia)");
    }

    @Test
    public void test25219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25219");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("neilatI    E");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test25220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25220");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("Chinois (chine)");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test25221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25221");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaauuuuuuuuuuuuuuuuu\\u0066", "\\z\\z\\z\\z\\z\\z\\z\\z\\z\\zA\\zSA\\zRA\\zQA\\zOA\\zNA");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test25222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25222");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d  \\\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test25223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25223");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('4', 5);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void test25224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25224");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("deutschdeutschdeutschdeutschdeutschdeutschdeutschdeutschdeutschdeu\\u0061");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "deutschdeutschdeutschdeutschdeutschdeutschdeutschdeutschdeutschdeu\\u0061" + "'", str1, "deutschdeutschdeutschdeutschdeutschdeutschdeutschdeutschdeutschdeu\\u0061");
    }

    @Test
    public void test25225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25225");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "...ALzhAMzhANzhAOzhAQzhARzhASzhA");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test25226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25226");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("Hhhhhhhhh", "gggggggggggggggggggggg \\U0066  gggggggggggggggggggggg");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test25227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25227");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("0034\\u00", "u00\\u0034\\u00                                             hcstud                                             \\u0034");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test25228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25228");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale1 = java.util.Locale.getDefault(category0);
        java.util.Locale locale2 = java.util.Locale.GERMAN;
        java.util.Locale locale3 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str4 = locale2.getDisplayName(locale3);
        java.util.Locale.setDefault(category0, locale3);
        java.util.Locale.Category category6 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale7 = java.util.Locale.getDefault(category6);
        java.lang.String str9 = locale7.getExtension('x');
        java.util.Locale.setDefault(category0, locale7);
        java.util.Locale locale11 = java.util.Locale.getDefault(category0);
        java.util.Locale locale12 = java.util.Locale.getDefault(category0);
        java.util.Locale locale13 = java.util.Locale.getDefault(category0);
        java.util.Set<java.lang.String> strSet14 = locale13.getUnicodeLocaleKeys();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "fr_CA");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "de");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "allemand" + "'", str4, "allemand");
        org.junit.Assert.assertTrue("'" + category6 + "' != '" + java.util.Locale.Category.FORMAT + "'", category6.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "fr_CA");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "fr_CA");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "fr_CA");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "fr_CA");
        org.junit.Assert.assertNotNull(strSet14);
    }

    @Test
    public void test25229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25229");
        java.util.Locale locale0 = java.util.Locale.ITALIAN;
        java.lang.String str1 = locale0.getDisplayLanguage();
        java.util.Locale locale2 = locale0.stripExtensions();
        java.lang.String str3 = locale0.getLanguage();
        java.lang.String str4 = locale0.getISO3Language();
        java.util.Locale.Builder builder6 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder7 = builder6.clearExtensions();
        java.util.Locale locale8 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str9 = locale8.getDisplayName();
        java.util.Locale.Builder builder10 = builder7.setLocale(locale8);
        java.util.Locale.Builder builder11 = builder10.clear();
        java.util.Locale.Builder builder13 = builder11.setLanguage("ITALIAN");
        java.util.Locale locale14 = builder11.build();
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.upperCase("hi!", locale14);
        java.lang.String str16 = locale0.getDisplayScript(locale14);
        java.util.Set<java.lang.String> strSet17 = locale14.getUnicodeLocaleAttributes();
        java.lang.String str18 = locale14.getCountry();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it");
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "italiano" + "'", str1, "italiano");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "it");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "it" + "'", str3, "it");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ita" + "'", str4, "ita");
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "fr_CA");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "francese (Canada)" + "'", str9, "francese (Canada)");
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "italian");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "HI!" + "'", str15, "HI!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test25230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25230");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("talian_ITALIAN_English");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "talian_ITALIAN_English" + "'", str2, "talian_ITALIAN_English");
    }

    @Test
    public void test25231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25231");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.setLanguageTag("Italian");
        java.util.Locale.Builder builder4 = builder0.clearExtensions();
        java.util.Locale.Builder builder5 = builder0.clear();
        java.util.Locale locale7 = java.util.Locale.forLanguageTag("\\u0020");
        java.util.Locale.Builder builder8 = builder0.setLocale(locale7);
        java.util.Locale.Builder builder10 = builder0.removeUnicodeLocaleAttribute("CAN");
        java.util.Locale.Builder builder11 = builder0.clear();
        java.util.Locale.Builder builder13 = builder0.setLanguageTag("eNGLISH");
        java.util.Locale.Builder builder14 = builder13.clearExtensions();
        java.util.Locale.Builder builder15 = builder14.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder18 = builder15.setUnicodeLocaleKeyword("tTAT_ITA", "dallemandallemandallemandallemandallemandallemandallemandallennnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: tTAT_ITA [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "");
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder15);
    }

    @Test
    public void test25232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25232");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("nailati", strMap1);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap3 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList4 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList2, strMap3);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap5 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList6 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList2, strMap5);
        java.util.Locale locale7 = java.util.Locale.US;
        java.lang.String str8 = locale7.getScript();
        java.util.Set<java.lang.String> strSet9 = locale7.getUnicodeLocaleAttributes();
        java.util.List<java.lang.String> strList10 = java.util.Locale.filterTags(languageRangeList6, (java.util.Collection<java.lang.String>) strSet9);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.lang.String>) strSet9, 'a');
        org.junit.Assert.assertNotNull(languageRangeList2);
        org.junit.Assert.assertNotNull(languageRangeList4);
        org.junit.Assert.assertNotNull(languageRangeList6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test25233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25233");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("...!       \\u0034\\u0034\\u0034\\u0034\\u0034\\u0034\\u0034\\u0034\\u0034\\", "en-G\\u0038zho                         CHD");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test25234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25234");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("FRA\326SIS\n(FRAKREI)", "C", 113);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test25235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25235");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("                                      )HSILGNE,NAILATI( ", "hsiAgE_NAILATI_TiATtiHI!_NAILATI         HSILGNe_nailati_NAILATI         HHHHHHHHH");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test25236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25236");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("                                                         \\u005c         ", '\r');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                         \\u005c         " + "'", str2, "                                                         \\u005c         ");
    }

    @Test
    public void test25237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25237");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("FrancGahhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh", "nglisch                                                                                                                                                                                                                                                               ", ")HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Fra)HGaHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH" + "'", str3, "Fra)HGaHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH");
    }

    @Test
    public void test25238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25238");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("English", "Italian");
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("hi!", "", (int) (short) 10);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("", strArray4, strArray8);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray4);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.startsWithAny("nglisch", strArray4);
        java.lang.String[] strArray13 = org.apache.commons.lang3.StringUtils.stripAll(strArray4, "Eagaash                                                                                                                                                                                                                                                                                                                                                                                                    ");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(strArray13);
    }

    @Test
    public void test25239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25239");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale2 = new java.util.Locale("\\u005c");
        java.util.Locale locale4 = java.util.Locale.CHINESE;
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.lowerCase("Franz\366sisch (Frankreich)", locale4);
        java.lang.String str6 = locale4.getVariant();
        java.lang.String str7 = locale2.getDisplayScript(locale4);
        java.util.Locale.setDefault(locale2);
        java.util.Locale.setDefault(category0, locale2);
        java.util.Locale locale11 = java.util.Locale.FRANCE;
        java.util.Locale locale12 = java.util.Locale.ITALIAN;
        java.lang.String str14 = locale12.getExtension('h');
        java.lang.String str15 = locale11.getDisplayScript(locale12);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.lowerCase("HI!       ", locale11);
        java.lang.String str18 = locale11.getExtension('z');
        java.util.Locale.setDefault(category0, locale11);
        java.util.Locale locale20 = java.util.Locale.ITALIAN;
        java.lang.String str21 = locale20.getDisplayLanguage();
        java.util.Locale locale22 = java.util.Locale.ITALIAN;
        java.lang.String str24 = locale22.getExtension('h');
        java.lang.String str25 = locale20.getDisplayCountry(locale22);
        java.util.Set<java.lang.String> strSet26 = locale22.getUnicodeLocaleKeys();
        java.util.Locale.setDefault(category0, locale22);
        java.util.Locale.Builder builder28 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder29 = builder28.clearExtensions();
        java.util.Locale locale30 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str31 = locale30.getDisplayName();
        java.util.Locale.Builder builder32 = builder29.setLocale(locale30);
        java.util.Locale.Builder builder33 = builder32.clear();
        java.util.Locale.Builder builder35 = builder33.setLanguage("ITALIAN");
        java.util.Locale.Builder builder36 = builder33.clearExtensions();
        java.util.Locale locale37 = builder36.build();
        java.util.Locale locale38 = java.util.Locale.PRC;
        java.lang.String str39 = locale38.getDisplayName();
        java.util.Locale.Builder builder40 = builder36.setLocale(locale38);
        java.util.Locale.Builder builder41 = builder36.clear();
        java.util.Locale locale42 = builder36.build();
        java.util.Locale.setDefault(category0, locale42);
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertEquals(locale2.toString(), "\\u005c");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "franz\366sisch (frankreich)" + "'", str5, "franz\366sisch (frankreich)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "it");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!       " + "'", str16, "hi!       ");
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "it");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Italian" + "'", str21, "Italian");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "it");
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(strSet26);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "French (Canada)" + "'", str31, "French (Canada)");
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNotNull(locale37);
        org.junit.Assert.assertEquals(locale37.toString(), "italian");
        org.junit.Assert.assertNotNull(locale38);
        org.junit.Assert.assertEquals(locale38.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "Chinese (China)" + "'", str39, "Chinese (China)");
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertNotNull(locale42);
        org.junit.Assert.assertEquals(locale42.toString(), "");
    }

    @Test
    public void test25240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25240");
        java.util.Locale locale0 = java.util.Locale.ITALIAN;
        java.lang.String str1 = locale0.getDisplayLanguage();
        java.util.Locale locale2 = locale0.stripExtensions();
        java.lang.String str3 = locale0.getLanguage();
        java.lang.String str4 = locale0.getISO3Language();
        boolean boolean5 = locale0.hasExtensions();
        java.lang.Class<?> wildcardClass6 = locale0.getClass();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Italian" + "'", str1, "Italian");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "it");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "it" + "'", str3, "it");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ita" + "'", str4, "ita");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test25241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25241");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("F", strMap1);
        java.util.Locale.LanguageRange languageRange4 = new java.util.Locale.LanguageRange("deutsch");
        java.util.Locale.LanguageRange languageRange6 = new java.util.Locale.LanguageRange("E");
        java.lang.String str7 = languageRange6.getRange();
        java.util.Locale.LanguageRange[] languageRangeArray8 = new java.util.Locale.LanguageRange[] { languageRange4, languageRange6 };
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList9 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList9, languageRangeArray8);
        java.util.Locale locale11 = java.util.Locale.ITALIAN;
        java.lang.String str12 = locale11.getDisplayLanguage();
        java.util.Locale locale13 = locale11.stripExtensions();
        java.lang.String str14 = locale11.getLanguage();
        java.util.Set<java.lang.String> strSet15 = locale11.getUnicodeLocaleKeys();
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.lang.String>) strSet15, "\\u0020iTALIANiTALIANiTALIANiTALI\\u0020iTALIANiTALIANiTALIANiTAL");
        java.util.Locale.FilteringMode filteringMode18 = java.util.Locale.FilteringMode.EXTENDED_FILTERING;
        java.util.List<java.lang.String> strList19 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList9, (java.util.Collection<java.lang.String>) strSet15, filteringMode18);
        java.util.List<java.util.Locale.LanguageRange> languageRangeList21 = java.util.Locale.LanguageRange.parse("fr");
        java.util.Locale.LanguageRange[] languageRangeArray22 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList23 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList23, languageRangeArray22);
        java.util.Locale.LanguageRange[] languageRangeArray25 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList26 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList26, languageRangeArray25);
        java.lang.String[] strArray30 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList31 = new java.util.ArrayList<java.lang.String>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList31, strArray30);
        java.util.Locale.FilteringMode filteringMode33 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList34 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList26, (java.util.Collection<java.lang.String>) strList31, filteringMode33);
        java.util.Locale.FilteringMode filteringMode35 = java.util.Locale.FilteringMode.AUTOSELECT_FILTERING;
        java.util.List<java.lang.String> strList36 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList23, (java.util.Collection<java.lang.String>) strList31, filteringMode35);
        java.util.Locale.FilteringMode filteringMode37 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList38 = java.util.Locale.filterTags(languageRangeList21, (java.util.Collection<java.lang.String>) strList31, filteringMode37);
        java.util.List<java.lang.String> strList39 = java.util.Locale.filterTags(languageRangeList2, (java.util.Collection<java.lang.String>) strList19, filteringMode37);
        java.util.Locale locale40 = java.util.Locale.getDefault();
        java.util.Set<java.lang.Character> charSet41 = locale40.getExtensionKeys();
        java.util.Set<java.lang.String> strSet42 = locale40.getUnicodeLocaleKeys();
        java.util.List<java.lang.String> strList43 = java.util.Locale.filterTags(languageRangeList2, (java.util.Collection<java.lang.String>) strSet42);
        java.util.Locale locale45 = new java.util.Locale("");
        java.util.Locale.setDefault(locale45);
        java.util.Set<java.lang.Character> charSet47 = locale45.getExtensionKeys();
        java.util.Locale locale49 = new java.util.Locale("TA...");
        java.lang.String str50 = locale45.getDisplayCountry(locale49);
        java.lang.String str51 = locale45.getDisplayLanguage();
        java.util.Set<java.lang.String> strSet52 = locale45.getUnicodeLocaleKeys();
        java.util.List<java.lang.String> strList53 = java.util.Locale.filterTags(languageRangeList2, (java.util.Collection<java.lang.String>) strSet52);
        org.junit.Assert.assertNotNull(languageRangeList2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "e" + "'", str7, "e");
        org.junit.Assert.assertNotNull(languageRangeArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "it");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Italian" + "'", str12, "Italian");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "it");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "it" + "'", str14, "it");
        org.junit.Assert.assertNotNull(strSet15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + filteringMode18 + "' != '" + java.util.Locale.FilteringMode.EXTENDED_FILTERING + "'", filteringMode18.equals(java.util.Locale.FilteringMode.EXTENDED_FILTERING));
        org.junit.Assert.assertNotNull(strList19);
        org.junit.Assert.assertNotNull(languageRangeList21);
        org.junit.Assert.assertNotNull(languageRangeArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(languageRangeArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + filteringMode33 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode33.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList34);
        org.junit.Assert.assertTrue("'" + filteringMode35 + "' != '" + java.util.Locale.FilteringMode.AUTOSELECT_FILTERING + "'", filteringMode35.equals(java.util.Locale.FilteringMode.AUTOSELECT_FILTERING));
        org.junit.Assert.assertNotNull(strList36);
        org.junit.Assert.assertTrue("'" + filteringMode37 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode37.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList38);
        org.junit.Assert.assertNotNull(strList39);
        org.junit.Assert.assertNotNull(locale40);
        org.junit.Assert.assertEquals(locale40.toString(), "\\u005c");
        org.junit.Assert.assertNotNull(charSet41);
        org.junit.Assert.assertNotNull(strSet42);
        org.junit.Assert.assertNotNull(strList43);
        org.junit.Assert.assertEquals(locale45.toString(), "");
        org.junit.Assert.assertNotNull(charSet47);
        org.junit.Assert.assertEquals(locale49.toString(), "ta...");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertNotNull(strSet52);
        org.junit.Assert.assertNotNull(strList53);
    }

    @Test
    public void test25242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25242");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("hi!       allemandItalienischallemanditalian_ITALIAN_EnglishallemandHI!allemandhi!allemandADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDED...allemand\\u0034allemandHI!allemandItalianallemand\\u0061allemand\\u0023allemandhi!allemandiTALIANallemandChinese (China)allemandhi!allemandzh_CNallemandiTALIANallemandenallemandItalienisch", '9');
        boolean boolean4 = org.apache.commons.lang3.StringUtils.startsWithAny("h2CINESE (CINA...IAN2CINESE (CINA...\\2CINESE (CINA...U2CINESE (CINA...00202CINESE (CINA...I2CINESE (CINA...h", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test25243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25243");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("2", "     Eng");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2" + "'", str2, "2");
    }

    @Test
    public void test25244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25244");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("GBR");
        java.lang.String str2 = languageRange1.getRange();
        double double3 = languageRange1.getWeight();
        double double4 = languageRange1.getWeight();
        boolean boolean6 = languageRange1.equals((java.lang.Object) "talienisch");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "gbr" + "'", str2, "gbr");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test25245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25245");
        java.util.Locale locale1 = new java.util.Locale("\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069!IH\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\engli");
        java.util.Locale.setDefault(locale1);
        java.util.Locale.setDefault(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069!ih\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\engli");
    }

    @Test
    public void test25246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25246");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("                                        itTAiT_ITALIAN_EgAish                       )modgniK detinU( hsilgnE");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test25247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25247");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("CHINESExxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx...", "iFtlnz\\sisc02rankreich)00      ", (int) 'g');
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test25248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25248");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("\\ud504", "\\\\\\\\\\\\\\\\\\\\\\\\kkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkDEkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk\\\\\\\\\\\\\\\\\\\\\\\\");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test25249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25249");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("\u4e2d\u6587", "English", 0);
        int int5 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("i\\u0020italianitalianitalianitaliit         \\", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test25250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25250");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("", 804);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    " + "'", str2, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ");
    }

    @Test
    public void test25251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25251");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\\aUa0046", 223, "zhzhzhzhzhzhzhzhzhzhfraadzhaezhafzhagzhaizhalzhamzhanzhaozhaqzharzhaszhazhzhzhzhzhzhzhzhzhz2222222222222222222222222222222222222222222222222222222222222222222222222");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\\aUa0046zhzhzhzhzhzhzhzhzhzhfraadzhaezhafzhagzhaizhalzhamzhanzhaozhaqzharzhaszhazhzhzhzhzhzhzhzhzhz2222222222222222222222222222222222222222222222222222222222222222222222222zh" + "'", str3, "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\\aUa0046zhzhzhzhzhzhzhzhzhzhfraadzhaezhafzhagzhaizhalzhamzhanzhaozhaqzharzhaszhazhzhzhzhzhzhzhzhzhz2222222222222222222222222222222222222222222222222222222222222222222222222zh");
    }

    @Test
    public void test25252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25252");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("CCCC\\CCCCC", "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test25253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25253");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("french (NC_HZ)", " italia", 164);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "french (NC_HZ)" + "'", str3, "french (NC_HZ)");
    }

    @Test
    public void test25254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25254");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("hEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglish", "gbr");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglish" + "'", str2, "hEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglish");
    }

    @Test
    public void test25255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25255");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("FRFRFRFRFRFRFRFRFRFRFRFRFde_DEFRFRFRFRFRFRFRFRFRFRFRFRFR", "t", 99);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test25256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25256");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("UND", "English (United States)");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test25257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25257");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("", "ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDEDinglesehhhhhhhhhenglisCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCEgschCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCALIAN_ENGLISH,\\u0061)englisCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCEgschCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCALIAN_ENGLISH,\\u0061)englisCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCEgschCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCALIAN_ENGLISH,\\u0061)englisCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCEgschCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCALIAN_ENGLISH,\\u0061)englisCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCEgschCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCALIAN_ENGLISH,\\u0061)englisCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCEgschCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCALIAN_ENGLISH,\\u0061)en...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test25258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25258");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale1 = java.util.Locale.getDefault(category0);
        java.util.Locale locale2 = java.util.Locale.GERMAN;
        java.util.Locale locale3 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str4 = locale2.getDisplayName(locale3);
        java.util.Locale.setDefault(category0, locale3);
        java.util.Locale locale8 = new java.util.Locale("\\u0045", "");
        java.util.Locale.setDefault(category0, locale8);
        java.util.Locale.Builder builder10 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder11 = builder10.clearExtensions();
        java.util.Locale.Builder builder13 = builder10.setLanguageTag("Italian");
        java.util.Locale locale14 = builder10.build();
        java.util.Locale locale15 = java.util.Locale.CHINESE;
        java.lang.String str16 = locale15.getISO3Language();
        java.util.Locale.Builder builder17 = builder10.setLocale(locale15);
        java.util.Locale locale18 = java.util.Locale.US;
        java.lang.String str19 = locale18.getScript();
        java.util.Set<java.lang.String> strSet20 = locale18.getUnicodeLocaleAttributes();
        java.lang.String str21 = locale18.getCountry();
        java.util.Locale.setDefault(locale18);
        java.util.Locale.Builder builder23 = builder17.setLocale(locale18);
        java.util.Locale.setDefault(category0, locale18);
        java.util.Locale locale25 = java.util.Locale.getDefault(category0);
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069!ih\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\engli");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "de");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "allemand" + "'", str4, "allemand");
        org.junit.Assert.assertEquals(locale8.toString(), "\\u0045");
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "italian");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "zho" + "'", str16, "zho");
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(strSet20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "US" + "'", str21, "US");
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "en_US");
    }

    @Test
    public void test25259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25259");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "en_CA", (java.lang.CharSequence) "KoreanADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLC");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test25260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25260");
        char[] charArray9 = new char[] { ' ', '4' };
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "HI!", charArray9);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!", charArray9);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "h", charArray9);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "\\italian_ITALIAN_English", charArray9);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "Franz\366sischFranzosisch (Frankreich)", charArray9);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsAny("\\U0020ITALIANITALIANITALIANITALI\\U0020ITALIANITALIANITALIANITALHcsineilatI", charArray9);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsAny("", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[ , 4]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test25261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25261");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "                                             Deutsch                                             ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test25262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25262");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("AD4AE4AF4AG4AI4AL4AM4AN4AO4AQ4AR4AS4AT4AU4AW4AX4AZ4BA4BB4BD4BE4BF4BG4BH4BI4BJ4BL4BM4BN4BO4BQ4BR4BS4BT4BV4BW4BY4BZ4CA4CC4CD4CF4CG4CH4CI4CK4CL4CM4CN4CO4CR4CU4CV4CW4CX4CY4CZ4DE4DJ4DK4DM4DO4DZ4EC4EE4EG4EH4ER4ES4ET4FI4FJ4FK4FM4FO4FR4GA4GB4GD4GE4GF4GG4GH4GI4GL4GM4GN4GP4GQ4GR4GS4GT4GU4GW4GY4HK4HM4HN4HR4HT4HU4ID4IE4IL4IM4IN4IO4IQ4IR4IS4IT4JE4JM4JO4JP4KE4KG4KH4KI4KM4KN4KP4KR4KW4KY4KZ4LA4LB4LC4LI4LK4LR4LS4LT4LU4LV4LY4MA4MC4MD4ME4MF4MG4MH4MK4ML4MM4MN4MO4MP4MQ4MR4MS4MT4MU4MV4MW4MX4MY4MZ4NA4NC4NE4NF4NG4NI4NL4NO4NP4NR4NU4NZ4OM4PA4PE4PF4PG4PH4PK4PL4PM4PN4PR4PS4PT4PW4PY4QA4RE4RO4RS4RU4RW4SA4SB4SC4SD4SE4SG4SH4SI4SJ4SK4SL4SM4SN4SO4SR4SS4ST4SV4SX4SY4SZ4TC4TD4TF4TG4TH4TJ4TK4TL4TM4TN4TO4TR4TT4TV4TW4TZ4UA4UG4UM4US4UY4UZ4VA4VC4VE4VG4VI4VN4VU4WF4WS4YE4YT4ZA4ZM4ZW", '#');
        boolean boolean5 = org.apache.commons.lang3.StringUtils.endsWithAny("h_HHHHHHHHH_CV CW CX CY CZ DE DJ DK DM DO DZ EC EE EG EH ER ES ET FI FJ FK", strArray4);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, "                                               ##########                                               ", 406, 119);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.startsWithAny("KOR", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test25263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25263");
        java.util.Locale locale0 = java.util.Locale.ENGLISH;
        java.util.Locale locale4 = new java.util.Locale("Italian", "Italian", "English");
        java.util.Locale locale6 = java.util.Locale.FRANCE;
        java.util.Locale locale7 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str8 = locale6.getDisplayScript(locale7);
        java.lang.String str9 = locale7.getVariant();
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.lowerCase("\\u0034", locale7);
        java.lang.String str11 = locale7.getCountry();
        java.lang.String str12 = locale4.getDisplayLanguage(locale7);
        java.lang.String str13 = locale0.getDisplayScript(locale4);
        java.lang.String str14 = locale0.getDisplayScript();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en");
        org.junit.Assert.assertEquals(locale4.toString(), "italian_ITALIAN_English");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\\u0034" + "'", str10, "\\u0034");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "CA" + "'", str11, "CA");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "italian" + "'", str12, "italian");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test25264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25264");
        java.util.Locale locale0 = java.util.Locale.ITALIAN;
        java.lang.String str1 = locale0.getDisplayLanguage();
        java.util.Locale locale2 = locale0.stripExtensions();
        java.lang.String str3 = locale0.getLanguage();
        java.lang.String str4 = locale0.getISO3Language();
        java.util.Locale.Builder builder6 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder7 = builder6.clearExtensions();
        java.util.Locale locale8 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str9 = locale8.getDisplayName();
        java.util.Locale.Builder builder10 = builder7.setLocale(locale8);
        java.util.Locale.Builder builder11 = builder10.clear();
        java.util.Locale.Builder builder13 = builder11.setLanguage("ITALIAN");
        java.util.Locale locale14 = builder11.build();
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.upperCase("hi!", locale14);
        java.lang.String str16 = locale0.getDisplayScript(locale14);
        java.util.Locale locale17 = locale0.stripExtensions();
        java.util.Locale.Category category18 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale19 = java.util.Locale.getDefault(category18);
        java.util.Locale locale20 = java.util.Locale.GERMAN;
        java.util.Locale locale21 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str22 = locale20.getDisplayName(locale21);
        java.util.Locale.setDefault(category18, locale21);
        java.util.Locale.Category category24 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale25 = java.util.Locale.getDefault(category24);
        java.lang.String str27 = locale25.getExtension('x');
        java.util.Locale.setDefault(category18, locale25);
        java.util.Locale locale29 = java.util.Locale.getDefault(category18);
        java.util.Locale locale30 = java.util.Locale.ITALY;
        java.lang.String str31 = locale30.getScript();
        java.util.Locale.setDefault(category18, locale30);
        java.util.Locale locale33 = java.util.Locale.getDefault(category18);
        java.lang.String str34 = locale0.getDisplayName(locale33);
        java.lang.String str35 = locale0.getLanguage();
        java.lang.String str36 = locale0.getISO3Language();
        java.util.Locale.setDefault(locale0);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Italian" + "'", str1, "Italian");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "it");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "it" + "'", str3, "it");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ita" + "'", str4, "ita");
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "French (Canada)" + "'", str9, "French (Canada)");
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "italian");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "HI!" + "'", str15, "HI!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "it");
        org.junit.Assert.assertTrue("'" + category18 + "' != '" + java.util.Locale.Category.FORMAT + "'", category18.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "de");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "allemand" + "'", str22, "allemand");
        org.junit.Assert.assertTrue("'" + category24 + "' != '" + java.util.Locale.Category.FORMAT + "'", category24.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "fr_CA");
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "fr_CA");
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "italiano" + "'", str34, "italiano");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "it" + "'", str35, "it");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "ita" + "'", str36, "ita");
    }

    @Test
    public void test25265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25265");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("\\u00de\\u00");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, '!');
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray1, "HU!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IUzhzhzhzhzhzhzhzhzhzhFRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhAzhzhzhzhzhzhzhzhzhzhUFRZ\326CZ(FRKREC)Ucinese (Cina)\\u0069hhhhhhhhhh\\u0069hhhhhhhhhh\\u0069hhhhhhhhhh\\u0069hhU         ITALIAN_ITALIAN_ENGLISH         ITALIAN_!IHITTAIT_ITALIAN_EGAISHU                                      ...");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\!u!00!de!\\!u!00" + "'", str3, "\\!u!00!de!\\!u!00");
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test25266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25266");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("ITALIENISCH", 102, (int) '5');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test25267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25267");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("iTTAIT_ITALIAN_EGAISH          ", "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test25268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25268");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("FRANZ\326SISCH (KANADA)", 47);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "             FRANZ\326SISCH (KANADA)              " + "'", str2, "             FRANZ\326SISCH (KANADA)              ");
    }

    @Test
    public void test25269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25269");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("ran\347aisa(France)aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaafaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "                                                                                                                                             \\u0061ItalienischItalienischItalienischItalienischItalienischItalienischItalienischItalienischItalie", 24);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test25270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25270");
        char[] charArray1 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny(".", charArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test25271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25271");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.setLanguageTag("Italian");
        java.util.Locale.Builder builder4 = builder0.clearExtensions();
        java.util.Locale.Builder builder5 = builder0.clear();
        java.util.Locale locale6 = builder0.build();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "");
    }

    @Test
    public void test25272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25272");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.setLanguageTag("Italian");
        java.util.Locale locale4 = java.util.Locale.PRC;
        java.lang.String str5 = locale4.getDisplayName();
        java.util.Locale.Builder builder6 = builder0.setLocale(locale4);
        java.util.Locale.Builder builder7 = builder6.clear();
        java.util.Locale locale8 = java.util.Locale.KOREAN;
        java.util.Locale.Builder builder9 = builder7.setLocale(locale8);
        java.util.Locale locale10 = builder9.build();
        java.lang.String str11 = locale10.getVariant();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "cinese (Cina)" + "'", str5, "cinese (Cina)");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "ko");
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test25273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25273");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "iIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIITALIAN_italian_eNGLISHIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII                                             hcsfr-CueD                                                                                          hcsfr-CueD  ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test25274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25274");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                                                                                         fr-", "\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069!IH\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test25275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25275");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("", "anihc!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!", 194);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test25276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25276");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "9hhhhhhhhhh_\\U00789hhhhhhhhhh_\\U00789hhhhhhhhhh_\\U00789hhhhhhhhhh_\\U00789hhhhhhhhhh_\\U00789hhhhenglish", "(italian,english)");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test25277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25277");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("nnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn                                                                     ", "!ih                            dllm!ih                            dllm!ih                          ", 73);
        int int5 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("harzhaszhazhzhzhzhzhzhzhzhzhz", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test25278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25278");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("BFIBGIBHIBIIBJIBLIBMIBNIBOIBQIBRIBSIBTIBVIBWIBYIBZICAICCICDICFICGICHICIICKICLICMICNICOICRICUICVICWICXICYICZIDEIDJIDKIDMIDOIDZIECIEEIEGIEHIERIESIETIFIIFJIFKIFMIFOIFRIGAIGBIGDIGEIGFIGGIGHIGIIGLIGMIGNIGPIGQIGRIGSIGTIGUIGWIGYIHKIHM");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "BFIBGIBHIBIIBJIBLIBMIBNIBOIBQIBRIBSIBTIBVIBWIBYIBZICAICCICDICFICGICHICIICKICLICMICNICOICRICUICVICWICXICYICZIDEIDJIDKIDMIDOIDZIECIEEIEGIEHIERIESIETIFIIFJIFKIFMIFOIFRIGAIGBIGDIGEIGFIGGIGHIGIIGLIGMIGNIGPIGQIGRIGSIGTIGUIGWIGYIHKIHM" + "'", str1, "BFIBGIBHIBIIBJIBLIBMIBNIBOIBQIBRIBSIBTIBVIBWIBYIBZICAICCICDICFICGICHICIICKICLICMICNICOICRICUICVICWICXICYICZIDEIDJIDKIDMIDOIDZIECIEEIEGIEHIERIESIETIFIIFJIFKIFMIFOIFRIGAIGBIGDIGEIGFIGGIGHIGIIGLIGMIGNIGPIGQIGRIGSIGTIGUIGWIGYIHKIHM");
    }

    @Test
    public void test25279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25279");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("zhAzhzhzhzhzhzhzhzhzhz");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "zhAzhzhzhzhzhzhzhzhzh" + "'", str1, "zhAzhzhzhzhzhzhzhzhzh");
    }

    @Test
    public void test25280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25280");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("             \\u0049             ", "iTALIANiTALIANiTALIANiTALIANiTALIANiTALIANiTALIANiTALIANiTALIANiTALIANiTALIANiTALIANiTALIANiTALIANiTALIANiTALIANiTAL");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "             \\u0049             " + "'", str2, "             \\u0049             ");
    }

    @Test
    public void test25281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25281");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIITALIAN_ITALIAN_ENGLISHIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII", 103);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIITALIAN_ITALIAN_ENGLISHIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII..." + "'", str2, "IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIITALIAN_ITALIAN_ENGLISHIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII...");
    }

    @Test
    public void test25282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25282");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("nailatikonailatikonailatikonailatikonailatikonailatikonailatikonailatikonailatikonailatikonailatikonailatikonailatikonailatikonailatikonailatikonailatikonailatikonailatikonailatikonailatikonailatikonailatikonailatikonailatiko");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "nailatikonailatikonailatikonailatikonailatikonailatikonailatikonailatikonailatikonailatikonailatikonailatikonailatikonailatikonailatikonailatikonailatikonailatikonailatikonailatikonailatikonailatikonailatikonailatikonailatiko" + "'", str1, "nailatikonailatikonailatikonailatikonailatikonailatikonailatikonailatikonailatikonailatikonailatikonailatikonailatikonailatikonailatikonailatikonailatikonailatikonailatikonailatikonailatikonailatikonailatikonailatikonailatiko");
    }

    @Test
    public void test25283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25283");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfBlank("adaeafagaialamanaoaqarasatauawaxazbabbbdbebfbgbhbibjblbmbnbobqbrbsbtbvbwbybzcacccdcfcgchcickclcmcncocrcucvcwcxcyczdedh...", "ZH_CNGGGGG");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "adaeafagaialamanaoaqarasatauawaxazbabbbdbebfbgbhbibjblbmbnbobqbrbsbtbvbwbybzcacccdcfcgchcickclcmcncocrcucvcwcxcyczdedh..." + "'", str2, "adaeafagaialamanaoaqarasatauawaxazbabbbdbebfbgbhbibjblbmbnbobqbrbsbtbvbwbybzcacccdcfcgchcickclcmcncocrcucvcwcxcyczdedh...");
    }

    @Test
    public void test25284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25284");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale1 = java.util.Locale.getDefault(category0);
        java.util.Locale locale2 = java.util.Locale.GERMAN;
        java.util.Locale locale3 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str4 = locale2.getDisplayName(locale3);
        java.util.Locale.setDefault(category0, locale3);
        java.util.Locale.Category category6 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale7 = java.util.Locale.getDefault(category6);
        java.lang.String str9 = locale7.getExtension('x');
        java.util.Locale.setDefault(category0, locale7);
        java.util.Locale.Builder builder11 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder12 = builder11.clearExtensions();
        java.util.Locale.Builder builder14 = builder11.setLanguageTag("Italian");
        java.util.Locale locale15 = java.util.Locale.PRC;
        java.lang.String str16 = locale15.getDisplayName();
        java.util.Locale.Builder builder17 = builder11.setLocale(locale15);
        java.util.Locale.Builder builder18 = builder17.clear();
        java.util.Locale locale19 = java.util.Locale.KOREAN;
        java.util.Locale.Builder builder20 = builder18.setLocale(locale19);
        java.lang.String str21 = locale19.getDisplayName();
        java.util.Locale.setDefault(category0, locale19);
        java.util.Locale locale23 = java.util.Locale.getDefault(category0);
        java.util.Locale locale24 = java.util.Locale.getDefault(category0);
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "it");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "de");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "allemand" + "'", str4, "allemand");
        org.junit.Assert.assertTrue("'" + category6 + "' != '" + java.util.Locale.Category.FORMAT + "'", category6.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "fr_CA");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "cinese (Cina)" + "'", str16, "cinese (Cina)");
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "ko");
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "coreano" + "'", str21, "coreano");
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "ko");
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "ko");
    }

    @Test
    public void test25285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25285");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("hi!allemandItalienischallemanditalian_ITALIAN_EnglishallemandHI!allemandhi!allemandADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDED...allemand\\u0034allemandHI!allemandItalianallemand\\u0061allemand\\u0023allemandhi!allemandiTALIANallemandChinese(China)allemandhi!allemandzh_CNallemandiTALIANallemandenallemandItalienisch", 21);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test25286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25286");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('n', 28);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 28 + "'", int2 == 28);
    }

    @Test
    public void test25287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25287");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "FFFF");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test25288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25288");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rchinesisch (china)");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test25289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25289");
        java.util.Locale locale3 = new java.util.Locale("Frnz\366sisch(Knd)", "                                                                                                              italieital", "CCCCCCCCCCCCCanglais (CanadaCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC");
        java.lang.Class<?> wildcardClass4 = locale3.getClass();
        org.junit.Assert.assertEquals(locale3.toString(), "frnz\366sisch(knd)_                                                                                                              ITALIEITAL_CCCCCCCCCCCCCanglais (CanadaCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test25290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25290");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("                                                                                    ITALIAN (italian,eNGLISH)", "                              444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444en");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                    ITALIAN (italian,eNGLISH)" + "'", str2, "                                                                                    ITALIAN (italian,eNGLISH)");
    }

    @Test
    public void test25291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25291");
        boolean boolean1 = org.apache.commons.lang3.CharUtils.isAsciiAlphaUpper('b');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test25292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25292");
        java.util.Locale locale2 = new java.util.Locale("                                      )HSILGNE,NAILATI( ", "4444ALLEMAND 4444");
        org.junit.Assert.assertEquals(locale2.toString(), "                                      )hsilgne,nailati( _4444ALLEMAND 4444");
    }

    @Test
    public void test25293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25293");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("", "nglish ...hi!allemanditalienischallemanditalian_italian_englishallemandhi!allemandhi!allemandadaeafagaialamanaoaqarasatauawaxazbabbbdbebfbgbhbibjblbmbnbobqbrbsbtbvbwbybzcacccdcfcgchcickclcmcncocrcucvcwcxcyczded...allemand\\u0034allemandhi!allemanditalianallemand\\u0061allemand\\u0023allemandhi!allemanditalianallemandchinese(china)allemandhi!allemandzh_cnallemanditalianallemandenallemanditalienischhi!allemanditalienischallemanditalian_italian_englishallemandhi!allemandhi!allemandadaeafagaialamanaoa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test25294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25294");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("\\u0034\\u00                                             hcstued                                             \\u0034\\u00 (\\U0020IITALIAN\\U0020I)", "Franzosisch (Frankreich)", "g       ...");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test25295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25295");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("                                                                                                                \r", 101, "Fra)HGaHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                \r" + "'", str3, "                                                                                                                \r");
    }

    @Test
    public void test25296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25296");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("\\", '9');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\" + "'", str2, "\\");
    }

    @Test
    public void test25297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25297");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale locale2 = java.util.Locale.UK;
        java.util.Locale.Builder builder3 = builder0.setLocale(locale2);
        java.util.Locale locale5 = java.util.Locale.forLanguageTag("\\U0020ITALIANITALIANITALIANITALI\\U0020ITALIANITALIANITALIANITAL");
        java.util.Locale.Builder builder6 = builder0.setLocale(locale5);
        java.lang.String str7 = locale5.getDisplayScript();
        java.lang.String str8 = locale5.getISO3Country();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en_GB");
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test25298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25298");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                                              \\     ", "");
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("Deutsch", 'i');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.replaceEach("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444en", strArray6, strArray9);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray9);
        int int12 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("ixii", strArray9);
        java.lang.String[] strArray14 = org.apache.commons.lang3.StringUtils.stripAll(strArray9, "Chinese");
        java.lang.String[] strArray17 = org.apache.commons.lang3.StringUtils.split("\\u0023", "\\u0023");
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray17, "italian_ITALIAN_English");
        java.lang.String str23 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray17, "franz\366sisch (frankreich)", (int) 'i', 6);
        java.lang.String str24 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("ZH_cn", strArray14, strArray17);
        java.lang.String[] strArray25 = org.apache.commons.lang3.StringUtils.stripAll(strArray17);
        boolean boolean26 = org.apache.commons.lang3.StringUtils.endsWithAny("\\u0034\\u00hcstud\\u0034\\u00", strArray17);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444en" + "'", str10, "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444en");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Deutsch" + "'", str11, "Deutsch");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "ZH_cn" + "'", str24, "ZH_cn");
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test25299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25299");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("\\u002 (ROYAUME-UNI)");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, '2');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\u0022(ROYAUME-UNI)" + "'", str3, "\\u0022(ROYAUME-UNI)");
    }

    @Test
    public void test25300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25300");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.setLanguageTag("Italian");
        java.util.Locale.Builder builder4 = builder0.clearExtensions();
        java.util.Locale.Builder builder5 = builder0.clear();
        java.util.Locale.Builder builder6 = builder0.clearExtensions();
        java.util.Locale locale7 = java.util.Locale.ITALIAN;
        java.lang.String str8 = locale7.getDisplayLanguage();
        java.util.Locale locale9 = locale7.stripExtensions();
        java.util.Locale locale11 = java.util.Locale.forLanguageTag("\\u0020");
        java.lang.String str12 = locale11.getDisplayScript();
        java.lang.String str13 = locale9.getDisplayCountry(locale11);
        java.util.Set<java.lang.Character> charSet14 = locale9.getExtensionKeys();
        java.util.Locale.Builder builder15 = builder0.setLocale(locale9);
        java.util.Locale.Category category16 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale17 = java.util.Locale.getDefault(category16);
        java.util.Locale locale18 = java.util.Locale.FRANCE;
        java.util.Locale locale19 = java.util.Locale.ITALIAN;
        java.lang.String str21 = locale19.getExtension('h');
        java.lang.String str22 = locale18.getDisplayScript(locale19);
        java.lang.String str23 = locale18.getISO3Country();
        java.util.Locale locale24 = java.util.Locale.GERMAN;
        java.util.Locale.setDefault(locale24);
        java.lang.String str26 = locale18.getDisplayName(locale24);
        java.lang.String str27 = locale18.getScript();
        java.util.Locale.setDefault(category16, locale18);
        java.util.Set<java.lang.String> strSet29 = locale18.getUnicodeLocaleKeys();
        java.lang.String str30 = locale18.getCountry();
        java.util.Locale locale31 = locale18.stripExtensions();
        java.util.Locale.Builder builder32 = builder0.setLocale(locale31);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder35 = builder0.setExtension('H', "CCCCCCCCC");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension value: CCCCCCCCC [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "it");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "italiano" + "'", str8, "italiano");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "it");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(charSet14);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertTrue("'" + category16 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category16.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "it");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "it");
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "FRA" + "'", str23, "FRA");
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "de");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Franz\366sisch (Frankreich)" + "'", str26, "Franz\366sisch (Frankreich)");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(strSet29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "FR" + "'", str30, "FR");
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(builder32);
    }

    @Test
    public void test25301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25301");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "u Italia u");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test25302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25302");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("german (germany)IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          IAN\\U0020I");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "german (germany)" + "'", str2, "german (germany)");
    }

    @Test
    public void test25303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25303");
        java.util.Locale locale1 = java.util.Locale.CHINESE;
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("         italian_ITALIAN_English", locale1);
        java.lang.String str3 = locale1.toLanguageTag();
        java.util.Locale locale7 = new java.util.Locale("H", "Hhhhhhhhh", "CV CW CX CY CZ DE DJ DK DM DO DZ EC EE EG EH ER ES ET FI FJ FK");
        java.lang.String str8 = locale1.getDisplayLanguage(locale7);
        java.util.Locale locale10 = java.util.Locale.FRANCE;
        java.util.Locale locale11 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str12 = locale10.getDisplayScript(locale11);
        java.lang.String str13 = locale11.getVariant();
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.lowerCase("\\u0034", locale11);
        java.lang.String str15 = locale11.getDisplayName();
        java.util.Locale.Category category16 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale17 = java.util.Locale.getDefault(category16);
        java.util.Locale locale18 = java.util.Locale.FRANCE;
        java.util.Locale locale19 = java.util.Locale.ITALIAN;
        java.lang.String str21 = locale19.getExtension('h');
        java.lang.String str22 = locale18.getDisplayScript(locale19);
        java.util.Locale locale23 = locale18.stripExtensions();
        java.util.Set<java.lang.String> strSet24 = locale23.getUnicodeLocaleAttributes();
        java.util.Locale.setDefault(category16, locale23);
        java.lang.String str26 = locale11.getDisplayLanguage(locale23);
        java.lang.String str27 = locale7.getDisplayCountry(locale23);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str29 = locale23.getExtension('\ud504');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed extension key: ??");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "         italian_italian_english" + "'", str2, "         italian_italian_english");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "zh" + "'", str3, "zh");
        org.junit.Assert.assertEquals(locale7.toString(), "h_HHHHHHHHH_CV CW CX CY CZ DE DJ DK DM DO DZ EC EE EG EH ER ES ET FI FJ FK");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Chinese" + "'", str8, "Chinese");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\\u0034" + "'", str14, "\\u0034");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "fran\347ais (Canada)" + "'", str15, "fran\347ais (Canada)");
        org.junit.Assert.assertTrue("'" + category16 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category16.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "it");
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(strSet24);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "fran\347ais" + "'", str26, "fran\347ais");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "HHHHHHHHH" + "'", str27, "HHHHHHHHH");
    }

    @Test
    public void test25304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25304");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale locale2 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str3 = locale2.getDisplayName();
        java.util.Locale.Builder builder4 = builder1.setLocale(locale2);
        java.util.Locale.Builder builder6 = builder1.setLanguage("und");
        java.util.Locale locale7 = builder6.build();
        java.util.Locale locale8 = builder6.build();
        java.util.Locale locale9 = builder6.build();
        java.util.Locale.Builder builder10 = builder6.clearExtensions();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "fran\347ais (Canada)" + "'", str3, "fran\347ais (Canada)");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "und_CA");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "und_CA");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "und_CA");
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test25305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25305");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("ZHAZHZHZHZHZHZHZHZHZHZH_und-ca", "hIAN\\U0020Ih", 0);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test25306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25306");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("Cranzosisch (Frankreich)kkkkkkkkkkkkkkkkkkk...ranzosisch (Frankreich)kkkkkkkkkkhinoisranzosisch (Frankreich)kkkkkkkkkkkkkkkkkkk...ranzosisch (Frankreich)kkkkkkkkkk ranzosisch (Frankreich)kkkkkkkkkkkkkkkkkkk...ranzosisch (Frankreich)kkkkkkkkkk(ranzosisch (Frankreich)kkkkkkkkkkkkkkkkkkk...ranzosisch (Frankreich)kkkkkkkkkkchineranzosisch (Frankreich)kkkkkkkkkkkkkkkkkkk...ranzosisch (Frankreich)kkkkkkkkkk)", "hi!        (\\u0020,italienisch#########################################################################################)");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test25307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25307");
        java.lang.String[] strArray1 = null;
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByCharacterType("Korean (South Korea)Korean (Songlish ...Korean (South Korea)Korean (So");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069!ih\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\engli", strArray1, strArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, '4', 8, (int) (byte) 10);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069!ih\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\engli" + "'", str4, "\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069!ih\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\engli");
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test25308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25308");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("))))))))))))))))))))))))))))))))))))))))))))))))))", 32, 'U');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "))))))))))))))))))))))))))))))))))))))))))))))))))" + "'", str3, "))))))))))))))))))))))))))))))))))))))))))))))))))");
    }

    @Test
    public void test25309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25309");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\\aUa0046", "...ALzhAMzhANzhAOzhAQzhARzhASzhA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\\aUa0046" + "'", str2, "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\\aUa0046");
    }

    @Test
    public void test25310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25310");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("ITALIE", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa3200u\\NAILAT");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ITALIE" + "'", str2, "ITALIE");
    }

    @Test
    public void test25311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25311");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("", "it_I");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test25312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25312");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("                                                                 \\U0020  ", 19, 8);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test25313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25313");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.setLanguageTag("Italian");
        java.util.Locale.Builder builder4 = builder0.clearExtensions();
        java.util.Locale.Builder builder5 = builder0.clear();
        java.util.Locale locale7 = java.util.Locale.forLanguageTag("\\u0020");
        java.util.Locale.Builder builder8 = builder0.setLocale(locale7);
        java.util.Locale.Builder builder11 = builder0.setExtension('u', "Italian");
        java.util.Locale.Builder builder12 = builder11.clearExtensions();
        java.util.Locale.Builder builder13 = builder12.clearExtensions();
        java.util.Locale locale14 = builder13.build();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder16 = builder13.setLanguageTag("\\U0020I...");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Invalid subtag: \\U0020I... [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "");
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "");
    }

    @Test
    public void test25314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25314");
        java.util.Locale locale2 = new java.util.Locale("italian (ITALIAN,English)", "                                                                                                         ");
        java.util.Locale locale3 = java.util.Locale.CANADA_FRENCH;
        java.util.Set<java.lang.String> strSet4 = locale3.getUnicodeLocaleKeys();
        java.lang.String str5 = locale3.toLanguageTag();
        java.lang.String str6 = locale2.getDisplayLanguage(locale3);
        java.util.Locale locale7 = locale2.stripExtensions();
        java.lang.String str8 = locale7.getDisplayLanguage();
        org.junit.Assert.assertEquals(locale2.toString(), "italian (italian,english)_                                                                                                         ");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "fr_CA");
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "fr-CA" + "'", str5, "fr-CA");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "italian (italian,english)" + "'", str6, "italian (italian,english)");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "italian (italian,english)_                                                                                                         ");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "italian (italian,english)" + "'", str8, "italian (italian,english)");
    }

    @Test
    public void test25315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25315");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("                                                                                                                                                                                                                         \\     ", "", (int) '\\', 200);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "                                                                                                             \\     " + "'", str4, "                                                                                                             \\     ");
    }

    @Test
    public void test25316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25316");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rFRANZ\326SISCH\n(FRANKREICH)\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r", "cor\351en (Cor\351e du Sud)");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rFRANZ\326SISCH\n(FRANKREICH)\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r" + "'", str2, "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rFRANZ\326SISCH\n(FRANKREICH)\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r");
    }

    @Test
    public void test25317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25317");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "HIAN\\U0020Ih");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 12 + "'", int1 == 12);
    }

    @Test
    public void test25318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25318");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "NC_hz\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\\aUa0046");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 82 + "'", int1 == 82);
    }

    @Test
    public void test25319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25319");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("ENGLISCH (         italian_italian_english,\\U0061", 60);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ENGLISCH (         italian_italian_english,\\U0061" + "'", str2, "ENGLISCH (         italian_italian_english,\\U0061");
    }

    @Test
    public void test25320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25320");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "ITA", "FrancGahhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test25321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25321");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("         ITALIAN_italian_eNGLISH         ITALIAN_!IH");
        java.util.Locale.setDefault(locale1);
        java.util.Locale locale3 = java.util.Locale.ROOT;
        java.lang.String str4 = locale3.getISO3Language();
        java.util.Locale locale6 = new java.util.Locale("\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rzh_CN");
        java.lang.String str7 = locale3.getDisplayVariant(locale6);
        java.lang.String str8 = locale1.getDisplayName(locale3);
        java.util.Locale locale12 = new java.util.Locale("hi!", "English", "");
        java.lang.String str13 = locale12.getDisplayVariant();
        java.lang.String str14 = locale3.getDisplayScript(locale12);
        java.util.Locale locale18 = new java.util.Locale("e                         iItal", "uuuuuuuuuuuuuuuuu\\u0066", "IT44444444444444444EN");
        java.lang.String str19 = locale3.getDisplayLanguage(locale18);
        java.lang.String str20 = locale18.getLanguage();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals(locale6.toString(), "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rzh_cn");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals(locale12.toString(), "hi!_ENGLISH");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals(locale18.toString(), "e                         iital_UUUUUUUUUUUUUUUUU\\U0066_IT44444444444444444EN");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "e                         iital" + "'", str20, "e                         iital");
    }

    @Test
    public void test25322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25322");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("und-RA");
    }

    @Test
    public void test25323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25323");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("                                                                                                             \\     ", 22);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                \\     " + "'", str2, "                \\     ");
    }

    @Test
    public void test25324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25324");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("\\u004", "hcsnela");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\u004" + "'", str2, "\\u004");
    }

    @Test
    public void test25325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25325");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("\\u0061                                                                                                                                                                                                                                                                                                                                                                             ", "\\0020!TALIAN!TALIAN!TALIAN!TALzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz", 151);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test25326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25326");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "uniCCCC\\CCCCC                                                             ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test25327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25327");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("   \r");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=?");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test25328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25328");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale locale3 = java.util.Locale.FRENCH;
        java.util.Locale locale4 = java.util.Locale.ENGLISH;
        java.lang.String str5 = locale4.getDisplayCountry();
        java.lang.String str6 = locale3.getDisplayVariant(locale4);
        java.lang.String str7 = locale3.getDisplayCountry();
        java.lang.String str8 = locale3.getScript();
        java.lang.String str9 = locale3.getScript();
        java.util.Locale locale10 = java.util.Locale.FRENCH;
        java.util.Locale locale11 = java.util.Locale.ENGLISH;
        java.lang.String str12 = locale11.getDisplayCountry();
        java.lang.String str13 = locale10.getDisplayVariant(locale11);
        java.lang.String str14 = locale10.getDisplayCountry();
        java.lang.String str15 = locale10.getScript();
        java.lang.String str16 = locale10.getScript();
        java.lang.String str17 = locale3.getDisplayCountry(locale10);
        java.util.Locale.Category category18 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale19 = java.util.Locale.getDefault(category18);
        java.util.Locale locale20 = java.util.Locale.FRANCE;
        java.util.Locale locale21 = java.util.Locale.ITALIAN;
        java.lang.String str23 = locale21.getExtension('h');
        java.lang.String str24 = locale20.getDisplayScript(locale21);
        java.lang.String str25 = locale20.getISO3Country();
        java.util.Locale locale26 = java.util.Locale.GERMAN;
        java.util.Locale.setDefault(locale26);
        java.lang.String str28 = locale20.getDisplayName(locale26);
        java.lang.String str29 = locale20.getScript();
        java.util.Locale.setDefault(category18, locale20);
        java.lang.String str31 = locale3.getDisplayCountry(locale20);
        java.util.Locale.Builder builder32 = new java.util.Locale.Builder();
        java.util.Locale locale33 = builder32.build();
        java.util.Locale locale35 = java.util.Locale.forLanguageTag("Italian");
        java.lang.String str36 = locale33.getDisplayLanguage(locale35);
        java.lang.String str37 = locale20.getDisplayVariant(locale33);
        java.lang.String str38 = org.apache.commons.lang3.StringUtils.upperCase("Korean", locale20);
        java.util.Locale locale40 = new java.util.Locale("hi!       allemandItalienischallemanditalian_ITALIAN_EnglishallemandHI!allemandhi!allemandADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDED...allemand\\u0034allemandHI!allemandItalianallemand\\u0061allemand\\u0023allemandhi!allemandiTALIANallemandChinese (China)allemandhi!allemandzh_CNallemandiTALIANallemandenallemandItalienisch");
        java.lang.String str41 = locale20.getDisplayScript(locale40);
        java.util.Locale.Builder builder42 = builder0.setLocale(locale20);
        java.util.Locale.Builder builder45 = builder0.setExtension('t', "ESENIHC");
        java.util.Locale.Builder builder47 = builder0.setRegion("");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder49 = builder47.setRegion("EnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglisch");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: EnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglisch [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "fr");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "fr");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "en");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + category18 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category18.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "it");
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "FRA" + "'", str25, "FRA");
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "de");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Franz\366sisch (Frankreich)" + "'", str28, "Franz\366sisch (Frankreich)");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "");
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "italian");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "KOREAN" + "'", str38, "KOREAN");
        org.junit.Assert.assertEquals(locale40.toString(), "hi!       allemanditalienischallemanditalian_italian_englishallemandhi!allemandhi!allemandadaeafagaialamanaoaqarasatauawaxazbabbbdbebfbgbhbibjblbmbnbobqbrbsbtbvbwbybzcacccdcfcgchcickclcmcncocrcucvcwcxcyczded...allemand\\u0034allemandhi!allemanditalianallemand\\u0061allemand\\u0023allemandhi!allemanditalianallemandchinese (china)allemandhi!allemandzh_cnallemanditalianallemandenallemanditalienisch");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertNotNull(builder42);
        org.junit.Assert.assertNotNull(builder45);
        org.junit.Assert.assertNotNull(builder47);
    }

    @Test
    public void test25329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25329");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("FR-C", "ixii");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "FR-C" + "'", str2, "FR-C");
    }

    @Test
    public void test25330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25330");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale locale2 = java.util.Locale.FRENCH;
        java.util.Locale locale3 = java.util.Locale.ENGLISH;
        java.lang.String str4 = locale3.getDisplayCountry();
        java.lang.String str5 = locale2.getDisplayVariant(locale3);
        java.lang.String str6 = locale2.getDisplayCountry();
        java.lang.String str7 = locale2.getScript();
        java.lang.String str8 = locale2.getScript();
        java.util.Locale locale9 = java.util.Locale.FRENCH;
        java.util.Locale locale10 = java.util.Locale.ENGLISH;
        java.lang.String str11 = locale10.getDisplayCountry();
        java.lang.String str12 = locale9.getDisplayVariant(locale10);
        java.lang.String str13 = locale9.getDisplayCountry();
        java.lang.String str14 = locale9.getScript();
        java.lang.String str15 = locale9.getScript();
        java.lang.String str16 = locale2.getDisplayCountry(locale9);
        java.lang.String str17 = locale1.getDisplayVariant(locale9);
        java.util.Locale locale19 = java.util.Locale.ENGLISH;
        java.lang.String str20 = locale19.getDisplayLanguage();
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.upperCase("!IH", locale19);
        java.lang.String str22 = locale19.getCountry();
        java.lang.String str23 = locale19.getCountry();
        java.lang.String str24 = locale9.getDisplayCountry(locale19);
        java.util.Locale locale25 = java.util.Locale.GERMAN;
        java.util.Locale locale26 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str27 = locale25.getDisplayName(locale26);
        java.util.Locale locale28 = locale25.stripExtensions();
        java.lang.String str29 = locale19.getDisplayVariant(locale28);
        java.util.Locale locale32 = new java.util.Locale("italian (ITALIAN,English)", "                                                                                                         ");
        java.lang.String str33 = locale19.getDisplayLanguage(locale32);
        java.util.Set<java.lang.String> strSet34 = locale32.getUnicodeLocaleKeys();
        java.lang.String str35 = locale32.getDisplayName();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fr");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "fr");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "en");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "anglais" + "'", str20, "anglais");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "!IH" + "'", str21, "!IH");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "de");
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "allemand" + "'", str27, "allemand");
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "de");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals(locale32.toString(), "italian (italian,english)_                                                                                                         ");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "English" + "'", str33, "English");
        org.junit.Assert.assertNotNull(strSet34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "italian (italian,english) (                                                                                                         )" + "'", str35, "italian (italian,english) (                                                                                                         )");
    }

    @Test
    public void test25331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25331");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("hsilgnE_NAILATI_nailati\\", "\u610f\u5927\u5229\u6587");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test25332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25332");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.split("\\U0020", "allemand");
        int int6 = org.apache.commons.lang3.StringUtils.indexOfAny("\\U0020", strArray5);
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.split("       !IH", '4');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("englisch (         ITALIAN_ITALIAN_ENGLISH,\\u0061)", strArray5, strArray9);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAny("                                                                                                                                                                                                                                                                                   \\u0034\\u0034\\u0034\\u0034\\u0034\\u0034\\u0034\\u0034\\u0034\\hi!       \\u0034\\u0034\\u0034\\u0034\\u0034\\u0034\\u0034\\u0034\\u0034\\", strArray9);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray9, 'a', 30, 997);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 30");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "englisch (         ITALIAN_ITALIAN_ENGLISH,\\u0061)" + "'", str10, "englisch (         ITALIAN_ITALIAN_ENGLISH,\\u0061)");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test25333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25333");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("deutsch");
        java.util.Locale.LanguageRange languageRange3 = new java.util.Locale.LanguageRange("E");
        java.lang.String str4 = languageRange3.getRange();
        java.util.Locale.LanguageRange[] languageRangeArray5 = new java.util.Locale.LanguageRange[] { languageRange1, languageRange3 };
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList6 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList6, languageRangeArray5);
        java.util.Locale locale8 = java.util.Locale.ITALIAN;
        java.lang.String str9 = locale8.getDisplayLanguage();
        java.util.Locale locale10 = locale8.stripExtensions();
        java.lang.String str11 = locale8.getLanguage();
        java.util.Set<java.lang.String> strSet12 = locale8.getUnicodeLocaleKeys();
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.lang.String>) strSet12, "\\u0020iTALIANiTALIANiTALIANiTALI\\u0020iTALIANiTALIANiTALIANiTAL");
        java.util.Locale.FilteringMode filteringMode15 = java.util.Locale.FilteringMode.EXTENDED_FILTERING;
        java.util.List<java.lang.String> strList16 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList6, (java.util.Collection<java.lang.String>) strSet12, filteringMode15);
        java.util.Locale locale17 = java.util.Locale.ITALIAN;
        java.lang.String str18 = locale17.getDisplayLanguage();
        java.util.Locale locale19 = java.util.Locale.ITALIAN;
        java.lang.String str21 = locale19.getExtension('h');
        java.lang.String str22 = locale17.getDisplayCountry(locale19);
        java.util.Set<java.lang.String> strSet23 = locale19.getUnicodeLocaleKeys();
        java.lang.String str25 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.lang.String>) strSet23, "Deutsch");
        java.util.Locale.LanguageRange[] languageRangeArray26 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList27 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList27, languageRangeArray26);
        java.lang.String[] strArray31 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList32 = new java.util.ArrayList<java.lang.String>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList32, strArray31);
        java.util.Locale.FilteringMode filteringMode34 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList35 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList27, (java.util.Collection<java.lang.String>) strList32, filteringMode34);
        java.util.List<java.lang.String> strList36 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList6, (java.util.Collection<java.lang.String>) strSet23, filteringMode34);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap37 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList38 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList6, strMap37);
        java.util.Locale locale39 = java.util.Locale.KOREA;
        java.util.Set<java.lang.String> strSet40 = locale39.getUnicodeLocaleAttributes();
        java.lang.String str41 = locale39.getDisplayLanguage();
        java.util.Set<java.lang.String> strSet42 = locale39.getUnicodeLocaleAttributes();
        java.util.List<java.lang.String> strList43 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList6, (java.util.Collection<java.lang.String>) strSet42);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "e" + "'", str4, "e");
        org.junit.Assert.assertNotNull(languageRangeArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "it");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "italien" + "'", str9, "italien");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "it");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "it" + "'", str11, "it");
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + filteringMode15 + "' != '" + java.util.Locale.FilteringMode.EXTENDED_FILTERING + "'", filteringMode15.equals(java.util.Locale.FilteringMode.EXTENDED_FILTERING));
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "it");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "italien" + "'", str18, "italien");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "it");
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(strSet23);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(languageRangeArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + filteringMode34 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode34.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList35);
        org.junit.Assert.assertNotNull(strList36);
        org.junit.Assert.assertNotNull(languageRangeList38);
        org.junit.Assert.assertNotNull(locale39);
        org.junit.Assert.assertEquals(locale39.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(strSet40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "cor\351en" + "'", str41, "cor\351en");
        org.junit.Assert.assertNotNull(strSet42);
        org.junit.Assert.assertNotNull(strList43);
    }

    @Test
    public void test25334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25334");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("ZH_cnZH_cnZH_cnZH_cnZH_cnZH_cnZH_cnZH_cnZH_cnZH_cnZH_cnZH_cnZH_cnZH_cnZH_cnZH_cnZH_cnZH_cnZH_cnZH_cnZH_cnZH_cnZH_cnZH_cnZH_cnZH_cnZH_cnZH_cnZH_cn", '5');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test25335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25335");
        java.util.Locale locale2 = new java.util.Locale("it_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_I", "                EEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEE                                 EEEEEEEEEEEEEEEEEfr_fr                EEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEE                                 EEEEEEEEEEEEEEEEE");
        org.junit.Assert.assertEquals(locale2.toString(), "it_iit_iit_iit_iit_iit_iit_iit_iit_iit_iit_iit_iit_iit_iit_iit_iit_iit_iit_iit_iit_iit_iit_iit_iit_iit_iit_iit_iit_iit_iit_iit_iit_iit_iit_iit_iit_iit_iit_iit_iit_iit_iit_iit_iit_iit_iit_iit_iit_iit_iit_iit_iit_iit_iit_iit_iit_iit_iit_iit_iit_iit_iit_iit_iit_iit_iit_iit_iit_iit_iit_iit_iit_iit_iit_iit_iit_iit_iit_iit_iit_iit_iit_iit_iit_iit_iit_iit_iit_iit_iit_iit_iit_iit_iit_iit_iit_iit_iit_iit_iit_iit_i_                EEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEE                                 EEEEEEEEEEEEEEEEEFR_FR                EEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEE                                 EEEEEEEEEEEEEEEEE");
    }

    @Test
    public void test25336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25336");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("8600u\\                                 hsiAgE_NAILATI_TiATti                                        ", (int) (byte) 100, 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test25337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25337");
        java.util.Locale locale3 = new java.util.Locale("Cen-G\\u0038zho                         CHD", "NAILATI", "RoyaumeDeutsch\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\-Deutsch\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\Uni");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = locale3.getUnicodeLocaleType("44444444444444444444444444444444!IHaaaaaaaaaaaaaaaaaaaaaaaaFranz\366sisch (Frankreich)aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: 44444444444444444444444444444444!IHaaaaaaaaaaaaaaaaaaaaaaaaFranzo?sisch (Frankreich)aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(locale3.toString(), "cen-g\\u0038zho                         chd_NAILATI_RoyaumeDeutsch\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\-Deutsch\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\Uni");
    }

    @Test
    public void test25338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25338");
        java.util.Locale locale0 = java.util.Locale.ITALIAN;
        java.lang.String str1 = locale0.getDisplayLanguage();
        java.util.Locale locale2 = java.util.Locale.ITALIAN;
        java.lang.String str4 = locale2.getExtension('h');
        java.lang.String str5 = locale0.getDisplayCountry(locale2);
        java.util.Locale locale8 = new java.util.Locale("\\u0066");
        java.lang.String str10 = locale8.getExtension('i');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.lowerCase("Cinese (Cina)\\u0069h...", locale8);
        java.lang.String str12 = locale8.getScript();
        java.lang.String str13 = locale2.getDisplayName(locale8);
        java.lang.String str14 = locale8.getDisplayName();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = locale8.getUnicodeLocaleType("ital");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: ital");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "italien" + "'", str1, "italien");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "it");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals(locale8.toString(), "\\u0066");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "cinese (cina)\\u0069h..." + "'", str11, "cinese (cina)\\u0069h...");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Italian" + "'", str13, "Italian");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\\u0066" + "'", str14, "\\u0066");
    }

    @Test
    public void test25339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25339");
        java.util.Locale locale0 = java.util.Locale.FRENCH;
        java.util.Locale locale1 = java.util.Locale.ENGLISH;
        java.lang.String str2 = locale1.getDisplayCountry();
        java.lang.String str3 = locale0.getDisplayVariant(locale1);
        java.lang.String str4 = locale0.getDisplayCountry();
        java.lang.String str5 = locale0.getScript();
        java.lang.String str6 = locale0.getScript();
        java.util.Locale locale7 = java.util.Locale.FRENCH;
        java.util.Locale locale8 = java.util.Locale.ENGLISH;
        java.lang.String str9 = locale8.getDisplayCountry();
        java.lang.String str10 = locale7.getDisplayVariant(locale8);
        java.lang.String str11 = locale7.getDisplayCountry();
        java.lang.String str12 = locale7.getScript();
        java.lang.String str13 = locale7.getScript();
        java.lang.String str14 = locale0.getDisplayCountry(locale7);
        java.util.Locale.Category category15 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale16 = java.util.Locale.getDefault(category15);
        java.util.Locale locale17 = java.util.Locale.FRANCE;
        java.util.Locale locale18 = java.util.Locale.ITALIAN;
        java.lang.String str20 = locale18.getExtension('h');
        java.lang.String str21 = locale17.getDisplayScript(locale18);
        java.lang.String str22 = locale17.getISO3Country();
        java.util.Locale locale23 = java.util.Locale.GERMAN;
        java.util.Locale.setDefault(locale23);
        java.lang.String str25 = locale17.getDisplayName(locale23);
        java.lang.String str26 = locale17.getScript();
        java.util.Locale.setDefault(category15, locale17);
        java.lang.String str28 = locale0.getDisplayCountry(locale17);
        java.lang.String str29 = locale17.getVariant();
        java.util.Locale locale31 = new java.util.Locale("francese (Canada)");
        java.lang.String str32 = locale17.getDisplayName(locale31);
        java.lang.String str33 = locale31.getISO3Country();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "fr");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "en");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + category15 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category15.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "it");
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "FRA" + "'", str22, "FRA");
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "de");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Franz\366sisch (Frankreich)" + "'", str25, "Franz\366sisch (Frankreich)");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals(locale31.toString(), "francese (canada)");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "French (France)" + "'", str32, "French (France)");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
    }

    @Test
    public void test25340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25340");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("Japonais", "\uc911\uad6d) \r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\uc911\uad6d\uc5b4", 713);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test25341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25341");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("!_\\U0020_itle########################################################################################", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         italian_ITALIAN_EnglisF", 395);
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee8ian\\u0020i86 (ITALIAN (ITALIAN,ENGLISH))eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test25342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25342");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "                                      )HSILGNE,NAILATI( ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test25343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25343");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444544444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "\\u0034\\u00 hcstud \\u0034\\u00");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test25344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25344");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("\\u0039");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=\\u0039");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test25345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25345");
        java.util.Locale locale0 = java.util.Locale.ITALIAN;
        java.lang.String str1 = locale0.getDisplayLanguage();
        java.util.Locale locale2 = locale0.stripExtensions();
        java.util.Locale locale4 = java.util.Locale.forLanguageTag("\\u0020");
        java.lang.String str5 = locale4.getDisplayScript();
        java.lang.String str6 = locale2.getDisplayCountry(locale4);
        java.util.Locale locale8 = new java.util.Locale("\\u0066");
        java.lang.String str10 = locale8.getExtension('i');
        java.lang.String str11 = locale4.getDisplayScript(locale8);
        java.util.Set<java.lang.String> strSet12 = locale4.getUnicodeLocaleAttributes();
        java.util.Locale locale13 = java.util.Locale.FRANCE;
        java.util.Locale locale14 = java.util.Locale.ITALIAN;
        java.lang.String str16 = locale14.getExtension('h');
        java.lang.String str17 = locale13.getDisplayScript(locale14);
        java.util.Locale locale18 = locale13.stripExtensions();
        java.lang.String str19 = locale18.getISO3Country();
        java.util.Locale locale23 = new java.util.Locale(" Italia  Italia  Italia  Italia  Italia  Italia  Italia DEUTSCH Italia  Italia  Italia  Italia  Italia  Italia  Italia  ", "8300u\\", "!ih!ih!ih!ih!ih!ih!ih!ih!ih!ihtedesco    !ih!ih!ih!ih!ih!ih!iJapanese");
        java.lang.String str24 = locale18.getDisplayName(locale23);
        java.lang.String str25 = locale4.getDisplayScript(locale18);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str27 = locale18.getExtension('4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed extension key: 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "italien" + "'", str1, "italien");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "it");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals(locale8.toString(), "\\u0066");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "it");
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "FRA" + "'", str19, "FRA");
        org.junit.Assert.assertEquals(locale23.toString(), " italia  italia  italia  italia  italia  italia  italia deutsch italia  italia  italia  italia  italia  italia  italia  _8300U\\_!ih!ih!ih!ih!ih!ih!ih!ih!ih!ihtedesco    !ih!ih!ih!ih!ih!ih!iJapanese");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "French (France)" + "'", str24, "French (France)");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test25346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25346");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "          tT           T IT ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 28 + "'", int1 == 28);
    }

    @Test
    public void test25347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25347");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.apache.commons.lang3.CharUtils.toIntValue('!');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character ! is not in the range '0' - '9'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test25348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25348");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("Italian", "...alamanaoaqarasatauawaxazbabbbdbebfbgbhbibjblbmbnbobqbrbsbtbvbwbybzcacccdcfcgchcickclcmcncocrcucvcwcxc...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test25349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25349");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("HhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIH", "\u6cd5");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test25350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25350");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("", "#########FranzosischFranzosisch (Frankreich)");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test25351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25351");
        char[] charArray12 = new char[] { '4', '#', '#', 'a', ' ', 'a' };
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray12);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "iTALIAN", charArray12);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "it", charArray12);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsAny("canad", charArray12);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "...ISH ...", charArray12);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "...engengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengeng_                                                                    \\u00...", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "4##a a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "4##a a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[4, #, #, a,  , a]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test25352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25352");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "FrancGa", "FR_frGGGGG");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test25353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25353");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "                              de_de                              ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test25354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25354");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "                                        ittait_italian_egaish                                 \\u006");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test25355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25355");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("INGLESEINGLESEINGLESEINItalia                                                  INGLESEINGLESEINGLESEING", 'T');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test25356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25356");
        java.util.Locale locale1 = java.util.Locale.FRANCE;
        java.util.Locale locale2 = java.util.Locale.ITALIAN;
        java.lang.String str4 = locale2.getExtension('h');
        java.lang.String str5 = locale1.getDisplayScript(locale2);
        java.util.Locale locale6 = locale1.stripExtensions();
        java.util.Locale locale7 = java.util.Locale.getDefault();
        java.lang.String str8 = locale7.getLanguage();
        java.lang.String str9 = locale1.getDisplayCountry(locale7);
        java.lang.String str10 = locale7.getLanguage();
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.lowerCase("\\u0061", locale7);
        java.lang.String str12 = locale7.getDisplayLanguage();
        java.lang.String str13 = locale7.getDisplayCountry();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = locale7.getExtension('4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed extension key: 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "it");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "de");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "de" + "'", str8, "de");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Frankreich" + "'", str9, "Frankreich");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "de" + "'", str10, "de");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\\u0061" + "'", str11, "\\u0061");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "allemand" + "'", str12, "allemand");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test25357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25357");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("...                                              ...", "         0         ", 37);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test25358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25358");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("chinois (Chine)");
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, 'H', 400, 14);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test25359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25359");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "                                        anglais (royaume-uni)FRA                                        ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test25360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25360");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "...!       \\u003dallemandallemandallemandallemandallemandallemandallemandallennnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn\\u003dallemandallemandallemandallemandallemandallemandallemandallennnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn\\u003dallemandallemandallemandallemandallemandallemandallemandallennnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn\\u003dallemandallemandallemandallemandallemandallemandallemandallennnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn\\u003dallemandallemandallemandallemandallemandallemandallemandallennnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn\\u003dallemandallemandallemandallemandallemandallemandallemandallennnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn\\u003dallemandallemandallemandallemandallemandallemandallemandallennnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn\\u003dallemandallemandallemandallemandallemandallemandallemandallennnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn\\u003dallemandallemandallemandallemandallemandallemandallemandallennnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn\\");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test25361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25361");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("                                                                    NC_HZ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test25362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25362");
        java.util.Locale locale1 = new java.util.Locale("\\U0078");
        java.lang.String str2 = locale1.getCountry();
        java.util.Locale locale5 = new java.util.Locale("9hhhhhhhhhh", "\\u0078");
        java.lang.String str6 = locale5.getCountry();
        java.lang.String str7 = locale1.getDisplayScript(locale5);
        java.lang.String str9 = locale5.getExtension('Y');
        java.lang.String str10 = locale5.getDisplayLanguage();
        org.junit.Assert.assertEquals(locale1.toString(), "\\u0078");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals(locale5.toString(), "9hhhhhhhhhh_\\U0078");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\\U0078" + "'", str6, "\\U0078");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "9hhhhhhhhhh" + "'", str10, "9hhhhhhhhhh");
    }

    @Test
    public void test25363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25363");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("francefrancefrancefrancefrancefrancefrancefrancef                 \\u0069hhhhhhhhhh                 ", 221);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test25364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25364");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "Vereinigte Staaten von Amerika");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test25365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25365");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("tit", "GGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGkorezhzhzhzhzhzhzhzhzhzhfraadzhaezhafzhagzhaizhalzhamzhanzhaozhaqzharzhaszhazhzhzhzhzhzhzemandn (south korea)");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "tit" + "'", str2, "tit");
    }

    @Test
    public void test25366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25366");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("grma", 223);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "grma" + "'", str2, "grma");
    }

    @Test
    public void test25367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25367");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("KO", "REHEGEEECEZDODMDKDJDEDZCYCXCWCVCUCRCOCNCMCLCKCICHCGCFCDCCCACZBY");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "REHEGEEECEZDODMDKDJDEDZCYCXCWCVCUCRCOCNCMCLCKCICHCGCFCDCCCACZBY" + "'", str2, "REHEGEEECEZDODMDKDJDEDZCYCXCWCVCUCRCOCNCMCLCKCICHCGCFCDCCCACZBY");
    }

    @Test
    public void test25368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25368");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhanglais (Canada)");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test25369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25369");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("italy");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap2 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList3 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList1, strMap2);
        java.util.List<java.util.Locale.LanguageRange> languageRangeList5 = java.util.Locale.LanguageRange.parse("fr");
        java.lang.String[] strArray9 = new java.lang.String[] { "...ANiTALI", "             ", "          " };
        java.util.ArrayList<java.lang.String> strList10 = new java.util.ArrayList<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList10, strArray9);
        java.util.List<java.lang.String> strList12 = java.util.Locale.filterTags(languageRangeList5, (java.util.Collection<java.lang.String>) strList10);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap13 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList14 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList5, strMap13);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap15 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList16 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList14, strMap15);
        java.util.Locale locale19 = new java.util.Locale("9hhhhhhhhhh", "\\u0078");
        java.util.Set<java.lang.String> strSet20 = locale19.getUnicodeLocaleKeys();
        java.util.List<java.lang.String> strList21 = java.util.Locale.filterTags(languageRangeList14, (java.util.Collection<java.lang.String>) strSet20);
        java.lang.String str22 = java.util.Locale.lookupTag(languageRangeList3, (java.util.Collection<java.lang.String>) strSet20);
        org.junit.Assert.assertNotNull(languageRangeList1);
        org.junit.Assert.assertNotNull(languageRangeList3);
        org.junit.Assert.assertNotNull(languageRangeList5);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(languageRangeList14);
        org.junit.Assert.assertNotNull(languageRangeList16);
        org.junit.Assert.assertEquals(locale19.toString(), "9hhhhhhhhhh_\\U0078");
        org.junit.Assert.assertNotNull(strSet20);
        org.junit.Assert.assertNotNull(strList21);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test25370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25370");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("KOKOKO", "78");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "KOKOKO" + "'", str2, "KOKOKO");
    }

    @Test
    public void test25371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25371");
        java.util.Locale locale0 = java.util.Locale.ITALY;
        java.lang.String str1 = locale0.getScript();
        java.lang.String str2 = locale0.getDisplayCountry();
        java.util.Locale.Category category3 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale4 = java.util.Locale.getDefault(category3);
        java.lang.String str5 = locale4.toLanguageTag();
        java.lang.String str6 = locale0.getDisplayLanguage(locale4);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Italie" + "'", str2, "Italie");
        org.junit.Assert.assertTrue("'" + category3 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category3.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "fr-FR" + "'", str5, "fr-FR");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "italien" + "'", str6, "italien");
    }

    @Test
    public void test25372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25372");
        java.util.Locale locale3 = new java.util.Locale("United Kingdom", "\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u", "EnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglisch");
        java.lang.String str4 = locale3.getLanguage();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "united kingdom" + "'", str4, "united kingdom");
    }

    @Test
    public void test25373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25373");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder2 = builder0.clear();
        java.util.Locale.Builder builder4 = builder2.setScript("");
        java.util.Locale.Builder builder5 = builder4.clear();
        java.util.Locale.Builder builder8 = builder5.setExtension('i', "");
        java.util.Locale.Builder builder10 = builder8.addUnicodeLocaleAttribute("Engl");
        java.util.Locale.Builder builder11 = builder10.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder13 = builder10.setRegion("x-lvariant-ZH");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: x-lvariant-ZH [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test25374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25374");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("dnamezhzhzhzhzhzhzAhzSAhzRAhzQAhzOAhzNAhzMAhzLAhzIAhzGAhzFAhzEAhzDAARFhzhzhzhzhzhzhzhzhzhz", "r0                                               nailati                                                ", 56);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "ANGLAIS (ROYAUME-UNI)", (int) 'N', 105);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test25375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25375");
        java.util.Locale locale1 = new java.util.Locale("talHan");
        boolean boolean3 = locale1.equals((java.lang.Object) "ahzrahzqahzoahznah");
        org.junit.Assert.assertEquals(locale1.toString(), "talhan");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test25376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25376");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("US", "WBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDED...ZHO                                                                    \\u0020iTALIANiTALIANiTALIANiTALI", (int) 'i');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "US" + "'", str3, "US");
    }

    @Test
    public void test25377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25377");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("ZH_cnFrench (Canada)AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", 45, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ZH_cnFrench (Canada)AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str3, "ZH_cnFrench (Canada)AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test25378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25378");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("Koreanisch");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Koreanisc" + "'", str1, "Koreanisc");
    }

    @Test
    public void test25379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25379");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("FRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhAeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee", (int) '\u671d');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test25380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25380");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("fr_FR", "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test25381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25381");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("                                                                                                              italieital");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                                              ITALIEITAL" + "'", str1, "                                                                                                              ITALIEITAL");
    }

    @Test
    public void test25382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25382");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("", "FRA");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test25383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25383");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("                                        itTAiT_ITALIAN_EgAish                                 \\u0068", "    ZH_CN    South Korea");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "itTAiT_ITALIAN_EgAish                                 \\u0068" + "'", str2, "itTAiT_ITALIAN_EgAish                                 \\u0068");
    }

    @Test
    public void test25384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25384");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "ititaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaiitalianititaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitai");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test25385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25385");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("tala");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "TALA" + "'", str1, "TALA");
    }

    @Test
    public void test25386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25386");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("GBR");
        java.lang.String str2 = languageRange1.getRange();
        double double3 = languageRange1.getWeight();
        double double4 = languageRange1.getWeight();
        java.lang.String str5 = languageRange1.getRange();
        java.lang.String str6 = languageRange1.getRange();
        double double7 = languageRange1.getWeight();
        java.lang.String str8 = languageRange1.getRange();
        double double9 = languageRange1.getWeight();
        java.lang.String str10 = languageRange1.getRange();
        double double11 = languageRange1.getWeight();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "gbr" + "'", str2, "gbr");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "gbr" + "'", str5, "gbr");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "gbr" + "'", str6, "gbr");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "gbr" + "'", str8, "gbr");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "gbr" + "'", str10, "gbr");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
    }

    @Test
    public void test25387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25387");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("!_\\U0020_ITLE#########################################################################################", "it", (int) '\u671d');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!_\\U0020_ITLE#########################################################################################" + "'", str3, "!_\\U0020_ITLE#########################################################################################");
    }

    @Test
    public void test25388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25388");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("\\ud504", "Deutscdhi!       5Italienisch5italian_ITALIAN_English5HI!5hi!5ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDED...5\\u00345HI!5Italian5\\u00615\\u00235hi!5iTALIAN5Chinese (China)5hi!5zh_CN5iTALIAN5en5Italienisch");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\ud504" + "'", str2, "\\ud504");
    }

    @Test
    public void test25389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25389");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("                                                                    \\u0020iTALIANiTALIANiTALIANiTALI");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\u0020iTALIANiTALIANiTALIANiTALI" + "'", str1, "\\u0020iTALIANiTALIANiTALIANiTALI");
    }

    @Test
    public void test25390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25390");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "CHINESE (CHINA)", (java.lang.CharSequence) "ih       !ih       !ih       !ih       !ih       !ih   ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test25391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25391");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                                                                                              DEUTSCH", "AD  \\u007");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test25392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25392");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                                             DE_DE                                              ", "\\u0020iIalian\\u008600u\\U\\u0020iIalian\\u0020iUanglaisUFRZ\326CZ(FRKREC)Uialian    U                                                                                                      U!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IUzhzhzhzhzhzhzhzhzhzhFRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhAzhzhzhzhzhzhzhzhzhzhUFRZ\326CZ(FRKREC)Ucinese (Cina)\\u0069hhhhhhhhhh\\u0069hhhhhhhhhh\\u0069hhhhhhhhhh\\u0069hhU         ITALIAN_ITALIAN_ENGLISH         ITALIAN_!IHITTAIT_ITALIAN_EGAISHU                                      ...", (int) 'f');
        java.lang.Class<?> wildcardClass4 = strArray3.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test25393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25393");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDED...", "\\U0020IiTALIAN\\U0020I                                                 ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test25394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25394");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '-');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character - is not in the range '0' - '9'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test25395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25395");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.util.Locale locale1 = java.util.Locale.ITALIAN;
        java.lang.String str3 = locale1.getExtension('h');
        java.lang.String str4 = locale0.getDisplayScript(locale1);
        java.util.Locale locale5 = locale0.stripExtensions();
        java.util.Locale locale6 = java.util.Locale.getDefault();
        java.lang.String str7 = locale6.getLanguage();
        java.lang.String str8 = locale0.getDisplayCountry(locale6);
        java.util.Set<java.lang.String> strSet9 = locale0.getUnicodeLocaleAttributes();
        java.lang.String str11 = locale0.getExtension('I');
        java.util.Set<java.lang.String> strSet12 = locale0.getUnicodeLocaleKeys();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "it");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "de");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "de" + "'", str7, "de");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Frankreich" + "'", str8, "Frankreich");
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(strSet12);
    }

    @Test
    public void test25396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25396");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("\\u007");
        java.util.Locale.Builder builder2 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder3 = builder2.clearExtensions();
        java.util.Locale locale4 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str5 = locale4.getDisplayName();
        java.util.Locale.Builder builder6 = builder3.setLocale(locale4);
        java.util.Locale locale7 = java.util.Locale.GERMANY;
        java.util.Locale.Builder builder8 = builder3.setLocale(locale7);
        java.util.Set<java.lang.String> strSet9 = locale7.getUnicodeLocaleAttributes();
        java.lang.String str10 = locale7.getVariant();
        java.util.Locale locale11 = java.util.Locale.ITALIAN;
        java.lang.String str12 = locale11.getDisplayLanguage();
        java.lang.String str13 = locale7.getDisplayLanguage(locale11);
        java.lang.String str14 = locale1.getDisplayLanguage(locale11);
        java.util.Set<java.lang.Character> charSet15 = locale1.getExtensionKeys();
        java.lang.String str16 = locale1.getDisplayName();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "fran\347ais (Canada)" + "'", str5, "fran\347ais (Canada)");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "de_DE");
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "it");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "italien" + "'", str12, "italien");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "tedesco" + "'", str13, "tedesco");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(charSet15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test25397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25397");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("##########", (int) 'a', 120);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "##########" + "'", str3, "##########");
    }

    @Test
    public void test25398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25398");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("AzhzhzhzhzhzhzhzhzhzhADAAEAAFAAGAAIAALAAMAANAAOAAQAARAASAATAAUAAWAAXAAZABAABBhcstueDNABOABQABRABSABTABVABWABYABZACAACCACDACFACGACHACIACKACLACMACNACOACRACUACVACWACXACYACZADEADJADKADMADOADZAECAEEAEGAEHAERAESAETAFIAFJAFKAFMAFOAFRAGAAGBAGDAGEAGFAGGAGHAGIAGLAGMAGNAGPAGQAGRAGSAGTAGUAGWAGYAHKAHMAHNAHRAHTAHUAIDAIEAILAIMAINAIOAIQAIRAISAITAJEAJMAJOAJPAKEAKGAKHAKIAKMAKNAKPAKRAKWAKYAKZALAALBALCALIALKALRALSALTALUALVALYAMAAMCAMDAMEAMFAMGAMHAMKAMLAMMAMNAMOAMPAMQAMRAMSAMTAMUAMVAMWAMXAMYAMZANAANCANEANFANGANIANLANOANPANRANUANZAOMAPAAPEAPFAPGAPHAPKAPLAPMAPNAPRAPSAPTAPWAPYAQAAREAROARSARUARWASAASBASCASDASEASGASHASIASJASKASLASMASNASOASRASSASTASVASXASYASZATCATDATFATGATHATJATKATLATMATNATOATRATTATVATWATZAUAAUGAUMAUSAUYAUZAVAAVCAVEAVGAVIAVNAVUAWFAWSAYEAYTAZAAZMAZW", 103, "Chinesisch (Ch");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "AzhzhzhzhzhzhzhzhzhzhADAAEAAFAAGAAIAALAAMAANAAOAAQAARAASAATAAUAAWAAXAAZABAABBhcstueDNABOABQABRABSABTABVABWABYABZACAACCACDACFACGACHACIACKACLACMACNACOACRACUACVACWACXACYACZADEADJADKADMADOADZAECAEEAEGAEHAERAESAETAFIAFJAFKAFMAFOAFRAGAAGBAGDAGEAGFAGGAGHAGIAGLAGMAGNAGPAGQAGRAGSAGTAGUAGWAGYAHKAHMAHNAHRAHTAHUAIDAIEAILAIMAINAIOAIQAIRAISAITAJEAJMAJOAJPAKEAKGAKHAKIAKMAKNAKPAKRAKWAKYAKZALAALBALCALIALKALRALSALTALUALVALYAMAAMCAMDAMEAMFAMGAMHAMKAMLAMMAMNAMOAMPAMQAMRAMSAMTAMUAMVAMWAMXAMYAMZANAANCANEANFANGANIANLANOANPANRANUANZAOMAPAAPEAPFAPGAPHAPKAPLAPMAPNAPRAPSAPTAPWAPYAQAAREAROARSARUARWASAASBASCASDASEASGASHASIASJASKASLASMASNASOASRASSASTASVASXASYASZATCATDATFATGATHATJATKATLATMATNATOATRATTATVATWATZAUAAUGAUMAUSAUYAUZAVAAVCAVEAVGAVIAVNAVUAWFAWSAYEAYTAZAAZMAZW" + "'", str3, "AzhzhzhzhzhzhzhzhzhzhADAAEAAFAAGAAIAALAAMAANAAOAAQAARAASAATAAUAAWAAXAAZABAABBhcstueDNABOABQABRABSABTABVABWABYABZACAACCACDACFACGACHACIACKACLACMACNACOACRACUACVACWACXACYACZADEADJADKADMADOADZAECAEEAEGAEHAERAESAETAFIAFJAFKAFMAFOAFRAGAAGBAGDAGEAGFAGGAGHAGIAGLAGMAGNAGPAGQAGRAGSAGTAGUAGWAGYAHKAHMAHNAHRAHTAHUAIDAIEAILAIMAINAIOAIQAIRAISAITAJEAJMAJOAJPAKEAKGAKHAKIAKMAKNAKPAKRAKWAKYAKZALAALBALCALIALKALRALSALTALUALVALYAMAAMCAMDAMEAMFAMGAMHAMKAMLAMMAMNAMOAMPAMQAMRAMSAMTAMUAMVAMWAMXAMYAMZANAANCANEANFANGANIANLANOANPANRANUANZAOMAPAAPEAPFAPGAPHAPKAPLAPMAPNAPRAPSAPTAPWAPYAQAAREAROARSARUARWASAASBASCASDASEASGASHASIASJASKASLASMASNASOASRASSASTASVASXASYASZATCATDATFATGATHATJATKATLATMATNATOATRATTATVATWATZAUAAUGAUMAUSAUYAUZAVAAVCAVEAVGAVIAVNAVUAWFAWSAYEAYTAZAAZMAZW");
    }

    @Test
    public void test25399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25399");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                                              \\     ", "");
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("Deutsch", 'i');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.replaceEach("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444en", strArray4, strArray7);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.startsWithAny("CINESE (cINA)", strArray4);
        java.lang.String[] strArray11 = org.apache.commons.lang3.StringUtils.stripAll(strArray4, "\\U005");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444en" + "'", str8, "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444en");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strArray11);
    }

    @Test
    public void test25400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25400");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("T", 77, 'N');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "TNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN" + "'", str3, "TNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN");
    }

    @Test
    public void test25401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25401");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("\\u0059", "5");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\u0059" + "'", str2, "\\u0059");
    }

    @Test
    public void test25402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25402");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat("ITALIAN_italian_eNGLISH         ITALIAN_!IHitTAiT_ITALIAN_EgAish", 4);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ITALIAN_italian_eNGLISH         ITALIAN_!IHitTAiT_ITALIAN_EgAishITALIAN_italian_eNGLISH         ITALIAN_!IHitTAiT_ITALIAN_EgAishITALIAN_italian_eNGLISH         ITALIAN_!IHitTAiT_ITALIAN_EgAishITALIAN_italian_eNGLISH         ITALIAN_!IHitTAiT_ITALIAN_EgAish" + "'", str2, "ITALIAN_italian_eNGLISH         ITALIAN_!IHitTAiT_ITALIAN_EgAishITALIAN_italian_eNGLISH         ITALIAN_!IHitTAiT_ITALIAN_EgAishITALIAN_italian_eNGLISH         ITALIAN_!IHitTAiT_ITALIAN_EgAishITALIAN_italian_eNGLISH         ITALIAN_!IHitTAiT_ITALIAN_EgAish");
    }

    @Test
    public void test25403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25403");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("ITALIAN_italian_eNGLISH         ITALIAN_!IHitTAiT_ITALIAN_EgAish", "i\\u0020italianitalianitalianitaliit         \\", 16);
        boolean boolean6 = org.apache.commons.lang3.StringUtils.endsWithAny("aDAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDEDh...", strArray5);
        java.lang.String[] strArray9 = java.util.Locale.getISOCountries();
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray9);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray9);
        java.lang.String[] strArray12 = org.apache.commons.lang3.StringUtils.stripAll(strArray9);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray12, 'H', (int) (byte) 100, (int) '\\');
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAny("Italy", strArray12);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAny("", strArray12);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = org.apache.commons.lang3.StringUtils.replaceEach("    IIIIIIIIII...........................", strArray5, strArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 16 vs 250");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDEDJDKDMDODZECEEEGEHERESETFIFJFKFMFOFRGAGBGDGEGFGGGHGIGLGMGNGPGQGRGSGTGUGWGYHKHMHNHRHTHUIDIEILIMINIOIQIRISITJEJMJOJPKEKGKHKIKMKNKPKRKWKYKZLALBLCLILKLRLSLTLULVLYMAMCMDMEMFMGMHMKMLMMMNMOMPMQMRMSMTMUMVMWMXMYMZNANCNENFNGNINLNONPNRNUNZOMPAPEPFPGPHPKPLPMPNPRPSPTPWPYQARERORSRURWSASBSCSDSESGSHSISJSKSLSMSNSOSRSSSTSVSXSYSZTCTDTFTGTHTJTKTLTMTNTOTRTTTVTWTZUAUGUMUSUYUZVAVCVEVGVIVNVUWFWSYEYTZAZMZW" + "'", str10, "ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDEDJDKDMDODZECEEEGEHERESETFIFJFKFMFOFRGAGBGDGEGFGGGHGIGLGMGNGPGQGRGSGTGUGWGYHKHMHNHRHTHUIDIEILIMINIOIQIRISITJEJMJOJPKEKGKHKIKMKNKPKRKWKYKZLALBLCLILKLRLSLTLULVLYMAMCMDMEMFMGMHMKMLMMMNMOMPMQMRMSMTMUMVMWMXMYMZNANCNENFNGNINLNONPNRNUNZOMPAPEPFPGPHPKPLPMPNPRPSPTPWPYQARERORSRURWSASBSCSDSESGSHSISJSKSLSMSNSOSRSSSTSVSXSYSZTCTDTFTGTHTJTKTLTMTNTOTRTTTVTWTZUAUGUMUSUYUZVAVCVEVGVIVNVUWFWSYEYTZAZMZW");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDEDJDKDMDODZECEEEGEHERESETFIFJFKFMFOFRGAGBGDGEGFGGGHGIGLGMGNGPGQGRGSGTGUGWGYHKHMHNHRHTHUIDIEILIMINIOIQIRISITJEJMJOJPKEKGKHKIKMKNKPKRKWKYKZLALBLCLILKLRLSLTLULVLYMAMCMDMEMFMGMHMKMLMMMNMOMPMQMRMSMTMUMVMWMXMYMZNANCNENFNGNINLNONPNRNUNZOMPAPEPFPGPHPKPLPMPNPRPSPTPWPYQARERORSRURWSASBSCSDSESGSHSISJSKSLSMSNSOSRSSSTSVSXSYSZTCTDTFTGTHTJTKTLTMTNTOTRTTTVTWTZUAUGUMUSUYUZVAVCVEVGVIVNVUWFWSYEYTZAZMZW" + "'", str11, "ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDEDJDKDMDODZECEEEGEHERESETFIFJFKFMFOFRGAGBGDGEGFGGGHGIGLGMGNGPGQGRGSGTGUGWGYHKHMHNHRHTHUIDIEILIMINIOIQIRISITJEJMJOJPKEKGKHKIKMKNKPKRKWKYKZLALBLCLILKLRLSLTLULVLYMAMCMDMEMFMGMHMKMLMMMNMOMPMQMRMSMTMUMVMWMXMYMZNANCNENFNGNINLNONPNRNUNZOMPAPEPFPGPHPKPLPMPNPRPSPTPWPYQARERORSRURWSASBSCSDSESGSHSISJSKSLSMSNSOSRSSSTSVSXSYSZTCTDTFTGTHTJTKTLTMTNTOTRTTTVTWTZUAUGUMUSUYUZVAVCVEVGVIVNVUWFWSYEYTZAZMZW");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test25404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25404");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "xxxxxxxxxxxxxxxxxx                                                   ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "xxxxxxxxxxxxxxxxxx                                                   " + "'", str1, "xxxxxxxxxxxxxxxxxx                                                   ");
    }

    @Test
    public void test25405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25405");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "            \\u0020iItalian\\u0020i                                                 ", (java.lang.CharSequence) "italian_ITALIAN_English");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test25406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25406");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("EAGAASH", '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "EAGAASH" + "'", str2, "EAGAASH");
    }

    @Test
    public void test25407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25407");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("fr-cafr-cafr-cafr-cafr-cafr-cafr-cafr-cafr-cafr-cafr-cafr\\u000dfr-cafr-cafr-cafr-cafr-cafr-cafr-cafr-cafr-cafr-cafr-cafr");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "FR-CAFR-CAFR-CAFR-CAFR-CAFR-CAFR-CAFR-CAFR-CAFR-CAFR-CAFR\\U000DFR-CAFR-CAFR-CAFR-CAFR-CAFR-CAFR-CAFR-CAFR-CAFR-CAFR-CAFR" + "'", str1, "FR-CAFR-CAFR-CAFR-CAFR-CAFR-CAFR-CAFR-CAFR-CAFR-CAFR-CAFR\\U000DFR-CAFR-CAFR-CAFR-CAFR-CAFR-CAFR-CAFR-CAFR-CAFR-CAFR-CAFR");
    }

    @Test
    public void test25408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25408");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("44444444444444444444444444444444444444444444it                   ", 73);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44444444444444444444444444444444444444444444it                           " + "'", str2, "44444444444444444444444444444444444444444444it                           ");
    }

    @Test
    public void test25409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25409");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("44444444444\\U0020ITALIANITALIANITALIANITALI\\U0020ITALIANITALIANITALIANITALHcsineilatI444444444444", "ecanadaGcanadacanadaSH");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test25410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25410");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("\\aUa0046", '\\');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test25411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25411");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "e             g                                                                                     ", "                    fRENCH (fRANCE)                                                \\u0068");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test25412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25412");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("AnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihC", "TNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN", "hi!       5Italienisch5italian_ITALIAN_English5HI!5hi!5ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDED...5\\u00345HI!5Italian5\\u00615\\u00235hi!5iTALIAN5Chinese (China)5hi!5zh_CN5iTALIAN5en5Italienischhi!       5Italienisch5italian_ITALIAN_English5HI!5hi!5ADAEAFAGAIALAMANAOAQARASATAUAWAXAGermanhi!       5Italienisch5italian_ITALIAN_English5HI!5hi!5ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDED...5\\u00345HI!5Italian5\\u00615\\u00235hi!5iTALIAN5Chinese (China)5hi!5zh_CN5iTALIAN5en5Italienischhi!       5Italienisch5italian_ITALIAN_English5HI!5hi!5ADAEAFAGAIALAMANAOAQARASATAUAWAXA");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "AnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihC" + "'", str3, "AnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihC");
    }

    @Test
    public void test25413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25413");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069!IH\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\engli", (java.lang.CharSequence) "HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test25414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25414");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "\\u0068");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test25415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25415");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("nglish ...hi!allemanditalienischallemanditalian_italian_englishallemandhi!allemandhi!allemandadaeafagaialamanaoaqarasatauawaxazbabbbdbebfbgbhbibjblbmbnbobqbrbsbtbvbwbybzcacccdcfcgchcickclcmcncocrcucvcwcxcyczded...allemand\\u0034allemandhi!allemanditalianallemand\\u0061allemand\\u0023allemandhi!allemanditalianallemandchinese(china)allemandhi!allemandzh_cnallemanditalianallemandenallemanditalienischhi!allemanditalienischallemanditalian_italian_englishallemandhi!allemandhi!allemandadaeafagaialamanaoa", "hi!        Italienisch italian_ITALIAN_English HI! hi! ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDED... \\u0034 HI! Italian \\u0061 \\u0023 hi! iTALIAN Chinese (China) hi! zh_CN iTALIAN en Italienisch");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test25416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25416");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("\\                                               nailati                                              ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\                                               NAILATI                                              " + "'", str1, "\\                                               NAILATI                                              ");
    }

    @Test
    public void test25417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25417");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("44d444", "                                                                 \\U0020  ", 15);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test25418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25418");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("ian\\u0020", "aaaaaaaaaaaaaaaaaaaaaaaaaaILATiNA...aaaaaaaaaaaaaaaaaaaaaaaaaa");
        int int4 = org.apache.commons.lang3.StringUtils.indexOfAny("ITALIEN", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test25419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25419");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("Deutsch");
        java.util.Locale.setDefault(locale1);
        java.util.Locale.Builder builder4 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder5 = builder4.clearExtensions();
        java.util.Locale.Builder builder7 = builder4.setLanguageTag("Italian");
        java.util.Locale.Builder builder8 = builder4.clearExtensions();
        java.util.Locale.Builder builder9 = builder4.clear();
        java.util.Locale.Builder builder10 = builder4.clearExtensions();
        java.util.Locale locale11 = java.util.Locale.ITALIAN;
        java.lang.String str12 = locale11.getDisplayLanguage();
        java.util.Locale locale13 = locale11.stripExtensions();
        java.util.Locale locale15 = java.util.Locale.forLanguageTag("\\u0020");
        java.lang.String str16 = locale15.getDisplayScript();
        java.lang.String str17 = locale13.getDisplayCountry(locale15);
        java.util.Set<java.lang.Character> charSet18 = locale13.getExtensionKeys();
        java.util.Locale.Builder builder19 = builder4.setLocale(locale13);
        java.util.Locale.Category category20 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale21 = java.util.Locale.getDefault(category20);
        java.util.Locale locale22 = java.util.Locale.FRANCE;
        java.util.Locale locale23 = java.util.Locale.ITALIAN;
        java.lang.String str25 = locale23.getExtension('h');
        java.lang.String str26 = locale22.getDisplayScript(locale23);
        java.lang.String str27 = locale22.getISO3Country();
        java.util.Locale locale28 = java.util.Locale.GERMAN;
        java.util.Locale.setDefault(locale28);
        java.lang.String str30 = locale22.getDisplayName(locale28);
        java.lang.String str31 = locale22.getScript();
        java.util.Locale.setDefault(category20, locale22);
        java.util.Set<java.lang.String> strSet33 = locale22.getUnicodeLocaleKeys();
        java.lang.String str34 = locale22.getCountry();
        java.util.Locale locale35 = locale22.stripExtensions();
        java.util.Locale.Builder builder36 = builder4.setLocale(locale35);
        java.lang.String str37 = org.apache.commons.lang3.StringUtils.lowerCase("KO", locale35);
        java.lang.String str38 = locale35.toLanguageTag();
        java.lang.String str39 = locale1.getDisplayLanguage(locale35);
        java.lang.String str40 = locale1.getDisplayLanguage();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "deutsch");
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "it");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Italian" + "'", str12, "Italian");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "it");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(charSet18);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertTrue("'" + category20 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category20.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "deutsch");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "it");
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "FRA" + "'", str27, "FRA");
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "de");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Franz\366sisch (Frankreich)" + "'", str30, "Franz\366sisch (Frankreich)");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNotNull(strSet33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "FR" + "'", str34, "FR");
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "ko" + "'", str37, "ko");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "fr-FR" + "'", str38, "fr-FR");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "deutsch" + "'", str39, "deutsch");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "deutsch" + "'", str40, "deutsch");
    }

    @Test
    public void test25420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25420");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "Chinese (China)                                                                                                           ", (java.lang.CharSequence) "c");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "Chinese (China)                                                                                                           " + "'", charSequence2, "Chinese (China)                                                                                                           ");
    }

    @Test
    public void test25421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25421");
        java.util.Locale locale2 = java.util.Locale.getDefault();
        java.lang.String str3 = locale2.getDisplayName();
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.upperCase("tTAT_ITA", locale2);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.lowerCase("                                                                                               en", locale2);
        java.util.Locale locale9 = new java.util.Locale("\\u0023", "Italienisch", "iTALIAN");
        java.lang.String str10 = locale2.getDisplayScript(locale9);
        java.lang.String str12 = locale9.getExtension('F');
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "de");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "allemand" + "'", str3, "allemand");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "TTAT_ITA" + "'", str4, "TTAT_ITA");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "                                                                                               en" + "'", str5, "                                                                                               en");
        org.junit.Assert.assertEquals(locale9.toString(), "\\u0023_ITALIENISCH_iTALIAN");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test25422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25422");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("ITALIEITALNC_HZ\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rITALIEITAL", 328);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                              ITALIEITALNC_HZ\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rITALIEITAL" + "'", str2, "                                                                                                                                                                                                              ITALIEITALNC_HZ\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rITALIEITAL");
    }

    @Test
    public void test25423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25423");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC\\u00d\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\U0020ITALIANITALIANITALIANITALI\\U0020ITALIANITALIANITALIANITAL\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\u00CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC", "                                                                               ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test25424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25424");
        java.util.Locale locale3 = new java.util.Locale("fr_FR", "\ub3c5\uc77c\uc5b4", "hcsineilati");
        java.util.Locale locale4 = locale3.stripExtensions();
        java.util.Locale.Builder builder5 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder6 = builder5.clearExtensions();
        java.util.Locale.Builder builder8 = builder5.setLanguageTag("Italian");
        java.util.Locale.Builder builder9 = builder5.clearExtensions();
        java.util.Locale.Builder builder10 = builder5.clear();
        java.util.Locale.Builder builder11 = builder5.clearExtensions();
        java.util.Locale locale12 = java.util.Locale.ITALIAN;
        java.lang.String str13 = locale12.getDisplayLanguage();
        java.util.Locale locale14 = locale12.stripExtensions();
        java.util.Locale locale16 = java.util.Locale.forLanguageTag("\\u0020");
        java.lang.String str17 = locale16.getDisplayScript();
        java.lang.String str18 = locale14.getDisplayCountry(locale16);
        java.util.Set<java.lang.Character> charSet19 = locale14.getExtensionKeys();
        java.util.Locale.Builder builder20 = builder5.setLocale(locale14);
        java.util.Locale.Category category21 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale22 = java.util.Locale.getDefault(category21);
        java.util.Locale locale23 = java.util.Locale.FRANCE;
        java.util.Locale locale24 = java.util.Locale.ITALIAN;
        java.lang.String str26 = locale24.getExtension('h');
        java.lang.String str27 = locale23.getDisplayScript(locale24);
        java.lang.String str28 = locale23.getISO3Country();
        java.util.Locale locale29 = java.util.Locale.GERMAN;
        java.util.Locale.setDefault(locale29);
        java.lang.String str31 = locale23.getDisplayName(locale29);
        java.lang.String str32 = locale23.getScript();
        java.util.Locale.setDefault(category21, locale23);
        java.util.Set<java.lang.String> strSet34 = locale23.getUnicodeLocaleKeys();
        java.lang.String str35 = locale23.getCountry();
        java.util.Locale locale36 = locale23.stripExtensions();
        java.util.Locale.Builder builder37 = builder5.setLocale(locale36);
        java.lang.String str38 = locale4.getDisplayLanguage(locale36);
        java.lang.String str39 = locale4.getCountry();
// flaky:         org.junit.Assert.assertEquals(locale3.toString(), "\ub3c5\uc77c\uc5b4_hcsineilati");
        org.junit.Assert.assertNotNull(locale4);
// flaky:         org.junit.Assert.assertEquals(locale4.toString(), "\ub3c5\uc77c\uc5b4_hcsineilati");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "it");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "italien" + "'", str13, "italien");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "it");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(charSet19);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertTrue("'" + category21 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category21.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "it");
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "FRA" + "'", str28, "FRA");
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "de");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Franz\366sisch (Frankreich)" + "'", str31, "Franz\366sisch (Frankreich)");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(strSet34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "FR" + "'", str35, "FR");
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "fr_fr" + "'", str38, "fr_fr");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "\ub3c5\uc77c\uc5b4" + "'", str39, "\ub3c5\uc77c\uc5b4");
    }

    @Test
    public void test25425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25425");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "...anitalij...anitalij...anitalij...anitalij...anitalij...anitalij...anitalij...anitalij...anitali");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test25426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25426");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("\\U0046\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\", "cccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccc...");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test25427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25427");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("                                                                                                                                                                                                                                                                                                                                                                   tit                                                                                                                                                                                                                                                                                                                                                                   ", "Hhhhhhhhh", "\\U0020ITALIANITALIANITALIANITALI\\U0020ITALIANITALIANITALIANITALI\\U0020ITALIANITALIANITALIANITALI\\U0020ITALIANITALIANITALIANITALI\\U0020ITALIANITALIANITALIANITALI");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                   tit                                                                                                                                                                                                                                                                                                                                                                   " + "'", str3, "                                                                                                                                                                                                                                                                                                                                                                   tit                                                                                                                                                                                                                                                                                                                                                                   ");
    }

    @Test
    public void test25428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25428");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "          2cinese (cina)italianitalianitalianital", (java.lang.CharSequence) "cccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccc");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test25429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25429");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("!IH", "       !IH", (int) (byte) 1);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray5, 'i', (int) (byte) 10, 0);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.startsWithAny("                                  \\u005c                                                         ", strArray5);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray5);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny("0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000deutsch\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\", strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "!IH" + "'", str11, "!IH");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test25430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25430");
        java.util.Locale locale0 = java.util.Locale.ITALY;
        java.lang.String str1 = locale0.toLanguageTag();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "it-IT" + "'", str1, "it-IT");
    }

    @Test
    public void test25431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25431");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("                                                               \\U0020");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test25432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25432");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!itTAiT_ITALIAN_EgAish!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\\u0068", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test25433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25433");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("HIAN\\U0020Ih", strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=hian\\u0020ih");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test25434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25434");
        java.util.Locale locale0 = java.util.Locale.GERMAN;
        java.util.Locale locale1 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str2 = locale0.getDisplayName(locale1);
        java.util.Locale locale3 = locale0.stripExtensions();
        java.lang.String str4 = locale3.getDisplayName();
        java.lang.String str5 = locale3.getDisplayCountry();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "de");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "allemand" + "'", str2, "allemand");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "de");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "allemand" + "'", str4, "allemand");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test25435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25435");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC" + "'", str1, "CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC");
    }

    @Test
    public void test25436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25436");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("\u1111\u1173\u1105\u1161\u11bc\u1109\u1173\u110b\u1165\u110f\u1162\u1102\u1161\u1103\u1161)_ENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENG_                                                                    \\u0020iTALIANiTALIANiTALIANiTAL", "ITALIAN_it  i  _ NGLISHITALIAN_ IHitTAiT_ITALIAN_EgAish", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test25437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25437");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("hsiAgE_NAILATI_TiATtiHI!_NAILATI         HSILGNe_nailati_NAILATI         HHHHHHHH", "tTAT_ITA                                                                                                ", "\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\u00de\\u00\\u00de\\u00\\u00d         INGLESE        \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hsiAgE_NAILATI_TiATtiHI!_NAILATI         HSILGNe_nailati_NAILATI         HHHHHHHH" + "'", str3, "hsiAgE_NAILATI_TiATtiHI!_NAILATI         HSILGNe_nailati_NAILATI         HHHHHHHH");
    }

    @Test
    public void test25438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25438");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("ITALIAN (italian,eNGLISH)", "kkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkEDkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkEDkk", 29);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test25439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25439");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("                                                                                                              ...", "chinese");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                              ..." + "'", str2, "                                                                                                              ...");
    }

    @Test
    public void test25440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25440");
        java.util.Locale locale0 = java.util.Locale.ITALY;
        java.lang.String str1 = locale0.getScript();
        java.lang.String str2 = locale0.getDisplayCountry();
        java.util.Locale locale4 = java.util.Locale.FRENCH;
        java.util.Locale locale5 = java.util.Locale.ENGLISH;
        java.lang.String str6 = locale5.getDisplayCountry();
        java.lang.String str7 = locale4.getDisplayVariant(locale5);
        java.lang.String str8 = locale4.getDisplayCountry();
        java.lang.String str9 = locale4.getScript();
        java.lang.String str10 = locale4.getScript();
        java.util.Locale locale11 = java.util.Locale.FRENCH;
        java.util.Locale locale12 = java.util.Locale.ENGLISH;
        java.lang.String str13 = locale12.getDisplayCountry();
        java.lang.String str14 = locale11.getDisplayVariant(locale12);
        java.lang.String str15 = locale11.getDisplayCountry();
        java.lang.String str16 = locale11.getScript();
        java.lang.String str17 = locale11.getScript();
        java.lang.String str18 = locale4.getDisplayCountry(locale11);
        java.util.Locale.Category category19 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale20 = java.util.Locale.getDefault(category19);
        java.util.Locale locale21 = java.util.Locale.FRANCE;
        java.util.Locale locale22 = java.util.Locale.ITALIAN;
        java.lang.String str24 = locale22.getExtension('h');
        java.lang.String str25 = locale21.getDisplayScript(locale22);
        java.lang.String str26 = locale21.getISO3Country();
        java.util.Locale locale27 = java.util.Locale.GERMAN;
        java.util.Locale.setDefault(locale27);
        java.lang.String str29 = locale21.getDisplayName(locale27);
        java.lang.String str30 = locale21.getScript();
        java.util.Locale.setDefault(category19, locale21);
        java.lang.String str32 = locale4.getDisplayCountry(locale21);
        java.lang.String str33 = locale21.getCountry();
        java.lang.String str34 = org.apache.commons.lang3.StringUtils.upperCase("\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069!ih\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\", locale21);
        java.util.Locale locale35 = locale21.stripExtensions();
        java.util.Locale locale37 = new java.util.Locale("\\u005c");
        java.util.Locale locale39 = java.util.Locale.CHINESE;
        java.lang.String str40 = org.apache.commons.lang3.StringUtils.lowerCase("Franz\366sisch (Frankreich)", locale39);
        java.lang.String str41 = locale39.getVariant();
        java.lang.String str42 = locale37.getDisplayScript(locale39);
        java.lang.String str43 = locale21.getDisplayLanguage(locale39);
        java.lang.String str44 = locale39.toLanguageTag();
        java.lang.String str45 = locale39.getDisplayName();
        java.lang.String str46 = locale0.getDisplayVariant(locale39);
        java.lang.String str47 = locale39.getDisplayLanguage();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Italie" + "'", str2, "Italie");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "fr");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "fr");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "en");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + category19 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category19.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "it");
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "FRA" + "'", str26, "FRA");
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "de");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Franz\366sisch (Frankreich)" + "'", str29, "Franz\366sisch (Frankreich)");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "FR" + "'", str33, "FR");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069!IH\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069\\" + "'", str34, "\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069!IH\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069\\");
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "fr_FR");
        org.junit.Assert.assertEquals(locale37.toString(), "\\u005c");
        org.junit.Assert.assertNotNull(locale39);
        org.junit.Assert.assertEquals(locale39.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "franz\366sisch (frankreich)" + "'", str40, "franz\366sisch (frankreich)");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "\u6cd5\u6587" + "'", str43, "\u6cd5\u6587");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "zh" + "'", str44, "zh");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "chinois" + "'", str45, "chinois");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "chinois" + "'", str47, "chinois");
    }

    @Test
    public void test25441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25441");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("n       nn", "\\u0037");
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("Eagaash", "h", (int) 'f');
        boolean boolean9 = org.apache.commons.lang3.StringUtils.endsWithAny("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaafraaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", strArray8);
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.stripAll(strArray8);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = org.apache.commons.lang3.StringUtils.replaceEach("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         italian_ITALIAN_EnglisF", strArray3, strArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 1 vs 2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test25442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25442");
        java.util.Locale locale2 = new java.util.Locale("iTALIE                         ", "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rz...\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r");
        java.util.Locale locale5 = new java.util.Locale("italian (ITALIAN,English)", "                                                                                                         ");
        java.util.Locale locale6 = java.util.Locale.CANADA_FRENCH;
        java.util.Set<java.lang.String> strSet7 = locale6.getUnicodeLocaleKeys();
        java.lang.String str8 = locale6.toLanguageTag();
        java.lang.String str9 = locale5.getDisplayLanguage(locale6);
        java.lang.String str10 = locale2.getDisplayName(locale6);
        java.util.Locale locale14 = new java.util.Locale("Italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian", "z...", "1");
        java.lang.String str15 = locale2.getDisplayName(locale14);
        org.junit.Assert.assertEquals(locale2.toString(), "italie                         _\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rZ...\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r");
        org.junit.Assert.assertEquals(locale5.toString(), "italian (italian,english)_                                                                                                         ");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "fr_CA");
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "fr-CA" + "'", str8, "fr-CA");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "italian (italian,english)" + "'", str9, "italian (italian,english)");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "italie                          (\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rZ...\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r)" + "'", str10, "italie                          (\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rZ...\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r)");
        org.junit.Assert.assertEquals(locale14.toString(), "italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian_Z..._1");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "italie                          (\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rZ...\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r)" + "'", str15, "italie                          (\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rZ...\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r)");
    }

    @Test
    public void test25443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25443");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("hi!");
        java.lang.String str2 = locale1.getCountry();
        java.util.Locale.Builder builder3 = new java.util.Locale.Builder();
        java.util.Locale locale4 = builder3.build();
        java.util.Locale locale6 = java.util.Locale.forLanguageTag("Italian");
        java.lang.String str7 = locale4.getDisplayLanguage(locale6);
        java.lang.String str8 = locale1.getDisplayLanguage(locale4);
        java.lang.String str9 = locale1.getDisplayVariant();
        java.lang.String str10 = locale1.getDisplayVariant();
        java.util.Locale locale11 = java.util.Locale.ITALIAN;
        java.lang.String str12 = locale11.getDisplayLanguage();
        java.util.Locale locale13 = locale11.stripExtensions();
        java.lang.String str14 = locale13.getVariant();
        java.lang.String str15 = locale13.getDisplayCountry();
        java.lang.String str16 = locale1.getDisplayScript(locale13);
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "italian");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "it");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "italien" + "'", str12, "italien");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "it");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test25444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25444");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("aaaaaaaaaaaaaaaaaaaaaaaaFranz\366sisch (Frankreich)aaaaaaaaaaaaaaaaaaaaaaaa", 'n');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test25445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25445");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("\\u004a\\u004a\\u004a\\u004a\\u004a\\u004a\\u004a\\u004a\\u004a\\u004a\\u004a\\u004a\\u004a\\u004a\\u004a\\u004a\\u004a\\u004a\\u004a\\u004a\\u004a\\u004a\\u004a\\u004a\\u004a\\u004a\\u004a\\u004a\\u004a\\uCinese (Cina)\\u0069h..\\u004a\\u004a\\u004a\\u004a\\u004a\\u004a\\u004a\\u004a\\u004a\\u004a\\u004a\\u004a\\u004a\\u004a\\u004a\\u004a\\u004a\\u004a\\u004a\\u004a\\u004a\\u004a\\u004a\\u004a\\u004a\\u004a\\u004a\\u004a\\u004a\\u");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test25446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25446");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("e2E             giTALIANiTALIANien", "CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCEnglischCCCCCCCCCCC...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test25447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25447");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "fran\347ais (france) (CHINESE (CHINA)", (java.lang.CharSequence) "WBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDED...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test25448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25448");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfBlank("9", "!ih    Deutsc!ih    Deutsc!ih    Deutsc!ih    Deutsc!ih    Deutsc!ih    Deu       ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "9" + "'", str2, "9");
    }

    @Test
    public void test25449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25449");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("                                                                                                   HSadanacadanacGadanacE", "fr-FR");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test25450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25450");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("Chinesisch (China", "AD4AE4AF4AG4AI4AL4AM4AN4AO4AQ4AR4AS4AT4AU4AW4AX4AZ4BA4BB4BD4BE4BF4BG4BH4BI4BJ4BL4BM4BN4BO4BQ4BR4BS4BT4BV4BW4BY4BZ4CA4CC4CD4CF4CG4CH4CI4CK4CL4CM4CN4CO4CR4CU4CV4CW4CX4CY4CZ4DE4DJ4DK4DM4DO4DZ4EC4EE4EG4EH4ER4ES4ET4FI4FJ4FK4FM4FO4FR4GA4GB4GD4GE4GF4GG4GH4GI4GL4GM4GN4GP4GQ4GR4GS4GT4GU4GW4GY4HK4HM4HN4HR4HT4HU4ID4IE4IL4IM4IN4IO4IQ4IR4IS4IT4JE4JM4JO4JP4KE4KG4KH4KI4KM4KN4KP4KR4KW4KY4KZ4LA4LB4LC4LI4LK4LR4LS4LT4LU4LV4LY4MA4MC4MD4ME4MF4MG4MH4MK4ML4MM4MN4MO4MP4MQ4MR4MS4MT4MU4MV4MW4MX4MY4MZ4NA4NC4NE4NF4NG4NI4NL4NO4NP4NR4NU4NZ4OM4PA4PE4PF4PG4PH4PK4PL4PM4PN4PR4PS4PT4PW4PY4QA4RE4RO4RS4RU4RW4SA4SB4SC4SD4SE4SG4SH4SI4SJ4SK4SL4SM4SN4SO4SR4SS4ST4SV4SX4SY4SZ4TC4TD4TF4TG4TH4TJ4TK4TL4TM4TN4TO4TR4TT4TV4TW4TZ4UA4UG4UM4US4UY4UZ4VA4VC4VE4VG4VI4VN4VU4WF4WS4YE4YT4ZA4ZM4ZW");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Chinesisch (China" + "'", str2, "Chinesisch (China");
    }

    @Test
    public void test25451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25451");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale locale2 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str3 = locale2.getDisplayName();
        java.util.Locale.Builder builder4 = builder1.setLocale(locale2);
        java.util.Locale locale5 = java.util.Locale.GERMANY;
        java.util.Locale.Builder builder6 = builder1.setLocale(locale5);
        java.util.Set<java.lang.String> strSet7 = locale5.getUnicodeLocaleAttributes();
        boolean boolean8 = locale5.hasExtensions();
        java.util.Locale locale9 = java.util.Locale.FRENCH;
        java.util.Locale locale10 = java.util.Locale.ENGLISH;
        java.lang.String str11 = locale10.getDisplayCountry();
        java.lang.String str12 = locale9.getDisplayVariant(locale10);
        java.lang.String str13 = locale9.getDisplayCountry();
        java.lang.String str14 = locale9.getScript();
        java.lang.String str16 = locale9.getExtension('d');
        java.lang.String str17 = locale5.getDisplayName(locale9);
        java.util.Locale locale20 = new java.util.Locale("!IH", "Hhhhhhhhhh");
        java.lang.String str21 = locale20.getDisplayLanguage();
        java.lang.String str22 = locale5.getDisplayName(locale20);
        java.lang.String str23 = locale20.toString();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "fran\347ais (Canada)" + "'", str3, "fran\347ais (Canada)");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "de_DE");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "fr");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "allemand (Allemagne)" + "'", str17, "allemand (Allemagne)");
        org.junit.Assert.assertEquals(locale20.toString(), "!ih_HHHHHHHHHH");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "!ih" + "'", str21, "!ih");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "German (Germany)" + "'", str22, "German (Germany)");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "!ih_HHHHHHHHHH" + "'", str23, "!ih_HHHHHHHHHH");
    }

    @Test
    public void test25452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25452");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("\u1112\u1161\u11ab\u1100\u116e\u11a8\u110b\u1165\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\u1112\u1161\u11ab\u1100\u116e\u11a8\u110b\u1165\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n" + "'", str1, "\u1112\u1161\u11ab\u1100\u116e\u11a8\u110b\u1165\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
    }

    @Test
    public void test25453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25453");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r...", "NI", 5);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test25454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25454");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("                                                   ", "ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBFR_CA                             ...!       \\U0034\\U0034\\U0034\\U0034\\U0034\\U0034\\U0034\\U0034\\U0034\\     CFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDED...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test25455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25455");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("BFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEKoreanADA", "6400aUa\\\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rzh_CN", 103);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test25456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25456");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("HEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglish");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test25457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25457");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC\\u00de\\u00CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC", "bzhzhzhzhzhzhzhfrancais0(France)bzhzhzhzhzhzhzhzhzhzhfrancais0(France)bzhzhzhzhzhzhzhzhzhzhfrancais0cinese0(cina)Uu!!i9h..France)bzhzhzhzhzhzhzhzhzhzhfrancais0(France)bzhzhzhzhzhzhzhzhzhzhfrancais0(France)bzhzhzhzhzhzhzhzhzhzhfrancais0(France)bzhzhzhzhzhzhzhzhzhzhfrancais0(France)bzhzhzhzhzhzhzhzhzhzhfrancais0(France)bzhzhzhzhzhzhzhzhzhzhfrancais0(France)bzhzhzhzhzhzhzhzhzhzhfrancais0(France)bzhzhzhzhzhzhzhzhzhzhfrancais0(France)bzhzhzhzhzhzhzhzhzhzhfrancais0(France)bzhzhzhzhzhzhzhzhzhzhfrancais0(France)bzhzhzhzhzhzhzhzhzhzhfrancais0(France)bzhzhzhzhzhzhzhzhzhzhfrancais0(France)bzhzhzhzhzhzhzhzhzhzhfrancais0(France)bzhzhzhzhzhzhzhzhzhzhfrancais0(France)bzhzhzhzhzhzhzhzhzhzhfrancais0(France)bzhzhzhzhzhzhzhzhzhzhfrancais0(France)bzhzhzhzhzhzhzhzhzhzhfrancais0(France)bzhzhzhzhzhzhzhzhzhzhfrancais0(France)b");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test25458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25458");
        java.lang.CharSequence charSequence1 = null;
        char[] charArray7 = new char[] { ' ', '4' };
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "HI!", charArray7);
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!", charArray7);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "en", charArray7);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsNone(charSequence1, charArray7);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "FRANZ\326SISCH(FRANKREICH)", charArray7);
        java.lang.Class<?> wildcardClass13 = charArray7.getClass();
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[ , 4]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test25459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25459");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("TALY", 105, 27);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test25460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25460");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("Iitalian(italian,eng", 'R');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test25461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25461");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("                                              8600u\\U\\u0", "FRFRFRFRFRFRFRFRFRFRFRFRFde_DEFRFRFRFRFRFRFRFRFRFRFRFRFR###############################################FRFRFRFRFRFRFRFRFRFRFRFRFde_DEFRFRFRFRFRFRFRFRFRFRFRFRFR###############################################FRFRFRFRFRFRFRFRFRFRFRFRFde_DEFRFRFRFRFRFRFRFRFRFRFRFRFR###############################################FRFRFRFRFRFRFRFRFRFRFRFRFde_DEFRFRFRFRFRFRFRFRFRFRFRFRFR###############################################FRFRFRFRFRFRFRFRFRFRFRFRFde_DEFRFRFRFRFRFRFRFRFRFRFRFRFR###############################################FRFRFRFRFRFRFRFRFRFRFRFRFde_DEFRFRFRFRFRFRFRFRFRTALIAN\\u002");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                              8600u\\U\\u0" + "'", str2, "                                              8600u\\U\\u0");
    }

    @Test
    public void test25462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25462");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("!       allemandtalienischallemanditalian_TALAN_Eng    \\     ADAEAFAGAALA", 70);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 66 + "'", int2 == 66);
    }

    @Test
    public void test25463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25463");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("NglishEnglishEnglishEnglishEnglishEnglishEnglishEnglish", '\ud504');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "NglishEnglishEnglishEnglishEnglishEnglishEnglishEnglish" + "'", str2, "NglishEnglishEnglishEnglishEnglishEnglishEnglishEnglish");
    }

    @Test
    public void test25464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25464");
        java.util.Locale locale2 = new java.util.Locale("iTALIE                         ", "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rz...\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r");
        java.util.Locale locale5 = new java.util.Locale("italian (ITALIAN,English)", "                                                                                                         ");
        java.util.Locale locale6 = java.util.Locale.CANADA_FRENCH;
        java.util.Set<java.lang.String> strSet7 = locale6.getUnicodeLocaleKeys();
        java.lang.String str8 = locale6.toLanguageTag();
        java.lang.String str9 = locale5.getDisplayLanguage(locale6);
        java.lang.String str10 = locale2.getDisplayName(locale6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = locale6.getExtension('\n');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed extension key: ?");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(locale2.toString(), "italie                         _\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rZ...\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r");
        org.junit.Assert.assertEquals(locale5.toString(), "italian (italian,english)_                                                                                                         ");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "fr_CA");
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "fr-CA" + "'", str8, "fr-CA");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "italian (italian,english)" + "'", str9, "italian (italian,english)");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "italie                          (\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rZ...\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r)" + "'", str10, "italie                          (\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rZ...\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r)");
    }

    @Test
    public void test25465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25465");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("                                                                                                                      \\u006bCinese (Cina)\\u0069h..                                                                                                                      ", strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=\\u006bcinese(cina)\\u0069h..");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test25466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25466");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale locale2 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str3 = locale2.getDisplayName();
        java.util.Locale.Builder builder4 = builder1.setLocale(locale2);
        java.util.Locale.Builder builder6 = builder1.setLanguage("und");
        java.util.Locale locale7 = builder6.build();
        java.lang.String str8 = locale7.getDisplayScript();
        java.util.Locale.Category category9 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale10 = java.util.Locale.getDefault(category9);
        java.util.Locale locale11 = java.util.Locale.FRANCE;
        java.util.Locale locale12 = java.util.Locale.ITALIAN;
        java.lang.String str14 = locale12.getExtension('h');
        java.lang.String str15 = locale11.getDisplayScript(locale12);
        java.lang.String str16 = locale11.getISO3Country();
        java.util.Locale locale17 = java.util.Locale.GERMAN;
        java.util.Locale.setDefault(locale17);
        java.lang.String str19 = locale11.getDisplayName(locale17);
        java.lang.String str20 = locale11.getScript();
        java.util.Locale.setDefault(category9, locale11);
        java.util.Locale locale23 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale.setDefault(category9, locale23);
        java.lang.String str25 = locale7.getDisplayCountry(locale23);
        java.lang.String str26 = locale7.getScript();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "fran\347ais (Canada)" + "'", str3, "fran\347ais (Canada)");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "und_CA");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + category9 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category9.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "it");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "FRA" + "'", str16, "FRA");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "de");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Franz\366sisch (Frankreich)" + "'", str19, "Franz\366sisch (Frankreich)");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Canada" + "'", str25, "Canada");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
    }

    @Test
    public void test25467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25467");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("                                                                                                                \r");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=                                                                                                                ?");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test25468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25468");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("_");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_" + "'", str1, "_");
    }

    @Test
    public void test25469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25469");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "dnamAlladnamAlladnamAlladnamAlladnamAlladnamAlladnamAlladnamAlladnamAlladnamAlladnamAlladnamAlladnamAlladnamAlladnamAlladnamAlladnamAlladnamAlladnamAlladnamAlladnamAlladnamAlladnamAlladnamAlladnamAlladnamAlladnamAlladnamAlladnamAlladnamAlladnamAlladnamAlladnamAlladnamAlladnamAlladnamAlladnamAlladnamAlladnamAlladnamAlladnamAlladnamAlladnamAlladnamAlladnamAlladnamAlladnamAlladnamAlladnamAlladnamAlladnamAlladnamAlladnamAlladnamAlladnamAlladnamAlladnamAlladnamAlladnamAlladnamAlladnamAlladnamAlladnamAlladnamAlladnamAlladnamAlladnamAlladnamAlladnamAlladnamAlladnamAlladnamAlladnamAlladnamAlladnamAlladnamAlladnamAlladnamAlladnamAlladnamAlladnamAlladnamAlladnamAlladnamAlladnamAlladnamAlladnamAlladnamAlladnamAlladnamAlladnamAlladnamAlla");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test25470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25470");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale locale2 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str3 = locale2.getDisplayName();
        java.util.Locale.Builder builder4 = builder1.setLocale(locale2);
        java.util.Locale.Builder builder5 = builder4.clear();
        java.util.Locale.Builder builder7 = builder5.setLanguage("ITALIAN");
        java.util.Locale.Builder builder8 = builder5.clear();
        java.util.Locale.Builder builder9 = builder5.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder11 = builder9.setScript("...EnglishEnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: ...EnglishEnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "French (Canada)" + "'", str3, "French (Canada)");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test25471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25471");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("HIAN\\U0020IH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hian\\u0020ih" + "'", str1, "hian\\u0020ih");
    }

    @Test
    public void test25472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25472");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("\\u0068 !ih !ih !ih !ih !ih !ih !ih !ih !ih");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\u0068 !ih !ih !ih !ih !ih !ih !ih !ih !ih" + "'", str1, "\\u0068 !ih !ih !ih !ih !ih !ih !ih !ih !ih");
    }

    @Test
    public void test25473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25473");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("de_de", "nglish (United Kingdom)", "en_GB");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "de_de" + "'", str3, "de_de");
    }

    @Test
    public void test25474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25474");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "China");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test25475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25475");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("itTAiT_ITA");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray1);
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray1);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, 'a', 120, (int) ' ');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "itTAiT_ITA" + "'", str8, "itTAiT_ITA");
    }

    @Test
    public void test25476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25476");
        java.util.Locale locale1 = java.util.Locale.KOREA;
        java.lang.String str2 = locale1.getLanguage();
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.upperCase("TALIAN\\u0023", locale1);
        java.util.Locale locale5 = java.util.Locale.FRANCE;
        java.util.Locale locale6 = java.util.Locale.ITALIAN;
        java.lang.String str8 = locale6.getExtension('h');
        java.lang.String str9 = locale5.getDisplayScript(locale6);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.lowerCase("HI!       ", locale5);
        java.lang.String str11 = locale1.getDisplayVariant(locale5);
        java.lang.String str12 = locale1.getDisplayLanguage();
        java.lang.String str13 = locale1.getDisplayLanguage();
        java.util.Locale locale14 = locale1.stripExtensions();
        java.lang.String str15 = locale14.getISO3Country();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ko" + "'", str2, "ko");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "TALIAN\\U0023" + "'", str3, "TALIAN\\U0023");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "it");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!       " + "'", str10, "hi!       ");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Korean" + "'", str12, "Korean");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Korean" + "'", str13, "Korean");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "KOR" + "'", str15, "KOR");
    }

    @Test
    public void test25477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25477");
        java.util.Locale locale4 = new java.util.Locale("Ttat_ita", "Katalanisch", "  \\u0020iTALIANiTALIANiTALIANiTAL  ");
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.upperCase("engengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengeng", locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "ttat_ita_KATALANISCH_  \\u0020iTALIANiTALIANiTALIANiTAL  ");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENG" + "'", str5, "ENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENG");
    }

    @Test
    public void test25478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25478");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("en-US", "                                                                                                                                                                                                                                                                                                                                                                   tit                                                                                                                                                                                                                                                                                                                                                                   ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test25479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25479");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("                                                                    NC_HZ", 'B');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test25480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25480");
        java.util.Locale locale1 = new java.util.Locale("");
        java.util.Locale.setDefault(locale1);
        java.util.Set<java.lang.Character> charSet3 = locale1.getExtensionKeys();
        java.util.Locale locale5 = new java.util.Locale("TA...");
        java.lang.String str6 = locale1.getDisplayCountry(locale5);
        java.lang.String str7 = locale5.getDisplayScript();
        java.util.Locale locale8 = java.util.Locale.ENGLISH;
        java.util.Set<java.lang.String> strSet9 = locale8.getUnicodeLocaleAttributes();
        java.lang.String str10 = locale5.getDisplayVariant(locale8);
        java.util.Set<java.lang.Character> charSet11 = locale8.getExtensionKeys();
        java.util.Locale.Builder builder12 = new java.util.Locale.Builder();
        java.util.Locale locale13 = builder12.build();
        java.util.Locale locale14 = java.util.Locale.FRENCH;
        java.util.Locale locale15 = java.util.Locale.ENGLISH;
        java.lang.String str16 = locale15.getDisplayCountry();
        java.lang.String str17 = locale14.getDisplayVariant(locale15);
        java.lang.String str18 = locale14.getDisplayCountry();
        java.lang.String str19 = locale14.getScript();
        java.lang.String str20 = locale14.getScript();
        java.util.Locale locale21 = java.util.Locale.FRENCH;
        java.util.Locale locale22 = java.util.Locale.ENGLISH;
        java.lang.String str23 = locale22.getDisplayCountry();
        java.lang.String str24 = locale21.getDisplayVariant(locale22);
        java.lang.String str25 = locale21.getDisplayCountry();
        java.lang.String str26 = locale21.getScript();
        java.lang.String str27 = locale21.getScript();
        java.lang.String str28 = locale14.getDisplayCountry(locale21);
        java.lang.String str29 = locale13.getDisplayVariant(locale21);
        java.util.Locale locale31 = java.util.Locale.ENGLISH;
        java.lang.String str32 = locale31.getDisplayLanguage();
        java.lang.String str33 = org.apache.commons.lang3.StringUtils.upperCase("!IH", locale31);
        java.lang.String str34 = locale31.getCountry();
        java.lang.String str35 = locale31.getCountry();
        java.lang.String str36 = locale21.getDisplayCountry(locale31);
        java.util.Locale locale37 = java.util.Locale.GERMAN;
        java.util.Locale locale38 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str39 = locale37.getDisplayName(locale38);
        java.util.Locale locale40 = locale37.stripExtensions();
        java.lang.String str41 = locale31.getDisplayVariant(locale40);
        java.util.Locale locale44 = new java.util.Locale("italian (ITALIAN,English)", "                                                                                                         ");
        java.lang.String str45 = locale31.getDisplayLanguage(locale44);
        java.util.Set<java.lang.Character> charSet46 = locale44.getExtensionKeys();
        java.lang.String str47 = locale8.getDisplayName(locale44);
        java.util.Set<java.lang.Character> charSet48 = locale44.getExtensionKeys();
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(charSet3);
        org.junit.Assert.assertEquals(locale5.toString(), "ta...");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "en");
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(charSet11);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "fr");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "en");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "fr");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "en");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "en");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "English" + "'", str32, "English");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "!IH" + "'", str33, "!IH");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(locale37);
        org.junit.Assert.assertEquals(locale37.toString(), "de");
        org.junit.Assert.assertNotNull(locale38);
        org.junit.Assert.assertEquals(locale38.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "allemand" + "'", str39, "allemand");
        org.junit.Assert.assertNotNull(locale40);
        org.junit.Assert.assertEquals(locale40.toString(), "de");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertEquals(locale44.toString(), "italian (italian,english)_                                                                                                         ");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "English" + "'", str45, "English");
        org.junit.Assert.assertNotNull(charSet46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "English" + "'", str47, "English");
        org.junit.Assert.assertNotNull(charSet48);
    }

    @Test
    public void test25481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25481");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale locale2 = builder0.build();
        java.util.Locale.Builder builder3 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder0.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder6 = builder0.removeUnicodeLocaleAttribute("                                                                                   francese (Canada)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute:                                                                                    francese (Canada) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void test25482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25482");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "####################################################################################", (java.lang.CharSequence) "                                                 Frnz\366sisch(Knd                                                  ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test25483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25483");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("", 164, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test25484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25484");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.setLanguageTag("Italian");
        java.util.Locale locale4 = builder3.build();
        java.util.Locale locale5 = builder3.build();
        java.util.Locale locale6 = builder3.build();
        java.util.Locale.Builder builder7 = builder3.clearExtensions();
        java.util.Locale.Builder builder8 = builder3.clear();
        java.util.Locale locale12 = new java.util.Locale("italian (italian,eng", "kokoko", "      ");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder13 = builder8.setLocale(locale12);
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: italian (italian,eng [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "italian");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "italian");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "italian");
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertEquals(locale12.toString(), "italian (italian,eng_KOKOKO_      ");
    }

    @Test
    public void test25485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25485");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "                                                                    NC_HZ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test25486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25486");
        java.util.Locale locale2 = new java.util.Locale("italian (ITALIAN,English)", "                                                                                                         ");
        java.util.Locale locale3 = java.util.Locale.CANADA_FRENCH;
        java.util.Set<java.lang.String> strSet4 = locale3.getUnicodeLocaleKeys();
        java.lang.String str5 = locale3.toLanguageTag();
        java.lang.String str6 = locale2.getDisplayLanguage(locale3);
        java.util.Locale locale8 = java.util.Locale.FRANCE;
        java.util.Locale locale9 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str10 = locale8.getDisplayScript(locale9);
        java.util.Locale locale11 = java.util.Locale.FRANCE;
        java.util.Locale locale12 = java.util.Locale.ITALIAN;
        java.lang.String str14 = locale12.getExtension('h');
        java.lang.String str15 = locale11.getDisplayScript(locale12);
        java.lang.String str16 = locale11.getISO3Country();
        java.lang.String str17 = locale9.getDisplayVariant(locale11);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.upperCase("\\u0020iTALIANiTALIANiTALIANiTALI", locale9);
        java.lang.String str19 = locale9.getLanguage();
        java.lang.String str20 = locale2.getDisplayCountry(locale9);
        org.junit.Assert.assertEquals(locale2.toString(), "italian (italian,english)_                                                                                                         ");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "fr_CA");
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "fr-CA" + "'", str5, "fr-CA");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "italian (italian,english)" + "'", str6, "italian (italian,english)");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "it");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "FRA" + "'", str16, "FRA");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\\U0020ITALIANITALIANITALIANITALI" + "'", str18, "\\U0020ITALIANITALIANITALIANITALI");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "fr" + "'", str19, "fr");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "                                                                                                         " + "'", str20, "                                                                                                         ");
    }

    @Test
    public void test25487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25487");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("  \\u007a", "eAGAASH");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test25488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25488");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("ian\\u0020");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ian\\u0020" + "'", str1, "ian\\u0020");
    }

    @Test
    public void test25489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25489");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("HHHHHHHHH         ITAL\\u0020iItalian\\...", "");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test25490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25490");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "                                                                                     ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test25491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25491");
        java.util.Locale locale0 = java.util.Locale.ENGLISH;
        java.lang.String str1 = locale0.getDisplayLanguage();
        java.lang.String str3 = locale0.getExtension('F');
        java.util.Locale.Builder builder4 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder5 = builder4.clear();
        java.util.Locale.Builder builder6 = builder4.clear();
        java.util.Locale.Builder builder7 = builder6.clear();
        java.util.Locale locale8 = java.util.Locale.CHINESE;
        java.lang.String str9 = locale8.getCountry();
        java.util.Locale.Builder builder10 = builder7.setLocale(locale8);
        java.util.Locale locale11 = builder10.build();
        java.lang.String str12 = locale0.getDisplayLanguage(locale11);
        java.lang.String[] strArray15 = org.apache.commons.lang3.StringUtils.split("          2cinese (cina)italianitalianitalianital", 'N');
        boolean boolean16 = locale11.equals((java.lang.Object) 'N');
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "English" + "'", str1, "English");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\u82f1\u6587" + "'", str12, "\u82f1\u6587");
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test25492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25492");
        java.util.Locale locale2 = new java.util.Locale("  \\u005   ", "...u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069!IH\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\englisch");
        java.util.Locale.Category category3 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale4 = java.util.Locale.getDefault(category3);
        java.util.Locale locale5 = java.util.Locale.GERMAN;
        java.util.Locale locale6 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str7 = locale5.getDisplayName(locale6);
        java.util.Locale.setDefault(category3, locale6);
        java.util.Locale locale11 = new java.util.Locale("\\u0020iTALIANiTALIANiTALIANiTALI\\u0020iTALIANiTALIANiTALIANiTAL", "allemand");
        java.util.Locale.setDefault(category3, locale11);
        java.util.Locale locale13 = java.util.Locale.getDefault(category3);
        java.util.Locale locale14 = java.util.Locale.GERMAN;
        java.util.Locale locale15 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str16 = locale14.getDisplayName(locale15);
        java.util.Locale.setDefault(locale15);
        java.util.Locale.setDefault(category3, locale15);
        java.util.Locale locale19 = java.util.Locale.getDefault(category3);
        java.util.Locale locale20 = java.util.Locale.getDefault(category3);
        java.lang.String str21 = locale20.getCountry();
        java.util.Locale locale22 = locale20.stripExtensions();
        java.lang.String str24 = locale22.getExtension('I');
        java.lang.String str25 = locale2.getDisplayVariant(locale22);
        java.util.Set<java.lang.String> strSet26 = locale2.getUnicodeLocaleAttributes();
        org.junit.Assert.assertEquals(locale2.toString(), "  \\u005   _...U0069\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069!IH\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069\\ENGLISCH");
        org.junit.Assert.assertTrue("'" + category3 + "' != '" + java.util.Locale.Category.FORMAT + "'", category3.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "de");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "allemand" + "'", str7, "allemand");
        org.junit.Assert.assertEquals(locale11.toString(), "\\u0020italianitalianitalianitali\\u0020italianitalianitalianital_ALLEMAND");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "\\u0020italianitalianitalianitali\\u0020italianitalianitalianital_ALLEMAND");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "de");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "allemand" + "'", str16, "allemand");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "fr_CA");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "CA" + "'", str21, "CA");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "fr_CA");
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(strSet26);
    }

    @Test
    public void test25493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25493");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("    \\XTALXAN_ITALIAN_ENGLXSH    ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\XTALXAN_ITALIAN_ENGLXSH" + "'", str1, "\\XTALXAN_ITALIAN_ENGLXSH");
    }

    @Test
    public void test25494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25494");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("                                                                                                       ", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                       " + "'", str2, "                                                                                                       ");
    }

    @Test
    public void test25495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25495");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "                                                     \\u005c        ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test25496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25496");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "hi!       _\\u0020_italienisch####################################################################...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test25497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25497");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("\\u0041", 67);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test25498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25498");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("\ud55c\uad6d\uc5b4\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n", "                                 \\u0059                                  ", 60);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test25499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25499");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("                                     fran\347ais (france)                                       (CHINESE (CHINA)", "German (Germany)", (int) 'c');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test25500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25500");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale1 = java.util.Locale.getDefault(category0);
        java.util.Locale locale2 = java.util.Locale.getDefault(category0);
        java.util.Locale locale3 = java.util.Locale.FRENCH;
        java.util.Locale locale4 = java.util.Locale.ENGLISH;
        java.lang.String str5 = locale4.getDisplayCountry();
        java.lang.String str6 = locale3.getDisplayVariant(locale4);
        java.lang.String str7 = locale4.getDisplayVariant();
        java.util.Locale locale9 = java.util.Locale.forLanguageTag("\\u0020");
        java.lang.String str10 = locale9.getDisplayScript();
        java.util.Locale.setDefault(locale9);
        java.lang.String str12 = locale9.getScript();
        java.lang.String str13 = locale4.getDisplayCountry(locale9);
        java.lang.String str14 = locale2.getDisplayVariant(locale9);
        java.util.Locale locale15 = java.util.Locale.ITALIAN;
        java.lang.String str16 = locale15.getDisplayLanguage();
        java.util.Locale locale17 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str18 = locale17.toLanguageTag();
        java.lang.String str19 = locale15.getDisplayName(locale17);
        java.lang.String str20 = locale17.getDisplayScript();
        java.lang.String str21 = locale17.getVariant();
        java.lang.String str22 = locale9.getDisplayVariant(locale17);
        java.util.Set<java.lang.Character> charSet23 = locale17.getExtensionKeys();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "fr_CA");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fr_CA");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "fr");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "it");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Italian" + "'", str16, "Italian");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "fr-CA" + "'", str18, "fr-CA");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "italien" + "'", str19, "italien");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(charSet23);
    }
}
