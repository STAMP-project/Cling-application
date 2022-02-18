import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest39 {

    public static boolean debug = false;

    @Test
    public void test19501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19501");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("\uc601\uc5b4                                                                                                              ", (int) '\u671d', (int) 'A');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test19502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19502");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("i\\u0020italianitalianitalianitaliit         \\xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx", "\\U002   ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test19503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19503");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("itTAiT_ITALIAN_EgAish                                                                                ", "Zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz\\XTALXAN_ITALIAN_ENGLXSHzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz", 25);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "itTAiT_ITALIAN_EgAish                                                                                " + "'", str3, "itTAiT_ITALIAN_EgAish                                                                                ");
    }

    @Test
    public void test19504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19504");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("\\AuA0046", 812, "\\u0023 (ITALIENISCH,iTALIAN)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\u0023 (ITALIENISCH,iTALIAN)\\u0023 (ITALIENISCH,iTALIAN)\\u0023 (ITALIENISCH,iTALIAN)\\u0023 (ITALIENISCH,iTALIAN)\\u0023 (ITALIENISCH,iTALIAN)\\u0023 (ITALIENISCH,iTALIAN)\\u0023 (ITALIENISCH,iTALIAN)\\u0023 (ITALIENISCH,iTALIAN)\\u0023 (ITALIENISCH,iTALIAN)\\u0023 (ITALIENISCH,iTALIAN)\\u0023 (ITALIENISCH,iTALIAN)\\u0023 (ITALIENISCH,iTALIAN)\\u0023 (ITALIENISCH,iTALIAN)\\u0023 (ITALIENISCH,iTALIAN)\\u0023 (ITALIENISCH,iTALIAN)\\u0023 (ITALIENISCH,iTALIAN)\\u0023 (ITALIENISCH,iTALIAN)\\u0023 (ITALIENISCH,iTALIAN)\\u0023 (ITALIENISCH,iTALIAN)\\u0023 (ITALIENISCH,iTALIAN)\\u0023 (ITALIENISCH,iTALIAN)\\u0023 (ITALIENISCH,iTALIAN)\\u0023 (ITALIENISCH,iTALIAN)\\u0023 (ITALIENISCH,iTALIAN)\\u0023 (ITALIENISCH,iTALIAN)\\u0023 (ITALIENISCH,iTALIAN)\\u0023 (ITALIENISCH,iTALIAN)\\u0023 (ITALIENISCH,iTALIAN)\\u0023 (ITALIENISCH,\\AuA0046" + "'", str3, "\\u0023 (ITALIENISCH,iTALIAN)\\u0023 (ITALIENISCH,iTALIAN)\\u0023 (ITALIENISCH,iTALIAN)\\u0023 (ITALIENISCH,iTALIAN)\\u0023 (ITALIENISCH,iTALIAN)\\u0023 (ITALIENISCH,iTALIAN)\\u0023 (ITALIENISCH,iTALIAN)\\u0023 (ITALIENISCH,iTALIAN)\\u0023 (ITALIENISCH,iTALIAN)\\u0023 (ITALIENISCH,iTALIAN)\\u0023 (ITALIENISCH,iTALIAN)\\u0023 (ITALIENISCH,iTALIAN)\\u0023 (ITALIENISCH,iTALIAN)\\u0023 (ITALIENISCH,iTALIAN)\\u0023 (ITALIENISCH,iTALIAN)\\u0023 (ITALIENISCH,iTALIAN)\\u0023 (ITALIENISCH,iTALIAN)\\u0023 (ITALIENISCH,iTALIAN)\\u0023 (ITALIENISCH,iTALIAN)\\u0023 (ITALIENISCH,iTALIAN)\\u0023 (ITALIENISCH,iTALIAN)\\u0023 (ITALIENISCH,iTALIAN)\\u0023 (ITALIENISCH,iTALIAN)\\u0023 (ITALIENISCH,iTALIAN)\\u0023 (ITALIENISCH,iTALIAN)\\u0023 (ITALIENISCH,iTALIAN)\\u0023 (ITALIENISCH,iTALIAN)\\u0023 (ITALIENISCH,iTALIAN)\\u0023 (ITALIENISCH,\\AuA0046");
    }

    @Test
    public void test19505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19505");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("itTAiT_ITALIAN_EgAish                                                                                ");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "itTAiT_ITALIAN_EgAish" + "'", str2, "itTAiT_ITALIAN_EgAish");
    }

    @Test
    public void test19506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19506");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "\\FranzosischFranzosisch (Frankreich)0034\\FranzosischFranzosisch (Frankreich)00                                             hFranzosischFranzosisch (Frankreich)                                             \\FranzosischFranzosisch (Frankreich)0034\\FranzosischFranzosisch (Frankreich)00 (\\U0020IITALIAN\\U0020I)", (java.lang.CharSequence) "English (United Kingdom)");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test19507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19507");
        java.util.Locale locale3 = new java.util.Locale("E             g", "italiano", "HI!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = locale3.getISO3Country();
            org.junit.Assert.fail("Expected exception of type java.util.MissingResourceException; message: Couldn't find 3-letter country code for ITALIANO");
        } catch (java.util.MissingResourceException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(locale3.toString(), "e             g_ITALIANO_HI!");
    }

    @Test
    public void test19508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19508");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "\u82f1\u6587\u82f1\u6587\u82f1\u6587\u82f1\u6587TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTaaaaaaaaaaaaaaaaaaaaaaaaFranz\366sisch(Frankreich)aaaaaaaaaaaaaaaaaaaaaaaa", "eng");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test19509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19509");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC\\u00de\\u00CCCCCCCCCCCCCCCCCCCCCCCCC...", "r0                                               nailati                                                ");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test19510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19510");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("hhhhhhhhhh", "44444444444444ITALIAN444444444444444444444444ITALIAN444444444444444444444444ITALIAN444444444444444444444444ITALIAN444444444444444444444444ITALIAN444444444444444444444444ITALIAN444444444444444444444444ITALIAN444444444444444444444444ITALIAN444444444444444444444444ITALIAN444444444444444444444444ITALIAN4444444444", (int) '!');
        int int5 = org.apache.commons.lang3.StringUtils.indexOfAny("ZH_cnFrench (Canada)", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test19511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19511");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("", 224);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                " + "'", str2, "                                                                                                                                                                                                                                ");
    }

    @Test
    public void test19512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19512");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("44444444444444444444444444444444!IHg44444444444444444444444444444444!IH44444444444444444444444444444444!IH");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test19513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19513");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("Italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian", "...                               ", 223);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test19514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19514");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "         ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 9 + "'", int1 == 9);
    }

    @Test
    public void test19515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19515");
        java.util.Locale locale1 = new java.util.Locale("                                                                                          \\u005c         ");
        org.junit.Assert.assertEquals(locale1.toString(), "                                                                                          \\u005c         ");
    }

    @Test
    public void test19516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19516");
        java.lang.String str1 = org.apache.commons.lang3.CharUtils.toString('0');
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0" + "'", str1, "0");
    }

    @Test
    public void test19517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19517");
        char[] charArray7 = new char[] { ' ', '4' };
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "HI!", charArray7);
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!", charArray7);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsAny("deutsch", charArray7);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "!_\\u0020_iTLE#####################################!_\\u0020_iTLE######################################", charArray7);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsAny(")modgniK detinU( hsilgnE", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[ , 4]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test19518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19518");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "tali...an");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test19519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19519");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("ZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZhsxlgne_n", "9hhhhhhhhhh                                                             ", 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test19520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19520");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("chinese", "\\u0034\\u00                                             hDi!        (\\U0020,ItalicniueD#########################################################################################stuD                                             \\u0034\\u00");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "chinese" + "'", str2, "chinese");
    }

    @Test
    public void test19521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19521");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test19522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19522");
        java.util.Locale locale2 = new java.util.Locale("\\u0020iTALIANiTALIANiTALIANiTALI\\u0020iTALIANiTALIANiTALIANiTAL", "allemand");
        java.lang.String str3 = locale2.getDisplayCountry();
        java.lang.Object obj4 = locale2.clone();
        org.junit.Assert.assertEquals(locale2.toString(), "\\u0020italianitalianitalianitali\\u0020italianitalianitalianital_ALLEMAND");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ALLEMAND" + "'", str3, "ALLEMAND");
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "\\u0020italianitalianitalianitali\\u0020italianitalianitalianital_ALLEMAND");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "\\u0020italianitalianitalianitali\\u0020italianitalianitalianital_ALLEMAND");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "\\u0020italianitalianitalianitali\\u0020italianitalianitalianital_ALLEMAND");
    }

    @Test
    public void test19523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19523");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("u", 'A');
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("BGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGTALIAN");
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.replaceEach("!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I", strArray4, strArray6);
        java.lang.String[] strArray12 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("!IH", "       !IH", (int) (byte) 1);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray12, ' ');
        int int15 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray12);
        java.lang.String[] strArray18 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("", "Deutsch");
        java.lang.String[] strArray20 = org.apache.commons.lang3.StringUtils.stripAll(strArray18, "franz\366sisch (frankreich)");
        java.lang.String str22 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray18, ' ');
        java.lang.String str23 = org.apache.commons.lang3.StringUtils.replaceEach("It_I", strArray12, strArray18);
        java.lang.String str24 = org.apache.commons.lang3.StringUtils.replaceEach("\\U0069HHHHHHHHHH", strArray4, strArray12);
        java.lang.String str25 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray12);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I" + "'", str7, "!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "!IH" + "'", str14, "!IH");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "It_I" + "'", str23, "It_I");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "\\U0069HHHHHHHHHH" + "'", str24, "\\U0069HHHHHHHHHH");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "!IH" + "'", str25, "!IH");
    }

    @Test
    public void test19524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19524");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("hI!hI!hI!hI!hI!CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC\\u00d\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\U0020ITALIANITALIANITALIANITALI\\U0020ITALIANITALIANITALIANITAL\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\u00CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC", '\u6cd5');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hI!hI!hI!hI!hI!CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC\\u00d\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\U0020ITALIANITALIANITALIANITALI\\U0020ITALIANITALIANITALIANITAL\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\u00CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC" + "'", str2, "hI!hI!hI!hI!hI!CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC\\u00d\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\U0020ITALIANITALIANITALIANITALI\\U0020ITALIANITALIANITALIANITAL\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\u00CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC");
    }

    @Test
    public void test19525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19525");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("EAGAASH                                                                                                                                                                                                                                                                                                                                                                                                    ", (int) '\n', 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum abbreviation width is 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test19526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19526");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale locale2 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str3 = locale2.getDisplayName();
        java.util.Locale.Builder builder4 = builder1.setLocale(locale2);
        java.util.Locale.Builder builder6 = builder1.setLanguage("und");
        java.util.Locale locale7 = builder6.build();
        java.util.Locale locale8 = builder6.build();
        java.lang.String str9 = locale8.toLanguageTag();
        java.util.Locale.setDefault(locale8);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fr_CA");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\ud504\ub791\uc2a4\uc5b4\uce90\ub098\ub2e4)" + "'", str3, "\ud504\ub791\uc2a4\uc5b4\uce90\ub098\ub2e4)");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "und_CA");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "und_CA");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "und-CA" + "'", str9, "und-CA");
    }

    @Test
    public void test19527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19527");
        java.util.Locale locale1 = java.util.Locale.ENGLISH;
        java.lang.String str2 = locale1.getDisplayLanguage();
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.upperCase("!IH", locale1);
        java.util.Set<java.lang.Character> charSet4 = locale1.getExtensionKeys();
        java.lang.String str5 = locale1.getDisplayVariant();
        java.lang.String str6 = locale1.getLanguage();
        java.util.Locale locale7 = locale1.stripExtensions();
        java.util.Locale.setDefault(locale7);
        java.lang.String str9 = locale7.toLanguageTag();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "English" + "'", str2, "English");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!IH" + "'", str3, "!IH");
        org.junit.Assert.assertNotNull(charSet4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "en" + "'", str6, "en");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "en" + "'", str9, "en");
    }

    @Test
    public void test19528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19528");
        java.util.Locale locale0 = java.util.Locale.ITALIAN;
        java.lang.String str2 = locale0.getExtension('h');
        java.lang.String str3 = locale0.getVariant();
        java.util.Set<java.lang.String> strSet4 = locale0.getUnicodeLocaleAttributes();
        java.lang.String str5 = locale0.toLanguageTag();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "it" + "'", str5, "it");
    }

    @Test
    public void test19529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19529");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("ZH_cnFrench (Canada)", 10, 'u');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ZH_cnFrench (Canada)" + "'", str3, "ZH_cnFrench (Canada)");
    }

    @Test
    public void test19530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19530");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("dddddddddddddddddddddddddddddddddddddddddddddddddeddddddddddddddddddddddddddddddddddddddddddddddddd", 'R');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "dddddddddddddddddddddddddddddddddddddddddddddddddeddddddddddddddddddddddddddddddddddddddddddddddddd" + "'", str2, "dddddddddddddddddddddddddddddddddddddddddddddddddeddddddddddddddddddddddddddddddddddddddddddddddddd");
    }

    @Test
    public void test19531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19531");
        java.util.Locale locale0 = java.util.Locale.ITALIAN;
        java.lang.String str1 = locale0.getDisplayLanguage();
        java.util.Locale locale2 = locale0.stripExtensions();
        java.lang.String str3 = locale0.getDisplayVariant();
        java.lang.String str4 = locale0.getDisplayVariant();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Italian" + "'", str1, "Italian");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "it");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test19532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19532");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "nglischIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test19533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19533");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("                                                         hcstued                                                         ", "FR");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test19534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19534");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("HI!HI");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI!HI" + "'", str1, "HI!HI");
    }

    @Test
    public void test19535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19535");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("IIIIIIIII");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "IIIIIIIII" + "'", str1, "IIIIIIIII");
    }

    @Test
    public void test19536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19536");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("EEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEE", "1\\u0061\\u0061\\u0061");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test19537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19537");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "hhhhhhhhhh");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test19538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19538");
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
        java.util.Locale.Builder builder16 = builder15.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder19 = builder16.setUnicodeLocaleKeyword("LHcsineilat", "\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069!IH\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\englisch");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: LHcsineilat [at index 0]");
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
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Italian" + "'", str8, "Italian");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "it");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(charSet14);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder16);
    }

    @Test
    public void test19539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19539");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("E");
        java.lang.String str2 = languageRange1.getRange();
        double double3 = languageRange1.getWeight();
        double double4 = languageRange1.getWeight();
        java.lang.String str5 = languageRange1.getRange();
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.split("a700u\\");
        boolean boolean8 = languageRange1.equals((java.lang.Object) strArray7);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "e" + "'", str2, "e");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "e" + "'", str5, "e");
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test19540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19540");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\ub3c5\uc77c\uc5b4\r\r\r\r\rfra", 64, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\ub3c5\uc77c\uc5b4\r\r\r\r\rfra" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\ub3c5\uc77c\uc5b4\r\r\r\r\rfra");
    }

    @Test
    public void test19541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19541");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "hI!hI!hI!hI!hI!CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC\\u00d\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\U0020ITALIANITALIANITALIANITALI\\U0020ITALIANITALIANITALIANITAL\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\u00CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI!hI!hI!hI!hI!CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC\\u00d\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\U0020ITALIANITALIANITALIANITALI\\U0020ITALIANITALIANITALIANITAL\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\u00CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC" + "'", str1, "HI!hI!hI!hI!hI!CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC\\u00d\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\U0020ITALIANITALIANITALIANITALI\\U0020ITALIANITALIANITALIANITAL\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\u00CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC");
    }

    @Test
    public void test19542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19542");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("CCCC\\CCCCC                                                             ", "cCCCC...", (int) '4');
        int int5 = org.apache.commons.lang3.StringUtils.indexOfAny("    \\    ", strArray4);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, "aaaaaaaaaaaaaaaaaaaaaaaaaaILATiNA...aaaaaaaaaaaaaaaaaaaaaaaaaa", (int) 'A', 34);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test19543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19543");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("\\u0044", "ja");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test19544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19544");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterType("hIAN\\U0020Ih");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray2);
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "hi!        (\\U0020,Italifran\347#######################");
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.concatWith("2CINESE (CINA...", (java.lang.Object[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "h2CINESE (CINA...IAN2CINESE (CINA...\\2CINESE (CINA...U2CINESE (CINA...00202CINESE (CINA...I2CINESE (CINA...h" + "'", str6, "h2CINESE (CINA...IAN2CINESE (CINA...\\2CINESE (CINA...U2CINESE (CINA...00202CINESE (CINA...I2CINESE (CINA...h");
    }

    @Test
    public void test19545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19545");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("#########FranzosischFranzosisch (Frankreich)");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "#########FranzosischFranzosisch (Frankreich" + "'", str1, "#########FranzosischFranzosisch (Frankreich");
    }

    @Test
    public void test19546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19546");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("5", '9');
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5" + "'", str3, "5");
    }

    @Test
    public void test19547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19547");
        char char2 = org.apache.commons.lang3.CharUtils.toChar((java.lang.Character) 'a', 'D');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + 'a' + "'", char2 == 'a');
    }

    @Test
    public void test19548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19548");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDED...", "FR_CA                             ...!       \\U0034\\U0034\\U0034\\U0034\\U0034\\U0034\\U0034\\U0034\\U0034\\     ", (int) 'R', 49);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBFR_CA                             ...!       \\U0034\\U0034\\U0034\\U0034\\U0034\\U0034\\U0034\\U0034\\U0034\\     CFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDED..." + "'", str4, "ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBFR_CA                             ...!       \\U0034\\U0034\\U0034\\U0034\\U0034\\U0034\\U0034\\U0034\\U0034\\     CFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDED...");
    }

    @Test
    public void test19549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19549");
        java.util.Locale locale1 = new java.util.Locale("CA");
        java.lang.String str2 = locale1.getISO3Country();
        java.lang.String str3 = locale1.toString();
        org.junit.Assert.assertEquals(locale1.toString(), "ca");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ca" + "'", str3, "ca");
    }

    @Test
    public void test19550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19550");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("8ian\\u0020i86");
        java.lang.String str2 = locale1.getVariant();
        java.lang.String str3 = locale1.getCountry();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test19551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19551");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.util.Locale locale1 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str2 = locale0.getDisplayScript(locale1);
        java.lang.String str3 = locale1.getVariant();
        java.util.Set<java.lang.String> strSet4 = locale1.getUnicodeLocaleKeys();
        java.lang.String str5 = locale1.getDisplayLanguage();
        java.lang.String str6 = locale1.getDisplayScript();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "French" + "'", str5, "French");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test19552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19552");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("\\aUa0046", "ECANADAgCANADACANADAsh                                                                                                  ");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\aUa0046" + "'", str3, "\\aUa0046");
    }

    @Test
    public void test19553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19553");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.setLanguageTag("Italian");
        java.util.Locale.Builder builder4 = builder0.clearExtensions();
        java.util.Locale.Builder builder5 = builder0.clear();
        java.util.Locale.Builder builder6 = builder0.clearExtensions();
        java.util.Locale.Builder builder8 = builder0.setScript("");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder10 = builder8.removeUnicodeLocaleAttribute("                                                    k             ");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute:                                                     k              [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test19554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19554");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("GGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGFRA", (int) 'b', 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGFRA" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGFRA");
    }

    @Test
    public void test19555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19555");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("IIIIIIIIII000000000000000000000000000000000000000000...IIIIIIIIII");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "IIIIIIIIII000000000000000000000000000000000000000000...IIIIIIIIII" + "'", str1, "IIIIIIIIII000000000000000000000000000000000000000000...IIIIIIIIII");
    }

    @Test
    public void test19556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19556");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("Uuuuu");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Uuuuu" + "'", str1, "Uuuuu");
    }

    @Test
    public void test19557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19557");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "44444444444444444444444444444444444444444444it                   ", (java.lang.CharSequence) "zH_CN");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test19558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19558");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("franc");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "FRANC" + "'", str1, "FRANC");
    }

    @Test
    public void test19559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19559");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("CCCCCCIAN\\U0020ICCCCCCC", "ckclcmcncocrcucvcwcxcyczdedh...ibjblbmbnbobqbrbsbtbvbwbybzcacccdcfcgchcialamanaoaqarasatauawaxazbabbbdbebfbgbhbiadaeafaga");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test19560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19560");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("!IH!IH!IH!IH!IH!IH!IH!IH!IH!IHTEDESCO    !IH!IH!IH!IH!IH!IH!IH!IH!IH!IH", "-RF", (int) 'S');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test19561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19561");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("...emandtalienischallemandi...", "    ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test19562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19562");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("italian (italian,eng_KOKOKO_      ", '\r');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test19563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19563");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("...ENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENG_                                                                    \\u00...");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=...engengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengeng_                                                                    \\u00...");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test19564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19564");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "CCCC\\CCCCC");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test19565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19565");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("ITALIEITALNC_HZ\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rITALIEITAL", 82);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test19566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19566");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("IIIIIIIIIIIIIIIIIIIIIIIIIIITALIAN_ITALIAN_ENGLISHIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII", "ZH_cnFrench (Canada)AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA\r\r\r\r\r\r\r\r\\u0061ItalienischItalienischItalienischItalienischItalienischItalienischItalienischItalienischItalie\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\\u0061ItalienischItalienischItalienischItalienischItalienischItalienischItalienischItalienischItalie\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\\u0061ItalienischI");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test19567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19567");
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
        java.util.Locale.Builder builder16 = builder15.clear();
        java.util.Locale locale17 = builder15.build();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "it");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Italian" + "'", str8, "Italian");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "it");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(charSet14);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "");
    }

    @Test
    public void test19568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19568");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rZH_CN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ZH_CN" + "'", str1, "ZH_CN");
    }

    @Test
    public void test19569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19569");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.setLanguageTag("Italian");
        java.util.Locale.Builder builder4 = builder0.clearExtensions();
        java.util.Locale.Builder builder5 = builder0.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder7 = builder5.addUnicodeLocaleAttribute("\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: \\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test19570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19570");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("", ".Korean (South Korea)Korean (So");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test19571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19571");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("\\u0029fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran", "IAN\\U0020I");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\u0029fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran" + "'", str2, "\\u0029fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran");
    }

    @Test
    public void test19572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19572");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("nglish (united kingdom", 2);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test19573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19573");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("                              de_de                              ", "English(UnitedKingdom)", 262);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test19574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19574");
        java.util.Locale locale0 = java.util.Locale.getDefault();
        java.lang.String str1 = locale0.getLanguage();
        java.lang.String str2 = locale0.getScript();
        java.lang.String str3 = locale0.getISO3Country();
        java.lang.String str4 = locale0.getCountry();
        java.util.Locale.Builder builder5 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder6 = builder5.clearExtensions();
        java.util.Locale locale7 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str8 = locale7.getDisplayName();
        java.util.Locale.Builder builder9 = builder6.setLocale(locale7);
        java.util.Locale locale10 = java.util.Locale.GERMANY;
        java.util.Locale.Builder builder11 = builder6.setLocale(locale10);
        java.util.Set<java.lang.String> strSet12 = locale10.getUnicodeLocaleAttributes();
        java.lang.String str13 = locale10.getVariant();
        java.util.Locale.setDefault(locale10);
        java.lang.String str15 = locale0.getDisplayCountry(locale10);
        java.lang.String str16 = locale10.getISO3Language();
        org.junit.Assert.assertNotNull(locale0);
// flaky:         org.junit.Assert.assertEquals(locale0.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "en" + "'", str1, "en");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "USA" + "'", str3, "USA");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "US" + "'", str4, "US");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "French (Canada)" + "'", str8, "French (Canada)");
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "de_DE");
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Vereinigte Staaten von Amerika" + "'", str15, "Vereinigte Staaten von Amerika");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "deu" + "'", str16, "deu");
    }

    @Test
    public void test19575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19575");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "gbr                                                                          ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test19576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19576");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("FRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhAeeeeeeeeeeeex");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=fraadzhaezhafzhagzhaizhalzhamzhanzhaozhaqzharzhaszhaeeeeeeeeeeeex");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test19577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19577");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "!ih    Deutsc!ih    Deutsc!ih    Deutsc!ih    Deutsc!ih    Deutsc!ih    Deu       ", (java.lang.CharSequence) "DEUTSCD\\XTALXAN_ITALIAN_ENGLXSH");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 80 + "'", int2 == 80);
    }

    @Test
    public void test19578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19578");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII", "                ", 105);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII" + "'", str3, "IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII");
    }

    @Test
    public void test19579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19579");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterType("\\u00de\\u00\\u00de\\u00\\u00d         INGLESE        ");
        boolean boolean3 = org.apache.commons.lang3.StringUtils.endsWithAny("                                             \\u0066                                              ", strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test19580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19580");
        java.util.Locale locale1 = java.util.Locale.FRANCE;
        java.util.Locale locale2 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str3 = locale1.getDisplayScript(locale2);
        java.lang.String str4 = locale2.getVariant();
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.lowerCase("\\u0034", locale2);
        java.lang.String str6 = locale2.getDisplayName();
        java.util.Locale.Category category7 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale8 = java.util.Locale.getDefault(category7);
        java.util.Locale locale9 = java.util.Locale.FRANCE;
        java.util.Locale locale10 = java.util.Locale.ITALIAN;
        java.lang.String str12 = locale10.getExtension('h');
        java.lang.String str13 = locale9.getDisplayScript(locale10);
        java.util.Locale locale14 = locale9.stripExtensions();
        java.util.Set<java.lang.String> strSet15 = locale14.getUnicodeLocaleAttributes();
        java.util.Locale.setDefault(category7, locale14);
        java.lang.String str17 = locale2.getDisplayLanguage(locale14);
        java.lang.String str18 = locale14.toLanguageTag();
        java.lang.Class<?> wildcardClass19 = locale14.getClass();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\\u0034" + "'", str5, "\\u0034");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Franz\366sisch (Kanada)" + "'", str6, "Franz\366sisch (Kanada)");
        org.junit.Assert.assertTrue("'" + category7 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category7.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "de_DE");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "it");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(strSet15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "fran\347ais" + "'", str17, "fran\347ais");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "fr-FR" + "'", str18, "fr-FR");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test19581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19581");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList6 = new java.util.ArrayList<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList6, strArray5);
        java.util.Locale.FilteringMode filteringMode8 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList9 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strList6, filteringMode8);
        java.lang.String[] strArray29 = new java.lang.String[] { "hi!       ", "Italienisch", "italian_ITALIAN_English", "HI!", "hi!", "ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDED...", "\\u0034", "HI!", "Italian", "\\u0061", "\\u0023", "hi!", "iTALIAN", "Chinese (China)", "hi!", "zh_CN", "iTALIAN", "en", "Italienisch" };
        java.util.ArrayList<java.lang.String> strList30 = new java.util.ArrayList<java.lang.String>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList30, strArray29);
        java.util.Locale.LanguageRange[] languageRangeArray32 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList33 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList33, languageRangeArray32);
        java.lang.String[] strArray37 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList38 = new java.util.ArrayList<java.lang.String>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList38, strArray37);
        java.util.Locale.FilteringMode filteringMode40 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList41 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList33, (java.util.Collection<java.lang.String>) strList38, filteringMode40);
        java.util.List<java.lang.String> strList42 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strList30, filteringMode40);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap43 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList44 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap43);
        java.lang.Class<?> wildcardClass45 = languageRangeList44.getClass();
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + filteringMode8 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode8.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(languageRangeArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + filteringMode40 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode40.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList41);
        org.junit.Assert.assertNotNull(strList42);
        org.junit.Assert.assertNotNull(languageRangeList44);
        org.junit.Assert.assertNotNull(wildcardClass45);
    }

    @Test
    public void test19582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19582");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("", 113);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test19583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19583");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale locale2 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str3 = locale2.getDisplayName();
        java.util.Locale.Builder builder4 = builder1.setLocale(locale2);
        java.util.Locale.Builder builder5 = builder4.clear();
        java.util.Locale.Builder builder7 = builder5.setLanguage("ITALIAN");
        java.util.Locale.Builder builder9 = builder7.setLanguage("FRA");
        java.util.Locale.Builder builder10 = builder7.clear();
        java.util.Locale.Builder builder11 = builder10.clearExtensions();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "fran\347ais (Canada)" + "'", str3, "fran\347ais (Canada)");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test19584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19584");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.setLanguageTag("Italian");
        java.util.Locale.Builder builder4 = builder0.clearExtensions();
        java.util.Locale.Builder builder5 = builder0.clear();
        java.util.Locale locale7 = java.util.Locale.forLanguageTag("\\u0020");
        java.util.Locale.Builder builder8 = builder0.setLocale(locale7);
        java.util.Locale.Builder builder11 = builder0.setExtension('u', "Italian");
        java.util.Locale.Builder builder13 = builder0.setLanguageTag("ixii");
        java.util.Locale.Builder builder14 = builder0.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder16 = builder14.setRegion("TALIAN\\U0023AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: TALIAN\\U0023AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA [at index 0]");
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
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder14);
    }

    @Test
    public void test19585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19585");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("talian_ITALIAN_English         ital");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "talian_ITALIAN_English         ital" + "'", str1, "talian_ITALIAN_English         ital");
    }

    @Test
    public void test19586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19586");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("44444444ITALIAN444444444444444444444444ITALIAN444444444444444444444444ITALIAN444444444444444444444444ITALIAN444444444444444444444444ITALIAN444444444444444444444444ITALIAN444444444444444444444444ITALIAN444444444444444444444444ITALIAN444444444444444444444444ITALIAN4444444444", "Chinesisch (Ch");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test19587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19587");
        java.util.Locale locale1 = new java.util.Locale("\\U0078");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("EAGAASH                                                                                                                                                                                                                                                                                                                                                                                                    ", '8');
        boolean boolean5 = locale1.equals((java.lang.Object) strArray4);
        org.junit.Assert.assertEquals(locale1.toString(), "\\u0078");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test19588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19588");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale locale2 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str3 = locale2.getDisplayName();
        java.util.Locale.Builder builder4 = builder1.setLocale(locale2);
        java.util.Locale.Builder builder5 = builder4.clear();
        java.util.Locale.Builder builder6 = builder4.clearExtensions();
        java.util.Locale.Builder builder7 = builder6.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder9 = builder6.setLanguage("c500u");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: c500u [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "fran\347ais (Canada)" + "'", str3, "fran\347ais (Canada)");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test19589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19589");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale locale2 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str3 = locale2.getDisplayName();
        java.util.Locale.Builder builder4 = builder1.setLocale(locale2);
        java.util.Locale.Builder builder5 = builder4.clear();
        java.util.Locale.Builder builder7 = builder5.setLanguage("ITALIAN");
        java.util.Locale locale9 = new java.util.Locale("n44444444444444alia44444444444444it");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder10 = builder5.setLocale(locale9);
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: n44444444444444alia44444444444444it [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "fran\347ais (Canada)" + "'", str3, "fran\347ais (Canada)");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertEquals(locale9.toString(), "n44444444444444alia44444444444444it");
    }

    @Test
    public void test19590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19590");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('a', 224);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 224 + "'", int2 == 224);
    }

    @Test
    public void test19591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19591");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("HHHHHHHHHHtTAHHHHHHHHHHT_ITAhIAN\\U0020Ih", 400, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test19592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19592");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("Italia", "iiiiiiiiiiiFrankreichNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN", (int) (byte) 100);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, 'Y', 241, (int) 'U');
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test19593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19593");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("Franz\366sisch (Kanada", '4');
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray2);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Franz\366sisch (Kanada" + "'", str3, "Franz\366sisch (Kanada");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Franz\366sisch (Kanada" + "'", str4, "Franz\366sisch (Kanada");
    }

    @Test
    public void test19594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19594");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("und-CA", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test19595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19595");
        java.lang.String[] strArray1 = null;
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("BFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEKoreanADA", strArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test19596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19596");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("kkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkedkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "kkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkedkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk" + "'", str1, "kkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkedkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk");
    }

    @Test
    public void test19597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19597");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("itTAiT_ITALIAN_EgAish                                                                                ", "Franz\366sisch (Kanada)");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Franz\366sisch (Kanada)" + "'", str2, "Franz\366sisch (Kanada)");
    }

    @Test
    public void test19598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19598");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale1 = java.util.Locale.getDefault(category0);
        java.util.Locale locale3 = java.util.Locale.forLanguageTag("JP");
        java.util.Locale.setDefault(category0, locale3);
        java.util.Locale locale5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.setDefault(category0, locale5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Can't set default locale to NULL");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "de_DE");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "jp");
    }

    @Test
    public void test19599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19599");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("EEEEEEEEEFRAEEEEEEEEE", "hhh italia");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test19600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19600");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("    \\    ", strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=\\");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test19601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19601");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaFranz\366sisc");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 46 + "'", int1 == 46);
    }

    @Test
    public void test19602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19602");
        char[] charArray9 = new char[] { ' ', '4' };
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "HI!", charArray9);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!", charArray9);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "h", charArray9);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "\\italian_ITALIAN_English", charArray9);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "Franz\366sischFranzosisch (Frankreich)", charArray9);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsAny("\\U0020ITALIANITALIANITALIANITALI\\U0020ITALIANITALIANITALIANITALHcsineilatI", charArray9);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsAny("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\U0020ITALIANITALIANITALIANITALI\\U0020ITALIANITALIANITALIANITAL\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\", charArray9);
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
    public void test19603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19603");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.setLanguageTag("Italian");
        java.util.Locale.Builder builder4 = builder0.clearExtensions();
        java.util.Locale.Builder builder5 = builder0.clear();
        java.util.Locale.Builder builder6 = builder0.clearExtensions();
        java.util.Locale.Builder builder8 = builder0.setScript("");
        java.util.Locale locale10 = java.util.Locale.forLanguageTag("en");
        java.util.Locale locale11 = java.util.Locale.ITALIAN;
        java.util.Set<java.lang.Character> charSet12 = locale11.getExtensionKeys();
        java.lang.String str13 = locale11.getVariant();
        java.lang.String str14 = locale11.getDisplayScript();
        java.lang.String str15 = locale10.getDisplayCountry(locale11);
        java.util.Locale.Builder builder16 = builder8.setLocale(locale10);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder18 = builder8.setLanguageTag("HI!tttttttHI!tttttttHI!tttttttHI!tttttttHI!tttttttHI!tttttttHI!tttttttHI!tttttttHI!tttttttHI!tttttttHI!tttttttHI!tttttttHI!tttttttHI!tttttttHI!tttttttHI!");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Invalid subtag: HI!tttttttHI!tttttttHI!tttttttHI!tttttttHI!tttttttHI!tttttttHI!tttttttHI!tttttttHI!tttttttHI!tttttttHI!tttttttHI!tttttttHI!tttttttHI!tttttttHI!tttttttHI! [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "it");
        org.junit.Assert.assertNotNull(charSet12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(builder16);
    }

    @Test
    public void test19604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19604");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("anihC");
        java.lang.String str2 = languageRange1.getRange();
        java.lang.String str3 = languageRange1.getRange();
        boolean boolean5 = languageRange1.equals((java.lang.Object) "italian (italian,eng\\u0061\\u0061\\u0061\\u0");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "anihc" + "'", str2, "anihc");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "anihc" + "'", str3, "anihc");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test19605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19605");
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
        java.util.Locale.Builder builder15 = builder11.clearExtensions();
        java.util.Locale locale16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder17 = builder15.setLocale(locale16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
    public void test19606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19606");
        char char2 = org.apache.commons.lang3.CharUtils.toChar((java.lang.Character) 'C', 'D');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + 'C' + "'", char2 == 'C');
    }

    @Test
    public void test19607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19607");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("hIAN\\U0020Ihie", "English (United States)", "\\u0061ItalifnischItalifnischItalifnischItalifnischItalifnischItalifnischItalifnischItalifnischItalif", (int) 'G');
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hIAN\\U0020Ihie" + "'", str4, "hIAN\\U0020Ihie");
    }

    @Test
    public void test19608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19608");
        java.util.Locale locale2 = new java.util.Locale("");
        java.util.Locale.setDefault(locale2);
        java.util.Set<java.lang.Character> charSet4 = locale2.getExtensionKeys();
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.upperCase("italian_ITALIAN_EnglisF", locale2);
        java.util.Set<java.lang.String> strSet6 = locale2.getUnicodeLocaleKeys();
        java.lang.String str7 = locale2.getISO3Country();
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertNotNull(charSet4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ITALIAN_ITALIAN_ENGLISF" + "'", str5, "ITALIAN_ITALIAN_ENGLISF");
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test19609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19609");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("KKKKKKKKKKKKKKKKKEAGAASH", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "KKKKKKKKKKKKKKKKKEAGAASH" + "'", str2, "KKKKKKKKKKKKKKKKKEAGAASH");
    }

    @Test
    public void test19610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19610");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("", "                                                                                                              ...", "                                                                        ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test19611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19611");
        boolean boolean1 = org.apache.commons.lang3.CharUtils.isAsciiAlphaLower('b');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test19612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19612");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("cor\351en (Cor\351e du Sud)");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "cor\351en (Cor\351e du Sud)" + "'", str1, "cor\351en (Cor\351e du Sud)");
    }

    @Test
    public void test19613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19613");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale locale2 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str3 = locale2.getDisplayName();
        java.util.Locale.Builder builder4 = builder1.setLocale(locale2);
        java.util.Locale.Builder builder6 = builder1.setLanguage("und");
        java.util.Locale.Builder builder7 = builder1.clear();
        java.util.Locale locale8 = builder1.build();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder10 = builder1.setLanguage("FRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFR");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: FRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFR [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "French (Canada)" + "'", str3, "French (Canada)");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "");
    }

    @Test
    public void test19614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19614");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("ititaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitai", "ECANADAgCANADACANADAsh", "iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiitalian_italian_englishiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii", (int) '.');
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ititaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitai" + "'", str4, "ititaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitai");
    }

    @Test
    public void test19615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19615");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064" + "'", str1, "\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064");
    }

    @Test
    public void test19616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19616");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("AD4AE4AF4AG4AI4AL4AM4AN4AO4AQ4AR4AS4AT4AU4AW4AX4AZ4BA4BB4BD4BE4BF4BG4BH4BI4BJ4BL4BM4BN4BO4BQ4BR4BS4BT4BV4BW4BY4BZ4CA4CC4CD4CF4CG4CH4CI4CK4CL4CM4CN4CO4CR4CU4CV4CW4CX4CY4CZ4DE4DJ4DK4DM4DO4DZ4EC4EE4EG4EH4ER4ES4ET4FI4FJ4FK4FM4FO4FR4GA4GB4GD4GE4GF4GG4GH4GI4GL4GM4GN4GP4GQ4GR4GS4GT4GU4GW4GY4HK4HM4HN4HR4HT4HU4ID4IE4IL4IM4IN4IO4IQ4IR4IS4IT4JE4JM4JO4JP4KE4KG4KH4KI4KM4KN4KP4KR4KW4KY4KZ4LA4LB4LC4LI4LK4LR4LS4LT4LU4LV4LY4MA4MC4MD4ME4MF4MG4MH4MK4ML4MM4MN4MO4MP4MQ4MR4MS4MT4MU4MV4MW4MX4MY4MZ4NA4NC4NE4NF4NG4NI4NL4NO4NP4NR4NU4NZ4OM4PA4PE4PF4PG4PH4PK4PL4PM4PN4PR4PS4PT4PW4PY4QA4RE4RO4RS4RU4RW4SA4SB4SC4SD4SE4SG4SH4SI4SJ4SK4SL4SM4SN4SO4SR4SS4ST4SV4SX4SY4SZ4TC4TD4TF4TG4TH4TJ4TK4TL4TM4TN4TO4TR4TT4TV4TW4TZ4UA4UG4UM4US4UY4UZ4VA4VC4VE4VG4VI4VN4VU4WF4WS4YE4YT4ZA4ZM4ZW", "                              444444444444444444444444444444444444444444444444444...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test19617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19617");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("IAN\\U0020I", "ITALIA");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test19618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19618");
        java.lang.String str1 = org.apache.commons.lang3.CharUtils.unicodeEscaped('U');
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\u0055" + "'", str1, "\\u0055");
    }

    @Test
    public void test19619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19619");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("FgenceFgenceFgenceFgenceFgenceFgenceFgenc", "italian (italian,eng_KOKOKO_      ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "FgenceFgenceFgenceFgenceFgenceFgenceFgenc" + "'", str2, "FgenceFgenceFgenceFgenceFgenceFgenceFgenc");
    }

    @Test
    public void test19620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19620");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("GBR");
        double double2 = languageRange1.getWeight();
        double double3 = languageRange1.getWeight();
        java.lang.String str4 = languageRange1.getRange();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "gbr" + "'", str4, "gbr");
    }

    @Test
    public void test19621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19621");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("Deutsch (Deutschland)", 104);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                         Deutsch (Deutschland)                                          " + "'", str2, "                                         Deutsch (Deutschland)                                          ");
    }

    @Test
    public void test19622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19622");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCEgschCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test19623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19623");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "french (NC_HZ)");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test19624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19624");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("                                                                              \\     ", 97, (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test19625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19625");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("00000000000000000000CCCC\\CCCC0000000000000000000000000000000000000000000000000000000", 18);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00CCCC\\CCCC0000000000000000000000000000000000000000000000000000000" + "'", str2, "00CCCC\\CCCC0000000000000000000000000000000000000000000000000000000");
    }

    @Test
    public void test19626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19626");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.split("ADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhATzhAUzhAWzhAXzhAZzhBAzhBBzhBDzhBEzhBFzhBGzhBHzhBIzhBJzhBLzhBMzhBNzhBOzhBQzhBRzhBSzhBTzhBVzhBWzhBYzhBZzhCAzhCCzhCDzhCFzhCGzhCHzhCIzhCKzhCLzhCMzhCNzhCOzhCRzhCUzhCVzhCWzhCXzhCYzhCZzhDEzhDJzhDKzhDMzhDOzhDZzhECzhEEzhEGzhEHzhERzhESzhETzhFIzhFJzhFKzhFMzhFOzhFRzhGAzhGBzhGDzhGEzhGFzhGGzhGHzhGIzhGLzhGMzhGNzhGPzhGQzhGRzhGSzhGTzhGUzhGWzhGYzhHKzhHMzhHNzhHRzhHTzhHUzhIDzhIEzhILzhIMzhINzhIOzhIQzhIRzhISzhITzhJEzhJMzhJOzhJPzhKEzhKGzhKHzhKIzhKMzhKNzhKPzhKRzhKWzhKYzhKZzhLAzhLBzhLCzhLIzhLKzhLRzhLSzhLTzhLUzhLVzhLYzhMAzhMCzhMDzhMEzhMFzhMGzhMHzhMKzhMLzhMMzhMNzhMOzhMPzhMQzhMRzhMSzhMTzhMUzhMVzhMWzhMXzhMYzhMZzhNAzhNCzhNEzhNFzhNGzhNIzhNLzhNOzhNPzhNRzhNUzhNZzhOMzhPAzhPEzhPFzhPGzhPHzhPKzhPLzhPMzhPNzhPRzhPSzhPTzhPWzhPYzhQAzhREzhROzhRSzhRUzhRWzhSAzhSBzhSCzhSDzhSEzhSGzhSHzhSIzhSJzhSKzhSLzhSMzhSNzhSOzhSRzhSSzhSTzhSVzhSXzhSYzhSZzhTCzhTDzhTFzhTGzhTHzhTJzhTKzhTLzhTMzhTNzhTOzhTRzhTTzhTVzhTWzhTZzhUAzhUGzhUMzhUSzhUYzhUZzhVAzhVCzhVEzhVGzhVIzhVNzhVUzhWFzhWSzhYEzhYTzhZAzhZMzhZW", "\\u0065", 104);
        boolean boolean7 = org.apache.commons.lang3.StringUtils.endsWithAny("\\u0066", strArray6);
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAny("2cinese (Cina...", strArray6);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray6, 'N', 395, 99);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.startsWithAny("                                                                                                         ", strArray6);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test19627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19627");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("h");
        java.lang.String str2 = languageRange1.getRange();
        double double3 = languageRange1.getWeight();
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("   h", "b");
        boolean boolean7 = languageRange1.equals((java.lang.Object) strArray6);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "h" + "'", str2, "h");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test19628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19628");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('7', 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7 + "'", int2 == 7);
    }

    @Test
    public void test19629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19629");
        char[] charArray13 = new char[] { ' ', '4' };
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "HI!", charArray13);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!", charArray13);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "h", charArray13);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "h", charArray13);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "iTALIAN", charArray13);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "8600u\\", charArray13);
        int int20 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "\\U0078", charArray13);
        boolean boolean21 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "KOR", charArray13);
        boolean boolean22 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "\\italian_ITALIAN_English", charArray13);
        int int23 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "000000000000000000000000000000000000000000000000000000000000000CCCC\\CCCC000000000000000000000000000000000000000000000000000000000000000CCCC\\CCCC0000000000000000000000000000000000000000000000000000000italiano000000000000000000000000000000000000000000000000000000000000000CCCC\\CCCC000000000000000000000000000000000000000000000000000000000000000CCCC\\CCCC0000000000000000000000000000000000000000000000000000000", charArray13);
        boolean boolean24 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "IT_IT", charArray13);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[ , 4]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test19630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19630");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("ch");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ch" + "'", str1, "ch");
    }

    @Test
    public void test19631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19631");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("TEDESCO", "                                  \\u005c                                                         ", (int) 'N');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test19632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19632");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "und-itTAiT-ITALIAN-EgAish");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test19633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19633");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale1 = java.util.Locale.getDefault(category0);
        java.util.Locale locale3 = java.util.Locale.forLanguageTag("hi!");
        java.lang.String str4 = locale3.getCountry();
        java.util.Locale.setDefault(category0, locale3);
        java.util.Locale.Category category6 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale7 = java.util.Locale.getDefault(category6);
        java.util.Locale locale8 = java.util.Locale.getDefault(category6);
        java.util.Locale.setDefault(category0, locale8);
        java.util.Locale locale10 = java.util.Locale.getDefault(category0);
        java.lang.String str11 = locale10.getDisplayVariant();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale1);
// flaky:         org.junit.Assert.assertEquals(locale1.toString(), "ko");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + category6 + "' != '" + java.util.Locale.Category.FORMAT + "'", category6.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test19634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19634");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC                       ", 24);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "C                       " + "'", str2, "C                       ");
    }

    @Test
    public void test19635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19635");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("                                      )hsilgne,nailati( ");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
    }

    @Test
    public void test19636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19636");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("                                                  it44444444444444444en", 102, 38);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test19637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19637");
        char[] charArray6 = new char[] { ' ', '4' };
        int int7 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "HI!", charArray6);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsAny("NC_hz\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r", charArray6);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "en_CA", charArray6);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "                  iTALIE                                           ", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[ , 4]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test19638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19638");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("                                                                               \\u005c                                                                              ", "44444444444444444444444444444444444444444444it                   zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                               \\u005c                                                                              " + "'", str2, "                                                                               \\u005c                                                                              ");
    }

    @Test
    public void test19639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19639");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC nailati             ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "cCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC nailati             " + "'", str1, "cCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC nailati             ");
    }

    @Test
    public void test19640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19640");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("...c!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!", "zhazhzhzhzhzhzhzhzhzhzh_UND-CA", 262);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test19641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19641");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale locale2 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str3 = locale2.getDisplayName();
        java.util.Locale.Builder builder4 = builder1.setLocale(locale2);
        java.util.Locale.Builder builder5 = builder1.clear();
        java.util.Locale.Builder builder7 = builder1.setLanguage("RA");
        java.util.Locale.Builder builder9 = builder7.setLanguage("");
        java.util.Locale locale10 = java.util.Locale.ENGLISH;
        java.lang.String str11 = locale10.getDisplayVariant();
        java.util.Locale.Builder builder12 = builder7.setLocale(locale10);
        java.util.Locale.Builder builder13 = builder12.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder15 = builder13.setLanguage("nglish (United Kingdom)french (NC_HZ)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: nglish (United Kingdom)french (NC_HZ) [at index 0]");
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
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test19642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19642");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("           \\            ", (double) 11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=11.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test19643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19643");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("anihC", 'C', 'c');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "anihc" + "'", str3, "anihc");
    }

    @Test
    public void test19644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19644");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("\\u0061ItalienischItalienischItalienischItalienischItalienischItalienischItalienischItalienischItalie");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=\\u0061italienischitalienischitalienischitalienischitalienischitalienischitalienischitalienischitalie");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test19645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19645");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("zhzhzhzhzhzhzhzhzhzhFRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhAzhzhzhzhzhzhzemand", "anglais (royaume-uni)FRA", (int) 'g');
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test19646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19646");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("BFIBGIBHIBIIBJIBLIBMIBNIBOIBQIBRIBSIBTIBVIBWIBYIBZICAICCICDICFICGICHICIICKICLICMICNICOICRICUICVICWICXICYICZIDEIDJIDKIDMIDOIDZIECIEEIEGIEHIERIESIETIFIIFJIFKIFMIFOIFRIGAIGBIGDIGEIGFIGGIGHIGIIGLIGMIGNIGPIGQIGRIGSIGTIGUIGWIGYIHKIH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "BFIBGIBHIBIIBJIBLIBMIBNIBOIBQIBRIBSIBTIBVIBWIBYIBZICAICCICDICFICGICHICIICKICLICMICNICOICRICUICVICWICXICYICZIDEIDJIDKIDMIDOIDZIECIEEIEGIEHIERIESIETIFIIFJIFKIFMIFOIFRIGAIGBIGDIGEIGFIGGIGHIGIIGLIGMIGNIGPIGQIGRIGSIGTIGUIGWIGYIHKI" + "'", str1, "BFIBGIBHIBIIBJIBLIBMIBNIBOIBQIBRIBSIBTIBVIBWIBYIBZICAICCICDICFICGICHICIICKICLICMICNICOICRICUICVICWICXICYICZIDEIDJIDKIDMIDOIDZIECIEEIEGIEHIERIESIETIFIIFJIFKIFMIFOIFRIGAIGBIGDIGEIGFIGGIGHIGIIGLIGMIGNIGPIGQIGRIGSIGTIGUIGWIGYIHKI");
    }

    @Test
    public void test19647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19647");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("alhi!       _\\U0020_Italienisch####################################################################          andallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemand", "                                                                                                         German (Germany)", 44);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test19648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19648");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("titititititit", 6);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "tititi" + "'", str2, "tititi");
    }

    @Test
    public void test19649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19649");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("4444444fra", 85);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test19650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19650");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("eAGAAS", "69\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069!IH\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\englisch");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test19651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19651");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF\nFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "fffffffffffffffffffffffffffffffffffffffffffffffffff\nffffffffffffffffffffffffffffffffffffffffffffffffffff" + "'", str1, "fffffffffffffffffffffffffffffffffffffffffffffffffff\nffffffffffffffffffffffffffffffffffffffffffffffffffff");
    }

    @Test
    public void test19652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19652");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("GBR");
        boolean boolean3 = languageRange1.equals((java.lang.Object) "english                                h                                 ");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test19653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19653");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("\u82f1\u56fd ", "                                      )hsilgne,nailati( ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test19654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19654");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("ixii");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ixii" + "'", str1, "ixii");
    }

    @Test
    public void test19655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19655");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("Chine)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=chine)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test19656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19656");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("fRHfR)", 89);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "fRHfR)" + "'", str2, "fRHfR)");
    }

    @Test
    public void test19657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19657");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("citalian_ITALIAN_Englishna)\\u0069h...", "\u6cd5\u6587\u52a0\u62ff\u5927)");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test19658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19658");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("nglish (United Kingdom", "AZHZHZHZHZHZHZHFRAN\307AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\307AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\307AIS CINESE (CINA)\\U0069H..FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\307AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\307AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\307AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\307AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\307AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\307AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\307AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\307AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\307AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\307AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\307AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\307AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\307AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\307AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\307AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\307AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\307AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\307AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZH", 19);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test19659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19659");
        java.lang.String[] strArray1 = java.util.Locale.getISOCountries();
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1);
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1);
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray1);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.concatWith("zh", (java.lang.Object[]) strArray4);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, 'i', 120, 3);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray4);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray4);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDEDJDKDMDODZECEEEGEHERESETFIFJFKFMFOFRGAGBGDGEGFGGGHGIGLGMGNGPGQGRGSGTGUGWGYHKHMHNHRHTHUIDIEILIMINIOIQIRISITJEJMJOJPKEKGKHKIKMKNKPKRKWKYKZLALBLCLILKLRLSLTLULVLYMAMCMDMEMFMGMHMKMLMMMNMOMPMQMRMSMTMUMVMWMXMYMZNANCNENFNGNINLNONPNRNUNZOMPAPEPFPGPHPKPLPMPNPRPSPTPWPYQARERORSRURWSASBSCSDSESGSHSISJSKSLSMSNSOSRSSSTSVSXSYSZTCTDTFTGTHTJTKTLTMTNTOTRTTTVTWTZUAUGUMUSUYUZVAVCVEVGVIVNVUWFWSYEYTZAZMZW" + "'", str2, "ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDEDJDKDMDODZECEEEGEHERESETFIFJFKFMFOFRGAGBGDGEGFGGGHGIGLGMGNGPGQGRGSGTGUGWGYHKHMHNHRHTHUIDIEILIMINIOIQIRISITJEJMJOJPKEKGKHKIKMKNKPKRKWKYKZLALBLCLILKLRLSLTLULVLYMAMCMDMEMFMGMHMKMLMMMNMOMPMQMRMSMTMUMVMWMXMYMZNANCNENFNGNINLNONPNRNUNZOMPAPEPFPGPHPKPLPMPNPRPSPTPWPYQARERORSRURWSASBSCSDSESGSHSISJSKSLSMSNSOSRSSSTSVSXSYSZTCTDTFTGTHTJTKTLTMTNTOTRTTTVTWTZUAUGUMUSUYUZVAVCVEVGVIVNVUWFWSYEYTZAZMZW");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDEDJDKDMDODZECEEEGEHERESETFIFJFKFMFOFRGAGBGDGEGFGGGHGIGLGMGNGPGQGRGSGTGUGWGYHKHMHNHRHTHUIDIEILIMINIOIQIRISITJEJMJOJPKEKGKHKIKMKNKPKRKWKYKZLALBLCLILKLRLSLTLULVLYMAMCMDMEMFMGMHMKMLMMMNMOMPMQMRMSMTMUMVMWMXMYMZNANCNENFNGNINLNONPNRNUNZOMPAPEPFPGPHPKPLPMPNPRPSPTPWPYQARERORSRURWSASBSCSDSESGSHSISJSKSLSMSNSOSRSSSTSVSXSYSZTCTDTFTGTHTJTKTLTMTNTOTRTTTVTWTZUAUGUMUSUYUZVAVCVEVGVIVNVUWFWSYEYTZAZMZW" + "'", str3, "ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDEDJDKDMDODZECEEEGEHERESETFIFJFKFMFOFRGAGBGDGEGFGGGHGIGLGMGNGPGQGRGSGTGUGWGYHKHMHNHRHTHUIDIEILIMINIOIQIRISITJEJMJOJPKEKGKHKIKMKNKPKRKWKYKZLALBLCLILKLRLSLTLULVLYMAMCMDMEMFMGMHMKMLMMMNMOMPMQMRMSMTMUMVMWMXMYMZNANCNENFNGNINLNONPNRNUNZOMPAPEPFPGPHPKPLPMPNPRPSPTPWPYQARERORSRURWSASBSCSDSESGSHSISJSKSLSMSNSOSRSSSTSVSXSYSZTCTDTFTGTHTJTKTLTMTNTOTRTTTVTWTZUAUGUMUSUYUZVAVCVEVGVIVNVUWFWSYEYTZAZMZW");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhATzhAUzhAWzhAXzhAZzhBAzhBBzhBDzhBEzhBFzhBGzhBHzhBIzhBJzhBLzhBMzhBNzhBOzhBQzhBRzhBSzhBTzhBVzhBWzhBYzhBZzhCAzhCCzhCDzhCFzhCGzhCHzhCIzhCKzhCLzhCMzhCNzhCOzhCRzhCUzhCVzhCWzhCXzhCYzhCZzhDEzhDJzhDKzhDMzhDOzhDZzhECzhEEzhEGzhEHzhERzhESzhETzhFIzhFJzhFKzhFMzhFOzhFRzhGAzhGBzhGDzhGEzhGFzhGGzhGHzhGIzhGLzhGMzhGNzhGPzhGQzhGRzhGSzhGTzhGUzhGWzhGYzhHKzhHMzhHNzhHRzhHTzhHUzhIDzhIEzhILzhIMzhINzhIOzhIQzhIRzhISzhITzhJEzhJMzhJOzhJPzhKEzhKGzhKHzhKIzhKMzhKNzhKPzhKRzhKWzhKYzhKZzhLAzhLBzhLCzhLIzhLKzhLRzhLSzhLTzhLUzhLVzhLYzhMAzhMCzhMDzhMEzhMFzhMGzhMHzhMKzhMLzhMMzhMNzhMOzhMPzhMQzhMRzhMSzhMTzhMUzhMVzhMWzhMXzhMYzhMZzhNAzhNCzhNEzhNFzhNGzhNIzhNLzhNOzhNPzhNRzhNUzhNZzhOMzhPAzhPEzhPFzhPGzhPHzhPKzhPLzhPMzhPNzhPRzhPSzhPTzhPWzhPYzhQAzhREzhROzhRSzhRUzhRWzhSAzhSBzhSCzhSDzhSEzhSGzhSHzhSIzhSJzhSKzhSLzhSMzhSNzhSOzhSRzhSSzhSTzhSVzhSXzhSYzhSZzhTCzhTDzhTFzhTGzhTHzhTJzhTKzhTLzhTMzhTNzhTOzhTRzhTTzhTVzhTWzhTZzhUAzhUGzhUMzhUSzhUYzhUZzhVAzhVCzhVEzhVGzhVIzhVNzhVUzhWFzhWSzhYEzhYTzhZAzhZMzhZW" + "'", str5, "ADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhATzhAUzhAWzhAXzhAZzhBAzhBBzhBDzhBEzhBFzhBGzhBHzhBIzhBJzhBLzhBMzhBNzhBOzhBQzhBRzhBSzhBTzhBVzhBWzhBYzhBZzhCAzhCCzhCDzhCFzhCGzhCHzhCIzhCKzhCLzhCMzhCNzhCOzhCRzhCUzhCVzhCWzhCXzhCYzhCZzhDEzhDJzhDKzhDMzhDOzhDZzhECzhEEzhEGzhEHzhERzhESzhETzhFIzhFJzhFKzhFMzhFOzhFRzhGAzhGBzhGDzhGEzhGFzhGGzhGHzhGIzhGLzhGMzhGNzhGPzhGQzhGRzhGSzhGTzhGUzhGWzhGYzhHKzhHMzhHNzhHRzhHTzhHUzhIDzhIEzhILzhIMzhINzhIOzhIQzhIRzhISzhITzhJEzhJMzhJOzhJPzhKEzhKGzhKHzhKIzhKMzhKNzhKPzhKRzhKWzhKYzhKZzhLAzhLBzhLCzhLIzhLKzhLRzhLSzhLTzhLUzhLVzhLYzhMAzhMCzhMDzhMEzhMFzhMGzhMHzhMKzhMLzhMMzhMNzhMOzhMPzhMQzhMRzhMSzhMTzhMUzhMVzhMWzhMXzhMYzhMZzhNAzhNCzhNEzhNFzhNGzhNIzhNLzhNOzhNPzhNRzhNUzhNZzhOMzhPAzhPEzhPFzhPGzhPHzhPKzhPLzhPMzhPNzhPRzhPSzhPTzhPWzhPYzhQAzhREzhROzhRSzhRUzhRWzhSAzhSBzhSCzhSDzhSEzhSGzhSHzhSIzhSJzhSKzhSLzhSMzhSNzhSOzhSRzhSSzhSTzhSVzhSXzhSYzhSZzhTCzhTDzhTFzhTGzhTHzhTJzhTKzhTLzhTMzhTNzhTOzhTRzhTTzhTVzhTWzhTZzhUAzhUGzhUMzhUSzhUYzhUZzhVAzhVCzhVEzhVGzhVIzhVNzhVUzhWFzhWSzhYEzhYTzhZAzhZMzhZW");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDEDJDKDMDODZECEEEGEHERESETFIFJFKFMFOFRGAGBGDGEGFGGGHGIGLGMGNGPGQGRGSGTGUGWGYHKHMHNHRHTHUIDIEILIMINIOIQIRISITJEJMJOJPKEKGKHKIKMKNKPKRKWKYKZLALBLCLILKLRLSLTLULVLYMAMCMDMEMFMGMHMKMLMMMNMOMPMQMRMSMTMUMVMWMXMYMZNANCNENFNGNINLNONPNRNUNZOMPAPEPFPGPHPKPLPMPNPRPSPTPWPYQARERORSRURWSASBSCSDSESGSHSISJSKSLSMSNSOSRSSSTSVSXSYSZTCTDTFTGTHTJTKTLTMTNTOTRTTTVTWTZUAUGUMUSUYUZVAVCVEVGVIVNVUWFWSYEYTZAZMZW" + "'", str6, "ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDEDJDKDMDODZECEEEGEHERESETFIFJFKFMFOFRGAGBGDGEGFGGGHGIGLGMGNGPGQGRGSGTGUGWGYHKHMHNHRHTHUIDIEILIMINIOIQIRISITJEJMJOJPKEKGKHKIKMKNKPKRKWKYKZLALBLCLILKLRLSLTLULVLYMAMCMDMEMFMGMHMKMLMMMNMOMPMQMRMSMTMUMVMWMXMYMZNANCNENFNGNINLNONPNRNUNZOMPAPEPFPGPHPKPLPMPNPRPSPTPWPYQARERORSRURWSASBSCSDSESGSHSISJSKSLSMSNSOSRSSSTSVSXSYSZTCTDTFTGTHTJTKTLTMTNTOTRTTTVTWTZUAUGUMUSUYUZVAVCVEVGVIVNVUWFWSYEYTZAZMZW");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test19660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19660");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("Fr", (int) 'u');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test19661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19661");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("AD  \\u007a", "fran\347ais (France)");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AD  \\u007" + "'", str2, "AD  \\u007");
    }

    @Test
    public void test19662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19662");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("nnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn                                                                     ", "\u30d5\u30e9\u30f3\u30b9\u8a9e\u30ab\u30ca\u30c0)IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII");
        boolean boolean4 = org.apache.commons.lang3.StringUtils.startsWithAny("azhzhzhzhzhzhzhzhzhzh", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test19663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19663");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterType("H!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I");
        boolean boolean3 = org.apache.commons.lang3.StringUtils.startsWithAny("hi!       _\\u0020_italienisch####################################################################...", strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test19664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19664");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("\351encor\351encor\351encor\351", "\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i", 103);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.concatWith("HHHHHHHHHHtTAHHHHHHHHHHT_ITA", (java.lang.Object[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\351eHHHHHHHHHHtTAHHHHHHHHHHT_ITAcor\351eHHHHHHHHHHtTAHHHHHHHHHHT_ITAcor\351eHHHHHHHHHHtTAHHHHHHHHHHT_ITAcor\351" + "'", str5, "\351eHHHHHHHHHHtTAHHHHHHHHHHT_ITAcor\351eHHHHHHHHHHtTAHHHHHHHHHHT_ITAcor\351eHHHHHHHHHHtTAHHHHHHHHHHT_ITAcor\351");
    }

    @Test
    public void test19665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19665");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.setLanguageTag("Italian");
        java.util.Locale.Builder builder4 = builder3.clearExtensions();
        java.util.Locale.Builder builder7 = builder4.setExtension('Y', "");
        java.util.Locale.Builder builder9 = builder7.setRegion("");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder11 = builder7.setScript("hcsineilati");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: hcsineilati [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test19666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19666");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("ITALIAN", "FRANZ\326SISCH", (int) (byte) -1);
        boolean boolean5 = org.apache.commons.lang3.StringUtils.startsWithAny("\\u0068       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih   ", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test19667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19667");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("rEGNO uNITO");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test19668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19668");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("cor\351en (Cor\351e du Sud)", "cccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccc...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "cor\351en (Cor\351e du Sud)" + "'", str2, "cor\351en (Cor\351e du Sud)");
    }

    @Test
    public void test19669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19669");
        java.util.Locale locale4 = new java.util.Locale("HI!       ", "\\U0020", "Italienisch#########################################################################################");
        java.util.Locale locale5 = locale4.stripExtensions();
        java.util.Locale locale6 = locale5.stripExtensions();
        java.lang.String str7 = locale6.getVariant();
        java.lang.String str8 = locale6.getLanguage();
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.lowerCase("EEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEE", locale6);
        org.junit.Assert.assertEquals(locale4.toString(), "hi!       _\\U0020_Italienisch#########################################################################################");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "hi!       _\\U0020_Italienisch#########################################################################################");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "hi!       _\\U0020_Italienisch#########################################################################################");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Italienisch#########################################################################################" + "'", str7, "Italienisch#########################################################################################");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!       " + "'", str8, "hi!       ");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee" + "'", str9, "eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee");
    }

    @Test
    public void test19670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19670");
        java.util.Locale locale1 = java.util.Locale.ITALIAN;
        java.util.Set<java.lang.Character> charSet2 = locale1.getExtensionKeys();
        java.lang.String str3 = locale1.getVariant();
        java.lang.String str4 = locale1.getDisplayName();
        java.lang.String str5 = locale1.getDisplayName();
        java.lang.String str6 = locale1.getDisplayVariant();
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.lowerCase("cinese (Cina)\\u0069hhhhhhhhhh\\u0069hhhhhhhhhh\\u0069hhhhhhhhhh\\u0069hh", locale1);
        java.util.Locale.setDefault(locale1);
        java.lang.String str9 = locale1.getScript();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "it");
        org.junit.Assert.assertNotNull(charSet2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Italian" + "'", str4, "Italian");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Italian" + "'", str5, "Italian");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "cinese (cina)\\u0069hhhhhhhhhh\\u0069hhhhhhhhhh\\u0069hhhhhhhhhh\\u0069hh" + "'", str7, "cinese (cina)\\u0069hhhhhhhhhh\\u0069hhhhhhhhhh\\u0069hhhhhhhhhh\\u0069hh");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test19671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19671");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("########################################################################################", "zhzhzhzhzhzhzhzhzhzhE");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rzh_cn");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "########################################################################################" + "'", str4, "########################################################################################");
    }

    @Test
    public void test19672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19672");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("000000000000000000000000000000000000000000000FRANZ\326SISCH0000000000000000000000000000000000000000000000", "                                                                    \\U0020ItalianItalianItalianItali", 18);
        int int4 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test19673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19673");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("hfffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffff");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hfffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffff" + "'", str1, "hfffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffff");
    }

    @Test
    public void test19674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19674");
        char[] charArray15 = new char[] { '4', '#', '#', 'a', ' ', 'a' };
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray15);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "iTALIAN", charArray15);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "it", charArray15);
        boolean boolean19 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "h", charArray15);
        int int20 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                                                                                                         ", charArray15);
        boolean boolean21 = org.apache.commons.lang3.StringUtils.containsAny("Englisch", charArray15);
        boolean boolean22 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC", charArray15);
        boolean boolean23 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "ko-KR                                                                                                   ", charArray15);
        boolean boolean24 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "  \\u007a", charArray15);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray15), "4##a a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray15), "4##a a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray15), "[4, #, #, a,  , a]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test19675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19675");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "!ih_HHHHHHHHHH");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test19676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19676");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("                                                                                         U!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IUzhzhzhzhzhzhzhzhzhzhFRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhAzhzhzhzhzhzhzhzhzhzhUFRZ\326CZ(FRKREC)Ucinese (Cina)\\u0069hhhhhhhhhh\\u0069hhhhhhhhhh\\u0069hhhhhhhhhh\\u0069hhU         ITALIAN_ITALIAN_ENGLISH         ITALIAN_!IHITTAIT_ITALIAN_EGAISHU                                      ...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "U!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IUzhzhzhzhzhzhzhzhzhzhFRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhAzhzhzhzhzhzhzhzhzhzhUFRZ\326CZ(FRKREC)Ucinese (Cina)\\u0069hhhhhhhhhh\\u0069hhhhhhhhhh\\u0069hhhhhhhhhh\\u0069hhU         ITALIAN_ITALIAN_ENGLISH         ITALIAN_!IHITTAIT_ITALIAN_EGAISHU                                      ..." + "'", str1, "U!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IUzhzhzhzhzhzhzhzhzhzhFRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhAzhzhzhzhzhzhzhzhzhzhUFRZ\326CZ(FRKREC)Ucinese (Cina)\\u0069hhhhhhhhhh\\u0069hhhhhhhhhh\\u0069hhhhhhhhhh\\u0069hhU         ITALIAN_ITALIAN_ENGLISH         ITALIAN_!IHITTAIT_ITALIAN_EGAISHU                                      ...");
    }

    @Test
    public void test19677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19677");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("hcsineilatI", (int) 'x', '9');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hcsineilatI9999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999" + "'", str3, "hcsineilatI9999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999");
    }

    @Test
    public void test19678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19678");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("", "KoreanADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLC");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test19679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19679");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfBlank((java.lang.CharSequence) "                                                                        ", (java.lang.CharSequence) "royaume-uni");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "royaume-uni" + "'", charSequence2, "royaume-uni");
    }

    @Test
    public void test19680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19680");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("KOR");
        java.lang.String str2 = languageRange1.getRange();
        java.lang.String str3 = languageRange1.getRange();
        java.lang.String str4 = languageRange1.getRange();
        java.lang.String str5 = languageRange1.getRange();
        double double6 = languageRange1.getWeight();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "kor" + "'", str2, "kor");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "kor" + "'", str3, "kor");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "kor" + "'", str4, "kor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "kor" + "'", str5, "kor");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
    }

    @Test
    public void test19681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19681");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("#########################################)ylatI( nailatIzzzc)ylatI( nailatIzzzne)ylatI( nailatIzzzla", 121, "frnz\366sisch (knd)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "frnz\366sisch#########################################)ylatI( nailatIzzzc)ylatI( nailatIzzzne)ylatI( nailatIzzzlafrnz\366sisch " + "'", str3, "frnz\366sisch#########################################)ylatI( nailatIzzzc)ylatI( nailatIzzzne)ylatI( nailatIzzzlafrnz\366sisch ");
    }

    @Test
    public void test19682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19682");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaafraaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "ailatI");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test19683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19683");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder2 = builder0.clear();
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale.Builder builder5 = builder0.setVariant("itTAiT_ITALIAN_EgAish");
        java.util.Locale.Builder builder6 = builder5.clearExtensions();
        java.util.Locale.Builder builder7 = builder6.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder9 = builder7.addUnicodeLocaleAttribute("ititaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaiitalianititaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitai");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: ititaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaiitalianititaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitai [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test19684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19684");
        java.util.Locale locale1 = java.util.Locale.CHINESE;
        java.lang.String str2 = locale1.getCountry();
        java.util.Locale locale4 = java.util.Locale.forLanguageTag("FRANZ\326SISCH");
        java.lang.String str5 = locale1.getDisplayScript(locale4);
        java.util.Locale locale6 = java.util.Locale.ITALIAN;
        java.lang.String str7 = locale6.getDisplayLanguage();
        java.util.Locale locale8 = locale6.stripExtensions();
        java.lang.String str9 = locale6.getLanguage();
        java.lang.String str10 = locale6.getISO3Language();
        java.lang.String str11 = locale1.getDisplayLanguage(locale6);
        java.util.Locale locale12 = locale1.stripExtensions();
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.lowerCase("                                                         ", locale1);
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "it");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "italiano" + "'", str7, "italiano");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "it");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "it" + "'", str9, "it");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ita" + "'", str10, "ita");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "cinese" + "'", str11, "cinese");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "                                                         " + "'", str13, "                                                         ");
    }

    @Test
    public void test19685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19685");
        java.util.Locale locale3 = new java.util.Locale("tal", "", "#########FranzosischFranzosisch (Frankreich)");
        java.lang.String str4 = locale3.getScript();
        org.junit.Assert.assertEquals(locale3.toString(), "tal__#########FranzosischFranzosisch (Frankreich)");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test19686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19686");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("", (int) '2', 'Y');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "YYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYY" + "'", str3, "YYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYY");
    }

    @Test
    public void test19687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19687");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("kor");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test19688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19688");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("          2cinese (Cina)iTALIANiTALIANiTALIANiTAL");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "          2cinese (Cina)iTALIANiTALIANiTALIANiTAL" + "'", str1, "          2cinese (Cina)iTALIANiTALIANiTALIANiTAL");
    }

    @Test
    public void test19689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19689");
        java.util.Locale locale1 = java.util.Locale.FRANCE;
        java.util.Locale locale2 = java.util.Locale.ITALIAN;
        java.lang.String str4 = locale2.getExtension('h');
        java.lang.String str5 = locale1.getDisplayScript(locale2);
        java.util.Locale locale6 = locale1.stripExtensions();
        java.lang.String str7 = locale6.getISO3Country();
        boolean boolean8 = locale6.hasExtensions();
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.upperCase("fr-CAfr-CAfr-C8600u\\fr-CAfr-CAfr-CAfr-CAfr-CAfr-C8600u\\fr-CAffr-CAfr-CAfr-C8600u\\fr-CAfr-CAfr-CAfr-CAfr-CAfr-C8600u\\fr-CAf", locale6);
        java.lang.String str10 = locale6.getDisplayName();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "it");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "FRA" + "'", str7, "FRA");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "FR-CAFR-CAFR-C8600U\\FR-CAFR-CAFR-CAFR-CAFR-CAFR-C8600U\\FR-CAFFR-CAFR-CAFR-C8600U\\FR-CAFR-CAFR-CAFR-CAFR-CAFR-C8600U\\FR-CAF" + "'", str9, "FR-CAFR-CAFR-C8600U\\FR-CAFR-CAFR-CAFR-CAFR-CAFR-C8600U\\FR-CAFFR-CAFR-CAFR-C8600U\\FR-CAFR-CAFR-CAFR-CAFR-CAFR-C8600U\\FR-CAF");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "francese (Francia)" + "'", str10, "francese (Francia)");
    }

    @Test
    public void test19690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19690");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "D  \\u007", "\\u0029E             g");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test19691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19691");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "FrkrB");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test19692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19692");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale locale2 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str3 = locale2.getDisplayName();
        java.util.Locale.Builder builder4 = builder1.setLocale(locale2);
        java.util.Locale.Builder builder5 = builder4.clear();
        java.util.Locale.Builder builder7 = builder5.setLanguage("ITALIAN");
        java.util.Locale.Builder builder8 = builder7.clear();
        java.util.Locale locale9 = java.util.Locale.FRENCH;
        java.util.Locale locale10 = java.util.Locale.ENGLISH;
        java.lang.String str11 = locale10.getDisplayCountry();
        java.lang.String str12 = locale9.getDisplayVariant(locale10);
        java.lang.String str13 = locale9.getDisplayCountry();
        java.util.Locale.Builder builder14 = builder8.setLocale(locale9);
        java.lang.String str15 = locale9.getCountry();
        java.util.Locale.Builder builder16 = new java.util.Locale.Builder();
        java.util.Locale locale17 = builder16.build();
        java.util.Locale locale18 = java.util.Locale.FRENCH;
        java.util.Locale locale19 = java.util.Locale.ENGLISH;
        java.lang.String str20 = locale19.getDisplayCountry();
        java.lang.String str21 = locale18.getDisplayVariant(locale19);
        java.lang.String str22 = locale18.getDisplayCountry();
        java.lang.String str23 = locale18.getScript();
        java.lang.String str24 = locale18.getScript();
        java.util.Locale locale25 = java.util.Locale.FRENCH;
        java.util.Locale locale26 = java.util.Locale.ENGLISH;
        java.lang.String str27 = locale26.getDisplayCountry();
        java.lang.String str28 = locale25.getDisplayVariant(locale26);
        java.lang.String str29 = locale25.getDisplayCountry();
        java.lang.String str30 = locale25.getScript();
        java.lang.String str31 = locale25.getScript();
        java.lang.String str32 = locale18.getDisplayCountry(locale25);
        java.lang.String str33 = locale17.getDisplayVariant(locale25);
        java.util.Locale locale35 = java.util.Locale.ENGLISH;
        java.lang.String str36 = locale35.getDisplayLanguage();
        java.lang.String str37 = org.apache.commons.lang3.StringUtils.upperCase("!IH", locale35);
        java.lang.String str38 = locale35.getCountry();
        java.lang.String str39 = locale35.getCountry();
        java.lang.String str40 = locale25.getDisplayCountry(locale35);
        java.util.Locale locale41 = java.util.Locale.GERMAN;
        java.util.Locale locale42 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str43 = locale41.getDisplayName(locale42);
        java.util.Locale locale44 = locale41.stripExtensions();
        java.lang.String str45 = locale35.getDisplayVariant(locale44);
        java.util.Locale locale48 = new java.util.Locale("italian (ITALIAN,English)", "                                                                                                         ");
        java.lang.String str49 = locale35.getDisplayLanguage(locale48);
        java.util.Set<java.lang.Character> charSet50 = locale48.getExtensionKeys();
        java.lang.String str51 = locale9.getDisplayCountry(locale48);
        java.util.Locale locale52 = locale48.stripExtensions();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "francese (Canada)" + "'", str3, "francese (Canada)");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "fr");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "fr");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "en");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "fr");
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "en");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "en");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "inglese" + "'", str36, "inglese");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "!IH" + "'", str37, "!IH");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertNotNull(locale41);
        org.junit.Assert.assertEquals(locale41.toString(), "de");
        org.junit.Assert.assertNotNull(locale42);
        org.junit.Assert.assertEquals(locale42.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "allemand" + "'", str43, "allemand");
        org.junit.Assert.assertNotNull(locale44);
        org.junit.Assert.assertEquals(locale44.toString(), "de");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertEquals(locale48.toString(), "italian (italian,english)_                                                                                                         ");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "English" + "'", str49, "English");
        org.junit.Assert.assertNotNull(charSet50);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertNotNull(locale52);
        org.junit.Assert.assertEquals(locale52.toString(), "italian (italian,english)_                                                                                                         ");
    }

    @Test
    public void test19693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19693");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "Englisch", (java.lang.CharSequence) "C\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rChinesisch (China)");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 98 + "'", int2 == 98);
    }

    @Test
    public void test19694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19694");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "\\U0020ITALIANITALIANITALIANITALI\\U0020ITALIANITALIANITALIANITALHcsineilatI");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test19695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19695");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "ccccccccccccccccccccccccccccccccccccccccccccccc\\u00de", (java.lang.CharSequence) "    ##########");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 53 + "'", int2 == 53);
    }

    @Test
    public void test19696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19696");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("AzhzhzhzhzhzhzhzhzhzhE             g", "44444444444444NAILATI44444444444444", 5);
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "English");
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray5, "9hhhhhhhhhh", 223, (-1));
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray5);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test19697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19697");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("\\U0020ITALIANITALIANITALIANITALI\\U0020ITALIANITALIANITALIANITALHcsineilatI", (double) 73);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=73.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test19698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19698");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("ITALIAN");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap2 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList3 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList1, strMap2);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap4 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList5 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList1, strMap4);
        org.junit.Assert.assertNotNull(languageRangeList1);
        org.junit.Assert.assertNotNull(languageRangeList3);
        org.junit.Assert.assertNotNull(languageRangeList5);
    }

    @Test
    public void test19699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19699");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "italiae");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test19700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19700");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "FRA");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test19701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19701");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("                                                                                                                                             \\u0061ItalienischItalienischItalienischItalienischItalienischItalienischItalienischItalienischItalie", "\\u0034\\u00                                             h!ih                            dallemanstuD                                             \\u0034\\u00");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test19702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19702");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("ITALIAN (ITALIAN,ENGLISH)", (int) 'u');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test19703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19703");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("\u4e2d\u6587", "\u6cd5\u56fd", 0);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "HSIAGE_NAILATI_TIATTIHI!_NAILATI         HSILGNE_NAILATI_", (int) '9', 42);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test19704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19704");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.setLanguageTag("Italian");
        java.util.Locale.Builder builder4 = builder0.clearExtensions();
        java.util.Locale.Builder builder5 = builder0.clear();
        java.util.Locale.Builder builder6 = builder0.clearExtensions();
        java.util.Locale.Builder builder8 = builder0.setScript("");
        java.util.Locale locale10 = java.util.Locale.forLanguageTag("en");
        java.util.Locale locale11 = java.util.Locale.ITALIAN;
        java.util.Set<java.lang.Character> charSet12 = locale11.getExtensionKeys();
        java.lang.String str13 = locale11.getVariant();
        java.lang.String str14 = locale11.getDisplayScript();
        java.lang.String str15 = locale10.getDisplayCountry(locale11);
        java.util.Locale.Builder builder16 = builder8.setLocale(locale10);
        java.util.Locale.Builder builder17 = builder16.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder19 = builder16.setScript("ko-KR                                                                                                   ");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: ko-KR                                                                                                    [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "it");
        org.junit.Assert.assertNotNull(charSet12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder17);
    }

    @Test
    public void test19705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19705");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("zh");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test19706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19706");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("Fr...", "ROYAUME-UNI");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Fr..." + "'", str3, "Fr...");
    }

    @Test
    public void test19707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19707");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("talian_ITALIAN_English         ital", "fr-cafr-cafr-c8600u\\fr-cafr-cafr-caEEEEEE");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "talian_ITALIAN_English         ital" + "'", str2, "talian_ITALIAN_English         ital");
    }

    @Test
    public void test19708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19708");
        java.util.Locale locale0 = java.util.Locale.GERMAN;
        java.util.Locale locale1 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str2 = locale0.getDisplayName(locale1);
        java.util.Locale locale3 = java.util.Locale.UK;
        java.util.Locale locale4 = java.util.Locale.GERMAN;
        java.util.Locale locale5 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str6 = locale4.getDisplayName(locale5);
        java.util.Locale locale7 = locale4.stripExtensions();
        java.lang.String str8 = locale3.getDisplayVariant(locale4);
        java.lang.String str9 = locale1.getDisplayLanguage(locale4);
        java.util.Set<java.lang.String> strSet10 = locale4.getUnicodeLocaleAttributes();
        java.lang.String str11 = locale4.getISO3Country();
        java.lang.String str12 = locale4.toLanguageTag();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "de");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "allemand" + "'", str2, "allemand");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en_GB");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "de");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "allemand" + "'", str6, "allemand");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "de");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Franz\366sisch" + "'", str9, "Franz\366sisch");
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "de" + "'", str12, "de");
    }

    @Test
    public void test19709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19709");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("\\atalaaa_ITALIAN_Eaglaaa", ")dnK( hcsis\366znrF", "anihc");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\atalaaa_ITALIAN_Eaglaaa" + "'", str3, "\\atalaaa_ITALIAN_Eaglaaa");
    }

    @Test
    public void test19710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19710");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDEDFrance...");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test19711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19711");
        java.lang.String str1 = org.apache.commons.lang3.CharUtils.unicodeEscaped('l');
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\u006c" + "'", str1, "\\u006c");
    }

    @Test
    public void test19712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19712");
        java.util.Locale locale1 = new java.util.Locale("hi!       ");
        java.util.Locale locale2 = java.util.Locale.CANADA;
        java.lang.String str3 = locale1.getDisplayName(locale2);
        java.lang.Object obj4 = locale2.clone();
        org.junit.Assert.assertEquals(locale1.toString(), "hi!       ");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!       " + "'", str3, "hi!       ");
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "en_CA");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "en_CA");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "en_CA");
    }

    @Test
    public void test19713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19713");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("", "1\\u0061\\u0061\\u0061");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test19714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19714");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("5\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "5600U\\5600U\\5600U\\5600U\\5600U\\5600U\\5600U\\5600U\\5600U\\5600U\\5600U\\5600U\\5600U\\5600U\\5600U\\5600U\\5600U\\5600U\\5600U\\5600U\\5600U\\5600U\\5600U\\5600U\\5600U\\5600U\\5600U\\5600U\\5600U\\5600U\\5600U\\5600U\\5600U\\5600U\\5600U\\5600U\\5600U\\5600U\\5600U\\5600U\\5600U\\5600U\\5600U\\5600U\\5600U\\5600U\\5600U\\5600U\\5600U\\5600U\\5600U\\5600U\\5600U\\5600U\\5600U\\5600U\\5600U\\5600U\\5600U\\5600U\\5600U\\5" + "'", str1, "5600U\\5600U\\5600U\\5600U\\5600U\\5600U\\5600U\\5600U\\5600U\\5600U\\5600U\\5600U\\5600U\\5600U\\5600U\\5600U\\5600U\\5600U\\5600U\\5600U\\5600U\\5600U\\5600U\\5600U\\5600U\\5600U\\5600U\\5600U\\5600U\\5600U\\5600U\\5600U\\5600U\\5600U\\5600U\\5600U\\5600U\\5600U\\5600U\\5600U\\5600U\\5600U\\5600U\\5600U\\5600U\\5600U\\5600U\\5600U\\5600U\\5600U\\5600U\\5600U\\5600U\\5600U\\5600U\\5600U\\5600U\\5600U\\5600U\\5600U\\5600U\\5");
    }

    @Test
    public void test19715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19715");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("EEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEa", "Nauru");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test19716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19716");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "zhzhzhzhzhzhzhzhzhzhE");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test19717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19717");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.setLanguageTag("Italian");
        java.util.Locale locale4 = java.util.Locale.PRC;
        java.lang.String str5 = locale4.getDisplayName();
        java.util.Locale.Builder builder6 = builder0.setLocale(locale4);
        java.util.Locale.Builder builder7 = builder6.clear();
        java.util.Locale locale8 = java.util.Locale.KOREAN;
        java.util.Locale.Builder builder9 = builder7.setLocale(locale8);
        java.util.Locale.Builder builder10 = builder9.clearExtensions();
        java.util.Locale locale11 = builder10.build();
        java.lang.String str12 = locale11.getDisplayLanguage();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "zh_CN");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Chinese (China)" + "'", str5, "Chinese (China)");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "ko");
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "ko");
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Korean" + "'", str12, "Korean");
    }

    @Test
    public void test19718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19718");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("\\u006bCinese (Cina)\\u0069h..", 264);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                      \\u006bCinese (Cina)\\u0069h..                                                                                                                      " + "'", str2, "                                                                                                                      \\u006bCinese (Cina)\\u0069h..                                                                                                                      ");
    }

    @Test
    public void test19719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19719");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "5");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test19720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19720");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("R0                                               nailati                                                ", "\n");
        int int4 = org.apache.commons.lang3.StringUtils.indexOfAny("Chinese (China)                                                                                                           ", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test19721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19721");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("                                  \\u0020iItalian\\u0020i                                                 ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\u0020iItalian\\u0020i" + "'", str1, "\\u0020iItalian\\u0020i");
    }

    @Test
    public void test19722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19722");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("\\italian_ITALIAN_English", 120);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test19723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19723");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList6 = new java.util.ArrayList<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList6, strArray5);
        java.util.Locale.FilteringMode filteringMode8 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList9 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strList6, filteringMode8);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.lang.String>) strList9, 'C');
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.lang.String>) strList9, 'D');
        java.lang.Class<?> wildcardClass14 = strList9.getClass();
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + filteringMode8 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode8.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test19724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19724");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("anglais (royaume-uni)fra", 164);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test19725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19725");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("CV CW CX CY CZ DE DJ DK DM DO DZ EC EE EG EH ER ES ET FI FJ FK", "englisch (         ITALIAN_ITALIAN_ENGLISH,\\u0061)");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CV CW CX CY CZ DE DJ DK DM DO DZ EC EE EG EH ER ES ET FI FJ FK" + "'", str2, "CV CW CX CY CZ DE DJ DK DM DO DZ EC EE EG EH ER ES ET FI FJ FK");
    }

    @Test
    public void test19726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19726");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale locale2 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str3 = locale2.getDisplayName();
        java.util.Locale.Builder builder4 = builder1.setLocale(locale2);
        java.util.Locale.Builder builder5 = builder1.clear();
        java.util.Locale.Builder builder6 = builder5.clear();
        java.util.Locale.Builder builder8 = builder5.setLanguage("zh");
        java.util.Locale locale9 = builder8.build();
        java.util.Locale.setDefault(locale9);
        java.util.Locale locale11 = locale9.stripExtensions();
        java.util.Locale locale12 = locale11.stripExtensions();
        java.lang.String str13 = locale12.toString();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fr_CA");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "French (Canada)" + "'", str3, "French (Canada)");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "zh");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "zh");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "zh" + "'", str13, "zh");
    }

    @Test
    public void test19727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19727");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("                                          hi!       2ITALIANITALIANITALIANITALItalienisch2ITALIANITALIANITALIANITALitalian_ITALIAN_English2ITALIANITALIANITALIANITALHI!2ITALIANITALIANITALIANITALhi!2ITALIANITALIANITALIANITALADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDED...2ITALIANITALIANITALIANITAL\\u00342ITALIANITALIANITALIANITALHI!2ITALIANITALIANITALIANITALItalian2ITALIANITALIANITALIANITAL\\u00612ITALIANITALIANITALIANITAL\\u00232ITALIANITALIANITALIANITALhi!2ITALIANITALIANITALIANITALiTALIAN2ITALIANITALIANITALIANITALChinese (China)2ITALIANITALIANITALIANITALhi!2ITALIANITALIANITALIANITALzh_CN2ITALIANITALIANITALIANITALiTALIAN2ITALIANITALIANITALIANITALen2ITALIANITALIANITALIANITALItalienisch                                           ", "DEFGILMNOQRSTUWXZBBBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCCCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDEDJDKDMDODZECEEEGEHERESETFIFJFKFMFOFRGGBGDGEGFGGGHGIGLGMGNGPGQGRGSGTGUGWGYHKHMHNHRHTHUIDIEILIMINIOIQIRISITJEJMJOJPKEKGKHKIKMKNKPKRKWKYKZLLBLCLILKLRLSLTLULVLYMMCMDMEMFMGMHMKMLMMMNMOMPMQMRMSMTMUMVMWMXMYMZNNCNENFNGNINLNONPNRNUNZOMPPEPFPGPHPKPLPMPNPRPSPTPWPYQRERORSRURWSSBSCSDSESGSHSISJSKSLSMSNSOSRSSSTSVSXSYSZTCTDTFTGTHTJTKTLTMTNTOTRTTTVTWTZUUGUMUSUYUZVVCVEVGVIVNVUWFWSYEYTZZMZW");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test19728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19728");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("                                                                                     ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test19729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19729");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "                                NI                                 ", (java.lang.CharSequence) "corn");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 67 + "'", int2 == 67);
    }

    @Test
    public void test19730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19730");
        boolean boolean1 = org.apache.commons.lang3.CharUtils.isAsciiAlphanumeric('R');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test19731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19731");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("gbr", "Hhhhhhhhhh");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "gbr" + "'", str2, "gbr");
    }

    @Test
    public void test19732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19732");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("italian_ITALIAN_English", "\\u0069hhhhhhhhhh");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray4, "                                     fran\347ais (France)                                      ");
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("\\", '8');
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray9, 'F', 62, 52);
        java.lang.String[] strArray14 = org.apache.commons.lang3.StringUtils.stripAll(strArray9);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.replaceEach("                              it", strArray4, strArray9);
        java.lang.String[] strArray17 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("E             g                          ");
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray17);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray17);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = org.apache.commons.lang3.StringUtils.replaceEach("Iinglese", strArray9, strArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 1 vs 40");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "                              it" + "'", str15, "                              it");
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test19733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19733");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "hi!_\\U0020...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test19734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19734");
        java.util.Locale locale1 = new java.util.Locale("2aiTALIANiTALIANiTALIANiTAL");
        java.lang.String str2 = locale1.getScript();
        org.junit.Assert.assertEquals(locale1.toString(), "2aitalianitalianitalianital");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test19735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19735");
        char char1 = org.apache.commons.lang3.CharUtils.toChar("z...\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r...");
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + 'z' + "'", char1 == 'z');
    }

    @Test
    public void test19736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19736");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("c", 'b', '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "c" + "'", str3, "c");
    }

    @Test
    public void test19737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19737");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaFranz\366sisch (Kanada)", 2, "\u4e2d\u6587");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaFranz\366sisch (Kanada)" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaFranz\366sisch (Kanada)");
    }

    @Test
    public void test19738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19738");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("itTAiT_ITA", "hi!       ");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray2);
        int int4 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray3);
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "    \\XTALXAN_ITALIAN_ENGLXSH    ");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test19739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19739");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("Cinese (cina)\\u0069h...", "          ita                ", "HHHHHHHHH");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Cinese (cina)\\u0069h..." + "'", str3, "Cinese (cina)\\u0069h...");
    }

    @Test
    public void test19740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19740");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("English (United Kingdom)", "french (NC_HZ)");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test19741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19741");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("", "Chinese (China)", (int) 'x');
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "\\U0064");
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray3);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test19742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19742");
        char char2 = org.apache.commons.lang3.CharUtils.toChar((java.lang.Character) 'H', 'z');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + 'H' + "'", char2 == 'H');
    }

    @Test
    public void test19743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19743");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("\\u0068", "\\u005c");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\u0068" + "'", str2, "\\u0068");
    }

    @Test
    public void test19744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19744");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("HHHHHHHHH         ITALIAN_italian_eNGLISH         ITALIAN_!IHitTAiT_ITALIAN_EgAish", "\\u002 (ROYAUME-UNI)");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test19745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19745");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("...nglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEngli...", "                                                                                              Deutsch");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test19746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19746");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("0!TALIAN!TALIAN!TALIAN!TALzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz", 'B', '7');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0!TALIAN!TALIAN!TALIAN!TALzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz" + "'", str3, "0!TALIAN!TALIAN!TALIAN!TALzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz");
    }

    @Test
    public void test19747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19747");
        java.util.Locale locale1 = java.util.Locale.ITALIAN;
        java.lang.String str2 = locale1.getDisplayLanguage();
        java.util.Locale locale3 = locale1.stripExtensions();
        java.util.Locale locale5 = java.util.Locale.forLanguageTag("\\u0020");
        java.lang.String str6 = locale5.getDisplayScript();
        java.lang.String str7 = locale3.getDisplayCountry(locale5);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.lowerCase("\ud504\ub791\uc2a4\uc5b4", locale3);
        java.util.Set<java.lang.String> strSet9 = locale3.getUnicodeLocaleKeys();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "it");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Italian" + "'", str2, "Italian");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "it");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\ud504\ub791\uc2a4\uc5b4" + "'", str8, "\ud504\ub791\uc2a4\uc5b4");
        org.junit.Assert.assertNotNull(strSet9);
    }

    @Test
    public void test19748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19748");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("\u1112\u1161\u11ab\u1100\u116e\u11a8\u110b\u1165\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n", "                               English(UnitedKingdom)                               ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test19749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19749");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("!_\\U0020_Itle#########################################################################################", 28);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!_\\U0020_Itle#########################################################################################" + "'", str2, "!_\\U0020_Itle#########################################################################################");
    }

    @Test
    public void test19750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19750");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("RRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRfranceRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR", "             \\u0049                                           xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx", "...                             xxxxxxxxxxxxxxxxxxtit...                             xxxxxxxxxxxxxxxxxxx");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "RRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRfranceRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR" + "'", str3, "RRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRfranceRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR");
    }

    @Test
    public void test19751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19751");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("IIIIIIIIIIIIIIIIIIIIIIIIIIITALIAN_ITALIAN_ENGLISHIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII", "1\\u0061\\u0061\\u0061                           ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "IIIIIIIIIIIIIIIIIIIIIIIIIIITALIAN_ITALIAN_ENGLISHIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII" + "'", str2, "IIIIIIIIIIIIIIIIIIIIIIIIIIITALIAN_ITALIAN_ENGLISHIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII");
    }

    @Test
    public void test19752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19752");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("", "\\u0029fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "hhhhhhhhhh");
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, "\uad6d\uc911\uc5b4\uad6d\uc911IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test19753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19753");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.setLanguageTag("Italian");
        java.util.Locale.Builder builder4 = builder0.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder6 = builder0.removeUnicodeLocaleAttribute("D  \\u007");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: D  \\u007 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void test19754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19754");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale locale2 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str3 = locale2.getDisplayName();
        java.util.Locale.Builder builder4 = builder1.setLocale(locale2);
        java.util.Locale.Builder builder6 = builder1.setLanguage("und");
        java.util.Locale locale7 = builder6.build();
        java.util.Locale.Builder builder9 = builder6.setLanguage("fr");
        java.util.Locale.Builder builder10 = builder6.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder12 = builder10.setRegion("ADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhATzhAUzhAWzhAXzhAZzhBAzhBBzhBDzhBEzhBFzhBGzhBHzhBIzhBJzhBLzhBMzhBNzhBOzhBQzhBRzhBSzhBTzhBVzhBWzhBYzhBZzhCAzhCCzhCDzhCFzhCGzhCHzhCIzhCKzhCLzhCMzhCNzhCOzhCRzhCUzhCVzhCWzhCXzhCYzhCZzhDEzhDJzhDKzhDMzhDOzhDZzhECzhEEzhEGzhEHzhERzhESzhETzhFIzhFJzhFKzhFMzhFOzhFRzhGAzhGBzhGDzhGEzhGFzhGGzhGHzhGIzhGLzhGMzhGNzhGPzhGQzhGRzhGSzhGTzhGUzhGWzhGYzhHKzhHMzhHNzhHRzhHTzhHUzhIDzhIEzhILzhIMzhINzhIOzhIQzhIRzhISzhITzhJEzhJMzhJOzhJPzhKEzhKGzhKHzhKIzhKMzhKNzhKPzhKRzhKWzhKYzhKZzhLAzhLBzhLCzhLIzhLKzhLRzhLSzhLTzhLUzhLVzhLYzhMAzhMCzhMDzhMEzhMFzhMGzhMHzhMKzhMLzhMMzhMNzhMOzhMPzhMQzhMRzhMSzhMTzhMUzhMVzhMWzhMXzhMYzhMZzhNAzhNCzhNEzhNFzhNGzhNIzhNLzhNOzhNPzhNRzhNUzhNZzhOMzhPAzhPEzhPFzhPGzhPHzhPKzhPLzhPMzhPNzhPRzhPSzhPTzhPWzhPYzhQAzhREzhROzhRSzhRUzhRWzhSAzhSBzhSCzhSDzhSEzhSGzhSHzhSIzhSJzhSKzhSLzhSMzhSNzhSOzhSRzhSSzhSTzhSVzhSXzhSYzhSZzhTCzhTDzhTFzhTGzhTHzhTJzhTKzhTLzhTMzhTNzhTOzhTRzhTTzhTVzhTWzhTZzhUAzhUGzhUMzhUSzhUYzhUZzhVAzhVCzhVEzhVGzhVIzhVNzhVUzhWFzhWSzhYEzhYTzhZAzhZMzhZW");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: ADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhATzhAUzhAWzhAXzhAZzhBAzhBBzhBDzhBEzhBFzhBGzhBHzhBIzhBJzhBLzhBMzhBNzhBOzhBQzhBRzhBSzhBTzhBVzhBWzhBYzhBZzhCAzhCCzhCDzhCFzhCGzhCHzhCIzhCKzhCLzhCMzhCNzhCOzhCRzhCUzhCVzhCWzhCXzhCYzhCZzhDEzhDJzhDKzhDMzhDOzhDZzhECzhEEzhEGzhEHzhERzhESzhETzhFIzhFJzhFKzhFMzhFOzhFRzhGAzhGBzhGDzhGEzhGFzhGGzhGHzhGIzhGLzhGMzhGNzhGPzhGQzhGRzhGSzhGTzhGUzhGWzhGYzhHKzhHMzhHNzhHRzhHTzhHUzhIDzhIEzhILzhIMzhINzhIOzhIQzhIRzhISzhITzhJEzhJMzhJOzhJPzhKEzhKGzhKHzhKIzhKMzhKNzhKPzhKRzhKWzhKYzhKZzhLAzhLBzhLCzhLIzhLKzhLRzhLSzhLTzhLUzhLVzhLYzhMAzhMCzhMDzhMEzhMFzhMGzhMHzhMKzhMLzhMMzhMNzhMOzhMPzhMQzhMRzhMSzhMTzhMUzhMVzhMWzhMXzhMYzhMZzhNAzhNCzhNEzhNFzhNGzhNIzhNLzhNOzhNPzhNRzhNUzhNZzhOMzhPAzhPEzhPFzhPGzhPHzhPKzhPLzhPMzhPNzhPRzhPSzhPTzhPWzhPYzhQAzhREzhROzhRSzhRUzhRWzhSAzhSBzhSCzhSDzhSEzhSGzhSHzhSIzhSJzhSKzhSLzhSMzhSNzhSOzhSRzhSSzhSTzhSVzhSXzhSYzhSZzhTCzhTDzhTFzhTGzhTHzhTJzhTKzhTLzhTMzhTNzhTOzhTRzhTTzhTVzhTWzhTZzhUAzhUGzhUMzhUSzhUYzhUZzhVAzhVCzhVEzhVGzhVIzhVNzhVUzhWFzhWSzhYEzhYTzhZAzhZMzhZW [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fr_CA");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "French (Canada)" + "'", str3, "French (Canada)");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "und_CA");
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test19755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19755");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) " \\U0078 ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test19756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19756");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("\\u0034                                                                                              ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\u0034                                                                                              " + "'", str1, "\\u0034                                                                                              ");
    }

    @Test
    public void test19757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19757");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r                                                                                              Deutsch", "Etats-Unis");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test19758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19758");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC\\xtalxan_ITALIAN_EnglxshCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 151 + "'", int1 == 151);
    }

    @Test
    public void test19759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19759");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "uuuu", (java.lang.CharSequence) "ranzosisch (Frankreich)kkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 88 + "'", int2 == 88);
    }

    @Test
    public void test19760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19760");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("...ISH ...", "...78zhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzh..", 224);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test19761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19761");
        java.util.Locale locale0 = java.util.Locale.getDefault();
        java.lang.String str1 = locale0.getDisplayName();
        java.util.Locale locale2 = locale0.stripExtensions();
        java.util.Set<java.lang.String> strSet3 = locale0.getUnicodeLocaleAttributes();
        org.junit.Assert.assertNotNull(locale0);
// flaky:         org.junit.Assert.assertEquals(locale0.toString(), "");
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(locale2);
// flaky:         org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertNotNull(strSet3);
    }

    @Test
    public void test19762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19762");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("CN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "CN" + "'", str1, "CN");
    }

    @Test
    public void test19763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19763");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("RoyaumeDeutsch\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\-Deutsch\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\Uni", "ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDEDJDKDMDODZECEEEGEHERESETFIFJFKFMFOFRGAGBGDGEGFGGGHGIGLGMGNGPGQGRGSGTGUGWGYHKHMHNHRHTHUIDIEILIMINIOIQIRISITJEJMJOJPKEKGKHKIKMKNKPKRKWKYKZLALBLCLILKLRLSLTLULVLYMAMCMDMEMFMGMHMKMLMMMNMOMPMQMRMSMTMUMVMWMXMYMZNANCNENFNGNINLNONPNRNUNZOMPAPEPFPGPHPKPLPMPNPRPSPTPWPYQARERORSRURWSASBSCSDSESGSHSISJSKSLSMSNSOSRSSSTSVSXSYSZTCTDTFTGTHTJTKTLTMTNTOTRTTTVTWTZUAUGUMUSUYUZVAVCVEVGVIVNVUWFWSYEYTZAZMZ", 2, 84);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "RoADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDEDJDKDMDODZECEEEGEHERESETFIFJFKFMFOFRGAGBGDGEGFGGGHGIGLGMGNGPGQGRGSGTGUGWGYHKHMHNHRHTHUIDIEILIMINIOIQIRISITJEJMJOJPKEKGKHKIKMKNKPKRKWKYKZLALBLCLILKLRLSLTLULVLYMAMCMDMEMFMGMHMKMLMMMNMOMPMQMRMSMTMUMVMWMXMYMZNANCNENFNGNINLNONPNRNUNZOMPAPEPFPGPHPKPLPMPNPRPSPTPWPYQARERORSRURWSASBSCSDSESGSHSISJSKSLSMSNSOSRSSSTSVSXSYSZTCTDTFTGTHTJTKTLTMTNTOTRTTTVTWTZUAUGUMUSUYUZVAVCVEVGVIVNVUWFWSYEYTZAZMZ\\\\\\\\\\\\\\\\\\\\\\\\\\-Deutsch\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\Uni" + "'", str4, "RoADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDEDJDKDMDODZECEEEGEHERESETFIFJFKFMFOFRGAGBGDGEGFGGGHGIGLGMGNGPGQGRGSGTGUGWGYHKHMHNHRHTHUIDIEILIMINIOIQIRISITJEJMJOJPKEKGKHKIKMKNKPKRKWKYKZLALBLCLILKLRLSLTLULVLYMAMCMDMEMFMGMHMKMLMMMNMOMPMQMRMSMTMUMVMWMXMYMZNANCNENFNGNINLNONPNRNUNZOMPAPEPFPGPHPKPLPMPNPRPSPTPWPYQARERORSRURWSASBSCSDSESGSHSISJSKSLSMSNSOSRSSSTSVSXSYSZTCTDTFTGTHTJTKTLTMTNTOTRTTTVTWTZUAUGUMUSUYUZVAVCVEVGVIVNVUWFWSYEYTZAZMZ\\\\\\\\\\\\\\\\\\\\\\\\\\-Deutsch\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\Uni");
    }

    @Test
    public void test19764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19764");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("4");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4" + "'", str1, "4");
    }

    @Test
    public void test19765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19765");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("FRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhAeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee", "hi!       ", "CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCEgschCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "FRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhAeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee" + "'", str3, "FRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhAeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee");
    }

    @Test
    public void test19766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19766");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("fRHfR)", strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=frhfr)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test19767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19767");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale locale2 = java.util.Locale.UK;
        java.util.Locale.Builder builder3 = builder0.setLocale(locale2);
        java.util.Locale.setDefault(locale2);
        java.util.Locale locale6 = new java.util.Locale("en");
        boolean boolean7 = locale6.hasExtensions();
        java.util.Set<java.lang.String> strSet8 = locale6.getUnicodeLocaleKeys();
        java.util.Locale locale9 = java.util.Locale.ITALIAN;
        java.lang.String str10 = locale9.getDisplayLanguage();
        java.util.Locale locale11 = locale9.stripExtensions();
        java.lang.String str12 = locale11.getVariant();
        java.lang.String str13 = locale6.getDisplayLanguage(locale11);
        java.lang.String str14 = locale2.getDisplayVariant(locale6);
        java.lang.String str15 = locale2.getVariant();
        java.lang.String str16 = locale2.getLanguage();
        java.lang.String str17 = locale2.getDisplayScript();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en_GB");
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertEquals(locale6.toString(), "en");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "it");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Italian" + "'", str10, "Italian");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "it");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "inglese" + "'", str13, "inglese");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "en" + "'", str16, "en");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test19768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19768");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("i\\u0020iTALIANiTALIANiTALIANiTALIitBBBBBBBBB\\BBBBB", "frdzhezhfzhgzhizhlzhmzhnzhozhqzhrzhszheeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "frdzhezhfzhgzhizhlzhmzhnzhozhqzhrzhszheeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee" + "'", str2, "frdzhezhfzhgzhizhlzhmzhnzhozhqzhrzhszheeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee");
    }

    @Test
    public void test19769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19769");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("BFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEKoreanADA", "h_HHHHHHHHH_CV CW CX CY CZ DE DJ DK DM DO DZ EC EE EG EH ER ES ET FI FJ FK");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "BFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEKoreanADA" + "'", str2, "BFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEKoreanADA");
    }

    @Test
    public void test19770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19770");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("CHINESE (CHINA", "CHNtttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttt");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CHINESE (CHINA" + "'", str2, "CHINESE (CHINA");
    }

    @Test
    public void test19771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19771");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("it                    (\\U0034\\U00                                             HCSTUED                                             \\U0034\\U00,cinese (Cina)\\u0069hhhhhhhhhh\\u0069hhhhhhhhhh\\u0069hhhhhhhhhh\\u0069hh)", "\\U0020ItalianItalianItalianItali\\U0020ItalianItalianItalianItal");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "it                    (\\U0034\\U00                                             HCSTUED                                             \\U0034\\U00,cinese (Cina)\\u0069hhhhhhhhhh\\u0069hhhhhhhhhh\\u0069hhhhhhhhhh\\u0069hh)" + "'", str2, "it                    (\\U0034\\U00                                             HCSTUED                                             \\U0034\\U00,cinese (Cina)\\u0069hhhhhhhhhh\\u0069hhhhhhhhhh\\u0069hhhhhhhhhh\\u0069hh)");
    }

    @Test
    public void test19772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19772");
        java.lang.String[] strArray1 = null;
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("cCCCC...", strArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test19773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19773");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("\\U0020", "allemand");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "ZH_cnFrench (Canada)");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\\U0020" + "'", str4, "\\U0020");
    }

    @Test
    public void test19774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19774");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("069\\u0069\\u0069\\u0069\\u0069\\", 'x');
        int int4 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test19775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19775");
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
        java.util.Locale.Builder builder12 = builder11.clear();
        java.util.Locale locale13 = builder12.build();
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
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "");
    }

    @Test
    public void test19776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19776");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("                                                                                        e                        ", "anau00");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test19777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19777");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale locale2 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str3 = locale2.getDisplayName();
        java.util.Locale.Builder builder4 = builder1.setLocale(locale2);
        java.util.Locale.Builder builder6 = builder1.setLanguage("und");
        java.util.Locale locale7 = builder6.build();
        java.util.Locale locale8 = builder6.build();
        java.util.Locale locale9 = builder6.build();
        java.lang.String str10 = locale9.getDisplayCountry();
        java.lang.String str11 = locale9.getCountry();
        java.lang.String str12 = locale9.getVariant();
        java.lang.Object obj13 = null;
        boolean boolean14 = locale9.equals(obj13);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "French (Canada)" + "'", str3, "French (Canada)");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "und_CA");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "und_CA");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "und_CA");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Canada" + "'", str10, "Canada");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "CA" + "'", str11, "CA");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test19778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19778");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh99999\\u0021hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh", "                                               8300u\\                                                ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh99999\\u0021hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh" + "'", str2, "hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh99999\\u0021hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh");
    }

    @Test
    public void test19779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19779");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("rEGNO uNITO", (int) 'b', 8);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test19780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19780");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center(" \\U0066  ", (int) '5', 'g');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "gggggggggggggggggggggg \\U0066  gggggggggggggggggggggg" + "'", str3, "gggggggggggggggggggggg \\U0066  gggggggggggggggggggggg");
    }

    @Test
    public void test19781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19781");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder2 = builder0.clear();
        java.util.Locale.Builder builder3 = builder2.clear();
        java.util.Locale locale4 = java.util.Locale.CHINESE;
        java.lang.String str5 = locale4.getCountry();
        java.util.Locale.Builder builder6 = builder3.setLocale(locale4);
        java.lang.String str7 = locale4.getVariant();
        java.util.Locale locale8 = locale4.stripExtensions();
        java.util.Locale locale9 = java.util.Locale.ITALIAN;
        java.lang.String str10 = locale9.getDisplayLanguage();
        java.util.Locale locale11 = locale9.stripExtensions();
        java.lang.String str12 = locale9.getLanguage();
        java.lang.String str13 = locale9.getISO3Language();
        java.lang.String str14 = locale9.getDisplayLanguage();
        java.lang.String str15 = locale4.getDisplayVariant(locale9);
        java.util.Locale locale16 = java.util.Locale.FRANCE;
        java.util.Locale locale17 = java.util.Locale.ITALIAN;
        java.lang.String str19 = locale17.getExtension('h');
        java.lang.String str20 = locale16.getDisplayScript(locale17);
        java.util.Locale locale21 = locale16.stripExtensions();
        java.lang.String str22 = locale21.getISO3Country();
        java.util.Locale locale24 = new java.util.Locale("en");
        boolean boolean25 = locale24.hasExtensions();
        java.util.Set<java.lang.String> strSet26 = locale24.getUnicodeLocaleKeys();
        java.lang.String str27 = locale21.getDisplayCountry(locale24);
        java.util.Locale locale29 = new java.util.Locale("en");
        boolean boolean30 = locale29.hasExtensions();
        java.lang.String str31 = locale24.getDisplayCountry(locale29);
        java.lang.String str32 = locale29.getDisplayLanguage();
        java.lang.String str33 = locale4.getDisplayVariant(locale29);
        java.lang.String str34 = locale4.getDisplayVariant();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "zh");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "it");
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "italien" + "'", str10, "italien");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "it");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "it" + "'", str12, "it");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "ita" + "'", str13, "ita");
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "italien" + "'", str14, "italien");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "it");
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "FRA" + "'", str22, "FRA");
        org.junit.Assert.assertEquals(locale24.toString(), "en");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(strSet26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "France" + "'", str27, "France");
        org.junit.Assert.assertEquals(locale29.toString(), "en");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
// flaky:         org.junit.Assert.assertEquals("'" + str32 + "' != '" + "anglais" + "'", str32, "anglais");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
    }

    @Test
    public void test19782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19782");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("hEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglish", "french", "NC_HZ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "EHglisEHglisEHglisEHglisEHglisEHglisEHglisEHglisEHglisEHglisEHglisEHglisEHglisEHglisEHglisEHglisEHglisEHglisEHglisEHglisEHglisEHglisEHglisEHglisEHglisEHglisEHglisEHglisEHglisEHglisEHglisEHglisEHglisEHglisEHglisEHglisEHglisEHglisEHglisEHglisEHglisEHglis" + "'", str3, "EHglisEHglisEHglisEHglisEHglisEHglisEHglisEHglisEHglisEHglisEHglisEHglisEHglisEHglisEHglisEHglisEHglisEHglisEHglisEHglisEHglisEHglisEHglisEHglisEHglisEHglisEHglisEHglisEHglisEHglisEHglisEHglisEHglisEHglisEHglisEHglisEHglisEHglisEHglisEHglisEHglisEHglis");
    }

    @Test
    public void test19783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19783");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "kkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk)hcierknarF( hcsisoznarFhcsis\366znarF", (java.lang.CharSequence) "-RFC");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test19784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19784");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("KOREAN (SOUTH KOREA)", 109);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test19785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19785");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "italian (italian,englcor\351encor\351encor\351encor\351encor\351encor\351encor\351encor\351encor\351encor\351encor\351encor\351encor\351encor\351encor\351encor\351encor\351");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test19786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19786");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("aaaaaaaaaaaaaa", 37, 'G');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "GGGGGGGGGGGGGGGGGGGGGGGaaaaaaaaaaaaaa" + "'", str3, "GGGGGGGGGGGGGGGGGGGGGGGaaaaaaaaaaaaaa");
    }

    @Test
    public void test19787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19787");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("English", "Italian");
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("hi!", "", (int) (short) 10);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("", strArray5, strArray9);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray5, 'a');
        java.lang.String[] strArray14 = org.apache.commons.lang3.StringUtils.stripAll(strArray5, "                                                                                                    ");
        int int15 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("hi!       allemandItalienischallemanditalian_ITALIAN_EnglishallemandHI!allemandhi!allemandADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDED...allemand\\u0034allemandHI!allemandItalianallemand\\u0061allemand\\u0023allemandhi!allemandiTALIANallemandChinese (China)allemandhi!allemandzh_CNallemandiTALIANallemandenallemandItalienisch", strArray14);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAny("\\u00de\\u00\\u00de\\u00\\u00d         INGLESE       ", strArray14);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Eagaash" + "'", str12, "Eagaash");
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 395 + "'", int15 == 395);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test19788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19788");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale locale2 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str3 = locale2.getDisplayName();
        java.util.Locale.Builder builder4 = builder1.setLocale(locale2);
        java.util.Locale.Builder builder5 = builder1.clear();
        java.util.Locale.Builder builder6 = builder5.clear();
        java.util.Locale.Builder builder8 = builder5.setLanguage("zh");
        java.util.Locale locale9 = builder8.build();
        java.util.Locale.setDefault(locale9);
        java.util.Locale locale11 = locale9.stripExtensions();
        java.util.Locale locale12 = locale11.stripExtensions();
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
        java.util.Locale.Category category29 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale30 = java.util.Locale.getDefault(category29);
        java.util.Locale locale31 = java.util.Locale.FRANCE;
        java.util.Locale locale32 = java.util.Locale.ITALIAN;
        java.lang.String str34 = locale32.getExtension('h');
        java.lang.String str35 = locale31.getDisplayScript(locale32);
        java.lang.String str36 = locale31.getISO3Country();
        java.util.Locale locale37 = java.util.Locale.GERMAN;
        java.util.Locale.setDefault(locale37);
        java.lang.String str39 = locale31.getDisplayName(locale37);
        java.lang.String str40 = locale31.getScript();
        java.util.Locale.setDefault(category29, locale31);
        java.lang.String str42 = locale14.getDisplayCountry(locale31);
        java.lang.String str43 = locale31.getCountry();
        java.lang.String str44 = org.apache.commons.lang3.StringUtils.upperCase("\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069!ih\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\", locale31);
        java.util.Locale locale45 = locale31.stripExtensions();
        java.util.Locale locale47 = new java.util.Locale("\\u005c");
        java.util.Locale locale49 = java.util.Locale.CHINESE;
        java.lang.String str50 = org.apache.commons.lang3.StringUtils.lowerCase("Franz\366sisch (Frankreich)", locale49);
        java.lang.String str51 = locale49.getVariant();
        java.lang.String str52 = locale47.getDisplayScript(locale49);
        java.lang.String str53 = locale31.getDisplayLanguage(locale49);
        java.lang.String str54 = locale49.toLanguageTag();
        java.lang.String str55 = locale11.getDisplayVariant(locale49);
        java.util.Locale.setDefault(locale11);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fr_CA");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "fran\347ais (Canada)" + "'", str3, "fran\347ais (Canada)");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "zh");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "zh");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "zh");
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
        org.junit.Assert.assertTrue("'" + category29 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category29.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "zh");
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "it");
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "FRA" + "'", str36, "FRA");
        org.junit.Assert.assertNotNull(locale37);
        org.junit.Assert.assertEquals(locale37.toString(), "de");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "Franz\366sisch (Frankreich)" + "'", str39, "Franz\366sisch (Frankreich)");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "FR" + "'", str43, "FR");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069!IH\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069\\" + "'", str44, "\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069!IH\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069\\");
        org.junit.Assert.assertNotNull(locale45);
        org.junit.Assert.assertEquals(locale45.toString(), "fr_FR");
        org.junit.Assert.assertEquals(locale47.toString(), "\\u005c");
        org.junit.Assert.assertNotNull(locale49);
        org.junit.Assert.assertEquals(locale49.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "franz\366sisch (frankreich)" + "'", str50, "franz\366sisch (frankreich)");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "\u6cd5\u6587" + "'", str53, "\u6cd5\u6587");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "zh" + "'", str54, "zh");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
    }

    @Test
    public void test19789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19789");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("rnz\366sisch(Knd                                                                                                                                                                                                               ", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "rnz\366sisch(Knd                                                                                                                                                                                                               " + "'", str2, "rnz\366sisch(Knd                                                                                                                                                                                                               ");
    }

    @Test
    public void test19790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19790");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setRegion("ti");
        java.util.Locale.Builder builder3 = builder0.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder5 = builder3.removeUnicodeLocaleAttribute("  aNIHc   ");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute:   aNIHc    [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
    }

    @Test
    public void test19791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19791");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("iIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIITALIAN_italian_eNGLISHIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII                                             hcsfr-CueD                                                                                          hcsfr-CueD  ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "iIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIITALIAN_italian_eNGLISHIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII                                             hcsfr-CueD                                                                                          hcsfr-CueD  " + "'", str1, "iIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIITALIAN_italian_eNGLISHIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII                                             hcsfr-CueD                                                                                          hcsfr-CueD  ");
    }

    @Test
    public void test19792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19792");
        java.util.Locale locale0 = java.util.Locale.ITALIAN;
        java.lang.String str1 = locale0.getDisplayLanguage();
        java.util.Locale locale2 = locale0.stripExtensions();
        java.lang.String str3 = locale2.getVariant();
        java.util.Set<java.lang.String> strSet4 = locale2.getUnicodeLocaleAttributes();
        java.lang.String str5 = locale2.getDisplayScript();
        java.lang.String str6 = locale2.getScript();
        boolean boolean7 = locale2.hasExtensions();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\u610f\u5927\u5229\u6587" + "'", str1, "\u610f\u5927\u5229\u6587");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "it");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test19793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19793");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("\\u002e", "Frnz\366sisch(Knd)");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test19794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19794");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.util.Locale locale1 = java.util.Locale.ITALIAN;
        java.lang.String str3 = locale1.getExtension('h');
        java.lang.String str4 = locale0.getDisplayScript(locale1);
        java.lang.String str5 = locale0.getISO3Country();
        java.util.Locale locale8 = java.util.Locale.forLanguageTag("8ian\\u0020i86");
        java.lang.String str9 = locale8.getVariant();
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.lowerCase("nglish (United Kingdom)", locale8);
        java.util.Locale.Category category11 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale12 = java.util.Locale.getDefault(category11);
        java.util.Locale locale13 = java.util.Locale.GERMAN;
        java.util.Locale locale14 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str15 = locale13.getDisplayName(locale14);
        java.util.Locale.setDefault(category11, locale14);
        java.util.Set<java.lang.String> strSet17 = locale14.getUnicodeLocaleKeys();
        boolean boolean18 = locale14.hasExtensions();
        java.lang.String str19 = locale8.getDisplayName(locale14);
        java.lang.String str20 = locale0.getDisplayCountry(locale8);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "it");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "FRA" + "'", str5, "FRA");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "nglish (united kingdom)" + "'", str10, "nglish (united kingdom)");
        org.junit.Assert.assertTrue("'" + category11 + "' != '" + java.util.Locale.Category.FORMAT + "'", category11.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "zh");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "de");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "allemand" + "'", str15, "allemand");
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "France" + "'", str20, "France");
    }

    @Test
    public void test19795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19795");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("fRANZ\326SISCH (kANADA)fRANZ\326S                                                                 fRANZ\326SISCH (kANADA)fRANZ\326SI", "\ub2e4\ub098\uce90\uc5b4\uc2a4\ub791\ud504");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test19796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19796");
        java.util.Locale locale1 = java.util.Locale.FRANCE;
        java.util.Locale locale2 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str3 = locale1.getDisplayScript(locale2);
        java.lang.String str4 = locale2.getVariant();
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.lowerCase("\\u0034", locale2);
        boolean boolean6 = locale2.hasExtensions();
        java.util.Locale locale8 = java.util.Locale.forLanguageTag("");
        java.lang.String str9 = locale2.getDisplayName(locale8);
        java.lang.String str10 = locale2.getDisplayVariant();
        java.util.Locale locale12 = java.util.Locale.forLanguageTag("\\u0020");
        java.lang.String str13 = locale12.getDisplayScript();
        java.util.Locale.setDefault(locale12);
        java.lang.String str15 = locale2.getDisplayScript(locale12);
        java.lang.String str16 = locale12.getDisplayVariant();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\\u0034" + "'", str5, "\\u0034");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "French (Canada)" + "'", str9, "French (Canada)");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test19797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19797");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("44444444444444444444444444444444IHaaaaaaaaaaaaaaaaaaaaaaaaFranz\366sisch (Frankreich)aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "44444444444444444444444444444444IHaaaaaaaaaaaaaaaaaaaaaaaaFranz\366sisch (Frankreich)aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "44444444444444444444444444444444IHaaaaaaaaaaaaaaaaaaaaaaaaFranz\366sisch (Frankreich)aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test19798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19798");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("cccccccccccccccccccccccccccccccccccccccccccccccccenglischcccccccccccccccccccccccccccccccccccccccccccccccccc", 'u');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test19799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19799");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("                                             hcstueD                                             ", "nailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailati");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "fr-C");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "                                             hcsfr-CueD                                             " + "'", str4, "                                             hcsfr-CueD                                             ");
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test19800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19800");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("HSAAGAekkkkkkkkkkkkkkkkk");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test19801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19801");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("INGLESE");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "INGLESE" + "'", str1, "INGLESE");
    }

    @Test
    public void test19802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19802");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.Locale.LanguageRange[] languageRangeArray3 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList4 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList4, languageRangeArray3);
        java.lang.String[] strArray8 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        java.util.Locale.FilteringMode filteringMode11 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList12 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList4, (java.util.Collection<java.lang.String>) strList9, filteringMode11);
        java.util.Locale.FilteringMode filteringMode13 = java.util.Locale.FilteringMode.AUTOSELECT_FILTERING;
        java.util.List<java.lang.String> strList14 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strList9, filteringMode13);
        java.util.Locale.LanguageRange[] languageRangeArray15 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList16 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList16, languageRangeArray15);
        java.lang.String[] strArray20 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList21 = new java.util.ArrayList<java.lang.String>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList21, strArray20);
        java.util.Locale.FilteringMode filteringMode23 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList24 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList16, (java.util.Collection<java.lang.String>) strList21, filteringMode23);
        java.lang.String[] strArray44 = new java.lang.String[] { "hi!       ", "Italienisch", "italian_ITALIAN_English", "HI!", "hi!", "ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDED...", "\\u0034", "HI!", "Italian", "\\u0061", "\\u0023", "hi!", "iTALIAN", "Chinese (China)", "hi!", "zh_CN", "iTALIAN", "en", "Italienisch" };
        java.util.ArrayList<java.lang.String> strList45 = new java.util.ArrayList<java.lang.String>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList45, strArray44);
        java.util.Locale.LanguageRange[] languageRangeArray47 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList48 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList48, languageRangeArray47);
        java.lang.String[] strArray52 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList53 = new java.util.ArrayList<java.lang.String>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList53, strArray52);
        java.util.Locale.FilteringMode filteringMode55 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList56 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList48, (java.util.Collection<java.lang.String>) strList53, filteringMode55);
        java.util.List<java.lang.String> strList57 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList16, (java.util.Collection<java.lang.String>) strList45, filteringMode55);
        java.util.List<java.lang.String> strList58 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strList45);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap59 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList60 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap59);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap61 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList62 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap61);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap63 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList64 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap63);
        java.util.Locale.LanguageRange[] languageRangeArray65 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList66 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList66, languageRangeArray65);
        java.lang.String[] strArray70 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList71 = new java.util.ArrayList<java.lang.String>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList71, strArray70);
        java.util.Locale.FilteringMode filteringMode73 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList74 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList66, (java.util.Collection<java.lang.String>) strList71, filteringMode73);
        java.util.Locale.LanguageRange[] languageRangeArray75 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList76 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean77 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList76, languageRangeArray75);
        java.lang.String[] strArray80 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList81 = new java.util.ArrayList<java.lang.String>();
        boolean boolean82 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList81, strArray80);
        java.util.Locale.FilteringMode filteringMode83 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList84 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList76, (java.util.Collection<java.lang.String>) strList81, filteringMode83);
        java.lang.String[] strArray86 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList87 = new java.util.ArrayList<java.lang.String>();
        boolean boolean88 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList87, strArray86);
        java.util.List<java.lang.String> strList89 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList76, (java.util.Collection<java.lang.String>) strList87);
        java.lang.String str90 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList66, (java.util.Collection<java.lang.String>) strList87);
        java.lang.String str92 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.lang.String>) strList87, "HI!");
        java.lang.String str93 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strList87);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap94 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList95 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap94);
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(languageRangeArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + filteringMode11 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode11.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertTrue("'" + filteringMode13 + "' != '" + java.util.Locale.FilteringMode.AUTOSELECT_FILTERING + "'", filteringMode13.equals(java.util.Locale.FilteringMode.AUTOSELECT_FILTERING));
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertNotNull(languageRangeArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + filteringMode23 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode23.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(languageRangeArray47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(strArray52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + filteringMode55 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode55.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList56);
        org.junit.Assert.assertNotNull(strList57);
        org.junit.Assert.assertNotNull(strList58);
        org.junit.Assert.assertNotNull(languageRangeList60);
        org.junit.Assert.assertNotNull(languageRangeList62);
        org.junit.Assert.assertNotNull(languageRangeList64);
        org.junit.Assert.assertNotNull(languageRangeArray65);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(strArray70);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertTrue("'" + filteringMode73 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode73.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList74);
        org.junit.Assert.assertNotNull(languageRangeArray75);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNotNull(strArray80);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertTrue("'" + filteringMode83 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode83.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList84);
        org.junit.Assert.assertNotNull(strArray86);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + true + "'", boolean88 == true);
        org.junit.Assert.assertNotNull(strList89);
        org.junit.Assert.assertNull(str90);
        org.junit.Assert.assertEquals("'" + str92 + "' != '" + "" + "'", str92, "");
        org.junit.Assert.assertNull(str93);
        org.junit.Assert.assertNotNull(languageRangeList95);
    }

    @Test
    public void test19803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19803");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("44444444444444444444444444444444!ih", "\u82f1\u6587");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test19804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19804");
        java.lang.String str1 = org.apache.commons.lang3.CharUtils.toString('\u671d');
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\u671d" + "'", str1, "\u671d");
    }

    @Test
    public void test19805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19805");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\U0020ITALIANITALIANIU0020ITALIANITALIANITALIANITALI", "zhazhzhzhzhzhzhzhzhzhzh_UND-CA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\U0020ITALIANITALIANIU0020ITALIANITALIANITALIANITALI" + "'", str2, "\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\U0020ITALIANITALIANIU0020ITALIANITALIANITALIANITALI");
    }

    @Test
    public void test19806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19806");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("                                       K", " Italia  Italia  Italia  Italia  Italia  Italia  Italia DEUTSCH Italia  Italia  Italia  Italia  Italia  Italia  Italia  ", (int) 'e');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                       K" + "'", str3, "                                       K");
    }

    @Test
    public void test19807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19807");
        java.util.Locale locale0 = java.util.Locale.getDefault();
        java.lang.String str1 = locale0.getDisplayScript();
        java.util.Locale locale2 = java.util.Locale.FRANCE;
        java.util.Locale locale3 = java.util.Locale.ITALIAN;
        java.lang.String str5 = locale3.getExtension('h');
        java.lang.String str6 = locale2.getDisplayScript(locale3);
        boolean boolean7 = locale2.hasExtensions();
        java.lang.String str8 = locale2.getVariant();
        java.util.Set<java.lang.Character> charSet9 = locale2.getExtensionKeys();
        java.lang.String str10 = locale2.toLanguageTag();
        java.lang.String str11 = locale0.getDisplayCountry(locale2);
        java.util.Locale.Category category12 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale14 = new java.util.Locale("...ANiTALI");
        java.util.Locale.setDefault(category12, locale14);
        java.util.Locale locale16 = java.util.Locale.getDefault(category12);
        java.lang.String str17 = locale16.getLanguage();
        java.lang.String str18 = locale0.getDisplayLanguage(locale16);
        java.lang.String str20 = locale16.getUnicodeLocaleType("jp");
        org.junit.Assert.assertNotNull(locale0);
// flaky:         org.junit.Assert.assertEquals(locale0.toString(), "\\u005c");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "it");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(charSet9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "fr-FR" + "'", str10, "fr-FR");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + category12 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category12.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertEquals(locale14.toString(), "...anitali");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "...anitali");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "...anitali" + "'", str17, "...anitali");
// flaky:         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\\u005c" + "'", str18, "\\u005c");
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test19808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19808");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("ROYAUME-UNI", 'C');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ROYAUME-UNI" + "'", str2, "ROYAUME-UNI");
    }

    @Test
    public void test19809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19809");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "ranzosisch (Frankreich)kkkkkkkkkkkkkkkkkkk...", (java.lang.CharSequence) "44                                                                                               en44");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test19810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19810");
        java.util.Locale locale3 = new java.util.Locale("\ud504\ub791\uc2a4\uc5b4\uce90\ub098\ub2e4)", "engengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengeng", "                                                                    \\u0020iTALIANiTALIANiTALIANiTALI");
        java.util.Locale locale4 = locale3.stripExtensions();
        java.util.Locale locale8 = new java.util.Locale("f", "Korean");
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.upperCase("itTAiT_ITALIAN_EgAish                                                                                ", locale8);
        java.util.Locale locale12 = new java.util.Locale("\\u0045", "");
        boolean boolean13 = locale12.hasExtensions();
        java.lang.String str14 = locale12.getDisplayScript();
        java.lang.String str15 = locale8.getDisplayName(locale12);
        java.lang.String str16 = locale3.getDisplayScript(locale8);
        boolean boolean18 = locale8.equals((java.lang.Object) (-1L));
        org.junit.Assert.assertEquals(locale3.toString(), "\ud504\ub791\uc2a4\uc5b4\uce90\ub098\ub2e4)_ENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENG_                                                                    \\u0020iTALIANiTALIANiTALIANiTALI");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "\ud504\ub791\uc2a4\uc5b4\uce90\ub098\ub2e4)_ENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENG_                                                                    \\u0020iTALIANiTALIANiTALIANiTALI");
        org.junit.Assert.assertEquals(locale8.toString(), "f_KOREAN");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ITTAIT_ITALIAN_EGAISH                                                                                " + "'", str9, "ITTAIT_ITALIAN_EGAISH                                                                                ");
        org.junit.Assert.assertEquals(locale12.toString(), "\\u0045");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "f (KOREAN)" + "'", str15, "f (KOREAN)");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test19811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19811");
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
        java.lang.String str14 = locale7.getDisplayVariant();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "it");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale7);
// flaky:         org.junit.Assert.assertEquals(locale7.toString(), "\\u005c");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\\u005c" + "'", str8, "\\u005c");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "France" + "'", str9, "France");
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\\u005c" + "'", str10, "\\u005c");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\\u0061" + "'", str11, "\\u0061");
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\\u005c" + "'", str12, "\\u005c");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test19812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19812");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "FRANZ\326SISCHFRANZOSISCH (FRANKREICH)");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test19813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19813");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("\uad6d\uc911\uc5b4\uad6d\uc911IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII", 57);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\uad6d\uc911\uc5b4\uad6d\uc911IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII" + "'", str2, "\uad6d\uc911\uc5b4\uad6d\uc911IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII");
    }

    @Test
    public void test19814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19814");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("2iTALIANiTALIANiTALIANiTAL", "CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCEnglischCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test19815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19815");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("...\r\r\r\r\r\r\r\r..", "hcstued-e#__nailati");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test19816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19816");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.util.Locale locale1 = java.util.Locale.ITALIAN;
        java.lang.String str3 = locale1.getExtension('h');
        java.lang.String str4 = locale0.getDisplayScript(locale1);
        java.util.Locale locale8 = new java.util.Locale("HI!       ", "\\U0020", "Italienisch#########################################################################################");
        java.lang.String str9 = locale0.getDisplayCountry(locale8);
        java.util.Locale.setDefault(locale0);
        java.lang.String str11 = locale0.getISO3Country();
        java.util.Locale locale13 = java.util.Locale.ENGLISH;
        java.lang.String str14 = locale13.getDisplayLanguage();
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.upperCase("!IH", locale13);
        java.lang.String str16 = locale0.getDisplayScript(locale13);
        java.lang.String[] strArray19 = org.apache.commons.lang3.StringUtils.split("nnnnnnnnnnnnnnnnnnnnnnnnhi!nnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn", "fr-CAfr-CAfr-CAfr-CAfr-CAfr-CAfr-CAfr-CAfr-CAfr-CAfr-CAfr\\u000dfr-CAfr-CAfr-CAfr-CAfr-CAfr-CAfr-CAfr-CAfr-CAfr-CAfr-CAfr");
        boolean boolean20 = locale13.equals((java.lang.Object) "nnnnnnnnnnnnnnnnnnnnnnnnhi!nnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn");
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "it");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals(locale8.toString(), "hi!       _\\U0020_Italienisch#########################################################################################");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "France" + "'", str9, "France");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "FRA" + "'", str11, "FRA");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "en");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "anglais" + "'", str14, "anglais");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "!IH" + "'", str15, "!IH");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test19817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19817");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIn44444444444444alia44444444444444itIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII", "                                                                                                                  8");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIn44444444444444alia44444444444444itIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII" + "'", str2, "IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIn44444444444444alia44444444444444itIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII");
    }

    @Test
    public void test19818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19818");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("keagaasheagaasheagaasheagaasheagaasheagaasheagaasheagaasheagaasheagaasheagaasheagaasheagaasheagaashe");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test19819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19819");
        java.util.Locale locale3 = new java.util.Locale("HI!       ", "\\U0020", "Italienisch#########################################################################################");
        java.util.Locale locale4 = locale3.stripExtensions();
        java.util.Locale locale5 = locale4.stripExtensions();
        java.lang.String str6 = locale5.getVariant();
        java.lang.String str7 = locale5.toLanguageTag();
        java.lang.String str8 = locale5.getLanguage();
        java.util.Locale.setDefault(locale5);
        org.junit.Assert.assertEquals(locale3.toString(), "hi!       _\\U0020_Italienisch#########################################################################################");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "hi!       _\\U0020_Italienisch#########################################################################################");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "hi!       _\\U0020_Italienisch#########################################################################################");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Italienisch#########################################################################################" + "'", str6, "Italienisch#########################################################################################");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "und" + "'", str7, "und");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!       " + "'", str8, "hi!       ");
    }

    @Test
    public void test19820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19820");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("!ih!ih!ih!ih!ih!ih!ih!ih!ih!ihtedesco    !ih!ih!ih!ih!ih!ih!ih!ih!ih!ih", " zhAzhzhzhzhzhzhzhzhzhzh ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test19821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19821");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("h");
        java.lang.String str2 = languageRange1.getRange();
        java.lang.String str3 = languageRange1.getRange();
        java.util.Locale locale4 = java.util.Locale.ITALY;
        java.lang.String str5 = locale4.getScript();
        java.lang.String str6 = locale4.getDisplayCountry();
        boolean boolean7 = locale4.hasExtensions();
        java.util.Locale.setDefault(locale4);
        boolean boolean9 = locale4.hasExtensions();
        java.lang.String str10 = locale4.getDisplayScript();
        java.util.Set<java.lang.Character> charSet11 = locale4.getExtensionKeys();
        boolean boolean12 = languageRange1.equals((java.lang.Object) locale4);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "h" + "'", str2, "h");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "h" + "'", str3, "h");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Italy" + "'", str6, "Italy");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(charSet11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test19822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19822");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("FRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFR");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test19823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19823");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("a700u\\", "       !IH", "itaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaita", 537);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "a700u\\" + "'", str4, "a700u\\");
    }

    @Test
    public void test19824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19824");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("#", (int) ' ', 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test19825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19825");
        java.util.Locale.Builder builder1 = new java.util.Locale.Builder();
        java.util.Locale locale2 = builder1.build();
        java.util.Locale locale4 = java.util.Locale.forLanguageTag("Italian");
        java.lang.String str5 = locale2.getDisplayLanguage(locale4);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.upperCase("", locale4);
        java.lang.String str7 = locale4.getScript();
        java.lang.String str8 = locale4.getISO3Country();
        java.util.Locale locale9 = java.util.Locale.FRANCE;
        java.util.Locale locale10 = java.util.Locale.ITALIAN;
        java.lang.String str12 = locale10.getExtension('h');
        java.lang.String str13 = locale9.getDisplayScript(locale10);
        java.lang.String str14 = locale9.getISO3Country();
        java.util.Locale locale15 = java.util.Locale.GERMAN;
        java.util.Locale.setDefault(locale15);
        java.lang.String str17 = locale9.getDisplayName(locale15);
        java.lang.String str18 = locale9.getScript();
        java.lang.String str19 = locale9.getLanguage();
        java.lang.String str20 = locale9.getScript();
        java.util.Locale locale24 = new java.util.Locale("e", "\\u0061", "\n");
        java.util.Locale locale25 = java.util.Locale.FRENCH;
        java.util.Locale locale26 = java.util.Locale.ENGLISH;
        java.lang.String str27 = locale26.getDisplayCountry();
        java.lang.String str28 = locale25.getDisplayVariant(locale26);
        java.lang.String str29 = locale25.getDisplayCountry();
        java.lang.String str30 = locale25.getScript();
        java.lang.String str31 = locale25.getScript();
        java.util.Locale locale32 = java.util.Locale.FRENCH;
        java.util.Locale locale33 = java.util.Locale.ENGLISH;
        java.lang.String str34 = locale33.getDisplayCountry();
        java.lang.String str35 = locale32.getDisplayVariant(locale33);
        java.lang.String str36 = locale32.getDisplayCountry();
        java.lang.String str37 = locale32.getScript();
        java.lang.String str38 = locale32.getScript();
        java.lang.String str39 = locale25.getDisplayCountry(locale32);
        java.util.Locale.Category category40 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale41 = java.util.Locale.getDefault(category40);
        java.util.Locale locale42 = java.util.Locale.FRANCE;
        java.util.Locale locale43 = java.util.Locale.ITALIAN;
        java.lang.String str45 = locale43.getExtension('h');
        java.lang.String str46 = locale42.getDisplayScript(locale43);
        java.lang.String str47 = locale42.getISO3Country();
        java.util.Locale locale48 = java.util.Locale.GERMAN;
        java.util.Locale.setDefault(locale48);
        java.lang.String str50 = locale42.getDisplayName(locale48);
        java.lang.String str51 = locale42.getScript();
        java.util.Locale.setDefault(category40, locale42);
        java.lang.String str53 = locale25.getDisplayCountry(locale42);
        java.lang.String str54 = locale42.getVariant();
        java.util.Locale locale56 = new java.util.Locale("francese (Canada)");
        java.lang.String str57 = locale42.getDisplayName(locale56);
        java.lang.String str58 = locale24.getDisplayLanguage(locale42);
        java.lang.String str59 = locale9.getDisplayVariant(locale24);
        java.lang.String str60 = locale4.getDisplayName(locale9);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "italian");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "it");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "FRA" + "'", str14, "FRA");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "de");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Franz\366sisch (Frankreich)" + "'", str17, "Franz\366sisch (Frankreich)");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "fr" + "'", str19, "fr");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals(locale24.toString(), "e_\\U0061_\n");
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "fr");
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "en");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "fr");
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "en");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertTrue("'" + category40 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category40.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale41);
        org.junit.Assert.assertEquals(locale41.toString(), "de");
        org.junit.Assert.assertNotNull(locale42);
        org.junit.Assert.assertEquals(locale42.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale43);
        org.junit.Assert.assertEquals(locale43.toString(), "it");
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "FRA" + "'", str47, "FRA");
        org.junit.Assert.assertNotNull(locale48);
        org.junit.Assert.assertEquals(locale48.toString(), "de");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "Franz\366sisch (Frankreich)" + "'", str50, "Franz\366sisch (Frankreich)");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertEquals(locale56.toString(), "francese (canada)");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "French (France)" + "'", str57, "French (France)");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "e" + "'", str58, "e");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "italian" + "'", str60, "italian");
    }

    @Test
    public void test19826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19826");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("aaabaeafakamanarasavayazbabebgbhbibmbnbobrbscacechcocrcscucvcydadedvdzeeeleneoeseteufafffifjfofrfygagdglgngugvhahehihohrhthuhyhziaidieigiiikinioisitiuiwjajijvkakgkikjkkklkmknkokrkskukvkwkylalblglilnlo", (int) ')');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaabaeafakamanarasavayazbabebgbhbibmbn..." + "'", str2, "aaabaeafakamanarasavayazbabebgbhbibmbn...");
    }

    @Test
    public void test19827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19827");
        java.util.Locale locale0 = java.util.Locale.ITALIAN;
        java.util.Set<java.lang.Character> charSet1 = locale0.getExtensionKeys();
        java.lang.String str2 = locale0.getVariant();
        java.lang.String str3 = locale0.getDisplayName();
        java.lang.String str4 = locale0.getDisplayName();
        java.lang.String str5 = locale0.getDisplayLanguage();
        java.lang.String str6 = locale0.toLanguageTag();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it");
        org.junit.Assert.assertNotNull(charSet1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "italien" + "'", str3, "italien");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "italien" + "'", str4, "italien");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "italien" + "'", str5, "italien");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "it" + "'", str6, "it");
    }

    @Test
    public void test19828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19828");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIn44444444444444alia44444444444444itIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII", "         ITALIAN_ITALIAN_ENGLISH         ITALIAN_!IHITTAIT_ITALIAN_EGAISHE             G                          SHE             G                          SHE             G                          SHE             G                          SHE             G                          SHE             G                          SHE             G                          SHE             G                 ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test19829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19829");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale locale2 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str3 = locale2.getDisplayName();
        java.util.Locale.Builder builder4 = builder1.setLocale(locale2);
        java.util.Locale locale5 = java.util.Locale.GERMANY;
        java.util.Locale.Builder builder6 = builder1.setLocale(locale5);
        java.util.Set<java.lang.String> strSet7 = locale5.getUnicodeLocaleAttributes();
        java.lang.String str8 = locale5.getDisplayName();
        java.util.Locale locale12 = new java.util.Locale("HI!       ", "\\U0020", "Italienisch#########################################################################################");
        java.util.Locale locale13 = locale12.stripExtensions();
        java.util.Locale locale14 = locale13.stripExtensions();
        java.util.Locale.setDefault(locale13);
        java.lang.String str16 = locale5.getDisplayName(locale13);
        java.util.Locale locale18 = java.util.Locale.forLanguageTag("aDAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDED...");
        java.lang.String str19 = locale18.getISO3Country();
        java.lang.String str20 = locale5.getDisplayName(locale18);
        boolean boolean21 = locale5.hasExtensions();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "fran\347ais (Canada)" + "'", str3, "fran\347ais (Canada)");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "de_DE");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "allemand (Allemagne)" + "'", str8, "allemand (Allemagne)");
        org.junit.Assert.assertEquals(locale12.toString(), "hi!       _\\U0020_Italienisch#########################################################################################");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "hi!       _\\U0020_Italienisch#########################################################################################");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "hi!       _\\U0020_Italienisch#########################################################################################");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "German (Germany)" + "'", str16, "German (Germany)");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "German (Germany)" + "'", str20, "German (Germany)");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test19830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19830");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("cCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC\\u00de\\u00CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC", (double) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=-1.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test19831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19831");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '\r', 89);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 89 + "'", int2 == 89);
    }

    @Test
    public void test19832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19832");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("nailati", "englisCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCEgschCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCALIAN_ENGLISH,\\u0061)");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test19833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19833");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("HI!HI!", 'C');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!HI!" + "'", str2, "HI!HI!");
    }

    @Test
    public void test19834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19834");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left(")", 13);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ")" + "'", str2, ")");
    }

    @Test
    public void test19835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19835");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "HhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhHHHHHHHHHH", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test19836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19836");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("fr-CAfr-CAfr-CAfr-CAfr-CAfr-CAfr-CAfr-CAfr-CAfr-CAfr-CAfr\\u000dfr-CAfr-CAfr-CAfr-CAfr-CAfr-CAfr-CAfr-CAfr-CAfr-CAfr-CAfr", "Fr ncG ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "fr-CAfr-CAfr-CAfr-CAfr-CAfr-CAfr-CAfr-CAfr-CAfr-CAfr-CAfr\\u000dfr-CAfr-CAfr-CAfr-CAfr-CAfr-CAfr-CAfr-CAfr-CAfr-CAfr-CAfr" + "'", str2, "fr-CAfr-CAfr-CAfr-CAfr-CAfr-CAfr-CAfr-CAfr-CAfr-CAfr-CAfr\\u000dfr-CAfr-CAfr-CAfr-CAfr-CAfr-CAfr-CAfr-CAfr-CAfr-CAfr-CAfr");
    }

    @Test
    public void test19837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19837");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("nglischIIIIIIIIIIIIIIIIIIIIIIIIIIII", "fr-cafr-cafr-cafr-cafr-cafr-cafr-cafr-cafr-cafr-cafr-cafr\\u000dfr-cafr-cafr-cafr-cafr-cafr-cafr-cafr-cafr-cafr-cafr-cafr");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nglischIIIIIIIIIIIIIIIIIIIIIIIIIIII" + "'", str2, "nglischIIIIIIIIIIIIIIIIIIIIIIIIIIII");
    }

    @Test
    public void test19838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19838");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "ixii");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test19839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19839");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("japonais", "englishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglish");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test19840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19840");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale1 = java.util.Locale.getDefault(category0);
        java.util.Locale locale2 = java.util.Locale.FRANCE;
        java.util.Locale locale3 = java.util.Locale.ITALIAN;
        java.lang.String str5 = locale3.getExtension('h');
        java.lang.String str6 = locale2.getDisplayScript(locale3);
        java.util.Locale locale7 = locale2.stripExtensions();
        java.util.Locale.setDefault(category0, locale2);
        java.util.Locale locale9 = java.util.Locale.GERMANY;
        java.util.Locale locale10 = locale9.stripExtensions();
        java.util.Locale.setDefault(category0, locale9);
        java.util.Locale locale12 = java.util.Locale.getDefault(category0);
        java.util.Locale locale13 = java.util.Locale.getDefault(category0);
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
        java.lang.String str29 = locale21.getDisplayCountry();
        java.util.Locale locale31 = new java.util.Locale("\\u005c");
        java.util.Locale locale33 = java.util.Locale.CHINESE;
        java.lang.String str34 = org.apache.commons.lang3.StringUtils.lowerCase("Franz\366sisch (Frankreich)", locale33);
        java.lang.String str35 = locale33.getVariant();
        java.lang.String str36 = locale31.getDisplayScript(locale33);
        java.lang.String str38 = locale31.getExtension('C');
        java.lang.String str39 = locale31.getDisplayScript();
        java.lang.String str40 = locale31.getScript();
        java.lang.String str41 = locale31.getLanguage();
        java.lang.String str42 = locale21.getDisplayName(locale31);
        java.util.Locale.setDefault(category0, locale21);
        java.util.Locale locale44 = java.util.Locale.FRANCE;
        java.util.Locale locale45 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str46 = locale44.getDisplayScript(locale45);
        java.lang.String str47 = locale45.getVariant();
        java.util.Locale locale49 = new java.util.Locale("");
        java.util.Locale.setDefault(locale49);
        java.lang.String str51 = locale45.getDisplayName(locale49);
        java.util.Locale.setDefault(category0, locale49);
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "hi!       _\\U0020_Italienisch#########################################################################################");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "it");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "de_DE");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "de_DE");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "de_DE");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "de_DE");
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
        org.junit.Assert.assertEquals(locale31.toString(), "\\u005c");
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "franz\366sisch (frankreich)" + "'", str34, "franz\366sisch (frankreich)");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "\\u005c" + "'", str41, "\\u005c");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "French" + "'", str42, "French");
        org.junit.Assert.assertNotNull(locale44);
        org.junit.Assert.assertEquals(locale44.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale45);
        org.junit.Assert.assertEquals(locale45.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertEquals(locale49.toString(), "");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "French (Canada)" + "'", str51, "French (Canada)");
    }

    @Test
    public void test19841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19841");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I", 119, (int) 'g');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test19842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19842");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("cCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC\\u00de\\u00CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC", (int) 'g');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "cCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC\\u00de\\u00CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC" + "'", str2, "cCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC\\u00de\\u00CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC");
    }

    @Test
    public void test19843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19843");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("                                               \\u0069hhhhhhhhhh", 16);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test19844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19844");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "HHHHHHHHH         ITALIAN_italian_eNGLISH         ITALIAN_!IHitTAiT_ITALIAN_EgAish", (java.lang.CharSequence) "hsilgne,nailati( nailati");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test19845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19845");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("nglish (United Kingdom)french (NC_HZ)", 122);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test19846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19846");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "hh9600u\\hhhhhhhhhh9600u\\hhhhhhhhhh9600u\\hhhhhhhhhh9600u\\)anic( esenic");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test19847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19847");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("RF_rf", 6);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test19848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19848");
        java.util.Locale locale2 = new java.util.Locale("\\u0020iTALIANiTALIANiTALIANiTALI", "French (Canada)");
        java.util.Set<java.lang.String> strSet3 = locale2.getUnicodeLocaleAttributes();
        java.util.Locale locale4 = java.util.Locale.ENGLISH;
        java.lang.String str5 = locale4.getDisplayVariant();
        java.lang.String str6 = locale4.getScript();
        java.lang.String str7 = locale2.getDisplayCountry(locale4);
        java.util.Locale locale8 = java.util.Locale.UK;
        java.util.Locale.Category category9 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale10 = java.util.Locale.getDefault(category9);
        java.util.Locale locale11 = java.util.Locale.GERMAN;
        java.util.Locale locale12 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str13 = locale11.getDisplayName(locale12);
        java.util.Locale.setDefault(category9, locale12);
        java.util.Set<java.lang.String> strSet15 = locale12.getUnicodeLocaleKeys();
        java.lang.String str16 = locale8.getDisplayVariant(locale12);
        java.lang.String str17 = locale12.getDisplayLanguage();
        java.lang.String str18 = locale12.getDisplayVariant();
        java.lang.String str19 = locale2.getDisplayScript(locale12);
        java.util.Locale.Category category20 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale21 = java.util.Locale.getDefault(category20);
        java.util.Locale locale22 = java.util.Locale.GERMAN;
        java.util.Locale locale23 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str24 = locale22.getDisplayName(locale23);
        java.util.Locale.setDefault(category20, locale23);
        java.util.Locale locale28 = new java.util.Locale("\\u0020iTALIANiTALIANiTALIANiTALI\\u0020iTALIANiTALIANiTALIANiTAL", "allemand");
        java.util.Locale.setDefault(category20, locale28);
        java.util.Locale locale30 = java.util.Locale.getDefault(category20);
        java.util.Locale locale31 = java.util.Locale.getDefault(category20);
        java.util.Locale locale32 = java.util.Locale.ITALIAN;
        java.lang.String str33 = locale32.getDisplayLanguage();
        java.util.Locale locale34 = locale32.stripExtensions();
        java.util.Locale locale36 = java.util.Locale.forLanguageTag("\\u0020");
        java.lang.String str37 = locale36.getDisplayScript();
        java.lang.String str38 = locale34.getDisplayCountry(locale36);
        java.util.Locale.Builder builder39 = new java.util.Locale.Builder();
        java.util.Locale locale40 = builder39.build();
        java.util.Locale locale42 = java.util.Locale.forLanguageTag("Italian");
        java.lang.String str43 = locale40.getDisplayLanguage(locale42);
        java.lang.String str44 = locale34.getDisplayLanguage(locale40);
        java.lang.String str46 = locale40.getExtension('u');
        java.util.Set<java.lang.String> strSet47 = locale40.getUnicodeLocaleAttributes();
        java.lang.String str48 = locale40.getVariant();
        java.lang.String str49 = locale40.getDisplayLanguage();
        java.util.Locale locale51 = java.util.Locale.CHINESE;
        java.lang.String str52 = org.apache.commons.lang3.StringUtils.lowerCase("Franz\366sisch (Frankreich)", locale51);
        java.lang.String str53 = locale51.getVariant();
        java.util.Locale locale54 = java.util.Locale.FRANCE;
        java.util.Locale locale55 = java.util.Locale.ITALIAN;
        java.lang.String str57 = locale55.getExtension('h');
        java.lang.String str58 = locale54.getDisplayScript(locale55);
        java.util.Locale locale59 = locale54.stripExtensions();
        java.lang.String str60 = locale59.getISO3Country();
        boolean boolean61 = locale59.hasExtensions();
        java.lang.String str62 = locale59.getISO3Language();
        java.util.Locale locale63 = java.util.Locale.FRANCE;
        java.util.Locale locale64 = java.util.Locale.ITALIAN;
        java.lang.String str66 = locale64.getExtension('h');
        java.lang.String str67 = locale63.getDisplayScript(locale64);
        java.util.Locale locale68 = locale63.stripExtensions();
        java.lang.String str69 = locale68.getISO3Country();
        boolean boolean70 = locale68.hasExtensions();
        java.lang.String str71 = locale68.getLanguage();
        java.lang.String str72 = locale59.getDisplayLanguage(locale68);
        java.lang.String str73 = locale51.getDisplayCountry(locale59);
        java.lang.String str74 = locale51.getDisplayScript();
        java.lang.String str75 = locale40.getDisplayVariant(locale51);
        java.util.Locale.setDefault(category20, locale40);
        java.lang.String str77 = locale2.getDisplayVariant(locale40);
        org.junit.Assert.assertEquals(locale2.toString(), "\\u0020italianitalianitalianitali_FRENCH (CANADA)");
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "FRENCH (CANADA)" + "'", str7, "FRENCH (CANADA)");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "en_GB");
        org.junit.Assert.assertTrue("'" + category9 + "' != '" + java.util.Locale.Category.FORMAT + "'", category9.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "de");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "allemand" + "'", str13, "allemand");
        org.junit.Assert.assertNotNull(strSet15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "French" + "'", str17, "French");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + category20 + "' != '" + java.util.Locale.Category.FORMAT + "'", category20.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "fr_CA");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "de");
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "allemand" + "'", str24, "allemand");
        org.junit.Assert.assertEquals(locale28.toString(), "\\u0020italianitalianitalianitali\\u0020italianitalianitalianital_ALLEMAND");
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "\\u0020italianitalianitalianitali\\u0020italianitalianitalianital_ALLEMAND");
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "\\u0020italianitalianitalianitali\\u0020italianitalianitalianital_ALLEMAND");
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "it");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Italian" + "'", str33, "Italian");
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "it");
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertNotNull(locale40);
        org.junit.Assert.assertEquals(locale40.toString(), "");
        org.junit.Assert.assertNotNull(locale42);
        org.junit.Assert.assertEquals(locale42.toString(), "italian");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "Italian" + "'", str44, "Italian");
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertNotNull(strSet47);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertNotNull(locale51);
        org.junit.Assert.assertEquals(locale51.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "franz\366sisch (frankreich)" + "'", str52, "franz\366sisch (frankreich)");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertNotNull(locale54);
        org.junit.Assert.assertEquals(locale54.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale55);
        org.junit.Assert.assertEquals(locale55.toString(), "it");
        org.junit.Assert.assertNull(str57);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertNotNull(locale59);
        org.junit.Assert.assertEquals(locale59.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "FRA" + "'", str60, "FRA");
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "fra" + "'", str62, "fra");
        org.junit.Assert.assertNotNull(locale63);
        org.junit.Assert.assertEquals(locale63.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale64);
        org.junit.Assert.assertEquals(locale64.toString(), "it");
        org.junit.Assert.assertNull(str66);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "" + "'", str67, "");
        org.junit.Assert.assertNotNull(locale68);
        org.junit.Assert.assertEquals(locale68.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "FRA" + "'", str69, "FRA");
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "fr" + "'", str71, "fr");
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "fran\347ais" + "'", str72, "fran\347ais");
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "" + "'", str73, "");
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "" + "'", str74, "");
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "" + "'", str75, "");
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "" + "'", str77, "");
    }

    @Test
    public void test19849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19849");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("\\u006c");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test19850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19850");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.util.Locale locale1 = java.util.Locale.ITALIAN;
        java.lang.String str3 = locale1.getExtension('h');
        java.lang.String str4 = locale0.getDisplayScript(locale1);
        java.lang.String str5 = locale0.getISO3Country();
        java.util.Locale locale6 = java.util.Locale.GERMAN;
        java.util.Locale.setDefault(locale6);
        java.lang.String str8 = locale0.getDisplayName(locale6);
        java.lang.String str9 = locale0.getScript();
        java.lang.String str10 = locale0.getLanguage();
        java.lang.String str11 = locale0.getISO3Language();
        java.util.Set<java.lang.String> strSet12 = locale0.getUnicodeLocaleAttributes();
        java.util.Locale locale14 = new java.util.Locale("");
        java.lang.String str15 = locale14.getDisplayName();
        java.lang.String str16 = locale0.getDisplayName(locale14);
        java.lang.Object obj17 = locale0.clone();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "it");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "FRA" + "'", str5, "FRA");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "de");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Franz\366sisch (Frankreich)" + "'", str8, "Franz\366sisch (Frankreich)");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "fr" + "'", str10, "fr");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "fra" + "'", str11, "fra");
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertEquals(locale14.toString(), "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "French (France)" + "'", str16, "French (France)");
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertEquals(obj17.toString(), "fr_FR");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj17), "fr_FR");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj17), "fr_FR");
    }

    @Test
    public void test19851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19851");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.setLanguageTag("Italian");
        java.util.Locale locale4 = java.util.Locale.PRC;
        java.lang.String str5 = locale4.getDisplayName();
        java.util.Locale.Builder builder6 = builder0.setLocale(locale4);
        java.util.Locale locale8 = java.util.Locale.forLanguageTag("\\u0020");
        java.lang.String str9 = locale8.getDisplayScript();
        java.util.Locale.setDefault(locale8);
        java.util.Locale.Builder builder11 = builder0.setLocale(locale8);
        java.util.Locale.Builder builder12 = builder11.clear();
        java.util.Locale.Builder builder13 = builder12.clearExtensions();
        java.util.Locale.Builder builder15 = builder12.removeUnicodeLocaleAttribute("C500u");
        java.util.Locale.Builder builder16 = builder15.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder18 = builder15.setRegion(" \\U0066  ");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region:  \\U0066   [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Chinesisch (China)" + "'", str5, "Chinesisch (China)");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder16);
    }

    @Test
    public void test19852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19852");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("4444444444444444444444444444444444444             DE_DE            44444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4444444444444444444444444444444444444             DE_DE            44444444444444444444444444444444444444" + "'", str1, "4444444444444444444444444444444444444             DE_DE            44444444444444444444444444444444444444");
    }

    @Test
    public void test19853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19853");
        char[] charArray7 = new char[] { ' ', '4' };
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "HI!", charArray7);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsAny("NC_hz\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r", charArray7);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "en_CA", charArray7);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiitalian_ITALIAN_EnglisEiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii", charArray7);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "Eg", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[ , 4]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test19854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19854");
        java.util.Locale.Builder builder1 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder1.clearExtensions();
        java.util.Locale.Builder builder4 = builder1.setLanguageTag("Italian");
        java.util.Locale locale5 = builder4.build();
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.lowerCase("CANADA", locale5);
        java.lang.String str8 = locale5.getExtension('h');
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "italian");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "canada" + "'", str6, "canada");
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test19855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19855");
        java.util.Locale locale3 = new java.util.Locale("       iiiiiiiiiiifrankreichnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn        ", "Chinese (China", "5\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065");
        org.junit.Assert.assertEquals(locale3.toString(), "       iiiiiiiiiiifrankreichnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn        _CHINESE (CHINA_5\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065");
    }

    @Test
    public void test19856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19856");
        java.util.Locale locale0 = java.util.Locale.FRENCH;
        java.util.Locale locale1 = java.util.Locale.ENGLISH;
        java.lang.String str2 = locale1.getDisplayCountry();
        java.lang.String str3 = locale0.getDisplayVariant(locale1);
        java.lang.String str4 = locale1.toLanguageTag();
        java.util.Locale locale5 = null;
        java.lang.String str6 = locale1.getDisplayVariant(locale5);
        java.lang.String str7 = locale1.getScript();
        java.lang.String str8 = locale1.getDisplayVariant();
        java.util.Locale locale9 = locale1.stripExtensions();
        java.lang.Object obj10 = locale9.clone();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "en" + "'", str4, "en");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en");
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertEquals(obj10.toString(), "en");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj10), "en");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj10), "en");
    }

    @Test
    public void test19857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19857");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("Frnz\366sisch (Knd)", (int) 'Y', (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum abbreviation width is 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test19858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19858");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("CHINESExxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx", "R0");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CHINESExxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx" + "'", str2, "CHINESExxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
    }

    @Test
    public void test19859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19859");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCEgschCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test19860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19860");
        java.util.Locale locale0 = java.util.Locale.ITALIAN;
        java.lang.String str1 = locale0.getDisplayLanguage();
        java.util.Locale locale2 = locale0.stripExtensions();
        java.lang.String str3 = locale0.getDisplayVariant();
        java.util.Set<java.lang.String> strSet4 = locale0.getUnicodeLocaleKeys();
        java.util.Set<java.lang.Character> charSet5 = locale0.getExtensionKeys();
        java.lang.String str6 = locale0.getLanguage();
        java.lang.Object obj7 = locale0.clone();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Italian" + "'", str1, "Italian");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "it");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNotNull(charSet5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "it" + "'", str6, "it");
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertEquals(obj7.toString(), "it");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj7), "it");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj7), "it");
    }

    @Test
    public void test19861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19861");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("###################################i#######...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "###################################i#######..." + "'", str1, "###################################i#######...");
    }

    @Test
    public void test19862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19862");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("8600u\\                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      ti");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "8600u\\                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      ti" + "'", str1, "8600u\\                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      ti");
    }

    @Test
    public void test19863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19863");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("Deutsch", "rnz\366sisch(Knd                                                                                                                                                                                                               ", (int) 'l');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test19864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19864");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("ccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccc", "\\u002 (ROYAUME-UNI)");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccc" + "'", str2, "ccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccc");
    }

    @Test
    public void test19865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19865");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("\\u0029E             g");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\U0029e             G" + "'", str1, "\\U0029e             G");
    }

    @Test
    public void test19866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19866");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.util.Locale locale1 = java.util.Locale.ITALIAN;
        java.lang.String str3 = locale1.getExtension('h');
        java.lang.String str4 = locale0.getDisplayScript(locale1);
        java.lang.String str5 = locale0.getISO3Country();
        java.util.Locale locale6 = java.util.Locale.GERMAN;
        java.util.Locale.setDefault(locale6);
        java.lang.String str8 = locale0.getDisplayName(locale6);
        java.lang.String str9 = locale0.getScript();
        java.lang.String str10 = locale0.getLanguage();
        java.lang.String str11 = locale0.getISO3Language();
        java.util.Set<java.lang.String> strSet12 = locale0.getUnicodeLocaleAttributes();
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.lang.String>) strSet12, "\\u0023");
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.lang.String>) strSet12, 'i');
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "it");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "FRA" + "'", str5, "FRA");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "de");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Franz\366sisch (Frankreich)" + "'", str8, "Franz\366sisch (Frankreich)");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "fr" + "'", str10, "fr");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "fra" + "'", str11, "fra");
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test19867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19867");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("KKKKKKKKKKKKKKKKKKKK)DNK(HCSIS\326ZNRFKKKKKKKKKKKKKKKKKKKK");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "kkkkkkkkkkkkkkkkkkkk)dnk(hcsis\366znrfkkkkkkkkkkkkkkkkkkkk" + "'", str1, "kkkkkkkkkkkkkkkkkkkk)dnk(hcsis\366znrfkkkkkkkkkkkkkkkkkkkk");
    }

    @Test
    public void test19868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19868");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "2aiTALIANiTALIANiTALIANiTAL");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test19869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19869");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "Italien", "                                                                                                                                                                                           Z...\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r...                                                                                                                                                                    ITALIAN_ITALIAN_ENGLISF");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test19870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19870");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("44444444444444444444444444444444IHaaaaaaaaaaaaaaaaaaaaaaaaFranz\366sisch (Frankreich)aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "\\U0023", 118);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test19871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19871");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("ttttttttttttttttttttt                                                                                                              ITALIEITALtttttttttttttttttttttt");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
    }

    @Test
    public void test19872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19872");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("hsiAgE_NAILATI_TiATtiHI!_NAILATI         HSILGNe_nailati_NAILATI         HHHHHHHHH", 'g');
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hsiAE_NAILATI_TiATtiHI!_NAILATI         HSILGNe_nailati_NAILATI         HHHHHHHHH" + "'", str3, "hsiAE_NAILATI_TiATtiHI!_NAILATI         HSILGNe_nailati_NAILATI         HHHHHHHHH");
    }

    @Test
    public void test19873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19873");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("\u52a0\u62ff\u5927eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee", '\r');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test19874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19874");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("           \\U", (int) '7', 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test19875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19875");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("\u82f1\u6587");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\u82f1\u6587" + "'", str1, "\u82f1\u6587");
    }

    @Test
    public void test19876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19876");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC\\u00de\\u00CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC", "                                                     \\u005c         ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC\\u00de\\u00CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC" + "'", str2, "hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC\\u00de\\u00CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC");
    }

    @Test
    public void test19877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19877");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("EEEEEEEEEFRAEEEEEEEEECCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCEnglischCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC", "           5555555555           ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "EEEEEEEEEFRAEEEEEEEEECCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCEnglischCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC" + "'", str2, "EEEEEEEEEFRAEEEEEEEEECCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCEnglischCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC");
    }

    @Test
    public void test19878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19878");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("francefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrance", 10, (int) 'g');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "cefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancef" + "'", str3, "cefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancef");
    }

    @Test
    public void test19879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19879");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDED...", "nglischIIIIIIIIIIIIIIIIIIIIIIIIIIII", "BFIBGIBHIBIIBJIBLIBMIBNIBOIBQIBRIBSIBTIBVIBWIBYIBZICAICCICDICFICGICHICIICKICLICMICNICOICRICUICVICWICXICYICZIDEIDJIDKIDMIDOIDZIECIEEIEGIEHIERIESIETIFIIFJIFKIFMIFOIFRIGAIGBIGDIGEIGFIGGIGHIGIIGLIGMIGNIGPIGQIGRIGSIGTIGUIGWIGYIHKIH");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test19880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19880");
        java.util.Locale locale2 = new java.util.Locale("                                                                                                         ", "en-GB");
        java.util.Locale locale3 = locale2.stripExtensions();
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("hi!", "", (int) (short) 10);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray9, '4');
        boolean boolean12 = org.apache.commons.lang3.StringUtils.startsWithAny("\\u0020", strArray9);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAny("fr-FR", strArray9);
        boolean boolean14 = locale3.equals((java.lang.Object) "fr-FR");
        org.junit.Assert.assertEquals(locale2.toString(), "                                                                                                         _EN-GB");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "                                                                                                         _EN-GB");
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test19881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19881");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("GGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGFRA", "TALIAN_italian_eNGLISHITAL", 105);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test19882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19882");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "44444444444444italian44444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test19883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19883");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("F", strMap1);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap4 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList5 = java.util.Locale.LanguageRange.parse("nailati", strMap4);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap6 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList7 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList5, strMap6);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap8 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList9 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList7, strMap8);
        java.lang.String[] strArray22 = new java.lang.String[] { "\\u0020iItalian\\u008600u\\", "\\u0020iItalian\\u0020i", "anglais", "FRZ\326CZ(FRKREC)", "italian    ", "                                                                                                      ", "!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I", "zhzhzhzhzhzhzhzhzhzhFRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhAzhzhzhzhzhzhzhzhzhzh", "FRZ\326CZ(FRKREC)", "cinese (Cina)\\u0069hhhhhhhhhh\\u0069hhhhhhhhhh\\u0069hhhhhhhhhh\\u0069hh", "         ITALIAN_ITALIAN_ENGLISH         ITALIAN_!IHITTAIT_ITALIAN_EGAISH", "                                      ..." };
        java.util.ArrayList<java.lang.String> strList23 = new java.util.ArrayList<java.lang.String>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList23, strArray22);
        java.lang.String str25 = java.util.Locale.lookupTag(languageRangeList7, (java.util.Collection<java.lang.String>) strList23);
        java.util.List<java.lang.String> strList26 = java.util.Locale.filterTags(languageRangeList2, (java.util.Collection<java.lang.String>) strList23);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap27 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList28 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList2, strMap27);
        java.util.Locale.LanguageRange[] languageRangeArray29 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList30 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList30, languageRangeArray29);
        java.util.Locale.LanguageRange[] languageRangeArray32 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList33 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList33, languageRangeArray32);
        java.lang.String[] strArray37 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList38 = new java.util.ArrayList<java.lang.String>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList38, strArray37);
        java.util.Locale.FilteringMode filteringMode40 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList41 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList33, (java.util.Collection<java.lang.String>) strList38, filteringMode40);
        java.util.Locale.FilteringMode filteringMode42 = java.util.Locale.FilteringMode.AUTOSELECT_FILTERING;
        java.util.List<java.lang.String> strList43 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList30, (java.util.Collection<java.lang.String>) strList38, filteringMode42);
        java.util.Locale.LanguageRange[] languageRangeArray44 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList45 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList45, languageRangeArray44);
        java.lang.String[] strArray49 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList50 = new java.util.ArrayList<java.lang.String>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList50, strArray49);
        java.util.Locale.FilteringMode filteringMode52 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList53 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList45, (java.util.Collection<java.lang.String>) strList50, filteringMode52);
        java.lang.String[] strArray73 = new java.lang.String[] { "hi!       ", "Italienisch", "italian_ITALIAN_English", "HI!", "hi!", "ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDED...", "\\u0034", "HI!", "Italian", "\\u0061", "\\u0023", "hi!", "iTALIAN", "Chinese (China)", "hi!", "zh_CN", "iTALIAN", "en", "Italienisch" };
        java.util.ArrayList<java.lang.String> strList74 = new java.util.ArrayList<java.lang.String>();
        boolean boolean75 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList74, strArray73);
        java.util.Locale.LanguageRange[] languageRangeArray76 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList77 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean78 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList77, languageRangeArray76);
        java.lang.String[] strArray81 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList82 = new java.util.ArrayList<java.lang.String>();
        boolean boolean83 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList82, strArray81);
        java.util.Locale.FilteringMode filteringMode84 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList85 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList77, (java.util.Collection<java.lang.String>) strList82, filteringMode84);
        java.util.List<java.lang.String> strList86 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList45, (java.util.Collection<java.lang.String>) strList74, filteringMode84);
        java.util.List<java.lang.String> strList87 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList30, (java.util.Collection<java.lang.String>) strList74);
        java.lang.String str89 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.lang.String>) strList87, "0");
        java.lang.String str91 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.lang.String>) strList87, "Eagaash");
        java.util.List<java.lang.String> strList92 = java.util.Locale.filterTags(languageRangeList2, (java.util.Collection<java.lang.String>) strList87);
        java.lang.String str94 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.lang.String>) strList87, 'F');
        java.lang.String str96 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.lang.String>) strList87, "TALIAN_italian_eNGLISHITAL");
        java.lang.String str98 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.lang.String>) strList87, '.');
        org.junit.Assert.assertNotNull(languageRangeList2);
        org.junit.Assert.assertNotNull(languageRangeList5);
        org.junit.Assert.assertNotNull(languageRangeList7);
        org.junit.Assert.assertNotNull(languageRangeList9);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(strList26);
        org.junit.Assert.assertNotNull(languageRangeList28);
        org.junit.Assert.assertNotNull(languageRangeArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(languageRangeArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + filteringMode40 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode40.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList41);
        org.junit.Assert.assertTrue("'" + filteringMode42 + "' != '" + java.util.Locale.FilteringMode.AUTOSELECT_FILTERING + "'", filteringMode42.equals(java.util.Locale.FilteringMode.AUTOSELECT_FILTERING));
        org.junit.Assert.assertNotNull(strList43);
        org.junit.Assert.assertNotNull(languageRangeArray44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + filteringMode52 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode52.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList53);
        org.junit.Assert.assertNotNull(strArray73);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertNotNull(languageRangeArray76);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNotNull(strArray81);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertTrue("'" + filteringMode84 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode84.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList85);
        org.junit.Assert.assertNotNull(strList86);
        org.junit.Assert.assertNotNull(strList87);
        org.junit.Assert.assertEquals("'" + str89 + "' != '" + "" + "'", str89, "");
        org.junit.Assert.assertEquals("'" + str91 + "' != '" + "" + "'", str91, "");
        org.junit.Assert.assertNotNull(strList92);
        org.junit.Assert.assertEquals("'" + str94 + "' != '" + "" + "'", str94, "");
        org.junit.Assert.assertEquals("'" + str96 + "' != '" + "" + "'", str96, "");
        org.junit.Assert.assertEquals("'" + str98 + "' != '" + "" + "'", str98, "");
    }

    @Test
    public void test19884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19884");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "ih       !ih       !ih       !ih       !ih       !ih   ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ih       !ih       !ih       !ih       !ih       !ih   " + "'", str1, "ih       !ih       !ih       !ih       !ih       !ih   ");
    }

    @Test
    public void test19885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19885");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("\\U0066", "\u30c9\u30a4\u30c4\u8a9e", (int) 'N');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\U0066" + "'", str3, "\\U0066");
    }

    @Test
    public void test19886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19886");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("KOREAN", "...It...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test19887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19887");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "H!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test19888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19888");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC" + "'", str1, "CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC");
    }

    @Test
    public void test19889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19889");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\ub3c5\uc77c\uc5b4\r\r\r\r\rfra");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\u1103\u1169\u11a8\u110b\u1175\u11af\u110b\u1165\r\r\r\r\rfra" + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\u1103\u1169\u11a8\u110b\u1175\u11af\u110b\u1165\r\r\r\r\rfra");
    }

    @Test
    public void test19890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19890");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         italian_ITALIAN_EnglisF", (java.lang.CharSequence) "\\U0020ITALIANITALIANITALIANITALI");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 713 + "'", int2 == 713);
    }

    @Test
    public void test19891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19891");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale locale2 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str3 = locale2.getDisplayName();
        java.util.Locale.Builder builder4 = builder1.setLocale(locale2);
        java.util.Locale locale5 = java.util.Locale.GERMANY;
        java.util.Locale.Builder builder6 = builder1.setLocale(locale5);
        java.util.Locale.Builder builder7 = builder6.clear();
        java.util.Locale.Builder builder8 = builder7.clearExtensions();
        java.util.Locale.Builder builder9 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder10 = builder9.clearExtensions();
        java.util.Locale locale11 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str12 = locale11.getDisplayName();
        java.util.Locale.Builder builder13 = builder10.setLocale(locale11);
        java.util.Locale.Builder builder14 = builder13.clear();
        java.util.Locale.Builder builder16 = builder14.setLanguage("ITALIAN");
        java.util.Locale locale17 = builder14.build();
        java.util.Locale.Builder builder18 = builder14.clearExtensions();
        java.util.Locale locale19 = java.util.Locale.ROOT;
        java.lang.String str20 = locale19.getISO3Country();
        java.util.Set<java.lang.String> strSet21 = locale19.getUnicodeLocaleKeys();
        java.util.Locale.Builder builder22 = builder18.setLocale(locale19);
        java.util.Locale.Builder builder23 = builder7.setLocale(locale19);
        java.util.Locale locale24 = builder23.build();
        java.util.Locale.Builder builder25 = builder23.clearExtensions();
        java.util.Locale locale26 = builder25.build();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Franz\366sisch (Kanada)" + "'", str3, "Franz\366sisch (Kanada)");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "de_DE");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Franz\366sisch (Kanada)" + "'", str12, "Franz\366sisch (Kanada)");
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "italian");
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(strSet21);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "");
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "");
    }

    @Test
    public void test19892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19892");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("TALIAN_ITALIAN_ENGLISH         ITAL", "Hfffffffffcanad", "hzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzh");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "TALIAN_ITALIAN_ENGLISh         ITAL" + "'", str3, "TALIAN_ITALIAN_ENGLISh         ITAL");
    }

    @Test
    public void test19893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19893");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIITALIAN_ITALIAN_ENGLISHIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII", "hi!(\\U0020,Italienisch#########################################################################################)");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test19894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19894");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "cccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccc", (java.lang.CharSequence) "                                                                               ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test19895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19895");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("hi!");
        java.lang.String str2 = locale1.getCountry();
        java.lang.String str3 = locale1.getDisplayVariant();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = locale1.getExtension('#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed extension key: #");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test19896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19896");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("\uc5b4\uc77c\ub3c5", 'f');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test19897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19897");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("\\u005", "zho");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test19898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19898");
        java.util.Locale locale1 = new java.util.Locale("iTALIE                         ");
        java.lang.Object obj2 = locale1.clone();
        org.junit.Assert.assertEquals(locale1.toString(), "italie                         ");
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals(obj2.toString(), "italie                         ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj2), "italie                         ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj2), "italie                         ");
    }

    @Test
    public void test19899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19899");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("Fr ncG", "fran\347ais (France)");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Fr ncG" + "'", str2, "Fr ncG");
    }

    @Test
    public void test19900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19900");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale locale2 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str3 = locale2.getDisplayName();
        java.util.Locale.Builder builder4 = builder1.setLocale(locale2);
        java.util.Locale.Builder builder5 = builder4.clear();
        java.util.Locale.Builder builder7 = builder5.setLanguage("ITALIAN");
        java.util.Locale.Builder builder8 = builder5.clearExtensions();
        java.util.Locale locale9 = builder8.build();
        java.util.Locale locale12 = new java.util.Locale("it");
        java.util.Locale.Builder builder13 = new java.util.Locale.Builder();
        java.util.Locale locale14 = builder13.build();
        java.util.Locale locale15 = java.util.Locale.FRENCH;
        java.util.Locale locale16 = java.util.Locale.ENGLISH;
        java.lang.String str17 = locale16.getDisplayCountry();
        java.lang.String str18 = locale15.getDisplayVariant(locale16);
        java.lang.String str19 = locale15.getDisplayCountry();
        java.lang.String str20 = locale15.getScript();
        java.lang.String str21 = locale15.getScript();
        java.util.Locale locale22 = java.util.Locale.FRENCH;
        java.util.Locale locale23 = java.util.Locale.ENGLISH;
        java.lang.String str24 = locale23.getDisplayCountry();
        java.lang.String str25 = locale22.getDisplayVariant(locale23);
        java.lang.String str26 = locale22.getDisplayCountry();
        java.lang.String str27 = locale22.getScript();
        java.lang.String str28 = locale22.getScript();
        java.lang.String str29 = locale15.getDisplayCountry(locale22);
        java.lang.String str30 = locale14.getDisplayVariant(locale22);
        java.util.Locale locale32 = java.util.Locale.ENGLISH;
        java.lang.String str33 = locale32.getDisplayLanguage();
        java.lang.String str34 = org.apache.commons.lang3.StringUtils.upperCase("!IH", locale32);
        java.lang.String str35 = locale32.getCountry();
        java.lang.String str36 = locale32.getCountry();
        java.lang.String str37 = locale22.getDisplayCountry(locale32);
        java.util.Locale locale41 = new java.util.Locale("HI!       ", "\\U0020", "Italienisch#########################################################################################");
        java.util.Locale locale42 = locale41.stripExtensions();
        java.lang.String str43 = locale32.getDisplayCountry(locale42);
        java.lang.String str44 = locale12.getDisplayScript(locale42);
        java.lang.String str45 = org.apache.commons.lang3.StringUtils.upperCase("2cinese (Cina...", locale12);
        java.lang.String str46 = locale9.getDisplayScript(locale12);
        java.util.Locale locale48 = java.util.Locale.forLanguageTag("it_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_I");
        java.lang.String str49 = locale12.getDisplayScript(locale48);
        java.lang.String str50 = locale12.getISO3Language();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Franz\366sisch (Kanada)" + "'", str3, "Franz\366sisch (Kanada)");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "italian");
        org.junit.Assert.assertEquals(locale12.toString(), "it");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "fr");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "en");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "fr");
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "en");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "en");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Englisch" + "'", str33, "Englisch");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "!IH" + "'", str34, "!IH");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals(locale41.toString(), "hi!       _\\U0020_Italienisch#########################################################################################");
        org.junit.Assert.assertNotNull(locale42);
        org.junit.Assert.assertEquals(locale42.toString(), "hi!       _\\U0020_Italienisch#########################################################################################");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "2CINESE (CINA..." + "'", str45, "2CINESE (CINA...");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertNotNull(locale48);
        org.junit.Assert.assertEquals(locale48.toString(), "");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "ita" + "'", str50, "ita");
    }

    @Test
    public void test19901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19901");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("italian_italian_english         italian_!ihittait_italian_egaishe             g                          she             g                          she             g                          she             g                          she             g                          she             g                          she             g                          she             g", "", "                                               nailati                                                ko");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "italian_italian_english         italian_!ihittait_italian_egaishe             g                          she             g                          she             g                          she             g                          she             g                          she             g                          she             g                          she             g" + "'", str3, "italian_italian_english         italian_!ihittait_italian_egaishe             g                          she             g                          she             g                          she             g                          she             g                          she             g                          she             g                          she             g");
    }

    @Test
    public void test19902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19902");
        java.util.Locale.Category category1 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale2 = java.util.Locale.getDefault(category1);
        java.util.Locale locale3 = java.util.Locale.GERMAN;
        java.util.Locale locale4 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str5 = locale3.getDisplayName(locale4);
        java.util.Locale.setDefault(category1, locale4);
        java.util.Locale locale9 = new java.util.Locale("\\u0020iTALIANiTALIANiTALIANiTALI\\u0020iTALIANiTALIANiTALIANiTAL", "allemand");
        java.util.Locale.setDefault(category1, locale9);
        java.util.Locale locale11 = java.util.Locale.ITALY;
        java.lang.String str12 = locale11.getScript();
        java.lang.String str13 = locale11.getDisplayVariant();
        java.util.Locale.setDefault(category1, locale11);
        java.util.Locale locale15 = java.util.Locale.ITALIAN;
        java.util.Set<java.lang.Character> charSet16 = locale15.getExtensionKeys();
        java.lang.String str17 = locale15.getVariant();
        java.lang.String str18 = locale15.getDisplayName();
        java.lang.String str19 = locale15.getCountry();
        java.util.Set<java.lang.String> strSet20 = locale15.getUnicodeLocaleKeys();
        java.util.Locale.setDefault(category1, locale15);
        java.lang.String str22 = org.apache.commons.lang3.StringUtils.lowerCase("english                                h                                 ", locale15);
        java.util.Set<java.lang.String> strSet23 = locale15.getUnicodeLocaleAttributes();
        org.junit.Assert.assertTrue("'" + category1 + "' != '" + java.util.Locale.Category.FORMAT + "'", category1.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "de");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "de");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "allemand" + "'", str5, "allemand");
        org.junit.Assert.assertEquals(locale9.toString(), "\\u0020italianitalianitalianitali\\u0020italianitalianitalianital_ALLEMAND");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "it");
        org.junit.Assert.assertNotNull(charSet16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Italienisch" + "'", str18, "Italienisch");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(strSet20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "english                                h                                 " + "'", str22, "english                                h                                 ");
        org.junit.Assert.assertNotNull(strSet23);
    }

    @Test
    public void test19903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19903");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "          HI!           ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test19904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19904");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=german(germany)german(germany)german(germany)german(germany)german(germany)german(germany)german(germany)german(germany)german(germany)german(germany)german(germany)german(germany)german(germany)german(germany)german(germany)german(germany)german(germany)german(germany)german(germany)german(germany)german(germany)german(germany)german(germany)german(germany)german(germany)german(germany)german(germany)german(germany)german(germany)german(germany)german(germany)german(germany)german(germany)german(germany)german(germany)german(germany)german(germany)german(germany)german(germany)german(germany)german(germany)german(germany)german(germany)german(germany)german(germany)german(germany)german(germany)german(germany)german(germany)german(germany)german(germany)german(germany)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test19905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19905");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "Regno Unito");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test19906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19906");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("FRANZ\326SISCH\n(FRANKREICH)HSIAGE_NAILATI_TIATTIHI!_NAILATI         HSILGNE_NAILATI_");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "franz\366sisch\n(frankreich)hsiage_nailati_tiattihi!_nailati         hsilgne_nailati_" + "'", str1, "franz\366sisch\n(frankreich)hsiage_nailati_tiattihi!_nailati         hsilgne_nailati_");
    }

    @Test
    public void test19907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19907");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("ITALIAN_ITALIAN_ENGLISH", "\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064", (int) 'B');
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test19908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19908");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCEgschCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC", "000000000000000000000000000000000000000000000000000000000000000CCCC\\CCCCHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH", 151);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test19909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19909");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("0023DALLEMANDALLEMANDALLEMANDALLEMANDALLEMANDALLEMANDALLEMANDALLE");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
    }

    @Test
    public void test19910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19910");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("zosischFranzosisch (Frankreich)", "zho");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "zosischFranzosisch (Frankreich)" + "'", str2, "zosischFranzosisch (Frankreich)");
    }

    @Test
    public void test19911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19911");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("", "CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCcinese (cina)u0069h..CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test19912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19912");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("italian_ITALIAN_EnglisF", 76, 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test19913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19913");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("DEUTSCH\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\", "\u82f1\u6587");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "DEUTSCH\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\" + "'", str2, "DEUTSCH\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
    }

    @Test
    public void test19914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19914");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("        ESELGNI         d00u\\00u\\ed00u\\00u\\ed00u\\", "FRANC", 23);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test19915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19915");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("\\u0068 !ih !ih !ih !ih !ih !ih !ih !ih !ih", 216, "ienischallemanditalian_ITALIAN_EnglishallemandHI!allemandhi!allemandADAEAFAGAIA...");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\u0068 !ih !ih !ih !ih !ih !ih !ih !ih !ihienischallemanditalian_ITALIAN_EnglishallemandHI!allemandhi!allemandADAEAFAGAIA...ienischallemanditalian_ITALIAN_EnglishallemandHI!allemandhi!allemandADAEAFAGAIA...ienischall" + "'", str3, "\\u0068 !ih !ih !ih !ih !ih !ih !ih !ih !ihienischallemanditalian_ITALIAN_EnglishallemandHI!allemandhi!allemandADAEAFAGAIA...ienischallemanditalian_ITALIAN_EnglishallemandHI!allemandhi!allemandADAEAFAGAIA...ienischall");
    }

    @Test
    public void test19916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19916");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale locale2 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str3 = locale2.getDisplayName();
        java.util.Locale.Builder builder4 = builder1.setLocale(locale2);
        java.util.Locale.Builder builder5 = builder1.clear();
        java.util.Locale.Builder builder6 = builder5.clear();
        java.util.Locale.Builder builder8 = builder5.setLanguage("zh");
        java.util.Locale.Builder builder9 = builder8.clear();
        java.util.Locale locale11 = java.util.Locale.forLanguageTag("Deutsch");
        java.lang.String str12 = locale11.getDisplayCountry();
        java.util.Locale locale14 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale locale15 = java.util.Locale.FRANCE;
        java.util.Locale locale16 = java.util.Locale.ITALIAN;
        java.lang.String str18 = locale16.getExtension('h');
        java.lang.String str19 = locale15.getDisplayScript(locale16);
        java.lang.String str20 = locale15.getISO3Country();
        java.util.Locale locale21 = java.util.Locale.GERMAN;
        java.util.Locale.setDefault(locale21);
        java.lang.String str23 = locale15.getDisplayName(locale21);
        java.lang.String str24 = locale14.getDisplayLanguage(locale21);
        java.lang.String str25 = locale11.getDisplayVariant(locale21);
        java.util.Locale.Builder builder26 = builder8.setLocale(locale21);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder28 = builder26.removeUnicodeLocaleAttribute("                                      )HSILGNE,NAILATI( ");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute:                                       )HSILGNE,NAILATI(  [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Franz\366sisch (Kanada)" + "'", str3, "Franz\366sisch (Kanada)");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "deutsch");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "it");
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "FRA" + "'", str20, "FRA");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "de");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Franz\366sisch (Frankreich)" + "'", str23, "Franz\366sisch (Frankreich)");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(builder26);
    }

    @Test
    public void test19917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19917");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("kkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkEDkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "kkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkEDkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk" + "'", str2, "kkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkEDkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk");
    }

    @Test
    public void test19918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19918");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "FrancGahhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test19919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19919");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("ESENIHC", "hi!       _\\U0020_Italienisch#########################################################################################", "hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhanglais (Canada)");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test19920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19920");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("ChineseEN_CA(China)", "FR-C                 ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test19921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19921");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder2 = builder0.clear();
        java.util.Locale.Builder builder4 = builder2.setScript("");
        java.util.Locale.Builder builder5 = builder4.clear();
        java.util.Locale.Builder builder6 = builder5.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder9 = builder5.setUnicodeLocaleKeyword("IT                   ", "9hhhhhhhhhh 9hhhhhhhhhh");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: IT                    [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test19922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19922");
        java.util.Locale locale0 = java.util.Locale.ROOT;
        java.lang.String str1 = locale0.getISO3Country();
        java.lang.String str2 = locale0.getDisplayVariant();
        java.lang.String str3 = locale0.getVariant();
        java.lang.Object obj4 = locale0.clone();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "");
    }

    @Test
    public void test19923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19923");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("cccccccccccccccccccccccccccccccccccccccccccccccccenglischcccccccccccccccccccccccccccccccccccccccccccccccccc", "eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "cccccccccccccccccccccccccccccccccccccccccccccccccenglischcccccccccccccccccccccccccccccccccccccccccccccccccc" + "'", str2, "cccccccccccccccccccccccccccccccccccccccccccccccccenglischcccccccccccccccccccccccccccccccccccccccccccccccccc");
    }

    @Test
    public void test19924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19924");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaa...ANiTALIaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test19925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19925");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("USEEEE", (int) 'N');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test19926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19926");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("Franz\366sischFranzosisch (Frankreich)kkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk", '4');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + 'F' + "'", char2 == 'F');
    }

    @Test
    public void test19927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19927");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("Italian (Italy)");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ")ylatI( nailatI" + "'", str1, ")ylatI( nailatI");
    }

    @Test
    public void test19928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19928");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("4444444FRA", "E");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test19929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19929");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("\\u006bCinese (Cina)\\u0069h..", "\\u006b");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test19930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19930");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "en_C");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test19931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19931");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("fr");
        java.lang.String[] strArray5 = new java.lang.String[] { "...ANiTALI", "             ", "          " };
        java.util.ArrayList<java.lang.String> strList6 = new java.util.ArrayList<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList6, strArray5);
        java.util.List<java.lang.String> strList8 = java.util.Locale.filterTags(languageRangeList1, (java.util.Collection<java.lang.String>) strList6);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap9 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList10 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList1, strMap9);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap11 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList12 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList10, strMap11);
        java.util.Locale locale13 = java.util.Locale.US;
        java.lang.String str14 = locale13.getScript();
        java.util.Set<java.lang.String> strSet15 = locale13.getUnicodeLocaleAttributes();
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.lang.String>) strSet15, 'N');
        java.util.List<java.lang.String> strList18 = java.util.Locale.filterTags(languageRangeList12, (java.util.Collection<java.lang.String>) strSet15);
        org.junit.Assert.assertNotNull(languageRangeList1);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(languageRangeList10);
        org.junit.Assert.assertNotNull(languageRangeList12);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(strSet15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(strList18);
    }

    @Test
    public void test19932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19932");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("\\u0034\\u00                                             hcstued                                             \\u0034\\u00 (\\U0020IITALIAN\\U0020I)");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\u0034\\u00                                             hcstued                                             \\u0034\\u00 (\\U0020IITALIAN\\U0020I)" + "'", str1, "\\u0034\\u00                                             hcstued                                             \\u0034\\u00 (\\U0020IITALIAN\\U0020I)");
    }

    @Test
    public void test19933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19933");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("FRANZ\326SISCHFRANZOSISCH (FRANKREICFRANZ\326SISCHFRANZOSISCH (FRANKREICH", 'a');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test19934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19934");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("\\U0020ITALIANITALIANITALIANITALI\\U0020ITALIANITALIANITALIANITAL (allemand)", (int) 'k');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\U0020ITALIANITALIANITALIANITALI\\U0020ITALIANITALIANITALIANITAL (allemand)" + "'", str2, "\\U0020ITALIANITALIANITALIANITALI\\U0020ITALIANITALIANITALIANITAL (allemand)");
    }

    @Test
    public void test19935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19935");
        java.util.Locale locale0 = java.util.Locale.US;
        java.lang.String str1 = locale0.getScript();
        java.util.Locale locale2 = java.util.Locale.getDefault();
        java.lang.String str3 = locale2.getLanguage();
        java.lang.String str4 = locale2.getScript();
        java.lang.String str5 = locale0.getDisplayScript(locale2);
        java.util.Locale locale9 = new java.util.Locale("u", "         italian_ITALIAN_English", "Chinese (China");
        java.lang.String str10 = locale2.getDisplayVariant(locale9);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "de");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "de" + "'", str3, "de");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals(locale9.toString(), "u_         ITALIAN_ITALIAN_ENGLISH_Chinese (China");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test19936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19936");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC\\u00de\\u00CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC", "ITALIAN_italian_eNGLISH         ITALIAN_!IHitTAiT_ITALIAN_EgAish", 90);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, 'N', (int) 'e', 19);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test19937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19937");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "\\u0045");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test19938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19938");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale locale2 = builder0.build();
        java.util.Locale.Builder builder3 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder3.clear();
        java.util.Locale.Builder builder6 = builder3.setScript("");
        java.util.Locale.Builder builder7 = builder6.clear();
        java.util.Locale locale8 = builder7.build();
        java.util.Locale locale9 = java.util.Locale.US;
        java.lang.String str10 = locale9.toLanguageTag();
        java.util.Set<java.lang.String> strSet11 = locale9.getUnicodeLocaleKeys();
        java.util.Locale.Builder builder12 = builder7.setLocale(locale9);
        java.util.Locale.Builder builder14 = builder7.setRegion("");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder16 = builder14.addUnicodeLocaleAttribute("\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: \\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u [at index 0]");
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
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "en-US" + "'", str10, "en-US");
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
    }

    @Test
    public void test19939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19939");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                                                                  \\U0069HHHHHHHHHH", "Allemagne", 30);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test19940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19940");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("French (Canada)", "nglischIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test19941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19941");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("                ita                ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test19942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19942");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("francese88888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888", "\uc774\ud0c8\ub9ac\uc544\uc5b4");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test19943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19943");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("                                                                                     g             ", "hEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglish", (int) 'D');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test19944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19944");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("hzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzh");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test19945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19945");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC", 109);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC" + "'", str2, "CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC");
    }

    @Test
    public void test19946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19946");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "ZH_cnFrench (Canada)AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ZH_cnFrench (Canada)AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str1, "ZH_cnFrench (Canada)AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test19947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19947");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("", "6400aUa\\\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rzh_CN");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test19948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19948");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("Deutsch\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\", "...                             xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx", 52);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test19949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19949");
        java.util.Locale locale0 = java.util.Locale.CHINESE;
        java.util.Locale locale1 = java.util.Locale.FRENCH;
        java.lang.String str2 = locale1.getDisplayName();
        java.lang.String str4 = locale1.getExtension('C');
        java.lang.String str5 = locale0.getDisplayLanguage(locale1);
        java.lang.String str6 = locale1.getISO3Country();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = locale1.getUnicodeLocaleType("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Franz\366sisch" + "'", str2, "Franz\366sisch");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chinois" + "'", str5, "chinois");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test19950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19950");
        java.util.Locale locale2 = new java.util.Locale("hi!       _\\U0020_Italienisch#########################################################################################", "ko");
        java.lang.String str3 = locale2.getCountry();
        java.lang.String str4 = locale2.toLanguageTag();
        java.util.Set<java.lang.String> strSet5 = locale2.getUnicodeLocaleKeys();
        java.lang.String str6 = locale2.getScript();
        org.junit.Assert.assertEquals(locale2.toString(), "hi!       _\\u0020_italienisch#########################################################################################_KO");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "KO" + "'", str3, "KO");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "und-KO" + "'", str4, "und-KO");
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test19951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19951");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("francesefrancesefrancesefr\\u0075");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "francesefrancesefrancesefr\\u007" + "'", str1, "francesefrancesefrancesefr\\u007");
    }

    @Test
    public void test19952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19952");
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("8600U\\                                                                                                                  ", "069\\u0069\\u0069\\u0069\\u0069\\", 92);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.startsWithAny("nglisch", strArray7);
        java.lang.String[] strArray11 = org.apache.commons.lang3.StringUtils.split("", 'n');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.replaceEach("", strArray7, strArray11);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray7);
        java.lang.String[] strArray17 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("hi!", "", (int) (short) 10);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray17, '4');
        java.lang.String[] strArray20 = org.apache.commons.lang3.StringUtils.stripAll(strArray17);
        java.lang.String[] strArray22 = org.apache.commons.lang3.StringUtils.stripAll(strArray20, "!IH");
        java.lang.String[] strArray23 = org.apache.commons.lang3.StringUtils.stripAll(strArray20);
        java.lang.String[] strArray25 = org.apache.commons.lang3.StringUtils.stripAll(strArray23, "0");
        java.lang.String str26 = org.apache.commons.lang3.StringUtils.replaceEach("TITHI!HI!", strArray7, strArray23);
        boolean boolean27 = org.apache.commons.lang3.StringUtils.startsWithAny("\uc601\uc5b4", strArray7);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "8600U\\                                                                                                                  " + "'", str13, "8600U\\                                                                                                                  ");
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "TITHI!HI!" + "'", str26, "TITHI!HI!");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test19953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19953");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("FRANCESE (cANADA)", 67, '2');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "22222222222222222222222222222222222222222222222222FRANCESE (cANADA)" + "'", str3, "22222222222222222222222222222222222222222222222222FRANCESE (cANADA)");
    }

    @Test
    public void test19954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19954");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("E44444444444444444444444444444444!IHg44444444444444444444444444444444!IH44444444444444444444444444444444!IHs", 0, 'c');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "E44444444444444444444444444444444!IHg44444444444444444444444444444444!IH44444444444444444444444444444444!IHs" + "'", str3, "E44444444444444444444444444444444!IHg44444444444444444444444444444444!IH44444444444444444444444444444444!IHs");
    }

    @Test
    public void test19955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19955");
        char[] charArray8 = new char[] { ' ', '4' };
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "HI!", charArray8);
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!", charArray8);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "h", charArray8);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "44444444444444NAILATI44444444444444", charArray8);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "zh_CN", charArray8);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[ , 4]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test19956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19956");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("\\u0020iTALIANiTALIANiTALIANiTALI", "");
        boolean boolean4 = org.apache.commons.lang3.StringUtils.endsWithAny("French (Canada)", strArray3);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "ittait_italian_egaish          ");
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\\u0020iTALIANiTALIANiTALIANiTALI" + "'", str6, "\\u0020iTALIANiTALIANiTALIANiTALI");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\\u0020iTALIANiTALIANiTALIANiTALI" + "'", str7, "\\u0020iTALIANiTALIANiTALIANiTALI");
    }

    @Test
    public void test19957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19957");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("ADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhATzhAUzhAWzhAXzhAZzhBAzhBBzhBDzhBEzhBFzhBGzhBHzhBIzhBJzhBLzhBMzhBNzhBOzhBQzhBRzhBSzhBTzhBVzhBWzhBYzhBZzhCAzhCCzhCDzhCFzhCGzhCHzhCIzhCKzhCLzhCMzhCNzhCOzhCRzhCUzhCVzhCWzhCXzhCYzhCZzhDEzhDJzhDKzhDMzhDOzhDZzhECzhEEzhEGzhEHzhERzhESzhETzhFIzhFJzhFKzhFMzhFOzhFRzhGAzhGBzhGDzhGEzhGFzhGGzhGHzhGIzhGLzhGMzhGNzhGPzhGQzhGRzhGSzhGTzhGUzhGWzhGYzhHKzhHMzhHNzhHRzhHTzhHUzhIDzhIEzhILzhIMzhINzhIOzhIQzhIRzhISzhITzhJEzhJMzhJOzhJPzhKEzhKGzhKHzhKIzhKMzhKNzhKPzhKRzhKWzhKYzhKZzhLAzhLBzhLCzhLIzhLKzhLRzhLSzhLTzhLUzhLVzhLYzhMAzhMCzhMDzhMEzhMFzhMGzhMHzhMKzhMLzhMMzhMNzhMOzhMPzhMQzhMRzhMSzhMTzhMUzhMVzhMWzhMXzhMYzhMZzhNAzhNCzhNEzhNFzhNGzhNIzhNLzhNOzhNPzhNRzhNUzhNZzhOMzhPAzhPEzhPFzhPGzhPHzhPKzhPLzhPMzhPNzhPRzhPSzhPTzhPWzhPYzhQAzhREzhROzhRSzhRUzhRWzhSAzhSBzhSCzhSDzhSEzhSGzhSHzhSIzhSJzhSKzhSLzhSMzhSNzhSOzhSRzhSSzhSTzhSVzhSXzhSYzhSZzhTCzhTDzhTFzhTGzhTHzhTJzhTKzhTLzhTMzhTNzhTOzhTRzhTTzhTVzhTWzhTZzhUAzhUGzhUMzhUSzhUYzhUZzhVAzhVCzhVEzhVGzhVIzhVNzhVUzhWFzhWSzhYEzhYTzhZAzhZMzhZW", "\\u0065", 104);
        boolean boolean5 = org.apache.commons.lang3.StringUtils.endsWithAny("\\u0066", strArray4);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, 'f', (int) '\\', 0);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test19958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19958");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("francese (Canada)", "hi!       dItalienischditalian_ITALIAN_EnglishdHI!dhi!dADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDED...d\\u0034dHI!dItaliand\\u0061d\\u0023dhi!diTALIANdChinese (China)dhi!dzh_CNdiTALIANdendItalienisch", "\\0020ItalianItalianItalianItal");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "frtatiIi2tatat" + "'", str3, "frtatiIi2tatat");
    }

    @Test
    public void test19959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19959");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz\\u005", 997, 'B');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "BBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz\\u005" + "'", str3, "BBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz\\u005");
    }

    @Test
    public void test19960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19960");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "\\U0020ITALIANITALIANITALIANITALI\\U0020ITALIANITALIANITALIANITAL", (java.lang.CharSequence) "                                               8300u\\                                                ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test19961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19961");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("                          ...");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test19962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19962");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("u", 'A');
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("BGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGTALIAN");
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.replaceEach("!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I", strArray4, strArray6);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.concatWith("                                                                                                        ", (java.lang.Object[]) strArray4);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, "\ud504\ub791\uc2a4HI!(\\U0020,ITALIENISCH#########################################################################################)", 103, 92);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I" + "'", str7, "!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "u" + "'", str8, "u");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test19963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19963");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i", "                              ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test19964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19964");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.setLanguageTag("Italian");
        java.util.Locale.Builder builder4 = builder0.clearExtensions();
        java.util.Locale.Builder builder5 = builder0.clear();
        java.util.Locale locale6 = java.util.Locale.ITALIAN;
        java.lang.String str7 = locale6.getDisplayLanguage();
        java.util.Locale locale8 = java.util.Locale.ITALIAN;
        java.lang.String str10 = locale8.getExtension('h');
        java.lang.String str11 = locale6.getDisplayCountry(locale8);
        java.util.Locale locale14 = new java.util.Locale("\\u0066");
        java.lang.String str16 = locale14.getExtension('i');
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.lowerCase("Cinese (Cina)\\u0069h...", locale14);
        java.lang.String str18 = locale14.getScript();
        java.lang.String str19 = locale8.getDisplayName(locale14);
        java.util.Locale locale22 = new java.util.Locale("                                     fran\347ais (France)                                      ", "Chinese (China");
        java.lang.String str23 = locale22.getDisplayVariant();
        java.lang.String str24 = locale14.getDisplayCountry(locale22);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder25 = builder0.setLocale(locale14);
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: \\u0066 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "it");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Italienisch" + "'", str7, "Italienisch");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "it");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals(locale14.toString(), "\\u0066");
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "cinese (cina)\\u0069h..." + "'", str17, "cinese (cina)\\u0069h...");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Italian" + "'", str19, "Italian");
        org.junit.Assert.assertEquals(locale22.toString(), "                                     fran\347ais (france)                                      _CHINESE (CHINA");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test19965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19965");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("iiiiiiiiiiiiiiiiiiiiiiiiiiiihI!       iiiiiiiiiiiiiiiiiiiiiiiiiiiii", "....................................................................................... (italian,english)", (int) 'C');
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test19966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19966");
        char char1 = org.apache.commons.lang3.CharUtils.toChar("kkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkNI");
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + 'k' + "'", char1 == 'k');
    }

    @Test
    public void test19967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19967");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("English                                 (                United                                 Kingdom                )");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "English                                 (                United                                 Kingdom                )" + "'", str1, "English                                 (                United                                 Kingdom                )");
    }

    @Test
    public void test19968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19968");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("", (int) 'u');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test19969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19969");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("           \\U", (int) (byte) 1, 'S');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "           \\U" + "'", str3, "           \\U");
    }

    @Test
    public void test19970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19970");
        java.util.Locale locale2 = new java.util.Locale("");
        java.util.Locale.setDefault(locale2);
        java.util.Set<java.lang.Character> charSet4 = locale2.getExtensionKeys();
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.upperCase("italian_ITALIAN_EnglisF", locale2);
        java.util.Set<java.lang.String> strSet6 = locale2.getUnicodeLocaleKeys();
        java.util.Locale.Builder builder7 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder8 = builder7.clearExtensions();
        java.util.Locale locale9 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str10 = locale9.getDisplayName();
        java.util.Locale.Builder builder11 = builder8.setLocale(locale9);
        java.util.Locale.Builder builder13 = builder8.setLanguage("und");
        java.util.Locale locale14 = builder13.build();
        java.util.Locale locale15 = builder13.build();
        java.util.Locale locale16 = builder13.build();
        boolean boolean17 = locale16.hasExtensions();
        java.lang.String str18 = locale2.getDisplayVariant(locale16);
        java.lang.String str19 = locale16.toString();
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertNotNull(charSet4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ITALIAN_ITALIAN_ENGLISF" + "'", str5, "ITALIAN_ITALIAN_ENGLISF");
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "French (Canada)" + "'", str10, "French (Canada)");
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "und_CA");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "und_CA");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "und_CA");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "und_CA" + "'", str19, "und_CA");
    }

    @Test
    public void test19971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19971");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("                                                                                                                                                                                                                                ", "ZhozhozhozhozhozhozhozhozhozhozhoItaliazhozhozhozhozhozhozhozhozhozhozhoz", 262);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test19972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19972");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("AhzRAhzQAhzOAhzNAh", "\uc911\uad6d\uc5b4\uc911\uad6d)");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test19973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19973");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("hsxlgnE_NAILATI_naxlatx\\", "\\U0034\\U00                                             HCSTUD                                             \\U0034\\U00 ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hsxlgnE_NAILATI_naxlatx\\" + "'", str2, "hsxlgnE_NAILATI_naxlatx\\");
    }

    @Test
    public void test19974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19974");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("AzhzhzhzhzhzhzhzhzhzhE             g                          ", "zhANzhAOzhAQzhARzhASzhAzhzhzhzhzhzhzhzhzhzh");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AzhzhzhzhzhzhzhzhzhzhE             g                          " + "'", str2, "AzhzhzhzhzhzhzhzhzhzhE             g                          ");
    }

    @Test
    public void test19975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19975");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("Franzosisch (Frankreich)", "und");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Franzosisch (Frankreich)" + "'", str2, "Franzosisch (Frankreich)");
    }

    @Test
    public void test19976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19976");
        char[] charArray13 = new char[] { ' ', '4' };
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "HI!", charArray13);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!", charArray13);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "h", charArray13);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "h", charArray13);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "iTALIAN", charArray13);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "FRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFR", charArray13);
        boolean boolean20 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "...", charArray13);
        boolean boolean21 = org.apache.commons.lang3.StringUtils.containsAny("ran\347ais (France)                                      f                                     ", charArray13);
        int int22 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "  \\u0020iTALIANiTALIANiTALIANiTAL  ", charArray13);
        boolean boolean23 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "italian", charArray13);
        int int24 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "                                                 INGLESE", charArray13);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[ , 4]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 49 + "'", int24 == 49);
    }

    @Test
    public void test19977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19977");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("                                      france                                      ", "iFtlnz\\sisc02");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test19978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19978");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("it44444444444444444en", "                  iTALIE                                           ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test19979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19979");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("ran\347aisa(France)aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaafaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (int) 'i', 'h');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hhhhhhhhhhhhhran\347aisa(France)aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaafaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "hhhhhhhhhhhhhran\347aisa(France)aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaafaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test19980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19980");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.setLanguageTag("Italian");
        java.util.Locale.Builder builder4 = builder0.clearExtensions();
        java.util.Locale.Builder builder5 = builder0.clear();
        java.util.Locale locale7 = java.util.Locale.forLanguageTag("\\u0020");
        java.util.Locale.Builder builder8 = builder0.setLocale(locale7);
        java.util.Locale.Builder builder9 = builder8.clear();
        java.util.Locale.Builder builder10 = builder8.clear();
        java.util.Locale.Builder builder11 = builder8.clear();
        java.util.Locale locale12 = java.util.Locale.ITALIAN;
        java.util.Set<java.lang.Character> charSet13 = locale12.getExtensionKeys();
        java.lang.String str14 = locale12.getVariant();
        java.lang.String str15 = locale12.getDisplayName();
        java.lang.String str16 = locale12.getDisplayName();
        java.lang.String str17 = locale12.getDisplayLanguage();
        java.util.Locale.Builder builder18 = new java.util.Locale.Builder();
        java.util.Locale locale19 = builder18.build();
        java.lang.String str20 = locale19.getDisplayCountry();
        java.lang.String str21 = locale12.getDisplayName(locale19);
        java.util.Locale locale22 = java.util.Locale.CANADA;
        java.lang.String str23 = locale22.getISO3Country();
        java.lang.String str24 = locale19.getDisplayCountry(locale22);
        java.util.Locale locale25 = java.util.Locale.FRENCH;
        java.util.Locale locale26 = java.util.Locale.ENGLISH;
        java.lang.String str27 = locale26.getDisplayCountry();
        java.lang.String str28 = locale25.getDisplayVariant(locale26);
        java.lang.String str29 = locale25.getDisplayCountry();
        java.lang.String str30 = locale25.getScript();
        java.util.Locale locale31 = java.util.Locale.KOREA;
        java.lang.String str32 = locale31.getLanguage();
        java.lang.String str33 = locale25.getDisplayName(locale31);
        java.lang.String str34 = locale25.getDisplayName();
        java.lang.String str35 = locale22.getDisplayName(locale25);
        java.util.Locale.setDefault(locale25);
        java.util.Locale.Builder builder37 = builder8.setLocale(locale25);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder39 = builder8.removeUnicodeLocaleAttribute("6400aUa\\\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rzh_CN");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: 6400aUa\\?????????????????????????????????????????????????????????????????????zh_CN [at index 0]");
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
        org.junit.Assert.assertEquals(locale12.toString(), "it");
        org.junit.Assert.assertNotNull(charSet13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Italian" + "'", str15, "Italian");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Italian" + "'", str16, "Italian");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Italian" + "'", str17, "Italian");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Italian" + "'", str21, "Italian");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "CAN" + "'", str23, "CAN");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "fr");
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "en");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "ko" + "'", str32, "ko");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "\ud504\ub791\uc2a4\uc5b4" + "'", str33, "\ud504\ub791\uc2a4\uc5b4");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "French" + "'", str34, "French");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "anglais (Canada)" + "'", str35, "anglais (Canada)");
        org.junit.Assert.assertNotNull(builder37);
    }

    @Test
    public void test19981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19981");
        char[] charArray9 = new char[] { ' ', '4' };
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "HI!", charArray9);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsAny("NC_hz\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r", charArray9);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "en_CA", charArray9);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiitalian_ITALIAN_EnglisEiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii", charArray9);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsAny("dallemandallemandallemandallemandallemandallemandallemandalle", charArray9);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "D  \\u007a", charArray9);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "     ", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[ , 4]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test19982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19982");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("\\XTALXAN_ITALIAN_ENGLXSHRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=\\xtalxan_italian_englxshrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrr");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test19983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19983");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("frdzhezhfzhgzhizhlzhmzhnzhozhqzhrzhszheeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=frdzhezhfzhgzhizhlzhmzhnzhozhqzhrzhszheeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test19984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19984");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "\\atalaaa_ITALIAN_Eaglaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test19985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19985");
        java.util.Locale locale1 = new java.util.Locale("");
        java.util.Locale.setDefault(locale1);
        java.util.Set<java.lang.Character> charSet3 = locale1.getExtensionKeys();
        java.lang.Class<?> wildcardClass4 = charSet3.getClass();
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(charSet3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test19986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19986");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "\u30d5\u30e9\u30f3\u30b9\u8a9e\u30d5\u30e9\u30f3\u30b9)");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test19987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19987");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "Japanese");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 8 + "'", int1 == 8);
    }

    @Test
    public void test19988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19988");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale1 = java.util.Locale.getDefault(category0);
        java.util.Locale locale2 = java.util.Locale.GERMAN;
        java.util.Locale locale3 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str4 = locale2.getDisplayName(locale3);
        java.util.Locale.setDefault(category0, locale3);
        java.util.Locale locale8 = new java.util.Locale("\\u0020iTALIANiTALIANiTALIANiTALI\\u0020iTALIANiTALIANiTALIANiTAL", "allemand");
        java.util.Locale.setDefault(category0, locale8);
        java.util.Locale locale10 = java.util.Locale.getDefault(category0);
        java.util.Locale locale12 = new java.util.Locale("en");
        java.lang.String str13 = locale10.getDisplayCountry(locale12);
        java.util.Set<java.lang.Character> charSet14 = locale12.getExtensionKeys();
        java.util.Set<java.lang.String> strSet15 = locale12.getUnicodeLocaleAttributes();
        java.util.Locale locale17 = new java.util.Locale("n44444444444444alia44444444444444it");
        java.util.Locale locale18 = java.util.Locale.GERMAN;
        java.util.Locale locale19 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str20 = locale18.getDisplayName(locale19);
        java.util.Locale.Category category21 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale22 = java.util.Locale.getDefault(category21);
        java.lang.String str23 = locale19.getDisplayVariant(locale22);
        java.util.Locale locale24 = java.util.Locale.GERMAN;
        java.util.Locale locale25 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str26 = locale24.getDisplayName(locale25);
        java.util.Locale locale27 = java.util.Locale.UK;
        java.util.Locale locale28 = java.util.Locale.GERMAN;
        java.util.Locale locale29 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str30 = locale28.getDisplayName(locale29);
        java.util.Locale locale31 = locale28.stripExtensions();
        java.lang.String str32 = locale27.getDisplayVariant(locale28);
        java.lang.String str33 = locale25.getDisplayLanguage(locale28);
        java.lang.String str34 = locale22.getDisplayName(locale25);
        java.lang.String str35 = locale17.getDisplayCountry(locale22);
        java.lang.String str36 = locale12.getDisplayLanguage(locale17);
        boolean boolean37 = locale12.hasExtensions();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "de");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "allemand" + "'", str4, "allemand");
        org.junit.Assert.assertEquals(locale8.toString(), "\\u0020italianitalianitalianitali\\u0020italianitalianitalianital_ALLEMAND");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "\\u0020italianitalianitalianitali\\u0020italianitalianitalianital_ALLEMAND");
        org.junit.Assert.assertEquals(locale12.toString(), "en");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "ALLEMAND" + "'", str13, "ALLEMAND");
        org.junit.Assert.assertNotNull(charSet14);
        org.junit.Assert.assertNotNull(strSet15);
        org.junit.Assert.assertEquals(locale17.toString(), "n44444444444444alia44444444444444it");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "de");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "allemand" + "'", str20, "allemand");
        org.junit.Assert.assertTrue("'" + category21 + "' != '" + java.util.Locale.Category.FORMAT + "'", category21.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "\\u0020italianitalianitalianitali\\u0020italianitalianitalianital_ALLEMAND");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "de");
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "allemand" + "'", str26, "allemand");
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "en_GB");
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "de");
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "allemand" + "'", str30, "allemand");
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "de");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Franz\366sisch" + "'", str33, "Franz\366sisch");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "\\u0020italianitalianitalianitali\\u0020italianitalianitalianital (ALLEMAND)" + "'", str34, "\\u0020italianitalianitalianitali\\u0020italianitalianitalianital (ALLEMAND)");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "English" + "'", str36, "English");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test19989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19989");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("HIEnglish                                 (                United                                 Kingdom                )!English                                 (                United                                 Kingdom                )       ", "ZHZHZHZHZHZHZHZHZHZHFRAADZHAEZHAFZHAGZHAIZHALZHAMZHANZHAOZHAQZHARZHASZHAZHZHZHZHZHZHZEMAND");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test19990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19990");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("cCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC\\u00de\\u00CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC", "_");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test19991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19991");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("korezhzhzhzhzhzhzhzhzhzhfraadzhaezTtat_itahagzhaizhalzhamzhanzhaozhaqzharzhaszhazhzhzhzhzhzhzemandn (south korea)", (int) '#', (int) ' ');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test19992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19992");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("GBR", (int) '\u6cd5');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test19993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19993");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064", "ADHAEHAFHAGHAIHALHAMHANHAOHAQHARHASHATHAUHAWHAXHAZHBAHBBHBDHBEHBFHBGHBHHBIHBJHBLHBMHBNHBOHBQHBRHBSHBTHBVHBWHBYHBZHCAHCCHCDHCFHCGHCHHCIHCKHCLHCMHCNHCOHCRHCUHCVHCWHCXHCYHCZHDEHDJHDKHDMHDOHDZHECHEEHEGHEHHERHESHETHFIHFJHFKHFMHFOHFRHGAHGBHGDHGEHGFHGGHGHHGIHGLHGMHGNHGPHGQHGRHGSHGTHGUHGWHGYHHKHHMHHNHHRHHTHHUHIDHIEHILHIMHINHIOHIQHIRHISHITHJEHJMHJOHJPHKEHKGHKHHKIHKMHKNHKPHKRHKWHKYHKZHLAHLBHLCHLIHLKHLRHLSHLTHLUHLVHLYHMAHMCHMDHMEHMFHMGHMHHMKHMLHMMHMNHMOHMPHMQHMRHMSHMTHMUHMVHMWHMXHMYHMZHNAHNCHNEHNFHNGHNIHNLHNOHNPHNRHNUHNZHOMHPAHPEHPFHPGHPHHPKHPLHPMHPNHPRHPSHPTHPWHPYHQAHREHROHRSHRUHRWHSAHSBHSCHSDHSEHSGHSHHSIHSJHSKHSLHSMHSNHSOHSRHSSHSTHSVHSXHSYHSZHTCHTDHTFHTGHTHHTJHTKHTLHTMHTNHTOHTRHTTHTVHTWHTZHUAHUGHUMHUSHUYHUZHVAHVCHVEHVGHVIHVNHVUHWFHWSHYEHYTHZAHZMHZW");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test19994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19994");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("Frnz\366sisch(Knd)", "\\U0034\\U00                                             HCSTUD                                             \\U0034\\U00 ", (int) 'D');
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test19995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19995");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("...IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII..." + "'", str1, "IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII...");
    }

    @Test
    public void test19996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19996");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("itTAiT_ITALIAN_EgAish", "\u82f1\u6587");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test19997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19997");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("CHINESE (CHINA)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=chinese (china)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test19998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19998");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("\\u0043", "\\U0023", (int) '5');
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test19999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19999");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.util.Locale locale1 = java.util.Locale.ITALIAN;
        java.lang.String str3 = locale1.getExtension('h');
        java.lang.String str4 = locale0.getDisplayScript(locale1);
        boolean boolean5 = locale0.hasExtensions();
        java.lang.String str6 = locale0.getVariant();
        java.lang.String str7 = locale0.getLanguage();
        java.util.Set<java.lang.String> strSet8 = locale0.getUnicodeLocaleKeys();
        java.lang.String str9 = locale0.getVariant();
        java.lang.String str10 = locale0.getDisplayScript();
        java.util.Locale locale11 = java.util.Locale.GERMAN;
        java.util.Locale.setDefault(locale11);
        java.lang.String str13 = locale11.toLanguageTag();
        java.util.Locale locale14 = java.util.Locale.ITALY;
        java.lang.String str15 = locale14.getScript();
        java.lang.String str16 = locale14.getDisplayCountry();
        boolean boolean17 = locale14.hasExtensions();
        java.util.Locale.setDefault(locale14);
        java.lang.String str19 = locale11.getDisplayLanguage(locale14);
        java.lang.String str20 = locale14.getDisplayVariant();
        java.lang.String str21 = locale0.getDisplayName(locale14);
        java.lang.String str22 = locale0.getLanguage();
        boolean boolean23 = locale0.hasExtensions();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "it");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "fr" + "'", str7, "fr");
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "de");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "de" + "'", str13, "de");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Italien" + "'", str16, "Italien");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "tedesco" + "'", str19, "tedesco");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "francese (Francia)" + "'", str21, "francese (Francia)");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "fr" + "'", str22, "fr");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test20000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test20000");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "##########");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "##########" + "'", str1, "##########");
    }
}
