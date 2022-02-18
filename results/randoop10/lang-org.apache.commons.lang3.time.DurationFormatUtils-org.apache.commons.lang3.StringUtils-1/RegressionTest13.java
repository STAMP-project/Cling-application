import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest13 {

    public static boolean debug = false;

    @Test
    public void test6501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6501");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "P0Y0M0DT0H0M0.042S", "italy");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test6502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6502");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale1 = java.util.Locale.CANADA;
        java.util.Locale.setDefault(category0, locale1);
        java.util.Locale locale4 = new java.util.Locale("\u4e2d\u6587");
        java.util.Locale.setDefault(category0, locale4);
        java.util.Locale locale6 = java.util.Locale.getDefault(category0);
        java.util.Locale locale7 = java.util.Locale.UK;
        java.util.Locale.Category category8 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale9 = java.util.Locale.CANADA;
        java.util.Locale.setDefault(category8, locale9);
        java.lang.String str11 = locale9.getLanguage();
        java.lang.String str12 = locale7.getDisplayScript(locale9);
        java.util.Set<java.lang.String> strSet13 = locale9.getUnicodeLocaleKeys();
        java.lang.String str14 = locale9.toLanguageTag();
        java.util.Locale.setDefault(category0, locale9);
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en_CA");
        org.junit.Assert.assertEquals(locale4.toString(), "\u4e2d\u6587");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "\u4e2d\u6587");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en_GB");
        org.junit.Assert.assertTrue("'" + category8 + "' != '" + java.util.Locale.Category.FORMAT + "'", category8.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "en" + "'", str11, "en");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "en-CA" + "'", str14, "en-CA");
    }

    @Test
    public void test6503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6503");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale1 = java.util.Locale.CANADA;
        java.util.Locale.setDefault(category0, locale1);
        java.util.Locale locale3 = java.util.Locale.getDefault(category0);
        java.util.Locale locale4 = java.util.Locale.UK;
        java.util.Locale.Category category5 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale6 = java.util.Locale.CANADA;
        java.util.Locale.setDefault(category5, locale6);
        java.lang.String str8 = locale6.getLanguage();
        java.lang.String str9 = locale4.getDisplayScript(locale6);
        java.util.Locale.setDefault(category0, locale4);
        java.util.Locale locale11 = java.util.Locale.PRC;
        java.util.Locale locale13 = java.util.Locale.GERMANY;
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.lowerCase("HI!", locale13);
        java.lang.String str15 = locale11.getDisplayVariant(locale13);
        java.util.Locale locale16 = locale11.stripExtensions();
        java.util.Locale.setDefault(category0, locale16);
        java.util.Locale locale20 = new java.util.Locale("'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S", "                P0Y0M0DT0H0M0.090ShiP0Y0M0DT0H0M0.090S!P0Y0M0DT0H0M0.090S                        ");
        java.util.Locale.setDefault(category0, locale20);
        java.util.Locale.Category category22 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale23 = java.util.Locale.FRANCE;
        java.util.Locale.setDefault(category22, locale23);
        java.util.Locale locale25 = java.util.Locale.getDefault(category22);
        java.util.Locale locale26 = java.util.Locale.getDefault(category22);
        java.util.Locale locale27 = java.util.Locale.getDefault(category22);
        java.lang.String str28 = locale27.getLanguage();
        java.util.Locale.setDefault(category0, locale27);
        java.lang.String[] strArray35 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("hi!", "", (int) 'a');
        int int36 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray35);
        java.lang.String str37 = org.apache.commons.lang3.StringUtils.concatWith("tes", (java.lang.Object[]) strArray35);
        java.lang.String str38 = org.apache.commons.lang3.StringUtils.concatWith("4444444444444444444444444444444444444444444444444444", (java.lang.Object[]) strArray35);
        boolean boolean39 = locale27.equals((java.lang.Object) str38);
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en_CA");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en_CA");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en_GB");
        org.junit.Assert.assertTrue("'" + category5 + "' != '" + java.util.Locale.Category.FORMAT + "'", category5.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "en" + "'", str8, "en");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "zh_CN");
        org.junit.Assert.assertEquals(locale20.toString(), "'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's_                P0Y0M0DT0H0M0.090SHIP0Y0M0DT0H0M0.090S!P0Y0M0DT0H0M0.090S                        ");
        org.junit.Assert.assertTrue("'" + category22 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category22.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "fr" + "'", str28, "fr");
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!" + "'", str37, "hi!");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test6504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6504");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("Chine0euuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Chine0euuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu" + "'", str2, "Chine0euuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
    }

    @Test
    public void test6505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6505");
        java.util.Locale locale2 = new java.util.Locale("", "0 days 0 hours 0 minutes 0 seconds");
        java.util.Locale locale3 = java.util.Locale.CHINESE;
        java.lang.String str4 = locale2.getDisplayName(locale3);
        java.lang.String str5 = locale3.toLanguageTag();
        java.util.Locale locale7 = java.util.Locale.UK;
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.upperCase("P0Y0-10DT07430-10.0343599900", locale7);
        java.lang.String str9 = locale7.getISO3Language();
        java.lang.String str10 = locale7.toLanguageTag();
        java.lang.String str11 = locale7.getDisplayCountry();
        java.lang.String str12 = locale3.getDisplayName(locale7);
        java.util.Locale locale14 = java.util.Locale.FRANCE;
        java.util.Set<java.lang.String> strSet15 = locale14.getUnicodeLocaleKeys();
        java.util.Set<java.lang.Character> charSet16 = locale14.getExtensionKeys();
        java.lang.String str17 = locale14.getISO3Language();
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.upperCase("\u6cd5\u6587\u6cd5\u56fd))", locale14);
        java.lang.String str19 = locale3.getDisplayName(locale14);
        java.lang.String str20 = locale3.toString();
        org.junit.Assert.assertEquals(locale2.toString(), "_0 DAYS 0 HOURS 0 MINUTES 0 SECONDS");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0 DAYS 0 HOURS 0 MINUTES 0 SECONDS" + "'", str4, "0 DAYS 0 HOURS 0 MINUTES 0 SECONDS");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "zh" + "'", str5, "zh");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "P0Y0-10DT07430-10.0343599900" + "'", str8, "P0Y0-10DT07430-10.0343599900");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "eng" + "'", str9, "eng");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "en-GB" + "'", str10, "en-GB");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Royaume-Uni" + "'", str11, "Royaume-Uni");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Chinese" + "'", str12, "Chinese");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(strSet15);
        org.junit.Assert.assertNotNull(charSet16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "fra" + "'", str17, "fra");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\u6cd5\u6587\u6cd5\u56fd))" + "'", str18, "\u6cd5\u6587\u6cd5\u56fd))");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "chinois" + "'", str19, "chinois");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "zh" + "'", str20, "zh");
    }

    @Test
    public void test6506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6506");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("P0Y0M0DT0H0M0.014S", 98);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test6507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6507");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("0 days 0 hours", 46);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0 days 0 hours" + "'", str2, "0 days 0 hours");
    }

    @Test
    public void test6508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6508");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("Chinese (China)", "");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test6509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6509");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("P-1Y11M30DT23H59M59.990S");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray1, "uuuuuuuuuuuuuuuuuuuuuuuu0320.00000TD000Y0P");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test6510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6510");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("P0Y0M0DT0H0M0.014S", 'u');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test6511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6511");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("x", "   tChinesisch (China)", (int) (byte) 0);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test6512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6512");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("can", "danaC");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test6513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6513");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("########Chinese (China)#########", "p0y0m0dt0h0m0.090s", (int) (short) 1);
        int int5 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's", strArray4);
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.stripAll(strArray4, "H!ih!ih!ih!ih!ih!ih!iP0Y0-10DT07430-10.1213599678");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void test6514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6514");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("P0Y0M0DT0H0M0.153SP0Y0M0DT0H0M0.153SP0Y0M0Chinese      P0Y0M0DT0H0M0.153SP0Y0M0DT0H0M0.153SP0Y0M0", "\u6cd5\u6587\u6cd5\u56fd)");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test6515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6515");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("####################################################################################################################", (int) (byte) 10, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "####################################################################################################################" + "'", str3, "####################################################################################################################");
    }

    @Test
    public void test6516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6516");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("de_DE", "P0Y0M0DT0H0M0.031S");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "de_DE" + "'", str2, "de_DE");
    }

    @Test
    public void test6517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6517");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale2 = java.util.Locale.CHINA;
        java.util.Locale locale3 = locale2.stripExtensions();
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.lowerCase("99.00:00:0", locale2);
        java.util.Locale.Builder builder5 = builder0.setLocale(locale2);
        java.util.Locale.Builder builder7 = builder5.setLanguage("und");
        java.util.Locale.Builder builder8 = builder5.clear();
        java.util.Locale.Builder builder10 = builder8.removeUnicodeLocaleAttribute("te0");
        java.util.Locale locale12 = java.util.Locale.GERMANY;
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.lowerCase("HI!", locale12);
        java.lang.String str14 = locale12.toLanguageTag();
        java.lang.String str15 = locale12.getDisplayScript();
        java.util.Locale.Builder builder16 = builder8.setLocale(locale12);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder18 = builder8.setLanguage("\u683c\u6797\u5a01\u6cbb\u6642\u9593");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language:                                           ?????? [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "99.00:00:0" + "'", str4, "99.00:00:0");
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "de-DE" + "'", str14, "de-DE");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(builder16);
    }

    @Test
    public void test6518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6518");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("Chine00000000000ehiA\307\uc911\uad6d\uc5b4\uc911\uc911\uad6d");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=chine00000000000ehiac?an???????? ?????????");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6519");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("   te0    ", ' ');
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.concatWith("", (java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "te0" + "'", str4, "te0");
    }

    @Test
    public void test6520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6520");
        java.util.Locale.Category category0 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale1 = java.util.Locale.FRANCE;
        java.util.Locale.setDefault(category0, locale1);
        java.util.Locale locale3 = java.util.Locale.getDefault(category0);
        java.util.Locale.Category category4 = java.util.Locale.Category.DISPLAY;
        java.util.Locale.Category category5 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale6 = java.util.Locale.getDefault();
        java.util.Locale.setDefault(category5, locale6);
        java.util.Set<java.lang.String> strSet8 = locale6.getUnicodeLocaleKeys();
        java.util.Locale locale10 = new java.util.Locale("");
        java.util.Locale locale12 = new java.util.Locale("\u4e2d\u6587");
        java.lang.String str13 = locale10.getDisplayScript(locale12);
        java.util.Locale locale15 = java.util.Locale.forLanguageTag("P0Y0M0DT0H0M0.034S");
        java.lang.String str16 = locale12.getDisplayName(locale15);
        java.lang.String str17 = locale6.getDisplayScript(locale12);
        java.util.Locale locale20 = new java.util.Locale("0:00:00.000", "zh_TW");
        java.util.Locale.Builder builder21 = new java.util.Locale.Builder();
        java.util.Locale locale22 = builder21.build();
        java.util.Locale.setDefault(locale22);
        java.util.Locale locale24 = java.util.Locale.CHINA;
        java.util.Locale locale25 = java.util.Locale.PRC;
        java.lang.String str26 = locale24.getDisplayLanguage(locale25);
        java.lang.String str27 = locale22.getDisplayLanguage(locale25);
        java.lang.String str28 = locale20.getDisplayVariant(locale25);
        java.lang.String str29 = locale12.getDisplayVariant(locale25);
        java.util.Locale locale31 = java.util.Locale.GERMANY;
        java.lang.String str32 = org.apache.commons.lang3.StringUtils.lowerCase("HI!", locale31);
        java.lang.String str33 = locale25.getDisplayName(locale31);
        java.util.Set<java.lang.String> strSet34 = locale25.getUnicodeLocaleKeys();
        java.util.Locale.setDefault(category4, locale25);
        java.util.Locale.setDefault(category0, locale25);
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "fr_FR");
        org.junit.Assert.assertTrue("'" + category4 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category4.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertTrue("'" + category5 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category5.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale6);
// flaky:         org.junit.Assert.assertEquals(locale6.toString(), "");
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertEquals(locale10.toString(), "");
        org.junit.Assert.assertEquals(locale12.toString(), "\u4e2d\u6587");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\u4e2d\u6587" + "'", str16, "\u4e2d\u6587");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals(locale20.toString(), "0:00:00.000_ZH_TW");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "");
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "\u4e2d\u6587" + "'", str26, "\u4e2d\u6587");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Chinesisch (China)" + "'", str33, "Chinesisch (China)");
        org.junit.Assert.assertNotNull(strSet34);
    }

    @Test
    public void test6521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6521");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("Heure de GreenwichHeure de GreenwichHeure de GreenwichHeure de GreenwichHeure de GreenwichHeure de GreenwichHeure de GreenwichHeure de GreenwichHeure de GreenwichHeure de GreenwichHeure de GreenwichHeure de GreenwichHeure de GreenwichHeure de GreenwichHeure de GreenwichHeure de GreenwichHeure de GreenwichHeure de GreenwichHeure de Greenwich");
        boolean boolean2 = timeZone1.observesDaylightTime();
        java.lang.String str3 = timeZone1.getID();
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u683c\u6797\u5a01\u6cbb\u65f6\u95f4");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "GMT" + "'", str3, "GMT");
    }

    @Test
    public void test6522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6522");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("                 ng", "english (united states)");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "english (united states)" + "'", str2, "english (united states)");
    }

    @Test
    public void test6523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6523");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("\u4e2d\u6587\u4e2d\u56fd)");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\u4e2d\u6587\u4e2d\u56fd)" + "'", str1, "\u4e2d\u6587\u4e2d\u56fd)");
    }

    @Test
    public void test6524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6524");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (-1), "                                                                                                                                             4444444444444444444444444444444444444444444444444444                                                                                                                                              ", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                                             4444444444444444444444444444444444444444444444444444                                                                                                                                              " + "'", str3, "                                                                                                                                             4444444444444444444444444444444444444444444444444444                                                                                                                                              ");
    }

    @Test
    public void test6525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6525");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("aaTE0abTE0aeTE0afTE0akTE0amTE0anTE0arTE0asTE0avTE0ayTE0azTE0baTE0beTE0bgTE0bhTE0biTE0bmTE0bnTE0boTE0brTE0bsTE0caTE0ceTE0chTE0coTE0crTE0csTE0cuTE0cvTE0cyTE0daTE0deTE0dvTE0dzTE0eeTE0elTE0enTE0eoTE0esTE0etTE0euTE0faTE0ffTE0fiTE0fjTE0foTE0frTE0fyTE0gaTE0gdTE0glTE0gnTE0guTE0gvTE0haTE0heTE0hiTE0hoTE0hrTE0htTE0huTE0hyTE0hzTE0iaTE0idTE0ieTE0igTE0iiTE0ikTE0inTE0ioTE0isTE0itTE0iuTE0iwTE0jaTE0jiTE0jvTE0kaTE0kgTE0kiTE0kjTE0kkTE0klTE0kmTE0knTE0koTE0krTE0ksTE0kuTE0kvTE0kwTE0kyTE0laTE0lbTE0lgTE0liTE0lnTE0loTE0ltTE0luTE0lvTE0mgTE0mhTE0miTE0mkTE0mlTE0mnTE0moTE0mrTE0msTE0mtTE0myTE0naTE0nbTE0ndTE0neTE0ngTE0nlTE0nnTE0noTE0nrTE0nvTE0nyTE0ocTE0ojTE0omTE0orTE0osTE0paTE0piTE0plTE0psTE0ptTE0quTE0rmTE0rnTE0roTE0ruTE0rwTE0saTE0scTE0sdTE0seTE0sgTE0siTE0skTE0slTE0smTE0snTE0soTE0sqTE0srTE0ssTE0stTE0suTE0svTE0swTE0taTE0teTE0tgTE0thTE0tiTE0tkTE0tlTE0tnTE0toTE0trTE0tsTE0ttTE0twTE0tyTE0ugTE0ukTE0urTE0uzTE0veTE0viTE0voTE0waTE0woTE0xhTE0yiTE0yoTE0zaTE0zhTE0zu", "h!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test6526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6526");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("Rf", 57);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test6527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6527");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("italy", "4P404Y4040404DT40404040404.4090493hi4P404Y4040404DT40404040404.40904934!4P404Y4040404DT40404040404.40904934", 4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test6528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6528");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("\u4e2d\u6587_                                                                                                    ", (int) '#', 79);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                    " + "'", str3, "                                                                    ");
    }

    @Test
    public void test6529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6529");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("p0000y0m0dthh0m00.s");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "p0000y0m0dthh0m00.s" + "'", str1, "p0000y0m0dthh0m00.s");
    }

    @Test
    public void test6530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6530");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("zh_twt00t00t00t00t0", "deu", (int) '4');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test6531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6531");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) " un0 ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + " un0 " + "'", str1, " un0 ");
    }

    @Test
    public void test6532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6532");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test6533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6533");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 'u', (long) 100, "xChinesischxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "xChine2678399ichxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx" + "'", str3, "xChine2678399ichxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
    }

    @Test
    public void test6534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6534");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("Heure de GreenwichHeure de GreenwichHeure de GreenwichHeure de GreenwichHeure de GreenwichHeure de GreenwichHeure de GreenwichHeure de GreenwichHeure de GreenwichHeure de GreenwichHeure de GreenwichHeure de GreenwichHeure de GreenwichHeure de GreenwichHeure de GreenwichHeure de GreenwichHeure de GreenwichHeure de GreenwichHeure de Greenwich", "0:00:00.023", (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test6535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6535");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale locale2 = builder0.build();
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale.Builder builder5 = builder0.setLanguageTag("en-GB");
        java.util.Locale locale6 = builder0.build();
        java.util.Locale.Builder builder7 = builder0.clear();
        java.util.Locale.Builder builder8 = builder0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder10 = builder0.setScript("uNITEDSTATES");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: uNITEDSTATES [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en_GB");
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test6536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6536");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("P0Y000DT00000.00120                              P0Y000DT00000.00120                              P0Y000DT00000.00120                              P0Y000DT00000.00120                              P0Y000DT00000.00120                              P0Y000DT00000.00120                              P0Y000DT00000.00120                              P0Y000DT00000.00120                              P0Y000DT00000.00120", 336, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.00120                              P0Y000DT00000.00120                              P0Y000DT00000.00120                              P0Y000DT00000.00120                              P0Y000DT00000.00120                              P0Y000DT00000.00120                              P0Y000DT00000.00120                              P0Y000DT00000.00120                              P0Y000DT00000.00120" + "'", str3, "P0Y000DT00000.00120                              P0Y000DT00000.00120                              P0Y000DT00000.00120                              P0Y000DT00000.00120                              P0Y000DT00000.00120                              P0Y000DT00000.00120                              P0Y000DT00000.00120                              P0Y000DT00000.00120                              P0Y000DT00000.00120");
    }

    @Test
    public void test6537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6537");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "0:00:00.120");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test6538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6538");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("0 DAYS 0 HOURS 0 MINUTES 0 SECOND", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test6539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6539");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("Chine0euuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu\347\uc911\uad6d\uc5b4\uc911\uad6d)", "ine0euuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", 336);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
    }

    @Test
    public void test6540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6540");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("", "United States", (int) (short) 10);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3);
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "P-1Y11M30DT23H59M59.901S");
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test6541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6541");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("I!I!I!I!I!I!I!I!", "P0Y0M0DT0H0M0.041S");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test6542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6542");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("fr-FR", "P-1Y11M30DT23H59M59.96S");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test6543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6543");
        java.util.TimeZone timeZone5 = java.util.TimeZone.getTimeZone("!ih!ih!...testestestestestestestestestestestestestestestestestestestestest'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'");
        int int7 = timeZone5.getOffset((long) (byte) 0);
        java.lang.String str8 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 3, (long) 1, "'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'", false, timeZone5);
        int int9 = timeZone5.getRawOffset();
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "\u683c\u6797\u5a01\u6cbb\u65f6\u95f4");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "P-1Y11M30DT23H59M59.998S" + "'", str8, "P-1Y11M30DT23H59M59.998S");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test6544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6544");
        java.util.Locale locale2 = new java.util.Locale("", "0 days 0 hours 0 minutes 0 seconds");
        java.util.Locale locale3 = java.util.Locale.CHINESE;
        java.lang.String str4 = locale2.getDisplayName(locale3);
        java.util.Locale locale7 = new java.util.Locale("", "0I!");
        java.lang.String str8 = locale7.toLanguageTag();
        java.lang.String str9 = locale3.getDisplayLanguage(locale7);
        org.junit.Assert.assertEquals(locale2.toString(), "_0 DAYS 0 HOURS 0 MINUTES 0 SECONDS");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0 DAYS 0 HOURS 0 MINUTES 0 SECONDS" + "'", str4, "0 DAYS 0 HOURS 0 MINUTES 0 SECONDS");
        org.junit.Assert.assertEquals(locale7.toString(), "_0I!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "und" + "'", str8, "und");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Chinese" + "'", str9, "Chinese");
    }

    @Test
    public void test6545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6545");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("HEURE DE GREENWICH", 0, "P0Y0M0DT0H0M0.037S");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HEURE DE GREENWICH" + "'", str3, "HEURE DE GREENWICH");
    }

    @Test
    public void test6546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6546");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone6 = java.util.TimeZone.getTimeZone("");
        java.lang.String str7 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(1L, 0L, "\u4e2d\u6587", true, timeZone6);
        boolean boolean8 = timeZone6.observesDaylightTime();
        java.util.TimeZone timeZone14 = java.util.TimeZone.getTimeZone("");
        java.lang.String str15 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(1L, 0L, "\u4e2d\u6587", true, timeZone14);
        boolean boolean16 = timeZone6.hasSameRules(timeZone14);
        boolean boolean17 = timeZone0.hasSameRules(timeZone6);
        boolean boolean18 = timeZone6.observesDaylightTime();
        java.time.ZoneId zoneId19 = timeZone6.toZoneId();
        java.lang.String str20 = timeZone6.getID();
        java.util.TimeZone timeZone22 = java.util.TimeZone.getTimeZone("");
        int int23 = timeZone22.getRawOffset();
        java.lang.String str24 = timeZone22.getID();
        int int25 = timeZone22.getRawOffset();
        java.util.TimeZone timeZone26 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone32 = java.util.TimeZone.getTimeZone("");
        java.lang.String str33 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(1L, 0L, "\u4e2d\u6587", true, timeZone32);
        boolean boolean34 = timeZone32.observesDaylightTime();
        java.util.TimeZone timeZone40 = java.util.TimeZone.getTimeZone("");
        java.lang.String str41 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(1L, 0L, "\u4e2d\u6587", true, timeZone40);
        boolean boolean42 = timeZone32.hasSameRules(timeZone40);
        boolean boolean43 = timeZone26.hasSameRules(timeZone32);
        boolean boolean44 = timeZone26.observesDaylightTime();
        java.time.ZoneId zoneId45 = timeZone26.toZoneId();
        boolean boolean46 = timeZone22.hasSameRules(timeZone26);
        boolean boolean47 = timeZone6.hasSameRules(timeZone26);
        java.util.TimeZone timeZone53 = java.util.TimeZone.getTimeZone("");
        java.lang.String str54 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(1L, 0L, "\u4e2d\u6587", true, timeZone53);
        boolean boolean55 = timeZone53.observesDaylightTime();
        int int57 = timeZone53.getOffset(0L);
        timeZone53.setID("P0Y0M0DT0H0M0.100S");
        int int60 = timeZone53.getRawOffset();
        boolean boolean61 = timeZone53.observesDaylightTime();
        boolean boolean62 = timeZone26.hasSameRules(timeZone53);
        org.junit.Assert.assertNotNull(timeZone0);
// flaky:         org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "\u683c\u6797\u5a01\u6cbb\u65f6\u95f4");
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "\u683c\u6797\u5a01\u6cbb\u65f6\u95f4");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\u4e2d\u6587" + "'", str7, "\u4e2d\u6587");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(timeZone14);
        org.junit.Assert.assertEquals(timeZone14.getDisplayName(), "\u683c\u6797\u5a01\u6cbb\u65f6\u95f4");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\u4e2d\u6587" + "'", str15, "\u4e2d\u6587");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
// flaky:         org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(zoneId19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "GMT" + "'", str20, "GMT");
        org.junit.Assert.assertNotNull(timeZone22);
        org.junit.Assert.assertEquals(timeZone22.getDisplayName(), "\u683c\u6797\u5a01\u6cbb\u65f6\u95f4");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "GMT" + "'", str24, "GMT");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(timeZone26);
// flaky:         org.junit.Assert.assertEquals(timeZone26.getDisplayName(), "\u683c\u6797\u5a01\u6cbb\u65f6\u95f4");
        org.junit.Assert.assertNotNull(timeZone32);
        org.junit.Assert.assertEquals(timeZone32.getDisplayName(), "\u683c\u6797\u5a01\u6cbb\u65f6\u95f4");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "\u4e2d\u6587" + "'", str33, "\u4e2d\u6587");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(timeZone40);
        org.junit.Assert.assertEquals(timeZone40.getDisplayName(), "\u683c\u6797\u5a01\u6cbb\u65f6\u95f4");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "\u4e2d\u6587" + "'", str41, "\u4e2d\u6587");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
// flaky:         org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(zoneId45);
// flaky:         org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
// flaky:         org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(timeZone53);
        org.junit.Assert.assertEquals(timeZone53.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "\u4e2d\u6587" + "'", str54, "\u4e2d\u6587");
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
// flaky:         org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
    }

    @Test
    public void test6547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6547");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("tes)aenglish (united st44444444", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "tes)aenglish (united st44444444" + "'", str2, "tes)aenglish (united st44444444");
    }

    @Test
    public void test6548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6548");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("0 days 0 hours");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "sruoh 0 syad 0" + "'", str1, "sruoh 0 syad 0");
    }

    @Test
    public void test6549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6549");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("0 days 0 hours 0 minutes 0 seconds                                                                  ", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0 days 0 hours 0 minutes 0 seconds                                                                  " + "'", str2, "0 days 0 hours 0 minutes 0 seconds                                                                  ");
    }

    @Test
    public void test6550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6550");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("ZH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Z" + "'", str1, "Z");
    }

    @Test
    public void test6551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6551");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("Chine", "0:00:00.990:00:00.990:00:00.990:00:00.990:00:00.990:00:00.990:00:00.990:00:00.990:00:00.990:00:00.990:00:00.990:00:00.990:00:00.990:00:00.990:00:00.990:00:00.990:00:00.990:00:00.990:00:00.990:00:00.990:00:00.990:00:00.990:00:00.990:00:00.990:00:00.990:00:00.990:00:00.990:00:00.990:00:00.990:00:00.990:00:00.990:00:00.99", (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test6552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6552");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale locale2 = builder0.build();
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale.Builder builder4 = builder3.clearExtensions();
        java.util.Locale locale5 = builder3.build();
        java.util.Locale locale6 = builder3.build();
        java.lang.String str8 = locale6.getExtension('a');
        java.lang.Object obj9 = locale6.clone();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertEquals(obj9.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj9), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj9), "");
    }

    @Test
    public void test6553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6553");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale locale2 = builder0.build();
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale.Builder builder4 = builder3.clearExtensions();
        java.util.Locale locale5 = builder3.build();
        java.util.Locale locale6 = builder3.build();
        java.util.Locale.Builder builder7 = builder3.clear();
        java.util.Locale.Builder builder9 = builder3.setLanguageTag("tes");
        java.util.Locale locale10 = builder3.build();
        java.lang.String str11 = locale10.getDisplayLanguage();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "");
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "tes");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "tes" + "'", str11, "tes");
    }

    @Test
    public void test6554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6554");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("                 ng", "zh_TW");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test6555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6555");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("P0Y0M0DT0H0M0.013S", "OUhS 0 MI", "P-1Y11M30DT23H59M59.947S");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y0M0DT0H0M0.013S" + "'", str3, "P0Y0M0DT0H0M0.013S");
    }

    @Test
    public void test6556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6556");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "ZH_TW");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test6557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6557");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("\uc5b4\uad6d\uc911\uad6d\uc911(", "0:00:00.99");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\uc5b4\uad6d\uc911\uad6d\uc911(" + "'", str2, "\uc5b4\uad6d\uc911\uad6d\uc911(");
    }

    @Test
    public void test6558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6558");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("Engli0hP0Y0-10DT07430-10.1213599678(Unite0P0Y0-10DT07430-10.1213599678120tate0)", "P0Y0M0DT0H0M0.224S");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test6559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6559");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "aaaaaaaaaaaaaa...", (java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaap0y0m0dt0h0m0.034saaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 85 + "'", int2 == 85);
    }

    @Test
    public void test6560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6560");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("#######P0Y0M0DT0H0M0.000S#######", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.034-1aaaaaaaaaaaaaaaaaaGreenwich Mean Time", (int) 'a');
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, '#');
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#######P0Y0M0DT0H0M0.000S#######" + "'", str5, "#######P0Y0M0DT0H0M0.000S#######");
    }

    @Test
    public void test6561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6561");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("");
        int int2 = timeZone1.getRawOffset();
        java.lang.String str3 = timeZone1.getID();
        int int5 = timeZone1.getOffset((long) 10);
        boolean boolean6 = timeZone1.observesDaylightTime();
        java.util.TimeZone timeZone8 = java.util.TimeZone.getTimeZone("P0Y0M0DT0H0M0.001S");
        java.lang.String str9 = timeZone8.getID();
        boolean boolean10 = timeZone8.observesDaylightTime();
        int int12 = timeZone8.getOffset((long) 10);
        java.util.TimeZone.setDefault(timeZone8);
        boolean boolean14 = timeZone1.hasSameRules(timeZone8);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u683c\u6797\u5a01\u6cbb\u65f6\u95f4");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "GMT" + "'", str3, "GMT");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "\u683c\u6797\u5a01\u6cbb\u65f6\u95f4");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "GMT" + "'", str9, "GMT");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test6562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6562");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("I!ChiI!Chi");
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u683c\u6797\u5a01\u6cbb\u65f6\u95f4");
    }

    @Test
    public void test6563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6563");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("s020.0M00TD0M0Y0P", 23);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "s020.0M00TD0M0Y0P" + "'", str2, "s020.0M00TD0M0Y0P");
    }

    @Test
    public void test6564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6564");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("                                                                                              dnu");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                              DNU" + "'", str1, "                                                                                              DNU");
    }

    @Test
    public void test6565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6565");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("hi!", "", (int) 'a');
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.split("HI!44444444444444444444444444444", '#');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("HI!", strArray4, strArray7);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, "FR");
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray4);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "HI!" + "'", str8, "HI!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test6566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6566");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("99.00:00:0", "x");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu0:00:00.097", "HI!");
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray6, ' ');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.replaceEach("44444444444444444444444444444444444444           HI!", strArray3, strArray6);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "_0 DAY10 0 0OUR10 0 0INUTE10 0 ECOND_0 DAY 0 0OUR10 0 0INUTE10 0 ECOND_0 DAY 0 0OUR10 0 0INUTE10 0 ECOND_0 DAY 0 0OUR44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444zh_tw ECOND", (int) '#', 30);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu0:00:00.097" + "'", str8, "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu0:00:00.097");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "44444444444444444444444444444444444444           HI!" + "'", str9, "44444444444444444444444444444444444444           HI!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test6567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6567");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly(charSequence0, "aa ab ae af ak am an ar as av ay az ba be bg bh bi bm bn bo br bs ca ce ch co cr cs cu cv cy da de dv dz ee el en eo es et eu fa ff fi fj fo fr fy ga gd gl gn gu gv ha he hi ho hr ht hu hy hz ia id ie ig ii ik in io is it iu iw ja ji jv ka kg ki kj kk kl km kn ko kr ks ku kv kw ky la lb lg li ln lo lt lu lv mg mh mi mk ml mn mo mr ms mt my na nb nd ne ng nl nn no nr nv ny oc oj om or os pa pi pl ps pt qu rm rn ro ru rw sa sc sd se sg si sk sl sm sn so sq sr ss st su sv sw ta te tg th ti tk tl tn to tr ts tt tw ty ug uk ur uz ve vi vo wa wo xh yi yo za zh zu");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test6568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6568");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("", "\u6cd5\u6587\u6cd5\u56fd)", "gb");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test6569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6569");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("France", "CN", (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test6570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6570");
        java.util.Locale locale1 = java.util.Locale.CHINA;
        java.util.Locale locale2 = java.util.Locale.PRC;
        java.lang.String str3 = locale1.getDisplayLanguage(locale2);
        java.lang.String str4 = locale1.getISO3Country();
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.lowerCase("                                 P-1Y11M30DT23H59M59.947S0DT0H0M0.090S!P0Y0M0DT0H0M0.090S", locale1);
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u4e2d\u6587" + "'", str3, "\u4e2d\u6587");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "CHN" + "'", str4, "CHN");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "                                 p-1y11m30dt23h59m59.947s0dt0h0m0.090s!p0y0m0dt0h0m0.090s" + "'", str5, "                                 p-1y11m30dt23h59m59.947s0dt0h0m0.090s!p0y0m0dt0h0m0.090s");
    }

    @Test
    public void test6571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6571");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("", 49, "Deutschland");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "DeutschlandDeutschlandDeutschlandDeutschlandDeuts" + "'", str3, "DeutschlandDeutschlandDeutschlandDeutschlandDeuts");
    }

    @Test
    public void test6572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6572");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.concatWith("44", (java.lang.Object[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi44!44hi44!44hi44!44hi44!44hi44!44hi44!44hi44!44hi44!44hi44!44hi44!44hi44!44hi44!44hi44!44hi44!44hi44!44hi44!44hi44!44hi44!44hi44!44hi44!44hi44!44hi44!44hi44!44hi44!44hi44!44hi44!44hi44!44hi44!44hi44!44hi44!44hi44!44hi44!" + "'", str3, "hi44!44hi44!44hi44!44hi44!44hi44!44hi44!44hi44!44hi44!44hi44!44hi44!44hi44!44hi44!44hi44!44hi44!44hi44!44hi44!44hi44!44hi44!44hi44!44hi44!44hi44!44hi44!44hi44!44hi44!44hi44!44hi44!44hi44!44hi44!44hi44!44hi44!44hi44!44hi44!");
    }

    @Test
    public void test6573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6573");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat("w", 14);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "wwwwwwwwwwwwww" + "'", str2, "wwwwwwwwwwwwww");
    }

    @Test
    public void test6574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6574");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("0e-0:00:00.017", "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 14 + "'", int2 == 14);
    }

    @Test
    public void test6575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6575");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("english (nited states)", 24, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test6576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6576");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("                                                                                                     ...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                                     ..." + "'", str1, "                                                                                                     ...");
    }

    @Test
    public void test6577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6577");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("        Italy");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ylatI        " + "'", str1, "ylatI        ");
    }

    @Test
    public void test6578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6578");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationWords(0L, false, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0 days" + "'", str3, "0 days");
    }

    @Test
    public void test6579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6579");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("p0Y0M0DT0H0M0.001S", "P0Y0M0DT0H0M0.051S");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test6580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6580");
        java.util.Locale locale2 = java.util.Locale.CHINA;
        java.util.Locale locale3 = locale2.stripExtensions();
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.lowerCase("99.00:00:0", locale2);
        boolean boolean5 = locale2.hasExtensions();
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.upperCase("eng", locale2);
        java.lang.String str7 = locale2.toLanguageTag();
        java.lang.String str8 = locale2.getDisplayCountry();
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "99.00:00:0" + "'", str4, "99.00:00:0");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ENG" + "'", str6, "ENG");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "zh-CN" + "'", str7, "zh-CN");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\u4e2d\u56fd" + "'", str8, "\u4e2d\u56fd");
    }

    @Test
    public void test6581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6581");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("0 days", " ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test6582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6582");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "0eure 0e Greenwich0eure 0e Greenwich0eure 0e Greenwich0eure 0e Greenwich0eure 0e Greenwich0eure 0e Greenwich0eure 0e Greenwich0eure 0e Greenwich0eure 0e Greenwich0eure 0e Greenwich0eure 0e Greenwich0eure 0e Greenwich0eure 0e Greenwich0eure 0e Greenwich0eure 0e Greenwich0eure 0e Greenwich0eure 0e Greenwich0eure 0e Greenwich0eure 0e Greenwich");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test6583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6583");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("0e-0:00:00.017", 63);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                        0e-0:00:00.017                         " + "'", str2, "                        0e-0:00:00.017                         ");
    }

    @Test
    public void test6584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6584");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale1 = java.util.Locale.CANADA;
        java.util.Locale.setDefault(category0, locale1);
        java.lang.String str3 = locale1.getLanguage();
        java.util.Locale.setDefault(locale1);
        java.lang.String str5 = locale1.getVariant();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "en" + "'", str3, "en");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test6585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6585");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("sruoh 0 syad 0");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "sruoh 0 syad 0" + "'", str1, "sruoh 0 syad 0");
    }

    @Test
    public void test6586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6586");
        java.util.Locale locale3 = new java.util.Locale("P0Y0M0DT0H0M0.052S", "cHINESE      ", "_0 DAY10 0 0OUR10 0 0INUTE10 0 ECOND_0 DAY 0 0OUR10 0 0INUTE10 0 ECOND_0 DAY 0 0OUR10 0 0INUTE10 0 ECOND_0 DAY 0 0OUR10 0 0INUTE10 0 ECOND_0 DAY 0 0OUR10 0 0INUTE10 0 ECOND_0 DAY 0 0OUR10 0 0INUTE10 0 ECOND_0 DAY 0 0OUR10 0 0INUTE10 0 ECOND_0 DAY 0 0OUR10 0 0INUTE10 0 ECOND_0 DAY 0 0OUR10 0 0INUTE10 0 ECOND_0 DAY 0 0OUR10 0 0INUTE10 0 ECOND");
        org.junit.Assert.assertEquals(locale3.toString(), "p0y0m0dt0h0m0.052s_CHINESE      __0 DAY10 0 0OUR10 0 0INUTE10 0 ECOND_0 DAY 0 0OUR10 0 0INUTE10 0 ECOND_0 DAY 0 0OUR10 0 0INUTE10 0 ECOND_0 DAY 0 0OUR10 0 0INUTE10 0 ECOND_0 DAY 0 0OUR10 0 0INUTE10 0 ECOND_0 DAY 0 0OUR10 0 0INUTE10 0 ECOND_0 DAY 0 0OUR10 0 0INUTE10 0 ECOND_0 DAY 0 0OUR10 0 0INUTE10 0 ECOND_0 DAY 0 0OUR10 0 0INUTE10 0 ECOND_0 DAY 0 0OUR10 0 0INUTE10 0 ECOND");
    }

    @Test
    public void test6587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6587");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("\u4e2d\u6587_                                                                                                    ", "chinoi0", "001.00:00:0", (int) 'a');
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u4e2d\u6587_                                                                                                    " + "'", str4, "\u4e2d\u6587_                                                                                                    ");
    }

    @Test
    public void test6588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6588");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                  ", 'a');
        boolean boolean5 = org.apache.commons.lang3.StringUtils.endsWithAny("'P'yyyy''''d''''m''s.''", strArray4);
        boolean boolean6 = org.apache.commons.lang3.StringUtils.endsWithAny("_0 DAY25 0 0OUR25 0 0INUTE0025 0 ECOND_0 DAY 0 0OUR25 0 0INUTE0025 0 ECOND_0 DAY 0P0Y000DT00000.02025", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test6589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6589");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "\u683c\u6797\u5a01\u6cbb\u6642\u9593");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\u683c\u6797\u5a01\u6cbb\u6642\u9593" + "'", str1, "\u683c\u6797\u5a01\u6cbb\u6642\u9593");
    }

    @Test
    public void test6590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6590");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "021.00:00:0");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 11 + "'", int1 == 11);
    }

    @Test
    public void test6591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6591");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "h!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!i", (java.lang.CharSequence) "...ch0eure 0e Gr...");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "h!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!i" + "'", charSequence2, "h!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!i");
    }

    @Test
    public void test6592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6592");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone6 = java.util.TimeZone.getTimeZone("");
        java.lang.String str7 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(1L, 0L, "\u4e2d\u6587", true, timeZone6);
        boolean boolean8 = timeZone6.observesDaylightTime();
        java.util.TimeZone timeZone14 = java.util.TimeZone.getTimeZone("");
        java.lang.String str15 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(1L, 0L, "\u4e2d\u6587", true, timeZone14);
        boolean boolean16 = timeZone6.hasSameRules(timeZone14);
        boolean boolean17 = timeZone0.hasSameRules(timeZone6);
        boolean boolean18 = timeZone0.observesDaylightTime();
        java.time.ZoneId zoneId19 = timeZone0.toZoneId();
        boolean boolean20 = timeZone0.observesDaylightTime();
        boolean boolean21 = timeZone0.observesDaylightTime();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str24 = timeZone0.getDisplayName(false, 49);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal style: 49");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\u4e2d\u6587" + "'", str7, "\u4e2d\u6587");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(timeZone14);
        org.junit.Assert.assertEquals(timeZone14.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\u4e2d\u6587" + "'", str15, "\u4e2d\u6587");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(zoneId19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test6593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6593");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        java.util.Locale locale1 = locale0.stripExtensions();
        java.lang.String str2 = locale0.getDisplayLanguage();
        java.lang.String str3 = locale0.getDisplayName();
        java.lang.String str4 = locale0.getDisplayVariant();
        java.util.Locale locale6 = new java.util.Locale("en-GB");
        java.lang.String str7 = locale6.getISO3Country();
        java.lang.String str9 = locale6.getExtension('u');
        java.lang.String str10 = locale6.getDisplayCountry();
        java.lang.String str11 = locale0.getDisplayVariant(locale6);
        java.util.Locale locale12 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Set<java.lang.String> strSet13 = locale12.getUnicodeLocaleKeys();
        java.util.Locale locale14 = java.util.Locale.FRANCE;
        java.util.Set<java.lang.String> strSet15 = locale14.getUnicodeLocaleKeys();
        java.util.Locale locale16 = java.util.Locale.CHINESE;
        java.lang.String str17 = locale14.getDisplayName(locale16);
        java.lang.String str18 = locale16.getLanguage();
        java.util.Set<java.lang.String> strSet19 = locale16.getUnicodeLocaleAttributes();
        java.lang.String str20 = locale16.getISO3Country();
        java.lang.String str21 = locale12.getDisplayName(locale16);
        java.lang.String str22 = locale16.getVariant();
        java.lang.String str23 = locale0.getDisplayVariant(locale16);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Chinese" + "'", str2, "Chinese");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Chinese (China)" + "'", str3, "Chinese (China)");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals(locale6.toString(), "en-gb");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(strSet15);
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "zh");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\u6cd5\u6587\u6cd5\u56fd)" + "'", str17, "\u6cd5\u6587\u6cd5\u56fd)");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "zh" + "'", str18, "zh");
        org.junit.Assert.assertNotNull(strSet19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\u4e2d\u6587\u4e2d\u56fd)" + "'", str21, "\u4e2d\u6587\u4e2d\u56fd)");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test6594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6594");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "Chine0euuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Chine0euuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu" + "'", str1, "Chine0euuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
    }

    @Test
    public void test6595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6595");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("danaC", 336);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "danaC" + "'", str2, "danaC");
    }

    @Test
    public void test6596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6596");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "P0Y0-10DT07430-10", "P0Y000DT00000.09010hiP0Y000DT00000.09010!P0Y000DT00000.09010FRAFRAFRAFRAFRAFRAFRAFRAFRAFRAFRAFRA");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test6597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6597");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("P0Y000DT00000.00120                              P0Y000DT00000.00120                              P0Y000DT00000.00120                              P0Y000DT00000.00120                              P0Y000DT00000.00120                              P0Y000DT00000.00120                              P0Y000DT00000.00120                              P0Y000DT00000.00120                              P0Y000DT00000.00120", "\uc77c\ubcf8\uc5b4", "zh_CNzhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhoz");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test6598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6598");
        java.util.Locale locale2 = new java.util.Locale("0:00:00.99");
        java.util.Locale locale3 = java.util.Locale.ROOT;
        java.util.Locale locale6 = new java.util.Locale("\u4e2d\u6587", "                                                                                                    ");
        java.lang.String str7 = locale3.getDisplayCountry(locale6);
        java.lang.String str8 = locale2.getDisplayScript(locale3);
        java.util.Locale locale9 = locale3.stripExtensions();
        java.util.Locale locale11 = java.util.Locale.GERMANY;
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.lowerCase("HI!", locale11);
        java.lang.String str13 = locale11.toLanguageTag();
        java.lang.String str14 = locale11.getDisplayScript();
        java.lang.String str15 = locale9.getDisplayVariant(locale11);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.upperCase("Heure de Greenwich", locale11);
        java.util.Locale locale17 = java.util.Locale.ROOT;
        java.lang.String str18 = locale11.getDisplayName(locale17);
        org.junit.Assert.assertEquals(locale2.toString(), "0:00:00.99");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertEquals(locale6.toString(), "\u4e2d\u6587_                                                                                                    ");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "de-DE" + "'", str13, "de-DE");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HEURE DE GREENWICH" + "'", str16, "HEURE DE GREENWICH");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "German (Germany)" + "'", str18, "German (Germany)");
    }

    @Test
    public void test6599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6599");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("0:00:00.10I!0:00:00.1", '#');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test6600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6600");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale locale2 = builder0.build();
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale.Builder builder4 = builder3.clearExtensions();
        java.util.Locale locale5 = builder3.build();
        java.util.Locale.Builder builder6 = builder3.clearExtensions();
        java.util.Locale.Builder builder7 = builder6.clear();
        java.util.Locale.Builder builder10 = builder7.setExtension('a', "");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder12 = builder7.setScript("STESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTEST'P'YYYY'Y'M'M'D'DT'H'H'M'M'S.S'S'NGLISH (uNITED kINGDOM)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: STESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTEST'P'YYYY'Y'M'M'D'DT'H'H'M'M'S.S'S'NGLISH (uNITED kINGDOM) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test6601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6601");
        java.util.Locale locale2 = new java.util.Locale("italyP0Y0M0DT0H0M0.004SitalyP0Y0M0DT0H0M0.004SitalyP0Y0M0DT0H0M0.004SitalyP0Y0M0DT0H0M0.004SitalyP0Y0M0DT0H0M0.004SitalyP0Y0M0DT0H0M0.004SitalyP0Y0M0DT0H0M0.004SitalyP0Y0M0DT0H0M0.004SitalyP0Y0M0DT0H0M0.004SitalyP0Y0M0DT0H0M0.004SitalyP0Y0M0DT0H0M0.004SitalyP0Y0M0DT0H0M0.004SitalyP0Y0M0DT0H0M0.004Sitaly", "!IH#####################################################################################################################");
        org.junit.Assert.assertEquals(locale2.toString(), "italyp0y0m0dt0h0m0.004sitalyp0y0m0dt0h0m0.004sitalyp0y0m0dt0h0m0.004sitalyp0y0m0dt0h0m0.004sitalyp0y0m0dt0h0m0.004sitalyp0y0m0dt0h0m0.004sitalyp0y0m0dt0h0m0.004sitalyp0y0m0dt0h0m0.004sitalyp0y0m0dt0h0m0.004sitalyp0y0m0dt0h0m0.004sitalyp0y0m0dt0h0m0.004sitalyp0y0m0dt0h0m0.004sitalyp0y0m0dt0h0m0.004sitaly_!IH#####################################################################################################################");
    }

    @Test
    public void test6602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6602");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("de_dede_dede_dedeng", "                                                                                                                                                                                                                              000 0A000 0A000 0A000 0A000 0A000 0A000 0A000 0A000 0A000 0A000 0A000 0A000 0A000 0A000 0A000 0A");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test6603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6603");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 0, (long) (byte) 1, "                                                                                                                     !I0");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                     !I0" + "'", str3, "                                                                                                                     !I0");
    }

    @Test
    public void test6604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6604");
        java.lang.String[] strArray1 = java.util.TimeZone.getAvailableIDs(9);
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test6605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6605");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("                                                p0y0m0dt0h0m0.090ship0y0m0dt0h0m0.090s!p0y0m0dt0h0m0.090s", "M0DT0H0M0.000S");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                p0y0m0dt0h0m0.090ship0y0m0dt0h0m0.090s!p0y0m0dt0h0m0.090s" + "'", str2, "                                                p0y0m0dt0h0m0.090ship0y0m0dt0h0m0.090s!p0y0m0dt0h0m0.090s");
    }

    @Test
    public void test6606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6606");
        java.util.TimeZone timeZone5 = java.util.TimeZone.getTimeZone("");
        int int6 = timeZone5.getRawOffset();
        java.lang.String str7 = timeZone5.getID();
        java.time.ZoneId zoneId8 = timeZone5.toZoneId();
        java.lang.String str9 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(0L, 1L, "\u6cd5\u6587\u6cd5\u56fd)", false, timeZone5);
        java.util.TimeZone.setDefault(timeZone5);
        java.lang.String str11 = timeZone5.getID();
        int int12 = timeZone5.getRawOffset();
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "GMT" + "'", str7, "GMT");
        org.junit.Assert.assertNotNull(zoneId8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\u6cd5\u6587\u6cd5\u56fd)" + "'", str9, "\u6cd5\u6587\u6cd5\u56fd)");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "GMT" + "'", str11, "GMT");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test6607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6607");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "en_GB");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test6608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6608");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfBlank("", "wwwwwwwwwwwwww");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "wwwwwwwwwwwwww" + "'", str2, "wwwwwwwwwwwwww");
    }

    @Test
    public void test6609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6609");
        java.util.Locale locale2 = new java.util.Locale("!ih#######", " #####################################################################################################################  ");
        java.util.Locale locale4 = java.util.Locale.forLanguageTag("GB");
        java.lang.String str5 = locale2.getDisplayCountry(locale4);
        org.junit.Assert.assertEquals(locale2.toString(), "!ih#######_ #####################################################################################################################  ");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "gb");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + " #####################################################################################################################  " + "'", str5, " #####################################################################################################################  ");
    }

    @Test
    public void test6610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6610");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce(" #####################################################################################################################  ", "gmt", "                                                                                     0:00:00.000uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                                                                                     0:00:00.000uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                                                                                     0:00:00.000uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                                                                                     0:00:00.000uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                                                                                     0:00:00.000");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " #####################################################################################################################  " + "'", str3, " #####################################################################################################################  ");
    }

    @Test
    public void test6611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6611");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("P0Y0M0DT0H0M0.000S", 'u');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test6612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6612");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH", (java.lang.CharSequence) "HI!                                                                                              ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 96 + "'", int2 == 96);
    }

    @Test
    public void test6613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6613");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "P0Y0-10DT07430-10.0323599998");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "p0Y0-10DT07430-10.0323599998" + "'", str1, "p0Y0-10DT07430-10.0323599998");
    }

    @Test
    public void test6614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6614");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("EN", "'m'...", "                                                hi!                                                 ", 9);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EN" + "'", str4, "EN");
    }

    @Test
    public void test6615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6615");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("hi!", "", (int) 'a');
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.split("HI!44444444444444444444444444444", '#');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("HI!", strArray6, strArray9);
        java.lang.String[] strArray11 = org.apache.commons.lang3.StringUtils.stripAll(strArray6);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.concatWith("p0y0m0dt0h0m0.000s", (java.lang.Object[]) strArray6);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.concatWith("fran\347\uc911\uad6d\uc5b4\uc911\uad6d)", (java.lang.Object[]) strArray6);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HI!" + "'", str10, "HI!");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test6616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6616");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("44P0Y0-10DT07430-10.034359990044", "\uc77c\ubcf8\uc5b4");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test6617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6617");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterType("                                                hi!                                                 ");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray2);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, 'x', (int) (byte) 100, 0);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.endsWithAny("aaaaaa0:00:00.99aaaaaaa", strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test6618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6618");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("Uuuuuuuuuuuuuuuuuuuuuuuu0320.00000TD000Y0P");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "UUUUUUUUUUUUUUUUUUUUUUUU0320.00000TD000Y0P" + "'", str1, "UUUUUUUUUUUUUUUUUUUUUUUU0320.00000TD000Y0P");
    }

    @Test
    public void test6619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6619");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("Italy", "0320.00000TD000Y0P");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Italy" + "'", str2, "Italy");
    }

    @Test
    public void test6620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6620");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("xChine2678399ichxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx", "", 57);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test6621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6621");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "                    HI!                                      P0Y0M0DT0H0M0.090ShiP0Y0M0DT0H0M0.090S!P0Y0M0DT0H0M0.090S");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                    HI!                                      P0Y0M0DT0H0M0.090ShiP0Y0M0DT0H0M0.090S!P0Y0M0DT0H0M0.090S" + "'", str1, "                    HI!                                      P0Y0M0DT0H0M0.090ShiP0Y0M0DT0H0M0.090S!P0Y0M0DT0H0M0.090S");
    }

    @Test
    public void test6622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6622");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("               ZH_TW (P0Y0-10DT07430-10.0343599900,0 DAYS 0 HOURS 0 MINUTES 0 SECOND)               ", "P0Y0M0DT0H0M0.037S");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test6623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6623");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("P0Y0M0DT0de_zh_tw (P0Y0-10DT07430-10.0343599900,0 DAYS 0 HOURS 0 MINUTES 0 SECOND", "uuuuuuuuuuuuuuuund-IH");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test6624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6624");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder2 = builder1.clearExtensions();
        java.util.Locale locale3 = builder2.build();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder5 = builder2.removeUnicodeLocaleAttribute("0:00:00.000");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: 0:00:00.000 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "");
    }

    @Test
    public void test6625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6625");
        java.util.Locale.Category category0 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale1 = java.util.Locale.getDefault();
        java.util.Locale.setDefault(category0, locale1);
        java.util.Locale locale3 = java.util.Locale.KOREA;
        java.util.Locale.setDefault(category0, locale3);
        java.util.Locale locale6 = java.util.Locale.CHINA;
        java.util.Locale locale7 = locale6.stripExtensions();
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.lowerCase("99.00:00:0", locale6);
        java.util.Locale.setDefault(category0, locale6);
        java.util.Locale locale10 = java.util.Locale.getDefault(category0);
        java.util.Locale locale11 = java.util.Locale.getDefault(category0);
        java.util.Locale locale12 = java.util.Locale.JAPANESE;
        java.lang.String str13 = locale12.getLanguage();
        java.util.Locale locale14 = java.util.Locale.KOREAN;
        java.lang.String str15 = locale14.getDisplayVariant();
        java.lang.String str16 = locale12.getDisplayName(locale14);
        boolean boolean17 = locale14.hasExtensions();
        java.lang.String str18 = locale14.getDisplayName();
        java.util.Locale locale22 = new java.util.Locale("!IH", "P0Y0M0DT0H0M0.034S", "\u6cd5\u6587\u6cd5\u56fd)");
        java.util.Set<java.lang.Character> charSet23 = locale22.getExtensionKeys();
        java.lang.String str24 = locale22.getLanguage();
        java.util.Locale locale26 = java.util.Locale.CHINA;
        java.util.Locale locale27 = locale26.stripExtensions();
        java.lang.String str28 = org.apache.commons.lang3.StringUtils.lowerCase("99.00:00:0", locale26);
        boolean boolean29 = locale26.hasExtensions();
        java.util.Set<java.lang.String> strSet30 = locale26.getUnicodeLocaleKeys();
        java.lang.String str31 = locale22.getDisplayCountry(locale26);
        java.util.Locale.Category category32 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale33 = java.util.Locale.CANADA;
        java.util.Locale.setDefault(category32, locale33);
        java.lang.String str35 = locale26.getDisplayScript(locale33);
        java.lang.String str36 = locale33.getISO3Country();
        java.util.Locale.Builder builder37 = new java.util.Locale.Builder();
        java.util.Locale locale38 = builder37.build();
        java.util.Locale.setDefault(locale38);
        java.util.Locale locale40 = java.util.Locale.CHINA;
        java.util.Locale locale41 = java.util.Locale.PRC;
        java.lang.String str42 = locale40.getDisplayLanguage(locale41);
        java.lang.String str43 = locale38.getDisplayLanguage(locale41);
        java.lang.String str44 = locale41.getISO3Language();
        java.util.Locale locale47 = new java.util.Locale("!I0", "P0Y0M0DT0H0M0.034S");
        java.lang.String str48 = locale41.getDisplayVariant(locale47);
        java.util.Locale.Builder builder49 = new java.util.Locale.Builder();
        java.util.Locale locale50 = builder49.build();
        java.util.Locale locale51 = builder49.build();
        java.util.Locale.Builder builder52 = builder49.clear();
        java.util.Locale.Builder builder53 = builder52.clearExtensions();
        java.util.Locale.Builder builder54 = builder53.clear();
        java.util.Locale locale55 = builder54.build();
        java.lang.String str56 = locale41.getDisplayScript(locale55);
        java.lang.String str57 = locale41.getDisplayScript();
        java.lang.String str58 = locale33.getDisplayScript(locale41);
        java.lang.String str59 = locale14.getDisplayLanguage(locale41);
        java.util.Locale locale64 = new java.util.Locale("de-DE", "0days0hours0minutes0seco", "Chine0e");
        java.lang.String str65 = org.apache.commons.lang3.StringUtils.upperCase("HI!", locale64);
        java.lang.String str66 = locale14.getDisplayVariant(locale64);
        java.lang.String str68 = locale14.getExtension('u');
        java.util.Locale.setDefault(category0, locale14);
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en_CA");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "99.00:00:0" + "'", str8, "99.00:00:0");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "ja");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "ja" + "'", str13, "ja");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\uc77c\ubcf8\uc5b4" + "'", str16, "\uc77c\ubcf8\uc5b4");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\u671d\u9c9c\u6587" + "'", str18, "\u671d\u9c9c\u6587");
// flaky:         org.junit.Assert.assertEquals(locale22.toString(), "\u6cd5\u6587\u6cd5\u56fd)");
        org.junit.Assert.assertNotNull(charSet23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "!ih" + "'", str24, "!ih");
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "99.00:00:0" + "'", str28, "99.00:00:0");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(strSet30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "P0Y0M0DT0H0M0.034S" + "'", str31, "P0Y0M0DT0H0M0.034S");
        org.junit.Assert.assertTrue("'" + category32 + "' != '" + java.util.Locale.Category.FORMAT + "'", category32.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "CAN" + "'", str36, "CAN");
        org.junit.Assert.assertNotNull(locale38);
        org.junit.Assert.assertEquals(locale38.toString(), "");
        org.junit.Assert.assertNotNull(locale40);
        org.junit.Assert.assertEquals(locale40.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale41);
        org.junit.Assert.assertEquals(locale41.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "\u4e2d\u6587" + "'", str42, "\u4e2d\u6587");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "zho" + "'", str44, "zho");
        org.junit.Assert.assertEquals(locale47.toString(), "!i0_P0Y0M0DT0H0M0.034S");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertNotNull(locale50);
        org.junit.Assert.assertEquals(locale50.toString(), "");
        org.junit.Assert.assertNotNull(locale51);
        org.junit.Assert.assertEquals(locale51.toString(), "");
        org.junit.Assert.assertNotNull(builder52);
        org.junit.Assert.assertNotNull(builder53);
        org.junit.Assert.assertNotNull(builder54);
        org.junit.Assert.assertNotNull(locale55);
        org.junit.Assert.assertEquals(locale55.toString(), "");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "\u671d\u9c9c\u6587" + "'", str59, "\u671d\u9c9c\u6587");
        org.junit.Assert.assertEquals(locale64.toString(), "de-de_0DAYS0HOURS0MINUTES0SECO_Chine0e");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "HI!" + "'", str65, "HI!");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "" + "'", str66, "");
        org.junit.Assert.assertNull(str68);
    }

    @Test
    public void test6626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6626");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("");
        int int2 = timeZone1.getRawOffset();
        int int3 = timeZone1.getRawOffset();
        timeZone1.setID("0 days 0 hours 0 minutes 0 seconds0 days 0 hours 0 minutes 0 seconds0 days 0 hours 0 minutes 0 secon");
        java.util.TimeZone timeZone7 = java.util.TimeZone.getTimeZone("");
        int int8 = timeZone7.getRawOffset();
        java.lang.String str9 = timeZone7.getID();
        java.time.ZoneId zoneId10 = timeZone7.toZoneId();
        boolean boolean11 = timeZone1.hasSameRules(timeZone7);
        boolean boolean12 = timeZone7.observesDaylightTime();
        java.util.TimeZone timeZone14 = java.util.TimeZone.getTimeZone("!I0");
        boolean boolean15 = timeZone7.hasSameRules(timeZone14);
        boolean boolean16 = timeZone14.useDaylightTime();
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(timeZone7);
// flaky:         org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "\uadf8\ub9ac\ub2c8\uce58\ud45c\uc900\uc2dc");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "GMT" + "'", str9, "GMT");
        org.junit.Assert.assertNotNull(zoneId10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(timeZone14);
// flaky:         org.junit.Assert.assertEquals(timeZone14.getDisplayName(), "\uadf8\ub9ac\ub2c8\uce58\ud45c\uc900\uc2dc");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test6627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6627");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationWords((long) 79, true, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0 seconds" + "'", str3, "0 seconds");
    }

    @Test
    public void test6628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6628");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("uuuuuuuuuuuaaaaaaaaaaaaaChinese (China)aaaaaaaaaaaaa", "0:00:00.0170:00:00.0170:00:00.0170:00:00.0170:00:00.0170:uNITED STATES", 89, (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "u0:00:00.0170:00:00.0170:00:00.0170:00:00.0170:00:00.0170:uNITED STATES" + "'", str4, "u0:00:00.0170:00:00.0170:00:00.0170:00:00.0170:00:00.0170:uNITED STATES");
    }

    @Test
    public void test6629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6629");
        java.util.Locale locale1 = new java.util.Locale("English (United States)");
        java.util.Locale locale4 = new java.util.Locale("                                                                                                                     !I0", "zho");
        java.lang.String str5 = locale1.getDisplayCountry(locale4);
        java.util.Locale locale6 = locale4.stripExtensions();
        java.lang.String str7 = locale6.toLanguageTag();
        java.util.Locale locale9 = new java.util.Locale("en-GB");
        java.lang.String str10 = locale9.getISO3Country();
        java.lang.String str12 = locale9.getExtension('u');
        java.lang.String str13 = locale9.getDisplayCountry();
        java.lang.String str14 = locale6.getDisplayCountry(locale9);
        org.junit.Assert.assertEquals(locale1.toString(), "english (united states)");
        org.junit.Assert.assertEquals(locale4.toString(), "                                                                                                                     !i0_ZHO");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "                                                                                                                     !i0_ZHO");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "und" + "'", str7, "und");
        org.junit.Assert.assertEquals(locale9.toString(), "en-gb");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "ZHO" + "'", str14, "ZHO");
    }

    @Test
    public void test6630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6630");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale2 = java.util.Locale.CHINA;
        java.util.Locale locale3 = locale2.stripExtensions();
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.lowerCase("99.00:00:0", locale2);
        java.util.Locale.Builder builder5 = builder0.setLocale(locale2);
        java.util.Locale.Builder builder7 = builder0.setLanguage("");
        java.util.Locale.Builder builder10 = builder7.setExtension('x', "");
        java.util.Locale.Builder builder12 = builder7.setLanguageTag("ih");
        java.util.Locale locale13 = java.util.Locale.CHINA;
        java.lang.String str14 = locale13.getDisplayVariant();
        java.lang.String str15 = locale13.getVariant();
        java.util.Locale.setDefault(locale13);
        java.util.Locale.Builder builder17 = builder12.setLocale(locale13);
        java.util.Locale.Builder builder18 = builder12.clear();
        java.util.Locale locale20 = new java.util.Locale("P0Y0M0DT0H0M0.090S");
        java.util.Locale locale23 = new java.util.Locale("", "0 days 0 hours 0 minutes 0 seconds");
        java.util.Locale locale24 = java.util.Locale.CHINESE;
        java.lang.String str25 = locale23.getDisplayName(locale24);
        java.lang.String str26 = locale24.toLanguageTag();
        java.lang.String str27 = locale20.getDisplayLanguage(locale24);
        java.lang.String str28 = locale24.getDisplayVariant();
        java.util.Locale locale30 = new java.util.Locale("P0Y0M0DT0H0M0.090S");
        java.util.Locale locale33 = new java.util.Locale("", "0 days 0 hours 0 minutes 0 seconds");
        java.util.Locale locale34 = java.util.Locale.CHINESE;
        java.lang.String str35 = locale33.getDisplayName(locale34);
        java.lang.String str36 = locale34.toLanguageTag();
        java.lang.String str37 = locale30.getDisplayLanguage(locale34);
        java.lang.String str38 = locale34.getDisplayVariant();
        java.lang.String str39 = locale24.getDisplayVariant(locale34);
        java.util.Locale.Builder builder40 = builder18.setLocale(locale34);
        java.lang.String str41 = locale34.getDisplayCountry();
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "99.00:00:0" + "'", str4, "99.00:00:0");
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertEquals(locale20.toString(), "p0y0m0dt0h0m0.090s");
        org.junit.Assert.assertEquals(locale23.toString(), "_0 DAYS 0 HOURS 0 MINUTES 0 SECONDS");
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "0 DAYS 0 HOURS 0 MINUTES 0 SECONDS" + "'", str25, "0 DAYS 0 HOURS 0 MINUTES 0 SECONDS");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "zh" + "'", str26, "zh");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "p0y0m0dt0h0m0.090s" + "'", str27, "p0y0m0dt0h0m0.090s");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals(locale30.toString(), "p0y0m0dt0h0m0.090s");
        org.junit.Assert.assertEquals(locale33.toString(), "_0 DAYS 0 HOURS 0 MINUTES 0 SECONDS");
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "0 DAYS 0 HOURS 0 MINUTES 0 SECONDS" + "'", str35, "0 DAYS 0 HOURS 0 MINUTES 0 SECONDS");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "zh" + "'", str36, "zh");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "p0y0m0dt0h0m0.090s" + "'", str37, "p0y0m0dt0h0m0.090s");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
    }

    @Test
    public void test6631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6631");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("");
        int int2 = timeZone1.getRawOffset();
        int int3 = timeZone1.getRawOffset();
        timeZone1.setID("0 days 0 hours 0 minutes 0 seconds0 days 0 hours 0 minutes 0 seconds0 days 0 hours 0 minutes 0 secon");
        java.util.TimeZone timeZone7 = java.util.TimeZone.getTimeZone("");
        int int8 = timeZone7.getRawOffset();
        java.lang.String str9 = timeZone7.getID();
        java.time.ZoneId zoneId10 = timeZone7.toZoneId();
        boolean boolean11 = timeZone1.hasSameRules(timeZone7);
        boolean boolean12 = timeZone7.observesDaylightTime();
        java.util.TimeZone.setDefault(timeZone7);
        java.util.TimeZone.setDefault(timeZone7);
        boolean boolean15 = timeZone7.useDaylightTime();
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(timeZone7);
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "\u683c\u6797\u5a01\u6cbb\u65f6\u95f4");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "GMT" + "'", str9, "GMT");
        org.junit.Assert.assertNotNull(zoneId10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test6632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6632");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("zh_CN");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test6633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6633");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("'4P4'4yyyy4'4Y4'4M4'4M4'4d4'4DT4'4H4'4H4'4m4'4M4'4s4.4S4'4S", "                                                                                                                              !I0                                      P0Y0M0DT0H0M0.090ShiP0Y0M0DT0H0M0.090S!P0Y0M0DT0H0M0.090S");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test6634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6634");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "\u52a0\u62ff\u5927");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test6635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6635");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("\u4e2d\u6587\u53f0\u7063)", "s020.0M00TD0M0Y0P");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test6636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6636");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("0:00:00.007", "Hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test6637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6637");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("", "en-CA");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test6638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6638");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("                                 'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's                                 ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range='p'yyyy'y'm'm'd'dt'h'h'm'm's.s's");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6639");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale2 = java.util.Locale.CHINA;
        java.util.Locale locale3 = locale2.stripExtensions();
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.lowerCase("99.00:00:0", locale2);
        java.util.Locale.Builder builder5 = builder0.setLocale(locale2);
        java.util.Locale.Builder builder7 = builder0.setLanguage("");
        java.util.Locale.Builder builder9 = builder7.setLanguage("");
        java.util.Locale.Builder builder11 = builder9.removeUnicodeLocaleAttribute("te0");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder14 = builder9.setUnicodeLocaleKeyword("P0Y0M0DT0H0M0.99S", "HEURE DE GREENWICH");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: P0Y0M0DT0H0M0.99S [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "99.00:00:0" + "'", str4, "99.00:00:0");
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test6640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6640");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("stestestestestestestestestestestestestestestestest'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.034-1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "stestestestestestestestestestestestestestestestest'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'" + "'", str2, "stestestestestestestestestestestestestestestestest'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'");
    }

    @Test
    public void test6641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6641");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("'P'yyyy''''d''''m''s.''", "P0Y0-10DT07430-10.1213599678");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test6642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6642");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("0 DAYS 0 HOURS 0 MINUTES 0 SECOND", "_0 DAYS 0 HOURS 0 MINUTES 0 SECONDS");
        int int4 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("aaaaaa0:00:00.99aaaaaaa", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test6643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6643");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("Greenwich Mean Time");
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, "English (United States)", 47, 42);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test6644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6644");
        java.util.Locale.Category category0 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale1 = java.util.Locale.getDefault();
        java.util.Locale.setDefault(category0, locale1);
        java.util.Locale locale3 = java.util.Locale.KOREA;
        java.util.Locale.setDefault(category0, locale3);
        java.util.Locale locale6 = java.util.Locale.CHINA;
        java.util.Locale locale7 = locale6.stripExtensions();
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.lowerCase("99.00:00:0", locale6);
        java.util.Locale.setDefault(category0, locale6);
        java.util.Locale.Category category10 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale11 = java.util.Locale.UK;
        java.util.Locale.setDefault(category10, locale11);
        java.util.Locale locale13 = java.util.Locale.getDefault(category10);
        java.util.Locale locale14 = java.util.Locale.getDefault(category10);
        java.util.Locale.setDefault(category0, locale14);
        java.util.Locale locale16 = java.util.Locale.getDefault(category0);
        java.util.Locale locale17 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.setDefault(category0, locale17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Can't set default locale to NULL");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "99.00:00:0" + "'", str8, "99.00:00:0");
        org.junit.Assert.assertTrue("'" + category10 + "' != '" + java.util.Locale.Category.FORMAT + "'", category10.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "en_GB");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "en_GB");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "en_GB");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "en_GB");
    }

    @Test
    public void test6645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6645");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfBlank((java.lang.CharSequence) "P-1Y11M30DT23H59M59.998S", (java.lang.CharSequence) "gb");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "P-1Y11M30DT23H59M59.998S" + "'", charSequence2, "P-1Y11M30DT23H59M59.998S");
    }

    @Test
    public void test6646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6646");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("P0Y0M0DT0H0M0.051S", 96);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.051S                                                                              " + "'", str2, "P0Y0M0DT0H0M0.051S                                                                              ");
    }

    @Test
    public void test6647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6647");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("S469.95M95H32TD03M11Y1-P");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=s469.95m95h32td03m11y1-p");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6648");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("0:00:00.017", "                                                P0Y000DT00000.090153HIP0Y000DT00000.090153!P0Y000DT00000.090153_xchinesischxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx_cANADA", 17);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test6649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6649");
        java.util.Locale locale3 = new java.util.Locale("uuuuuuuuuuuaaaaaaaaaaaaaChinese (China)aaaaaaaaaaaaa", "H!ih!ih!ih!ih!ih!ih!iP0Y0-10DT07430-10.1213599678", "French (Canada)");
        org.junit.Assert.assertEquals(locale3.toString(), "uuuuuuuuuuuaaaaaaaaaaaaachinese (china)aaaaaaaaaaaaa_H!IH!IH!IH!IH!IH!IH!IP0Y0-10DT07430-10.1213599678_French (Canada)");
    }

    @Test
    public void test6650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6650");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("P-1Y11M30DT23H59M59.901S", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.034-1aaaaaaaaaaaaaaaaaaGreenwich Mean Time");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test6651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6651");
        char[] charArray11 = new char[] { 'a', ' ', '#', '4', '#', '4' };
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "HI!", charArray11);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "4444444444444444444444444444444444444444444444444444", charArray11);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "de-DE", charArray11);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "Chinese (China)FRAN\307\uc911\uad6d\uc5b4\uc911\uad6d)", charArray11);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "uNITED STATES", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "a #4#4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "a #4#4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[a,  , #, 4, #, 4]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 7 + "'", int15 == 7);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test6652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6652");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("P-1Y11M30DT23H59M59.901S");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test6653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6653");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 313, (long) '#', "Engli0h (Unite0 120tate0)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Engli0h (Unite0 120tate0)" + "'", str3, "Engli0h (Unite0 120tate0)");
    }

    @Test
    public void test6654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6654");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale locale2 = builder0.build();
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale.Builder builder4 = builder3.clearExtensions();
        java.util.Locale locale5 = builder3.build();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder7 = builder3.removeUnicodeLocaleAttribute("EN-GB");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: EN-GB [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "");
    }

    @Test
    public void test6655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6655");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "P00-1Y11M30DT23H59M59.991S");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test6656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6656");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale2 = java.util.Locale.CHINA;
        java.util.Locale locale3 = locale2.stripExtensions();
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.lowerCase("99.00:00:0", locale2);
        java.util.Locale.Builder builder5 = builder0.setLocale(locale2);
        java.util.Locale.Builder builder7 = builder0.setLanguage("");
        java.util.Locale.Builder builder10 = builder7.setExtension('x', "");
        java.util.Locale.Builder builder12 = builder7.setLanguageTag("ih");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder14 = builder7.setRegion("Deutschland");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: Deutschland [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "99.00:00:0" + "'", str4, "99.00:00:0");
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test6657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6657");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("CN", " ...               ", "n ar as av ay az ba be bg bh bi bm bn ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CN" + "'", str3, "CN");
    }

    @Test
    public void test6658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6658");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("                                 P-1Y11M30DT23H59M59.947S0DT0H0M0.090S!P0Y0M0DT0H0M0.090S", "P0Y000DT00000.00120", "zh_44444444444444444444444444444zh_");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                 P-1Y11M30DT23H59M59.947S0DT0H0M0.090S!P0Y0M0DT0H0M0.090S" + "'", str3, "                                 P-1Y11M30DT23H59M59.947S0DT0H0M0.090S!P0Y0M0DT0H0M0.090S");
    }

    @Test
    public void test6659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6659");
        char[] charArray12 = new char[] { 'a', ' ', '#', '4', '#', '4' };
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "HI!", charArray12);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "4444444444444444444444444444444444444444444444444444", charArray12);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "de-DE", charArray12);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "0 DAYS 0 HOURS 0 MINUTES 0 SECONDS", charArray12);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsAny("chinese (china)fran\347\uc911\uad6d\uc5b4\uc911\uad6d)", charArray12);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "                                                                                                    ", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "a #4#4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "a #4#4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[a,  , #, 4, #, 4]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test6660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6660");
        char[] charArray12 = new char[] { 'a', ' ', '#', '4', '#', '4' };
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "HI!", charArray12);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "!IH", charArray12);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "testestestestestestestestestestestestestestestestestestestestest'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'", charArray12);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "0 seconds", charArray12);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "HI!44444444444444444444444444444", charArray12);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "aa ab ae af a...", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "a #4#4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "a #4#4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[a,  , #, 4, #, 4]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test6661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6661");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("English (United States)");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test6662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6662");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("0:00:00.032", "fran\347\uc911\uad6d\uc5b4\uc911\uad6d)");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.032" + "'", str2, "0:00:00.032");
    }

    @Test
    public void test6663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6663");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.setDefault(locale1);
        java.util.Locale locale3 = java.util.Locale.CHINA;
        java.util.Locale locale4 = java.util.Locale.PRC;
        java.lang.String str5 = locale3.getDisplayLanguage(locale4);
        java.lang.String str6 = locale1.getDisplayLanguage(locale4);
        java.util.Locale locale7 = java.util.Locale.FRANCE;
        java.util.Set<java.lang.String> strSet8 = locale7.getUnicodeLocaleKeys();
        java.util.Locale locale10 = java.util.Locale.forLanguageTag("0:00:00.100");
        java.lang.String str11 = locale7.getDisplayVariant(locale10);
        java.lang.String str12 = locale1.getDisplayLanguage(locale7);
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\u4e2d\u6587" + "'", str5, "\u4e2d\u6587");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test6664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6664");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale locale2 = builder0.build();
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale.Builder builder4 = builder3.clearExtensions();
        java.util.Locale.Builder builder5 = builder4.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder7 = builder4.addUnicodeLocaleAttribute("P0Y000DT00000.09010hiP0Y000DT00000.09010!P0Y000DT00000.09010");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: P0Y000DT00000.09010hiP0Y000DT00000.09010!P0Y000DT00000.09010 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test6665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6665");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("P-1Y11M30DT23H59M59.995S", (int) (short) 100, 41);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test6666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6666");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("                                                                                                                                             4444444444444444444444444444444444444444444444444444                                                                                                                                              ", "p0y0m0dt0h0m0.000");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test6667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6667");
        java.util.Locale.Category category1 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale2 = java.util.Locale.CANADA;
        java.util.Locale.setDefault(category1, locale2);
        java.lang.String str4 = locale2.getLanguage();
        java.lang.String str5 = locale2.getISO3Language();
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.lowerCase("de_DEde_DEde_DEdeng", locale2);
        java.util.Locale locale9 = new java.util.Locale("", "0 days 0 hours 0 minutes 0 seconds");
        java.lang.String str10 = locale2.getDisplayName(locale9);
        java.util.Locale.Category category11 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale12 = java.util.Locale.UK;
        java.util.Locale.setDefault(category11, locale12);
        java.lang.String str14 = locale12.getVariant();
        java.lang.String str15 = locale12.toLanguageTag();
        java.util.Set<java.lang.Character> charSet16 = locale12.getExtensionKeys();
        java.lang.String str17 = locale12.getLanguage();
        java.lang.String str18 = locale9.getDisplayLanguage(locale12);
        org.junit.Assert.assertTrue("'" + category1 + "' != '" + java.util.Locale.Category.FORMAT + "'", category1.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "en" + "'", str4, "en");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "eng" + "'", str5, "eng");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "de_dede_dede_dedeng" + "'", str6, "de_dede_dede_dedeng");
        org.junit.Assert.assertEquals(locale9.toString(), "_0 DAYS 0 HOURS 0 MINUTES 0 SECONDS");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "English (Canada)" + "'", str10, "English (Canada)");
        org.junit.Assert.assertTrue("'" + category11 + "' != '" + java.util.Locale.Category.FORMAT + "'", category11.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "en-GB" + "'", str15, "en-GB");
        org.junit.Assert.assertNotNull(charSet16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "en" + "'", str17, "en");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test6668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6668");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("", 15);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test6669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6669");
        java.lang.String[] strArray3 = new java.lang.String[] {};
        int int4 = org.apache.commons.lang3.StringUtils.indexOfAny("0:00:00.000", strArray3);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("99.00:00:0", "x");
        java.lang.String[] strArray11 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu0:00:00.097", "HI!");
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray11, ' ');
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.replaceEach("44444444444444444444444444444444444444           HI!", strArray8, strArray11);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("HI!44444444444444444444444444444", strArray3, strArray11);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.startsWithAny("", strArray11);
        java.lang.String[] strArray17 = org.apache.commons.lang3.StringUtils.stripAll(strArray11);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu0:00:00.097" + "'", str13, "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu0:00:00.097");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "44444444444444444444444444444444444444           HI!" + "'", str14, "44444444444444444444444444444444444444           HI!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "HI!44444444444444444444444444444" + "'", str15, "HI!44444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(strArray17);
    }

    @Test
    public void test6670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6670");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "0 days 0 hours 0 minutes 0 seconds                                                                  ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0 days 0 hours 0 minutes 0 seconds                                                                  " + "'", str1, "0 days 0 hours 0 minutes 0 seconds                                                                  ");
    }

    @Test
    public void test6671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6671");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("hi!", '4');
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, 'u');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test6672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6672");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("0eure 0e Greenwich0eure 0e Greenwich0eure 0e Greenwich0eure 0e Greenwich0eure 0e Greenwich0eure 0e Greenwich0eure 0e Greenwich0eure 0e Greenwich0eure 0e Greenwich0eure 0e Greenwich0eure 0e Greenwich0eure 0e Greenwich0eure 0e Greenwich0eure 0e Greenwich0eure 0e Greenwich0eure 0e Greenwich0eure 0e Greenwich0eure 0e Greenwich0eure 0e Greenwich");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test6673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6673");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("!ih!ih!...testestestestestestestestestestestestestestestestestestestestest'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!ih!ih!...testestestestestestestestestestestestestestestestestestestestest'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'" + "'", str2, "!ih!ih!...testestestestestestestestestestestestestestestestestestestestest'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'");
    }

    @Test
    public void test6674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6674");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("JP", 48, 8);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test6675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6675");
        java.util.Locale locale1 = new java.util.Locale("p0y0m0dt0h0m0.032s");
        java.util.Set<java.lang.String> strSet2 = locale1.getUnicodeLocaleAttributes();
        org.junit.Assert.assertEquals(locale1.toString(), "p0y0m0dt0h0m0.032s");
        org.junit.Assert.assertNotNull(strSet2);
    }

    @Test
    public void test6676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6676");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("HI", "anglais (Canada)", "                                 p-1y11m30dt23h59m59.947s0dt0h0m0.090s!p0y0m0dt0h0m0.090s");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HI" + "'", str3, "HI");
    }

    @Test
    public void test6677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6677");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("                                                p0y0m0dt0h0m0.090ship0y0m0dt0h0m0.090s!p0y0m0dt0h0m0.090s", "P0Y0M0DT0H0M0.004");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                p0y0m0dt0h0m0.090ship0y0m0dt0h0m0.090s!p0y0m0dt0h0m0.090s" + "'", str2, "                                                p0y0m0dt0h0m0.090ship0y0m0dt0h0m0.090s!p0y0m0dt0h0m0.090s");
    }

    @Test
    public void test6678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6678");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.034-1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "...c0Hur..Gr...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test6679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6679");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("un00unun_0 DAY5 0 0OUR5 0 0INUTE005 0 ECONDun000unun", "", "\u7063\u53f0");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test6680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6680");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale locale2 = builder0.build();
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale.Builder builder4 = builder3.clearExtensions();
        java.util.Locale locale5 = builder3.build();
        java.util.Locale locale6 = builder3.build();
        java.util.Set<java.lang.String> strSet7 = locale6.getUnicodeLocaleAttributes();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "");
        org.junit.Assert.assertNotNull(strSet7);
    }

    @Test
    public void test6681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6681");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                                               Canada                                               ", "                       44444444444444444444444444444");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test6682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6682");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("fran\347ais (France)", 52, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "fran\347ais (France)44444444444444444444444444444444444" + "'", str3, "fran\347ais (France)44444444444444444444444444444444444");
    }

    @Test
    public void test6683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6683");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("Heure de Greenwic", "P0Y0M0DT0H0M0.121S");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test6684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6684");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("gmt", "4P404Y4040404DT40404040404.40904313hi4P404Y4040404DT40404040404.409043134!4P404Y4040404DT40404040404.409043134", "0:00:00.002");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test6685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6685");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale2 = java.util.Locale.CHINA;
        java.util.Locale locale3 = locale2.stripExtensions();
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.lowerCase("99.00:00:0", locale2);
        java.util.Locale.Builder builder5 = builder0.setLocale(locale2);
        java.util.Locale.Builder builder7 = builder5.setLanguage("und");
        java.util.Locale.Builder builder9 = builder5.setLanguageTag("ih");
        java.util.Locale.Builder builder10 = builder9.clear();
        java.util.Locale locale11 = builder10.build();
        java.util.Locale locale12 = java.util.Locale.FRANCE;
        java.util.Set<java.lang.String> strSet13 = locale12.getUnicodeLocaleKeys();
        java.util.Set<java.lang.Character> charSet14 = locale12.getExtensionKeys();
        java.lang.String str15 = locale12.getISO3Language();
        java.util.Locale locale17 = java.util.Locale.CHINA;
        java.util.Locale locale18 = locale17.stripExtensions();
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.lowerCase("99.00:00:0", locale17);
        boolean boolean20 = locale17.hasExtensions();
        java.util.Set<java.lang.String> strSet21 = locale17.getUnicodeLocaleKeys();
        java.util.Locale.Category category22 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale23 = java.util.Locale.UK;
        java.util.Locale.setDefault(category22, locale23);
        java.lang.String str25 = locale23.getVariant();
        java.lang.String str26 = locale23.toLanguageTag();
        java.util.Set<java.lang.Character> charSet27 = locale23.getExtensionKeys();
        java.lang.String str28 = locale17.getDisplayCountry(locale23);
        java.lang.String str29 = locale23.getLanguage();
        java.lang.String str30 = locale12.getDisplayVariant(locale23);
        java.util.Locale.Builder builder31 = builder10.setLocale(locale12);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder33 = builder31.removeUnicodeLocaleAttribute("0I!                                                                                              ");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: 0I!                                                                                               [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "99.00:00:0" + "'", str4, "99.00:00:0");
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNotNull(charSet14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "fra" + "'", str15, "fra");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "99.00:00:0" + "'", str19, "99.00:00:0");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(strSet21);
        org.junit.Assert.assertTrue("'" + category22 + "' != '" + java.util.Locale.Category.FORMAT + "'", category22.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "en-GB" + "'", str26, "en-GB");
        org.junit.Assert.assertNotNull(charSet27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "China" + "'", str28, "China");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "en" + "'", str29, "en");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(builder31);
    }

    @Test
    public void test6686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6686");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "zh_CNzhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhoz");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 63 + "'", int1 == 63);
    }

    @Test
    public void test6687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6687");
        java.util.Locale locale1 = java.util.Locale.FRANCE;
        java.util.Set<java.lang.String> strSet2 = locale1.getUnicodeLocaleKeys();
        java.util.Locale locale3 = java.util.Locale.CHINESE;
        java.lang.String str4 = locale1.getDisplayName(locale3);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.upperCase("!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih", locale1);
        java.util.Set<java.lang.String> strSet6 = locale1.getUnicodeLocaleAttributes();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "zh");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u6cd5\u6587\u6cd5\u56fd)" + "'", str4, "\u6cd5\u6587\u6cd5\u56fd)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH" + "'", str5, "!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH");
        org.junit.Assert.assertNotNull(strSet6);
    }

    @Test
    public void test6688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6688");
        java.util.Locale locale2 = new java.util.Locale("!I0", "P0Y0M0DT0H0M0.034S");
        java.lang.String str3 = locale2.getCountry();
        java.util.Locale.setDefault(locale2);
        java.lang.String str5 = locale2.getDisplayName();
        java.lang.String str6 = locale2.getDisplayScript();
        org.junit.Assert.assertEquals(locale2.toString(), "!i0_P0Y0M0DT0H0M0.034S");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y0M0DT0H0M0.034S" + "'", str3, "P0Y0M0DT0H0M0.034S");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "!i0 (P0Y0M0DT0H0M0.034S)" + "'", str5, "!i0 (P0Y0M0DT0H0M0.034S)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test6689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6689");
        java.lang.String str1 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationHMS((long) 79);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0:00:00.079" + "'", str1, "0:00:00.079");
    }

    @Test
    public void test6690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6690");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX" + "'", str1, "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
    }

    @Test
    public void test6691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6691");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("7430-10.0903599686743ip0y0-10dt07430-10.0903599686!p0y0-10dt07430-10.0903599686");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.stripAll(strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test6692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6692");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "hi!#######");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test6693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6693");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("P0Y0M0DT0H0M0.004");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "p0y0m0dt0h0m0.004" + "'", str1, "p0y0m0dt0h0m0.004");
    }

    @Test
    public void test6694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6694");
        java.lang.String[] strArray1 = java.util.TimeZone.getAvailableIDs(83);
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test6695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6695");
        java.util.Locale locale0 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str1 = locale0.getISO3Country();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "CHN" + "'", str1, "CHN");
    }

    @Test
    public void test6696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6696");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("HI!44444444444444444444444444444", '#');
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "HI!");
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.stripAll(strArray5, "\u683c\u6797\u5a01\u6cbb\u6642\u9593");
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray5);
        int int9 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'", strArray5);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "44444444444444444444444444444" + "'", str8, "44444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test6697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6697");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfBlank(" #####################################################################################################################  ", "P-1Y11M30DT23H59M59.998S");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " #####################################################################################################################  " + "'", str2, " #####################################################################################################################  ");
    }

    @Test
    public void test6698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6698");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu0:00:00.097uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", "!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH");
        boolean boolean5 = org.apache.commons.lang3.StringUtils.endsWithAny("P-1Y11M30DT23H59M59.901S", strArray4);
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.split("fr4n\347\uc911\uad6d\uc5b4\uc911\uad6d)");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("uNITEDSTATES", strArray4, strArray7);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 1 vs 2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void test6699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6699");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("P-1Y11M30DT23H59M59.990S", "uuuuuuuuuuuuuuuuuuuuuuuu0320.00000TD000Y0P", 6);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test6700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6700");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("P0Y000DT00000.00120                              P0Y000DT00000.00120                              P0Y000DT00000.00120                              P0Y000DT00000.00120                              P0Y000DT00000.00120                              P0Y000DT00000.00120                              P0Y000DT00000.00120                              P0Y000DT00000.00120                              P0Y000DT00000.00120", 119);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test6701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6701");
        java.util.Locale locale1 = new java.util.Locale("en-GB");
        java.util.Locale.Category category2 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale3 = java.util.Locale.getDefault();
        java.util.Locale.setDefault(category2, locale3);
        java.util.Locale locale5 = java.util.Locale.getDefault();
        java.lang.String str6 = locale3.getDisplayCountry(locale5);
        java.util.Locale locale8 = new java.util.Locale("0:00:00.99");
        java.lang.String str9 = locale3.getDisplayCountry(locale8);
        java.lang.String str10 = locale1.getDisplayVariant(locale8);
        java.lang.String str11 = locale1.getDisplayScript();
        org.junit.Assert.assertEquals(locale1.toString(), "en-gb");
        org.junit.Assert.assertTrue("'" + category2 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category2.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "!i0_P0Y0M0DT0H0M0.034S");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "!i0_P0Y0M0DT0H0M0.034S");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "P0Y0M0DT0H0M0.034S" + "'", str6, "P0Y0M0DT0H0M0.034S");
        org.junit.Assert.assertEquals(locale8.toString(), "0:00:00.99");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "P0Y0M0DT0H0M0.034S" + "'", str9, "P0Y0M0DT0H0M0.034S");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test6702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6702");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale locale2 = builder0.build();
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale.Builder builder4 = builder3.clearExtensions();
        java.util.Locale.Builder builder5 = builder4.clearExtensions();
        java.util.Locale.Builder builder6 = builder5.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder8 = builder5.setLanguage("anglai0 (Ro1au0e-Uni)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: anglai0 (Ro1au0e-Uni) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test6703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6703");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu0:00:00.097uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", "p0y000dt00000.0230");
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "P0Y0-10DT07430-10.0323599998");
        boolean boolean6 = org.apache.commons.lang3.StringUtils.endsWithAny("p-1y11m30dt23h59m59.975s (IH)", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuP0Y0-10DT07430-10.0323599998:P0Y0-10DT07430-10.0323599998:P0Y0-10DT07430-10.032359999897uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu" + "'", str5, "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuP0Y0-10DT07430-10.0323599998:P0Y0-10DT07430-10.0323599998:P0Y0-10DT07430-10.032359999897uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test6704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6704");
        java.util.Locale.Category category0 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale1 = java.util.Locale.getDefault();
        java.util.Locale.setDefault(category0, locale1);
        java.util.Locale locale3 = java.util.Locale.getDefault(category0);
        java.util.Locale locale4 = java.util.Locale.getDefault(category0);
        java.util.Locale.Category category5 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale6 = java.util.Locale.getDefault();
        java.util.Locale.setDefault(category5, locale6);
        java.util.Locale locale8 = java.util.Locale.KOREA;
        java.util.Locale.setDefault(category5, locale8);
        java.util.Locale locale11 = java.util.Locale.CHINA;
        java.util.Locale locale12 = locale11.stripExtensions();
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.lowerCase("99.00:00:0", locale11);
        java.util.Locale.setDefault(category5, locale11);
        java.util.Locale.Category category15 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale16 = java.util.Locale.UK;
        java.util.Locale.setDefault(category15, locale16);
        java.util.Locale locale18 = java.util.Locale.getDefault(category15);
        java.util.Locale locale19 = java.util.Locale.getDefault(category15);
        java.util.Locale.setDefault(category5, locale19);
        java.util.Locale.setDefault(category0, locale19);
        java.util.Locale locale25 = new java.util.Locale("!IH", "P0Y0M0DT0H0M0.034S", "\u6cd5\u6587\u6cd5\u56fd)");
        java.util.Locale locale29 = new java.util.Locale("!IH", "P0Y0M0DT0H0M0.034S", "\u6cd5\u6587\u6cd5\u56fd)");
        java.util.Set<java.lang.Character> charSet30 = locale29.getExtensionKeys();
        java.lang.String str31 = locale29.getLanguage();
        java.util.Set<java.lang.String> strSet32 = locale29.getUnicodeLocaleAttributes();
        java.lang.String str33 = locale25.getDisplayScript(locale29);
        java.util.Locale locale34 = java.util.Locale.PRC;
        java.util.Locale locale36 = java.util.Locale.GERMANY;
        java.lang.String str37 = org.apache.commons.lang3.StringUtils.lowerCase("HI!", locale36);
        java.lang.String str38 = locale34.getDisplayVariant(locale36);
        java.lang.String str39 = locale29.getDisplayVariant(locale36);
        java.lang.String str40 = locale19.getDisplayScript(locale29);
        java.util.Locale.Category category41 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale42 = java.util.Locale.getDefault();
        java.util.Locale.setDefault(category41, locale42);
        java.util.Set<java.lang.String> strSet44 = locale42.getUnicodeLocaleKeys();
        java.lang.String str45 = locale42.getDisplayName();
        java.lang.String str46 = locale29.getDisplayScript(locale42);
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "!i0_P0Y0M0DT0H0M0.034S");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "!i0_P0Y0M0DT0H0M0.034S");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "!i0_P0Y0M0DT0H0M0.034S");
        org.junit.Assert.assertTrue("'" + category5 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category5.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "!i0_P0Y0M0DT0H0M0.034S");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "99.00:00:0" + "'", str13, "99.00:00:0");
        org.junit.Assert.assertTrue("'" + category15 + "' != '" + java.util.Locale.Category.FORMAT + "'", category15.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "en_GB");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "en_GB");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "en_GB");
// flaky:         org.junit.Assert.assertEquals(locale25.toString(), "\u6cd5\u6587\u6cd5\u56fd)");
// flaky:         org.junit.Assert.assertEquals(locale29.toString(), "\u6cd5\u6587\u6cd5\u56fd)");
        org.junit.Assert.assertNotNull(charSet30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "!ih" + "'", str31, "!ih");
        org.junit.Assert.assertNotNull(strSet32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!" + "'", str37, "hi!");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "\u6cd5\u6587\u6cd5\u56fd)" + "'", str39, "\u6cd5\u6587\u6cd5\u56fd)");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertTrue("'" + category41 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category41.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale42);
        org.junit.Assert.assertEquals(locale42.toString(), "!i0_P0Y0M0DT0H0M0.034S");
        org.junit.Assert.assertNotNull(strSet44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "!i0 (P0Y0M0DT0H0M0.034S)" + "'", str45, "!i0 (P0Y0M0DT0H0M0.034S)");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
    }

    @Test
    public void test6705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6705");
        java.util.Locale locale0 = java.util.Locale.PRC;
        java.util.Locale locale2 = java.util.Locale.GERMANY;
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.lowerCase("HI!", locale2);
        java.lang.String str4 = locale0.getDisplayVariant(locale2);
        java.util.Locale locale5 = locale0.stripExtensions();
        java.util.Locale locale7 = new java.util.Locale("en-GB");
        java.util.Locale.setDefault(locale7);
        java.lang.String str9 = locale0.getDisplayVariant(locale7);
        java.util.Locale.Category category10 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale11 = java.util.Locale.getDefault();
        java.util.Locale.setDefault(category10, locale11);
        java.util.Locale locale13 = java.util.Locale.getDefault(category10);
        java.lang.String str14 = locale7.getDisplayLanguage(locale13);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "zh_CN");
        org.junit.Assert.assertEquals(locale7.toString(), "en-gb");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + category10 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category10.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "en-gb");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "en-gb");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "en-gb" + "'", str14, "en-gb");
    }

    @Test
    public void test6706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6706");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("United Kingdom", "                                                                                                                                                                                                                                                                                                                              p0y0m0dt0h0m0.090s");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "United Kingdom" + "'", str2, "United Kingdom");
    }

    @Test
    public void test6707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6707");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("\u4e2d\u6587");
        java.lang.String str2 = locale1.getDisplayLanguage();
        java.lang.String str3 = locale1.getDisplayLanguage();
        java.lang.String str5 = locale1.getExtension('x');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = locale1.getUnicodeLocaleType("re 0e Gr...u...ch0e");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: re 0e Gr...u...ch0e");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test6708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6708");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("France", "!IH#####################################################################################################################");
        int int4 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("g35999t", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test6709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6709");
        java.lang.CharSequence charSequence0 = null;
        char[] charArray14 = new char[] { 'a', ' ', '#', '4', '#', '4' };
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "HI!", charArray14);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "4444444444444444444444444444444444444444444444444444", charArray14);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "Heure de Greenwich", charArray14);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "EN-GB", charArray14);
        boolean boolean19 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "Italy", charArray14);
        boolean boolean20 = org.apache.commons.lang3.StringUtils.containsAny("tes", charArray14);
        boolean boolean21 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "#######P0Y0M0DT0H0M0.000S#######", charArray14);
        int int22 = org.apache.commons.lang3.StringUtils.indexOfAnyBut(charSequence0, charArray14);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray14), "a #4#4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray14), "a #4#4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray14), "[a,  , #, 4, #, 4]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test6710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6710");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("can", 'x');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "can" + "'", str2, "can");
    }

    @Test
    public void test6711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6711");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuP0Y0M0DT0H0M0.000S444444uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", "p0y000dt00000.0230");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 101 + "'", int2 == 101);
    }

    @Test
    public void test6712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6712");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("UnitedENGKingdom", "\uc77c\ubcf8\uc5b4", 13);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test6713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6713");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("P0Y000DT00000.01925");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "P0Y000DT00000.01925" + "'", str1, "P0Y000DT00000.01925");
    }

    @Test
    public void test6714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6714");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("0:00:00.041", "_0 DAY10 0 0OUR10 0 0INUTE10 0 ECOND_0 DAY 0 0OUR10 0 0INUTE10 0 ECOND_0 DAY 0 0OUR10 0 0INUTE10 0 ECOND_0 DAYchinois");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":00:00.04" + "'", str2, ":00:00.04");
    }

    @Test
    public void test6715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6715");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfBlank((java.lang.CharSequence) "OURS 0 MI", (java.lang.CharSequence) "P-1Y11030DT23059059.998120");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "OURS 0 MI" + "'", charSequence2, "OURS 0 MI");
    }

    @Test
    public void test6716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6716");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("p0y0m0dt0h0m0.032s", "_0 DAYS 0 HOURS 0 MINUTES 0 SECONDS_0 DAYS 0 HOURS 0 MINUTES 0 SECONDS_0 DAYS 0 HOURS 0 MINUTES 0 SECONDS_0 DAYS 0 HOURS 0 MINUTES 0 SECONDS_0 DAYS 0 HOURS 0 MINUTES 0 SECONDS_0 DAYS 0 HOURS 0 MINUTES 0 SECONDS_0 DAYS 0 HOURS 0 MINUTES 0 SECONDS_0 DAYS 0 HOURS 0 MINUTES 0 SECONDS_0 DAYS 0 HOURS 0 MINUTES 0 SECONDS_0 DAYS 0 HOURS 0 MINUTES 0 SECONDS");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "p0y0m0dt0h0m0.032s" + "'", str2, "p0y0m0dt0h0m0.032s");
    }

    @Test
    public void test6717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6717");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("...                                                                                                     ", "P-1Y11030DT23059059.998");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...                                                                                                     " + "'", str2, "...                                                                                                     ");
    }

    @Test
    public void test6718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6718");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("HI!44444444444444444444444444444", '#');
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray4, "HI!");
        int int7 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("CAN", strArray4);
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAny("44444444444444444444444444444444444444           HI!", strArray4);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray4);
        java.lang.Class<?> wildcardClass10 = strArray4.getClass();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HI!44444444444444444444444444444" + "'", str9, "HI!44444444444444444444444444444");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test6719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6719");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("##############################################################################################################################################################################################################P0Y0M0DT0H0M0.121S", '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.121S" + "'", str2, "P0Y0M0DT0H0M0.121S");
    }

    @Test
    public void test6720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6720");
        java.util.Locale.Builder builder1 = new java.util.Locale.Builder();
        java.util.Locale locale2 = builder1.build();
        java.util.Locale.setDefault(locale2);
        java.util.Locale locale4 = java.util.Locale.CHINA;
        java.util.Locale locale5 = java.util.Locale.PRC;
        java.lang.String str6 = locale4.getDisplayLanguage(locale5);
        java.lang.String str7 = locale2.getDisplayLanguage(locale5);
        java.util.Locale locale10 = new java.util.Locale("\u4e2d\u6587", "                                                                                                    ");
        java.lang.String str11 = locale5.getDisplayVariant(locale10);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.lowerCase("", locale5);
        java.lang.String str13 = locale5.getDisplayCountry();
        java.util.Locale locale16 = new java.util.Locale("", "0 days 0 hours 0 minutes 0 seconds");
        java.util.Locale locale17 = java.util.Locale.CHINESE;
        java.lang.String str18 = locale16.getDisplayName(locale17);
        java.lang.String str19 = locale17.toLanguageTag();
        java.util.Locale locale20 = java.util.Locale.GERMANY;
        java.lang.String str21 = locale17.getDisplayLanguage(locale20);
        java.lang.String str22 = locale5.getDisplayLanguage(locale20);
        java.util.Locale locale23 = java.util.Locale.PRC;
        java.util.Locale locale25 = java.util.Locale.GERMANY;
        java.lang.String str26 = org.apache.commons.lang3.StringUtils.lowerCase("HI!", locale25);
        java.lang.String str27 = locale23.getDisplayVariant(locale25);
        java.util.Set<java.lang.Character> charSet28 = locale25.getExtensionKeys();
        java.util.Locale locale32 = new java.util.Locale("!IH", "P0Y0M0DT0H0M0.034S", "\u6cd5\u6587\u6cd5\u56fd)");
        java.util.Set<java.lang.Character> charSet33 = locale32.getExtensionKeys();
        java.lang.String str34 = locale32.getLanguage();
        java.util.Locale locale36 = java.util.Locale.CHINA;
        java.util.Locale locale37 = locale36.stripExtensions();
        java.lang.String str38 = org.apache.commons.lang3.StringUtils.lowerCase("99.00:00:0", locale36);
        boolean boolean39 = locale36.hasExtensions();
        java.util.Set<java.lang.String> strSet40 = locale36.getUnicodeLocaleKeys();
        java.lang.String str41 = locale32.getDisplayCountry(locale36);
        java.util.Locale.Category category42 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale43 = java.util.Locale.CANADA;
        java.util.Locale.setDefault(category42, locale43);
        java.lang.String str45 = locale36.getDisplayScript(locale43);
        java.lang.String str46 = locale43.getLanguage();
        java.util.Set<java.lang.Character> charSet47 = locale43.getExtensionKeys();
        java.lang.String str48 = locale25.getDisplayCountry(locale43);
        java.lang.String str49 = locale5.getDisplayName(locale25);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\u4e2d\u6587" + "'", str6, "\u4e2d\u6587");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals(locale10.toString(), "\u4e2d\u6587_                                                                                                    ");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "China" + "'", str13, "China");
        org.junit.Assert.assertEquals(locale16.toString(), "_0 DAYS 0 HOURS 0 MINUTES 0 SECONDS");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "0 DAYS 0 HOURS 0 MINUTES 0 SECONDS" + "'", str18, "0 DAYS 0 HOURS 0 MINUTES 0 SECONDS");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "zh" + "'", str19, "zh");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Chinesisch" + "'", str21, "Chinesisch");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Chinesisch" + "'", str22, "Chinesisch");
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(charSet28);
// flaky:         org.junit.Assert.assertEquals(locale32.toString(), "\u6cd5\u6587\u6cd5\u56fd)");
        org.junit.Assert.assertNotNull(charSet33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "!ih" + "'", str34, "!ih");
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale37);
        org.junit.Assert.assertEquals(locale37.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "99.00:00:0" + "'", str38, "99.00:00:0");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(strSet40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "P0Y0M0DT0H0M0.034S" + "'", str41, "P0Y0M0DT0H0M0.034S");
        org.junit.Assert.assertTrue("'" + category42 + "' != '" + java.util.Locale.Category.FORMAT + "'", category42.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale43);
        org.junit.Assert.assertEquals(locale43.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "en" + "'", str46, "en");
        org.junit.Assert.assertNotNull(charSet47);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "Germany" + "'", str48, "Germany");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "Chinesisch (China)" + "'", str49, "Chinesisch (China)");
    }

    @Test
    public void test6721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6721");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("p0y0m0dt0h0m0.090s'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'p0y0m0dt0h0m0.090s'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'p0y0m0dt0h0m0.090s'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'p0y0m0dt0h0m0.090s'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'p0y0m0dt0h0m0.090s'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'p0y0m0dt0h0m0.090s'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'p0y0m0dt0h0m0.090s'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'p0y0m0dt0h0m0.090s'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'p0y0m0dt0h0m0.090s'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'p0y0m0dt0h0m0.090s'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'p0y0m0dt0h0m0.090s'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'p0y0m0dt0h0m0.090s'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'p0y0m0dt0h0m0.090s'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'p0y0m0dt0h0m0.090s'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'p0y0m0dt0h0m0.090s'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'p0y0m0dt0h0m0.090s'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'p0y0m0dt0h0m0.090s'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'p0y0m0dt0h0m0.090s'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'p0y0m0dt0h0m0.090s", "english (united states)");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test6722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6722");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale locale2 = builder0.build();
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale.Builder builder4 = builder3.clearExtensions();
        java.util.Locale locale5 = builder3.build();
        java.util.Locale locale6 = builder3.build();
        java.util.Locale.Builder builder7 = builder3.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder9 = builder7.setVariant("glauatadatat");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: glauatadatat [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "");
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test6723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6723");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.Locale[] localeArray3 = new java.util.Locale[] {};
        java.util.ArrayList<java.util.Locale> localeList4 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList4, localeArray3);
        java.util.Locale locale6 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.util.Locale>) localeList4);
        java.util.Locale.Category category7 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale8 = java.util.Locale.getDefault();
        java.util.Locale.setDefault(category7, locale8);
        java.util.Set<java.lang.String> strSet10 = locale8.getUnicodeLocaleKeys();
        java.util.List<java.lang.String> strList11 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strSet10);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.util.Locale.LanguageRange>) languageRangeList1, "Chinese (China)");
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.util.Locale.LanguageRange>) languageRangeList1, "P0Y0M0DT0H0M0.020S");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap16 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList17 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap16);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap18 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList19 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap18);
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.util.Locale.LanguageRange>) languageRangeList19, 'a');
        java.util.Locale.LanguageRange[] languageRangeArray22 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList23 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList23, languageRangeArray22);
        java.util.Locale[] localeArray25 = new java.util.Locale[] {};
        java.util.ArrayList<java.util.Locale> localeList26 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList26, localeArray25);
        java.util.Locale locale28 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList23, (java.util.Collection<java.util.Locale>) localeList26);
        java.util.Collection<java.util.Locale> localeCollection29 = null;
        java.util.Locale.FilteringMode filteringMode30 = java.util.Locale.FilteringMode.EXTENDED_FILTERING;
        java.util.List<java.util.Locale> localeList31 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList23, localeCollection29, filteringMode30);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap32 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList33 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList23, strMap32);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap34 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList35 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList23, strMap34);
        java.util.Locale.LanguageRange[] languageRangeArray36 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList37 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList37, languageRangeArray36);
        java.util.Locale[] localeArray39 = new java.util.Locale[] {};
        java.util.ArrayList<java.util.Locale> localeList40 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList40, localeArray39);
        java.util.Locale locale42 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList37, (java.util.Collection<java.util.Locale>) localeList40);
        java.lang.String str44 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.util.Locale.LanguageRange>) languageRangeList37, 'a');
        java.util.Locale.LanguageRange[] languageRangeArray45 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList46 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList46, languageRangeArray45);
        java.util.Locale[] localeArray48 = new java.util.Locale[] {};
        java.util.ArrayList<java.util.Locale> localeList49 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList49, localeArray48);
        java.util.Locale locale51 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList46, (java.util.Collection<java.util.Locale>) localeList49);
        java.util.Collection<java.util.Locale> localeCollection52 = null;
        java.util.Locale.FilteringMode filteringMode53 = java.util.Locale.FilteringMode.EXTENDED_FILTERING;
        java.util.List<java.util.Locale> localeList54 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList46, localeCollection52, filteringMode53);
        java.util.Locale locale55 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList37, localeCollection52);
        java.util.Locale.LanguageRange[] languageRangeArray56 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList57 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList57, languageRangeArray56);
        java.util.Locale[] localeArray59 = new java.util.Locale[] {};
        java.util.ArrayList<java.util.Locale> localeList60 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList60, localeArray59);
        java.util.Locale locale62 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList57, (java.util.Collection<java.util.Locale>) localeList60);
        java.util.Locale locale63 = java.util.Locale.PRC;
        java.util.Locale locale65 = java.util.Locale.GERMANY;
        java.lang.String str66 = org.apache.commons.lang3.StringUtils.lowerCase("HI!", locale65);
        java.lang.String str67 = locale63.getDisplayVariant(locale65);
        java.util.Locale.Category category68 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale69 = java.util.Locale.getDefault();
        java.util.Locale.setDefault(category68, locale69);
        java.util.Set<java.lang.String> strSet71 = locale69.getUnicodeLocaleKeys();
        java.util.Locale locale72 = java.util.Locale.FRANCE;
        java.util.Set<java.lang.String> strSet73 = locale72.getUnicodeLocaleKeys();
        java.util.Locale locale74 = java.util.Locale.CHINA;
        java.util.Locale locale75 = locale74.stripExtensions();
        java.lang.String str76 = locale74.getDisplayLanguage();
        java.util.Locale locale77 = java.util.Locale.CHINA;
        java.util.Locale locale78 = locale77.stripExtensions();
        java.util.Locale locale79 = java.util.Locale.FRANCE;
        java.util.Locale locale80 = java.util.Locale.TAIWAN;
        java.util.Locale locale81 = java.util.Locale.getDefault();
        java.lang.String str82 = locale81.getDisplayVariant();
        java.util.Locale locale83 = java.util.Locale.CHINA;
        java.util.Locale locale84 = locale83.stripExtensions();
        java.lang.String str85 = locale83.getDisplayLanguage();
        java.util.Locale locale86 = java.util.Locale.FRANCE;
        java.util.Set<java.lang.String> strSet87 = locale86.getUnicodeLocaleKeys();
        java.util.Locale locale88 = java.util.Locale.CHINESE;
        java.lang.String str89 = locale86.getDisplayName(locale88);
        java.lang.String str90 = locale88.getCountry();
        java.util.Locale[] localeArray91 = new java.util.Locale[] { locale65, locale69, locale72, locale74, locale77, locale79, locale80, locale81, locale83, locale88 };
        java.util.ArrayList<java.util.Locale> localeList92 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean93 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList92, localeArray91);
        java.util.Locale.FilteringMode filteringMode94 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.util.Locale> localeList95 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList57, (java.util.Collection<java.util.Locale>) localeList92, filteringMode94);
        java.util.Locale locale96 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList37, (java.util.Collection<java.util.Locale>) localeList92);
        java.util.Locale locale97 = java.util.Locale.lookup(languageRangeList35, (java.util.Collection<java.util.Locale>) localeList92);
        java.util.Locale locale98 = java.util.Locale.lookup(languageRangeList19, (java.util.Collection<java.util.Locale>) localeList92);
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(localeArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(locale6);
        org.junit.Assert.assertTrue("'" + category7 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category7.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "");
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(languageRangeList17);
        org.junit.Assert.assertNotNull(languageRangeList19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(languageRangeArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(localeArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(locale28);
        org.junit.Assert.assertTrue("'" + filteringMode30 + "' != '" + java.util.Locale.FilteringMode.EXTENDED_FILTERING + "'", filteringMode30.equals(java.util.Locale.FilteringMode.EXTENDED_FILTERING));
        org.junit.Assert.assertNotNull(localeList31);
        org.junit.Assert.assertNotNull(languageRangeList33);
        org.junit.Assert.assertNotNull(languageRangeList35);
        org.junit.Assert.assertNotNull(languageRangeArray36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(localeArray39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNull(locale42);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertNotNull(languageRangeArray45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(localeArray48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNull(locale51);
        org.junit.Assert.assertTrue("'" + filteringMode53 + "' != '" + java.util.Locale.FilteringMode.EXTENDED_FILTERING + "'", filteringMode53.equals(java.util.Locale.FilteringMode.EXTENDED_FILTERING));
        org.junit.Assert.assertNotNull(localeList54);
        org.junit.Assert.assertNull(locale55);
        org.junit.Assert.assertNotNull(languageRangeArray56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(localeArray59);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNull(locale62);
        org.junit.Assert.assertNotNull(locale63);
        org.junit.Assert.assertEquals(locale63.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale65);
        org.junit.Assert.assertEquals(locale65.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "hi!" + "'", str66, "hi!");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "" + "'", str67, "");
        org.junit.Assert.assertTrue("'" + category68 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category68.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale69);
        org.junit.Assert.assertEquals(locale69.toString(), "");
        org.junit.Assert.assertNotNull(strSet71);
        org.junit.Assert.assertNotNull(locale72);
        org.junit.Assert.assertEquals(locale72.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(strSet73);
        org.junit.Assert.assertNotNull(locale74);
        org.junit.Assert.assertEquals(locale74.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale75);
        org.junit.Assert.assertEquals(locale75.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "Chinese" + "'", str76, "Chinese");
        org.junit.Assert.assertNotNull(locale77);
        org.junit.Assert.assertEquals(locale77.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale78);
        org.junit.Assert.assertEquals(locale78.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale79);
        org.junit.Assert.assertEquals(locale79.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale80);
        org.junit.Assert.assertEquals(locale80.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale81);
        org.junit.Assert.assertEquals(locale81.toString(), "");
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "" + "'", str82, "");
        org.junit.Assert.assertNotNull(locale83);
        org.junit.Assert.assertEquals(locale83.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale84);
        org.junit.Assert.assertEquals(locale84.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "Chinese" + "'", str85, "Chinese");
        org.junit.Assert.assertNotNull(locale86);
        org.junit.Assert.assertEquals(locale86.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(strSet87);
        org.junit.Assert.assertNotNull(locale88);
        org.junit.Assert.assertEquals(locale88.toString(), "zh");
// flaky:         org.junit.Assert.assertEquals("'" + str89 + "' != '" + "\u6cd5\u6587\u6cd5\u56fd)" + "'", str89, "\u6cd5\u6587\u6cd5\u56fd)");
        org.junit.Assert.assertEquals("'" + str90 + "' != '" + "" + "'", str90, "");
        org.junit.Assert.assertNotNull(localeArray91);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + true + "'", boolean93 == true);
        org.junit.Assert.assertTrue("'" + filteringMode94 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode94.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(localeList95);
        org.junit.Assert.assertNull(locale96);
        org.junit.Assert.assertNull(locale97);
        org.junit.Assert.assertNull(locale98);
    }

    @Test
    public void test6724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6724");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("");
        int int2 = timeZone1.getRawOffset();
        int int3 = timeZone1.getRawOffset();
        timeZone1.setID("0 days 0 hours 0 minutes 0 seconds0 days 0 hours 0 minutes 0 seconds0 days 0 hours 0 minutes 0 secon");
        java.util.TimeZone timeZone7 = java.util.TimeZone.getTimeZone("");
        int int8 = timeZone7.getRawOffset();
        java.lang.String str9 = timeZone7.getID();
        java.time.ZoneId zoneId10 = timeZone7.toZoneId();
        boolean boolean11 = timeZone1.hasSameRules(timeZone7);
        boolean boolean12 = timeZone7.observesDaylightTime();
        java.util.TimeZone.setDefault(timeZone7);
        java.util.TimeZone.setDefault(timeZone7);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = timeZone7.getOffset(97, 23, (int) (short) -1, (int) '4', 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(timeZone7);
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "GMT" + "'", str9, "GMT");
        org.junit.Assert.assertNotNull(zoneId10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test6725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6725");
        java.util.Locale locale3 = new java.util.Locale("                                 0 DAYS 0 HOURS 0 MINUTES 0 SECOND                                  ", "EN", "Greenwich Mean Time");
        org.junit.Assert.assertEquals(locale3.toString(), "                                 0 days 0 hours 0 minutes 0 second                                  _EN_Greenwich Mean Time");
    }

    @Test
    public void test6726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6726");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("P-1Y11-130DT2374359-159.9903599985", 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test6727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6727");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 49, "P-1Y11M30DT23H59M59.959S", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P-1Y11030DT23059059.95949" + "'", str3, "P-1Y11030DT23059059.95949");
    }

    @Test
    public void test6728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6728");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("0:00:00.0000:00:00.0000:00:00.0000:00:00.0000:00          0I!          0:00:00.0000:00:00.0000:00:00.0000:00:00.0000:00:", 318);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.0000:00:00.0000:00:00.0000:00:00.0000:00          0I!          0:00:00.0000:00:00.0000:00:00.0000:00:00.0000:00:" + "'", str2, "0:00:00.0000:00:00.0000:00:00.0000:00:00.0000:00          0I!          0:00:00.0000:00:00.0000:00:00.0000:00:00.0000:00:");
    }

    @Test
    public void test6729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6729");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("Chinese (China)FRAN\307\uc911\uad6d\uc5b4\uc911\uad6d)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=chinese(china)franc?ais????????(??????)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6730");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("aaxabxaexafxakxamxanxarxasxavxayxazxbaxbexbgxbhxbixbmxbnxboxbrxbsxcaxcexchxcoxcrxcsxcxcvxcyxdaxdexdvxdzxeexelxenxeoxesxetxexfaxffxfixfjxfoxfrxfyxgaxgdxglxgnxgxgvxhaxhexhixhoxhrxhtxhxhyxhzxiaxidxiexigxiixikxinxioxisxitxixiwxjaxjixjvxkaxkgxkixkjxkkxklxkmxknxkoxkrxksxkxkvxkwxkyxlaxlbxlgxlixlnxloxltxlxlvxmgxmhxmixmkxmlxmnxmoxmrxmsxmtxmyxnaxnbxndxnexngxnlxnnxnoxnrxnvxnyxocxojxomxorxosxpaxpixplxpsxptxqxrmxrnxroxrxrwxsaxscxsdxsexsgxsixskxslxsmxsnxsoxsqxsrxssxstxsxsvxswxtaxtextgxthxtixtkxtlxtnxtoxtrxtsxttxtwxtyxgxkxrxzxvexvixvoxwaxwoxxhxyixyoxzaxzhxz", '4');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test6731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6731");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("P0Y0M0DT0H0M0.068S", "                                 0 DAYS 0 HOURS 0 MINUTES 0 SECOND                       ", "   TE0    ", 30);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "P0Y0M0DT0H0M0.068S" + "'", str4, "P0Y0M0DT0H0M0.068S");
    }

    @Test
    public void test6732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6732");
        java.util.TimeZone timeZone5 = java.util.TimeZone.getTimeZone("");
        java.lang.String str6 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(1L, 0L, "\u4e2d\u6587", true, timeZone5);
        boolean boolean7 = timeZone5.observesDaylightTime();
        java.util.TimeZone timeZone13 = java.util.TimeZone.getTimeZone("");
        java.lang.String str14 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(1L, 0L, "\u4e2d\u6587", true, timeZone13);
        boolean boolean15 = timeZone5.hasSameRules(timeZone13);
        int int17 = timeZone13.getOffset((long) (short) 10);
        java.time.ZoneId zoneId18 = timeZone13.toZoneId();
        java.util.TimeZone timeZone19 = java.util.TimeZone.getTimeZone(zoneId18);
        int int21 = timeZone19.getOffset((long) 15);
        timeZone19.setID("           HI!");
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\u4e2d\u6587" + "'", str6, "\u4e2d\u6587");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\u4e2d\u6587" + "'", str14, "\u4e2d\u6587");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(zoneId18);
        org.junit.Assert.assertNotNull(timeZone19);
        org.junit.Assert.assertEquals(timeZone19.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test6733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6733");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith(" uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu!IHuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                                                                                       ", "'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'Engli0h (Unite0 120tate0)");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test6734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6734");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("P0Y0M0DT0H0M0.051S", "_0 DAYS 0 HOURS 0 MINUTES 0 SECONDS_0 DAYS 0 HOURS 0 MINUTES 0 SECONDS_0 DAYS 0 HOURS 0 MINUTES 0 SECONDS_0 DAYS 0 HOURS 0 MINUTES 0 SECONDS_0 DAYS 0 HOURS 0 MINUTES 0 SECONDS_0 DAYS 0 HOURS 0 MINUTES 0 SECONDS_0 DAYS 0 HOURS 0 MINUTES 0 SECONDS_0 DAYS 0 HOURS 0 MINUTES 0 SECONDS_0 DAYS 0 HOURS 0 MINUTES 0 SECONDS_0 DAYS 0 HOURS 0 MINUTES 0 SECONDS", (int) 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y0M0DT0H0M0.051S" + "'", str3, "P0Y0M0DT0H0M0.051S");
    }

    @Test
    public void test6735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6735");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("H0M0.090SHIP0Y0M0DT0H0M0.090S!P0Y0M0DT0H0M0.090S", "'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'", (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test6736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6736");
        char[] charArray4 = new char[] { 'u', '4', 'u' };
        boolean boolean5 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "DeutschlandDeutschlandDeutschlandDeutschlandDeuts", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "u4u");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "u4u");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[u, 4, u]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test6737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6737");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("ENGLISH (UNITED STATES)", "CAN");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CAN" + "'", str2, "CAN");
    }

    @Test
    public void test6738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6738");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "-gb DAYS 0 HOURS 0 MI");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 21 + "'", int1 == 21);
    }

    @Test
    public void test6739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6739");
        java.util.Locale locale1 = new java.util.Locale("P0Y0-10DT07430-10.0343599900");
        java.util.Set<java.lang.String> strSet2 = locale1.getUnicodeLocaleAttributes();
        org.junit.Assert.assertEquals(locale1.toString(), "p0y0-10dt07430-10.0343599900");
        org.junit.Assert.assertNotNull(strSet2);
    }

    @Test
    public void test6740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6740");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("fr4n\347\uc911\uad6d\uc5b4\uc911\uad6d)", 1, "!i");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "fr4n\347\uc911\uad6d\uc5b4\uc911\uad6d)" + "'", str3, "fr4n\347\uc911\uad6d\uc5b4\uc911\uad6d)");
    }

    @Test
    public void test6741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6741");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("0:00:00.041", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.041" + "'", str2, "0:00:00.041");
    }

    @Test
    public void test6742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6742");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("p0y0m0dt00m0.020s", "P00-1Y11M30DT23H59M59.991S");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test6743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6743");
        java.util.Locale locale1 = new java.util.Locale("!I0");
        java.util.Locale locale2 = locale1.stripExtensions();
        java.util.Locale locale6 = new java.util.Locale("", "", "0 days 0 hours 0 minutes 0 seconds0 days 0 hours 0 minutes 0 seconds0 days 0 hours 0 minutes 0 secon");
        java.lang.String str7 = locale2.getDisplayName(locale6);
        java.util.Set<java.lang.String> strSet8 = locale6.getUnicodeLocaleAttributes();
        org.junit.Assert.assertEquals(locale1.toString(), "!i0");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "!i0");
        org.junit.Assert.assertEquals(locale6.toString(), "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "!i0" + "'", str7, "!i0");
        org.junit.Assert.assertNotNull(strSet8);
    }

    @Test
    public void test6744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6744");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("                                 'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's                                 ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test6745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6745");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationWords((long) 89, false, false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0 days 0 hours 0 minutes 0 seconds" + "'", str3, "0 days 0 hours 0 minutes 0 seconds");
    }

    @Test
    public void test6746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6746");
        java.lang.String str1 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationISO((long) 17);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "P0Y0M0DT0H0M0.017S" + "'", str1, "P0Y0M0DT0H0M0.017S");
    }

    @Test
    public void test6747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6747");
        java.util.TimeZone timeZone5 = java.util.TimeZone.getTimeZone("zho");
        java.lang.String str6 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 97, (long) (short) -1, "gmt", false, timeZone5);
        java.util.Locale locale9 = java.util.Locale.CHINA;
        java.util.Locale locale10 = locale9.stripExtensions();
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.lowerCase("99.00:00:0", locale9);
        boolean boolean12 = locale9.hasExtensions();
        java.lang.String str13 = locale9.getScript();
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.lowerCase("Chine0e", locale9);
        java.lang.String str15 = timeZone5.getDisplayName(locale9);
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "g35999t" + "'", str6, "g35999t");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "99.00:00:0" + "'", str11, "99.00:00:0");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "chine0e" + "'", str14, "chine0e");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\u683c\u6797\u5a01\u6cbb\u65f6\u95f4" + "'", str15, "\u683c\u6797\u5a01\u6cbb\u65f6\u95f4");
    }

    @Test
    public void test6748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6748");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "P0Y0M0DT0H0M0.042");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 17 + "'", int1 == 17);
    }

    @Test
    public void test6749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6749");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.Locale[] localeArray3 = new java.util.Locale[] {};
        java.util.ArrayList<java.util.Locale> localeList4 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList4, localeArray3);
        java.util.Locale locale6 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.util.Locale>) localeList4);
        java.util.Collection<java.util.Locale> localeCollection7 = null;
        java.util.Locale.FilteringMode filteringMode8 = java.util.Locale.FilteringMode.EXTENDED_FILTERING;
        java.util.List<java.util.Locale> localeList9 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, localeCollection7, filteringMode8);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap10 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList11 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap10);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap12 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList13 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap12);
        java.util.Locale locale15 = java.util.Locale.forLanguageTag("\u4e2d\u6587");
        java.lang.String str16 = locale15.getDisplayLanguage();
        java.util.Set<java.lang.String> strSet17 = locale15.getUnicodeLocaleAttributes();
        java.lang.String str18 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strSet17);
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.util.Locale.LanguageRange>) languageRangeList1, "                                                                                                 !i0");
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(localeArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(locale6);
        org.junit.Assert.assertTrue("'" + filteringMode8 + "' != '" + java.util.Locale.FilteringMode.EXTENDED_FILTERING + "'", filteringMode8.equals(java.util.Locale.FilteringMode.EXTENDED_FILTERING));
        org.junit.Assert.assertNotNull(localeList9);
        org.junit.Assert.assertNotNull(languageRangeList11);
        org.junit.Assert.assertNotNull(languageRangeList13);
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test6750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6750");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("\u4e2d\u6587_                                                                                                    ", "                     ZH_TW                      ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u4e2d\u6587_                                                                                                    " + "'", str2, "\u4e2d\u6587_                                                                                                    ");
    }

    @Test
    public void test6751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6751");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale2 = java.util.Locale.CHINA;
        java.util.Locale locale3 = locale2.stripExtensions();
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.lowerCase("99.00:00:0", locale2);
        java.util.Locale.Builder builder5 = builder0.setLocale(locale2);
        java.util.Locale.Builder builder7 = builder0.setLanguage("");
        java.util.Locale.Builder builder9 = builder7.setLanguage("");
        java.util.Locale.Builder builder10 = builder9.clearExtensions();
        java.util.Locale.Category category11 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale12 = java.util.Locale.UK;
        java.util.Locale.setDefault(category11, locale12);
        java.lang.String str14 = locale12.getVariant();
        java.util.Set<java.lang.String> strSet15 = locale12.getUnicodeLocaleAttributes();
        java.util.Locale.Builder builder16 = builder10.setLocale(locale12);
        java.util.Locale locale18 = new java.util.Locale("");
        java.util.Locale locale20 = new java.util.Locale("\u4e2d\u6587");
        java.lang.String str21 = locale18.getDisplayScript(locale20);
        java.util.Locale locale23 = java.util.Locale.forLanguageTag("P0Y0M0DT0H0M0.034S");
        java.lang.String str24 = locale20.getDisplayName(locale23);
        java.util.Locale.Builder builder25 = new java.util.Locale.Builder();
        java.util.Locale locale26 = builder25.build();
        java.util.Locale.setDefault(locale26);
        java.util.Locale locale28 = java.util.Locale.CHINA;
        java.util.Locale locale29 = java.util.Locale.PRC;
        java.lang.String str30 = locale28.getDisplayLanguage(locale29);
        java.lang.String str31 = locale26.getDisplayLanguage(locale29);
        java.lang.String str32 = locale29.getISO3Language();
        java.util.Locale.setDefault(locale29);
        java.lang.String str34 = locale20.getDisplayName(locale29);
        java.util.Locale.Builder builder35 = builder10.setLocale(locale29);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder37 = builder10.setVariant("!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: !IH!IH!IH!IH!IH!IH!IH!IH!IH!IH [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "99.00:00:0" + "'", str4, "99.00:00:0");
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertTrue("'" + category11 + "' != '" + java.util.Locale.Category.FORMAT + "'", category11.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(strSet15);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertEquals(locale18.toString(), "");
        org.junit.Assert.assertEquals(locale20.toString(), "\u4e2d\u6587");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "\u4e2d\u6587" + "'", str24, "\u4e2d\u6587");
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "");
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "\u4e2d\u6587" + "'", str30, "\u4e2d\u6587");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "zho" + "'", str32, "zho");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "\u4e2d\u6587" + "'", str34, "\u4e2d\u6587");
        org.junit.Assert.assertNotNull(builder35);
    }

    @Test
    public void test6752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6752");
        java.util.Locale locale1 = new java.util.Locale("!IH");
        boolean boolean2 = locale1.hasExtensions();
        java.lang.String str3 = locale1.getISO3Country();
        org.junit.Assert.assertEquals(locale1.toString(), "!ih");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test6753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6753");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("HI!                          ...", "!ih!ih!...testestestestestestestestestestestestestestestestestestestestest'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'", 18);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.concatWith("0 DAYS 0 HOURS 0 MINUTES 0 SECO", (java.lang.Object[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "HI!                          ..." + "'", str5, "HI!                          ...");
    }

    @Test
    public void test6754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6754");
        java.util.Locale.Category category1 = java.util.Locale.Category.DISPLAY;
        java.util.Locale.Category category2 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale3 = java.util.Locale.getDefault();
        java.util.Locale.setDefault(category2, locale3);
        java.util.Set<java.lang.String> strSet5 = locale3.getUnicodeLocaleKeys();
        java.util.Locale locale7 = new java.util.Locale("");
        java.util.Locale locale9 = new java.util.Locale("\u4e2d\u6587");
        java.lang.String str10 = locale7.getDisplayScript(locale9);
        java.util.Locale locale12 = java.util.Locale.forLanguageTag("P0Y0M0DT0H0M0.034S");
        java.lang.String str13 = locale9.getDisplayName(locale12);
        java.lang.String str14 = locale3.getDisplayScript(locale9);
        java.util.Locale locale17 = new java.util.Locale("0:00:00.000", "zh_TW");
        java.util.Locale.Builder builder18 = new java.util.Locale.Builder();
        java.util.Locale locale19 = builder18.build();
        java.util.Locale.setDefault(locale19);
        java.util.Locale locale21 = java.util.Locale.CHINA;
        java.util.Locale locale22 = java.util.Locale.PRC;
        java.lang.String str23 = locale21.getDisplayLanguage(locale22);
        java.lang.String str24 = locale19.getDisplayLanguage(locale22);
        java.lang.String str25 = locale17.getDisplayVariant(locale22);
        java.lang.String str26 = locale9.getDisplayVariant(locale22);
        java.util.Locale locale28 = java.util.Locale.GERMANY;
        java.lang.String str29 = org.apache.commons.lang3.StringUtils.lowerCase("HI!", locale28);
        java.lang.String str30 = locale22.getDisplayName(locale28);
        java.util.Set<java.lang.String> strSet31 = locale22.getUnicodeLocaleKeys();
        java.util.Locale.setDefault(category1, locale22);
        java.lang.String str33 = org.apache.commons.lang3.StringUtils.lowerCase("   tChinesisch (China)", locale22);
        org.junit.Assert.assertTrue("'" + category1 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category1.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertTrue("'" + category2 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category2.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertEquals(locale7.toString(), "");
        org.junit.Assert.assertEquals(locale9.toString(), "\u4e2d\u6587");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\u4e2d\u6587" + "'", str13, "\u4e2d\u6587");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals(locale17.toString(), "0:00:00.000_ZH_TW");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\u4e2d\u6587" + "'", str23, "\u4e2d\u6587");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Chinesisch (China)" + "'", str30, "Chinesisch (China)");
        org.junit.Assert.assertNotNull(strSet31);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "   tchinesisch (china)" + "'", str33, "   tchinesisch (china)");
    }

    @Test
    public void test6755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6755");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.Locale[] localeArray3 = new java.util.Locale[] {};
        java.util.ArrayList<java.util.Locale> localeList4 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList4, localeArray3);
        java.util.Locale locale6 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.util.Locale>) localeList4);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.util.Locale.LanguageRange>) languageRangeList1, 'a');
        java.util.Locale locale10 = new java.util.Locale("");
        java.lang.String str11 = locale10.getScript();
        java.util.Locale locale12 = java.util.Locale.CHINESE;
        java.util.Locale locale15 = new java.util.Locale("", "0 days 0 hours 0 minutes 0 seconds");
        java.util.Locale locale16 = java.util.Locale.ROOT;
        java.util.Locale.Category category17 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale18 = java.util.Locale.getDefault();
        java.util.Locale.setDefault(category17, locale18);
        java.util.Locale locale20 = java.util.Locale.CHINA;
        java.util.Locale locale21 = java.util.Locale.PRC;
        java.lang.String str22 = locale20.getDisplayLanguage(locale21);
        java.util.Locale locale23 = java.util.Locale.CHINA;
        java.util.Locale locale24 = java.util.Locale.PRC;
        java.util.Locale locale26 = java.util.Locale.GERMANY;
        java.lang.String str27 = org.apache.commons.lang3.StringUtils.lowerCase("HI!", locale26);
        java.lang.String str28 = locale24.getDisplayVariant(locale26);
        java.util.Locale.Category category29 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale30 = java.util.Locale.getDefault();
        java.util.Locale.setDefault(category29, locale30);
        java.util.Locale locale32 = java.util.Locale.CHINESE;
        java.util.Locale locale33 = java.util.Locale.PRC;
        java.util.Locale locale35 = java.util.Locale.GERMANY;
        java.lang.String str36 = org.apache.commons.lang3.StringUtils.lowerCase("HI!", locale35);
        java.lang.String str37 = locale33.getDisplayVariant(locale35);
        java.util.Locale locale38 = java.util.Locale.CHINA;
        java.util.Locale locale39 = java.util.Locale.ITALY;
        java.util.Locale locale40 = java.util.Locale.PRC;
        java.util.Locale locale42 = java.util.Locale.GERMANY;
        java.lang.String str43 = org.apache.commons.lang3.StringUtils.lowerCase("HI!", locale42);
        java.lang.String str44 = locale40.getDisplayVariant(locale42);
        java.util.Locale locale45 = java.util.Locale.getDefault();
        java.util.Locale locale46 = java.util.Locale.ROOT;
        java.lang.String str47 = locale46.getLanguage();
        java.util.Locale locale48 = java.util.Locale.GERMANY;
        java.util.Locale[] localeArray49 = new java.util.Locale[] { locale10, locale12, locale15, locale16, locale18, locale21, locale23, locale24, locale30, locale32, locale33, locale38, locale39, locale40, locale45, locale46, locale48 };
        java.util.ArrayList<java.util.Locale> localeList50 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList50, localeArray49);
        java.util.List<java.util.Locale> localeList52 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.util.Locale>) localeList50);
        java.util.Locale locale53 = java.util.Locale.UK;
        java.util.Locale.Category category54 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale55 = java.util.Locale.CANADA;
        java.util.Locale.setDefault(category54, locale55);
        java.lang.String str57 = locale55.getLanguage();
        java.lang.String str58 = locale53.getDisplayScript(locale55);
        java.util.Set<java.lang.String> strSet59 = locale55.getUnicodeLocaleKeys();
        java.util.List<java.lang.String> strList60 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strSet59);
        java.util.Locale.LanguageRange[] languageRangeArray61 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList62 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList62, languageRangeArray61);
        java.util.Locale[] localeArray64 = new java.util.Locale[] {};
        java.util.ArrayList<java.util.Locale> localeList65 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList65, localeArray64);
        java.util.Locale locale67 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList62, (java.util.Collection<java.util.Locale>) localeList65);
        java.util.Locale locale68 = java.util.Locale.PRC;
        java.util.Locale locale70 = java.util.Locale.GERMANY;
        java.lang.String str71 = org.apache.commons.lang3.StringUtils.lowerCase("HI!", locale70);
        java.lang.String str72 = locale68.getDisplayVariant(locale70);
        java.util.Locale locale73 = java.util.Locale.FRANCE;
        java.util.Set<java.lang.String> strSet74 = locale73.getUnicodeLocaleKeys();
        java.util.Locale locale75 = java.util.Locale.FRANCE;
        java.util.Set<java.lang.String> strSet76 = locale75.getUnicodeLocaleKeys();
        java.util.Locale locale77 = java.util.Locale.CHINESE;
        java.lang.String str78 = locale75.getDisplayName(locale77);
        java.util.Locale locale79 = java.util.Locale.FRANCE;
        java.util.Locale[] localeArray80 = new java.util.Locale[] { locale68, locale73, locale75, locale79 };
        java.util.ArrayList<java.util.Locale> localeList81 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean82 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList81, localeArray80);
        java.util.Locale locale83 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList62, (java.util.Collection<java.util.Locale>) localeList81);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap84 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList85 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList62, strMap84);
        java.util.Locale locale86 = java.util.Locale.FRANCE;
        java.util.Set<java.lang.String> strSet87 = locale86.getUnicodeLocaleKeys();
        java.lang.String str88 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList62, (java.util.Collection<java.lang.String>) strSet87);
        java.lang.String str89 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strSet87);
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(localeArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(locale6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals(locale10.toString(), "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "zh");
        org.junit.Assert.assertEquals(locale15.toString(), "_0 DAYS 0 HOURS 0 MINUTES 0 SECONDS");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "");
        org.junit.Assert.assertTrue("'" + category17 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category17.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "\u4e2d\u6587" + "'", str22, "\u4e2d\u6587");
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + category29 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category29.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "");
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "zh");
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertNotNull(locale38);
        org.junit.Assert.assertEquals(locale38.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale39);
        org.junit.Assert.assertEquals(locale39.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale40);
        org.junit.Assert.assertEquals(locale40.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale42);
        org.junit.Assert.assertEquals(locale42.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "hi!" + "'", str43, "hi!");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertNotNull(locale45);
        org.junit.Assert.assertEquals(locale45.toString(), "");
        org.junit.Assert.assertNotNull(locale46);
        org.junit.Assert.assertEquals(locale46.toString(), "");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertNotNull(locale48);
        org.junit.Assert.assertEquals(locale48.toString(), "de_DE");
        org.junit.Assert.assertNotNull(localeArray49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(localeList52);
        org.junit.Assert.assertNotNull(locale53);
        org.junit.Assert.assertEquals(locale53.toString(), "en_GB");
        org.junit.Assert.assertTrue("'" + category54 + "' != '" + java.util.Locale.Category.FORMAT + "'", category54.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale55);
        org.junit.Assert.assertEquals(locale55.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "en" + "'", str57, "en");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertNotNull(strSet59);
        org.junit.Assert.assertNotNull(strList60);
        org.junit.Assert.assertNotNull(languageRangeArray61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(localeArray64);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNull(locale67);
        org.junit.Assert.assertNotNull(locale68);
        org.junit.Assert.assertEquals(locale68.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale70);
        org.junit.Assert.assertEquals(locale70.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "hi!" + "'", str71, "hi!");
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "" + "'", str72, "");
        org.junit.Assert.assertNotNull(locale73);
        org.junit.Assert.assertEquals(locale73.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(strSet74);
        org.junit.Assert.assertNotNull(locale75);
        org.junit.Assert.assertEquals(locale75.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(strSet76);
        org.junit.Assert.assertNotNull(locale77);
        org.junit.Assert.assertEquals(locale77.toString(), "zh");
// flaky:         org.junit.Assert.assertEquals("'" + str78 + "' != '" + "\u6cd5\u6587\u6cd5\u56fd)" + "'", str78, "\u6cd5\u6587\u6cd5\u56fd)");
        org.junit.Assert.assertNotNull(locale79);
        org.junit.Assert.assertEquals(locale79.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(localeArray80);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertNull(locale83);
        org.junit.Assert.assertNotNull(languageRangeList85);
        org.junit.Assert.assertNotNull(locale86);
        org.junit.Assert.assertEquals(locale86.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(strSet87);
        org.junit.Assert.assertNull(str88);
        org.junit.Assert.assertNull(str89);
    }

    @Test
    public void test6756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6756");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("ih");
        double double2 = languageRange1.getWeight();
        double double3 = languageRange1.getWeight();
        double double4 = languageRange1.getWeight();
        java.lang.String str5 = languageRange1.getRange();
        java.lang.String str6 = languageRange1.getRange();
        java.lang.String str7 = languageRange1.getRange();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ih" + "'", str5, "ih");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ih" + "'", str6, "ih");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ih" + "'", str7, "ih");
    }

    @Test
    public void test6757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6757");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("P0Y0M0DT0H0M0.097S");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "p0y0m0dt0h0m0.097s" + "'", str1, "p0y0m0dt0h0m0.097s");
    }

    @Test
    public void test6758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6758");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("Chine", " und          ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test6759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6759");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 19, "HI");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0I" + "'", str2, "0I");
    }

    @Test
    public void test6760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6760");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterType("p0y0m0dt0h0m0.090s");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray2);
        boolean boolean4 = org.apache.commons.lang3.StringUtils.startsWithAny("uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu0:00:00.097", strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "p0y0m0dt0h0m0.090s" + "'", str3, "p0y0m0dt0h0m0.090s");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6761");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("!IH#####################################################################################################################", 'x');
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("0days0hours0minutes0seco");
        int int7 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("                                         ", strArray6);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.stripAll(strArray6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly(" und ", strArray3, strArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 1 vs 8");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test6762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6762");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("P0Y000DT00000.01925", "                                 0 DAYS 0 HOURS 0 MINUTES 0 SECOND                       ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                 0 DAYS 0 HOURS 0 MINUTES 0 SECOND                       " + "'", str2, "                                 0 DAYS 0 HOURS 0 MINUTES 0 SECOND                       ");
    }

    @Test
    public void test6763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6763");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("'m'...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "'m'..." + "'", str1, "'m'...");
    }

    @Test
    public void test6764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6764");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "0:00:00.089");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test6765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6765");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.util.Set<java.lang.String> strSet1 = locale0.getUnicodeLocaleKeys();
        java.util.Locale locale2 = java.util.Locale.CHINESE;
        java.lang.String str3 = locale0.getDisplayName(locale2);
        java.lang.String str4 = locale2.getLanguage();
        java.lang.String str5 = locale2.getISO3Country();
        java.lang.String str6 = locale2.getScript();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u6cd5\u6587\u6cd5\u56fd)" + "'", str3, "\u6cd5\u6587\u6cd5\u56fd)");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "zh" + "'", str4, "zh");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test6766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6766");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.Locale[] localeArray3 = new java.util.Locale[] {};
        java.util.ArrayList<java.util.Locale> localeList4 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList4, localeArray3);
        java.util.Locale locale6 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.util.Locale>) localeList4);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.util.Locale.LanguageRange>) languageRangeList1, 'a');
        java.util.Locale.LanguageRange[] languageRangeArray9 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList10 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList10, languageRangeArray9);
        java.util.Locale[] localeArray12 = new java.util.Locale[] {};
        java.util.ArrayList<java.util.Locale> localeList13 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList13, localeArray12);
        java.util.Locale locale15 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList10, (java.util.Collection<java.util.Locale>) localeList13);
        java.util.Collection<java.util.Locale> localeCollection16 = null;
        java.util.Locale.FilteringMode filteringMode17 = java.util.Locale.FilteringMode.EXTENDED_FILTERING;
        java.util.List<java.util.Locale> localeList18 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList10, localeCollection16, filteringMode17);
        java.util.Locale locale19 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, localeCollection16);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap20 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList21 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap20);
        java.lang.String str23 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.util.Locale.LanguageRange>) languageRangeList1, "un0");
        java.lang.String str25 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.util.Locale.LanguageRange>) languageRangeList1, '#');
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(localeArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(locale6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(languageRangeArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(localeArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(locale15);
        org.junit.Assert.assertTrue("'" + filteringMode17 + "' != '" + java.util.Locale.FilteringMode.EXTENDED_FILTERING + "'", filteringMode17.equals(java.util.Locale.FilteringMode.EXTENDED_FILTERING));
        org.junit.Assert.assertNotNull(localeList18);
        org.junit.Assert.assertNull(locale19);
        org.junit.Assert.assertNotNull(languageRangeList21);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test6767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6767");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("#######P0Y0M0DT0H0M0...", "0I");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test6768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6768");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale locale2 = builder0.build();
        java.util.Locale.Builder builder4 = builder0.setLanguageTag("Chine");
        java.util.Locale locale5 = builder0.build();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "chine");
    }

    @Test
    public void test6769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6769");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("0danaC:danaC00danaC:danaC00danaC.danaC097xxxxxxxxxxxxxxxxxxxxxxxxxxxxx", ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0danaC:danaC00danaC:danaC00danaC.danaC097xxxxxxxxxxxxxxxxxxxxxxxxxxxxx" + "'", str2, "0danaC:danaC00danaC:danaC00danaC.danaC097xxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
    }

    @Test
    public void test6770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6770");
        java.util.Locale locale1 = java.util.Locale.FRANCE;
        java.util.Set<java.lang.String> strSet2 = locale1.getUnicodeLocaleKeys();
        java.util.Locale locale3 = java.util.Locale.CHINESE;
        java.lang.String str4 = locale1.getDisplayName(locale3);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.upperCase("!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih", locale1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = locale1.getExtension('4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed extension key: 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "zh");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u6cd5\u6587\u6cd5\u56fd)" + "'", str4, "\u6cd5\u6587\u6cd5\u56fd)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH" + "'", str5, "!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH");
    }

    @Test
    public void test6771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6771");
        java.util.Locale locale2 = java.util.Locale.forLanguageTag("0 days 0 hours");
        java.util.Locale locale3 = java.util.Locale.CHINA;
        java.lang.String str4 = locale3.getDisplayVariant();
        java.lang.String str5 = locale3.getVariant();
        java.lang.String str6 = locale3.getDisplayCountry();
        java.util.Locale.Builder builder7 = new java.util.Locale.Builder();
        java.util.Locale locale8 = builder7.build();
        java.lang.String str9 = locale8.toLanguageTag();
        java.util.Locale locale10 = locale8.stripExtensions();
        java.lang.String str11 = locale3.getDisplayScript(locale8);
        java.lang.String str12 = locale2.getDisplayLanguage(locale8);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.lowerCase("0:00:00.017xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx", locale2);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "China" + "'", str6, "China");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "und" + "'", str9, "und");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "0:00:00.017xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx" + "'", str13, "0:00:00.017xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
    }

    @Test
    public void test6772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6772");
        java.util.Locale locale2 = new java.util.Locale("                P0Y0M0DT0H0M0.090ShiP0Y0M0DT0H0M0.090S!P0Y0M0DT0H0M0.090S                        ", "'m's.s'");
        org.junit.Assert.assertEquals(locale2.toString(), "                p0y0m0dt0h0m0.090ship0y0m0dt0h0m0.090s!p0y0m0dt0h0m0.090s                        _'M'S.S'");
    }

    @Test
    public void test6773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6773");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("0 0a00", 153);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                   0 0a00" + "'", str2, "                                                                                                                                                   0 0a00");
    }

    @Test
    public void test6774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6774");
        java.util.TimeZone timeZone5 = java.util.TimeZone.getTimeZone("");
        int int6 = timeZone5.getRawOffset();
        java.lang.String str7 = timeZone5.getID();
        java.time.ZoneId zoneId8 = timeZone5.toZoneId();
        java.lang.String str9 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(0L, 1L, "\u6cd5\u6587\u6cd5\u56fd)", false, timeZone5);
        timeZone5.setRawOffset((int) 'a');
        int int13 = timeZone5.getOffset((long) (-1));
        java.time.ZoneId zoneId14 = timeZone5.toZoneId();
        java.util.TimeZone timeZone15 = java.util.TimeZone.getTimeZone(zoneId14);
        java.util.TimeZone timeZone16 = java.util.TimeZone.getTimeZone(zoneId14);
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "GMT" + "'", str7, "GMT");
        org.junit.Assert.assertNotNull(zoneId8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\u6cd5\u6587\u6cd5\u56fd)" + "'", str9, "\u6cd5\u6587\u6cd5\u56fd)");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertNotNull(zoneId14);
        org.junit.Assert.assertNotNull(timeZone15);
        org.junit.Assert.assertEquals(timeZone15.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(timeZone16);
        org.junit.Assert.assertEquals(timeZone16.getDisplayName(), "Greenwich Mean Time");
    }

    @Test
    public void test6775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6775");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("H0M0.090SHIP0Y0M0DT0H0M0.090S!P0Y0M0DT0H0M0.090S", "\u6cd5\u6587\u6cd5\u56fd", "c#n");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test6776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6776");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("0e-DE", (int) (short) 0, 'u');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0e-DE" + "'", str3, "0e-DE");
    }

    @Test
    public void test6777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6777");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("English (United Kingdom)", "Franc");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "English (United Kingdom)" + "'", str2, "English (United Kingdom)");
    }

    @Test
    public void test6778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6778");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("...ch0eure 0e Gr...", 52);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...ch0eure 0e Gr..." + "'", str2, "...ch0eure 0e Gr...");
    }

    @Test
    public void test6779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6779");
        java.util.Locale locale3 = new java.util.Locale("!IH", "P0Y0M0DT0H0M0.034S", "\u6cd5\u6587\u6cd5\u56fd)");
        java.util.Set<java.lang.Character> charSet4 = locale3.getExtensionKeys();
        java.lang.String str5 = locale3.getLanguage();
        java.lang.String str6 = locale3.getDisplayName();
// flaky:         org.junit.Assert.assertEquals(locale3.toString(), "\u6cd5\u6587\u6cd5\u56fd)");
        org.junit.Assert.assertNotNull(charSet4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "!ih" + "'", str5, "!ih");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\u6cd5\u6587\u6cd5\u56fd))" + "'", str6, "\u6cd5\u6587\u6cd5\u56fd))");
    }

    @Test
    public void test6780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6780");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "deu", "                                                P0Y0M0DT0H0M0.090ShiP0Y0M0DT0H0M0.090S!P0Y0M0DT0H");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test6781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6781");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterType("p0y0m0dt0h0m0.090s");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfAny("OURS 0 MI", strArray2);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5 + "'", int3 == 5);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test6782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6782");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("en-CA");
        double double2 = languageRange1.getWeight();
        double double3 = languageRange1.getWeight();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
    }

    @Test
    public void test6783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6783");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("\u6cd5\u6587\u6cd5\u56fd)", 'a');
        int int6 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("hi!", strArray5);
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.split("'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S", "!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!!ih!ih!...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih", (int) (short) 1);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.replaceEach("eng", strArray5, strArray10);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.startsWithAny("\u683c\u6797\u5a01\u6cbb\u6642\u9593", strArray10);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray10, "\u53f0\u7063");
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "eng" + "'", str11, "eng");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S" + "'", str14, "'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S");
    }

    @Test
    public void test6784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6784");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone6 = java.util.TimeZone.getTimeZone("");
        java.lang.String str7 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(1L, 0L, "\u4e2d\u6587", true, timeZone6);
        boolean boolean8 = timeZone6.observesDaylightTime();
        java.util.TimeZone timeZone14 = java.util.TimeZone.getTimeZone("");
        java.lang.String str15 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(1L, 0L, "\u4e2d\u6587", true, timeZone14);
        boolean boolean16 = timeZone6.hasSameRules(timeZone14);
        boolean boolean17 = timeZone0.hasSameRules(timeZone6);
        java.lang.String str18 = timeZone0.getID();
        // The following exception was thrown during execution in test generation
        try {
            int int25 = timeZone0.getOffset(8, (int) (byte) -1, (int) (short) 1, 96, 16, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\u4e2d\u6587" + "'", str7, "\u4e2d\u6587");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(timeZone14);
        org.junit.Assert.assertEquals(timeZone14.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\u4e2d\u6587" + "'", str15, "\u4e2d\u6587");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "GMT" + "'", str18, "GMT");
    }

    @Test
    public void test6785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6785");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("en-CA", 0, "0 days 0 hours 0 minutes 0 seco");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "en-CA" + "'", str3, "en-CA");
    }

    @Test
    public void test6786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6786");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale2 = java.util.Locale.CHINA;
        java.util.Locale locale3 = locale2.stripExtensions();
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.lowerCase("99.00:00:0", locale2);
        java.util.Locale.Builder builder5 = builder0.setLocale(locale2);
        java.lang.String str6 = locale2.getDisplayCountry();
        java.util.Locale.Builder builder7 = new java.util.Locale.Builder();
        java.util.Locale locale8 = builder7.build();
        java.util.Locale locale9 = builder7.build();
        java.util.Locale.Builder builder10 = builder7.clear();
        java.util.Locale.Builder builder11 = builder10.clearExtensions();
        java.util.Locale locale12 = builder10.build();
        java.lang.String str13 = locale2.getDisplayVariant(locale12);
        java.lang.String str14 = locale12.getDisplayVariant();
        java.lang.String str15 = locale12.getDisplayName();
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "99.00:00:0" + "'", str4, "99.00:00:0");
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "China" + "'", str6, "China");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "");
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test6787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6787");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("Rf", "n ar as av ay az ba be bg bh bi bm bn ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test6788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6788");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("en-CA", 21, 'x');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "en-CAxxxxxxxxxxxxxxxx" + "'", str3, "en-CAxxxxxxxxxxxxxxxx");
    }

    @Test
    public void test6789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6789");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale locale2 = builder0.build();
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale.Builder builder4 = builder3.clearExtensions();
        java.util.Locale locale5 = builder3.build();
        java.util.Locale.Builder builder6 = builder3.clearExtensions();
        java.util.Locale.Builder builder7 = builder3.clear();
        java.util.Locale.Builder builder8 = builder7.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder10 = builder8.setVariant("ng");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: ng [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test6790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6790");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "Heure de GreenwichHeure de GreenwichHeure de GreenwichHeure de GreenwichHeure de GreenwichHeure de GreenwichHeure de GreenwichHeure de GreenwichHeure de GreenwichHeure de GreenwichHeure de GreenwichHeure de GreenwichHeure de GreenwichHeure de GreenwichHeure de GreenwichHeure de GreenwichHeure de GreenwichHeure de GreenwichHeure de Greenwich");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test6791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6791");
        char[] charArray11 = new char[] { 'a', ' ', '#', '4', '#', '4' };
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "HI!", charArray11);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.034-1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", charArray11);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsAny("zh", charArray11);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "P0Y0M0DT0H0M0.090ShiP0Y0M0DT0H0M0.090S!P0Y0M0DT0H0M0.090S", charArray11);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'Engli0h (Unite0 120tate0)", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "a #4#4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "a #4#4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[a,  , #, 4, #, 4]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 41 + "'", int13 == 41);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test6792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6792");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale2 = java.util.Locale.CHINA;
        java.util.Locale locale3 = locale2.stripExtensions();
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.lowerCase("99.00:00:0", locale2);
        java.util.Locale.Builder builder5 = builder0.setLocale(locale2);
        java.util.Locale.Builder builder7 = builder0.setLanguage("");
        java.util.Locale.Builder builder10 = builder7.setExtension('x', "");
        java.util.Locale.Builder builder12 = builder7.setLanguageTag("ih");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder14 = builder12.addUnicodeLocaleAttribute("44444444444444444444444444444444444444           HI");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: 44444444444444444444444444444444444444           HI [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "99.00:00:0" + "'", str4, "99.00:00:0");
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test6793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6793");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("\u56fd\u6cd5\u6587\u6cd5,s430.0m0h0td0m0y0p( hi!", "STESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTEST'P'YYYY'Y'M'M'D'DT'H'H'M'M'S.S'S'NGLISH (uNITED kINGDOM)");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u56fd\u6cd5\u6587\u6cd5,s430.0m0h0td0m0y0p( hi!" + "'", str2, "\u56fd\u6cd5\u6587\u6cd5,s430.0m0h0td0m0y0p( hi!");
    }

    @Test
    public void test6794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6794");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "P0Y0-10DT07430-10.0343599900");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test6795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6795");
        java.lang.String[] strArray1 = java.util.TimeZone.getAvailableIDs((int) (short) -1);
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test6796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6796");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("JA", "eneneneneneneneneneneneneneneneneHI!HI!HI!ihHI!HI!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test6797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6797");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale2 = java.util.Locale.CHINA;
        java.util.Locale locale3 = locale2.stripExtensions();
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.lowerCase("99.00:00:0", locale2);
        java.util.Locale.Builder builder5 = builder0.setLocale(locale2);
        java.util.Locale.Builder builder7 = builder5.setLanguage("und");
        java.util.Locale.Builder builder8 = builder5.clear();
        java.util.Locale.Builder builder10 = builder5.setLanguage("France");
        java.util.Locale locale11 = builder5.build();
        java.lang.Object obj12 = locale11.clone();
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "99.00:00:0" + "'", str4, "99.00:00:0");
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "france");
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertEquals(obj12.toString(), "france");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj12), "france");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj12), "france");
    }

    @Test
    public void test6798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6798");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("...############################################################################################...", "0:00:00.0000:00:00.0000:00:00.0000:00:00.0000:00          0I!          0:00:00.0000:00:00.0000:00:00.0000:00:00.0000:00:", 46);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...############################################################################################..." + "'", str3, "...############################################################################################...");
    }

    @Test
    public void test6799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6799");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("0:00:00.10I!0:00:00.1", 100, 98);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test6800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6800");
        java.util.Locale locale1 = new java.util.Locale("Italy");
        java.lang.String str2 = locale1.getDisplayName();
        java.lang.Object obj3 = locale1.clone();
        org.junit.Assert.assertEquals(locale1.toString(), "italy");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "italy" + "'", str2, "italy");
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertEquals(obj3.toString(), "italy");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj3), "italy");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj3), "italy");
    }

    @Test
    public void test6801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6801");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.substringsBetween("", "!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH", "UNITED STATES");
        int int5 = org.apache.commons.lang3.StringUtils.indexOfAny("GMT", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test6802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6802");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU0:00:00.097UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test6803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6803");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("HI!", "ENGENGENGENGENGENGENGENGENGENGENGENGENGzh_twt00t00t00t00t0ENGENGENGENGENGENGENGENGENGENGENGENGENG");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test6804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6804");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale locale2 = builder0.build();
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale.Builder builder4 = builder3.clearExtensions();
        java.util.Locale locale5 = builder3.build();
        java.util.Locale.Builder builder6 = builder3.clearExtensions();
        java.util.Locale.Builder builder7 = builder3.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder9 = builder7.setRegion("P0Y0M0DT0H0M0.003S");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: P0Y0M0DT0H0M0.003S [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test6805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6805");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("'m's.s'p0y0m0dt0h0m0.042s", "-GB");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test6806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6806");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("French", 49, (int) 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test6807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6807");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("JA", 'u', '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "JA" + "'", str3, "JA");
    }

    @Test
    public void test6808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6808");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("P0Y0M0DT0H0M0.034S");
        java.util.Locale locale3 = java.util.Locale.UK;
        java.util.Locale.Category category4 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale5 = java.util.Locale.CANADA;
        java.util.Locale.setDefault(category4, locale5);
        java.lang.String str7 = locale5.getLanguage();
        java.lang.String str8 = locale3.getDisplayScript(locale5);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.lowerCase("danaC", locale3);
        java.lang.String str10 = locale1.getDisplayLanguage(locale3);
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en_GB");
        org.junit.Assert.assertTrue("'" + category4 + "' != '" + java.util.Locale.Category.FORMAT + "'", category4.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "en" + "'", str7, "en");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "danac" + "'", str9, "danac");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test6809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6809");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 0, (long) 8, "0:00:00.007");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:00:00.007" + "'", str3, "0:00:00.007");
    }

    @Test
    public void test6810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6810");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("Chine0euuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", "engeng");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test6811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6811");
        java.util.Locale locale2 = new java.util.Locale("\u6cd5\u6587\u6cd5\u56fd)");
        boolean boolean3 = locale2.hasExtensions();
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.upperCase(" DAYS 0 HOURS 0 MINUTES 0 SECONDS0 DAYS 0 HOURS 0 MINUTES 0 SECONDS0 DAYS 0 HOURS 0 MINUTES 0 SECON", locale2);
        java.lang.Class<?> wildcardClass5 = locale2.getClass();
        org.junit.Assert.assertEquals(locale2.toString(), "\u6cd5\u6587\u6cd5\u56fd)");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + " DAYS 0 HOURS 0 MINUTES 0 SECONDS0 DAYS 0 HOURS 0 MINUTES 0 SECONDS0 DAYS 0 HOURS 0 MINUTES 0 SECON" + "'", str4, " DAYS 0 HOURS 0 MINUTES 0 SECONDS0 DAYS 0 HOURS 0 MINUTES 0 SECONDS0 DAYS 0 HOURS 0 MINUTES 0 SECON");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test6812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6812");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale locale2 = builder0.build();
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale.Builder builder4 = builder3.clearExtensions();
        java.util.Locale locale5 = builder3.build();
        java.util.Locale.Builder builder6 = builder3.clearExtensions();
        java.util.Locale.Builder builder7 = builder6.clear();
        java.util.Locale.Builder builder8 = builder7.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder10 = builder7.setLanguageTag("Greenwich Zeit");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Invalid subtag: Greenwich Zeit [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test6813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6813");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("aaaaaaaaaaaaaChinese (China)aaaaaaaaaaaaam'm's.s's'Engli0h (Unite0 120tate0)", ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaChinese(China)aaaaaaaaaaaaam'm's.s's'Engli0h(Unite0120tate0)" + "'", str2, "aaaaaaaaaaaaaChinese(China)aaaaaaaaaaaaam'm's.s's'Engli0h(Unite0120tate0)");
    }

    @Test
    public void test6814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6814");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("Koreanisch", (double) 15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=15.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6815");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("0 days 0 hours 0 minutes 0 seco", "uuuuuuuuuuuuuuuuuuuuuuuu0320.00000TD000Y0P");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0 days 0 hours 0 minutes 0 seco" + "'", str2, "0 days 0 hours 0 minutes 0 seco");
    }

    @Test
    public void test6816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6816");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.Locale[] localeArray3 = new java.util.Locale[] {};
        java.util.ArrayList<java.util.Locale> localeList4 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList4, localeArray3);
        java.util.Locale locale6 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.util.Locale>) localeList4);
        java.util.Locale locale7 = java.util.Locale.PRC;
        java.util.Locale locale9 = java.util.Locale.GERMANY;
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.lowerCase("HI!", locale9);
        java.lang.String str11 = locale7.getDisplayVariant(locale9);
        java.util.Locale.Category category12 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale13 = java.util.Locale.getDefault();
        java.util.Locale.setDefault(category12, locale13);
        java.util.Set<java.lang.String> strSet15 = locale13.getUnicodeLocaleKeys();
        java.util.Locale locale16 = java.util.Locale.FRANCE;
        java.util.Set<java.lang.String> strSet17 = locale16.getUnicodeLocaleKeys();
        java.util.Locale locale18 = java.util.Locale.CHINA;
        java.util.Locale locale19 = locale18.stripExtensions();
        java.lang.String str20 = locale18.getDisplayLanguage();
        java.util.Locale locale21 = java.util.Locale.CHINA;
        java.util.Locale locale22 = locale21.stripExtensions();
        java.util.Locale locale23 = java.util.Locale.FRANCE;
        java.util.Locale locale24 = java.util.Locale.TAIWAN;
        java.util.Locale locale25 = java.util.Locale.getDefault();
        java.lang.String str26 = locale25.getDisplayVariant();
        java.util.Locale locale27 = java.util.Locale.CHINA;
        java.util.Locale locale28 = locale27.stripExtensions();
        java.lang.String str29 = locale27.getDisplayLanguage();
        java.util.Locale locale30 = java.util.Locale.FRANCE;
        java.util.Set<java.lang.String> strSet31 = locale30.getUnicodeLocaleKeys();
        java.util.Locale locale32 = java.util.Locale.CHINESE;
        java.lang.String str33 = locale30.getDisplayName(locale32);
        java.lang.String str34 = locale32.getCountry();
        java.util.Locale[] localeArray35 = new java.util.Locale[] { locale9, locale13, locale16, locale18, locale21, locale23, locale24, locale25, locale27, locale32 };
        java.util.ArrayList<java.util.Locale> localeList36 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList36, localeArray35);
        java.util.Locale.FilteringMode filteringMode38 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.util.Locale> localeList39 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.util.Locale>) localeList36, filteringMode38);
        java.util.Locale.LanguageRange[] languageRangeArray40 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList41 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList41, languageRangeArray40);
        java.util.Locale[] localeArray43 = new java.util.Locale[] {};
        java.util.ArrayList<java.util.Locale> localeList44 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList44, localeArray43);
        java.util.Locale locale46 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList41, (java.util.Collection<java.util.Locale>) localeList44);
        java.util.Locale locale47 = java.util.Locale.PRC;
        java.util.Locale locale49 = java.util.Locale.GERMANY;
        java.lang.String str50 = org.apache.commons.lang3.StringUtils.lowerCase("HI!", locale49);
        java.lang.String str51 = locale47.getDisplayVariant(locale49);
        java.util.Locale.Category category52 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale53 = java.util.Locale.getDefault();
        java.util.Locale.setDefault(category52, locale53);
        java.util.Set<java.lang.String> strSet55 = locale53.getUnicodeLocaleKeys();
        java.util.Locale locale56 = java.util.Locale.FRANCE;
        java.util.Set<java.lang.String> strSet57 = locale56.getUnicodeLocaleKeys();
        java.util.Locale locale58 = java.util.Locale.CHINA;
        java.util.Locale locale59 = locale58.stripExtensions();
        java.lang.String str60 = locale58.getDisplayLanguage();
        java.util.Locale locale61 = java.util.Locale.CHINA;
        java.util.Locale locale62 = locale61.stripExtensions();
        java.util.Locale locale63 = java.util.Locale.FRANCE;
        java.util.Locale locale64 = java.util.Locale.TAIWAN;
        java.util.Locale locale65 = java.util.Locale.getDefault();
        java.lang.String str66 = locale65.getDisplayVariant();
        java.util.Locale locale67 = java.util.Locale.CHINA;
        java.util.Locale locale68 = locale67.stripExtensions();
        java.lang.String str69 = locale67.getDisplayLanguage();
        java.util.Locale locale70 = java.util.Locale.FRANCE;
        java.util.Set<java.lang.String> strSet71 = locale70.getUnicodeLocaleKeys();
        java.util.Locale locale72 = java.util.Locale.CHINESE;
        java.lang.String str73 = locale70.getDisplayName(locale72);
        java.lang.String str74 = locale72.getCountry();
        java.util.Locale[] localeArray75 = new java.util.Locale[] { locale49, locale53, locale56, locale58, locale61, locale63, locale64, locale65, locale67, locale72 };
        java.util.ArrayList<java.util.Locale> localeList76 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean77 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList76, localeArray75);
        java.util.Locale.FilteringMode filteringMode78 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.util.Locale> localeList79 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList41, (java.util.Collection<java.util.Locale>) localeList76, filteringMode78);
        java.util.Locale.FilteringMode filteringMode80 = java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES;
        java.util.List<java.util.Locale> localeList81 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.util.Locale>) localeList76, filteringMode80);
        java.lang.String str83 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.util.Locale.LanguageRange>) languageRangeList1, '4');
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap84 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList85 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap84);
        java.lang.Class<?> wildcardClass86 = languageRangeList1.getClass();
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(localeArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(locale6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + category12 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category12.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "");
        org.junit.Assert.assertNotNull(strSet15);
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Chinese" + "'", str20, "Chinese");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Chinese" + "'", str29, "Chinese");
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(strSet31);
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "zh");
// flaky:         org.junit.Assert.assertEquals("'" + str33 + "' != '" + "\u6cd5\u6587\u6cd5\u56fd)" + "'", str33, "\u6cd5\u6587\u6cd5\u56fd)");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(localeArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + filteringMode38 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode38.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(localeList39);
        org.junit.Assert.assertNotNull(languageRangeArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(localeArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNull(locale46);
        org.junit.Assert.assertNotNull(locale47);
        org.junit.Assert.assertEquals(locale47.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale49);
        org.junit.Assert.assertEquals(locale49.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "hi!" + "'", str50, "hi!");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertTrue("'" + category52 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category52.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale53);
        org.junit.Assert.assertEquals(locale53.toString(), "");
        org.junit.Assert.assertNotNull(strSet55);
        org.junit.Assert.assertNotNull(locale56);
        org.junit.Assert.assertEquals(locale56.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(strSet57);
        org.junit.Assert.assertNotNull(locale58);
        org.junit.Assert.assertEquals(locale58.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale59);
        org.junit.Assert.assertEquals(locale59.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "Chinese" + "'", str60, "Chinese");
        org.junit.Assert.assertNotNull(locale61);
        org.junit.Assert.assertEquals(locale61.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale62);
        org.junit.Assert.assertEquals(locale62.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale63);
        org.junit.Assert.assertEquals(locale63.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale64);
        org.junit.Assert.assertEquals(locale64.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale65);
        org.junit.Assert.assertEquals(locale65.toString(), "");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "" + "'", str66, "");
        org.junit.Assert.assertNotNull(locale67);
        org.junit.Assert.assertEquals(locale67.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale68);
        org.junit.Assert.assertEquals(locale68.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "Chinese" + "'", str69, "Chinese");
        org.junit.Assert.assertNotNull(locale70);
        org.junit.Assert.assertEquals(locale70.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(strSet71);
        org.junit.Assert.assertNotNull(locale72);
        org.junit.Assert.assertEquals(locale72.toString(), "zh");
// flaky:         org.junit.Assert.assertEquals("'" + str73 + "' != '" + "\u6cd5\u6587\u6cd5\u56fd)" + "'", str73, "\u6cd5\u6587\u6cd5\u56fd)");
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "" + "'", str74, "");
        org.junit.Assert.assertNotNull(localeArray75);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertTrue("'" + filteringMode78 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode78.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(localeList79);
        org.junit.Assert.assertTrue("'" + filteringMode80 + "' != '" + java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES + "'", filteringMode80.equals(java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(localeList81);
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "" + "'", str83, "");
        org.junit.Assert.assertNotNull(languageRangeList85);
        org.junit.Assert.assertNotNull(wildcardClass86);
    }

    @Test
    public void test6817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6817");
        java.util.TimeZone timeZone9 = java.util.TimeZone.getTimeZone("");
        java.lang.String str10 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(1L, 0L, "\u4e2d\u6587", true, timeZone9);
        timeZone9.setRawOffset((int) (byte) 0);
        java.lang.String str13 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 11, (long) 100, "...chHeure de Gr...", true, timeZone9);
        int int15 = timeZone9.getOffset((long) 'x');
        timeZone9.setRawOffset(224);
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\u4e2d\u6587" + "'", str10, "\u4e2d\u6587");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "...ch0eure 0e Gr..." + "'", str13, "...ch0eure 0e Gr...");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test6818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6818");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "                                                         danac                                                          ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test6819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6819");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay(" uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu!IHuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                                                                                       ", "Chine0euuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", 3, (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Chine0euuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu!IHuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                                                                                       " + "'", str4, "Chine0euuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu!IHuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                                                                                       ");
    }

    @Test
    public void test6820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6820");
        java.util.Locale locale0 = java.util.Locale.ITALY;
        java.util.Locale locale1 = java.util.Locale.FRANCE;
        java.util.Set<java.lang.String> strSet2 = locale1.getUnicodeLocaleKeys();
        java.util.Locale locale3 = java.util.Locale.CHINESE;
        java.lang.String str4 = locale1.getDisplayName(locale3);
        java.lang.String str5 = locale3.getLanguage();
        java.util.Set<java.lang.String> strSet6 = locale3.getUnicodeLocaleAttributes();
        java.util.Locale locale10 = new java.util.Locale("!IH", "P0Y0M0DT0H0M0.034S", "\u6cd5\u6587\u6cd5\u56fd)");
        java.util.Set<java.lang.Character> charSet11 = locale10.getExtensionKeys();
        java.lang.String str12 = locale10.getLanguage();
        java.util.Set<java.lang.String> strSet13 = locale10.getUnicodeLocaleAttributes();
        java.lang.String str14 = locale3.getDisplayScript(locale10);
        java.lang.String str15 = locale10.getISO3Language();
        java.lang.String str16 = locale0.getDisplayCountry(locale10);
        java.lang.String str17 = locale10.getDisplayCountry();
        java.lang.String str18 = locale10.getCountry();
        boolean boolean19 = locale10.hasExtensions();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "zh");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u6cd5\u6587\u6cd5\u56fd)" + "'", str4, "\u6cd5\u6587\u6cd5\u56fd)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "zh" + "'", str5, "zh");
        org.junit.Assert.assertNotNull(strSet6);
// flaky:         org.junit.Assert.assertEquals(locale10.toString(), "\u6cd5\u6587\u6cd5\u56fd)");
        org.junit.Assert.assertNotNull(charSet11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "!ih" + "'", str12, "!ih");
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "!ih" + "'", str15, "!ih");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Italy" + "'", str16, "Italy");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "P0Y0M0DT0H0M0.034S" + "'", str17, "P0Y0M0DT0H0M0.034S");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "P0Y0M0DT0H0M0.034S" + "'", str18, "P0Y0M0DT0H0M0.034S");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test6821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6821");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale locale2 = builder1.build();
        java.util.Locale locale4 = java.util.Locale.forLanguageTag("99.00:00:0");
        java.util.Locale.Builder builder5 = new java.util.Locale.Builder();
        java.util.Locale locale7 = java.util.Locale.CHINA;
        java.util.Locale locale8 = locale7.stripExtensions();
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.lowerCase("99.00:00:0", locale7);
        java.util.Locale.Builder builder10 = builder5.setLocale(locale7);
        java.lang.String str11 = locale4.getDisplayLanguage(locale7);
        java.util.Locale.Builder builder12 = builder1.setLocale(locale7);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder14 = builder1.setScript("\u6cd5\u6587\u6cd5\u56fd)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: !ih_P0Y000DT00000.0340_?? (??) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "99.00:00:0" + "'", str9, "99.00:00:0");
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test6822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6822");
        java.util.Locale locale1 = new java.util.Locale("!ih!ih!...");
        java.util.Set<java.lang.String> strSet2 = locale1.getUnicodeLocaleKeys();
        java.util.Locale locale3 = locale1.stripExtensions();
        org.junit.Assert.assertEquals(locale1.toString(), "!ih!ih!...");
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "!ih!ih!...");
    }

    @Test
    public void test6823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6823");
        char[] charArray10 = new char[] { 'a', ' ', '#', '4', '#', '4' };
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "HI!", charArray10);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "\u683c\u6797\u5a01\u6cbb\u6642\u9593", charArray10);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU0:00:00.097UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU", charArray10);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "P-1Y11M30DT23H59M59.999", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "a #4#4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "a #4#4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[a,  , #, 4, #, 4]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test6824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6824");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "P0Y0M0DT0H0M0.019S");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test6825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6825");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("English", 'u');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test6826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6826");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'");
        boolean boolean2 = timeZone1.observesDaylightTime();
        boolean boolean3 = timeZone1.observesDaylightTime();
        java.lang.Object obj4 = timeZone1.clone();
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null]");
    }

    @Test
    public void test6827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6827");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("en-gb", "china                                          ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "china                                          " + "'", str2, "china                                          ");
    }

    @Test
    public void test6828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6828");
        java.util.Locale locale1 = java.util.Locale.KOREA;
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's", locale1);
        java.util.Locale locale4 = new java.util.Locale("");
        java.util.Locale locale6 = new java.util.Locale("\u4e2d\u6587");
        java.lang.String str7 = locale4.getDisplayScript(locale6);
        java.util.Locale locale9 = java.util.Locale.forLanguageTag("P0Y0M0DT0H0M0.034S");
        java.lang.String str10 = locale6.getDisplayName(locale9);
        java.lang.String str11 = locale6.getDisplayScript();
        java.lang.String str12 = locale1.getDisplayVariant(locale6);
        java.lang.String str13 = locale1.getDisplayScript();
        java.lang.String str14 = locale1.getCountry();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's" + "'", str2, "'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's");
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertEquals(locale6.toString(), "\u4e2d\u6587");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\u4e2d\u6587" + "'", str10, "\u4e2d\u6587");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "KR" + "'", str14, "KR");
    }

    @Test
    public void test6829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6829");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("", "uuuuuuuuuuuuuuuuuuuuuuuuuuuu");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test6830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6830");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("P-1Y11M30DT23H59M59.947S", 52, 335);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test6831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6831");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("                 ng");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ng" + "'", str1, "ng");
    }

    @Test
    public void test6832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6832");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("44P0Y0-10DT07430-10.034359ZH_TW(P0Y0-10DT07430-10.0343599900,0DAYS0HOURS0MINUTES0SECOND)44P0Y0-10DT07430-10.0343599", "44444444444444444444444444444444444444 HI!44444444444444444444444444444444444444 HI!44444444444444444444444444444444444444 HI!4444444444444444444444444444444444440:00:00.12044444444444444444444444444444444444444 HI!44444444444444444444444444444444444444 HI!44444444444444444444444444444444444444 HI!4444444444444444444444444444444444444", (int) '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test6833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6833");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("99.00:00:0");
        java.lang.String str2 = locale1.toLanguageTag();
        java.util.Locale locale4 = java.util.Locale.CHINA;
        java.util.Locale locale5 = locale4.stripExtensions();
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.lowerCase("99.00:00:0", locale4);
        java.lang.String str7 = locale1.getDisplayVariant(locale4);
        java.util.Locale.Category category8 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale9 = java.util.Locale.getDefault();
        java.util.Locale.setDefault(category8, locale9);
        java.util.Set<java.lang.String> strSet11 = locale9.getUnicodeLocaleKeys();
        java.util.Locale locale13 = new java.util.Locale("");
        java.util.Locale locale15 = new java.util.Locale("\u4e2d\u6587");
        java.lang.String str16 = locale13.getDisplayScript(locale15);
        java.util.Locale locale18 = java.util.Locale.forLanguageTag("P0Y0M0DT0H0M0.034S");
        java.lang.String str19 = locale15.getDisplayName(locale18);
        java.lang.String str20 = locale9.getDisplayScript(locale15);
        java.util.Locale locale23 = new java.util.Locale("0:00:00.000", "zh_TW");
        java.util.Locale.Builder builder24 = new java.util.Locale.Builder();
        java.util.Locale locale25 = builder24.build();
        java.util.Locale.setDefault(locale25);
        java.util.Locale locale27 = java.util.Locale.CHINA;
        java.util.Locale locale28 = java.util.Locale.PRC;
        java.lang.String str29 = locale27.getDisplayLanguage(locale28);
        java.lang.String str30 = locale25.getDisplayLanguage(locale28);
        java.lang.String str31 = locale23.getDisplayVariant(locale28);
        java.lang.String str32 = locale15.getDisplayVariant(locale28);
        java.util.Locale locale34 = java.util.Locale.GERMANY;
        java.lang.String str35 = org.apache.commons.lang3.StringUtils.lowerCase("HI!", locale34);
        java.lang.String str36 = locale28.getDisplayName(locale34);
        java.lang.String str37 = locale1.getDisplayCountry(locale28);
        java.util.Locale locale39 = new java.util.Locale("P0Y0M0DT0H0M0.000S444444");
        java.lang.String str40 = locale1.getDisplayLanguage(locale39);
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "und" + "'", str2, "und");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "99.00:00:0" + "'", str6, "99.00:00:0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + category8 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category8.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "");
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertEquals(locale13.toString(), "");
        org.junit.Assert.assertEquals(locale15.toString(), "\u4e2d\u6587");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\u4e2d\u6587" + "'", str19, "\u4e2d\u6587");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals(locale23.toString(), "0:00:00.000_ZH_TW");
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "");
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "\u4e2d\u6587" + "'", str29, "\u4e2d\u6587");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Chinesisch (China)" + "'", str36, "Chinesisch (China)");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals(locale39.toString(), "p0y0m0dt0h0m0.000s444444");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
    }

    @Test
    public void test6834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6834");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("_0 DAYS 0 HOURS 0 MINUTES 0 SECONDS", '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_0 DAYS 0 HOURS 0 MINUTES 0 SECONDS" + "'", str2, "_0 DAYS 0 HOURS 0 MINUTES 0 SECONDS");
    }

    @Test
    public void test6835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6835");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("\u6cd5\u6587\u6cd5\u56fd)xxx");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=xx000.0340_??t(??)xxx");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6836");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("danaC", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaazh_TWaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test6837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6837");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfBlank("p-1Y11M30DT23H59M59.975S", "...c0Hur..Gr...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "p-1Y11M30DT23H59M59.975S" + "'", str2, "p-1Y11M30DT23H59M59.975S");
    }

    @Test
    public void test6838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6838");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfBlank((java.lang.CharSequence) "0 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a00", (java.lang.CharSequence) "Unite30 887tate86399");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "0 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a00" + "'", charSequence2, "0 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a00");
    }

    @Test
    public void test6839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6839");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.setDefault(locale1);
        java.util.Locale locale3 = java.util.Locale.CHINA;
        java.util.Locale locale4 = java.util.Locale.PRC;
        java.lang.String str5 = locale3.getDisplayLanguage(locale4);
        java.lang.String str6 = locale1.getDisplayLanguage(locale4);
        java.lang.String str7 = locale4.getISO3Language();
        java.util.Locale.setDefault(locale4);
        java.util.Locale locale9 = java.util.Locale.PRC;
        java.lang.String str10 = locale9.getDisplayName();
        java.util.Set<java.lang.Character> charSet11 = locale9.getExtensionKeys();
        java.lang.String str12 = locale4.getDisplayLanguage(locale9);
        java.util.Locale.Builder builder13 = new java.util.Locale.Builder();
        java.util.Locale locale14 = builder13.build();
        java.util.Locale locale15 = builder13.build();
        java.util.Locale.Builder builder16 = builder13.clear();
        java.util.Locale.Builder builder17 = builder16.clearExtensions();
        java.util.Locale locale18 = builder16.build();
        java.util.Locale.Builder builder19 = builder16.clearExtensions();
        java.util.Locale.Builder builder20 = builder19.clear();
        java.util.Locale locale21 = java.util.Locale.CHINA;
        java.lang.String str22 = locale21.getDisplayVariant();
        java.lang.String str23 = locale21.getVariant();
        java.util.Locale.Builder builder24 = builder19.setLocale(locale21);
        java.util.Locale locale25 = builder24.build();
        java.lang.String str26 = locale4.getDisplayLanguage(locale25);
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\u4e2d\u6587" + "'", str5, "\u4e2d\u6587");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "zho" + "'", str7, "zho");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "zh_CN");
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\u4e2d\u6587\u4e2d\u56fd)" + "'", str10, "\u4e2d\u6587\u4e2d\u56fd)");
        org.junit.Assert.assertNotNull(charSet11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\u4e2d\u6587" + "'", str12, "\u4e2d\u6587");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "");
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "");
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "\u4e2d\u6587" + "'", str26, "\u4e2d\u6587");
    }

    @Test
    public void test6840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6840");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "fran\347ais (France)44444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test6841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6841");
        java.util.TimeZone timeZone5 = java.util.TimeZone.getTimeZone("!ih!ih!...testestestestestestestestestestestestestestestestestestestestest'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'");
        int int6 = timeZone5.getRawOffset();
        java.lang.String str7 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(0L, 0L, "P0Y0M0DT0H0M0.023S", false, timeZone5);
        int int9 = timeZone5.getOffset((long) 120);
        java.lang.String str10 = timeZone5.getID();
        int int11 = timeZone5.getDSTSavings();
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "\u683c\u6797\u5a01\u6cbb\u65f6\u95f4");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "P0Y000DT00000.0230" + "'", str7, "P0Y000DT00000.0230");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "GMT" + "'", str10, "GMT");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test6842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6842");
        java.util.Locale.Category category0 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale1 = java.util.Locale.getDefault();
        java.util.Locale.setDefault(category0, locale1);
        java.util.Locale.Builder builder3 = new java.util.Locale.Builder();
        java.util.Locale locale4 = builder3.build();
        java.util.Locale.setDefault(locale4);
        java.util.Locale locale6 = java.util.Locale.CHINA;
        java.util.Locale locale7 = java.util.Locale.PRC;
        java.lang.String str8 = locale6.getDisplayLanguage(locale7);
        java.lang.String str9 = locale4.getDisplayLanguage(locale7);
        java.lang.String str10 = locale7.getISO3Language();
        java.util.Locale.setDefault(locale7);
        java.lang.String str12 = locale7.getCountry();
        java.util.Locale.setDefault(category0, locale7);
        java.util.Locale locale15 = java.util.Locale.CHINA;
        java.util.Locale locale16 = java.util.Locale.PRC;
        java.lang.String str17 = locale15.getDisplayLanguage(locale16);
        java.lang.String str18 = locale15.getDisplayScript();
        java.util.Set<java.lang.Character> charSet19 = locale15.getExtensionKeys();
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.lowerCase("                                      hi!                                                 ", locale15);
        java.util.Locale.setDefault(category0, locale15);
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\u4e2d\u6587" + "'", str8, "\u4e2d\u6587");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "zho" + "'", str10, "zho");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "CN" + "'", str12, "CN");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\u4e2d\u6587" + "'", str17, "\u4e2d\u6587");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(charSet19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "                                      hi!                                                 " + "'", str20, "                                      hi!                                                 ");
    }

    @Test
    public void test6843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6843");
        java.util.TimeZone timeZone9 = java.util.TimeZone.getTimeZone("");
        java.lang.String str10 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(1L, 0L, "\u4e2d\u6587", true, timeZone9);
        timeZone9.setRawOffset((int) (byte) 0);
        java.lang.String str13 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 11, (long) 100, "...chHeure de Gr...", true, timeZone9);
        int int15 = timeZone9.getOffset((long) 'x');
        boolean boolean16 = timeZone9.observesDaylightTime();
        java.util.Locale locale22 = new java.util.Locale("!ih!ih!...", "                                                P0Y0M0DT0H0M0.090ShiP0Y0M0DT0H0M0.090S!P0Y0M0DT0H0M0.090S                                                 ", "de");
        java.util.Set<java.lang.Character> charSet23 = locale22.getExtensionKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str24 = timeZone9.getDisplayName(false, 318, locale22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal style: 318");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "\u683c\u6797\u5a01\u6cbb\u65f6\u95f4");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\u4e2d\u6587" + "'", str10, "\u4e2d\u6587");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "...ch0eure 0e Gr..." + "'", str13, "...ch0eure 0e Gr...");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals(locale22.toString(), "!ih!ih!..._                                                P0Y0M0DT0H0M0.090SHIP0Y0M0DT0H0M0.090S!P0Y0M0DT0H0M0.090S                                                 _de");
        org.junit.Assert.assertNotNull(charSet23);
    }

    @Test
    public void test6844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6844");
        java.lang.CharSequence charSequence1 = null;
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "fr", charSequence1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test6845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6845");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "0e_zh_tw (p0y0-10aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y0M0DT0H0M0.034Saaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaanute04 0 econd)");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0e_zh_tw (p0y0-10aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y0M0DT0H0M0.034Saaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaanute04 0 econd)" + "'", str1, "0e_zh_tw (p0y0-10aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y0M0DT0H0M0.034Saaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaanute04 0 econd)");
    }

    @Test
    public void test6846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6846");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "                                                                                                 !i0", "0:00:00.120");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test6847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6847");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("                                                                                     0:00:00.000", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                     0:00:00.000" + "'", str2, "                                                                                     0:00:00.000");
    }

    @Test
    public void test6848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6848");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("OUhS 0 MI", '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "OUhS 0 MI" + "'", str2, "OUhS 0 MI");
    }

    @Test
    public void test6849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6849");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("P0Y0M0DT0H0M0.097S", 49);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.097S" + "'", str2, "P0Y0M0DT0H0M0.097S");
    }

    @Test
    public void test6850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6850");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("de", (double) 104);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=104.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6851");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("0 days", "gb", 318);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test6852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6852");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        java.lang.String str1 = locale0.getDisplayVariant();
        java.lang.String str2 = locale0.getISO3Language();
        java.lang.String str3 = locale0.getISO3Country();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "zho" + "'", str2, "zho");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CHN" + "'", str3, "CHN");
    }

    @Test
    public void test6853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6853");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("\uc77c\ubcf8\uc5b4", "               zh               ");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "Hi!", (-1), (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test6854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6854");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("P-1Y11M30DT23H59M59.999", 10, 93);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "T23H59M59.999" + "'", str3, "T23H59M59.999");
    }

    @Test
    public void test6855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6855");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale2 = java.util.Locale.CHINA;
        java.util.Locale locale3 = locale2.stripExtensions();
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.lowerCase("99.00:00:0", locale2);
        java.util.Locale.Builder builder5 = builder0.setLocale(locale2);
        java.util.Locale.Builder builder7 = builder0.setLanguage("");
        java.util.Locale.Builder builder9 = builder7.setLanguage("");
        java.util.Locale.Builder builder10 = builder9.clearExtensions();
        java.util.Locale.Category category11 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale12 = java.util.Locale.UK;
        java.util.Locale.setDefault(category11, locale12);
        java.lang.String str14 = locale12.getVariant();
        java.util.Set<java.lang.String> strSet15 = locale12.getUnicodeLocaleAttributes();
        java.util.Locale.Builder builder16 = builder10.setLocale(locale12);
        java.util.Locale locale18 = new java.util.Locale("");
        java.util.Locale locale20 = new java.util.Locale("\u4e2d\u6587");
        java.lang.String str21 = locale18.getDisplayScript(locale20);
        java.util.Locale locale23 = java.util.Locale.forLanguageTag("P0Y0M0DT0H0M0.034S");
        java.lang.String str24 = locale20.getDisplayName(locale23);
        java.util.Locale.Builder builder25 = new java.util.Locale.Builder();
        java.util.Locale locale26 = builder25.build();
        java.util.Locale.setDefault(locale26);
        java.util.Locale locale28 = java.util.Locale.CHINA;
        java.util.Locale locale29 = java.util.Locale.PRC;
        java.lang.String str30 = locale28.getDisplayLanguage(locale29);
        java.lang.String str31 = locale26.getDisplayLanguage(locale29);
        java.lang.String str32 = locale29.getISO3Language();
        java.util.Locale.setDefault(locale29);
        java.lang.String str34 = locale20.getDisplayName(locale29);
        java.util.Locale.Builder builder35 = builder10.setLocale(locale29);
        java.util.Locale.Category category36 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale37 = java.util.Locale.CANADA;
        java.util.Locale.setDefault(category36, locale37);
        java.lang.String str39 = locale37.getLanguage();
        java.util.Locale.setDefault(locale37);
        java.util.Locale.Category category41 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale42 = java.util.Locale.getDefault();
        java.util.Locale.setDefault(category41, locale42);
        java.util.Locale locale44 = java.util.Locale.KOREA;
        java.util.Locale.setDefault(category41, locale44);
        java.util.Locale locale47 = java.util.Locale.CHINA;
        java.util.Locale locale48 = locale47.stripExtensions();
        java.lang.String str49 = org.apache.commons.lang3.StringUtils.lowerCase("99.00:00:0", locale47);
        java.util.Locale.setDefault(category41, locale47);
        java.lang.String str51 = locale37.getDisplayScript(locale47);
        java.util.Locale.Builder builder52 = builder35.setLocale(locale47);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder54 = builder52.addUnicodeLocaleAttribute("4P404Y4040404DT40404040404.40904313hi4P404Y4040404DT40404040404.409043134!4P404Y4040404DT40404040404.409043134");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: 4P404Y4040404DT40404040404.40904313hi4P404Y4040404DT40404040404.409043134!4P404Y4040404DT40404040404.409043134 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "99.00:00:0" + "'", str4, "99.00:00:0");
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertTrue("'" + category11 + "' != '" + java.util.Locale.Category.FORMAT + "'", category11.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(strSet15);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertEquals(locale18.toString(), "");
        org.junit.Assert.assertEquals(locale20.toString(), "\u4e2d\u6587");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "\u4e2d\u6587" + "'", str24, "\u4e2d\u6587");
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "");
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "\u4e2d\u6587" + "'", str30, "\u4e2d\u6587");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "zho" + "'", str32, "zho");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "\u4e2d\u6587" + "'", str34, "\u4e2d\u6587");
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertTrue("'" + category36 + "' != '" + java.util.Locale.Category.FORMAT + "'", category36.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale37);
        org.junit.Assert.assertEquals(locale37.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "en" + "'", str39, "en");
        org.junit.Assert.assertTrue("'" + category41 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category41.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale42);
        org.junit.Assert.assertEquals(locale42.toString(), "en_CA");
        org.junit.Assert.assertNotNull(locale44);
        org.junit.Assert.assertEquals(locale44.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale47);
        org.junit.Assert.assertEquals(locale47.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale48);
        org.junit.Assert.assertEquals(locale48.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "99.00:00:0" + "'", str49, "99.00:00:0");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertNotNull(builder52);
    }

    @Test
    public void test6856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6856");
        java.util.TimeZone timeZone9 = java.util.TimeZone.getTimeZone("!ih!ih!...testestestestestestestestestestestestestestestestestestestestest'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'");
        int int10 = timeZone9.getRawOffset();
        java.lang.String str11 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(0L, 0L, "P0Y0M0DT0H0M0.023S", false, timeZone9);
        java.lang.String str12 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) '4', (long) 'x', "CAN", true, timeZone9);
        int int13 = timeZone9.getRawOffset();
        int int14 = timeZone9.getRawOffset();
        boolean boolean15 = timeZone9.observesDaylightTime();
        int int17 = timeZone9.getOffset(100L);
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "\u683c\u6797\u5a01\u6cbb\u65f6\u95f4");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "P0Y000DT00000.0230" + "'", str11, "P0Y000DT00000.0230");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "CAN" + "'", str12, "CAN");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test6857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6857");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                                                                    ", '#');
        int int5 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("0 seconds", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray4);
        int int8 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray4);
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAny("                zh", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "                                                                                                    " + "'", str6, "                                                                                                    ");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "                                                                                                    " + "'", str7, "                                                                                                    ");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test6858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6858");
        java.util.Locale.Category category0 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale1 = java.util.Locale.FRANCE;
        java.util.Locale.setDefault(category0, locale1);
        java.util.Locale locale3 = java.util.Locale.getDefault(category0);
        java.util.Locale locale4 = java.util.Locale.getDefault(category0);
        java.util.Locale locale5 = java.util.Locale.getDefault(category0);
        java.lang.String str6 = locale5.getLanguage();
        java.util.Set<java.lang.String> strSet7 = locale5.getUnicodeLocaleAttributes();
        java.util.Locale.Category category9 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale10 = java.util.Locale.CANADA;
        java.util.Locale.setDefault(category9, locale10);
        java.lang.String str12 = locale10.getLanguage();
        java.lang.String str13 = locale10.getISO3Language();
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.lowerCase("de_DEde_DEde_DEdeng", locale10);
        java.util.Locale locale17 = new java.util.Locale("", "0 days 0 hours 0 minutes 0 seconds");
        java.lang.String str18 = locale10.getDisplayName(locale17);
        java.lang.String str19 = locale5.getDisplayLanguage(locale17);
        java.util.Locale locale20 = java.util.Locale.FRANCE;
        java.util.Set<java.lang.String> strSet21 = locale20.getUnicodeLocaleKeys();
        java.lang.String str22 = locale20.getScript();
        java.lang.String str23 = locale20.getDisplayScript();
        java.lang.String str24 = locale17.getDisplayCountry(locale20);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str26 = locale17.getExtension(' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed extension key:  ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "fr" + "'", str6, "fr");
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertTrue("'" + category9 + "' != '" + java.util.Locale.Category.FORMAT + "'", category9.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "en" + "'", str12, "en");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "eng" + "'", str13, "eng");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "de_dede_dede_dedeng" + "'", str14, "de_dede_dede_dedeng");
        org.junit.Assert.assertEquals(locale17.toString(), "_0 DAYS 0 HOURS 0 MINUTES 0 SECONDS");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "English (Canada)" + "'", str18, "English (Canada)");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "French" + "'", str19, "French");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(strSet21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "0 DAYS 0 HOURS 0 MINUTES 0 SECONDS" + "'", str24, "0 DAYS 0 HOURS 0 MINUTES 0 SECONDS");
    }

    @Test
    public void test6859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6859");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("0:00:00.00", "P0Y0M0DT0H0M0.013S");
        boolean boolean4 = org.apache.commons.lang3.StringUtils.startsWithAny("UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU0:00:00.097UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6860");
        java.util.Locale locale1 = java.util.Locale.CHINA;
        java.util.Locale locale2 = locale1.stripExtensions();
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.lowerCase("99.00:00:0", locale1);
        boolean boolean4 = locale1.hasExtensions();
        java.util.Set<java.lang.String> strSet5 = locale1.getUnicodeLocaleKeys();
        java.util.Locale.Category category6 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale7 = java.util.Locale.UK;
        java.util.Locale.setDefault(category6, locale7);
        java.lang.String str9 = locale7.getVariant();
        java.lang.String str10 = locale7.toLanguageTag();
        java.util.Set<java.lang.Character> charSet11 = locale7.getExtensionKeys();
        java.lang.String str12 = locale1.getDisplayCountry(locale7);
        java.lang.String str13 = locale1.getDisplayVariant();
        java.lang.String str14 = locale1.toString();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "99.00:00:0" + "'", str3, "99.00:00:0");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertTrue("'" + category6 + "' != '" + java.util.Locale.Category.FORMAT + "'", category6.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "en-GB" + "'", str10, "en-GB");
        org.junit.Assert.assertNotNull(charSet11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "China" + "'", str12, "China");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "zh_CN" + "'", str14, "zh_CN");
    }

    @Test
    public void test6861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6861");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("");
        int int2 = timeZone1.getRawOffset();
        java.lang.String str3 = timeZone1.getID();
        java.time.ZoneId zoneId4 = timeZone1.toZoneId();
        java.util.TimeZone timeZone5 = java.util.TimeZone.getTimeZone(zoneId4);
        java.lang.String str6 = timeZone5.getDisplayName();
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Heure de Greenwich");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "GMT" + "'", str3, "GMT");
        org.junit.Assert.assertNotNull(zoneId4);
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "Heure de Greenwich");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Heure de Greenwich" + "'", str6, "Heure de Greenwich");
    }

    @Test
    public void test6862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6862");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone6 = java.util.TimeZone.getTimeZone("");
        java.lang.String str7 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(1L, 0L, "\u4e2d\u6587", true, timeZone6);
        boolean boolean8 = timeZone6.observesDaylightTime();
        java.util.TimeZone timeZone14 = java.util.TimeZone.getTimeZone("");
        java.lang.String str15 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(1L, 0L, "\u4e2d\u6587", true, timeZone14);
        boolean boolean16 = timeZone6.hasSameRules(timeZone14);
        boolean boolean17 = timeZone0.hasSameRules(timeZone6);
        boolean boolean18 = timeZone6.observesDaylightTime();
        java.time.ZoneId zoneId19 = timeZone6.toZoneId();
        java.util.TimeZone timeZone20 = java.util.TimeZone.getTimeZone(zoneId19);
        java.util.TimeZone timeZone21 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone27 = java.util.TimeZone.getTimeZone("");
        java.lang.String str28 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(1L, 0L, "\u4e2d\u6587", true, timeZone27);
        boolean boolean29 = timeZone27.observesDaylightTime();
        java.util.TimeZone timeZone35 = java.util.TimeZone.getTimeZone("");
        java.lang.String str36 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(1L, 0L, "\u4e2d\u6587", true, timeZone35);
        boolean boolean37 = timeZone27.hasSameRules(timeZone35);
        boolean boolean38 = timeZone21.hasSameRules(timeZone27);
        boolean boolean39 = timeZone27.observesDaylightTime();
        java.time.ZoneId zoneId40 = timeZone27.toZoneId();
        int int41 = timeZone27.getRawOffset();
        boolean boolean42 = timeZone20.hasSameRules(timeZone27);
        int int44 = timeZone20.getOffset((long) 31);
        boolean boolean45 = timeZone20.observesDaylightTime();
        java.lang.String str46 = timeZone20.getDisplayName();
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "Heure de Greenwich");
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "Heure de Greenwich");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\u4e2d\u6587" + "'", str7, "\u4e2d\u6587");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(timeZone14);
        org.junit.Assert.assertEquals(timeZone14.getDisplayName(), "Heure de Greenwich");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\u4e2d\u6587" + "'", str15, "\u4e2d\u6587");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(zoneId19);
        org.junit.Assert.assertNotNull(timeZone20);
        org.junit.Assert.assertEquals(timeZone20.getDisplayName(), "Heure de Greenwich");
        org.junit.Assert.assertNotNull(timeZone21);
        org.junit.Assert.assertEquals(timeZone21.getDisplayName(), "Heure de Greenwich");
        org.junit.Assert.assertNotNull(timeZone27);
        org.junit.Assert.assertEquals(timeZone27.getDisplayName(), "Heure de Greenwich");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "\u4e2d\u6587" + "'", str28, "\u4e2d\u6587");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(timeZone35);
        org.junit.Assert.assertEquals(timeZone35.getDisplayName(), "Heure de Greenwich");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "\u4e2d\u6587" + "'", str36, "\u4e2d\u6587");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(zoneId40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "Heure de Greenwich" + "'", str46, "Heure de Greenwich");
    }

    @Test
    public void test6863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6863");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("hi!", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y0M0DT0H0M0.034Saaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.concatWith("German (Germany)", (java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test6864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6864");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("English (United States)", "stestestestestestestestestestestestestestestestest'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test6865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6865");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "P0Y0M0DT0H0M0.041S", (java.lang.CharSequence) "4P404Y4040404DT40404040404.40904313hi4P404Y4040404DT40404040404.409043134!4P404Y4040404DT40404040404.409043134");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "P0Y0M0DT0H0M0.041S" + "'", charSequence2, "P0Y0M0DT0H0M0.041S");
    }

    @Test
    public void test6866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6866");
        java.util.Locale locale1 = new java.util.Locale("'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S");
        java.lang.String str3 = locale1.getExtension('a');
        java.lang.String str4 = locale1.getVariant();
        org.junit.Assert.assertEquals(locale1.toString(), "'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test6867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6867");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "\uad6d\uc911\uc5b4\uad6d\uc911");
// flaky:         org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test6868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6868");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuhi!#######", (java.lang.CharSequence) "zh_twt00t00t00t00t0");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test6869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6869");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "...ch0eure0eGr...uuuuuuuuuuuuuzh_CN...ch0eure0eGr...uuuuuuuuuuuuuzh_CN...ch0eure0eGr...uuuuuuuuuuuuu");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test6870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6870");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "UN00UNUN_0_0 DAYS 0 HOURS 0 MINUTES 0 SECONDS_0 DAYS 0 HOURS 0 MINUTES 0 SECONDS_0 DAYS 0P0Y0M0DT0H0M0.020S");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test6871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6871");
        java.util.Locale.Category category0 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale1 = java.util.Locale.getDefault();
        java.util.Locale.setDefault(category0, locale1);
        java.util.Locale locale3 = java.util.Locale.KOREA;
        java.util.Locale.setDefault(category0, locale3);
        java.util.Locale locale6 = java.util.Locale.CHINA;
        java.util.Locale locale7 = locale6.stripExtensions();
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.lowerCase("99.00:00:0", locale6);
        java.util.Locale.setDefault(category0, locale6);
        java.util.Locale locale10 = java.util.Locale.getDefault(category0);
        java.lang.String str11 = locale10.getScript();
        java.util.Locale locale14 = new java.util.Locale("", "0 days 0 hours 0 minutes 0 seconds");
        java.util.Locale locale15 = java.util.Locale.CHINESE;
        java.lang.String str16 = locale14.getDisplayName(locale15);
        java.lang.String str17 = locale15.toLanguageTag();
        java.util.Locale locale18 = java.util.Locale.GERMANY;
        java.lang.String str19 = locale15.getDisplayLanguage(locale18);
        java.lang.String str20 = locale10.getDisplayLanguage(locale15);
        java.util.Locale.Category category21 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale22 = java.util.Locale.FRANCE;
        java.util.Locale.setDefault(category21, locale22);
        java.lang.String str24 = locale22.getScript();
        java.util.Locale locale25 = locale22.stripExtensions();
        java.lang.String str26 = locale10.getDisplayVariant(locale25);
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en_CA");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "99.00:00:0" + "'", str8, "99.00:00:0");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals(locale14.toString(), "_0 DAYS 0 HOURS 0 MINUTES 0 SECONDS");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "0 DAYS 0 HOURS 0 MINUTES 0 SECONDS" + "'", str16, "0 DAYS 0 HOURS 0 MINUTES 0 SECONDS");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "zh" + "'", str17, "zh");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Chinesisch" + "'", str19, "Chinesisch");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "\u4e2d\u6587" + "'", str20, "\u4e2d\u6587");
        org.junit.Assert.assertTrue("'" + category21 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category21.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
    }

    @Test
    public void test6872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6872");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale locale2 = builder0.build();
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale.Builder builder4 = builder3.clearExtensions();
        java.util.Locale locale5 = builder3.build();
        java.util.Locale locale6 = builder3.build();
        java.util.Locale.Builder builder7 = builder3.clear();
        java.util.Locale.Builder builder8 = builder7.clear();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "");
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test6873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6873");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("s020.0M00TD0M0Y0P", (int) '#', 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaas020.0M00TD0M0Y0P" + "'", str3, "aaaaaaaaaaaaaaaaaas020.0M00TD0M0Y0P");
    }

    @Test
    public void test6874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6874");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("aa ab ae af a...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aa ab ae af a..." + "'", str1, "aa ab ae af a...");
    }

    @Test
    public void test6875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6875");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("P-1Y11M30DT23H59M59.998S", "de_zh_tw (P0Y0-10DT07430-10.0343599900,0 DAYS 0 HOURS 0 MINUTES 0 SECOND", (int) (byte) 1, 120);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Pde_zh_tw (P0Y0-10DT07430-10.0343599900,0 DAYS 0 HOURS 0 MINUTES 0 SECOND" + "'", str4, "Pde_zh_tw (P0Y0-10DT07430-10.0343599900,0 DAYS 0 HOURS 0 MINUTES 0 SECOND");
    }

    @Test
    public void test6876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6876");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("P0Y0M0DT0H0M0.034S", 101);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test6877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6877");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444ZH_TW", "'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test6878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6878");
        java.lang.String str1 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationHMS((long) 153);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0:00:00.153" + "'", str1, "0:00:00.153");
    }

    @Test
    public void test6879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6879");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("P0Y0M0DT0H0M0.051S");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "S150.0M0H0TD0M0Y0P" + "'", str1, "S150.0M0H0TD0M0Y0P");
    }

    @Test
    public void test6880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6880");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("P00-1Y11M30DT23H59M59.991S", 120);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P00-1Y11M30DT23H59M59.991S                                                                                              " + "'", str2, "P00-1Y11M30DT23H59M59.991S                                                                                              ");
    }

    @Test
    public void test6881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6881");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        java.lang.String str1 = locale0.getDisplayVariant();
        java.lang.String str2 = locale0.getVariant();
        java.lang.String str3 = locale0.getDisplayCountry();
        java.util.Locale.Builder builder5 = new java.util.Locale.Builder();
        java.util.Locale locale7 = java.util.Locale.CHINA;
        java.util.Locale locale8 = locale7.stripExtensions();
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.lowerCase("99.00:00:0", locale7);
        java.util.Locale.Builder builder10 = builder5.setLocale(locale7);
        java.util.Locale.Builder builder12 = builder10.setLanguage("und");
        java.util.Locale.Builder builder13 = builder10.clear();
        java.util.Locale.Builder builder15 = builder10.setLanguage("France");
        java.util.Locale locale16 = builder10.build();
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.lowerCase("...", locale16);
        java.lang.String str18 = locale0.getDisplayName(locale16);
        java.util.Locale locale21 = new java.util.Locale("", "0 days 0 hours 0 minutes 0 seconds");
        java.util.Locale locale22 = java.util.Locale.CHINESE;
        java.lang.String str23 = locale21.getDisplayName(locale22);
        java.lang.String str24 = locale22.toLanguageTag();
        java.lang.String str25 = locale22.getCountry();
        java.lang.String str26 = locale16.getDisplayLanguage(locale22);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Chine" + "'", str3, "Chine");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "99.00:00:0" + "'", str9, "99.00:00:0");
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "france");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "..." + "'", str17, "...");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Chinese (China)" + "'", str18, "Chinese (China)");
        org.junit.Assert.assertEquals(locale21.toString(), "_0 DAYS 0 HOURS 0 MINUTES 0 SECONDS");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "0 DAYS 0 HOURS 0 MINUTES 0 SECONDS" + "'", str23, "0 DAYS 0 HOURS 0 MINUTES 0 SECONDS");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "zh" + "'", str24, "zh");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "france" + "'", str26, "france");
    }

    @Test
    public void test6882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6882");
        java.util.Locale locale1 = new java.util.Locale("");
        java.lang.String str2 = locale1.getDisplayScript();
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test6883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6883");
        java.util.TimeZone timeZone5 = java.util.TimeZone.getTimeZone("");
        int int6 = timeZone5.getRawOffset();
        java.lang.String str7 = timeZone5.getID();
        java.lang.String str8 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(100L, (long) (byte) -1, "I!Chinesisch (China)I!Chinesisch (China)I!Chinesisch (China)I!Chinesisch (China)I!Chinesisch (China)I!Chinesisch (China)I!Chinesisch (China)I!Chinesisch (China)I!Chinesisch (China)I!", false, timeZone5);
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "Heure de Greenwich");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "GMT" + "'", str7, "GMT");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "I!Chine2159999ich (China)I!Chineich (China)I!Chineich (China)I!Chineich (China)I!Chineich (China)I!Chineich (China)I!Chineich (China)I!Chineich (China)I!Chineich (China)I!" + "'", str8, "I!Chine2159999ich (China)I!Chineich (China)I!Chineich (China)I!Chineich (China)I!Chineich (China)I!Chineich (China)I!Chineich (China)I!Chineich (China)I!Chineich (China)I!");
    }

    @Test
    public void test6884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6884");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("44P0Y0-10DT07430-10.034359ZH_TW(P0Y0-10DT07430-10.0343599900,0DAYS0HOURS0MINUTES0SECOND)44P0Y0-10DT07430-10.0343599", 83);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test6885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6885");
        java.util.Locale locale1 = new java.util.Locale("");
        java.util.Locale locale3 = new java.util.Locale("\u4e2d\u6587");
        java.lang.String str4 = locale1.getDisplayScript(locale3);
        java.util.Locale locale6 = java.util.Locale.forLanguageTag("P0Y0M0DT0H0M0.034S");
        java.lang.String str7 = locale3.getDisplayName(locale6);
        java.lang.String str8 = locale6.getDisplayCountry();
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertEquals(locale3.toString(), "\u4e2d\u6587");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\u4e2d\u6587" + "'", str7, "\u4e2d\u6587");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test6886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6886");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("                                                                                                      P0Y0-10DT07430-10", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test6887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6887");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("chinesisch                                                                                          ", "P0Y0M0DT0H0M0.113S");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "chinesisch                                                                                          " + "'", str2, "chinesisch                                                                                          ");
    }

    @Test
    public void test6888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6888");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("Heure de Greenwich", "P0Y0M0DT0H0M0.041S", 100);
        int int5 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu!IHuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test6889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6889");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.util.Set<java.lang.String> strSet1 = locale0.getUnicodeLocaleKeys();
        java.util.Locale locale2 = java.util.Locale.CHINESE;
        java.lang.String str3 = locale0.getDisplayName(locale2);
        java.lang.String str4 = locale2.getISO3Country();
        java.lang.String str5 = locale2.getVariant();
        boolean boolean6 = locale2.hasExtensions();
        java.util.Set<java.lang.String> strSet7 = locale2.getUnicodeLocaleAttributes();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u6cd5\u6587\u6cd5\u56fd)" + "'", str3, "\u6cd5\u6587\u6cd5\u56fd)");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strSet7);
    }

    @Test
    public void test6890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6890");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "anglai0 (Ro1au0e-Uni)");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test6891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6891");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("'m'...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "'m'..." + "'", str1, "'m'...");
    }

    @Test
    public void test6892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6892");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("United Kingdom", 32, "chine0e");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chine0echUnited Kingdomchine0ech" + "'", str3, "chine0echUnited Kingdomchine0ech");
    }

    @Test
    public void test6893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6893");
        java.util.Locale locale3 = new java.util.Locale("zh_TW", "P0Y0-10DT07430-10.0343599900", "0 DAYS 0 HOURS 0 MINUTES 0 SECOND");
        java.lang.String str4 = locale3.getDisplayName();
        java.util.Locale locale5 = locale3.stripExtensions();
        java.util.Locale locale9 = new java.util.Locale("0:00:00.335", "44444444444444444444444444444", "Chinesisch (China)");
        java.lang.String str10 = locale5.getDisplayCountry(locale9);
        org.junit.Assert.assertEquals(locale3.toString(), "zh_tw_P0Y0-10DT07430-10.0343599900_0 DAYS 0 HOURS 0 MINUTES 0 SECOND");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "zh_tw (P0Y0-10DT07430-10.0343599900,0 DAYS 0 HOURS 0 MINUTES 0 SECOND)" + "'", str4, "zh_tw (P0Y0-10DT07430-10.0343599900,0 DAYS 0 HOURS 0 MINUTES 0 SECOND)");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "zh_tw_P0Y0-10DT07430-10.0343599900_0 DAYS 0 HOURS 0 MINUTES 0 SECOND");
        org.junit.Assert.assertEquals(locale9.toString(), "0:00:00.335_44444444444444444444444444444_Chinesisch (China)");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "P0Y0-10DT07430-10.0343599900" + "'", str10, "P0Y0-10DT07430-10.0343599900");
    }

    @Test
    public void test6894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6894");
        java.util.Locale locale2 = new java.util.Locale("uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu0:00:00.097uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", "EN-GB");
        java.lang.String str3 = locale2.toLanguageTag();
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("0:00:00.99", "0 seconds", 1);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray7, "P00-1Y11M30DT23H59M59.991S");
        java.lang.String[] strArray11 = org.apache.commons.lang3.StringUtils.stripAll(strArray7, "0I!                                                                                              ");
        java.lang.String[] strArray13 = org.apache.commons.lang3.StringUtils.stripAll(strArray7, "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu0:00:00.097uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
        boolean boolean14 = locale2.equals((java.lang.Object) "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu0:00:00.097uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
        org.junit.Assert.assertEquals(locale2.toString(), "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu0:00:00.097uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu_EN-GB");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "und" + "'", str3, "und");
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0:00:00.99" + "'", str9, "0:00:00.99");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test6895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6895");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("CANADA", "p0y0m0dt00m0.020sP-1Y11M30DT23H59M59.975Sp0y0m0dt00m0.020sP-1Y11M30DT23H59M59.975Sp0y0m0dt00m0.020sP-1Y11M30DT23H59M59.975Sp0y0m0dt00m0.020sP-1Y11M30DT23H59M59.975Sp0y0m0dt00m0.020sP-1Y11M30DT23H59M59.975Sp0y0m0dt00m0.020sP-1Y11M30DT23H59M59.975Sp0y0m0dt00m0.020sP-1Y11M30DT23H59M59.975Sp0y0m0dt00m0.020sP-1Y11M30DT23H59M59.975Sp0y0m0dt00m0.020sP-1Y11M30DT23H59M59.975Sp0y0m0dt00m0.020sP-1Y11M30DT23H59M59.975Sp0y0m0dt00m0.020sP-1Y11M30DT23H59M59.975Sp0y0m0dt00m0.020sP-1Y11M30DT23H59M59.975Sp0y0m0dt00m0.020s", 100);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test6896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6896");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("                                                p0001439030t0h014390.09059hip0001439030t0h014390.09059!p0001439030t0h014390.09059                                                 ", "p0y0m0dt0p-1Y11M30DT23H59M59.975S0m0.020s", 85);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test6897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6897");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("eure 0e Greenwich0eure 0e Greenwich0eure 0e Greenwich0eure 0e Greenwich0eure 0e Greenwich0eure 0e Greenwich0eure 0e Greenwich0eure 0e Greenwich0eure 0e Greenwich0eure 0e Greenwich0eure 0e Greenwich0eure 0e Greenwich0eure 0e Greenwich0eure 0e Greenwich0eure 0e Greenwich0eure 0e Greenwich0eure 0e Greenwich0eure 0e Greenwich0eure 0e Greenwich", 47);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "eure 0e Greenwich0eure 0e Greenwich0eure 0e Greenwich0eure 0e Greenwich0eure 0e Greenwich0eure 0e Greenwich0eure 0e Greenwich0eure 0e Greenwich0eure 0e Greenwich0eure 0e Greenwich0eure 0e Greenwich0eure 0e Greenwich0eure 0e Greenwich0eure 0e Greenwich0eure 0e Greenwich0eure 0e Greenwich0eure 0e Greenwich0eure 0e Greenwich0eure 0e Greenwich" + "'", str2, "eure 0e Greenwich0eure 0e Greenwich0eure 0e Greenwich0eure 0e Greenwich0eure 0e Greenwich0eure 0e Greenwich0eure 0e Greenwich0eure 0e Greenwich0eure 0e Greenwich0eure 0e Greenwich0eure 0e Greenwich0eure 0e Greenwich0eure 0e Greenwich0eure 0e Greenwich0eure 0e Greenwich0eure 0e Greenwich0eure 0e Greenwich0eure 0e Greenwich0eure 0e Greenwich");
    }

    @Test
    public void test6898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6898");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx0 DAYS 0 HOURS 0 MINUTES 0 SECOND", "          0I!          ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test6899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6899");
        java.util.TimeZone timeZone5 = java.util.TimeZone.getTimeZone("!ih!ih!...testestestestestestestestestestestestestestestestestestestestest'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'");
        int int6 = timeZone5.getRawOffset();
        java.lang.String str7 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(0L, 0L, "P0Y0M0DT0H0M0.023S", false, timeZone5);
        int int9 = timeZone5.getOffset((long) 120);
        boolean boolean10 = timeZone5.useDaylightTime();
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "Heure de Greenwich");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "P0Y000DT00000.0230" + "'", str7, "P0Y000DT00000.0230");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test6900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6900");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale2 = java.util.Locale.CHINA;
        java.util.Locale locale3 = locale2.stripExtensions();
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.lowerCase("99.00:00:0", locale2);
        java.util.Locale.Builder builder5 = builder0.setLocale(locale2);
        java.util.Locale.Builder builder7 = builder5.setLanguage("und");
        java.util.Locale.Builder builder9 = builder5.setLanguageTag("ih");
        java.util.Locale.Builder builder10 = builder9.clear();
        java.util.Locale locale12 = java.util.Locale.forLanguageTag("0:00:00.990:00:00.990:00:00.990:00:00.990:00:00.990:00:00.990:00:00.990:00:00.990:00:00.990:00:00.990:00:00.990:00:00.990:00:00.990:00:00.990:00:00.990:00:00.990:00:00.990:00:00.990:00:00.990:00:00.990:00:00.990:00:00.990:00:00.990:00:00.990:00:00.990:00:00.990:00:00.990:00:00.990:00:00.990:00:00.990:00:00.990:00:00.99");
        java.util.Locale.Builder builder13 = builder10.setLocale(locale12);
        java.util.Locale locale14 = builder13.build();
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "99.00:00:0" + "'", str4, "99.00:00:0");
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "");
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "");
    }

    @Test
    public void test6901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6901");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("Uuuuuuuuuuuuuuuuuuuuuuuu0320.00000TD000Y0P", "P0Y0M0DT0H0M0.004S");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test6902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6902");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("", "                                                p0y0m0dt0h0m0.090ship0y0m0dt0h0m0.090s!p0y0m0dt0h0m0.090s", 37);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test6903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6903");
        java.util.TimeZone timeZone5 = java.util.TimeZone.getTimeZone("");
        java.lang.String str6 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(1L, 0L, "\u4e2d\u6587", true, timeZone5);
        boolean boolean7 = timeZone5.observesDaylightTime();
        java.util.TimeZone timeZone13 = java.util.TimeZone.getTimeZone("");
        java.lang.String str14 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(1L, 0L, "\u4e2d\u6587", true, timeZone13);
        boolean boolean15 = timeZone5.hasSameRules(timeZone13);
        java.util.TimeZone timeZone17 = java.util.TimeZone.getTimeZone("");
        int int18 = timeZone17.getRawOffset();
        java.lang.String str19 = timeZone17.getID();
        int int20 = timeZone17.getRawOffset();
        boolean boolean21 = timeZone5.hasSameRules(timeZone17);
        java.util.TimeZone timeZone27 = java.util.TimeZone.getTimeZone("");
        java.lang.String str28 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(1L, 0L, "\u4e2d\u6587", true, timeZone27);
        boolean boolean29 = timeZone27.observesDaylightTime();
        java.util.TimeZone timeZone35 = java.util.TimeZone.getTimeZone("");
        java.lang.String str36 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(1L, 0L, "\u4e2d\u6587", true, timeZone35);
        boolean boolean37 = timeZone27.hasSameRules(timeZone35);
        java.time.ZoneId zoneId38 = timeZone35.toZoneId();
        boolean boolean39 = timeZone5.hasSameRules(timeZone35);
        boolean boolean40 = timeZone5.observesDaylightTime();
        int int41 = timeZone5.getRawOffset();
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "Heure de Greenwich");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\u4e2d\u6587" + "'", str6, "\u4e2d\u6587");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "Heure de Greenwich");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\u4e2d\u6587" + "'", str14, "\u4e2d\u6587");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(timeZone17);
        org.junit.Assert.assertEquals(timeZone17.getDisplayName(), "Heure de Greenwich");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "GMT" + "'", str19, "GMT");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(timeZone27);
        org.junit.Assert.assertEquals(timeZone27.getDisplayName(), "Heure de Greenwich");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "\u4e2d\u6587" + "'", str28, "\u4e2d\u6587");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(timeZone35);
        org.junit.Assert.assertEquals(timeZone35.getDisplayName(), "Heure de Greenwich");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "\u4e2d\u6587" + "'", str36, "\u4e2d\u6587");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(zoneId38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
    }

    @Test
    public void test6904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6904");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("p-1Y11M30DT23H59M59.991S");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "p-1Y11M30DT23H59M59.991S" + "'", str1, "p-1Y11M30DT23H59M59.991S");
    }

    @Test
    public void test6905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6905");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("########chinese(china)#########");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=########chinese(china)#########");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6906");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("                                                                                                    ", 4, 153);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test6907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6907");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("uuuuuuuuuuuuuzh_CN");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
    }

    @Test
    public void test6908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6908");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("fr-FR", "GMT+00:00");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.split("English (United States)", '#');
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.replaceEach("00dt00000.090153HIp0y000dt00000.090153!p0y000dt00000.090153", strArray3, strArray6);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "00dt00000.090153HIp0y000dt00000.090153!p0y000dt00000.090153" + "'", str7, "00dt00000.090153HIp0y000dt00000.090153!p0y000dt00000.090153");
    }

    @Test
    public void test6909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6909");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("\u6cd5\u6587\u6cd5\u56fd)");
        java.util.Locale locale4 = java.util.Locale.CHINA;
        java.util.Locale locale5 = locale4.stripExtensions();
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.lowerCase("99.00:00:0", locale4);
        boolean boolean7 = locale4.hasExtensions();
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.upperCase("eng", locale4);
        java.lang.String str9 = locale4.getDisplayScript();
        java.lang.String str10 = locale1.getDisplayScript(locale4);
        java.util.Locale.Builder builder11 = new java.util.Locale.Builder();
        java.util.Locale locale12 = builder11.build();
        java.util.Locale.setDefault(locale12);
        java.util.Locale locale14 = java.util.Locale.CHINA;
        java.util.Locale locale15 = java.util.Locale.PRC;
        java.lang.String str16 = locale14.getDisplayLanguage(locale15);
        java.lang.String str17 = locale12.getDisplayLanguage(locale15);
        java.lang.String str18 = locale15.getISO3Language();
        java.util.Locale.setDefault(locale15);
        java.util.Locale locale20 = java.util.Locale.PRC;
        java.lang.String str21 = locale20.getDisplayName();
        java.util.Set<java.lang.Character> charSet22 = locale20.getExtensionKeys();
        java.lang.String str23 = locale15.getDisplayLanguage(locale20);
        java.lang.String str24 = locale4.getDisplayCountry(locale20);
        java.lang.String str25 = locale20.getScript();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "99.00:00:0" + "'", str6, "99.00:00:0");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ENG" + "'", str8, "ENG");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\u4e2d\u6587" + "'", str16, "\u4e2d\u6587");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "zho" + "'", str18, "zho");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "zh_CN");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\u4e2d\u6587\u4e2d\u56fd)" + "'", str21, "\u4e2d\u6587\u4e2d\u56fd)");
        org.junit.Assert.assertNotNull(charSet22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\u4e2d\u6587" + "'", str23, "\u4e2d\u6587");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "\u4e2d\u56fd" + "'", str24, "\u4e2d\u56fd");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test6910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6910");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (short) 100, (long) 'u', "GBCanada");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "GBCana0a" + "'", str3, "GBCana0a");
    }

    @Test
    public void test6911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6911");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "                    P0Y0M0DT0H0M0.037S                    ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test6912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6912");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("eure 0e Greenwich0eure 0e Greenwich0eure 0e Greenwich0eure 0e Greenwich0eure 0e Greenwich0eure 0e Greenwich0eure 0e Greenwich0eure 0e Greenwich0eure 0e Greenwich0eure 0e Greenwich0eure 0e Greenwich0eure 0e Greenwich0eure 0e Greenwich0eure 0e Greenwich0eure 0e Greenwich0eure 0e Greenwich0eure 0e Greenwich0eure 0e Greenwich0eure 0e Greenwich", strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=eure0egreenwich0eure0egreenwich0eure0egreenwich0eure0egreenwich0eure0egreenwich0eure0egreenwich0eure0egreenwich0eure0egreenwich0eure0egreenwich0eure0egreenwich0eure0egreenwich0eure0egreenwich0eure0egreenwich0eure0egreenwich0eure0egreenwich0eure0egreenwich0eure0egreenwich0eure0egreenwich0eure0egreenwich");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6913");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 'u', (long) 23, "Heure de GreenwichHeure de GreenwichHeure de GreenwichHeure de GreenwichHeure de GreenwichHeure de GreenwichHeure de GreenwichHeure de GreenwichHeure de GreenwichHeure de GreenwichHeure de GreenwichHeure de GreenwichHeure de GreenwichHeure de GreenwichHeure de GreenwichHeure de GreenwichHeure de GreenwichHeure de GreenwichHeure de Greenwich");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "23eure 30e Greenwich23eure 30e Greenwich23eure 30e Greenwich23eure 30e Greenwich23eure 30e Greenwich23eure 30e Greenwich23eure 30e Greenwich23eure 30e Greenwich23eure 30e Greenwich23eure 30e Greenwich23eure 30e Greenwich23eure 30e Greenwich23eure 30e Greenwich23eure 30e Greenwich23eure 30e Greenwich23eure 30e Greenwich23eure 30e Greenwich23eure 30e Greenwich23eure 30e Greenwich" + "'", str3, "23eure 30e Greenwich23eure 30e Greenwich23eure 30e Greenwich23eure 30e Greenwich23eure 30e Greenwich23eure 30e Greenwich23eure 30e Greenwich23eure 30e Greenwich23eure 30e Greenwich23eure 30e Greenwich23eure 30e Greenwich23eure 30e Greenwich23eure 30e Greenwich23eure 30e Greenwich23eure 30e Greenwich23eure 30e Greenwich23eure 30e Greenwich23eure 30e Greenwich23eure 30e Greenwich");
    }

    @Test
    public void test6914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6914");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("I!Chinh0ich (China)I!Chinhich (China)I!Chinhich (China)I!Chinhich (China)I!Chinhich (China)I!Chinhich (China)I!Chinhich (China)I!Chinhich (China)I!Chinhich (China)I!", 'u');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test6915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6915");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale2 = java.util.Locale.CHINA;
        java.util.Locale locale3 = locale2.stripExtensions();
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.lowerCase("99.00:00:0", locale2);
        java.util.Locale.Builder builder5 = builder0.setLocale(locale2);
        java.util.Locale.Builder builder7 = builder5.setLanguage("und");
        java.util.Locale locale9 = java.util.Locale.ROOT;
        java.util.Locale locale12 = new java.util.Locale("\u4e2d\u6587", "                                                                                                    ");
        java.lang.String str13 = locale9.getDisplayCountry(locale12);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.upperCase("0 DAYS 0 HOURS 0 MINUTES 0 SECONDS", locale9);
        java.lang.String str15 = locale9.getScript();
        boolean boolean16 = locale9.hasExtensions();
        java.util.Locale.Builder builder17 = builder5.setLocale(locale9);
        java.util.Locale.Builder builder19 = builder5.setLanguageTag("en-ca");
        java.util.Locale.Builder builder20 = builder19.clear();
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "99.00:00:0" + "'", str4, "99.00:00:0");
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "");
        org.junit.Assert.assertEquals(locale12.toString(), "\u4e2d\u6587_                                                                                                    ");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "0 DAYS 0 HOURS 0 MINUTES 0 SECONDS" + "'", str14, "0 DAYS 0 HOURS 0 MINUTES 0 SECONDS");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder20);
    }

    @Test
    public void test6916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6916");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("p0y0m0dt0h0m0.121s", 16, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum abbreviation width with offset is 7");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6917");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("tes", 'u');
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3);
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.split("p0y0m0dt0h0m0.000s");
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAny("Cine0e", strArray7);
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.stripAll(strArray7, "00DT00P0Y0M0DT0H0M0.121S.09015");
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.replaceEach("NG", strArray3, strArray10);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "tes" + "'", str4, "tes");
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "NG" + "'", str11, "NG");
    }

    @Test
    public void test6918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6918");
        java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("English", (double) (short) 1);
        java.util.TimeZone timeZone4 = java.util.TimeZone.getTimeZone("");
        int int5 = timeZone4.getRawOffset();
        java.lang.String str6 = timeZone4.getID();
        int int7 = timeZone4.getRawOffset();
        timeZone4.setID("#####################################################################################################################");
        boolean boolean10 = timeZone4.observesDaylightTime();
        timeZone4.setRawOffset(98);
        boolean boolean13 = languageRange2.equals((java.lang.Object) 98);
        org.junit.Assert.assertNotNull(timeZone4);
        org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "GMT" + "'", str6, "GMT");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test6919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6919");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'");
        int int2 = timeZone1.getRawOffset();
        java.util.TimeZone.setDefault(timeZone1);
        boolean boolean4 = timeZone1.observesDaylightTime();
        int int6 = timeZone1.getOffset((long) 57);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u683c\u6797\u5a01\u6cbb\u65f6\u95f4");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test6920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6920");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "P0Y0M0DT0H0M0.121S");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test6921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6921");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("China");
        java.util.Set<java.lang.String> strSet2 = locale1.getUnicodeLocaleAttributes();
        java.lang.String str3 = locale1.getCountry();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "china");
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test6922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6922");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("aaxabxaexafxakxamxanxarxasxavxayxazxbaxbexbgxbhxbixbmxbnxboxbrxbsxcaxcexchxcoxcrxcsxcxcvxcyxdaxdexdvxdzxeexelxenxeoxesxetxexfaxffxfixfjxfoxfrxfyxgaxgdxglxgnxgxgvxhaxhexhixhoxhrxhtxhxhyxhzxiaxidxiexigxiixikxinxioxisxitxixiwxjaxjixjvxkaxkgxkixkjxkkxklxkmxknxkoxkrxksxkxkvxkwxkyxlaxlbxlgxlixlnxloxltxlxlvxmgxmhxmixmkxmlxmnxmoxmrxmsxmtxmyxnaxnbxndxnexngxnlxnnxnoxnrxnvxnyxocxojxomxorxosxpaxpixplxpsxptxqxrmxrnxroxrxrwxsaxscxsdxsexsgxsixskxslxsmxsnxsoxsqxsrxssxstxsxsvxswxtaxtextgxthxtixtkxtlxtnxtoxtrxtsxttxtwxtyxgxkxrxzxvexvixvoxwaxwoxxhxyixyoxzaxzhxz", "0 DAYS 0 HOURS 0 MINUTES 0 SECONDS");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test6923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6923");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("\u683c\u6797\u5a01\u6cbb\u6642\u9593       ", 41, 'x');
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u683c\u6797\u5a01\u6cbb\u6642\u9593       " + "'", str3, "\u683c\u6797\u5a01\u6cbb\u6642\u9593       ");
    }

    @Test
    public void test6924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6924");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("99.00:00:0");
        java.lang.String str2 = locale1.getLanguage();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test6925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6925");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("_0 DAY10 0 0OUR10 0 0INUTE10 0 ECOND_0 DAY 0 0OUR10 0 0INUTE10 0 ECOND_0 DAY 0 0OUR10 0 0INUTE10 0 ECOND_0 DAY 0 0OUR10 0 0INUTE10 0 ECOND_0 DAY 0 0OUR10 0 0INUTE10 0 ECOND_0 DAY 0 0OUR10 0 0INUTE10 0 ECOND_0 DAY 0 0OUR10 0 0INUTE10 0 ECOND_0 DAY 0 0OUR10 0 0INUTE10 0 ECOND_0 DAY 0 0OUR10 0 0INUTE10 0 ECOND_0 DAY 0 0OUR10 0 0INUTE10 0 ECOND", "P-1Y11M30DT23H59M59.979S");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P-1Y11M30DT23H59M59.979S" + "'", str2, "P-1Y11M30DT23H59M59.979S");
    }

    @Test
    public void test6926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6926");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("TE0");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "TE0" + "'", str1, "TE0");
    }

    @Test
    public void test6927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6927");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("UnitedENGKingdom");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "UnitedENGKingdom" + "'", str1, "UnitedENGKingdom");
    }

    @Test
    public void test6928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6928");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("");
        int int2 = timeZone1.getRawOffset();
        int int3 = timeZone1.getRawOffset();
        timeZone1.setID("0 days 0 hours 0 minutes 0 seconds0 days 0 hours 0 minutes 0 seconds0 days 0 hours 0 minutes 0 secon");
        java.util.TimeZone timeZone7 = java.util.TimeZone.getTimeZone("");
        int int8 = timeZone7.getRawOffset();
        java.lang.String str9 = timeZone7.getID();
        java.time.ZoneId zoneId10 = timeZone7.toZoneId();
        boolean boolean11 = timeZone1.hasSameRules(timeZone7);
        timeZone1.setID("\u6cd5\u6587\u6cd5\u56fd)");
        java.util.TimeZone timeZone15 = java.util.TimeZone.getTimeZone("!ih!ih!...testestestestestestestestestestestestestestestestestestestestest'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'");
        int int16 = timeZone15.getRawOffset();
        boolean boolean17 = timeZone1.hasSameRules(timeZone15);
        int int19 = timeZone1.getOffset((long) 32);
        timeZone1.setRawOffset(41);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(timeZone7);
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "\u683c\u6797\u5a01\u6cbb\u65f6\u95f4");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "GMT" + "'", str9, "GMT");
        org.junit.Assert.assertNotNull(zoneId10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(timeZone15);
        org.junit.Assert.assertEquals(timeZone15.getDisplayName(), "\u683c\u6797\u5a01\u6cbb\u65f6\u95f4");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test6929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6929");
        java.lang.String str1 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationHMS((long) 318);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0:00:00.318" + "'", str1, "0:00:00.318");
    }

    @Test
    public void test6930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6930");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaap0y0m0dt0h0m0.034saaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "WWWWWWWWWW");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test6931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6931");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("Chinese                       'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's                                 ", 4);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ese                       'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's                                 " + "'", str2, "ese                       'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's                                 ");
    }

    @Test
    public void test6932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6932");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder2 = builder1.clearExtensions();
        java.util.Locale.Builder builder3 = builder2.clear();
        java.util.Locale locale4 = builder3.build();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder7 = builder3.setUnicodeLocaleKeyword("", "0:00:00.096");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key:  [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
    }

    @Test
    public void test6933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6933");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("g", "\u683c\u6797\u5a01\u6cbb\u6642\u9593", 7, 31);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u683c\u6797\u5a01\u6cbb\u6642\u9593" + "'", str4, "\u683c\u6797\u5a01\u6cbb\u6642\u9593");
    }

    @Test
    public void test6934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6934");
        java.util.Locale locale0 = java.util.Locale.JAPAN;
        java.util.Locale locale1 = java.util.Locale.PRC;
        java.util.Locale locale3 = java.util.Locale.GERMANY;
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.lowerCase("HI!", locale3);
        java.lang.String str5 = locale1.getDisplayVariant(locale3);
        java.util.Locale locale6 = locale1.stripExtensions();
        java.util.Set<java.lang.String> strSet7 = locale1.getUnicodeLocaleKeys();
        java.lang.String str8 = locale0.getDisplayScript(locale1);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ja_JP");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test6935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6935");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("!ih", "");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, 'u');
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "!ih" + "'", str4, "!ih");
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test6936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6936");
        java.util.Locale locale0 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Set<java.lang.String> strSet1 = locale0.getUnicodeLocaleKeys();
        java.util.Locale locale2 = java.util.Locale.FRANCE;
        java.util.Set<java.lang.String> strSet3 = locale2.getUnicodeLocaleKeys();
        java.util.Locale locale4 = java.util.Locale.CHINESE;
        java.lang.String str5 = locale2.getDisplayName(locale4);
        java.lang.String str6 = locale4.getLanguage();
        java.util.Set<java.lang.String> strSet7 = locale4.getUnicodeLocaleAttributes();
        java.lang.String str8 = locale4.getISO3Country();
        java.lang.String str9 = locale0.getDisplayName(locale4);
        java.util.Locale.setDefault(locale0);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "zh");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\u6cd5\u6587\u6cd5\u56fd)" + "'", str5, "\u6cd5\u6587\u6cd5\u56fd)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "zh" + "'", str6, "zh");
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\u4e2d\u6587\u4e2d\u56fd)" + "'", str9, "\u4e2d\u6587\u4e2d\u56fd)");
    }

    @Test
    public void test6937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6937");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("0e_zh_tw (p0y0-10dt07430-10.0343599900,0 day4 0 0our4 0 0inute04 0 econd)");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test6938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6938");
        java.util.TimeZone timeZone5 = java.util.TimeZone.getTimeZone("");
        java.lang.String str6 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(1L, 0L, "\u4e2d\u6587", true, timeZone5);
        boolean boolean7 = timeZone5.observesDaylightTime();
        int int9 = timeZone5.getOffset(0L);
        java.util.TimeZone.setDefault(timeZone5);
        boolean boolean11 = timeZone5.observesDaylightTime();
        int int12 = timeZone5.getDSTSavings();
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "\u683c\u6797\u5a01\u6cbb\u65f6\u95f4");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\u4e2d\u6587" + "'", str6, "\u4e2d\u6587");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test6939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6939");
        java.util.Locale locale0 = java.util.Locale.PRC;
        java.util.Locale locale2 = java.util.Locale.GERMANY;
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.lowerCase("HI!", locale2);
        java.lang.String str4 = locale0.getDisplayVariant(locale2);
        java.lang.String str5 = locale0.getDisplayVariant();
        java.util.Locale locale7 = java.util.Locale.forLanguageTag("99.00:00:0");
        java.util.Locale.Builder builder8 = new java.util.Locale.Builder();
        java.util.Locale locale10 = java.util.Locale.CHINA;
        java.util.Locale locale11 = locale10.stripExtensions();
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.lowerCase("99.00:00:0", locale10);
        java.util.Locale.Builder builder13 = builder8.setLocale(locale10);
        java.lang.String str14 = locale7.getDisplayLanguage(locale10);
        java.lang.String str15 = locale0.getDisplayCountry(locale10);
        java.util.Locale locale17 = new java.util.Locale("!IH");
        java.lang.String str18 = locale17.getDisplayName();
        java.lang.String str19 = locale0.getDisplayName(locale17);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = locale17.getExtension('4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed extension key: 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "99.00:00:0" + "'", str12, "99.00:00:0");
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\u4e2d\u56fd" + "'", str15, "\u4e2d\u56fd");
        org.junit.Assert.assertEquals(locale17.toString(), "!ih");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "!ih" + "'", str18, "!ih");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Chinese (China)" + "'", str19, "Chinese (China)");
    }

    @Test
    public void test6940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6940");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("Greenwich Mean Time", "p-1y11m30dt23h59m59.975s (IH)");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test6941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6941");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("0:00:00.002", "\u4e2d\u56fd", 0);
        boolean boolean5 = org.apache.commons.lang3.StringUtils.startsWithAny("Korean", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test6942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6942");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale1 = java.util.Locale.CANADA;
        java.util.Locale.setDefault(category0, locale1);
        java.util.Locale locale3 = java.util.Locale.getDefault(category0);
        java.util.Locale locale4 = java.util.Locale.UK;
        java.util.Locale.Category category5 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale6 = java.util.Locale.CANADA;
        java.util.Locale.setDefault(category5, locale6);
        java.lang.String str8 = locale6.getLanguage();
        java.lang.String str9 = locale4.getDisplayScript(locale6);
        java.util.Locale.setDefault(category0, locale4);
        java.util.Locale locale11 = java.util.Locale.PRC;
        java.util.Locale locale13 = java.util.Locale.GERMANY;
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.lowerCase("HI!", locale13);
        java.lang.String str15 = locale11.getDisplayVariant(locale13);
        java.util.Locale locale16 = locale11.stripExtensions();
        java.util.Locale.setDefault(category0, locale16);
        java.util.Locale locale20 = new java.util.Locale("'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S", "                P0Y0M0DT0H0M0.090ShiP0Y0M0DT0H0M0.090S!P0Y0M0DT0H0M0.090S                        ");
        java.util.Locale.setDefault(category0, locale20);
        java.util.Locale.Category category22 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale23 = java.util.Locale.FRANCE;
        java.util.Locale.setDefault(category22, locale23);
        java.util.Locale locale25 = java.util.Locale.getDefault(category22);
        java.util.Locale locale26 = java.util.Locale.getDefault(category22);
        java.util.Locale locale27 = java.util.Locale.getDefault(category22);
        java.lang.String str28 = locale27.getLanguage();
        java.util.Locale.setDefault(category0, locale27);
        java.util.Locale locale30 = java.util.Locale.getDefault(category0);
        java.lang.String str31 = locale30.getDisplayCountry();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en_CA");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en_CA");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en_GB");
        org.junit.Assert.assertTrue("'" + category5 + "' != '" + java.util.Locale.Category.FORMAT + "'", category5.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "en" + "'", str8, "en");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "zh_CN");
        org.junit.Assert.assertEquals(locale20.toString(), "'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's_                P0Y0M0DT0H0M0.090SHIP0Y0M0DT0H0M0.090S!P0Y0M0DT0H0M0.090S                        ");
        org.junit.Assert.assertTrue("'" + category22 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category22.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "fr" + "'", str28, "fr");
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "France" + "'", str31, "France");
    }

    @Test
    public void test6943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6943");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("\u6cd5\u6587\u6cd5\u56fd))", "\ub3c5\uc77c\uc5b4\ub3c5\uc77c)");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test6944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6944");
        java.util.Locale locale2 = new java.util.Locale("p0y0m0dt0h0m0.020s", "fra");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = locale2.getISO3Country();
            org.junit.Assert.fail("Expected exception of type java.util.MissingResourceException; message: Couldn't find 3-letter country code for FRA");
        } catch (java.util.MissingResourceException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(locale2.toString(), "p0y0m0dt0h0m0.020s_FRA");
    }

    @Test
    public void test6945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6945");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y0M0DT0H0M0.034Saaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "en-GB");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test6946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6946");
        java.util.TimeZone timeZone5 = java.util.TimeZone.getTimeZone("");
        java.lang.String str6 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(1L, 0L, "\u4e2d\u6587", true, timeZone5);
        boolean boolean7 = timeZone5.observesDaylightTime();
        java.util.TimeZone timeZone13 = java.util.TimeZone.getTimeZone("");
        java.lang.String str14 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(1L, 0L, "\u4e2d\u6587", true, timeZone13);
        boolean boolean15 = timeZone5.hasSameRules(timeZone13);
        int int17 = timeZone13.getOffset((long) (short) 10);
        timeZone13.setRawOffset(98);
        boolean boolean20 = timeZone13.observesDaylightTime();
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "Heure de Greenwich");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\u4e2d\u6587" + "'", str6, "\u4e2d\u6587");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "Heure de Greenwich");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\u4e2d\u6587" + "'", str14, "\u4e2d\u6587");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test6947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6947");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfBlank("testestestestestestestestestestestestestestestestestestestestest'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'", "aa ab ae af ak am an ar as av ay az ba be bg bh bi bm bn bo br bs ca ce ch co cr cs cu cv cy da de dv dz ee el en eo es et eu fa ff fi fj fo fr fy ga gd gl gn gu gv ha he hi ho hr ht hu hy hz ia id ie ig ii ik in io is it iu iw ja ji jv ka kg ki kj kk kl km kn ko kr ks ku kv kw ky la lb lg li ln lo lt lu lv mg mh mi mk ml mn mo mr ms mt my na nb nd ne ng nl nn no nr nv ny oc oj om or os pa pi pl ps pt qu rm rn ro ru rw sa sc sd se sg si sk sl sm sn so sq sr ss st su sv sw ta te tg th ti tk tl tn to tr ts tt tw ty ug uk ur uz ve vi vo wa wo #h yi yo za zh zu");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "testestestestestestestestestestestestestestestestestestestestest'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'" + "'", str2, "testestestestestestestestestestestestestestestestestestestestest'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'");
    }

    @Test
    public void test6948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6948");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale2 = java.util.Locale.CHINA;
        java.util.Locale locale3 = locale2.stripExtensions();
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.lowerCase("99.00:00:0", locale2);
        java.util.Locale.Builder builder5 = builder0.setLocale(locale2);
        java.util.Locale.Builder builder7 = builder0.setLanguage("");
        java.util.Locale.Builder builder10 = builder7.setExtension('x', "");
        java.util.Locale.Builder builder12 = builder10.setLanguageTag("en");
        java.util.Locale.Builder builder13 = builder12.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder16 = builder12.setExtension('x', "P0Y0M0DT0H0M0.068S");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension value: P0Y0M0DT0H0M0.068S [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "99.00:00:0" + "'", str4, "99.00:00:0");
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test6949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6949");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("Chine0euuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test6950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6950");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", "                                 P-1Y11M30DT23H59M59.947S0DT0H0M0.090S!P0Y0M0DT0H0M0.090S");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test6951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6951");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("0:00:00.99", "Chinese (China)FRAN\307\uc911\uad6d\uc5b4\uc911\uad6d)", (int) '4');
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0:00:00.99" + "'", str4, "0:00:00.99");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "0:00:00.99" + "'", str5, "0:00:00.99");
    }

    @Test
    public void test6952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6952");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("_0 DAYS 0 HOURS 0 MINUTES 0 SECONDS");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_0DAYS0HOURS0MINUTES0SECONDS" + "'", str2, "_0DAYS0HOURS0MINUTES0SECONDS");
    }

    @Test
    public void test6953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6953");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "4444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test6954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6954");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale locale2 = builder0.build();
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale.Builder builder4 = builder3.clearExtensions();
        java.util.Locale locale5 = builder3.build();
        java.lang.String str6 = locale5.toLanguageTag();
        java.util.Set<java.lang.String> strSet7 = locale5.getUnicodeLocaleKeys();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "und" + "'", str6, "und");
        org.junit.Assert.assertNotNull(strSet7);
    }

    @Test
    public void test6955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6955");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("aa ab ae af ak am an ar as av ay az ba be bg bh bi bm bn bo br bs ca ce ch co cr cs cu cv cy da de dv dz ee el en eo es et eu fa ff fi fj fo fr fy ga gd gl gn gu gv ha he hi ho hr ht hu hy hz ia id ie ig ii ik in io is it iu iw ja ji jv ka kg ki kj kk kl km kn ko kr ks ku kv kw ky la lb lg li ln lo lt lu lv mg mh mi mk ml mn mo mr ms mt my na nb nd ne ng nl nn no nr nv ny oc oj om or os pa pi pl ps pt qu rm rn ro ru rw sa sc sd se sg si sk sl sm sn so sq sr ss st su sv sw ta te tg th ti tk tl tn to tr ts tt tw ty ug uk ur uz ve vi vo wa wo xh yi yo za zh zu");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, 'u');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aau uabu uaeu uafu uaku uamu uanu uaru uasu uavu uayu uazu ubau ubeu ubgu ubhu ubiu ubmu ubnu ubou ubru ubsu ucau uceu uchu ucou ucru ucsu ucuu ucvu ucyu udau udeu udvu udzu ueeu uelu uenu ueou uesu uetu ueuu ufau uffu ufiu ufju ufou ufru ufyu ugau ugdu uglu ugnu uguu ugvu uhau uheu uhiu uhou uhru uhtu uhuu uhyu uhzu uiau uidu uieu uigu uiiu uiku uinu uiou uisu uitu uiuu uiwu ujau ujiu ujvu ukau ukgu ukiu ukju ukku uklu ukmu uknu ukou ukru uksu ukuu ukvu ukwu ukyu ulau ulbu ulgu uliu ulnu ulou ultu uluu ulvu umgu umhu umiu umku umlu umnu umou umru umsu umtu umyu unau unbu undu uneu ungu unlu unnu unou unru unvu unyu uocu uoju uomu uoru uosu upau upiu uplu upsu uptu uquu urmu urnu urou uruu urwu usau uscu usdu useu usgu usiu usku uslu usmu usnu usou usqu usru ussu ustu usuu usvu uswu utau uteu utgu uthu utiu utku utlu utnu utou utru utsu uttu utwu utyu uugu uuku uuru uuzu uveu uviu uvou uwau uwou uxhu uyiu uyou uzau uzhu uzu" + "'", str3, "aau uabu uaeu uafu uaku uamu uanu uaru uasu uavu uayu uazu ubau ubeu ubgu ubhu ubiu ubmu ubnu ubou ubru ubsu ucau uceu uchu ucou ucru ucsu ucuu ucvu ucyu udau udeu udvu udzu ueeu uelu uenu ueou uesu uetu ueuu ufau uffu ufiu ufju ufou ufru ufyu ugau ugdu uglu ugnu uguu ugvu uhau uheu uhiu uhou uhru uhtu uhuu uhyu uhzu uiau uidu uieu uigu uiiu uiku uinu uiou uisu uitu uiuu uiwu ujau ujiu ujvu ukau ukgu ukiu ukju ukku uklu ukmu uknu ukou ukru uksu ukuu ukvu ukwu ukyu ulau ulbu ulgu uliu ulnu ulou ultu uluu ulvu umgu umhu umiu umku umlu umnu umou umru umsu umtu umyu unau unbu undu uneu ungu unlu unnu unou unru unvu unyu uocu uoju uomu uoru uosu upau upiu uplu upsu uptu uquu urmu urnu urou uruu urwu usau uscu usdu useu usgu usiu usku uslu usmu usnu usou usqu usru ussu ustu usuu usvu uswu utau uteu utgu uthu utiu utku utlu utnu utou utru utsu uttu utwu utyu uugu uuku uuru uuzu uveu uviu uvou uwau uwou uxhu uyiu uyou uzau uzhu uzu");
    }

    @Test
    public void test6956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6956");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationWords((long) (byte) 0, false, false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0 days 0 hours 0 minutes 0 seconds" + "'", str3, "0 days 0 hours 0 minutes 0 seconds");
    }

    @Test
    public void test6957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6957");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("p0y0m0dt0h0m0.004", ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "p0y0m0dt0h0m0.004" + "'", str2, "p0y0m0dt0h0m0.004");
    }

    @Test
    public void test6958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6958");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("und", "chinoi0");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test6959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6959");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("");
        int int2 = timeZone1.getRawOffset();
        java.lang.String str3 = timeZone1.getID();
        int int4 = timeZone1.getRawOffset();
        java.util.TimeZone timeZone5 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone11 = java.util.TimeZone.getTimeZone("");
        java.lang.String str12 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(1L, 0L, "\u4e2d\u6587", true, timeZone11);
        boolean boolean13 = timeZone11.observesDaylightTime();
        java.util.TimeZone timeZone19 = java.util.TimeZone.getTimeZone("");
        java.lang.String str20 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(1L, 0L, "\u4e2d\u6587", true, timeZone19);
        boolean boolean21 = timeZone11.hasSameRules(timeZone19);
        boolean boolean22 = timeZone5.hasSameRules(timeZone11);
        boolean boolean23 = timeZone5.observesDaylightTime();
        java.time.ZoneId zoneId24 = timeZone5.toZoneId();
        boolean boolean25 = timeZone1.hasSameRules(timeZone5);
        java.lang.Object obj26 = timeZone5.clone();
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Heure de Greenwich");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "GMT" + "'", str3, "GMT");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "Heure de Greenwich");
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "Heure de Greenwich");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\u4e2d\u6587" + "'", str12, "\u4e2d\u6587");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(timeZone19);
        org.junit.Assert.assertEquals(timeZone19.getDisplayName(), "Heure de Greenwich");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "\u4e2d\u6587" + "'", str20, "\u4e2d\u6587");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(zoneId24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertEquals(obj26.toString(), "sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj26), "sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj26), "sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null]");
    }

    @Test
    public void test6960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6960");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("cHINESE      ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "chinese      " + "'", str1, "chinese      ");
    }

    @Test
    public void test6961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6961");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("7430-10.0903599686743IP0Y0-10DT07430-10.0903599686!P0Y0-10DT07430-10.0903599686", 15);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "7430-10.0903599686743IP0Y0-10DT07430-10.0903599686!P0Y0-10DT07430-10.0903599686" + "'", str2, "7430-10.0903599686743IP0Y0-10DT07430-10.0903599686!P0Y0-10DT07430-10.0903599686");
    }

    @Test
    public void test6962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6962");
        java.util.Locale locale0 = java.util.Locale.JAPANESE;
        java.util.Locale locale2 = java.util.Locale.forLanguageTag("China");
        java.util.Set<java.lang.String> strSet3 = locale2.getUnicodeLocaleAttributes();
        java.lang.String str4 = locale0.getDisplayCountry(locale2);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ja");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "china");
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test6963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6963");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) 58, (long) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P-1Y11M30DT23H59M59.943S" + "'", str2, "P-1Y11M30DT23H59M59.943S");
    }

    @Test
    public void test6964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6964");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("ihihtestestestestestestestestestestestestestestestestestestestestest'p'yyyy'y'm'm'd'dt'h'h'm'm'ss's'", "44444444444444444444444444444444444444 hi! (ZH_CNZHOZHOZHOZHOZHOZHOZHOZHOZHOZHOZHOZHOZHOZHOZHOZHOZHOZHOZHOZ)");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44444444444444444444444444444444444444 hi! (ZH_CNZHOZHOZHOZHOZHOZHOZHOZHOZHOZHOZHOZHOZHOZHOZHOZHOZHOZHOZHOZ)" + "'", str2, "44444444444444444444444444444444444444 hi! (ZH_CNZHOZHOZHOZHOZHOZHOZHOZHOZHOZHOZHOZHOZHOZHOZHOZHOZHOZHOZHOZ)");
    }

    @Test
    public void test6965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6965");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("00000000000000000tetetetetetetetetetetetetetetetetp0000y0m0dthh0m00.s", "                                                P0Y0M0DT0H0M0.090ShiP0Y0M0DT0H0M0.090S!P0Y0M0DT0H0M0.090S", 101);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test6966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6966");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.lang.String str2 = locale1.toLanguageTag();
        java.util.Locale locale3 = locale1.stripExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = locale1.getUnicodeLocaleType("\u4e2d\u6587\u53f0\u7063)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: ?? (??)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "und" + "'", str2, "und");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "");
    }

    @Test
    public void test6967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6967");
        java.util.TimeZone timeZone5 = java.util.TimeZone.getTimeZone("");
        java.lang.String str6 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(1L, 0L, "\u4e2d\u6587", true, timeZone5);
        boolean boolean7 = timeZone5.observesDaylightTime();
        int int9 = timeZone5.getOffset(0L);
        timeZone5.setID("P0Y0M0DT0H0M0.100S");
        int int12 = timeZone5.getRawOffset();
        java.util.Date date13 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = timeZone5.inDaylightTime(date13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\u4e2d\u6587" + "'", str6, "\u4e2d\u6587");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test6968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6968");
        java.util.TimeZone timeZone5 = java.util.TimeZone.getTimeZone("");
        java.lang.String str6 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(1L, 0L, "\u4e2d\u6587", true, timeZone5);
        boolean boolean7 = timeZone5.observesDaylightTime();
        java.util.TimeZone timeZone13 = java.util.TimeZone.getTimeZone("");
        java.lang.String str14 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(1L, 0L, "\u4e2d\u6587", true, timeZone13);
        boolean boolean15 = timeZone5.hasSameRules(timeZone13);
        int int17 = timeZone13.getOffset((long) (short) 10);
        timeZone13.setRawOffset(98);
        java.lang.Object obj20 = timeZone13.clone();
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "Heure de Greenwich");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\u4e2d\u6587" + "'", str6, "\u4e2d\u6587");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "Heure de Greenwich");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\u4e2d\u6587" + "'", str14, "\u4e2d\u6587");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertEquals(obj20.toString(), "sun.util.calendar.ZoneInfo[id=\"GMT\",offset=98,dstSavings=0,useDaylight=false,transitions=0,lastRule=null]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj20), "sun.util.calendar.ZoneInfo[id=\"GMT\",offset=98,dstSavings=0,useDaylight=false,transitions=0,lastRule=null]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj20), "sun.util.calendar.ZoneInfo[id=\"GMT\",offset=98,dstSavings=0,useDaylight=false,transitions=0,lastRule=null]");
    }

    @Test
    public void test6969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6969");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("ng", "fr4n\347\uc911\uad6d\uc5b4\uc911\uad6d)");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ng" + "'", str2, "ng");
    }

    @Test
    public void test6970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6970");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "mxanxarxasxavxayxazxbaxbexbgxbhxbixbmxbnxboxbrxbsxcaxcexchxcoxcrxcsxcxcvxcyxdaxdexdvxdzxeexelxenxeoxesxetxexfaxffxfixfjxfoxfrxfyxgaxgdxglxgnxgxgvxhaxhexhixhoxhrxhtxhxhyxhzxiaxidxiexigxiixikxinxioxisxitxixiwxjaxjixjvxkaxkgxkixkjxkkxklxkmxknxkoxkrxksxkxkvxkwxkyxlaxlbxlgxlixlnxloxltxlxlvxmgxmhxmixmkxmlxmnxmoxmrxmsxmtxmyxnaxnbxndxnexngxnlxnnxnoxnrxnvxnyxocxojxomxorxosxpaxpixplxpsxptxqxrmxrnxroxrxrwxsaxscxsdxsexsgxsixskxslxsmxsnxsoxsqxsrxssxstxsxsvxswxtaxtextgxthxtixtkxtlxtnxtoxtrxtsxttxtwxtyxgxkxrxzxvexvixvoxwaxwoxxhxyixyoxzaxzhxz");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test6971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6971");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "P0Y0M0DT0H0M0.113S", (java.lang.CharSequence) "ihihtestestestestestest");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test6972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6972");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.Locale[] localeArray3 = new java.util.Locale[] {};
        java.util.ArrayList<java.util.Locale> localeList4 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList4, localeArray3);
        java.util.Locale locale6 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.util.Locale>) localeList4);
        java.util.Locale locale7 = java.util.Locale.PRC;
        java.util.Locale locale9 = java.util.Locale.GERMANY;
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.lowerCase("HI!", locale9);
        java.lang.String str11 = locale7.getDisplayVariant(locale9);
        java.util.Locale.Category category12 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale13 = java.util.Locale.getDefault();
        java.util.Locale.setDefault(category12, locale13);
        java.util.Set<java.lang.String> strSet15 = locale13.getUnicodeLocaleKeys();
        java.util.Locale locale16 = java.util.Locale.FRANCE;
        java.util.Set<java.lang.String> strSet17 = locale16.getUnicodeLocaleKeys();
        java.util.Locale locale18 = java.util.Locale.CHINA;
        java.util.Locale locale19 = locale18.stripExtensions();
        java.lang.String str20 = locale18.getDisplayLanguage();
        java.util.Locale locale21 = java.util.Locale.CHINA;
        java.util.Locale locale22 = locale21.stripExtensions();
        java.util.Locale locale23 = java.util.Locale.FRANCE;
        java.util.Locale locale24 = java.util.Locale.TAIWAN;
        java.util.Locale locale25 = java.util.Locale.getDefault();
        java.lang.String str26 = locale25.getDisplayVariant();
        java.util.Locale locale27 = java.util.Locale.CHINA;
        java.util.Locale locale28 = locale27.stripExtensions();
        java.lang.String str29 = locale27.getDisplayLanguage();
        java.util.Locale locale30 = java.util.Locale.FRANCE;
        java.util.Set<java.lang.String> strSet31 = locale30.getUnicodeLocaleKeys();
        java.util.Locale locale32 = java.util.Locale.CHINESE;
        java.lang.String str33 = locale30.getDisplayName(locale32);
        java.lang.String str34 = locale32.getCountry();
        java.util.Locale[] localeArray35 = new java.util.Locale[] { locale9, locale13, locale16, locale18, locale21, locale23, locale24, locale25, locale27, locale32 };
        java.util.ArrayList<java.util.Locale> localeList36 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList36, localeArray35);
        java.util.Locale.FilteringMode filteringMode38 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.util.Locale> localeList39 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.util.Locale>) localeList36, filteringMode38);
        java.util.Locale.LanguageRange[] languageRangeArray40 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList41 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList41, languageRangeArray40);
        java.util.Locale[] localeArray43 = new java.util.Locale[] {};
        java.util.ArrayList<java.util.Locale> localeList44 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList44, localeArray43);
        java.util.Locale locale46 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList41, (java.util.Collection<java.util.Locale>) localeList44);
        java.util.Locale locale47 = java.util.Locale.PRC;
        java.util.Locale locale49 = java.util.Locale.GERMANY;
        java.lang.String str50 = org.apache.commons.lang3.StringUtils.lowerCase("HI!", locale49);
        java.lang.String str51 = locale47.getDisplayVariant(locale49);
        java.util.Locale.Category category52 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale53 = java.util.Locale.getDefault();
        java.util.Locale.setDefault(category52, locale53);
        java.util.Set<java.lang.String> strSet55 = locale53.getUnicodeLocaleKeys();
        java.util.Locale locale56 = java.util.Locale.FRANCE;
        java.util.Set<java.lang.String> strSet57 = locale56.getUnicodeLocaleKeys();
        java.util.Locale locale58 = java.util.Locale.CHINA;
        java.util.Locale locale59 = locale58.stripExtensions();
        java.lang.String str60 = locale58.getDisplayLanguage();
        java.util.Locale locale61 = java.util.Locale.CHINA;
        java.util.Locale locale62 = locale61.stripExtensions();
        java.util.Locale locale63 = java.util.Locale.FRANCE;
        java.util.Locale locale64 = java.util.Locale.TAIWAN;
        java.util.Locale locale65 = java.util.Locale.getDefault();
        java.lang.String str66 = locale65.getDisplayVariant();
        java.util.Locale locale67 = java.util.Locale.CHINA;
        java.util.Locale locale68 = locale67.stripExtensions();
        java.lang.String str69 = locale67.getDisplayLanguage();
        java.util.Locale locale70 = java.util.Locale.FRANCE;
        java.util.Set<java.lang.String> strSet71 = locale70.getUnicodeLocaleKeys();
        java.util.Locale locale72 = java.util.Locale.CHINESE;
        java.lang.String str73 = locale70.getDisplayName(locale72);
        java.lang.String str74 = locale72.getCountry();
        java.util.Locale[] localeArray75 = new java.util.Locale[] { locale49, locale53, locale56, locale58, locale61, locale63, locale64, locale65, locale67, locale72 };
        java.util.ArrayList<java.util.Locale> localeList76 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean77 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList76, localeArray75);
        java.util.Locale.FilteringMode filteringMode78 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.util.Locale> localeList79 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList41, (java.util.Collection<java.util.Locale>) localeList76, filteringMode78);
        java.util.Locale.FilteringMode filteringMode80 = java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES;
        java.util.List<java.util.Locale> localeList81 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.util.Locale>) localeList76, filteringMode80);
        java.lang.String str83 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.util.Locale.LanguageRange>) languageRangeList1, "aaxabxaexafxakxamxanxarxasxavxayxazxbaxbexbgxbhxbixbmxbnxboxbrxbsxcaxcexchxcoxcrxcsxcxcvxcyxdaxdexdvxdzxeexelxenxeoxesxetxexfaxffxfixfjxfoxfrxfyxgaxgdxglxgnxgxgvxhaxhexhixhoxhrxhtxhxhyxhzxiaxidxiexigxiixikxinxioxisxitxixiwxjaxjixjvxkaxkgxkixkjxkkxklxkmxknxkoxkrxksxkxkvxkwxkyxlaxlbxlgxlixlnxloxltxlxlvxmgxmhxmixmkxmlxmnxmoxmrxmsxmtxmyxnaxnbxndxnexngxnlxnnxnoxnrxnvxnyxocxojxomxorxosxpaxpixplxpsxptxqxrmxrnxroxrxrwxsaxscxsdxsexsgxsixskxslxsmxsnxsoxsqxsrxssxstxsxsvxswxtaxtextgxthxtixtkxtlxtnxtoxtrxtsxttxtwxtyxgxkxrxzxvexvixvoxwaxwoxxhxyixyoxzaxzhxz");
        java.lang.String str85 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.util.Locale.LanguageRange>) languageRangeList1, "aaaaaaaaaaaaaa");
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(localeArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(locale6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + category12 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category12.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(strSet15);
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "\u4e2d\u6587" + "'", str20, "\u4e2d\u6587");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "\u4e2d\u6587" + "'", str29, "\u4e2d\u6587");
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(strSet31);
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "zh");
// flaky:         org.junit.Assert.assertEquals("'" + str33 + "' != '" + "\u6cd5\u6587\u6cd5\u56fd)" + "'", str33, "\u6cd5\u6587\u6cd5\u56fd)");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(localeArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + filteringMode38 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode38.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(localeList39);
        org.junit.Assert.assertNotNull(languageRangeArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(localeArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNull(locale46);
        org.junit.Assert.assertNotNull(locale47);
        org.junit.Assert.assertEquals(locale47.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale49);
        org.junit.Assert.assertEquals(locale49.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "hi!" + "'", str50, "hi!");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertTrue("'" + category52 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category52.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale53);
        org.junit.Assert.assertEquals(locale53.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(strSet55);
        org.junit.Assert.assertNotNull(locale56);
        org.junit.Assert.assertEquals(locale56.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(strSet57);
        org.junit.Assert.assertNotNull(locale58);
        org.junit.Assert.assertEquals(locale58.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale59);
        org.junit.Assert.assertEquals(locale59.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "\u4e2d\u6587" + "'", str60, "\u4e2d\u6587");
        org.junit.Assert.assertNotNull(locale61);
        org.junit.Assert.assertEquals(locale61.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale62);
        org.junit.Assert.assertEquals(locale62.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale63);
        org.junit.Assert.assertEquals(locale63.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale64);
        org.junit.Assert.assertEquals(locale64.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale65);
        org.junit.Assert.assertEquals(locale65.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "" + "'", str66, "");
        org.junit.Assert.assertNotNull(locale67);
        org.junit.Assert.assertEquals(locale67.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale68);
        org.junit.Assert.assertEquals(locale68.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "\u4e2d\u6587" + "'", str69, "\u4e2d\u6587");
        org.junit.Assert.assertNotNull(locale70);
        org.junit.Assert.assertEquals(locale70.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(strSet71);
        org.junit.Assert.assertNotNull(locale72);
        org.junit.Assert.assertEquals(locale72.toString(), "zh");
// flaky:         org.junit.Assert.assertEquals("'" + str73 + "' != '" + "\u6cd5\u6587\u6cd5\u56fd)" + "'", str73, "\u6cd5\u6587\u6cd5\u56fd)");
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "" + "'", str74, "");
        org.junit.Assert.assertNotNull(localeArray75);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertTrue("'" + filteringMode78 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode78.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(localeList79);
        org.junit.Assert.assertTrue("'" + filteringMode80 + "' != '" + java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES + "'", filteringMode80.equals(java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(localeList81);
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "" + "'", str83, "");
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "" + "'", str85, "");
    }

    @Test
    public void test6973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6973");
        java.util.Locale locale3 = new java.util.Locale("!IH", "P0Y0M0DT0H0M0.034S", "\u6cd5\u6587\u6cd5\u56fd)");
        java.util.Set<java.lang.Character> charSet4 = locale3.getExtensionKeys();
        java.lang.String str5 = locale3.getLanguage();
        java.util.Locale locale7 = java.util.Locale.CHINA;
        java.util.Locale locale8 = locale7.stripExtensions();
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.lowerCase("99.00:00:0", locale7);
        boolean boolean10 = locale7.hasExtensions();
        java.util.Set<java.lang.String> strSet11 = locale7.getUnicodeLocaleKeys();
        java.lang.String str12 = locale3.getDisplayCountry(locale7);
        java.util.Locale.Category category13 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale14 = java.util.Locale.UK;
        java.util.Locale.setDefault(category13, locale14);
        java.lang.String str16 = locale7.getDisplayCountry(locale14);
        java.lang.String str17 = locale7.getCountry();
        java.lang.String str18 = locale7.getVariant();
        java.lang.String str19 = locale7.getLanguage();
// flaky:         org.junit.Assert.assertEquals(locale3.toString(), "\u6cd5\u6587\u6cd5\u56fd)");
        org.junit.Assert.assertNotNull(charSet4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "!ih" + "'", str5, "!ih");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "99.00:00:0" + "'", str9, "99.00:00:0");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "P0Y0M0DT0H0M0.034S" + "'", str12, "P0Y0M0DT0H0M0.034S");
        org.junit.Assert.assertTrue("'" + category13 + "' != '" + java.util.Locale.Category.FORMAT + "'", category13.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "China" + "'", str16, "China");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "CN" + "'", str17, "CN");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "zh" + "'", str19, "zh");
    }

    @Test
    public void test6974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6974");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "'P'YYYY'Y'M'M'D'DT'H'H'M'M'S.S'S");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test6975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6975");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("engeng", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6976");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfBlank("0 days 0 hours 0 minutes 0 seconds0 days 0 hours 0 minutes 0 seconds0 days 0 hours 0 minutes 0 secon", "                                          ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0 days 0 hours 0 minutes 0 seconds0 days 0 hours 0 minutes 0 seconds0 days 0 hours 0 minutes 0 secon" + "'", str2, "0 days 0 hours 0 minutes 0 seconds0 days 0 hours 0 minutes 0 seconds0 days 0 hours 0 minutes 0 secon");
    }

    @Test
    public void test6977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6977");
        char[] charArray13 = new char[] { 'a', ' ', '#', '4', '#', '4' };
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "HI!", charArray13);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "\u683c\u6797\u5a01\u6cbb\u6642\u9593", charArray13);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "\uad6d\uc911\uc5b4\uad6d\uc911", charArray13);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsAny("P0Y0M0DT0H0M0.121S", charArray13);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsAny("Franc", charArray13);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "-gb DAYS 0 HOURS 0 MI", charArray13);
        int int20 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "M0DT0H0M0.000S", charArray13);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "a #4#4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "a #4#4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[a,  , #, 4, #, 4]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test6978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6978");
        java.util.Locale locale1 = java.util.Locale.FRANCE;
        java.util.Set<java.lang.String> strSet2 = locale1.getUnicodeLocaleKeys();
        java.util.Locale locale3 = java.util.Locale.CHINESE;
        java.lang.String str4 = locale1.getDisplayName(locale3);
        java.util.Locale.Category category5 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale6 = java.util.Locale.UK;
        java.util.Locale.setDefault(category5, locale6);
        java.util.Locale locale8 = java.util.Locale.getDefault(category5);
        java.util.Locale locale9 = java.util.Locale.getDefault(category5);
        java.lang.String str10 = locale3.getDisplayCountry(locale9);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.upperCase("C#N", locale9);
        java.lang.String str12 = locale9.getVariant();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "zh");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u6cd5\u6587\u6cd5\u56fd)" + "'", str4, "\u6cd5\u6587\u6cd5\u56fd)");
        org.junit.Assert.assertTrue("'" + category5 + "' != '" + java.util.Locale.Category.FORMAT + "'", category5.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en_GB");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "en_GB");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "C#N" + "'", str11, "C#N");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test6979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6979");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("8", "P-1Y11-130DT2374359-159.9903599985");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test6980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6980");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu0:00:00.097");
        java.lang.String str2 = locale1.getCountry();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test6981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6981");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("     ...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "..." + "'", str1, "...");
    }

    @Test
    public void test6982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6982");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("un0", "              ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test6983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6983");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("HI!44444444444444444444444444444", '#');
        int int3 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray2);
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray2);
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray4);
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray4);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test6984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6984");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO(0L, (long) 96);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.096S" + "'", str2, "P0Y0M0DT0H0M0.096S");
    }

    @Test
    public void test6985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6985");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("P-1Y11M30DT23H59M59.664S", 14, 7);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...5..." + "'", str3, "...5...");
    }

    @Test
    public void test6986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6986");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("cuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuhi!#######ineuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuhi!#######e (cuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuhi!#######ina)fran\347\uc911\uad6d\uc5b4\uc911\uad6d)", "ihihtestestestestestest");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "cuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuhi!#######ineuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuhi!#######e (cuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuhi!#######ina)fran\347\uc911\uad6d\uc5b4\uc911\uad6d)" + "'", str2, "cuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuhi!#######ineuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuhi!#######e (cuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuhi!#######ina)fran\347\uc911\uad6d\uc5b4\uc911\uad6d)");
    }

    @Test
    public void test6987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6987");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                                                                    ", '#');
        int int6 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("0 seconds", strArray5);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray5);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray5);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.startsWithAny("!ih", strArray5);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.concatWith("de_DE", (java.lang.Object[]) strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "                                                                                                    " + "'", str7, "                                                                                                    ");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "                                                                                                    " + "'", str8, "                                                                                                    ");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "                                                                                                    " + "'", str10, "                                                                                                    ");
    }

    @Test
    public void test6988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6988");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("", 'a');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test6989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6989");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("UN00UNUN_0_0 DAYS 0 HOURS 0 MINUTES 0 SECONDS_0 DAYS 0 HOURS 0 MINUTES 0 SECONDS_0 DAYS 0P0Y0M0DT0H0M0.020S", "P-1Y11M30DT23H59M59.991S");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test6990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6990");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale locale2 = builder0.build();
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale.Builder builder4 = builder3.clearExtensions();
        java.util.Locale locale5 = builder3.build();
        java.util.Locale.Builder builder6 = builder3.clearExtensions();
        java.util.Locale.Builder builder7 = builder6.clear();
        java.util.Locale.Builder builder9 = builder7.removeUnicodeLocaleAttribute("China");
        java.util.Locale.Builder builder10 = builder9.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder12 = builder10.removeUnicodeLocaleAttribute("P0Y000DT00000.121-1");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: P0Y000DT00000.121-1 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test6991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6991");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        java.lang.String str1 = locale0.getDisplayVariant();
        java.lang.String str2 = locale0.getVariant();
        java.util.Locale.Category category3 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale4 = java.util.Locale.getDefault();
        java.util.Locale.setDefault(category3, locale4);
        java.util.Locale locale6 = java.util.Locale.getDefault();
        java.lang.String str7 = locale4.getDisplayCountry(locale6);
        java.lang.String str8 = locale0.getDisplayLanguage(locale4);
        java.lang.String str9 = locale0.getISO3Language();
        boolean boolean10 = locale0.hasExtensions();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + category3 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category3.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\u4e2d\u56fd" + "'", str7, "\u4e2d\u56fd");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\u4e2d\u6587" + "'", str8, "\u4e2d\u6587");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "zho" + "'", str9, "zho");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test6992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6992");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "anglais(Canada)");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test6993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6993");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 83, (long) 224, "ihihtestestestestestestP0Y0M0DT0H0M0.034S");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ihihte000000tetetetetetP0Y000DT00000.034141" + "'", str3, "ihihte000000tetetetetetP0Y000DT00000.034141");
    }

    @Test
    public void test6994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6994");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("                                                                                                                     !i0_ZHO", "p0y0m0dt0h0m0.068s");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                     !i0_ZHO" + "'", str2, "                                                                                                                     !i0_ZHO");
    }

    @Test
    public void test6995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6995");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("                       P0Y0M0DT0H                        ", "########chinese(china)#########");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                       P0Y0M0DT0H                        " + "'", str2, "                       P0Y0M0DT0H                        ");
    }

    @Test
    public void test6996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6996");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("               Z0_TW (P0Y0-10DT07430-10.0343599900,0 DAY93 0 0OUR93 0 0INUTE93 0 ECOND)               Ch");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Z0_TW (P0Y0-10DT07430-10.0343599900,0 DAY93 0 0OUR93 0 0INUTE93 0 ECOND)               Ch" + "'", str1, "Z0_TW (P0Y0-10DT07430-10.0343599900,0 DAY93 0 0OUR93 0 0INUTE93 0 ECOND)               Ch");
    }

    @Test
    public void test6997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6997");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale2 = java.util.Locale.CHINA;
        java.util.Locale locale3 = locale2.stripExtensions();
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.lowerCase("99.00:00:0", locale2);
        java.util.Locale.Builder builder5 = builder0.setLocale(locale2);
        java.util.Locale.Builder builder7 = builder5.setLanguage("und");
        java.util.Locale locale9 = new java.util.Locale("");
        java.lang.String str10 = locale9.getScript();
        java.util.Locale.Builder builder11 = builder7.setLocale(locale9);
        java.util.Locale.Builder builder12 = builder11.clear();
        java.util.Locale.Builder builder13 = builder11.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder16 = builder11.setUnicodeLocaleKeyword("0:00:00.99", "\u6cd5\u6587\u6cd5\u56fd)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: 0:00:00.99 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "99.00:00:0" + "'", str4, "99.00:00:0");
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertEquals(locale9.toString(), "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test6998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6998");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("fran\347ais", "\u6cd5\u6587\u6cd5\u56fd)");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test6999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6999");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("ih");
        double double2 = languageRange1.getWeight();
        double double3 = languageRange1.getWeight();
        double double4 = languageRange1.getWeight();
        java.lang.String str5 = languageRange1.getRange();
        double double6 = languageRange1.getWeight();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ih" + "'", str5, "ih");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
    }

    @Test
    public void test7000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test7000");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale2 = java.util.Locale.CHINA;
        java.util.Locale locale3 = locale2.stripExtensions();
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.lowerCase("99.00:00:0", locale2);
        java.util.Locale.Builder builder5 = builder0.setLocale(locale2);
        java.util.Locale.Builder builder7 = builder0.setLanguage("");
        java.util.Locale.Builder builder10 = builder7.setExtension('x', "");
        java.util.Locale.Builder builder12 = builder10.setLanguageTag("en");
        java.util.Locale.Builder builder13 = builder12.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder15 = builder12.setVariant("Uuuuuuuuuuuuuuuuuuuuuuuu0320.00000TD000Y0P");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: Uuuuuuuuuuuuuuuuuuuuuuuu0320.00000TD000Y0P [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "99.00:00:0" + "'", str4, "99.00:00:0");
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder13);
    }
}
