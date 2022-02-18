import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest60 {

    public static boolean debug = false;

    @Test
    public void test30001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30001");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("HhhhhhhhhHhhhhhhhhHhhhhhhhhHhhhhhhhhHhhITALIENISCHHhhhhhhhhHhhhhhhhhHhhhhhhhhHhhhhhhhhHhhh", "ZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGG");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test30002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30002");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "             und");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test30003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30003");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("a)AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAdZH_cnFrench (Cana", "Regno Unito", 104);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test30004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30004");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("         INGLESE        ", 96);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                 INGLESE        " + "'", str2, "                                                                                 INGLESE        ");
    }

    @Test
    public void test30005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30005");
        java.lang.CharSequence charSequence0 = null;
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny(charSequence0, "HI!ALLEMANDITALIENISCHALLEMANDITALIAN_ITALIAN_ENGLISHALLEMANDHI!ALLEMANDHI!ALLEMANDADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDED...ALLEMAND\\U0034ALLEMANDHI!ALLEMANDITALIANALLEMAND\\U0061ALLEMAND\\U0023ALLEMANDHI!ALLEMANDITALIANALLEMANDCHINESE(CHINA)ALLEMANDHI!ALLEMANDZH_CNALLEMANDITALIANALLEMANDENALLEMANDITALIENISCH");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test30006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30006");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("\\0020!TALIAN!TALIAN!TALIAIAN_Englishallemzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz", "fRANZ\326SISCH (kANADA)fRANZ\326S                                                                 fRANZ\326SISCH (kANADA)fRANZ\326SI");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test30007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30007");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("cinese (Cina)", "Hhhhhhhhhh");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test30008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30008");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "en_C");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "en_C" + "'", str1, "en_C");
    }

    @Test
    public void test30009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30009");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale locale2 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str3 = locale2.getDisplayName();
        java.util.Locale.Builder builder4 = builder1.setLocale(locale2);
        java.util.Locale.Builder builder6 = builder1.setLanguage("und");
        java.util.Locale locale7 = builder6.build();
        java.util.Locale.Builder builder9 = builder6.setLanguage("fr");
        java.util.Locale.Builder builder10 = builder6.clear();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fr_CA");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\ud504\ub791\uc2a4\uc5b4\uce90\ub098\ub2e4)" + "'", str3, "\ud504\ub791\uc2a4\uc5b4\uce90\ub098\ub2e4)");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "und_CA");
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test30010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30010");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("CCCCCCCCCCCCCanglais (CanadaCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC", 220, (int) 'S');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test30011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30011");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("                                                                                         fr-", "                                                                                                                                                                                                                                                                                                                                                                     \\u002e");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                         fr-" + "'", str2, "                                                                                         fr-");
    }

    @Test
    public void test30012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30012");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("\\u0042", 97, 52);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\u0042" + "'", str3, "\\u0042");
    }

    @Test
    public void test30013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30013");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII00000000...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII00000000..." + "'", str1, "IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII00000000...");
    }

    @Test
    public void test30014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30014");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("     e                               e                               e            ", "FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF\nFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test30015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30015");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("Ttat_itaTtat_itaTtat_itaTtat_itaTtat_itaTtat_itaTtat_itaTtat_itaTtat_itaTtat_itaTtat_itaTtat_itaTtat_itaTtat_itaTtat_itaTtat_itaTtat_itaTtat_itaTtat_itaTtat_itaTtat_itaTtat_itaTtat_itaTtat_itaTtat_itaTtat_itaTtat_itaTtat_ita", "44444444444444NAILATI44444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "tat_itaTtat_itaTtat_itaTtat_itaTtat_itaTtat_itaTtat_itaTtat_itaTtat_itaTtat_itaTtat_itaTtat_itaTtat_itaTtat_itaTtat_itaTtat_itaTtat_itaTtat_itaTtat_itaTtat_itaTtat_itaTtat_itaTtat_itaTtat_itaTtat_itaTtat_itaTtat_itaTtat_ita" + "'", str2, "tat_itaTtat_itaTtat_itaTtat_itaTtat_itaTtat_itaTtat_itaTtat_itaTtat_itaTtat_itaTtat_itaTtat_itaTtat_itaTtat_itaTtat_itaTtat_itaTtat_itaTtat_itaTtat_itaTtat_itaTtat_itaTtat_itaTtat_itaTtat_itaTtat_itaTtat_itaTtat_itaTtat_ita");
    }

    @Test
    public void test30016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30016");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "z...frn (CHINESE)");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test30017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30017");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("hi!_\\U0020_Italienisch#########################################################################################", (int) 'k', "zho                                                                    \\u0020italianitalianitalianitali");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!_\\U0020_Italienisch#########################################################################################" + "'", str3, "hi!_\\U0020_Italienisch#########################################################################################");
    }

    @Test
    public void test30018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30018");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIn44444444444444alia44444444444444itIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII", "\\u0021");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIn44444444444444alia44444444444444itIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII" + "'", str2, "IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIn44444444444444alia44444444444444itIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII");
    }

    @Test
    public void test30019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30019");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "ta...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test30020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30020");
        char[] charArray1 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("ALLEMAND", charArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test30021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30021");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder2 = builder0.clear();
        java.util.Locale.Builder builder4 = builder2.setScript("");
        java.util.Locale.Builder builder5 = builder4.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder7 = builder5.setVariant("englisch (         ITALIAN_ITALIAN_ENGLISH,\\u0061");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: englisch (         ITALIAN_ITALIAN_ENGLISH,\\u0061 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test30022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30022");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("FranzosischFranz\366sisch (Kanada)(Frankreich)", '9');
        boolean boolean4 = org.apache.commons.lang3.StringUtils.startsWithAny("9hhhhhhhhhh_\\U0078", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test30023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30023");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("KoreanADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDhcstueDKoreanADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDB", "french");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "\u82f1\u6587\u82f1\u56fd)");
        org.junit.Assert.assertNotNull(strArray2);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u82f1\u6587\u82f1\u56fd\u82f1\u6587\u82f1\u56fd\u82f1\u6587\u82f1\u56fd\u82f1\u6587\u82f1\u56fd\u82f1\u6587\u82f1\u56fd\u82f1\u6587\u82f1\u56fd\u82f1\u6587\u82f1\u56fd\u82f1\u6587\u82f1\u56fd\u82f1\u6587\u82f1\u56fd)ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDB" + "'", str4, "\u82f1\u6587\u82f1\u56fd\u82f1\u6587\u82f1\u56fd\u82f1\u6587\u82f1\u56fd\u82f1\u6587\u82f1\u56fd\u82f1\u6587\u82f1\u56fd\u82f1\u6587\u82f1\u56fd\u82f1\u6587\u82f1\u56fd\u82f1\u6587\u82f1\u56fd\u82f1\u6587\u82f1\u56fd)ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDB");
    }

    @Test
    public void test30024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30024");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder2 = builder0.clear();
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale.Builder builder5 = builder0.setVariant("itTAiT_ITALIAN_EgAish");
        java.util.Locale.Builder builder6 = builder5.clearExtensions();
        java.util.Locale.Builder builder7 = builder6.clearExtensions();
        java.util.Locale.Builder builder9 = builder6.setVariant("Eagaash");
        java.util.Locale.Builder builder10 = builder9.clear();
        java.util.Locale.Builder builder12 = builder9.setScript("");
        java.util.Locale.Builder builder13 = builder9.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder15 = builder9.setVariant("      \\u00de\\u00\\u00de\\u00\\u00d         INGLESE       O");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant:       \\u00de\\u00\\u00de\\u00\\u00d         INGLESE       O [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test30025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30025");
        java.util.Locale locale2 = java.util.Locale.KOREA;
        java.lang.String str3 = locale2.getLanguage();
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.upperCase("TALIAN\\u0023", locale2);
        java.util.Locale locale6 = java.util.Locale.FRANCE;
        java.util.Locale locale7 = java.util.Locale.ITALIAN;
        java.lang.String str9 = locale7.getExtension('h');
        java.lang.String str10 = locale6.getDisplayScript(locale7);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.lowerCase("HI!       ", locale6);
        java.lang.String str12 = locale2.getDisplayVariant(locale6);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.upperCase("nc_HZ", locale2);
        java.lang.String str14 = locale2.getDisplayCountry();
        java.lang.String str15 = locale2.getDisplayName();
        java.lang.String str16 = locale2.getDisplayCountry();
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ko" + "'", str3, "ko");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "TALIAN\\U0023" + "'", str4, "TALIAN\\U0023");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "it");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!       " + "'", str11, "hi!       ");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "NC_HZ" + "'", str13, "NC_HZ");
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\ub300\ud55c\ubbfc\uad6d" + "'", str14, "\ub300\ud55c\ubbfc\uad6d");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\ud55c\uad6d\uc5b4\ub300\ud55c\ubbfc\uad6d)" + "'", str15, "\ud55c\uad6d\uc5b4\ub300\ud55c\ubbfc\uad6d)");
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\ub300\ud55c\ubbfc\uad6d" + "'", str16, "\ub300\ud55c\ubbfc\uad6d");
    }

    @Test
    public void test30026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30026");
        char char1 = org.apache.commons.lang3.CharUtils.toChar("China");
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + 'C' + "'", char1 == 'C');
    }

    @Test
    public void test30027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30027");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("                                                                                                   HSadanacadanacGadanacE", '\351');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                   HSadanacadanacGadanacE" + "'", str2, "                                                                                                   HSadanacadanacGadanacE");
    }

    @Test
    public void test30028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30028");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("Deutsch");
        java.lang.String str2 = locale1.getDisplayCountry();
        java.util.Locale locale4 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale locale5 = java.util.Locale.FRANCE;
        java.util.Locale locale6 = java.util.Locale.ITALIAN;
        java.lang.String str8 = locale6.getExtension('h');
        java.lang.String str9 = locale5.getDisplayScript(locale6);
        java.lang.String str10 = locale5.getISO3Country();
        java.util.Locale locale11 = java.util.Locale.GERMAN;
        java.util.Locale.setDefault(locale11);
        java.lang.String str13 = locale5.getDisplayName(locale11);
        java.lang.String str14 = locale4.getDisplayLanguage(locale11);
        java.lang.String str15 = locale1.getDisplayVariant(locale11);
        java.lang.String str16 = locale1.getDisplayVariant();
        java.util.Locale locale17 = java.util.Locale.ENGLISH;
        java.util.Locale.setDefault(locale17);
        java.lang.String str19 = locale1.getDisplayCountry(locale17);
        java.lang.String str20 = locale17.getDisplayLanguage();
        java.util.Set<java.lang.String> strSet21 = locale17.getUnicodeLocaleKeys();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "deutsch");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "it");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "FRA" + "'", str10, "FRA");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "de");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Franz\366sisch (Frankreich)" + "'", str13, "Franz\366sisch (Frankreich)");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "en");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "English" + "'", str20, "English");
        org.junit.Assert.assertNotNull(strSet21);
    }

    @Test
    public void test30029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30029");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("  ", "hI!       ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "  " + "'", str2, "  ");
    }

    @Test
    public void test30030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30030");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("itTAiT_ITALIAN_EgAish                                 \\u0068", "allemand (Allemagne)");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "itTAiT_ITALIAN_EgAish                                 \\u0068" + "'", str2, "itTAiT_ITALIAN_EgAish                                 \\u0068");
    }

    @Test
    public void test30031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30031");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("hsilgne,nailati( nailati", (int) 'A', '0');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hsilgne,nailati( nailati00000000000000000000000000000000000000000" + "'", str3, "hsilgne,nailati( nailati00000000000000000000000000000000000000000");
    }

    @Test
    public void test30032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30032");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("                                                                        IT44444444444444444EN                       ", "kre");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test30033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30033");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("\\U0078", 215);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\U0078" + "'", str2, "\\U0078");
    }

    @Test
    public void test30034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30034");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "dez...dez...dez...dez...dez...dez...dez...dez...dez...dez...dez...dez...dez...dez...dez...dez...dez...dez...dez...dez...dez...dez...dez...dez...dez...dez...dez...dez...dez...dez...dez...dez...dez...dez...dez...dez...dez...dez...dez...dez...de");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test30035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30035");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("\\u0034\\u00                                   en_C\\u0034\\u00", "ITALIAN_italian_eNGLISH         ITALIAN_!IHitTAiT_ITALIAN_EgAish");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, 'a');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\\u0034\\u00                                   en_C\\u0034\\u00" + "'", str4, "\\u0034\\u00                                   en_C\\u0034\\u00");
    }

    @Test
    public void test30036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30036");
        java.util.Locale locale2 = new java.util.Locale("!ih", "\u6cd5\u570b");
// flaky:         org.junit.Assert.assertEquals(locale2.toString(), "\u6cd5\u570b");
    }

    @Test
    public void test30037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30037");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("\\u0023", "\\u0023");
        int int5 = org.apache.commons.lang3.StringUtils.indexOfAny("\r", strArray4);
        boolean boolean6 = org.apache.commons.lang3.StringUtils.endsWithAny("                                                                                                                  \\u0068", strArray4);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.stripAll(strArray4, "                                                               \\U0020");
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, 'C', 84, 6);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test30038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30038");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("          tT           T IT ", 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test30039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30039");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("...AT4AS4AR4AQ4AO4A...N4");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4N...A4OA4QA4RA4SA4TA..." + "'", str1, "4N...A4OA4QA4RA4SA4TA...");
    }

    @Test
    public void test30040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30040");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("\u82f1\u6587\u82f1\u56fd)");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u82f1\u6587\u82f1\u56fd)" + "'", str2, "\u82f1\u6587\u82f1\u56fd)");
    }

    @Test
    public void test30041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30041");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "EagaashUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test30042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30042");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "\u1112\u1161\u11ab\u1100\u116e\u11a8\u110b\u1165\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n", (java.lang.CharSequence) "FR-CAFR-CAFR-C8600U\\FR-CAFR-CAFR-CA");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test30043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30043");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("AD4AE4AF4AG4AI4AL4AM4AN4AO4AQ4AR4AS4AT4AU4AW4AX4AZ4BA4BB4BD4BE4BF4BG4BH4BI4BJ4BL4BM4BN4BO4BQ4BR4BS4BT4BV4BW4BY4BZ4CA4CC4CD4CF4CG4CH4CI4CK4CL4CM4CN4CO4CR4CU4CV4CW4CX4CY4CZ4DE4DJ4DK4DM4DO4DZ4EC4EE4EG4EH4ER4ES4ET4FI4FJ4FK4FM4FO4FR4GA4GB4GD4GE4GF4GG4GH4GI4GL4GM4GN4GP4GQ4GR4GS4GT4GU4GW4GY4HK4HM4HN4HR4HT4HU4ID4IE4IL4IM4IN4IO4IQ4IR4IS4IT4JE4JM4JO4JP4KE4KG4KH4KI4KM4KN4KP4KR4KW4KY4KZ4LA4LB4LC4LI4LK4LR4LS4LT4LU4LV4LY4MA4MC4MD4ME4MF4MG4MH4MK4ML4MM4MN4MO4MP4MQ4MR4MS4MT4MU4MV4MW4MX4MY4MZ4NA4NC4NE4NF4NG4NI4NL4NO4NP4NR4NU4NZ4OM4PA4PE4PF4PG4PH4PK4PL4PM4PN4PR4PS4PT4PW4PY4QA4RE4RO4RS4RU4RW4SA4SB4SC4SD4SE4SG4SH4SI4SJ4SK4SL4SM4SN4SO4SR4SS4ST4SV4SX4SY4SZ4TC4TD4TF4TG4TH4TJ4TK4TL4TM4TN4TO4TR4TT4TV4TW4TZ4UA4UG4UM4US4UY4UZ4VA4VC4VE4VG4VI4VN4VU4WF4WS4YE4YT4ZA4ZM4ZW", "g");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AD4AE4AF4AG4AI4AL4AM4AN4AO4AQ4AR4AS4AT4AU4AW4AX4AZ4BA4BB4BD4BE4BF4BG4BH4BI4BJ4BL4BM4BN4BO4BQ4BR4BS4BT4BV4BW4BY4BZ4CA4CC4CD4CF4CG4CH4CI4CK4CL4CM4CN4CO4CR4CU4CV4CW4CX4CY4CZ4DE4DJ4DK4DM4DO4DZ4EC4EE4EG4EH4ER4ES4ET4FI4FJ4FK4FM4FO4FR4GA4GB4GD4GE4GF4GG4GH4GI4GL4GM4GN4GP4GQ4GR4GS4GT4GU4GW4GY4HK4HM4HN4HR4HT4HU4ID4IE4IL4IM4IN4IO4IQ4IR4IS4IT4JE4JM4JO4JP4KE4KG4KH4KI4KM4KN4KP4KR4KW4KY4KZ4LA4LB4LC4LI4LK4LR4LS4LT4LU4LV4LY4MA4MC4MD4ME4MF4MG4MH4MK4ML4MM4MN4MO4MP4MQ4MR4MS4MT4MU4MV4MW4MX4MY4MZ4NA4NC4NE4NF4NG4NI4NL4NO4NP4NR4NU4NZ4OM4PA4PE4PF4PG4PH4PK4PL4PM4PN4PR4PS4PT4PW4PY4QA4RE4RO4RS4RU4RW4SA4SB4SC4SD4SE4SG4SH4SI4SJ4SK4SL4SM4SN4SO4SR4SS4ST4SV4SX4SY4SZ4TC4TD4TF4TG4TH4TJ4TK4TL4TM4TN4TO4TR4TT4TV4TW4TZ4UA4UG4UM4US4UY4UZ4VA4VC4VE4VG4VI4VN4VU4WF4WS4YE4YT4ZA4ZM4ZW" + "'", str2, "AD4AE4AF4AG4AI4AL4AM4AN4AO4AQ4AR4AS4AT4AU4AW4AX4AZ4BA4BB4BD4BE4BF4BG4BH4BI4BJ4BL4BM4BN4BO4BQ4BR4BS4BT4BV4BW4BY4BZ4CA4CC4CD4CF4CG4CH4CI4CK4CL4CM4CN4CO4CR4CU4CV4CW4CX4CY4CZ4DE4DJ4DK4DM4DO4DZ4EC4EE4EG4EH4ER4ES4ET4FI4FJ4FK4FM4FO4FR4GA4GB4GD4GE4GF4GG4GH4GI4GL4GM4GN4GP4GQ4GR4GS4GT4GU4GW4GY4HK4HM4HN4HR4HT4HU4ID4IE4IL4IM4IN4IO4IQ4IR4IS4IT4JE4JM4JO4JP4KE4KG4KH4KI4KM4KN4KP4KR4KW4KY4KZ4LA4LB4LC4LI4LK4LR4LS4LT4LU4LV4LY4MA4MC4MD4ME4MF4MG4MH4MK4ML4MM4MN4MO4MP4MQ4MR4MS4MT4MU4MV4MW4MX4MY4MZ4NA4NC4NE4NF4NG4NI4NL4NO4NP4NR4NU4NZ4OM4PA4PE4PF4PG4PH4PK4PL4PM4PN4PR4PS4PT4PW4PY4QA4RE4RO4RS4RU4RW4SA4SB4SC4SD4SE4SG4SH4SI4SJ4SK4SL4SM4SN4SO4SR4SS4ST4SV4SX4SY4SZ4TC4TD4TF4TG4TH4TJ4TK4TL4TM4TN4TO4TR4TT4TV4TW4TZ4UA4UG4UM4US4UY4UZ4VA4VC4VE4VG4VI4VN4VU4WF4WS4YE4YT4ZA4ZM4ZW");
    }

    @Test
    public void test30044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30044");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxCHINESE", "                                                                                                   HSadanacadanacGadanacE", (int) '\\');
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test30045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30045");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("200U\\", "CAN", 114);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test30046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30046");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("ittait_italian_egaish          ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test30047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30047");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("Eagaash", "BBBBBBILATiNA...royaume-uniroyaume-uniroyBBBBBBB");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test30048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30048");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("fran\347ais(france)(CHINESE(CHINA)");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "fran\347ais(france)(CHINESE(CHINA)" + "'", str1, "fran\347ais(france)(CHINESE(CHINA)");
    }

    @Test
    public void test30049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30049");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("", "eee");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test30050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30050");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("\u30a4\u30bf\u30ea\u30a2\u8a9e");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=?????");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test30051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30051");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("EN_ca.....", strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=en_ca.....");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test30052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30052");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("chinois", "iTALIAN                                                                 ");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray4);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray5, "anglais (Royaume-Uni)", 100, 56);
        java.lang.String[] strArray13 = org.apache.commons.lang3.StringUtils.split("", "Chinese (China)", (int) 'x');
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray13, "\\U0064");
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray13);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.replaceEach("iiiiiiiiiiiFrankreichNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN", strArray5, strArray13);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.startsWithAny("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaFranz\366sisc", strArray5);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "iiiiiiiiiiiFrankreichNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN" + "'", str17, "iiiiiiiiiiiFrankreichNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test30053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30053");
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
        java.lang.String str18 = locale9.toLanguageTag();
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "fr" + "'", str18, "fr");
    }

    @Test
    public void test30054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30054");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023", 96, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum abbreviation width is 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test30055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30055");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("                                             hcstued", 327, (int) 'B');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test30056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30056");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("b");
        boolean boolean3 = locale1.equals((java.lang.Object) "italiaE");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test30057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30057");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "\\u00de\\u00\\u00de\\u00\\u00d         INGLESE        ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 49 + "'", int1 == 49);
    }

    @Test
    public void test30058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30058");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("nglisch", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test30059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30059");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.setLanguageTag("Italian");
        java.util.Locale.Builder builder4 = builder0.clearExtensions();
        java.util.Locale.Builder builder5 = builder0.clear();
        java.util.Locale locale7 = java.util.Locale.forLanguageTag("\\u0020");
        java.util.Locale.Builder builder8 = builder0.setLocale(locale7);
        java.util.Locale.Builder builder11 = builder0.setExtension('u', "Italian");
        java.util.Locale.Builder builder12 = builder0.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder14 = builder12.setScript("EagaasiTALIAN_italian_eNGLISHITALIAN_!IHitTAiT_ITALIAN_EgAish");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: EagaasiTALIAN_italian_eNGLISHITALIAN_!IHitTAiT_ITALIAN_EgAish [at index 0]");
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
    }

    @Test
    public void test30060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30060");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "zhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhz\\U0078zhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzh", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          IAN\\U0020I");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test30061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30061");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale locale2 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str3 = locale2.getDisplayName();
        java.util.Locale.Builder builder4 = builder1.setLocale(locale2);
        java.util.Locale locale5 = java.util.Locale.GERMANY;
        java.util.Locale.Builder builder6 = builder1.setLocale(locale5);
        java.util.Set<java.lang.String> strSet7 = locale5.getUnicodeLocaleAttributes();
        java.lang.String str8 = locale5.getVariant();
        java.util.Locale locale9 = locale5.stripExtensions();
        java.util.Locale locale10 = locale5.stripExtensions();
        java.util.Locale locale12 = java.util.Locale.ITALIAN;
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.upperCase("de_DE", locale12);
        java.util.Set<java.lang.String> strSet14 = locale12.getUnicodeLocaleKeys();
        java.lang.String str15 = locale10.getDisplayLanguage(locale12);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "French (Canada)" + "'", str3, "French (Canada)");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "de_DE");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "de_DE");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "de_DE");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "it");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "DE_DE" + "'", str13, "DE_DE");
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "tedesco" + "'", str15, "tedesco");
    }

    @Test
    public void test30062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30062");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "                                                                   9hhhhhhhhhh_\\U0078");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                   9hhhhhhhhhh_\\U0078" + "'", str1, "                                                                   9hhhhhhhhhh_\\U0078");
    }

    @Test
    public void test30063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30063");
        java.util.Locale.Builder builder1 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder1.clearExtensions();
        java.util.Locale locale3 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str4 = locale3.getDisplayName();
        java.util.Locale.Builder builder5 = builder2.setLocale(locale3);
        java.util.Locale.Builder builder6 = builder2.clear();
        java.util.Locale.Builder builder8 = builder2.setLanguage("RA");
        java.util.Locale.Builder builder10 = builder8.setLanguage("");
        java.util.Locale locale11 = java.util.Locale.ENGLISH;
        java.lang.String str12 = locale11.getDisplayVariant();
        java.util.Locale.Builder builder13 = builder8.setLocale(locale11);
        java.util.Locale locale14 = builder13.build();
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.upperCase("aaUabUaeUafUakUamUanUarUasUavUayUazUbaUbeUbgUbhUbiUbmUbnUboUbrUbsUcaUceUchUcoUcrUcsUcuUcvUcyUdaUdeUdvUdzUeeUelUenUeoUesUetUeuUfaUffUfiUfjUfoUfrUfyUgaUgdUglUgnUguUgvUhaUheUhiUhoUhrUhtUhuUhyUhzUiaUidUieUigUiiUikUinUioUisUitUiuUiwUjaUjiUjvUkaUkgUkiUkjUkkUklUkmUknUkoUkrUksUkuUkvUkwUkyUlaUlbUlgUliUlnUloUltUluUlvUmgUmhUmiUmkUmlUmnUmoUmrUmsUmtUmyUnaUnbUndUneUngUnlUnnUnoUnrUnvUnyUocUojUomUorUosUpaUpiUplUpsUptUquUrmUrnUroUruUrwUsaUscUsdUseUsgUsiUskUslUsmUsnUsoUsqUsrUssUstUsuUsvUswUtaUteUtgUthUtiUtkUtlUtnUtoUtrUtsUttUtwUtyUugUukUurUuzUveUviUvoUwaUwoUxhUyiUyoUzaUzhUzu", locale14);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "French (Canada)" + "'", str4, "French (Canada)");
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "en");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "en");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "AAUABUAEUAFUAKUAMUANUARUASUAVUAYUAZUBAUBEUBGUBHUBIUBMUBNUBOUBRUBSUCAUCEUCHUCOUCRUCSUCUUCVUCYUDAUDEUDVUDZUEEUELUENUEOUESUETUEUUFAUFFUFIUFJUFOUFRUFYUGAUGDUGLUGNUGUUGVUHAUHEUHIUHOUHRUHTUHUUHYUHZUIAUIDUIEUIGUIIUIKUINUIOUISUITUIUUIWUJAUJIUJVUKAUKGUKIUKJUKKUKLUKMUKNUKOUKRUKSUKUUKVUKWUKYULAULBULGULIULNULOULTULUULVUMGUMHUMIUMKUMLUMNUMOUMRUMSUMTUMYUNAUNBUNDUNEUNGUNLUNNUNOUNRUNVUNYUOCUOJUOMUORUOSUPAUPIUPLUPSUPTUQUURMURNUROURUURWUSAUSCUSDUSEUSGUSIUSKUSLUSMUSNUSOUSQUSRUSSUSTUSUUSVUSWUTAUTEUTGUTHUTIUTKUTLUTNUTOUTRUTSUTTUTWUTYUUGUUKUURUUZUVEUVIUVOUWAUWOUXHUYIUYOUZAUZHUZU" + "'", str15, "AAUABUAEUAFUAKUAMUANUARUASUAVUAYUAZUBAUBEUBGUBHUBIUBMUBNUBOUBRUBSUCAUCEUCHUCOUCRUCSUCUUCVUCYUDAUDEUDVUDZUEEUELUENUEOUESUETUEUUFAUFFUFIUFJUFOUFRUFYUGAUGDUGLUGNUGUUGVUHAUHEUHIUHOUHRUHTUHUUHYUHZUIAUIDUIEUIGUIIUIKUINUIOUISUITUIUUIWUJAUJIUJVUKAUKGUKIUKJUKKUKLUKMUKNUKOUKRUKSUKUUKVUKWUKYULAULBULGULIULNULOULTULUULVUMGUMHUMIUMKUMLUMNUMOUMRUMSUMTUMYUNAUNBUNDUNEUNGUNLUNNUNOUNRUNVUNYUOCUOJUOMUORUOSUPAUPIUPLUPSUPTUQUURMURNUROURUURWUSAUSCUSDUSEUSGUSIUSKUSLUSMUSNUSOUSQUSRUSSUSTUSUUSVUSWUTAUTEUTGUTHUTIUTKUTLUTNUTOUTRUTSUTTUTWUTYUUGUUKUURUUZUVEUVIUVOUWAUWOUXHUYIUYOUZAUZHUZU");
    }

    @Test
    public void test30064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30064");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test30065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30065");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("!_\\U0020_ITLE#########################################################################################", 'l');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test30066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30066");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("frnz\366sisch(Knd)", "ANGLAIS (ROYAUME-UNI)FRA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test30067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30067");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("##########################", "\\u000d", 48, 327);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "##########################\\u000d" + "'", str4, "##########################\\u000d");
    }

    @Test
    public void test30068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30068");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i", 104);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test30069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30069");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("UesUetUeuUfaUffUfiUfjUfoUfrUfyUgaUgdUglUgnUguUgvUhaUheUhiUhoUhrUhtUhu", "i\\u0020italianitalianitalianitaliit         \\xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test30070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30070");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("dallemandallemandallemandallemandallemandallemandallemandalle", "  aNIHc  ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test30071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30071");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDEDJDKDMDODZECEEEGEHERESETFIFJFKFMFOFRGAGBGDGEGFGGGHGIGLGMGNGPGQGRGSGTGUGWGYHKHMHNHRHTHUIDIEILIMINIOIQIRISITJEJMJOJPKEKGKHKIKMKNKPKRKWKYKZLALBLCLILKLRLSLTLULVLYMAMCMDMEMFMGMHMKMLMMMNMOMPMQMRMSMTMUMVMWMXMYMZNANCNENFNGNINLNONPNRNUNZOMPAPEPFPGPHPKPLPMPNPRPSPTPWPYQARERORSRURWSASBSCSDSESGSHSISJSKSLSMSNSOSRSSSTSVSXSYSZTCTDTFTGTHTJTKTLTMTNTOTRTTTVTWTZUAUGUMUSUYUZVAVCVEVGVIVNVUWFWSYEYTZAZMZ", "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\ub3c5\uc77c\uc5b4\r\r\r\r\rfra", "IIIIIIIIIIIn44444444444444alia44444444444444itIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDEDJDKDMDODZECEEEGEHERESETFIFJFKFMFOFRGAGBGDGEGFGGGHGIGLGMGNGPGQGRGSGTGUGWGYHKHMHNHRHTHUIDIEILIMINIOIQIRISITJEJMJOJPKEKGKHKIKMKNKPKRKWKYKZLALBLCLILKLRLSLTLULVLYMAMCMDMEMFMGMHMKMLMMMNMOMPMQMRMSMTMUMVMWMXMYMZNANCNENFNGNINLNONPNRNUNZOMPAPEPFPGPHPKPLPMPNPRPSPTPWPYQARERORSRURWSASBSCSDSESGSHSISJSKSLSMSNSOSRSSSTSVSXSYSZTCTDTFTGTHTJTKTLTMTNTOTRTTTVTWTZUAUGUMUSUYUZVAVCVEVGVIVNVUWFWSYEYTZAZMZ" + "'", str3, "ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDEDJDKDMDODZECEEEGEHERESETFIFJFKFMFOFRGAGBGDGEGFGGGHGIGLGMGNGPGQGRGSGTGUGWGYHKHMHNHRHTHUIDIEILIMINIOIQIRISITJEJMJOJPKEKGKHKIKMKNKPKRKWKYKZLALBLCLILKLRLSLTLULVLYMAMCMDMEMFMGMHMKMLMMMNMOMPMQMRMSMTMUMVMWMXMYMZNANCNENFNGNINLNONPNRNUNZOMPAPEPFPGPHPKPLPMPNPRPSPTPWPYQARERORSRURWSASBSCSDSESGSHSISJSKSLSMSNSOSRSSSTSVSXSYSZTCTDTFTGTHTJTKTLTMTNTOTRTTTVTWTZUAUGUMUSUYUZVAVCVEVGVIVNVUWFWSYEYTZAZMZ");
    }

    @Test
    public void test30072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30072");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "it44444444444444444en");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test30073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30073");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("..................jp", (double) 'd');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=100.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test30074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30074");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("e                               e                   ", "...                             xxxxxxxxxxxxxxxxxxtit...                             xxxxxxxxxxxxxxxxxxx");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "e                               e                   " + "'", str2, "e                               e                   ");
    }

    @Test
    public void test30075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30075");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.util.Locale locale1 = java.util.Locale.ITALIAN;
        java.lang.String str3 = locale1.getExtension('h');
        java.lang.String str4 = locale0.getDisplayScript(locale1);
        java.util.Locale locale5 = locale0.stripExtensions();
        java.lang.String str6 = locale5.getISO3Country();
        java.util.Locale locale10 = new java.util.Locale(" Italia  Italia  Italia  Italia  Italia  Italia  Italia DEUTSCH Italia  Italia  Italia  Italia  Italia  Italia  Italia  ", "8300u\\", "!ih!ih!ih!ih!ih!ih!ih!ih!ih!ihtedesco    !ih!ih!ih!ih!ih!ih!iJapanese");
        java.lang.String str11 = locale5.getDisplayName(locale10);
        java.lang.String str12 = locale10.getScript();
        java.util.Locale locale16 = new java.util.Locale("44444444444444444444444444444444!IH", "HHHHHHHHHH", "8ian\\u0020i86");
        java.util.Locale locale17 = java.util.Locale.ITALIAN;
        java.lang.String str18 = locale17.getDisplayLanguage();
        java.util.Locale locale19 = java.util.Locale.ITALIAN;
        java.lang.String str21 = locale19.getExtension('h');
        java.lang.String str22 = locale17.getDisplayCountry(locale19);
        java.lang.String str23 = locale19.toLanguageTag();
        java.lang.String str24 = locale16.getDisplayCountry(locale19);
        java.util.Locale locale25 = java.util.Locale.GERMANY;
        java.util.Locale locale26 = locale25.stripExtensions();
        java.lang.String str27 = locale25.getISO3Language();
        java.lang.String str28 = locale19.getDisplayScript(locale25);
        java.lang.String str29 = locale10.getDisplayLanguage(locale19);
        java.lang.String str30 = locale19.getISO3Country();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "it");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "FRA" + "'", str6, "FRA");
        org.junit.Assert.assertEquals(locale10.toString(), " italia  italia  italia  italia  italia  italia  italia deutsch italia  italia  italia  italia  italia  italia  italia  _8300U\\_!ih!ih!ih!ih!ih!ih!ih!ih!ih!ihtedesco    !ih!ih!ih!ih!ih!ih!iJapanese");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "French (France)" + "'", str11, "French (France)");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals(locale16.toString(), "44444444444444444444444444444444!ih_HHHHHHHHHH_8ian\\u0020i86");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "it");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Italian" + "'", str18, "Italian");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "it");
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "it" + "'", str23, "it");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "HHHHHHHHHH" + "'", str24, "HHHHHHHHHH");
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "de_DE");
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "deu" + "'", str27, "deu");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + " italia  italia  italia  italia  italia  italia  italia deutsch italia  italia  italia  italia  italia  italia  italia  " + "'", str29, " italia  italia  italia  italia  italia  italia  italia deutsch italia  italia  italia  italia  italia  italia  italia  ");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
    }

    @Test
    public void test30076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30076");
        boolean boolean1 = org.apache.commons.lang3.CharUtils.isAsciiAlphaUpper('J');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test30077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30077");
        char char2 = org.apache.commons.lang3.CharUtils.toChar((java.lang.Character) 'J', 'H');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + 'J' + "'", char2 == 'J');
    }

    @Test
    public void test30078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30078");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("hhhhhhhhhh", "bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbFRANZ\326SISCH (FRANKREICH)");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test30079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30079");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiir-FRAAAAAAAAAAAAAAAAAAAAAAAAAAA", "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rfr-CA\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiir-FRAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str2, "iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiir-FRAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test30080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30080");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("...LIAN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "NAIL..." + "'", str1, "NAIL...");
    }

    @Test
    public void test30081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30081");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("ZH_NGGGGG", (int) '9', (int) 'l');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test30082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30082");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale locale2 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str3 = locale2.getDisplayName();
        java.util.Locale.Builder builder4 = builder1.setLocale(locale2);
        java.util.Locale.Builder builder5 = builder4.clear();
        java.util.Locale.Builder builder7 = builder5.setLanguage("ITALIAN");
        java.util.Locale.Builder builder9 = builder7.setLanguage("FRA");
        java.util.Locale.Builder builder10 = builder7.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder12 = builder10.setLanguage("It_I");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: It_I [at index 0]");
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
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test30083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30083");
        char char2 = org.apache.commons.lang3.CharUtils.toChar((java.lang.Character) '5', '\ud504');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '5' + "'", char2 == '5');
    }

    @Test
    public void test30084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30084");
        boolean boolean1 = org.apache.commons.lang3.CharUtils.isAsciiPrintable('2');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test30085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30085");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                                                 Frnz\366sisch(Knd                                                 ", "NI         d00u\\00u\\ed00u\\00u\\ed00u\\G        ESELalhi!       _\\U0020_Italienisch####################################################################          andallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemand", (int) '\\');
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test30086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30086");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder2 = builder0.clear();
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale.Builder builder5 = builder0.setVariant("itTAiT_ITALIAN_EgAish");
        java.util.Locale.Builder builder6 = builder5.clearExtensions();
        java.util.Locale.Builder builder7 = builder6.clearExtensions();
        java.util.Locale locale8 = java.util.Locale.FRANCE;
        java.util.Locale locale9 = java.util.Locale.ITALIAN;
        java.lang.String str11 = locale9.getExtension('h');
        java.lang.String str12 = locale8.getDisplayScript(locale9);
        java.util.Locale locale13 = locale8.stripExtensions();
        java.lang.String str14 = locale13.getISO3Country();
        java.util.Locale locale16 = new java.util.Locale("en");
        boolean boolean17 = locale16.hasExtensions();
        java.util.Set<java.lang.String> strSet18 = locale16.getUnicodeLocaleKeys();
        java.lang.String str19 = locale13.getDisplayCountry(locale16);
        java.util.Locale.setDefault(locale13);
        java.lang.String str21 = locale13.getISO3Country();
        java.util.Locale.Builder builder22 = builder6.setLocale(locale13);
        java.util.Locale locale23 = builder22.build();
        java.util.Locale.Builder builder25 = builder22.setVariant("");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder28 = builder22.setUnicodeLocaleKeyword("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!frankreich!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!", "fr-CA");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!frankreich!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!! [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "it");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "FRA" + "'", str14, "FRA");
        org.junit.Assert.assertEquals(locale16.toString(), "en");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(strSet18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "France" + "'", str19, "France");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "FRA" + "'", str21, "FRA");
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(builder25);
    }

    @Test
    public void test30087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30087");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "                                                                       44d444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test30088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30088");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("TALY");
        double double2 = languageRange1.getWeight();
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("             HCSINEILATI             ", 'F');
        boolean boolean6 = languageRange1.equals((java.lang.Object) "             HCSINEILATI             ");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test30089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30089");
        java.util.Locale locale1 = new java.util.Locale("\\u0068");
        java.util.Locale locale2 = java.util.Locale.GERMAN;
        java.util.Locale locale3 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str4 = locale2.getDisplayName(locale3);
        java.util.Locale.Category category5 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale6 = java.util.Locale.getDefault(category5);
        java.lang.String str7 = locale3.getDisplayVariant(locale6);
        java.util.Locale locale8 = locale3.stripExtensions();
        boolean boolean9 = locale3.hasExtensions();
        java.lang.String str10 = locale3.getCountry();
        java.lang.String str11 = locale1.getDisplayCountry(locale3);
        java.lang.String str12 = locale3.toLanguageTag();
        boolean boolean13 = locale3.hasExtensions();
        org.junit.Assert.assertEquals(locale1.toString(), "\\u0068");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "de");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "allemand" + "'", str4, "allemand");
        org.junit.Assert.assertTrue("'" + category5 + "' != '" + java.util.Locale.Category.FORMAT + "'", category5.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "fr_CA");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "CA" + "'", str10, "CA");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "fr-CA" + "'", str12, "fr-CA");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test30090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30090");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("abbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbFRANZ\326SISCH (FRANKREICH)a", " ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(FRANKREICH)a" + "'", str2, "(FRANKREICH)a");
    }

    @Test
    public void test30091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30091");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "    \\XTALXAN_ITALIAN_ENGLXSH    R0                                               nailati             ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test30092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30092");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("German (Germany)", "AzhzhzhzhzhzhzhzhzhzhE             g", 3);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "\\u006e");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "German (Germany)" + "'", str5, "German (Germany)");
    }

    @Test
    public void test30093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30093");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder2 = builder1.clear();
        java.util.Locale locale6 = new java.util.Locale("", "");
        java.util.Locale locale7 = java.util.Locale.FRENCH;
        java.util.Locale locale8 = java.util.Locale.ENGLISH;
        java.lang.String str9 = locale8.getDisplayCountry();
        java.lang.String str10 = locale7.getDisplayVariant(locale8);
        java.lang.String str11 = locale7.getDisplayCountry();
        java.lang.String str12 = locale7.getScript();
        java.lang.String str13 = locale7.getScript();
        java.lang.String str14 = locale6.getDisplayCountry(locale7);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.upperCase("hzhzhzhzhzhzhzhzhzhzAhzSAhzRAhzQAhzOAhzNAh", locale7);
        java.util.Locale.Builder builder16 = builder2.setLocale(locale7);
        java.util.Locale.Builder builder17 = builder16.clear();
        java.util.Locale.Category category18 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale19 = java.util.Locale.getDefault(category18);
        java.util.Locale locale20 = java.util.Locale.GERMAN;
        java.util.Locale locale21 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str22 = locale20.getDisplayName(locale21);
        java.util.Locale.setDefault(category18, locale21);
        java.util.Locale locale26 = new java.util.Locale("\\u0020iTALIANiTALIANiTALIANiTALI\\u0020iTALIANiTALIANiTALIANiTAL", "allemand");
        java.util.Locale.setDefault(category18, locale26);
        java.util.Locale locale28 = java.util.Locale.getDefault(category18);
        java.util.Locale locale29 = java.util.Locale.GERMAN;
        java.util.Locale locale30 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str31 = locale29.getDisplayName(locale30);
        java.util.Locale.setDefault(locale30);
        java.util.Locale.setDefault(category18, locale30);
        java.util.Locale locale34 = java.util.Locale.CHINESE;
        java.util.Locale locale35 = java.util.Locale.FRENCH;
        java.lang.String str36 = locale35.getDisplayName();
        java.lang.String str38 = locale35.getExtension('C');
        java.lang.String str39 = locale34.getDisplayLanguage(locale35);
        java.lang.String str40 = locale34.getScript();
        java.util.Locale.setDefault(category18, locale34);
        java.util.Set<java.lang.String> strSet42 = locale34.getUnicodeLocaleAttributes();
        java.util.Locale.Builder builder43 = builder17.setLocale(locale34);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertEquals(locale6.toString(), "");
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
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "HZHZHZHZHZHZHZHZHZHZAHZSAHZRAHZQAHZOAHZNAH" + "'", str15, "HZHZHZHZHZHZHZHZHZHZAHZSAHZRAHZQAHZOAHZNAH");
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertTrue("'" + category18 + "' != '" + java.util.Locale.Category.FORMAT + "'", category18.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "de");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "allemand" + "'", str22, "allemand");
        org.junit.Assert.assertEquals(locale26.toString(), "\\u0020italianitalianitalianitali\\u0020italianitalianitalianital_ALLEMAND");
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "\\u0020italianitalianitalianitali\\u0020italianitalianitalianital_ALLEMAND");
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "de");
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "allemand" + "'", str31, "allemand");
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "zh");
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "fran\347ais" + "'", str36, "fran\347ais");
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "chinois" + "'", str39, "chinois");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertNotNull(strSet42);
        org.junit.Assert.assertNotNull(builder43);
    }

    @Test
    public void test30094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30094");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "                             de_de                                             ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test30095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30095");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("ffffffffffffffffffffffffffffffffFRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhAfffffffffffffffffffffffffffffffff");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=fffffffffffffffffffffffffffffffffraadzhaezhafzhagzhaizhalzhamzhanzhaozhaqzharzhaszhafffffffffffffffffffffffffffffffff");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test30096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30096");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale locale2 = builder0.build();
        java.util.Locale.Builder builder3 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder3.clear();
        java.util.Locale.Builder builder5 = builder3.clearExtensions();
        java.util.Locale.Builder builder6 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder7 = builder6.clearExtensions();
        java.util.Locale.Builder builder9 = builder6.setLanguageTag("Italian");
        java.util.Locale.Builder builder10 = builder6.clearExtensions();
        java.util.Locale.Builder builder11 = builder6.clear();
        java.util.Locale.Builder builder12 = builder6.clearExtensions();
        java.util.Locale locale13 = java.util.Locale.ITALIAN;
        java.lang.String str14 = locale13.getDisplayLanguage();
        java.util.Locale locale15 = locale13.stripExtensions();
        java.util.Locale locale17 = java.util.Locale.forLanguageTag("\\u0020");
        java.lang.String str18 = locale17.getDisplayScript();
        java.lang.String str19 = locale15.getDisplayCountry(locale17);
        java.util.Set<java.lang.Character> charSet20 = locale15.getExtensionKeys();
        java.util.Locale.Builder builder21 = builder6.setLocale(locale15);
        java.util.Locale locale23 = java.util.Locale.FRENCH;
        java.util.Locale locale24 = java.util.Locale.ENGLISH;
        java.lang.String str25 = locale24.getDisplayCountry();
        java.lang.String str26 = locale23.getDisplayVariant(locale24);
        java.lang.String str27 = locale23.getDisplayCountry();
        java.lang.String str28 = locale23.getScript();
        java.lang.String str29 = locale23.getScript();
        java.util.Locale locale30 = java.util.Locale.FRENCH;
        java.util.Locale locale31 = java.util.Locale.ENGLISH;
        java.lang.String str32 = locale31.getDisplayCountry();
        java.lang.String str33 = locale30.getDisplayVariant(locale31);
        java.lang.String str34 = locale30.getDisplayCountry();
        java.lang.String str35 = locale30.getScript();
        java.lang.String str36 = locale30.getScript();
        java.lang.String str37 = locale23.getDisplayCountry(locale30);
        java.lang.String str38 = org.apache.commons.lang3.StringUtils.upperCase("\\xtalxan_ITALIAN_Englxsh", locale30);
        java.lang.String str39 = locale30.getDisplayName();
        java.util.Locale locale40 = null;
        java.lang.String str41 = locale30.getDisplayVariant(locale40);
        java.util.Set<java.lang.String> strSet42 = locale30.getUnicodeLocaleKeys();
        java.lang.String str43 = locale15.getDisplayVariant(locale30);
        java.util.Locale.Builder builder44 = builder5.setLocale(locale15);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder46 = builder5.setRegion("Azhzhzhzhzhzhzhfrancais0(France)Azhzhzhzhzhzhzhzhzhzhfrancais0(France)Azhzhzhzhzhzhzhzhzhzhfrancais0cinese0(cina)Uu!!i9h..France)Azhzhzhzhzhzhzhzhzhzhfrancais0(France)Azhzhzhzhzhzhzhzhzhzhfrancais0(France)Azhzhzhzhzhzhzhzhzhzhfrancais0(France)Azhzhzhzhzhzhzhzhzhzhfrancais0(France)Azhzhzhzhzhzhzhzhzhzhfrancais0(France)Azhzhzhzhzhzhzhzhzhzhfrancais0(France)Azhzhzhzhzhzhzhzhzhzhfrancais0(France)Azhzhzhzhzhzhzhzhzhzhfrancais0(France)Azhzhzhzhzhzhzhzhzhzhfrancais0(France)Azhzhzhzhzhzhzhzhzhzhfrancais0(France)Azhzhzhzhzhzhzhzhzhzhfrancais0(France)Azhzhzhzhzhzhzhzhzhzhfrancais0(France)Azhzhzhzhzhzhzhzhzhzhfrancais0(France)Azhzhzhzhzhzhzhzhzhzhfrancais0(France)Azhzhzhzhzhzhzhzhzhzhfrancais0(France)Azhzhzhzhzhzhzhzhzhzhfrancais0(France)Azhzhzhzhzhzhzhzhzhzhfrancais0(France)Azhzhzhzhzhzhzhzhzhzhfrancais0(France)A");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: Azhzhzhzhzhzhzhfrancais0(France)Azhzhzhzhzhzhzhzhzhzhfrancais0(France)Azhzhzhzhzhzhzhzhzhzhfrancais0cinese0(cina)Uu!!i9h..France)Azhzhzhzhzhzhzhzhzhzhfrancais0(France)Azhzhzhzhzhzhzhzhzhzhfrancais0(France)Azhzhzhzhzhzhzhzhzhzhfrancais0(France)Azhzhzhzhzhzhzhzhzhzhfrancais0(France)Azhzhzhzhzhzhzhzhzhzhfrancais0(France)Azhzhzhzhzhzhzhzhzhzhfrancais0(France)Azhzhzhzhzhzhzhzhzhzhfrancais0(France)Azhzhzhzhzhzhzhzhzhzhfrancais0(France)Azhzhzhzhzhzhzhzhzhzhfrancais0(France)Azhzhzhzhzhzhzhzhzhzhfrancais0(France)Azhzhzhzhzhzhzhzhzhzhfrancais0(France)Azhzhzhzhzhzhzhzhzhzhfrancais0(France)Azhzhzhzhzhzhzhzhzhzhfrancais0(France)Azhzhzhzhzhzhzhzhzhzhfrancais0(France)Azhzhzhzhzhzhzhzhzhzhfrancais0(France)Azhzhzhzhzhzhzhzhzhzhfrancais0(France)Azhzhzhzhzhzhzhzhzhzhfrancais0(France)Azhzhzhzhzhzhzhzhzhzhfrancais0(France)A [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "it");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "italien" + "'", str14, "italien");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "it");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(charSet20);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "fr");
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "en");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "fr");
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "en");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "\\XTALXAN_ITALIAN_ENGLXSH" + "'", str38, "\\XTALXAN_ITALIAN_ENGLXSH");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "fran\347ais" + "'", str39, "fran\347ais");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertNotNull(strSet42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertNotNull(builder44);
    }

    @Test
    public void test30097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30097");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("E44444444444444444444444444444444!IHG44444444444444444444444444444444!IH44444444444444444444444444444444!IHSH", 'j');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "E44444444444444444444444444444444!IHG44444444444444444444444444444444!IH44444444444444444444444444444444!IHSH" + "'", str2, "E44444444444444444444444444444444!IHG44444444444444444444444444444444!IH44444444444444444444444444444444!IHSH");
    }

    @Test
    public void test30098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30098");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder2 = builder0.clear();
        java.util.Locale.Builder builder3 = builder2.clear();
        java.util.Locale locale4 = java.util.Locale.CHINESE;
        java.lang.String str5 = locale4.getCountry();
        java.util.Locale.Builder builder6 = builder3.setLocale(locale4);
        java.util.Locale.Builder builder8 = builder3.removeUnicodeLocaleAttribute("italy");
        java.util.Locale.Builder builder9 = builder8.clear();
        java.util.Locale.Builder builder10 = builder8.clearExtensions();
        java.util.Locale.Builder builder11 = builder8.clearExtensions();
        java.util.Locale locale12 = java.util.Locale.ENGLISH;
        java.util.Set<java.lang.Character> charSet13 = locale12.getExtensionKeys();
        java.lang.String str14 = locale12.toLanguageTag();
        java.util.Locale.Builder builder15 = builder11.setLocale(locale12);
        java.util.Set<java.lang.String> strSet16 = locale12.getUnicodeLocaleKeys();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "en");
        org.junit.Assert.assertNotNull(charSet13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "en" + "'", str14, "en");
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(strSet16);
    }

    @Test
    public void test30099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30099");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("                                                 fRNZ\326SISCH(kND                                                  ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=frnzo?sisch(knd");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test30100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30100");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale locale2 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str3 = locale2.getDisplayName();
        java.util.Locale.Builder builder4 = builder1.setLocale(locale2);
        java.util.Locale.Builder builder6 = builder1.setLanguage("und");
        java.util.Locale locale7 = builder6.build();
        java.util.Locale.Builder builder9 = builder6.setLanguage("fr");
        java.util.Locale.Category category10 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale12 = new java.util.Locale("\\u005c");
        java.util.Locale locale14 = java.util.Locale.CHINESE;
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.lowerCase("Franz\366sisch (Frankreich)", locale14);
        java.lang.String str16 = locale14.getVariant();
        java.lang.String str17 = locale12.getDisplayScript(locale14);
        java.util.Locale.setDefault(locale12);
        java.util.Locale.setDefault(category10, locale12);
        java.util.Locale locale21 = java.util.Locale.FRANCE;
        java.util.Locale locale22 = java.util.Locale.ITALIAN;
        java.lang.String str24 = locale22.getExtension('h');
        java.lang.String str25 = locale21.getDisplayScript(locale22);
        java.lang.String str26 = org.apache.commons.lang3.StringUtils.lowerCase("HI!       ", locale21);
        java.lang.String str28 = locale21.getExtension('z');
        java.util.Locale.setDefault(category10, locale21);
        java.util.Locale locale30 = java.util.Locale.ITALIAN;
        java.lang.String str31 = locale30.getDisplayLanguage();
        java.util.Locale locale32 = java.util.Locale.ITALIAN;
        java.lang.String str34 = locale32.getExtension('h');
        java.lang.String str35 = locale30.getDisplayCountry(locale32);
        java.util.Set<java.lang.String> strSet36 = locale32.getUnicodeLocaleKeys();
        java.util.Locale.setDefault(category10, locale32);
        java.util.Locale.Builder builder38 = builder6.setLocale(locale32);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder40 = builder38.removeUnicodeLocaleAttribute("en_ca");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: en_ca [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "fran\347ais (Canada)" + "'", str3, "fran\347ais (Canada)");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "und_CA");
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertTrue("'" + category10 + "' != '" + java.util.Locale.Category.FORMAT + "'", category10.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertEquals(locale12.toString(), "\\u005c");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "franz\366sisch (frankreich)" + "'", str15, "franz\366sisch (frankreich)");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "it");
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!       " + "'", str26, "hi!       ");
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "it");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Italian" + "'", str31, "Italian");
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "it");
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(strSet36);
        org.junit.Assert.assertNotNull(builder38);
    }

    @Test
    public void test30101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30101");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "a700u\\");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test30102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30102");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder2 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale.Builder builder4 = builder0.clear();
        java.util.Locale.Builder builder5 = builder4.clearExtensions();
        java.util.Locale.Builder builder6 = builder5.clear();
        java.util.Locale locale7 = java.util.Locale.ITALIAN;
        java.lang.String str8 = locale7.getDisplayLanguage();
        java.util.Locale locale9 = java.util.Locale.ITALIAN;
        java.lang.String str11 = locale9.getExtension('h');
        java.lang.String str12 = locale7.getDisplayCountry(locale9);
        java.lang.String str13 = locale9.toLanguageTag();
        java.lang.String str14 = locale9.getDisplayLanguage();
        java.util.Locale.Builder builder15 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder16 = builder15.clearExtensions();
        java.util.Locale locale17 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str18 = locale17.getDisplayName();
        java.util.Locale.Builder builder19 = builder16.setLocale(locale17);
        java.util.Locale locale20 = java.util.Locale.GERMANY;
        java.util.Locale.Builder builder21 = builder16.setLocale(locale20);
        java.util.Set<java.lang.String> strSet22 = locale20.getUnicodeLocaleAttributes();
        java.lang.String str23 = locale20.getVariant();
        java.util.Locale locale24 = locale20.stripExtensions();
        java.util.Locale locale25 = locale20.stripExtensions();
        java.lang.String str26 = locale9.getDisplayLanguage(locale25);
        java.lang.String str27 = locale25.getDisplayVariant();
        java.lang.String str28 = locale25.getDisplayCountry();
        java.util.Locale.Builder builder29 = builder6.setLocale(locale25);
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "it");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Italian" + "'", str8, "Italian");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "it");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "it" + "'", str13, "it");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Italian" + "'", str14, "Italian");
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "French (Canada)" + "'", str18, "French (Canada)");
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "de_DE");
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(strSet22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "de_DE");
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Italienisch" + "'", str26, "Italienisch");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Germany" + "'", str28, "Germany");
        org.junit.Assert.assertNotNull(builder29);
    }

    @Test
    public void test30103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30103");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("\\U0069cccccccccccccccccccccccccccccccceGSCHccccccccccccccccccccccccccccccccccccccccccccccccc");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\U0069cccccccccccccccccccccccccccccccceGSCHccccccccccccccccccccccccccccccccccccccccccccccccc" + "'", str1, "\\U0069cccccccccccccccccccccccccccccccceGSCHccccccccccccccccccccccccccccccccccccccccccccccccc");
    }

    @Test
    public void test30104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30104");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "                                                        it                         ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 83 + "'", int1 == 83);
    }

    @Test
    public void test30105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30105");
        java.util.Locale locale1 = java.util.Locale.FRANCE;
        java.util.Locale locale2 = java.util.Locale.ITALIAN;
        java.lang.String str4 = locale2.getExtension('h');
        java.lang.String str5 = locale1.getDisplayScript(locale2);
        java.util.Locale locale9 = new java.util.Locale("HI!       ", "\\U0020", "Italienisch#########################################################################################");
        java.lang.String str10 = locale1.getDisplayCountry(locale9);
        java.lang.String str11 = locale9.getDisplayName();
        java.lang.String str13 = locale9.getExtension('i');
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.upperCase("iTALIAN                                                                 ", locale9);
        java.lang.String str15 = locale9.getCountry();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "it");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals(locale9.toString(), "hi!       _\\U0020_Italienisch#########################################################################################");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "France" + "'", str10, "France");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!        (\\U0020,Italienisch#########################################################################################)" + "'", str11, "hi!        (\\U0020,Italienisch#########################################################################################)");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "ITALIAN                                                                 " + "'", str14, "ITALIAN                                                                 ");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\\U0020" + "'", str15, "\\U0020");
    }

    @Test
    public void test30106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30106");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("ESENIHC", "                                             de_de                                              ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test30107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30107");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("eZZZZZZZZZZZZZHCSINEILATIZZZZZZZZZZZZZgZZZZZZZZZZZZZHCSINEILATIZZZZZZZZZZZZZZZZZZZZZZZZZZHCSINEILATIZZZZZZZZZZZZZsh\\XT", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test30108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30108");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("ccccccccccccccccccccccccccccccccccccccccccccccc\\u00de\\u00ccccccccccccccccccccccccccccccccccccccccccccccc", "hi! _\\0020_Italienisch####################################################################");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test30109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30109");
        java.util.Locale.Category category0 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale1 = java.util.Locale.FRANCE;
        java.util.Locale locale2 = java.util.Locale.ITALIAN;
        java.lang.String str4 = locale2.getExtension('h');
        java.lang.String str5 = locale1.getDisplayScript(locale2);
        java.util.Set<java.lang.String> strSet6 = locale1.getUnicodeLocaleKeys();
        java.util.Locale.setDefault(category0, locale1);
        java.util.Set<java.lang.Character> charSet8 = locale1.getExtensionKeys();
        java.lang.String str9 = locale1.getScript();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "it");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNotNull(charSet8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test30110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30110");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("ranzosisch (Frankreich)kkkkkkkkkkkkkkkkkkk...ranzosisch (Frankreich)kkkkkkkkkk", "");
        boolean boolean4 = org.apache.commons.lang3.StringUtils.startsWithAny("EEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEE", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test30111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30111");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("italian\\U005(italian,english)", "                                                         HCSTUED                                                         ", 151);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test30112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30112");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("inglesehhhhhhhhH", 44);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "inglesehhhhhhhhH" + "'", str2, "inglesehhhhhhhhH");
    }

    @Test
    public void test30113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30113");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "9hhhhhhhhhh_\\U0078");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test30114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30114");
        java.util.Locale.Category category0 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale1 = java.util.Locale.getDefault(category0);
        java.util.Locale locale2 = java.util.Locale.getDefault(category0);
        java.util.Locale locale3 = java.util.Locale.getDefault(category0);
        java.util.Locale locale4 = java.util.Locale.getDefault(category0);
        java.util.Locale locale6 = java.util.Locale.forLanguageTag("und");
        java.lang.String str7 = locale6.getScript();
        java.util.Locale.setDefault(category0, locale6);
        java.util.Locale locale9 = java.util.Locale.getDefault(category0);
        java.util.Locale locale10 = java.util.Locale.getDefault(category0);
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "");
    }

    @Test
    public void test30115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30115");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("Azhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzh", "          ");
        boolean boolean4 = org.apache.commons.lang3.StringUtils.startsWithAny("                         fran\347                          ", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test30116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30116");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("GENCE", strMap1);
        java.util.Locale locale3 = java.util.Locale.US;
        java.lang.String str4 = locale3.getScript();
        java.util.Set<java.lang.String> strSet5 = locale3.getUnicodeLocaleAttributes();
        java.lang.String str6 = locale3.getCountry();
        java.util.Locale.setDefault(locale3);
        java.util.Locale locale9 = java.util.Locale.ENGLISH;
        java.lang.String str10 = locale9.getDisplayLanguage();
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.upperCase("!IH", locale9);
        java.lang.String str12 = locale9.getCountry();
        java.lang.String str13 = locale9.getCountry();
        java.lang.String str14 = locale3.getDisplayLanguage(locale9);
        java.util.Set<java.lang.String> strSet15 = locale3.getUnicodeLocaleKeys();
        java.lang.String str16 = java.util.Locale.lookupTag(languageRangeList2, (java.util.Collection<java.lang.String>) strSet15);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap17 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList18 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList2, strMap17);
        java.util.Locale locale19 = java.util.Locale.GERMAN;
        java.util.Locale locale20 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str21 = locale19.getDisplayName(locale20);
        java.util.Locale.Category category22 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale23 = java.util.Locale.getDefault(category22);
        java.lang.String str24 = locale20.getDisplayVariant(locale23);
        java.util.Locale locale25 = java.util.Locale.GERMAN;
        java.util.Locale locale26 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str27 = locale25.getDisplayName(locale26);
        java.util.Locale locale28 = java.util.Locale.UK;
        java.util.Locale locale29 = java.util.Locale.GERMAN;
        java.util.Locale locale30 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str31 = locale29.getDisplayName(locale30);
        java.util.Locale locale32 = locale29.stripExtensions();
        java.lang.String str33 = locale28.getDisplayVariant(locale29);
        java.lang.String str34 = locale26.getDisplayLanguage(locale29);
        java.lang.String str35 = locale23.getDisplayName(locale26);
        java.lang.String str36 = locale26.getDisplayVariant();
        java.lang.String str37 = locale26.getDisplayVariant();
        java.util.Set<java.lang.String> strSet38 = locale26.getUnicodeLocaleKeys();
        java.util.List<java.lang.String> strList39 = java.util.Locale.filterTags(languageRangeList2, (java.util.Collection<java.lang.String>) strSet38);
        org.junit.Assert.assertNotNull(languageRangeList2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "US" + "'", str6, "US");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "English" + "'", str10, "English");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "!IH" + "'", str11, "!IH");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "English" + "'", str14, "English");
        org.junit.Assert.assertNotNull(strSet15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(languageRangeList18);
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "de");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "allemand" + "'", str21, "allemand");
        org.junit.Assert.assertTrue("'" + category22 + "' != '" + java.util.Locale.Category.FORMAT + "'", category22.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "de");
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "allemand" + "'", str27, "allemand");
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "en_GB");
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "de");
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "allemand" + "'", str31, "allemand");
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "de");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Franz\366sisch" + "'", str34, "Franz\366sisch");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "anglais (Etats-Unis)" + "'", str35, "anglais (Etats-Unis)");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertNotNull(strSet38);
        org.junit.Assert.assertNotNull(strList39);
    }

    @Test
    public void test30117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30117");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("Ttat_itaTtat_itaTtat_itaTtat_itaTtat_itaTtat_itaTtat_itaTtat_itaTtat_itaTtat_itaTtat_itaTtat_itaTtat_itaTtat_itaTtat_itaTtat_itaTtat_itaTtat_itaTtat_itaTtat_itaTtat_itaTtat_itaTtat_itaTtat_itaTtat_itaTtat_itaTtat_itaTtat_ita", 37, '\u671d');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Ttat_itaTtat_itaTtat_itaTtat_itaTtat_itaTtat_itaTtat_itaTtat_itaTtat_itaTtat_itaTtat_itaTtat_itaTtat_itaTtat_itaTtat_itaTtat_itaTtat_itaTtat_itaTtat_itaTtat_itaTtat_itaTtat_itaTtat_itaTtat_itaTtat_itaTtat_itaTtat_itaTtat_ita" + "'", str3, "Ttat_itaTtat_itaTtat_itaTtat_itaTtat_itaTtat_itaTtat_itaTtat_itaTtat_itaTtat_itaTtat_itaTtat_itaTtat_itaTtat_itaTtat_itaTtat_itaTtat_itaTtat_itaTtat_itaTtat_itaTtat_itaTtat_itaTtat_itaTtat_itaTtat_itaTtat_itaTtat_itaTtat_ita");
    }

    @Test
    public void test30118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30118");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "4444allemand4444                                                        ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test30119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30119");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("zhazhzhzhzhzhzhzhzhzhzh_UND-CA", "gbr                                                                          ");
        boolean boolean4 = org.apache.commons.lang3.StringUtils.endsWithAny("FRANCESE (CANADA)", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test30120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30120");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzHSXLGNE_NAILATI_NAXLATX\\zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test30121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30121");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("deutsch", "\\\\\\\\\\\\\\HI!HI!", 97);
        boolean boolean5 = org.apache.commons.lang3.StringUtils.endsWithAny("Hhhhhhhhh", strArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, "f");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "deutsch" + "'", str7, "deutsch");
    }

    @Test
    public void test30122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30122");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("bgbgbgbgbgbgbgbgbgbgbgbgbgbgbgbgbgbgbgbgbgbgbgbgbgbgbgbgbgbgtalian");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, "\\u0020__AD4AE4AF4AG4AI4AL4AM4AN4AO4AQ4AR4AS4AT4AU4AW4AX4AZ4BA4BB4BD4BE4BF4BG4BH4BI4BJ4BL4BM4BN4BO4BQ4BR4BS4BT4BV4BW4BY4BZ4CA4CC4CD4CF4CG4CH4CI4CK4CL4CM4CN4CO4CR4CU4CV4CW4CX4CY4CZ4DE4DJ4DK4DM4DO4DZ4EC4EE4EG4EH4ER4ES4ET4FI4FJ4FK4FM4FO4FR4GA4GB4GD4GE4GF4GG4GH4GI4GL4GM4GN4GP4GQ4GR4GS4GT4GU4GW4GY4HK4HM4HN4HR4HT4HU4ID4IE4IL4IM4IN4IO4IQ4IR4IS4IT4JE4JM4JO4JP4KE4KG4KH4KI4KM4KN4KP4KR4KW4KY4KZ4LA4LB4LC4LI4LK4LR4LS4LT4LU4LV4LY4MA4MC4MD4ME4MF4MG4MH4MK4ML4MM4MN4MO4MP4MQ4MR4MS4MT4MU4MV4MW4MX4MY4MZ4NA4NC4NE4NF4NG4NI4NL4NO4NP4NR4NU4NZ4OM4PA4PE4PF4PG4PH4PK4PL4PM4PN4PR4PS4PT4PW4PY4QA4RE4RO4RS4RU4RW4SA4SB4SC4SD4SE4SG4SH4SI4SJ4SK4SL4SM4SN4SO4SR4SS4ST4SV4SX4SY4SZ4TC4TD4TF4TG4TH4TJ4TK4TL4TM4TN4TO4TR4TT4TV4TW4TZ4UA4UG4UM4US4UY4UZ4VA4VC4VE4VG4VI4VN4VU4WF4WS4YE4YT4ZA4ZM4ZW");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray1, "JapaneseCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC\\u00de\\u00CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "bgbgbgbgbgbgbgbgbgbgbgbgbgbgbgbgbgbgbgbgbgbgbgbgbgbgbgbgbgbgtalian" + "'", str3, "bgbgbgbgbgbgbgbgbgbgbgbgbgbgbgbgbgbgbgbgbgbgbgbgbgbgbgbgbgbgtalian");
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test30123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30123");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("\ud504\ub791\uc2a4\uc5b4\uce90\ub098\ub2e4)_EGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEG_                                                                    \\u0020iTALIAiTALIAiTALIAiTALI", "IAN\\U0020I", 48);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test30124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30124");
        java.util.Locale locale1 = java.util.Locale.FRANCE;
        java.util.Locale locale2 = java.util.Locale.ITALIAN;
        java.lang.String str4 = locale2.getExtension('h');
        java.lang.String str5 = locale1.getDisplayScript(locale2);
        java.util.Locale locale6 = locale1.stripExtensions();
        java.lang.String str7 = locale6.getISO3Country();
        java.util.Locale locale9 = new java.util.Locale("en");
        boolean boolean10 = locale9.hasExtensions();
        java.util.Set<java.lang.String> strSet11 = locale9.getUnicodeLocaleKeys();
        java.lang.String str12 = locale6.getDisplayCountry(locale9);
        java.util.Locale locale14 = new java.util.Locale("en");
        boolean boolean15 = locale14.hasExtensions();
        java.lang.String str16 = locale9.getDisplayCountry(locale14);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.lowerCase("Frnz\366sisch (Knd)", locale9);
        java.lang.String str18 = locale9.getDisplayLanguage();
        java.lang.String str19 = locale9.getDisplayScript();
        java.util.Locale locale22 = new java.util.Locale("\\u0045", "");
        java.util.Set<java.lang.String> strSet23 = locale22.getUnicodeLocaleAttributes();
        java.lang.String str24 = locale22.getLanguage();
        java.lang.String str25 = locale22.getVariant();
        java.util.Locale locale30 = new java.util.Locale("\\u0023", "Italienisch", "iTALIAN");
        java.lang.String str31 = locale30.getDisplayVariant();
        java.lang.String str32 = locale30.getDisplayCountry();
        java.util.Locale locale33 = locale30.stripExtensions();
        java.lang.String str34 = org.apache.commons.lang3.StringUtils.upperCase("Italien", locale33);
        java.lang.String str35 = locale22.getDisplayLanguage(locale33);
        java.lang.String str36 = locale9.getDisplayCountry(locale33);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str38 = locale33.getUnicodeLocaleType("                                                         HSILGNHeH_HnailatiH_HNAILATIH         ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key:                                                          HSILGNHeH_HnailatiH_HNAILATIH         ");
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
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "FRA" + "'", str7, "FRA");
        org.junit.Assert.assertEquals(locale9.toString(), "en");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "France" + "'", str12, "France");
        org.junit.Assert.assertEquals(locale14.toString(), "en");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "frnz\366sisch (knd)" + "'", str17, "frnz\366sisch (knd)");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "English" + "'", str18, "English");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals(locale22.toString(), "\\u0045");
        org.junit.Assert.assertNotNull(strSet23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "\\u0045" + "'", str24, "\\u0045");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals(locale30.toString(), "\\u0023_ITALIENISCH_iTALIAN");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "iTALIAN" + "'", str31, "iTALIAN");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "ITALIENISCH" + "'", str32, "ITALIENISCH");
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "\\u0023_ITALIENISCH_iTALIAN");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "ITALIEN" + "'", str34, "ITALIEN");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "\\u0045" + "'", str35, "\\u0045");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
    }

    @Test
    public void test30125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30125");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("Italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test30126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30126");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("German", "Franz\366sisc");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Germ" + "'", str2, "Germ");
    }

    @Test
    public void test30127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30127");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rzh_cn", "444444444444444444444444444!IHSH");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test30128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30128");
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
        java.util.Locale locale13 = java.util.Locale.ITALIAN;
        java.lang.String str14 = locale13.getDisplayLanguage();
        java.util.Locale locale15 = java.util.Locale.ITALIAN;
        java.lang.String str17 = locale15.getExtension('h');
        java.lang.String str18 = locale13.getDisplayCountry(locale15);
        java.util.Set<java.lang.String> strSet19 = locale15.getUnicodeLocaleKeys();
        java.util.Set<java.lang.String> strSet20 = locale15.getUnicodeLocaleKeys();
        java.lang.String str21 = locale11.getDisplayVariant(locale15);
        java.util.Set<java.lang.Character> charSet22 = locale15.getExtensionKeys();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "French (Canada)" + "'", str3, "French (Canada)");
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
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "it");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\u610f\u5927\u5229\u6587" + "'", str14, "\u610f\u5927\u5229\u6587");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "it");
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(strSet19);
        org.junit.Assert.assertNotNull(strSet20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(charSet22);
    }

    @Test
    public void test30129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30129");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("                   deutsch                    ", "FranzosischFranz\366sisch (Kanada)(Frankreich)");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                   deutsch                    " + "'", str2, "                   deutsch                    ");
    }

    @Test
    public void test30130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30130");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("\\FranzosischFranzosisch(Frankreich)0034\\FranzosischFranzosisch(Frankreich)00hFranzosischFranzosisch(Frankreich)\\FranzosischFranzosisch(Frankreich)0034\\FranzosischFranzosisch(Frankreich)00(\\U0020IITALIAN\\U0020I)", "ese (cina)italianitalianitalianitalH          2cinese (cina)italianitalianitalianitalfR          2cin");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test30131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30131");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfBlank("italian(italian,eng", "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rFRANZ...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "italian(italian,eng" + "'", str2, "italian(italian,eng");
    }

    @Test
    public void test30132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30132");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("ttfr-c                 ttttttt", "EAGAASH                                                                                                                                                                                                                                                                                                                                                                                                    ", "hsiAE_NAILATI_TiATtiHI!_NAILATI         HSILGNe_nailati_NAILATI         HHHHHHHHH");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ttfr-cAAAAAAAAAAAAAAAAAttttttt" + "'", str3, "ttfr-cAAAAAAAAAAAAAAAAAttttttt");
    }

    @Test
    public void test30133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30133");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("fRANZ\326SISC");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "fRANZ\326SISC" + "'", str1, "fRANZ\326SISC");
    }

    @Test
    public void test30134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30134");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("und");
        java.lang.String str2 = locale1.getScript();
        java.lang.String str3 = locale1.getDisplayLanguage();
        java.lang.String str4 = locale1.getDisplayName();
        java.lang.String str5 = locale1.getVariant();
        boolean boolean6 = locale1.hasExtensions();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test30135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30135");
        java.util.Locale locale0 = java.util.Locale.FRENCH;
        java.util.Locale locale1 = java.util.Locale.ENGLISH;
        java.lang.String str2 = locale1.getDisplayCountry();
        java.lang.String str3 = locale0.getDisplayVariant(locale1);
        java.lang.String str4 = locale1.getDisplayVariant();
        java.util.Locale locale6 = java.util.Locale.forLanguageTag("\\u0020");
        java.lang.String str7 = locale6.getDisplayScript();
        java.util.Locale.setDefault(locale6);
        java.lang.String str9 = locale6.getScript();
        java.lang.String str10 = locale1.getDisplayCountry(locale6);
        java.util.Locale locale11 = java.util.Locale.FRENCH;
        java.util.Locale locale12 = java.util.Locale.ENGLISH;
        java.lang.String str13 = locale12.getDisplayCountry();
        java.lang.String str14 = locale11.getDisplayVariant(locale12);
        java.lang.String str15 = locale11.getDisplayCountry();
        java.lang.String str16 = locale11.getScript();
        java.lang.String str17 = locale11.getScript();
        java.util.Locale locale18 = java.util.Locale.FRENCH;
        java.util.Locale locale19 = java.util.Locale.ENGLISH;
        java.lang.String str20 = locale19.getDisplayCountry();
        java.lang.String str21 = locale18.getDisplayVariant(locale19);
        java.lang.String str22 = locale18.getDisplayCountry();
        java.lang.String str23 = locale18.getScript();
        java.lang.String str24 = locale18.getScript();
        java.lang.String str25 = locale11.getDisplayCountry(locale18);
        java.util.Locale.Category category26 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale27 = java.util.Locale.getDefault(category26);
        java.util.Locale locale28 = java.util.Locale.FRANCE;
        java.util.Locale locale29 = java.util.Locale.ITALIAN;
        java.lang.String str31 = locale29.getExtension('h');
        java.lang.String str32 = locale28.getDisplayScript(locale29);
        java.lang.String str33 = locale28.getISO3Country();
        java.util.Locale locale34 = java.util.Locale.GERMAN;
        java.util.Locale.setDefault(locale34);
        java.lang.String str36 = locale28.getDisplayName(locale34);
        java.lang.String str37 = locale28.getScript();
        java.util.Locale.setDefault(category26, locale28);
        java.lang.String str39 = locale11.getDisplayCountry(locale28);
        java.util.Locale locale41 = java.util.Locale.GERMAN;
        java.util.Locale locale42 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str43 = locale41.getDisplayName(locale42);
        java.util.Locale.setDefault(locale42);
        java.lang.String str45 = org.apache.commons.lang3.StringUtils.upperCase("8600u\\                                                                                                                  ", locale42);
        java.lang.String str46 = locale42.getDisplayName();
        java.lang.String str47 = locale28.getDisplayScript(locale42);
        java.lang.String str48 = locale1.getDisplayLanguage(locale28);
        java.util.Set<java.lang.Character> charSet49 = locale28.getExtensionKeys();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
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
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "fr");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "en");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + category26 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category26.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "");
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "it");
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "FRA" + "'", str33, "FRA");
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "de");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Franz\366sisch (Frankreich)" + "'", str36, "Franz\366sisch (Frankreich)");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNotNull(locale41);
        org.junit.Assert.assertEquals(locale41.toString(), "de");
        org.junit.Assert.assertNotNull(locale42);
        org.junit.Assert.assertEquals(locale42.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "allemand" + "'", str43, "allemand");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "8600U\\                                                                                                                  " + "'", str45, "8600U\\                                                                                                                  ");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "fran\347ais (Canada)" + "'", str46, "fran\347ais (Canada)");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "anglais" + "'", str48, "anglais");
        org.junit.Assert.assertNotNull(charSet49);
    }

    @Test
    public void test30136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30136");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC", "         ITALIAN_italian_eNGLISH         ITALIAN_!IHitTAiT_ITALIAN_EgAish", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test30137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30137");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("an\\u00", 713);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test30138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30138");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("FranzosischFranzosisch (Frankreich)", "hcsineilati", 92);
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "                                                       HI!                                                              ");
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, " tli                                                               ");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "FranzosischFranzosisch (Frankreich)" + "'", str7, "FranzosischFranzosisch (Frankreich)");
    }

    @Test
    public void test30139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30139");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "FRNZ\326SISCH (KND)");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test30140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30140");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("                                      )HSILGNE,NAILATI( ", "anglais (Etats-Unis)", 574, (int) '-');
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "                                      )HSILGNanglais (Etats-Unis)" + "'", str4, "                                      )HSILGNanglais (Etats-Unis)");
    }

    @Test
    public void test30141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30141");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxESENIHC");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxESENIHC" + "'", str1, "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxESENIHC");
    }

    @Test
    public void test30142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30142");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale locale2 = builder0.build();
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale.Builder builder6 = builder0.setExtension('z', "EAGAASH");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder8 = builder0.setScript("hzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzh");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: hzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzh [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test30143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30143");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale locale2 = java.util.Locale.FRANCE;
        java.util.Locale locale3 = java.util.Locale.ITALIAN;
        java.lang.String str5 = locale3.getExtension('h');
        java.lang.String str6 = locale2.getDisplayScript(locale3);
        java.util.Locale locale7 = locale2.stripExtensions();
        java.util.Locale locale8 = java.util.Locale.getDefault();
        java.lang.String str9 = locale8.getLanguage();
        java.lang.String str10 = locale2.getDisplayCountry(locale8);
        java.lang.String str11 = locale8.toLanguageTag();
        java.lang.String str12 = locale8.getDisplayLanguage();
        java.util.Locale.Builder builder13 = builder0.setLocale(locale8);
        java.util.Locale.Category category14 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale15 = java.util.Locale.getDefault(category14);
        java.util.Locale locale16 = java.util.Locale.FRANCE;
        java.util.Locale locale17 = java.util.Locale.ITALIAN;
        java.lang.String str19 = locale17.getExtension('h');
        java.lang.String str20 = locale16.getDisplayScript(locale17);
        java.lang.String str21 = locale16.getISO3Country();
        java.util.Locale locale22 = java.util.Locale.GERMAN;
        java.util.Locale.setDefault(locale22);
        java.lang.String str24 = locale16.getDisplayName(locale22);
        java.lang.String str25 = locale16.getScript();
        java.util.Locale.setDefault(category14, locale16);
        java.lang.String str27 = locale16.getScript();
        java.util.Locale.Builder builder28 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder29 = builder28.clearExtensions();
        java.util.Locale locale30 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str31 = locale30.getDisplayName();
        java.util.Locale.Builder builder32 = builder29.setLocale(locale30);
        java.util.Locale.Builder builder34 = builder29.setLanguage("und");
        java.util.Locale locale35 = builder34.build();
        java.lang.String str36 = locale16.getDisplayVariant(locale35);
        java.lang.String str37 = locale16.getISO3Language();
        java.util.Locale locale38 = java.util.Locale.CHINESE;
        java.lang.String str39 = locale38.getCountry();
        java.util.Locale locale41 = java.util.Locale.forLanguageTag("FRANZ\326SISCH");
        java.lang.String str42 = locale38.getDisplayScript(locale41);
        java.util.Set<java.lang.String> strSet43 = locale38.getUnicodeLocaleAttributes();
        java.lang.String str44 = locale16.getDisplayVariant(locale38);
        java.lang.String str45 = locale8.getDisplayCountry(locale38);
        java.lang.Object obj46 = locale38.clone();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "it");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "fr" + "'", str9, "fr");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "France" + "'", str10, "France");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "fr-CA" + "'", str11, "fr-CA");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "fran\347ais" + "'", str12, "fran\347ais");
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertTrue("'" + category14 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category14.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "fr_CA");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "it");
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "FRA" + "'", str21, "FRA");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "de");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Franz\366sisch (Frankreich)" + "'", str24, "Franz\366sisch (Frankreich)");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "fran\347ais (Canada)" + "'", str31, "fran\347ais (Canada)");
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "und_CA");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "fra" + "'", str37, "fra");
        org.junit.Assert.assertNotNull(locale38);
        org.junit.Assert.assertEquals(locale38.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNotNull(locale41);
        org.junit.Assert.assertEquals(locale41.toString(), "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertNotNull(strSet43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "\u52a0\u62ff\u5927" + "'", str45, "\u52a0\u62ff\u5927");
        org.junit.Assert.assertNotNull(obj46);
        org.junit.Assert.assertEquals(obj46.toString(), "zh");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj46), "zh");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj46), "zh");
    }

    @Test
    public void test30144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30144");
        java.util.Locale.Builder builder1 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder1.clearExtensions();
        java.util.Locale.Builder builder4 = builder1.setLanguageTag("Italian");
        java.util.Locale locale5 = java.util.Locale.PRC;
        java.lang.String str6 = locale5.getDisplayName();
        java.util.Locale.Builder builder7 = builder1.setLocale(locale5);
        java.util.Locale.Builder builder8 = builder7.clear();
        java.util.Locale locale9 = java.util.Locale.KOREAN;
        java.util.Locale.Builder builder10 = builder8.setLocale(locale9);
        java.util.Locale locale11 = builder8.build();
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.upperCase("ECANADAgCANADACANADAsh", locale11);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chinois (Chine)" + "'", str6, "chinois (Chine)");
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "ko");
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "ECANADAGCANADACANADASH" + "'", str12, "ECANADAGCANADACANADASH");
    }

    @Test
    public void test30145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30145");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("nailati", strMap1);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap3 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList4 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList2, strMap3);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap5 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList6 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList4, strMap5);
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
        java.util.Locale.LanguageRange[] languageRangeArray20 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList21 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList21, languageRangeArray20);
        java.lang.String[] strArray25 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList26 = new java.util.ArrayList<java.lang.String>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList26, strArray25);
        java.util.Locale.FilteringMode filteringMode28 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList29 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList21, (java.util.Collection<java.lang.String>) strList26, filteringMode28);
        java.util.Locale.FilteringMode filteringMode30 = java.util.Locale.FilteringMode.AUTOSELECT_FILTERING;
        java.util.List<java.lang.String> strList31 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList18, (java.util.Collection<java.lang.String>) strList26, filteringMode30);
        java.util.Collection<java.util.Locale> localeCollection32 = null;
        java.util.List<java.util.Locale> localeList33 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList18, localeCollection32);
        java.util.Locale locale34 = java.util.Locale.lookup(languageRangeList9, (java.util.Collection<java.util.Locale>) localeList33);
        java.util.Locale locale35 = java.util.Locale.lookup(languageRangeList4, (java.util.Collection<java.util.Locale>) localeList33);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap36 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList37 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList4, strMap36);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap38 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList39 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList37, strMap38);
        java.util.Collection<java.lang.String> strCollection40 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str41 = java.util.Locale.lookupTag(languageRangeList37, strCollection40);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(languageRangeList2);
        org.junit.Assert.assertNotNull(languageRangeList4);
        org.junit.Assert.assertNotNull(languageRangeList6);
        org.junit.Assert.assertNotNull(languageRangeList9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "it");
        org.junit.Assert.assertNotNull(charSet11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "italien" + "'", str13, "italien");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(strSet15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(languageRangeArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(languageRangeArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + filteringMode28 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode28.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList29);
        org.junit.Assert.assertTrue("'" + filteringMode30 + "' != '" + java.util.Locale.FilteringMode.AUTOSELECT_FILTERING + "'", filteringMode30.equals(java.util.Locale.FilteringMode.AUTOSELECT_FILTERING));
        org.junit.Assert.assertNotNull(strList31);
        org.junit.Assert.assertNotNull(localeList33);
        org.junit.Assert.assertNull(locale34);
        org.junit.Assert.assertNull(locale35);
        org.junit.Assert.assertNotNull(languageRangeList37);
        org.junit.Assert.assertNotNull(languageRangeList39);
    }

    @Test
    public void test30146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30146");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "Frnz\366sisch (Knd)Frnz\366sisch (Knd)Frnz\366sisch (Knd)Frnz\366sisch (Knd)Frnz\366sisch (Knd)Frnz\366sisch (Knd)Frnz\366sisch (Knd)Frnz\366sisch (Knd)Frnz\366sisch (Knd)Frnz\366sisch (Knd)Frnz\366sisch (Knd)");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test30147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30147");
        java.lang.String str1 = org.apache.commons.lang3.CharUtils.toString((java.lang.Character) 'J');
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "J" + "'", str1, "J");
    }

    @Test
    public void test30148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30148");
        java.util.Locale locale1 = new java.util.Locale("\\u005c");
        java.util.Locale locale3 = java.util.Locale.CHINESE;
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.lowerCase("Franz\366sisch (Frankreich)", locale3);
        java.lang.String str5 = locale3.getVariant();
        java.lang.String str6 = locale1.getDisplayScript(locale3);
        java.lang.String str8 = locale1.getExtension('C');
        java.lang.String str9 = locale1.getDisplayScript();
        java.lang.String str10 = locale1.getScript();
        java.lang.String str11 = locale1.getLanguage();
        java.lang.String str12 = locale1.getDisplayCountry();
        org.junit.Assert.assertEquals(locale1.toString(), "\\u005c");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "franz\366sisch (frankreich)" + "'", str4, "franz\366sisch (frankreich)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\\u005c" + "'", str11, "\\u005c");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test30149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30149");
        char[] charArray10 = new char[] { ' ', '4' };
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "HI!", charArray10);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!", charArray10);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsAny("deutsch", charArray10);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "!_\\u0020_iTLE#####################################!_\\u0020_iTLE######################################", charArray10);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "\\u0061ItalienischItalienischItalienischItalienischItalienischItalienischItalienischItalienischItalie", charArray10);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "hi!iiiiiii_\\U0020_Italienisch#########################################################################################", charArray10);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "                                h                                 ", charArray10);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "\\u0034\\u00                                             hcstued                                             \\u0034\\u00", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[ , 4]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test30150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30150");
        java.util.Locale locale1 = new java.util.Locale("U");
        java.lang.String str3 = locale1.getExtension('t');
        org.junit.Assert.assertEquals(locale1.toString(), "u");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test30151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30151");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase(" hi!       _\\U0020_Italienisch####################################################################            ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test30152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30152");
        java.util.Locale locale1 = new java.util.Locale("b");
        java.lang.Object obj2 = locale1.clone();
        org.junit.Assert.assertEquals(locale1.toString(), "b");
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals(obj2.toString(), "b");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj2), "b");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj2), "b");
    }

    @Test
    public void test30153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30153");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("Deutsch");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test30154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30154");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("hsiAgE_NAILATI_TiATtiHI!_NAILATI         HSILGNe_nailati_NAILATI         HHHHHHHHH", 'g');
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, " hi!       _\\U0020_Italienisch####################################################################           ");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test30155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30155");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("Etats-Unis");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Etats-Unis" + "'", str2, "Etats-Unis");
    }

    @Test
    public void test30156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30156");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale locale2 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str3 = locale2.getDisplayName();
        java.util.Locale.Builder builder4 = builder1.setLocale(locale2);
        java.util.Locale.Builder builder5 = builder1.clear();
        java.util.Locale.Builder builder6 = builder5.clear();
        java.util.Locale.Builder builder8 = builder5.setLanguage("zh");
        java.util.Locale locale9 = builder8.build();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder11 = builder8.setRegion("aaaaaaaaaaaaaaaaaaaaaaaaaaAnihCaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaAC");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: aaaaaaaaaaaaaaaaaaaaaaaaaaAnihCaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaAC [at index 0]");
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
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "zh");
    }

    @Test
    public void test30157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30157");
        java.util.Locale.Category category0 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale1 = java.util.Locale.getDefault(category0);
        java.util.Locale locale2 = java.util.Locale.FRANCE;
        java.util.Locale locale3 = java.util.Locale.ITALIAN;
        java.lang.String str5 = locale3.getExtension('h');
        java.lang.String str6 = locale2.getDisplayScript(locale3);
        java.lang.String str7 = locale2.getISO3Country();
        java.util.Locale locale8 = java.util.Locale.GERMAN;
        java.util.Locale.setDefault(locale8);
        java.lang.String str10 = locale2.getDisplayName(locale8);
        java.lang.String str11 = locale2.getScript();
        java.util.Locale.setDefault(category0, locale2);
        java.lang.String str13 = locale2.getScript();
        java.util.Locale.Builder builder14 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder15 = builder14.clearExtensions();
        java.util.Locale locale16 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str17 = locale16.getDisplayName();
        java.util.Locale.Builder builder18 = builder15.setLocale(locale16);
        java.util.Locale.Builder builder20 = builder15.setLanguage("und");
        java.util.Locale locale21 = builder20.build();
        java.lang.String str22 = locale2.getDisplayVariant(locale21);
        java.lang.String str23 = locale2.getISO3Language();
        java.util.Locale locale24 = java.util.Locale.CHINESE;
        java.lang.String str25 = locale24.getCountry();
        java.util.Locale locale27 = java.util.Locale.forLanguageTag("FRANZ\326SISCH");
        java.lang.String str28 = locale24.getDisplayScript(locale27);
        java.util.Set<java.lang.String> strSet29 = locale24.getUnicodeLocaleAttributes();
        java.lang.String str30 = locale2.getDisplayVariant(locale24);
        java.lang.String str31 = locale24.toString();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "it");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "FRA" + "'", str7, "FRA");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "de");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Franz\366sisch (Frankreich)" + "'", str10, "Franz\366sisch (Frankreich)");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "fran\347ais (Canada)" + "'", str17, "fran\347ais (Canada)");
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "und_CA");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "fra" + "'", str23, "fra");
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(strSet29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "zh" + "'", str31, "zh");
    }

    @Test
    public void test30158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30158");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "                                                                                 INGLESE        ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test30159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30159");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("    ", "h########################################################################################");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test30160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30160");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("ian\\u0020", "aaaaaaaaaaaaaaaaaaaaaaaaaaILATiNA...aaaaaaaaaaaaaaaaaaaaaaaaaa");
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("de", "itTAiT_ITALIAN_EgAish");
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.concatWith("4", (java.lang.Object[]) strArray9);
        java.lang.String[] strArray16 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("", "Deutsch");
        java.lang.String[] strArray18 = org.apache.commons.lang3.StringUtils.stripAll(strArray16, "franz\366sisch (frankreich)");
        boolean boolean19 = org.apache.commons.lang3.StringUtils.startsWithAny("ENGLISCH", strArray18);
        int int20 = org.apache.commons.lang3.StringUtils.indexOfAny("itTAiT_ITA", strArray18);
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.concatWith("franz\366sisch (frankreich)", (java.lang.Object[]) strArray18);
        java.lang.String str22 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("anihC", strArray9, strArray18);
        java.lang.String str23 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("ADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhATzhAUzhAWzhAXzhAZzhBAzhBBzhBDzhBEzhBFzhBGzhBHzhBIzhBJzhBLzhBMzhBNzhBOzhBQzhBRzhBSzhBTzhBVzhBWzhBYzhBZzhCAzhCCzhCDzhCFzhCGzhCHzhCIzhCKzhCLzhCMzhCNzhCOzhCRzhCUzhCVzhCWzhCXzhCYzhCZzhDEzhDJzhDKzhDMzhDOzhDZzhECzhEEzhEGzhEHzhERzhESzhETzhFIzhFJzhFKzhFMzhFOzhFRzhGAzhGBzhGDzhGEzhGFzhGGzhGHzhGIzhGLzhGMzhGNzhGPzhGQzhGRzhGSzhGTzhGUzhGWzhGYzhHKzhHMzhHNzhHRzhHTzhHUzhIDzhIEzhILzhIMzhINzhIOzhIQzhIRzhISzhITzhJEzhJMzhJOzhJPzhKEzhKGzhKHzhKIzhKMzhKNzhKPzhKRzhKWzhKYzhKZzhLAzhLBzhLCzhLIzhLKzhLRzhLSzhLTzhLUzhLVzhLYzhMAzhMCzhMDzhMEzhMFzhMGzhMHzhMKzhMLzhMMzhMNzhMOzhMPzhMQzhMRzhMSzhMTzhMUzhMVzhMWzhMXzhMYzhMZzhNAzhNCzhNEzhNFzhNGzhNIzhNLzhNOzhNPzhNRzhNUzhNZzhOMzhPAzhPEzhPFzhPGzhPHzhPKzhPLzhPMzhPNzhPRzhPSzhPTzhPWzhPYzhQAzhREzhROzhRSzhRUzhRWzhSAzhSBzhSCzhSDzhSEzhSGzhSHzhSIzhSJzhSKzhSLzhSMzhSNzhSOzhSRzhSSzhSTzhSVzhSXzhSYzhSZzhTCzhTDzhTFzhTGzhTHzhTJzhTKzhTLzhTMzhTNzhTOzhTRzhTTzhTVzhTWzhTZzhUAzhUGzhUMzhUSzhUYzhUZzhVAzhVCzhVEzhVGzhVIzhVNzhVUzhWFzhWSzhYEzhYTzhZAzhZMzhZW", strArray4, strArray9);
        boolean boolean24 = org.apache.commons.lang3.StringUtils.endsWithAny("f_KOREAN", strArray4);
        java.lang.String str25 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "de" + "'", str10, "de");
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "anihC" + "'", str22, "anihC");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "ADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhATzhAUzhAWzhAXzhAZzhBAzhBBzhBDzhBEzhBFzhBGzhBHzhBIzhBJzhBLzhBMzhBNzhBOzhBQzhBRzhBSzhBTzhBVzhBWzhBYzhBZzhCAzhCCzhCDzhCFzhCGzhCHzhCIzhCKzhCLzhCMzhCNzhCOzhCRzhCUzhCVzhCWzhCXzhCYzhCZzhDEzhDJzhDKzhDMzhDOzhDZzhECzhEEzhEGzhEHzhERzhESzhETzhFIzhFJzhFKzhFMzhFOzhFRzhGAzhGBzhGDzhGEzhGFzhGGzhGHzhGIzhGLzhGMzhGNzhGPzhGQzhGRzhGSzhGTzhGUzhGWzhGYzhHKzhHMzhHNzhHRzhHTzhHUzhIDzhIEzhILzhIMzhINzhIOzhIQzhIRzhISzhITzhJEzhJMzhJOzhJPzhKEzhKGzhKHzhKIzhKMzhKNzhKPzhKRzhKWzhKYzhKZzhLAzhLBzhLCzhLIzhLKzhLRzhLSzhLTzhLUzhLVzhLYzhMAzhMCzhMDzhMEzhMFzhMGzhMHzhMKzhMLzhMMzhMNzhMOzhMPzhMQzhMRzhMSzhMTzhMUzhMVzhMWzhMXzhMYzhMZzhNAzhNCzhNEzhNFzhNGzhNIzhNLzhNOzhNPzhNRzhNUzhNZzhOMzhPAzhPEzhPFzhPGzhPHzhPKzhPLzhPMzhPNzhPRzhPSzhPTzhPWzhPYzhQAzhREzhROzhRSzhRUzhRWzhSAzhSBzhSCzhSDzhSEzhSGzhSHzhSIzhSJzhSKzhSLzhSMzhSNzhSOzhSRzhSSzhSTzhSVzhSXzhSYzhSZzhTCzhTDzhTFzhTGzhTHzhTJzhTKzhTLzhTMzhTNzhTOzhTRzhTTzhTVzhTWzhTZzhUAzhUGzhUMzhUSzhUYzhUZzhVAzhVCzhVEzhVGzhVIzhVNzhVUzhWFzhWSzhYEzhYTzhZAzhZMzhZW" + "'", str23, "ADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhATzhAUzhAWzhAXzhAZzhBAzhBBzhBDzhBEzhBFzhBGzhBHzhBIzhBJzhBLzhBMzhBNzhBOzhBQzhBRzhBSzhBTzhBVzhBWzhBYzhBZzhCAzhCCzhCDzhCFzhCGzhCHzhCIzhCKzhCLzhCMzhCNzhCOzhCRzhCUzhCVzhCWzhCXzhCYzhCZzhDEzhDJzhDKzhDMzhDOzhDZzhECzhEEzhEGzhEHzhERzhESzhETzhFIzhFJzhFKzhFMzhFOzhFRzhGAzhGBzhGDzhGEzhGFzhGGzhGHzhGIzhGLzhGMzhGNzhGPzhGQzhGRzhGSzhGTzhGUzhGWzhGYzhHKzhHMzhHNzhHRzhHTzhHUzhIDzhIEzhILzhIMzhINzhIOzhIQzhIRzhISzhITzhJEzhJMzhJOzhJPzhKEzhKGzhKHzhKIzhKMzhKNzhKPzhKRzhKWzhKYzhKZzhLAzhLBzhLCzhLIzhLKzhLRzhLSzhLTzhLUzhLVzhLYzhMAzhMCzhMDzhMEzhMFzhMGzhMHzhMKzhMLzhMMzhMNzhMOzhMPzhMQzhMRzhMSzhMTzhMUzhMVzhMWzhMXzhMYzhMZzhNAzhNCzhNEzhNFzhNGzhNIzhNLzhNOzhNPzhNRzhNUzhNZzhOMzhPAzhPEzhPFzhPGzhPHzhPKzhPLzhPMzhPNzhPRzhPSzhPTzhPWzhPYzhQAzhREzhROzhRSzhRUzhRWzhSAzhSBzhSCzhSDzhSEzhSGzhSHzhSIzhSJzhSKzhSLzhSMzhSNzhSOzhSRzhSSzhSTzhSVzhSXzhSYzhSZzhTCzhTDzhTFzhTGzhTHzhTJzhTKzhTLzhTMzhTNzhTOzhTRzhTTzhTVzhTWzhTZzhUAzhUGzhUMzhUSzhUYzhUZzhVAzhVCzhVEzhVGzhVIzhVNzhVUzhWFzhWSzhYEzhYTzhZAzhZMzhZW");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "ian\\u0020" + "'", str25, "ian\\u0020");
    }

    @Test
    public void test30161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30161");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiCHN", "", "IAN\\U0020I");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiCHN" + "'", str3, "iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiCHN");
    }

    @Test
    public void test30162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30162");
        java.util.Locale locale3 = new java.util.Locale("HI!       ", "\\U0020", "Italienisch#########################################################################################");
        java.util.Locale locale4 = locale3.stripExtensions();
        java.util.Locale locale5 = locale4.stripExtensions();
        java.lang.String str6 = locale5.getVariant();
        java.lang.String str7 = locale5.toLanguageTag();
        java.lang.String str8 = locale5.getLanguage();
        java.util.Locale locale9 = java.util.Locale.FRENCH;
        java.util.Locale locale10 = java.util.Locale.ENGLISH;
        java.lang.String str11 = locale10.getDisplayCountry();
        java.lang.String str12 = locale9.getDisplayVariant(locale10);
        java.lang.String str13 = locale9.getDisplayCountry();
        java.lang.String str14 = locale9.getScript();
        java.lang.String str15 = locale9.getScript();
        java.util.Locale locale16 = java.util.Locale.FRENCH;
        java.util.Locale locale17 = java.util.Locale.ENGLISH;
        java.lang.String str18 = locale17.getDisplayCountry();
        java.lang.String str19 = locale16.getDisplayVariant(locale17);
        java.lang.String str20 = locale16.getDisplayCountry();
        java.lang.String str21 = locale16.getScript();
        java.lang.String str22 = locale16.getScript();
        java.lang.String str23 = locale9.getDisplayCountry(locale16);
        java.util.Locale.Category category24 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale25 = java.util.Locale.getDefault(category24);
        java.util.Locale locale26 = java.util.Locale.FRANCE;
        java.util.Locale locale27 = java.util.Locale.ITALIAN;
        java.lang.String str29 = locale27.getExtension('h');
        java.lang.String str30 = locale26.getDisplayScript(locale27);
        java.lang.String str31 = locale26.getISO3Country();
        java.util.Locale locale32 = java.util.Locale.GERMAN;
        java.util.Locale.setDefault(locale32);
        java.lang.String str34 = locale26.getDisplayName(locale32);
        java.lang.String str35 = locale26.getScript();
        java.util.Locale.setDefault(category24, locale26);
        java.lang.String str37 = locale9.getDisplayCountry(locale26);
        java.util.Locale locale39 = java.util.Locale.GERMAN;
        java.util.Locale locale40 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str41 = locale39.getDisplayName(locale40);
        java.util.Locale.setDefault(locale40);
        java.lang.String str43 = org.apache.commons.lang3.StringUtils.upperCase("8600u\\                                                                                                                  ", locale40);
        java.lang.String str44 = locale40.getDisplayName();
        java.lang.String str45 = locale26.getDisplayScript(locale40);
        java.util.Locale locale46 = java.util.Locale.FRANCE;
        java.util.Locale locale47 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str48 = locale46.getDisplayScript(locale47);
        java.lang.String str49 = locale40.getDisplayVariant(locale46);
        java.lang.String str50 = locale5.getDisplayLanguage(locale40);
        org.junit.Assert.assertEquals(locale3.toString(), "hi!       _\\U0020_Italienisch#########################################################################################");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "hi!       _\\U0020_Italienisch#########################################################################################");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "hi!       _\\U0020_Italienisch#########################################################################################");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Italienisch#########################################################################################" + "'", str6, "Italienisch#########################################################################################");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "und" + "'", str7, "und");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!       " + "'", str8, "hi!       ");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "fr");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "fr");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "en");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + category24 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category24.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "it");
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "FRA" + "'", str31, "FRA");
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "de");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Franz\366sisch (Frankreich)" + "'", str34, "Franz\366sisch (Frankreich)");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertNotNull(locale39);
        org.junit.Assert.assertEquals(locale39.toString(), "de");
        org.junit.Assert.assertNotNull(locale40);
        org.junit.Assert.assertEquals(locale40.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "allemand" + "'", str41, "allemand");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "8600U\\                                                                                                                  " + "'", str43, "8600U\\                                                                                                                  ");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "fran\347ais (Canada)" + "'", str44, "fran\347ais (Canada)");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertNotNull(locale46);
        org.junit.Assert.assertEquals(locale46.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale47);
        org.junit.Assert.assertEquals(locale47.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "hi!       " + "'", str50, "hi!       ");
    }

    @Test
    public void test30163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30163");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("44444444444444444444444444444444                                       ", 'b');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test30164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30164");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("FR_CA                             ...!       \\U0034\\U0034\\U0034\\U0034\\U0034\\U0034\\U0034\\U0034\\U0034\\     ", "4300U\\                                             DUTSCH                                            ", 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "FR_CA                             ...!       \\U0034\\U0034\\U0034\\U0034\\U0034\\U0034\\U0034\\U0034\\U0034\\     " + "'", str3, "FR_CA                             ...!       \\U0034\\U0034\\U0034\\U0034\\U0034\\U0034\\U0034\\U0034\\U0034\\     ");
    }

    @Test
    public void test30165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30165");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("fran\347ais(france)(CHINESE(CHINA)", "TALIAN_ITALIAN_ENGLISH         ITALIAN_!IHITTAIT_ITALIAN_EGAISH");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test30166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30166");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("Frnz\366sisch(Knd)", "eAGAAS");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test30167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30167");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfBlank("HHHHHHHHHH", "\\u0020iIalian\\u008600u\\U\\u0020iIalian\\u0020iUanglaisUFRZ\326CZ(FRKREC)Uialian    U                                                                                                      U!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IUzhzhzhzhzhzhzhzhzhzhFRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhAzhzhzhzhzhzhzhzhzhzhUFRZ\326CZ(FRKREC)Ucinese (Cina)\\u0069hhhhhhhhhh\\u0069hhhhhhhhhh\\u0069hhhhhhhhhh\\u0069hhU         ITALIAN_ITALIAN_ENGLISH         ITALIAN_!IHITTAIT_ITALIAN_EGAISHU                                      ...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HHHHHHHHHH" + "'", str2, "HHHHHHHHHH");
    }

    @Test
    public void test30168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30168");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("E             g                          sh", "italien", 92);
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "ITALIAN_ITALIAN_ENGLISH", (int) (short) 0, (int) 'R');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "E             g                          sh" + "'", str5, "E             g                          sh");
    }

    @Test
    public void test30169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30169");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("\\                                               NAILATI                                              ", 215, 'j');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "jjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjj\\                                               NAILATI                                              " + "'", str3, "jjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjj\\                                               NAILATI                                              ");
    }

    @Test
    public void test30170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30170");
        char[] charArray7 = new char[] { 'f', '4' };
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "Chinese (China)", charArray7);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "\\u0061ItalifnischItalifnischItalifnischItalifnischItalifnischItalifnischItalifnischItalifnischItalif", charArray7);
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "Hhhhhhhhh", charArray7);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "Chinesisch (China)", charArray7);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!_\\u0020_italienisch#########################################################################################", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "f4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "f4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[f, 4]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test30171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30171");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "\\u0062");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test30172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30172");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("France", "...ANiTALI", (int) (short) -1);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray4);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.split("italieitalNC_hz\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\ritalieital", '9');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.replaceEach("Italienisch", strArray4, strArray8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray8, 't', (int) 'R', (int) 'i');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 82");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "France" + "'", str5, "France");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Italienisch" + "'", str9, "Italienisch");
    }

    @Test
    public void test30173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30173");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("FRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhA             FRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhA             FRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhA             FRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhA23", "\\u0064", 55);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test30174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30174");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "ITALIE", (java.lang.CharSequence) "ITALIAN (italian,eNGLISH)");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
    }

    @Test
    public void test30175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30175");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale locale2 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str3 = locale2.getDisplayName();
        java.util.Locale.Builder builder4 = builder1.setLocale(locale2);
        java.util.Locale.Builder builder6 = builder1.setLanguage("und");
        java.util.Locale locale7 = builder6.build();
        java.util.Locale locale8 = builder6.build();
        java.util.Locale.Builder builder9 = builder6.clear();
        java.util.Locale.Builder builder11 = builder6.addUnicodeLocaleAttribute("44d444");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder13 = builder6.addUnicodeLocaleAttribute("");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute:  [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test30176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30176");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("    ZH_CN    ", "00000000000000coreen (coree du sud)");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test30177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30177");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("hzhzhzhzhzhzhzhzhzhzAhzSAhzRAhzQAhzOAhzNA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hzhzhzhzhzhzhzhzhzhzAhzSAhzRAhzQAhzOAhzNA" + "'", str1, "hzhzhzhzhzhzhzhzhzhzAhzSAhzRAhzQAhzOAhzNA");
    }

    @Test
    public void test30178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30178");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterType("a)AAAAAAAAAAAAAAAAAAAAAAAAAAHIAN\\U0020IHa)AAAAAAAAAAAAAAAAAAAAAAAAAA");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2);
        int int4 = org.apache.commons.lang3.StringUtils.indexOfAny("talian", strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "a)AAAAAAAAAAAAAAAAAAAAAAAAAAHIAN\\U0020IHa)AAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str3, "a)AAAAAAAAAAAAAAAAAAAAAAAAAAHIAN\\U0020IHa)AAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test30179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30179");
        java.util.Locale locale1 = java.util.Locale.FRANCE;
        java.util.Locale locale2 = java.util.Locale.ITALIAN;
        java.lang.String str4 = locale2.getExtension('h');
        java.lang.String str5 = locale1.getDisplayScript(locale2);
        java.util.Locale locale9 = new java.util.Locale("HI!       ", "\\U0020", "Italienisch#########################################################################################");
        java.lang.String str10 = locale1.getDisplayCountry(locale9);
        java.lang.String str11 = locale9.getDisplayName();
        java.lang.String str12 = locale9.getDisplayCountry();
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.lowerCase("hic!", locale9);
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "it");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals(locale9.toString(), "hi!       _\\U0020_Italienisch#########################################################################################");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "France" + "'", str10, "France");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!        (\\U0020,Italienisch#########################################################################################)" + "'", str11, "hi!        (\\U0020,Italienisch#########################################################################################)");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\\U0020" + "'", str12, "\\U0020");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hic!" + "'", str13, "hic!");
    }

    @Test
    public void test30180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30180");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("                                                                                         fr-", "         ITALIAN_italian_eNGLISH         ITALIAN_!IH");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test30181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30181");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("francesefrancesefrancesefr\\u0075francesefrancesefrancesefr\\u0075francesefrancesefrancesefr\\u0075francesefrancesefrancTI", (double) 28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=28.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test30182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30182");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("\\u005");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test30183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30183");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("hhhhhhhhhhhhhhhhhhh", "BFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEKoreanADA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "BFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEKoreanADA" + "'", str2, "BFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEKoreanADA");
    }

    @Test
    public void test30184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30184");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("    \\XTALXAN_ITALIAN_ENGLXSH    R0                                               nailati             ", "                 ", 804);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test30185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30185");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("44444444444444444444444444444444!ihaaaaaaaaaaaaaaaaaaaaaaaafranz\366sisch (frankreich)aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 92);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44444444444444444444444444444444!ihaaaaaaaaaaaaaaaaaaaaaaaafranz\366sisch (frankreich)aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "44444444444444444444444444444444!ihaaaaaaaaaaaaaaaaaaaaaaaafranz\366sisch (frankreich)aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test30186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30186");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfBlank("esenihc", "\u1111\u1173\u1105\u1161\u11bc\u1109\u1173\u110b\u1165\u110f\u1162\u1102\u1161\u1103\u1161)_EGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEG_                                                                    \\u0020iTALIAiTALIAiTALIAiTALI");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "esenihc" + "'", str2, "esenihc");
    }

    @Test
    public void test30187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30187");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("ad4ae4af4ag4ai4al4am4an4ao4aq4ar4as4at4au4aw4ax4az4ba4bb4bd4be4bf4bg4bh4bi4bj4bl4bm4bn4bo4bq4br4bs4bt4bv4bw...r-fraaaaaaaaaaaaaaaaaaaaaaaaaaar-fraaaaaaaaaaaaaaaaaaaaaaaaaaar-fraaaaaaaaaaaaaaaaaaaaaaaaaaar-fraaaaaaaaaaaaaaaaaaaaaaaaaaar-fraaaaaaaaaaaaaaaaaaaaaaaaaaar-fraaaaaaaaaaaaaaaaaaaaaaaaaaar-fraaaaaaaaaaaaaaaaaaaaaaaaaaar-fraaaaaaaaaaaaaaaaaaaaaaaaaaar-fraaaaaaaaaaaaaaaaaaaaaaaaaaar-fraaaaaaaaaaaaaaaaaaaaaaaaaaar-fraaaaaaaaaaaaaaaaaaaaaaaaaaar-fraaaaaaaaaaaaaaaaaaaaaaaaaaar-fraaaaaaaaaaaaaaaaaaaaaaaaaaar-fraaaaaaaaaaaaaaaaaaaaaaaaaaar-fraaaaaaaaaaaaaaaaaaaaaaaaaaar-fraaaaaaaaaaaaaaaaaaaaaaaaaaar-fraaaaaaaaaaaaaaaaaaaaaaaaaaar-fraaaaaaaaaaaaaaaaaaaaaaaaaaar-fraaaaaaaaaaaaaaaaaaaaaaaaaaar-fraaaaaaaaaaaaaaaaa", "\u610f\u5927\u5229");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test30188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30188");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("anglais (Etats-Unis)", (int) '.', 'g');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ggggggggggggganglais (Etats-Unis)ggggggggggggg" + "'", str3, "ggggggggggggganglais (Etats-Unis)ggggggggggggg");
    }

    @Test
    public void test30189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30189");
        java.util.Locale locale2 = java.util.Locale.forLanguageTag("France");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.upperCase("inglese", locale2);
        java.lang.String str4 = locale2.getVariant();
        java.util.Locale locale5 = locale2.stripExtensions();
        java.lang.Object obj6 = locale2.clone();
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "france");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "INGLESE" + "'", str3, "INGLESE");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "france");
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertEquals(obj6.toString(), "france");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj6), "france");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj6), "france");
    }

    @Test
    public void test30190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30190");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("Eallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmand", 73, "                                                                             frn\347is(frnce)(CHINESE(CHINA)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Eallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmand" + "'", str3, "Eallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmand");
    }

    @Test
    public void test30191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30191");
        java.util.Locale locale1 = new java.util.Locale("2aiTALIANiTALIANiTALIANiTAL");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = locale1.getISO3Language();
            org.junit.Assert.fail("Expected exception of type java.util.MissingResourceException; message: Couldn't find 3-letter language code for 2aitalianitalianitalianital");
        } catch (java.util.MissingResourceException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(locale1.toString(), "2aitalianitalianitalianital");
    }

    @Test
    public void test30192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30192");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("AnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihC", (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "C" + "'", str2, "C");
    }

    @Test
    public void test30193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30193");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("         ITALIAN_italian_eNGLISH         ITALIAN_!IH");
        java.lang.String str2 = locale1.getDisplayScript();
        java.lang.String str3 = locale1.getDisplayLanguage();
        java.util.Locale locale5 = java.util.Locale.KOREA;
        java.lang.String str6 = locale5.getVariant();
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.upperCase("Canada", locale5);
        java.lang.String str8 = locale5.getDisplayName();
        java.lang.String str9 = locale1.getDisplayVariant(locale5);
        java.lang.Object obj10 = locale1.clone();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "CANADA" + "'", str7, "CANADA");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "cor\351en (Cor\351e du Sud)" + "'", str8, "cor\351en (Cor\351e du Sud)");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertEquals(obj10.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj10), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj10), "");
    }

    @Test
    public void test30194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30194");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("                                  !ih                            dalleman                                  !ih                            dalleman                                  !ih                            dalleman                                  !ih                            dalleman                                  !ih                            dalleman                                  !ih                            dalleman                                  !ih                            dalleman                ZH_CNGGGGG", "2iT hi!       _\\U0020_Italienisch####################################################################            2iT");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test30195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30195");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "Frnz\366sisch(Knd", "AD  \\u007a");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test30196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30196");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("\u82f1\u6587\u82f1\u6587\u82f1\u6587\u82f1\u6587TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTaaaaaaaaaaaaaaaaaaaaaaaaFranz\366sisch(Frankreich)aaaaaaaaaaaaaaaaaaaaaaaa", 405, 67);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test30197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30197");
        java.lang.CharSequence charSequence1 = null;
        char[] charArray11 = new char[] { ' ', '4' };
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "HI!", charArray11);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!", charArray11);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "h", charArray11);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "44444444444444NAILATI44444444444444", charArray11);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "zh_CN", charArray11);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "         italian_ITALIAN_English", charArray11);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "french (canada)", charArray11);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAnyBut(charSequence1, charArray11);
        int int20 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "ZHO                               44\\u002344  \\u0020iTALIANiTALIANiTALIANiTALI", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[ , 4]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test30198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30198");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC\\xtalxan_ITALIAN_EnglxshCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC", "\\u0039                             ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC\\xtalxan_ITALIAN_EnglxshCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC" + "'", str2, "CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC\\xtalxan_ITALIAN_EnglxshCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC");
    }

    @Test
    public void test30199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30199");
        java.util.Locale locale1 = java.util.Locale.CHINA;
        java.util.Locale locale2 = locale1.stripExtensions();
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.upperCase("\\u0047", locale1);
        java.lang.String str4 = locale1.getISO3Language();
        java.util.Locale.setDefault(locale1);
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\U0047" + "'", str3, "\\U0047");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "zho" + "'", str4, "zho");
    }

    @Test
    public void test30200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30200");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad(" zhAzhzhzhzhzhzhzhzhzhzh ", 71);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " zhAzhzhzhzhzhzhzhzhzhzh                                               " + "'", str2, " zhAzhzhzhzhzhzhzhzhzhzh                                               ");
    }

    @Test
    public void test30201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30201");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("2cinese (Cina)iTALIANiTALIANiTALIANiTAL", 25);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test30202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30202");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast(" nailati             ", "kkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkEDkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkEDkk");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " nailati             " + "'", str2, " nailati             ");
    }

    @Test
    public void test30203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30203");
        char[] charArray10 = new char[] { ' ', '4' };
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "HI!", charArray10);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!", charArray10);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "h", charArray10);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "h", charArray10);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "iTALIAN", charArray10);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "FRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFR", charArray10);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "de", charArray10);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "ccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccc  E                         IIT L, t          ", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[ , 4]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test30204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30204");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("E                               ", "!       2ITALIANITALIANITALIANITALItalienisch2Iadaeafagaialamanaoaqarasaauawaxazbabb", 32);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test30205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30205");
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
        java.util.Collection<java.util.Locale> localeCollection15 = null;
        java.util.List<java.util.Locale> localeList16 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, localeCollection15);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap17 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList18 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap17);
        java.util.List<java.util.Locale.LanguageRange> languageRangeList20 = java.util.Locale.LanguageRange.parse("en");
        java.util.Locale.Builder builder22 = new java.util.Locale.Builder();
        java.util.Locale locale23 = builder22.build();
        java.util.Locale locale25 = java.util.Locale.forLanguageTag("Italian");
        java.lang.String str26 = locale23.getDisplayLanguage(locale25);
        java.lang.String str27 = org.apache.commons.lang3.StringUtils.upperCase("", locale25);
        java.lang.String str28 = locale25.getScript();
        java.util.Set<java.lang.String> strSet29 = locale25.getUnicodeLocaleAttributes();
        java.util.Set<java.lang.String> strSet30 = locale25.getUnicodeLocaleKeys();
        java.util.List<java.lang.String> strList31 = java.util.Locale.filterTags(languageRangeList20, (java.util.Collection<java.lang.String>) strSet30);
        java.util.Locale.Builder builder32 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder33 = builder32.clearExtensions();
        java.util.Locale locale34 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str35 = locale34.getDisplayName();
        java.util.Locale.Builder builder36 = builder33.setLocale(locale34);
        java.util.Locale locale37 = java.util.Locale.GERMANY;
        java.util.Locale.Builder builder38 = builder33.setLocale(locale37);
        java.util.Set<java.lang.String> strSet39 = locale37.getUnicodeLocaleAttributes();
        java.lang.String str40 = locale37.getDisplayName();
        java.util.Locale locale44 = new java.util.Locale("HI!       ", "\\U0020", "Italienisch#########################################################################################");
        java.util.Locale locale45 = locale44.stripExtensions();
        java.util.Locale locale46 = locale45.stripExtensions();
        java.util.Locale.setDefault(locale45);
        java.lang.String str48 = locale37.getDisplayName(locale45);
        java.util.Set<java.lang.String> strSet49 = locale37.getUnicodeLocaleAttributes();
        java.util.List<java.lang.String> strList50 = java.util.Locale.filterTags(languageRangeList20, (java.util.Collection<java.lang.String>) strSet49);
        java.util.List<java.lang.String> strList51 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strList50);
        java.lang.String str53 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.lang.String>) strList51, "                                  \\u005c                                                         ");
        java.lang.String str55 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.lang.String>) strList51, 'f');
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
        org.junit.Assert.assertNotNull(localeList16);
        org.junit.Assert.assertNotNull(languageRangeList18);
        org.junit.Assert.assertNotNull(languageRangeList20);
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "");
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "italian");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(strSet29);
        org.junit.Assert.assertNotNull(strSet30);
        org.junit.Assert.assertNotNull(strList31);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "fr_CA");
// flaky:         org.junit.Assert.assertEquals("'" + str35 + "' != '" + "\u6cd5\u6587\u52a0\u62ff\u5927)" + "'", str35, "\u6cd5\u6587\u52a0\u62ff\u5927)");
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNotNull(locale37);
        org.junit.Assert.assertEquals(locale37.toString(), "de_DE");
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertNotNull(strSet39);
// flaky:         org.junit.Assert.assertEquals("'" + str40 + "' != '" + "\u5fb7\u6587\u5fb7\u56fd)" + "'", str40, "\u5fb7\u6587\u5fb7\u56fd)");
        org.junit.Assert.assertEquals(locale44.toString(), "hi!       _\\U0020_Italienisch#########################################################################################");
        org.junit.Assert.assertNotNull(locale45);
        org.junit.Assert.assertEquals(locale45.toString(), "hi!       _\\U0020_Italienisch#########################################################################################");
        org.junit.Assert.assertNotNull(locale46);
        org.junit.Assert.assertEquals(locale46.toString(), "hi!       _\\U0020_Italienisch#########################################################################################");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "German (Germany)" + "'", str48, "German (Germany)");
        org.junit.Assert.assertNotNull(strSet49);
        org.junit.Assert.assertNotNull(strList50);
        org.junit.Assert.assertNotNull(strList51);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
    }

    @Test
    public void test30206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30206");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.setLanguageTag("Italian");
        java.util.Locale.Builder builder4 = builder0.clearExtensions();
        java.util.Locale.Builder builder5 = builder0.clear();
        java.util.Locale locale7 = java.util.Locale.forLanguageTag("\\u0020");
        java.util.Locale.Builder builder8 = builder0.setLocale(locale7);
        java.util.Locale.Builder builder9 = builder8.clear();
        java.util.Locale.Builder builder10 = builder8.clearExtensions();
        java.util.Locale.Category category11 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale12 = java.util.Locale.getDefault(category11);
        java.util.Locale locale13 = java.util.Locale.GERMAN;
        java.util.Locale locale14 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str15 = locale13.getDisplayName(locale14);
        java.util.Locale.setDefault(category11, locale14);
        java.util.Locale.Category category17 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale18 = java.util.Locale.getDefault(category17);
        java.lang.String str20 = locale18.getExtension('x');
        java.util.Locale.setDefault(category11, locale18);
        java.util.Locale.Builder builder22 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder23 = builder22.clearExtensions();
        java.util.Locale.Builder builder25 = builder22.setLanguageTag("Italian");
        java.util.Locale locale26 = java.util.Locale.PRC;
        java.lang.String str27 = locale26.getDisplayName();
        java.util.Locale.Builder builder28 = builder22.setLocale(locale26);
        java.util.Locale.Builder builder29 = builder28.clear();
        java.util.Locale locale30 = java.util.Locale.KOREAN;
        java.util.Locale.Builder builder31 = builder29.setLocale(locale30);
        java.lang.String str32 = locale30.getDisplayName();
        java.util.Locale.setDefault(category11, locale30);
        java.util.Locale.Builder builder34 = builder8.setLocale(locale30);
        java.util.Locale locale36 = new java.util.Locale("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaTtat_itaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        java.util.Set<java.lang.Character> charSet37 = locale36.getExtensionKeys();
        java.lang.String str38 = locale30.getDisplayCountry(locale36);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "");
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertTrue("'" + category11 + "' != '" + java.util.Locale.Category.FORMAT + "'", category11.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "hi!       _\\U0020_Italienisch#########################################################################################");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "de");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "allemand" + "'", str15, "allemand");
        org.junit.Assert.assertTrue("'" + category17 + "' != '" + java.util.Locale.Category.FORMAT + "'", category17.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "fr_CA");
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Chinese (China)" + "'", str27, "Chinese (China)");
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "ko");
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Korean" + "'", str32, "Korean");
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertEquals(locale36.toString(), "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaattat_itaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertNotNull(charSet37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
    }

    @Test
    public void test30207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30207");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("E");
        java.lang.String str2 = languageRange1.getRange();
        double double3 = languageRange1.getWeight();
        double double4 = languageRange1.getWeight();
        java.lang.String str5 = languageRange1.getRange();
        java.lang.String str6 = languageRange1.getRange();
        boolean boolean8 = languageRange1.equals((java.lang.Object) 216);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "e" + "'", str2, "e");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "e" + "'", str5, "e");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "e" + "'", str6, "e");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test30208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30208");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "aaaaaaaaaaaaaaaaDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEU\\u0061aaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test30209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30209");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("EagaashUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU", "\\u00de\\u00\\u\\u00de\\u00\\u", "FRA");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "EagaashUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU" + "'", str3, "EagaashUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU");
    }

    @Test
    public void test30210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30210");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhfr-ca (                                      )hsilgne,nailati( )", "tali...an");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test30211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30211");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)", "ITALIAN_ITALIAN_ENGLISF");
        int int4 = org.apache.commons.lang3.StringUtils.indexOfAny("Korean (South Kor", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test30212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30212");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("deutsch");
        double double2 = languageRange1.getWeight();
        double double3 = languageRange1.getWeight();
        double double4 = languageRange1.getWeight();
        double double5 = languageRange1.getWeight();
        java.lang.String str6 = languageRange1.getRange();
        double double7 = languageRange1.getWeight();
        java.lang.String str8 = languageRange1.getRange();
        double double9 = languageRange1.getWeight();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "deutsch" + "'", str6, "deutsch");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "deutsch" + "'", str8, "deutsch");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
    }

    @Test
    public void test30213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30213");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("Ttat_ita", '\r');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Ttat_ita" + "'", str2, "Ttat_ita");
    }

    @Test
    public void test30214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30214");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("zh-TW");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "WT-hz" + "'", str1, "WT-hz");
    }

    @Test
    public void test30215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30215");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale locale2 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str3 = locale2.getDisplayName();
        java.util.Locale.Builder builder4 = builder1.setLocale(locale2);
        java.util.Locale.Builder builder5 = builder1.clear();
        java.util.Locale.Builder builder7 = builder1.setLanguage("eng");
        java.util.Locale.Builder builder9 = new java.util.Locale.Builder();
        java.util.Locale locale10 = builder9.build();
        java.util.Locale locale12 = java.util.Locale.forLanguageTag("Italian");
        java.lang.String str13 = locale10.getDisplayLanguage(locale12);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.upperCase("", locale12);
        java.lang.String str15 = locale12.getScript();
        java.util.Locale.Builder builder16 = builder7.setLocale(locale12);
        java.util.Locale.Builder builder18 = builder16.setLanguage("");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder21 = builder16.setExtension('4', "\ub3c5\uc77c\uc5b4Italian    italian    italian    italian    italian    italian    italian    italian    italian    italian   ");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension key: 4 [at index 0]");
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
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "italian");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
    }

    @Test
    public void test30216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30216");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue(')', 97);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test30217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30217");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("EN_ca.....", 57, 32);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test30218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30218");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("!_\\U0020_Itle");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray1, "Italia                                                  ");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test30219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30219");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("n       nn");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "n       nn" + "'", str1, "n       nn");
    }

    @Test
    public void test30220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30220");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("                          ...", "hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh99999\\u0021hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh", 92);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test30221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30221");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "2ITHI!_\\U0020_ITALIENISCH####################################################################2I", (java.lang.CharSequence) "itChineseenglisch (         ITALIAN_ITALIAN_ENGLISH,\\u0061)(China)TAChineseenglisch (         ITALIAN_ITALIAN_ENGLISH,\\u0061)(China)iChineseenglisch (         ITALIAN_ITALIAN_ENGLISH,\\u0061)(China)TChineseenglisch (         ITALIAN_ITALIAN_ENGLISH,\\u0061)(China)_Chineseenglisch (         ITALIAN_ITALIAN_ENGLISH,\\u0061)(China)ITA");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "2ITHI!_\\U0020_ITALIENISCH####################################################################2I" + "'", charSequence2, "2ITHI!_\\U0020_ITALIENISCH####################################################################2I");
    }

    @Test
    public void test30222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30222");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("\\u0023", "\\u0023");
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, "italian_ITALIAN_English");
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, 'x');
        java.lang.String[] strArray12 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("         ITALIAN_italian_eNGLISH         ITALIAN_!IHitTAiT_ITALIAN_EgAish", "\\u0020iTALIANiTALIANiTALIANiTALI\\u0020iTALIANiTALIANiTALIANiTAL", (int) (byte) 0);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray12);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.replaceEach("Franzosisch(Frankreich)", strArray4, strArray12);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray12);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAny("                                                     \\u005", strArray12);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Franzosisch(Frankreich)" + "'", str14, "Franzosisch(Frankreich)");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test30223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30223");
        java.util.Locale.Category category0 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale1 = java.util.Locale.getDefault(category0);
        java.util.Locale locale2 = java.util.Locale.getDefault(category0);
        java.util.Locale locale3 = java.util.Locale.getDefault(category0);
        java.util.Locale locale4 = java.util.Locale.getDefault(category0);
        java.util.Locale locale5 = java.util.Locale.getDefault(category0);
        java.util.Locale locale6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.setDefault(category0, locale6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Can't set default locale to NULL");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "hi!       _\\U0020_Italienisch#########################################################################################");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "hi!       _\\U0020_Italienisch#########################################################################################");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "hi!       _\\U0020_Italienisch#########################################################################################");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "hi!       _\\U0020_Italienisch#########################################################################################");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "hi!       _\\U0020_Italienisch#########################################################################################");
    }

    @Test
    public void test30224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30224");
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
        java.util.Locale locale30 = java.util.Locale.FRANCE;
        java.util.Locale locale31 = java.util.Locale.ITALIAN;
        java.lang.String str33 = locale31.getExtension('h');
        java.lang.String str34 = locale30.getDisplayScript(locale31);
        java.util.Locale locale35 = locale30.stripExtensions();
        java.lang.String str36 = locale35.getISO3Country();
        boolean boolean37 = locale35.hasExtensions();
        java.lang.String str38 = locale35.getISO3Language();
        java.lang.String str39 = locale17.getDisplayLanguage(locale35);
        java.util.Locale.Category category40 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale41 = java.util.Locale.getDefault(category40);
        java.util.Locale locale42 = java.util.Locale.GERMAN;
        java.util.Locale locale43 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str44 = locale42.getDisplayName(locale43);
        java.util.Locale.setDefault(category40, locale43);
        java.util.Locale locale48 = new java.util.Locale("\\u0020iTALIANiTALIANiTALIANiTALI\\u0020iTALIANiTALIANiTALIANiTAL", "allemand");
        java.util.Locale.setDefault(category40, locale48);
        java.util.Locale locale50 = java.util.Locale.getDefault(category40);
        java.util.Locale.Category category51 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale52 = java.util.Locale.getDefault(category51);
        java.util.Locale.setDefault(category40, locale52);
        java.lang.String str54 = locale52.getDisplayScript();
        java.util.Locale locale55 = java.util.Locale.FRENCH;
        java.util.Locale locale56 = java.util.Locale.ENGLISH;
        java.lang.String str57 = locale56.getDisplayCountry();
        java.lang.String str58 = locale55.getDisplayVariant(locale56);
        java.lang.String str59 = locale55.getDisplayCountry();
        java.lang.String str60 = locale55.getScript();
        java.lang.String str61 = locale55.getScript();
        java.lang.String str62 = locale55.getDisplayVariant();
        java.lang.String str63 = locale52.getDisplayName(locale55);
        java.lang.String str64 = locale55.getDisplayCountry();
        java.lang.String str65 = locale35.getDisplayVariant(locale55);
        java.util.Locale locale67 = java.util.Locale.ENGLISH;
        java.lang.String str68 = locale67.getDisplayLanguage();
        java.lang.String str69 = org.apache.commons.lang3.StringUtils.upperCase("!IH", locale67);
        java.lang.String str71 = locale67.getExtension('x');
        java.util.Locale locale74 = new java.util.Locale("\\u0020iTALIANiTALIANiTALIANiTALI", "French (Canada)");
        java.lang.String str75 = locale67.getDisplayScript(locale74);
        java.lang.String str76 = locale67.getDisplayVariant();
        java.lang.String str77 = locale35.getDisplayScript(locale67);
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
        org.junit.Assert.assertEquals(locale16.toString(), "hi!       _\\U0020_Italienisch#########################################################################################");
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
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "it");
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "FRA" + "'", str36, "FRA");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "fra" + "'", str38, "fra");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "fran\347ais" + "'", str39, "fran\347ais");
        org.junit.Assert.assertTrue("'" + category40 + "' != '" + java.util.Locale.Category.FORMAT + "'", category40.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale41);
        org.junit.Assert.assertEquals(locale41.toString(), "de");
        org.junit.Assert.assertNotNull(locale42);
        org.junit.Assert.assertEquals(locale42.toString(), "de");
        org.junit.Assert.assertNotNull(locale43);
        org.junit.Assert.assertEquals(locale43.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "allemand" + "'", str44, "allemand");
        org.junit.Assert.assertEquals(locale48.toString(), "\\u0020italianitalianitalianitali\\u0020italianitalianitalianital_ALLEMAND");
        org.junit.Assert.assertNotNull(locale50);
        org.junit.Assert.assertEquals(locale50.toString(), "\\u0020italianitalianitalianitali\\u0020italianitalianitalianital_ALLEMAND");
        org.junit.Assert.assertTrue("'" + category51 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category51.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale52);
        org.junit.Assert.assertEquals(locale52.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertNotNull(locale55);
        org.junit.Assert.assertEquals(locale55.toString(), "fr");
        org.junit.Assert.assertNotNull(locale56);
        org.junit.Assert.assertEquals(locale56.toString(), "en");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "fran\347ais (France)" + "'", str63, "fran\347ais (France)");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "" + "'", str65, "");
        org.junit.Assert.assertNotNull(locale67);
        org.junit.Assert.assertEquals(locale67.toString(), "en");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "anglais" + "'", str68, "anglais");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "!IH" + "'", str69, "!IH");
        org.junit.Assert.assertNull(str71);
        org.junit.Assert.assertEquals(locale74.toString(), "\\u0020italianitalianitalianitali_FRENCH (CANADA)");
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "" + "'", str75, "");
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "" + "'", str76, "");
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "" + "'", str77, "");
    }

    @Test
    public void test30225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30225");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("ranzosisch (Frankreich)kkkkkkkkkkkkkkkkkkk...", (int) 'Z');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ranzosisch (Frankreich)kkkkkkkkkkkkkkkkkkk...                                             " + "'", str2, "ranzosisch (Frankreich)kkkkkkkkkkkkkkkkkkk...                                             ");
    }

    @Test
    public void test30226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30226");
        java.util.Locale locale0 = java.util.Locale.GERMAN;
        java.util.Locale locale1 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str2 = locale0.getDisplayName(locale1);
        java.util.Locale locale3 = locale0.stripExtensions();
        java.lang.String str4 = locale3.toLanguageTag();
        java.lang.String str5 = locale3.getDisplayVariant();
        java.util.Locale.setDefault(locale3);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "de");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "allemand" + "'", str2, "allemand");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "de");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "de" + "'", str4, "de");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test30227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30227");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("\\u0048", 'D');
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, 'z');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\\u0048" + "'", str4, "\\u0048");
    }

    @Test
    public void test30228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30228");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("italian (italian,eng\\u0061\\u0061\\u0061\\u0", "  ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test30229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30229");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder16 = builder14.setLanguageTag("Cinese (Cina)\\u0069h..");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Invalid subtag: Cinese (Cina)\\u0069h.. [at index 0]");
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
    }

    @Test
    public void test30230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30230");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("zh_TW", "Frnz\366sischt(Knd)                        ", "CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "zh_TW" + "'", str3, "zh_TW");
    }

    @Test
    public void test30231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30231");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("E44444444444444444444444444444444!IHg44444444444444444444444444444444!IH44444444444444444444444444444444!IHs", "                        cHCNa                        ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "E44444444444444444444444444444444!IHg44444444444444444444444444444444!IH44444444444444444444444444444444!IHs" + "'", str2, "E44444444444444444444444444444444!IHg44444444444444444444444444444444!IH44444444444444444444444444444444!IHs");
    }

    @Test
    public void test30232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30232");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("itaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaita");
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                                              \\     ", "");
        java.lang.String[] strArray11 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("Deutsch", 'i');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.replaceEach("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444en", strArray8, strArray11);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray11);
        int int14 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("ixii", strArray11);
        java.lang.String[] strArray17 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("china", '8');
        java.lang.String[] strArray19 = org.apache.commons.lang3.StringUtils.stripAll(strArray17, "fr-");
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.replaceEach("ZHO                                                                    \\u0020iTALIANiTALIANiTALIANiTALI", strArray11, strArray17);
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.replaceEach("g_FRANZ\366SISCH", strArray2, strArray11);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444en" + "'", str12, "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444en");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Deutsch" + "'", str13, "Deutsch");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "ZHO                                                                    \\u0020iTALIANiTALIANiTALIANiTALI" + "'", str20, "ZHO                                                                    \\u0020iTALIANiTALIANiTALIANiTALI");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "g_FRANZ\366SISCH" + "'", str21, "g_FRANZ\366SISCH");
    }

    @Test
    public void test30233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30233");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("iiiiiiiiiiifrankreichnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn", 'x');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test30234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30234");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("2it hi!       _\\u0020_italienisch####################################################################            2it", 87);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2it hi!       _\\u0020_italienisch####################################################################            2it" + "'", str2, "2it hi!       _\\u0020_italienisch####################################################################            2it");
    }

    @Test
    public void test30235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30235");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("                                               nailati                                                ko", 42);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                        ko" + "'", str2, "                                        ko");
    }

    @Test
    public void test30236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30236");
        java.util.Locale locale1 = java.util.Locale.FRANCE;
        java.util.Locale locale2 = java.util.Locale.ITALIAN;
        java.lang.String str4 = locale2.getExtension('h');
        java.lang.String str5 = locale1.getDisplayScript(locale2);
        java.util.Locale locale6 = locale1.stripExtensions();
        java.lang.String str7 = locale6.getISO3Country();
        java.util.Locale locale9 = new java.util.Locale("en");
        boolean boolean10 = locale9.hasExtensions();
        java.util.Set<java.lang.String> strSet11 = locale9.getUnicodeLocaleKeys();
        java.lang.String str12 = locale6.getDisplayCountry(locale9);
        java.util.Locale locale14 = new java.util.Locale("en");
        boolean boolean15 = locale14.hasExtensions();
        java.lang.String str16 = locale9.getDisplayCountry(locale14);
        java.lang.String str17 = locale9.getDisplayName();
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.upperCase("ADkAEkAFkAGkAIkALkAMkANkAOkAQkARkASkATkAUkAWkAXkAZkBAkBBkBDkBEkBFkBGkBHkBIkBJkBLkBMkBNkBOkBQkBRkBSkBTkBVkBWkBYkBZkCAkCCkCDkCFkCGkCHkCIkCKkCLkCMkCNkCOkCRkCUkCVkCWkCXkCYkCZkDEkDJkDKkDMkDOkDZkECkEEkEGkEHkERkESkETkFIkFJkFKkFMkFOkFRkGAkGBkGDkGEkGFkGGkGHkGIkGLkGMkGNkGPkGQkGRkGSkGTkGUkGWkGYkHKkHMkHNkHRkHTkHUkIDkIEkILkIMkINkIOkIQkIRkISkITkJEkJMkJOkJPkKEkKGkKHkKIkKMkKNkKPkKRkKWkKYkKZkLAkLBkLCkLIkLKkLRkLSkLTkLUkLVkLYkMAkMCkMDkMEkMFkMGkMHkMKkMLkMMkMNkMOkMPkMQkMRkMSkMTkMUkMVkMWkMXkMYkMZkNAkNCkNEkNFkNGkNIkNLkNOkNPkNRkNUkNZkOMkPAkPEkPFkPGkPHkPKkPLkPMkPNkPRkPSkPTkPWkPYkQAkREkROkRSkRUkRWkSAkSBkSCkSDkSEkSGkSHkSIkSJkSKkSLkSMkSNkSOkSRkSSkSTkSVkSXkSYkSZkTCkTDkTFkTGkTHkTJkTKkTLkTMkTNkTOkTRkTTkTVkTWkTZkUAkUGkUMkUSkUYkUZkVAkVCkVEkVGkVIkVNkVUkWFkWSkYEkYTkZAkZMkZW", locale9);
        java.util.Locale.Builder builder19 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder20 = builder19.clearExtensions();
        java.util.Locale.Builder builder22 = builder19.setLanguageTag("Italian");
        java.util.Locale locale23 = java.util.Locale.PRC;
        java.lang.String str24 = locale23.getDisplayName();
        java.util.Locale.Builder builder25 = builder19.setLocale(locale23);
        java.util.Locale.Builder builder26 = builder25.clear();
        java.util.Locale locale27 = java.util.Locale.KOREAN;
        java.util.Locale.Builder builder28 = builder26.setLocale(locale27);
        java.util.Locale.Builder builder29 = builder26.clearExtensions();
        java.util.Locale locale30 = java.util.Locale.ITALIAN;
        java.lang.String str31 = locale30.getDisplayLanguage();
        java.util.Locale locale32 = locale30.stripExtensions();
        java.lang.String str33 = locale30.getDisplayVariant();
        java.util.Set<java.lang.String> strSet34 = locale30.getUnicodeLocaleKeys();
        java.util.Locale.Builder builder35 = builder26.setLocale(locale30);
        java.util.Set<java.lang.Character> charSet36 = locale30.getExtensionKeys();
        java.lang.String str37 = locale9.getDisplayVariant(locale30);
        boolean boolean39 = locale9.equals((java.lang.Object) 163);
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "it");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "FRA" + "'", str7, "FRA");
        org.junit.Assert.assertEquals(locale9.toString(), "en");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "France" + "'", str12, "France");
        org.junit.Assert.assertEquals(locale14.toString(), "en");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Englisch" + "'", str17, "Englisch");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "ADKAEKAFKAGKAIKALKAMKANKAOKAQKARKASKATKAUKAWKAXKAZKBAKBBKBDKBEKBFKBGKBHKBIKBJKBLKBMKBNKBOKBQKBRKBSKBTKBVKBWKBYKBZKCAKCCKCDKCFKCGKCHKCIKCKKCLKCMKCNKCOKCRKCUKCVKCWKCXKCYKCZKDEKDJKDKKDMKDOKDZKECKEEKEGKEHKERKESKETKFIKFJKFKKFMKFOKFRKGAKGBKGDKGEKGFKGGKGHKGIKGLKGMKGNKGPKGQKGRKGSKGTKGUKGWKGYKHKKHMKHNKHRKHTKHUKIDKIEKILKIMKINKIOKIQKIRKISKITKJEKJMKJOKJPKKEKKGKKHKKIKKMKKNKKPKKRKKWKKYKKZKLAKLBKLCKLIKLKKLRKLSKLTKLUKLVKLYKMAKMCKMDKMEKMFKMGKMHKMKKMLKMMKMNKMOKMPKMQKMRKMSKMTKMUKMVKMWKMXKMYKMZKNAKNCKNEKNFKNGKNIKNLKNOKNPKNRKNUKNZKOMKPAKPEKPFKPGKPHKPKKPLKPMKPNKPRKPSKPTKPWKPYKQAKREKROKRSKRUKRWKSAKSBKSCKSDKSEKSGKSHKSIKSJKSKKSLKSMKSNKSOKSRKSSKSTKSVKSXKSYKSZKTCKTDKTFKTGKTHKTJKTKKTLKTMKTNKTOKTRKTTKTVKTWKTZKUAKUGKUMKUSKUYKUZKVAKVCKVEKVGKVIKVNKVUKWFKWSKYEKYTKZAKZMKZW" + "'", str18, "ADKAEKAFKAGKAIKALKAMKANKAOKAQKARKASKATKAUKAWKAXKAZKBAKBBKBDKBEKBFKBGKBHKBIKBJKBLKBMKBNKBOKBQKBRKBSKBTKBVKBWKBYKBZKCAKCCKCDKCFKCGKCHKCIKCKKCLKCMKCNKCOKCRKCUKCVKCWKCXKCYKCZKDEKDJKDKKDMKDOKDZKECKEEKEGKEHKERKESKETKFIKFJKFKKFMKFOKFRKGAKGBKGDKGEKGFKGGKGHKGIKGLKGMKGNKGPKGQKGRKGSKGTKGUKGWKGYKHKKHMKHNKHRKHTKHUKIDKIEKILKIMKINKIOKIQKIRKISKITKJEKJMKJOKJPKKEKKGKKHKKIKKMKKNKKPKKRKKWKKYKKZKLAKLBKLCKLIKLKKLRKLSKLTKLUKLVKLYKMAKMCKMDKMEKMFKMGKMHKMKKMLKMMKMNKMOKMPKMQKMRKMSKMTKMUKMVKMWKMXKMYKMZKNAKNCKNEKNFKNGKNIKNLKNOKNPKNRKNUKNZKOMKPAKPEKPFKPGKPHKPKKPLKPMKPNKPRKPSKPTKPWKPYKQAKREKROKRSKRUKRWKSAKSBKSCKSDKSEKSGKSHKSIKSJKSKKSLKSMKSNKSOKSRKSSKSTKSVKSXKSYKSZKTCKTDKTFKTGKTHKTJKTKKTLKTMKTNKTOKTRKTTKTVKTWKTZKUAKUGKUMKUSKUYKUZKVAKVCKVEKVGKVIKVNKVUKWFKWSKYEKYTKZAKZMKZW");
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Chinesisch (China)" + "'", str24, "Chinesisch (China)");
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "ko");
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "it");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Italienisch" + "'", str31, "Italienisch");
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "it");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(strSet34);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(charSet36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test30237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30237");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rChinesisch (China)");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ")anihC( hcsisenihC\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r" + "'", str1, ")anihC( hcsisenihC\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r");
    }

    @Test
    public void test30238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30238");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("2\\iTALIANiTALIANiTALIANiT", "                                                                                                                      \\u006bcinese (cina)\\u0069h..                                                                                                                      ", "                              444444444444444444444444444444444444444444444444444...");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test30239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30239");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("    \\XTALXAN_ITALIAN_ENGLXSH    R0                                               nailati             ", '\u671d');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test30240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30240");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("francesefrancesefrancesefr\\u0075francesefrancesefrancesefr\\u0075francesefrancesefrancesefr\\u0075francesefrancesefrancTIT");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "francesefrancesefrancesefr\\u0075francesefrancesefrancesefr\\u0075francesefrancesefrancesefr\\u0075francesefrancesefrancTIT" + "'", str1, "francesefrancesefrancesefr\\u0075francesefrancesefrancesefr\\u0075francesefrancesefrancesefr\\u0075francesefrancesefrancTIT");
    }

    @Test
    public void test30241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30241");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("tal");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "tal" + "'", str1, "tal");
    }

    @Test
    public void test30242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30242");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("Italienisch#########################################################################################", "!IH");
        int int6 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray5);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray5);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.concatWith("       !IH", (java.lang.Object[]) strArray5);
        java.lang.String[] strArray11 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                                                                                              Deutsch", "italian_ITALIAN_English");
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.replaceEach("E             g", strArray5, strArray11);
        java.lang.String[] strArray14 = org.apache.commons.lang3.StringUtils.stripAll(strArray5, "FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF");
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray5);
        java.lang.String[] strArray17 = org.apache.commons.lang3.StringUtils.splitByCharacterType("INGLESEINGLESEINGLESEINItalia                                                  INGLESEINGLESEINGLESEING");
        java.lang.String[] strArray19 = org.apache.commons.lang3.StringUtils.stripAll(strArray17, "nailatiko");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("       !ih", strArray5, strArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 1 vs 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Italienisch#########################################################################################" + "'", str7, "Italienisch#########################################################################################");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Italienisch#########################################################################################" + "'", str8, "Italienisch#########################################################################################");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "E             g" + "'", str12, "E             g");
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Italienisch#########################################################################################" + "'", str15, "Italienisch#########################################################################################");
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(strArray19);
    }

    @Test
    public void test30243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30243");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("ENGLISCH", strMap1);
        java.util.Locale locale3 = java.util.Locale.ITALIAN;
        java.util.Set<java.lang.Character> charSet4 = locale3.getExtensionKeys();
        java.lang.String str5 = locale3.getVariant();
        java.lang.String str6 = locale3.getDisplayName();
        java.lang.String str7 = locale3.getCountry();
        java.util.Set<java.lang.String> strSet8 = locale3.getUnicodeLocaleKeys();
        java.lang.String str9 = java.util.Locale.lookupTag(languageRangeList2, (java.util.Collection<java.lang.String>) strSet8);
        java.util.Locale.LanguageRange[] languageRangeArray10 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList11 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList11, languageRangeArray10);
        java.lang.String[] strArray15 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList16 = new java.util.ArrayList<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList16, strArray15);
        java.util.Locale.FilteringMode filteringMode18 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList19 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList11, (java.util.Collection<java.lang.String>) strList16, filteringMode18);
        java.util.Locale.LanguageRange[] languageRangeArray20 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList21 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList21, languageRangeArray20);
        java.lang.String[] strArray25 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList26 = new java.util.ArrayList<java.lang.String>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList26, strArray25);
        java.util.Locale.FilteringMode filteringMode28 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList29 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList21, (java.util.Collection<java.lang.String>) strList26, filteringMode28);
        java.lang.String[] strArray31 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList32 = new java.util.ArrayList<java.lang.String>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList32, strArray31);
        java.util.List<java.lang.String> strList34 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList21, (java.util.Collection<java.lang.String>) strList32);
        java.lang.String str35 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList11, (java.util.Collection<java.lang.String>) strList32);
        java.util.Locale.LanguageRange[] languageRangeArray36 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList37 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList37, languageRangeArray36);
        java.util.Locale.LanguageRange[] languageRangeArray39 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList40 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList40, languageRangeArray39);
        java.lang.String[] strArray44 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList45 = new java.util.ArrayList<java.lang.String>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList45, strArray44);
        java.util.Locale.FilteringMode filteringMode47 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList48 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList40, (java.util.Collection<java.lang.String>) strList45, filteringMode47);
        java.util.Locale.FilteringMode filteringMode49 = java.util.Locale.FilteringMode.AUTOSELECT_FILTERING;
        java.util.List<java.lang.String> strList50 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList37, (java.util.Collection<java.lang.String>) strList45, filteringMode49);
        java.util.Locale.LanguageRange[] languageRangeArray51 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList52 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList52, languageRangeArray51);
        java.util.Locale.LanguageRange[] languageRangeArray54 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList55 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList55, languageRangeArray54);
        java.lang.String[] strArray59 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList60 = new java.util.ArrayList<java.lang.String>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList60, strArray59);
        java.util.Locale.FilteringMode filteringMode62 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList63 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList55, (java.util.Collection<java.lang.String>) strList60, filteringMode62);
        java.util.Locale.FilteringMode filteringMode64 = java.util.Locale.FilteringMode.AUTOSELECT_FILTERING;
        java.util.List<java.lang.String> strList65 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList52, (java.util.Collection<java.lang.String>) strList60, filteringMode64);
        java.util.List<java.lang.String> strList66 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList11, (java.util.Collection<java.lang.String>) strList50, filteringMode64);
        java.util.List<java.lang.String> strList67 = java.util.Locale.filterTags(languageRangeList2, (java.util.Collection<java.lang.String>) strList66);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap68 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList69 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList2, strMap68);
        java.util.Locale locale70 = java.util.Locale.ITALIAN;
        java.lang.String str71 = locale70.getDisplayLanguage();
        java.util.Locale locale72 = locale70.stripExtensions();
        java.lang.String str73 = locale70.getLanguage();
        java.util.Set<java.lang.String> strSet74 = locale70.getUnicodeLocaleKeys();
        java.lang.String str76 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.lang.String>) strSet74, 'u');
        java.lang.String str78 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.lang.String>) strSet74, 'k');
        java.lang.String str80 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.lang.String>) strSet74, '#');
        java.util.List<java.lang.String> strList81 = java.util.Locale.filterTags(languageRangeList2, (java.util.Collection<java.lang.String>) strSet74);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap82 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList83 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList2, strMap82);
        org.junit.Assert.assertNotNull(languageRangeList2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "it");
        org.junit.Assert.assertNotNull(charSet4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Italienisch" + "'", str6, "Italienisch");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(languageRangeArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + filteringMode18 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode18.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList19);
        org.junit.Assert.assertNotNull(languageRangeArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + filteringMode28 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode28.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList29);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(strList34);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNotNull(languageRangeArray36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(languageRangeArray39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + filteringMode47 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode47.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList48);
        org.junit.Assert.assertTrue("'" + filteringMode49 + "' != '" + java.util.Locale.FilteringMode.AUTOSELECT_FILTERING + "'", filteringMode49.equals(java.util.Locale.FilteringMode.AUTOSELECT_FILTERING));
        org.junit.Assert.assertNotNull(strList50);
        org.junit.Assert.assertNotNull(languageRangeArray51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(languageRangeArray54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(strArray59);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + filteringMode62 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode62.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList63);
        org.junit.Assert.assertTrue("'" + filteringMode64 + "' != '" + java.util.Locale.FilteringMode.AUTOSELECT_FILTERING + "'", filteringMode64.equals(java.util.Locale.FilteringMode.AUTOSELECT_FILTERING));
        org.junit.Assert.assertNotNull(strList65);
        org.junit.Assert.assertNotNull(strList66);
        org.junit.Assert.assertNotNull(strList67);
        org.junit.Assert.assertNotNull(languageRangeList69);
        org.junit.Assert.assertNotNull(locale70);
        org.junit.Assert.assertEquals(locale70.toString(), "it");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "Italienisch" + "'", str71, "Italienisch");
        org.junit.Assert.assertNotNull(locale72);
        org.junit.Assert.assertEquals(locale72.toString(), "it");
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "it" + "'", str73, "it");
        org.junit.Assert.assertNotNull(strSet74);
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "" + "'", str76, "");
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "" + "'", str78, "");
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "" + "'", str80, "");
        org.junit.Assert.assertNotNull(strList81);
        org.junit.Assert.assertNotNull(languageRangeList83);
    }

    @Test
    public void test30244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30244");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("         INGLESE        ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "INGLESE" + "'", str1, "INGLESE");
    }

    @Test
    public void test30245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30245");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "...IIIIIIIIIIIIIIIIIIII...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test30246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30246");
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
        java.lang.String str39 = locale36.getScript();
        java.lang.String str40 = locale36.getDisplayScript();
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
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Italienisch" + "'", str13, "Italienisch");
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
        org.junit.Assert.assertEquals(locale22.toString(), "de");
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
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
    }

    @Test
    public void test30247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30247");
        java.util.Locale.Category category0 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale1 = java.util.Locale.getDefault(category0);
        java.util.Locale locale2 = java.util.Locale.FRANCE;
        java.util.Locale locale3 = java.util.Locale.ITALIAN;
        java.lang.String str5 = locale3.getExtension('h');
        java.lang.String str6 = locale2.getDisplayScript(locale3);
        java.lang.String str7 = locale2.getISO3Country();
        java.util.Locale locale8 = java.util.Locale.GERMAN;
        java.util.Locale.setDefault(locale8);
        java.lang.String str10 = locale2.getDisplayName(locale8);
        java.lang.String str11 = locale2.getScript();
        java.util.Locale.setDefault(category0, locale2);
        java.util.Set<java.lang.String> strSet13 = locale2.getUnicodeLocaleKeys();
        java.lang.String str14 = locale2.getCountry();
        java.util.Locale locale15 = locale2.stripExtensions();
        java.lang.String str16 = locale15.toLanguageTag();
        java.util.Set<java.lang.Character> charSet17 = locale15.getExtensionKeys();
        java.lang.String str18 = locale15.getDisplayName();
        java.lang.String str19 = locale15.getDisplayScript();
        java.lang.Object obj20 = locale15.clone();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "it");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "FRA" + "'", str7, "FRA");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "de");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Franz\366sisch (Frankreich)" + "'", str10, "Franz\366sisch (Frankreich)");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "FR" + "'", str14, "FR");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "fr-FR" + "'", str16, "fr-FR");
        org.junit.Assert.assertNotNull(charSet17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "fran\347ais (France)" + "'", str18, "fran\347ais (France)");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertEquals(obj20.toString(), "fr_FR");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj20), "fr_FR");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj20), "fr_FR");
    }

    @Test
    public void test30248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30248");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("                      \\u005c                                                        ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\u005c" + "'", str1, "\\u005c");
    }

    @Test
    public void test30249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30249");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("hsiAgE_NAILATI_TiATtiHI!_NAILATI         HSILGNe_nailati_NAILATI         HHHHHHHHH", 2, '\u671d');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hsiAgE_NAILATI_TiATtiHI!_NAILATI         HSILGNe_nailati_NAILATI         HHHHHHHHH" + "'", str3, "hsiAgE_NAILATI_TiATtiHI!_NAILATI         HSILGNe_nailati_NAILATI         HHHHHHHHH");
    }

    @Test
    public void test30250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30250");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("cinese (Cina)\\u0069hhhhhhhhhh\\u0069hhhhhhhhhh\\u0069hhhhhhhhhh\\u0069hh");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test30251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30251");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("CHINESE (CHINA)CHINESE (CHINA)CHINESE (CHINA)CHINESE (CHINA)CHINESE (CHINA)CHINESE (CHINA)CHINESen_C", 753);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             CHINESE (CHINA)CHINESE (CHINA)CHINESE (CHINA)CHINESE (CHINA)CHINESE (CHINA)CHINESE (CHINA)CHINESen_C" + "'", str2, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             CHINESE (CHINA)CHINESE (CHINA)CHINESE (CHINA)CHINESE (CHINA)CHINESE (CHINA)CHINESE (CHINA)CHINESen_C");
    }

    @Test
    public void test30252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30252");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("HHHHHHHHH", 81);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test30253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30253");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "iFtlnz\\sisc02rankreich)00");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test30254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30254");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "Frnz\366sisch (Knd)Frnz\366sisch (Knd)Frnz\366sisch (Knd)Frnz\366sisch (Knd)Frnz\366sisch (Knd)Frnz\366sisch (Knd)Frnz\366sisch (Knd)Frnz\366sisch (Knd)Frnz\366sisch (Knd)Frnz\366sisch (Knd)F...", (java.lang.CharSequence) "f");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test30255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30255");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("Italia                                                  ", "kkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkEDkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk", 6);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test30256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30256");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("8ian\\u0020i86 (ITALIAN (ITALIAN,ENGLISH))", "FR...", 374);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test30257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30257");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfBlank((java.lang.CharSequence) "\u6cd5\u56fd", (java.lang.CharSequence) "italian (ITALIAN,English)");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "\u6cd5\u56fd" + "'", charSequence2, "\u6cd5\u56fd");
    }

    @Test
    public void test30258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30258");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("            ", "nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test30259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30259");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("Frz\366cz(frkrec)Frz\366cz(frkrec)Frz\366cz(frkrec)Frz\366cz(frkrec)Frz\366cz(frkreitaly", 'E');
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Frz\366cz(frkrec)Frz\366cz(frkrec)Frz\366cz(frkrec)Frz\366cz(frkrec)Frz\366cz(frkreitaly" + "'", str3, "Frz\366cz(frkrec)Frz\366cz(frkrec)Frz\366cz(frkrec)Frz\366cz(frkrec)Frz\366cz(frkreitaly");
    }

    @Test
    public void test30260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30260");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("e                               e                               e        ", "BBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBcaBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBB", (int) (byte) 1, 27);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "eBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBcaBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBB     e                               e        " + "'", str4, "eBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBcaBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBB     e                               e        ");
    }

    @Test
    public void test30261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30261");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("Ttat_ita", (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "a" + "'", str2, "a");
    }

    @Test
    public void test30262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30262");
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
        java.util.Set<java.lang.String> strSet28 = locale17.getUnicodeLocaleKeys();
        java.lang.String str30 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.lang.String>) strSet28, '#');
        java.util.List<java.lang.String> strList31 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strSet28);
        java.lang.String str33 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.lang.String>) strList31, 'a');
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
        org.junit.Assert.assertNotNull(strSet28);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(strList31);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
    }

    @Test
    public void test30263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30263");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    ", "    ZH_CN    ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test30264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30264");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("                                              italiano", "#########FranzosischFranzosisch (Frankreich)########TALIAN_italian_eNGLISHITAL", 210, (int) 'Z');
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "                                              italiano#########FranzosischFranzosisch (Frankreich)########TALIAN_italian_eNGLISHITAL" + "'", str4, "                                              italiano#########FranzosischFranzosisch (Frankreich)########TALIAN_italian_eNGLISHITAL");
    }

    @Test
    public void test30265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30265");
        java.util.Locale locale1 = java.util.Locale.ENGLISH;
        java.lang.String str2 = locale1.getDisplayLanguage();
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.upperCase("!IH", locale1);
        java.lang.String str4 = locale1.getDisplayCountry();
        java.lang.String str5 = locale1.getISO3Country();
        java.lang.String str6 = locale1.getISO3Country();
        java.lang.String str7 = locale1.getCountry();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "anglais" + "'", str2, "anglais");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!IH" + "'", str3, "!IH");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test30266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30266");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "ITALIAN_italian_eNGLISHITALIAN_!IHitTAiT_ITALIAN_EgAish", "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test30267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30267");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("cor\351en", "DACFACGACHACIACKACLAC");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "cor\351en" + "'", str2, "cor\351en");
    }

    @Test
    public void test30268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30268");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "ko-KR                                                                                                    ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 105 + "'", int1 == 105);
    }

    @Test
    public void test30269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30269");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("8ian");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1);
        int int3 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "8ian" + "'", str2, "8ian");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test30270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30270");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder2 = builder0.clear();
        java.util.Locale.Builder builder3 = builder0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder5 = builder3.setRegion("FRANZ\326SISCHFRANZOSISCH (FRANKREICH)KKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKK");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: FRANZO?SISCHFRANZOSISCH (FRANKREICH)KKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKK [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
    }

    @Test
    public void test30271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30271");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("...78ZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZH..", (int) 'j', 'b');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...78ZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZH.." + "'", str3, "...78ZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZH..");
    }

    @Test
    public void test30272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30272");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "hzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzh");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzh" + "'", str1, "Hzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzh");
    }

    @Test
    public void test30273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30273");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("                                                    k            ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                    k            " + "'", str1, "                                                    k            ");
    }

    @Test
    public void test30274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30274");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rHI!\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r", 82);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test30275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30275");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("...#####################################################################");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("8600u\\                                 hsiAgE_NAILATI_TiATti", strArray2);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "...#####################################################################" + "'", str4, "...#####################################################################");
    }

    @Test
    public void test30276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30276");
        char char2 = org.apache.commons.lang3.CharUtils.toChar((java.lang.Character) '2', 'I');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '2' + "'", char2 == '2');
    }

    @Test
    public void test30277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30277");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("                                                                    \\u0020");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test30278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30278");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("a700u\\", "                                                                                         italian (italian,e...                                                                                          ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test30279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30279");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "AAAAAAAAAAAAAAAAAAAAAAAAAA)aHI0200U\\NAIHAAAAAAAAAAAAAAAAAAAAAAAAAA)a");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test30280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30280");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("allemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemand", "");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray4, "");
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("italieital", '\r');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.replaceEach("cccccccccccccccccccccccccccc...", strArray6, strArray9);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.endsWithAny("E44444444444444444444444444444444!IHg44444444444444444444444444444444!IH44444444444444444444444444444444!IHs", strArray6);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "cccccccccccccccccccccccccccc..." + "'", str10, "cccccccccccccccccccccccccccc...");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test30281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30281");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("...It...");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
    }

    @Test
    public void test30282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30282");
        java.util.Locale locale3 = new java.util.Locale("                                                                                         E    Italien", "", "DEU");
        java.util.Locale locale7 = new java.util.Locale("HI!       ", "\\U0020", "Italienisch#########################################################################################");
        java.util.Locale locale8 = locale7.stripExtensions();
        java.util.Locale locale9 = locale8.stripExtensions();
        java.lang.String str10 = locale9.getVariant();
        java.lang.String str11 = locale9.toLanguageTag();
        java.lang.String str12 = locale9.getLanguage();
        boolean boolean13 = locale9.hasExtensions();
        java.lang.String str14 = locale3.getDisplayVariant(locale9);
        java.lang.Class<?> wildcardClass15 = locale3.getClass();
        org.junit.Assert.assertEquals(locale3.toString(), "                                                                                         e    italien__DEU");
        org.junit.Assert.assertEquals(locale7.toString(), "hi!       _\\U0020_Italienisch#########################################################################################");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "hi!       _\\U0020_Italienisch#########################################################################################");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "hi!       _\\U0020_Italienisch#########################################################################################");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Italienisch#########################################################################################" + "'", str10, "Italienisch#########################################################################################");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "und" + "'", str11, "und");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!       " + "'", str12, "hi!       ");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "DEU" + "'", str14, "DEU");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test30283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30283");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "ih       !ih       !ih       !ih       !ih       !ih   ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test30284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30284");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad(")dnk( hcsis\366znrf", 109, "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXNCHI");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ")dnk( hcsis\366znrfXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXNCHIXXXXXXXXXXXXXXXXXXXXX" + "'", str3, ")dnk( hcsis\366znrfXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXNCHIXXXXXXXXXXXXXXXXXXXXX");
    }

    @Test
    public void test30285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30285");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("tit", "                    fRENCH (fRANCE)                                                \\u0068");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test30286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30286");
        boolean boolean1 = org.apache.commons.lang3.CharUtils.isAsciiNumeric('\u671d');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test30287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30287");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "Frz\366cz(frkrec)Frz\366cz(frkrec)Frz\366cz(frkrec)Frz\366cz(frkrec)Frz\366cz(frkreitaly");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test30288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30288");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("", "Deutsch");
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.stripAll(strArray5, "franz\366sisch (frankreich)");
        boolean boolean8 = org.apache.commons.lang3.StringUtils.startsWithAny("ENGLISCH", strArray7);
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAny("itTAiT_ITA", strArray7);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray7);
        java.lang.String[] strArray14 = org.apache.commons.lang3.StringUtils.substringsBetween("", "                                                                                     etatS detinU", "fR\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\ub3c5\uc77c\uc5b4\r\r\r\r\rfraH\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\ub3c5\uc77c\uc5b4\r\r\r\r\rfrafR\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\ub3c5\uc77c\uc5b4\r\r\r\r\rfra)");
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.replaceEach("...                             xxxxxxxxxxxxxxxxxxtit...                             xxxxxxxxxxxxxxxxxxx", strArray7, strArray14);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "...                             xxxxxxxxxxxxxxxxxxtit...                             xxxxxxxxxxxxxxxxxxx" + "'", str15, "...                             xxxxxxxxxxxxxxxxxxtit...                             xxxxxxxxxxxxxxxxxxx");
    }

    @Test
    public void test30289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30289");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("...\r\r\r\r\r\r\r\r..", strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=...????????..");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test30290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30290");
        java.util.Locale locale1 = new java.util.Locale("iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiifrancese (Francia)");
        org.junit.Assert.assertEquals(locale1.toString(), "iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiifrancese (francia)");
    }

    @Test
    public void test30291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30291");
        char[] charArray6 = new char[] { ' ' };
        boolean boolean7 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "hi!", charArray6);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "ixii", charArray6);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "ALLEMAND", charArray6);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsAny("         R", charArray6);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "                                             DEUTSCH                                             ", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), " ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), " ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[ ]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test30292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30292");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("HSIAGE_NAILATI_TIATTIHI!_NAILATI         HSILGNE_NAILATI_NAILAT", "itlin_ITALIAN_EnglisFitlin (itlin,englis", (int) '-', (int) 'l');
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HSIAGE_NAILATI_TIATTIHI!_NAILATI         HSILitlin_ITALIAN_EnglisFitlin (itlin,englis" + "'", str4, "HSIAGE_NAILATI_TIATTIHI!_NAILATI         HSILitlin_ITALIAN_EnglisFitlin (itlin,englis");
    }

    @Test
    public void test30293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30293");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("                                                                                 g             E");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test30294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30294");
        boolean boolean1 = org.apache.commons.lang3.CharUtils.isAsciiAlpha('.');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test30295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30295");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("Kanada");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Kanada" + "'", str1, "Kanada");
    }

    @Test
    public void test30296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30296");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale locale2 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str3 = locale2.getDisplayName();
        java.util.Locale.Builder builder4 = builder1.setLocale(locale2);
        java.util.Locale.Builder builder5 = builder4.clear();
        java.util.Locale.Builder builder7 = builder5.setLanguage("ITALIAN");
        java.util.Locale.Builder builder8 = builder7.clear();
        java.util.Locale locale9 = builder7.build();
        java.lang.Object obj10 = locale9.clone();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "fran\347ais (Canada)" + "'", str3, "fran\347ais (Canada)");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "");
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertEquals(obj10.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj10), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj10), "");
    }

    @Test
    public void test30297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30297");
        java.util.Locale.Builder builder1 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder1.clearExtensions();
        java.util.Locale locale3 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str4 = locale3.getDisplayName();
        java.util.Locale.Builder builder5 = builder2.setLocale(locale3);
        java.util.Locale.Builder builder6 = builder5.clear();
        java.util.Locale.Builder builder8 = builder6.setLanguage("ITALIAN");
        java.util.Locale locale9 = builder6.build();
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.lowerCase("                                                                                                        ", locale9);
        java.lang.String str11 = locale9.getLanguage();
        java.lang.String str12 = locale9.getCountry();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "fran\347ais (Canada)" + "'", str4, "fran\347ais (Canada)");
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "italian");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "                                                                                                        " + "'", str10, "                                                                                                        ");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "italian" + "'", str11, "italian");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test30298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30298");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("eeeeeeeeefraeeeeeeeeecccccccccccccccccccccccccccccccccccccccccccccccccenglischccccccccccccccccccccccccccccccccccccccc", "\\u005c", "WBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDED...ZHO                                                                    \\u0020iTALIANiTALIANiTALIANiTALI", 14);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "eeeeeeeeefraeeeeeeeeecccccccccccccccccccccccccccccccccccccccccccccccccenglischccccccccccccccccccccccccccccccccccccccc" + "'", str4, "eeeeeeeeefraeeeeeeeeecccccccccccccccccccccccccccccccccccccccccccccccccenglischccccccccccccccccccccccccccccccccccccccc");
    }

    @Test
    public void test30299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30299");
        java.util.Locale locale2 = new java.util.Locale("HHHHHHHHH", "hhhhhhhhhh");
        java.lang.String str3 = locale2.getScript();
        java.lang.String str4 = locale2.getDisplayCountry();
        org.junit.Assert.assertEquals(locale2.toString(), "hhhhhhhhh_HHHHHHHHHH");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HHHHHHHHHH" + "'", str4, "HHHHHHHHHH");
    }

    @Test
    public void test30300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30300");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder2 = builder0.clear();
        java.util.Locale.Builder builder3 = builder2.clear();
        java.util.Locale locale4 = java.util.Locale.CHINESE;
        java.lang.String str5 = locale4.getCountry();
        java.util.Locale.Builder builder6 = builder3.setLocale(locale4);
        java.util.Locale.Builder builder8 = builder3.removeUnicodeLocaleAttribute("italy");
        java.util.Locale.Builder builder9 = builder8.clear();
        java.util.Locale.Builder builder10 = builder8.clearExtensions();
        java.util.Locale.Builder builder11 = builder10.clear();
        java.util.Locale locale12 = builder10.build();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder14 = builder10.setLanguageTag("         ITALIAN_italian_eNGLISH                                                                  ");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Invalid subtag:          ITALIAN_italian_eNGLISH                                                                   [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "");
    }

    @Test
    public void test30301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30301");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("", "hi!Italsch");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test30302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30302");
        java.lang.Object[] objArray0 = null;
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(objArray0, "\\0020iTALIANiTALIANiTALIANiTALzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz", (int) 'e', 327);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test30303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30303");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("ITALIAN                                                                 ", (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "I" + "'", str2, "I");
    }

    @Test
    public void test30304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30304");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("eAGAASH", "RoADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDEDJDKDMDODZECEEEGEHERESETFIFJFKFMFOFRGAGBGDGEGFGGGHGIGLGMGNGPGQGRGSGTGUGWGYHKHMHNHRHTHUIDIEILIMINIOIQIRISITJEJMJOJPKEKGKHKIKMKNKPKRKWKYKZLALBLCLILKLRLSLTLULVLYMAMCMDMEMFMGMHMKMLMMMNMOMPMQMRMSMTMUMVMWMXMYMZNANCNENFNGNINLNONPNRNUNZOMPAPEPFPGPHPKPLPMPNPRPSPTPWPYQARERORSRURWSASBSCSDSESGSHSISJSKSLSMSNSOSRSSSTSVSXSYSZTCTDTFTGTHTJTKTLTMTNTOTRTTTVTWTZUAUGUMUSUYUZVAVCVEVGVIVNVUWFWSYEYTZAZMZ\\\\\\\\\\\\\\\\\\\\\\\\\\-Deutsch\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\Uni");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "eAGAASH" + "'", str2, "eAGAASH");
    }

    @Test
    public void test30305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30305");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("\r\r\r\r\r\r\r\r\r\r\r\rITALIEITAL", 210, '9');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r\r\r\r\r\r\r\r\r\r\r\rITALIEITAL99999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999" + "'", str3, "\r\r\r\r\r\r\r\r\r\r\r\rITALIEITAL99999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999");
    }

    @Test
    public void test30306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30306");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale locale2 = java.util.Locale.UK;
        java.util.Locale.Builder builder3 = builder0.setLocale(locale2);
        java.lang.String str4 = locale2.getLanguage();
        java.util.Locale locale6 = java.util.Locale.forLanguageTag("         ITALIAN_italian_eNGLISH         ITALIAN_!IH");
        java.lang.String str7 = locale6.getDisplayScript();
        java.lang.String str8 = locale6.getDisplayLanguage();
        java.util.Locale locale10 = java.util.Locale.KOREA;
        java.lang.String str11 = locale10.getVariant();
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.upperCase("Canada", locale10);
        java.lang.String str13 = locale10.getDisplayName();
        java.lang.String str14 = locale6.getDisplayVariant(locale10);
        java.lang.String str15 = locale2.getDisplayLanguage(locale10);
        java.util.Locale.Category category16 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale17 = java.util.Locale.getDefault(category16);
        java.lang.String str18 = locale17.toLanguageTag();
        java.util.Locale locale19 = java.util.Locale.CHINESE;
        java.lang.String str20 = locale19.getCountry();
        java.lang.String str21 = locale19.getLanguage();
        java.lang.String str22 = locale17.getDisplayVariant(locale19);
        java.lang.String str23 = locale17.getScript();
        java.lang.String str24 = locale17.getISO3Country();
        java.lang.String str25 = locale10.getDisplayVariant(locale17);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en_GB");
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "en" + "'", str4, "en");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "CANADA" + "'", str12, "CANADA");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "cor\351en (Cor\351e du Sud)" + "'", str13, "cor\351en (Cor\351e du Sud)");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\uc601\uc5b4" + "'", str15, "\uc601\uc5b4");
        org.junit.Assert.assertTrue("'" + category16 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category16.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "fr-FR" + "'", str18, "fr-FR");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "zh" + "'", str21, "zh");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "FRA" + "'", str24, "FRA");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test30307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30307");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder2 = builder0.clear();
        java.util.Locale.Builder builder4 = builder2.setScript("");
        java.util.Locale.Builder builder5 = builder4.clear();
        java.util.Locale.Builder builder6 = builder5.clear();
        java.util.Locale.Builder builder8 = builder5.setLanguage("NAILAT");
        java.util.Locale.Builder builder9 = builder5.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder11 = builder9.setLanguage("NNNNNNNNNNNNNNNNNN                                                                                 ");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: NNNNNNNNNNNNNNNNNN                                                                                  [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test30308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30308");
        java.util.Locale locale2 = new java.util.Locale("G", "Franz\366sisch");
        java.lang.String str3 = locale2.getVariant();
        org.junit.Assert.assertEquals(locale2.toString(), "g_FRANZ\366SISCH");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test30309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30309");
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
        java.util.Locale locale14 = java.util.Locale.KOREA;
        java.util.Locale.Builder builder15 = builder13.setLocale(locale14);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder17 = builder15.setRegion("iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiifrancese (francia)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiifrancese (francia) [at index 0]");
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
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(builder15);
    }

    @Test
    public void test30310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30310");
        java.lang.String[] strArray1 = java.util.Locale.getISOLanguages();
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("FRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFR", strArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, 'z', 97, 405);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 188");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test30311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30311");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "\u53f0\u7063");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test30312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30312");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("Hfffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffff", "...anitali");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hfffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffff" + "'", str2, "Hfffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffff");
    }

    @Test
    public void test30313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30313");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("France", "\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0...", (int) 'a');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test30314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30314");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("en-GBDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHD", "                                                                                           U0020", 262);
        boolean boolean5 = org.apache.commons.lang3.StringUtils.startsWithAny("                                                                                                                                                                                                                                                                                                                                                                     \\u002e", strArray4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, "########################################################################################", 101, 499);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test30315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30315");
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
        java.util.Locale locale13 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale.setDefault(category0, locale13);
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
        java.util.Locale.Category category30 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale31 = java.util.Locale.getDefault(category30);
        java.util.Locale locale32 = java.util.Locale.FRANCE;
        java.util.Locale locale33 = java.util.Locale.ITALIAN;
        java.lang.String str35 = locale33.getExtension('h');
        java.lang.String str36 = locale32.getDisplayScript(locale33);
        java.lang.String str37 = locale32.getISO3Country();
        java.util.Locale locale38 = java.util.Locale.GERMAN;
        java.util.Locale.setDefault(locale38);
        java.lang.String str40 = locale32.getDisplayName(locale38);
        java.lang.String str41 = locale32.getScript();
        java.util.Locale.setDefault(category30, locale32);
        java.lang.String str43 = locale15.getDisplayCountry(locale32);
        java.util.Locale.Builder builder44 = new java.util.Locale.Builder();
        java.util.Locale locale45 = builder44.build();
        java.util.Locale locale47 = java.util.Locale.forLanguageTag("Italian");
        java.lang.String str48 = locale45.getDisplayLanguage(locale47);
        java.lang.String str49 = locale32.getDisplayVariant(locale45);
        java.util.Locale.setDefault(category0, locale45);
        java.util.Locale locale51 = java.util.Locale.getDefault();
        java.lang.String str52 = locale51.getDisplayScript();
        java.util.Locale locale53 = java.util.Locale.FRANCE;
        java.util.Locale locale54 = java.util.Locale.ITALIAN;
        java.lang.String str56 = locale54.getExtension('h');
        java.lang.String str57 = locale53.getDisplayScript(locale54);
        boolean boolean58 = locale53.hasExtensions();
        java.lang.String str59 = locale53.getVariant();
        java.util.Set<java.lang.Character> charSet60 = locale53.getExtensionKeys();
        java.lang.String str61 = locale53.toLanguageTag();
        java.lang.String str62 = locale51.getDisplayCountry(locale53);
        java.lang.String str63 = locale53.getScript();
        java.util.Locale.setDefault(category0, locale53);
        java.util.Locale.Builder builder65 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder66 = builder65.clearExtensions();
        java.util.Locale locale67 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str68 = locale67.getDisplayName();
        java.util.Locale.Builder builder69 = builder66.setLocale(locale67);
        java.util.Locale.Builder builder70 = builder66.clear();
        java.util.Locale.Builder builder71 = builder70.clear();
        java.util.Locale.Builder builder73 = builder70.setLanguage("zh");
        java.util.Locale locale74 = builder73.build();
        java.util.Locale.setDefault(locale74);
        java.util.Locale locale76 = locale74.stripExtensions();
        java.util.Locale locale77 = locale76.stripExtensions();
        java.util.Locale.setDefault(category0, locale76);
        java.util.Set<java.lang.String> strSet79 = locale76.getUnicodeLocaleKeys();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "de");
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
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "");
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
        org.junit.Assert.assertTrue("'" + category30 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category30.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "it");
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "FRA" + "'", str37, "FRA");
        org.junit.Assert.assertNotNull(locale38);
        org.junit.Assert.assertEquals(locale38.toString(), "de");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "Franz\366sisch (Frankreich)" + "'", str40, "Franz\366sisch (Frankreich)");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertNotNull(locale45);
        org.junit.Assert.assertEquals(locale45.toString(), "");
        org.junit.Assert.assertNotNull(locale47);
        org.junit.Assert.assertEquals(locale47.toString(), "italian");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertNotNull(locale51);
        org.junit.Assert.assertEquals(locale51.toString(), "de");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertNotNull(locale53);
        org.junit.Assert.assertEquals(locale53.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale54);
        org.junit.Assert.assertEquals(locale54.toString(), "it");
        org.junit.Assert.assertNull(str56);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertNotNull(charSet60);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "fr-FR" + "'", str61, "fr-FR");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
        org.junit.Assert.assertNotNull(builder66);
        org.junit.Assert.assertNotNull(locale67);
        org.junit.Assert.assertEquals(locale67.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "fran\347ais (Canada)" + "'", str68, "fran\347ais (Canada)");
        org.junit.Assert.assertNotNull(builder69);
        org.junit.Assert.assertNotNull(builder70);
        org.junit.Assert.assertNotNull(builder71);
        org.junit.Assert.assertNotNull(builder73);
        org.junit.Assert.assertNotNull(locale74);
        org.junit.Assert.assertEquals(locale74.toString(), "zh");
        org.junit.Assert.assertNotNull(locale76);
        org.junit.Assert.assertEquals(locale76.toString(), "zh");
        org.junit.Assert.assertNotNull(locale77);
        org.junit.Assert.assertEquals(locale77.toString(), "zh");
        org.junit.Assert.assertNotNull(strSet79);
    }

    @Test
    public void test30316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30316");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.setLanguageTag("Italian");
        java.util.Locale locale4 = builder0.build();
        java.util.Locale locale5 = java.util.Locale.CHINESE;
        java.lang.String str6 = locale5.getISO3Language();
        java.util.Locale.Builder builder7 = builder0.setLocale(locale5);
        java.util.Locale locale8 = java.util.Locale.US;
        java.lang.String str9 = locale8.getScript();
        java.util.Set<java.lang.String> strSet10 = locale8.getUnicodeLocaleAttributes();
        java.lang.String str11 = locale8.getCountry();
        java.util.Locale.setDefault(locale8);
        java.util.Locale.Builder builder13 = builder7.setLocale(locale8);
        java.lang.String str14 = locale8.getDisplayName();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "italian");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "zho" + "'", str6, "zho");
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "US" + "'", str11, "US");
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "English (United States)" + "'", str14, "English (United States)");
    }

    @Test
    public void test30317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30317");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "...U0069\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069!IH\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069\\ENGLISCH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...U0069\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069!IH\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069\\ENGLISCH" + "'", str1, "...U0069\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069!IH\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069\\ENGLISCH");
    }

    @Test
    public void test30318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30318");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.setLanguageTag("Italian");
        java.util.Locale.Builder builder4 = builder0.clearExtensions();
        java.util.Locale.Builder builder5 = builder0.clear();
        java.util.Locale locale7 = java.util.Locale.forLanguageTag("\\u0020");
        java.util.Locale.Builder builder8 = builder0.setLocale(locale7);
        java.util.Locale.Builder builder9 = builder8.clear();
        java.util.Locale.Builder builder10 = builder8.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder12 = builder8.setScript("                                                                                                                                                                                                                                                                                                                                                                     \\u002e");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script:                                                                                                                                                                                                                                                                                                                                                                      \\u002e [at index 0]");
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
    }

    @Test
    public void test30319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30319");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("chinois");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "chinois" + "'", str1, "chinois");
    }

    @Test
    public void test30320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30320");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("ADAAEAAFAAGAAIAALAAMAANAAOAAQAARAAS", (double) 64);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=64.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test30321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30321");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("000000000000000000000000000000000000000000...", "h#########################################################################################");
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.split("#########FranzosischFranzosisch (Frankreich)########TALIAN_italian_eNGLISHITAL", "t!li!!_ITALIAN_E!glish", 60);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = org.apache.commons.lang3.StringUtils.replaceEach("!ih                            dalleman!ih                            dalleman!ih                          ", strArray3, strArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 1 vs 12");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void test30322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30322");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("                                                                                                   HSadanacadanacGadanacE", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                   HSadanacadanacGadanacE" + "'", str2, "                                                                                                   HSadanacadanacGadanacE");
    }

    @Test
    public void test30323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30323");
        java.util.Locale locale1 = java.util.Locale.FRANCE;
        java.util.Locale locale2 = java.util.Locale.ITALIAN;
        java.lang.String str4 = locale2.getExtension('h');
        java.lang.String str5 = locale1.getDisplayScript(locale2);
        java.util.Locale locale9 = new java.util.Locale("HI!       ", "\\U0020", "Italienisch#########################################################################################");
        java.lang.String str10 = locale1.getDisplayCountry(locale9);
        java.util.Locale.setDefault(locale1);
        java.lang.String str12 = locale1.getISO3Country();
        java.lang.String str13 = locale1.getISO3Country();
        boolean boolean14 = locale1.hasExtensions();
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.upperCase("1\\u0061\\u0061\\u0061", locale1);
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "it");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals(locale9.toString(), "hi!       _\\U0020_Italienisch#########################################################################################");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "France" + "'", str10, "France");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "FRA" + "'", str12, "FRA");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "FRA" + "'", str13, "FRA");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1\\U0061\\U0061\\U0061" + "'", str15, "1\\U0061\\U0061\\U0061");
    }

    @Test
    public void test30324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30324");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("zhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhz", "44444444444444444444444444444444!IH");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test30325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30325");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("     Eng", 'i', 'N');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "     Eng" + "'", str3, "     Eng");
    }

    @Test
    public void test30326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30326");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("Frnz\366sischt(Knd)                        ", (int) (byte) 10, 'n');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Frnz\366sischt(Knd)                        " + "'", str3, "Frnz\366sischt(Knd)                        ");
    }

    @Test
    public void test30327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30327");
        java.util.Locale locale0 = java.util.Locale.ITALIAN;
        java.lang.String str1 = locale0.getDisplayLanguage();
        java.util.Locale locale2 = locale0.stripExtensions();
        java.lang.String str3 = locale2.getVariant();
        java.lang.String str4 = locale2.getDisplayCountry();
        java.lang.String str5 = locale2.getDisplayVariant();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = locale2.getExtension('!');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed extension key: !");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "italien" + "'", str1, "italien");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "it");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test30328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30328");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.setLanguageTag("Italian");
        java.util.Locale locale4 = java.util.Locale.PRC;
        java.lang.String str5 = locale4.getDisplayName();
        java.util.Locale.Builder builder6 = builder0.setLocale(locale4);
        java.util.Locale.Builder builder7 = builder6.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder9 = builder6.setLanguage("und-ittait-italian-egaish");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: und-ittait-italian-egaish [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chinois (Chine)" + "'", str5, "chinois (Chine)");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test30329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30329");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "hcsineilat");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test30330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30330");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("2CINESE (CINA...", 'I');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test30331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30331");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace(" ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test30332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30332");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("ixii");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.stripAll(strArray1);
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "a44444444444444SaaS44444444444444at");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test30333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30333");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("8600U\\                                                                                                                  ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=8600u\\                                                                                                                  ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test30334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30334");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("    \\    ", "00CCCC\\CCCC0000000000000000000000000000000000000000000000000000000");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test30335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30335");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("und");
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
        java.lang.String[] strArray15 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList16 = new java.util.ArrayList<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList16, strArray15);
        java.util.List<java.lang.String> strList18 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList5, (java.util.Collection<java.lang.String>) strList16);
        java.util.Locale.LanguageRange[] languageRangeArray19 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList20 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList20, languageRangeArray19);
        java.lang.String[] strArray24 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList25 = new java.util.ArrayList<java.lang.String>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList25, strArray24);
        java.util.Locale.FilteringMode filteringMode27 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList28 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList20, (java.util.Collection<java.lang.String>) strList25, filteringMode27);
        java.lang.String[] strArray30 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList31 = new java.util.ArrayList<java.lang.String>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList31, strArray30);
        java.util.List<java.lang.String> strList33 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList20, (java.util.Collection<java.lang.String>) strList31);
        java.util.List<java.lang.String> strList34 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList5, (java.util.Collection<java.lang.String>) strList31);
        java.util.Locale locale35 = java.util.Locale.US;
        java.lang.String str36 = locale35.getScript();
        java.util.Set<java.lang.String> strSet37 = locale35.getUnicodeLocaleAttributes();
        java.lang.String str39 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.lang.String>) strSet37, 'A');
        java.util.List<java.lang.String> strList40 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList5, (java.util.Collection<java.lang.String>) strSet37);
        java.lang.String str42 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.lang.String>) strList40, 'u');
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
        java.util.Locale.LanguageRange[] languageRangeArray73 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList74 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean75 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList74, languageRangeArray73);
        java.lang.String[] strArray78 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList79 = new java.util.ArrayList<java.lang.String>();
        boolean boolean80 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList79, strArray78);
        java.util.Locale.FilteringMode filteringMode81 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList82 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList74, (java.util.Collection<java.lang.String>) strList79, filteringMode81);
        java.util.List<java.lang.String> strList83 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList44, (java.util.Collection<java.lang.String>) strList72, filteringMode81);
        java.util.List<java.lang.String> strList84 = java.util.Locale.filterTags(languageRangeList3, (java.util.Collection<java.lang.String>) strList40, filteringMode81);
        java.lang.Class<?> wildcardClass85 = filteringMode81.getClass();
        org.junit.Assert.assertNotNull(languageRangeList1);
        org.junit.Assert.assertNotNull(languageRangeList3);
        org.junit.Assert.assertNotNull(languageRangeArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + filteringMode12 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode12.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(languageRangeArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + filteringMode27 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode27.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList28);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(strList33);
        org.junit.Assert.assertNotNull(strList34);
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(strSet37);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNotNull(strList40);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
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
        org.junit.Assert.assertNotNull(languageRangeArray73);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNotNull(strArray78);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertTrue("'" + filteringMode81 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode81.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList82);
        org.junit.Assert.assertNotNull(strList83);
        org.junit.Assert.assertNotNull(strList84);
        org.junit.Assert.assertNotNull(wildcardClass85);
    }

    @Test
    public void test30336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30336");
        java.util.Locale locale0 = java.util.Locale.ITALIAN;
        java.lang.String str1 = locale0.getDisplayLanguage();
        java.util.Locale locale2 = java.util.Locale.ITALIAN;
        java.lang.String str4 = locale2.getExtension('h');
        java.lang.String str5 = locale0.getDisplayCountry(locale2);
        java.util.Set<java.lang.String> strSet6 = locale2.getUnicodeLocaleKeys();
        java.util.Set<java.lang.String> strSet7 = locale2.getUnicodeLocaleKeys();
        java.lang.String str8 = locale2.getDisplayName();
        java.util.Locale.Category category9 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale10 = java.util.Locale.getDefault(category9);
        java.util.Locale locale11 = java.util.Locale.GERMAN;
        java.util.Locale locale12 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str13 = locale11.getDisplayName(locale12);
        java.util.Locale.setDefault(category9, locale12);
        java.util.Locale.Category category15 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale16 = java.util.Locale.getDefault(category15);
        java.lang.String str18 = locale16.getExtension('x');
        java.util.Locale.setDefault(category9, locale16);
        java.util.Locale locale23 = new java.util.Locale("hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhfr-CA", "", "                                      )hsilgne,nailati( ");
        java.lang.String str24 = locale23.getISO3Country();
        java.util.Locale.setDefault(category9, locale23);
        java.lang.String str26 = locale2.getDisplayLanguage(locale23);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "italien" + "'", str1, "italien");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "it");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "italien" + "'", str8, "italien");
        org.junit.Assert.assertTrue("'" + category9 + "' != '" + java.util.Locale.Category.FORMAT + "'", category9.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "de");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "allemand" + "'", str13, "allemand");
        org.junit.Assert.assertTrue("'" + category15 + "' != '" + java.util.Locale.Category.FORMAT + "'", category15.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "fr_CA");
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertEquals(locale23.toString(), "hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhfr-ca__                                      )hsilgne,nailati( ");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Italian" + "'", str26, "Italian");
    }

    @Test
    public void test30337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30337");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "dez...dez...dez...dez...dez...dez...dez...dez...dez...dez...dez...dez...dez...dez...dez...dez...dez...dez...dez...dez...dez...dez...dez...dez...dez...dez...dez...dez...dez...dez...dez...dez...dez...dez...dez...dez...dez...dez...dez...dez...de", "                                                                                        e                               ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test30338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30338");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("44444444444444444444444444444444IHAAAAAAAAAAAAAAAAAAAAAAAAFRANZ\326SISCH (FRANKREICH)AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray1, "!ih    Deutsc");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test30339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30339");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("", "Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzh", 42, (int) 'u');
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzh" + "'", str4, "Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzh");
    }

    @Test
    public void test30340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30340");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("ADAAEAAFAAGAAIAALAAMAANAAOAAQAARAASAATAAUAAWAAXAAZABAABBhcstueDNABOABQABRABSABTABVABWABYABZACAACCACDACFACGACHACIACKACLACMACNACOACRACUACVACWACXACYACZADEADJADKADMADOADZAECAEEAEGAEHAERAESAETAFIAFJAFKAFMAFOAFRAGAAGBAGDAGEAGFAGGAGHAGIAGLAGMAGNAGPAGQAGRAGSAGTAGUAGWAGYAHKAHMAHNAHRAHTAHUAIDAIEAILAIMAINAIOAIQAIRAISAITAJEAJMAJOAJPAKEAKGAKHAKIAKMAKNAKPAKRAKWAKYAKZALAALBALCALIALKALRALSALTALUALVALYAMAAMCAMDAMEAMFAMGAMHAMKAMLAMMAMNAMOAMPAMQAMRAMSAMTAMUAMVAMWAMXAMYAMZANAANCANEANFANGANIANLANOANPANRANUANZAOMAPAAPEAPFAPGAPHAPKAPLAPMAPNAPRAPSAPTAPWAPYAQAAREAROARSARUARWASAASBASCASDASEASGASHASIASJASKASLASMASNASOASRASSASTASVASXASYASZATCATDATFATGATHATJATKATLATMATNATOATRATTATVATWATZAUAAUGAUMAUSAUYAUZAVAAVCAVEAVGAVIAVNAVUAWFAWSAYEAYTAZAAZMAZW");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ADAAEAAFAAGAAIAALAAMAANAAOAAQAARAASAATAAUAAWAAXAAZABAABBhcstueDNABOABQABRABSABTABVABWABYABZACAACCACDACFACGACHACIACKACLACMACNACOACRACUACVACWACXACYACZADEADJADKADMADOADZAECAEEAEGAEHAERAESAETAFIAFJAFKAFMAFOAFRAGAAGBAGDAGEAGFAGGAGHAGIAGLAGMAGNAGPAGQAGRAGSAGTAGUAGWAGYAHKAHMAHNAHRAHTAHUAIDAIEAILAIMAINAIOAIQAIRAISAITAJEAJMAJOAJPAKEAKGAKHAKIAKMAKNAKPAKRAKWAKYAKZALAALBALCALIALKALRALSALTALUALVALYAMAAMCAMDAMEAMFAMGAMHAMKAMLAMMAMNAMOAMPAMQAMRAMSAMTAMUAMVAMWAMXAMYAMZANAANCANEANFANGANIANLANOANPANRANUANZAOMAPAAPEAPFAPGAPHAPKAPLAPMAPNAPRAPSAPTAPWAPYAQAAREAROARSARUARWASAASBASCASDASEASGASHASIASJASKASLASMASNASOASRASSASTASVASXASYASZATCATDATFATGATHATJATKATLATMATNATOATRATTATVATWATZAUAAUGAUMAUSAUYAUZAVAAVCAVEAVGAVIAVNAVUAWFAWSAYEAYTAZAAZMAZW" + "'", str1, "ADAAEAAFAAGAAIAALAAMAANAAOAAQAARAASAATAAUAAWAAXAAZABAABBhcstueDNABOABQABRABSABTABVABWABYABZACAACCACDACFACGACHACIACKACLACMACNACOACRACUACVACWACXACYACZADEADJADKADMADOADZAECAEEAEGAEHAERAESAETAFIAFJAFKAFMAFOAFRAGAAGBAGDAGEAGFAGGAGHAGIAGLAGMAGNAGPAGQAGRAGSAGTAGUAGWAGYAHKAHMAHNAHRAHTAHUAIDAIEAILAIMAINAIOAIQAIRAISAITAJEAJMAJOAJPAKEAKGAKHAKIAKMAKNAKPAKRAKWAKYAKZALAALBALCALIALKALRALSALTALUALVALYAMAAMCAMDAMEAMFAMGAMHAMKAMLAMMAMNAMOAMPAMQAMRAMSAMTAMUAMVAMWAMXAMYAMZANAANCANEANFANGANIANLANOANPANRANUANZAOMAPAAPEAPFAPGAPHAPKAPLAPMAPNAPRAPSAPTAPWAPYAQAAREAROARSARUARWASAASBASCASDASEASGASHASIASJASKASLASMASNASOASRASSASTASVASXASYASZATCATDATFATGATHATJATKATLATMATNATOATRATTATVATWATZAUAAUGAUMAUSAUYAUZAVAAVCAVEAVGAVIAVNAVUAWFAWSAYEAYTAZAAZMAZW");
    }

    @Test
    public void test30341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30341");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("NC_H", "iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiitalian_italian_englishiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test30342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30342");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "\\0020!TALIAN!TALIAN!TALIAIAN_Englishallemzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test30343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30343");
        java.util.Locale locale3 = new java.util.Locale("italian (italian,eng", "tttttttfr-C                 ttttttt", "i!");
        org.junit.Assert.assertEquals(locale3.toString(), "italian (italian,eng_TTTTTTTFR-C                 TTTTTTT_i!");
    }

    @Test
    public void test30344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30344");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("a700u  ", " hi!       _\\U0020_Italienisch####################################################################           ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test30345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30345");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("COR\311EN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "COR\311EN" + "'", str1, "COR\311EN");
    }

    @Test
    public void test30346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30346");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "                                                                                                                                                                                           z...\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r...                                                                                                                                                                    italian_ITALIAN_EnglisF");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test30347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30347");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("GERMAN (GERMANY", "#########################################################################################hcsineilatI_0200U\\_iiiiiii!ih", 115);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test30348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30348");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("Zh_CNfRENCH (cANADA)aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\\U0020IiTALIAN\\U0020I                                                 ", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              fr_C", " zhAzhzhzhzhzhzhzhzhzhzh                                               ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Zh_CNfRENCH (cANADA)aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\\U0020IiTALIAN\\U0020I                                                 " + "'", str3, "Zh_CNfRENCH (cANADA)aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\\U0020IiTALIAN\\U0020I                                                 ");
    }

    @Test
    public void test30349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30349");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("#######################################################################");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
    }

    @Test
    public void test30350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30350");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("hsiAgE_NAILATI_TiATtiHI!_NAILATI         HSILGNe_nailati_NAILATI");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hsiAgE_NAILATI_TiATtiHI!_NAILATI         HSILGNe_nailati_NAILATI" + "'", str1, "hsiAgE_NAILATI_TiATtiHI!_NAILATI         HSILGNe_nailati_NAILATI");
    }

    @Test
    public void test30351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30351");
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
        java.util.Locale locale25 = java.util.Locale.CANADA_FRENCH;
        java.util.Set<java.lang.Character> charSet26 = locale25.getExtensionKeys();
        java.lang.String str27 = locale9.getDisplayLanguage(locale25);
        java.util.Locale locale28 = java.util.Locale.ITALIAN;
        java.util.Set<java.lang.Character> charSet29 = locale28.getExtensionKeys();
        java.lang.String str30 = locale28.getVariant();
        java.lang.String str31 = locale28.getDisplayName();
        java.lang.String str32 = locale28.getVariant();
        java.lang.String str33 = locale9.getDisplayVariant(locale28);
        java.lang.String str34 = locale28.getScript();
        java.util.Locale locale35 = java.util.Locale.GERMAN;
        java.util.Locale locale36 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str37 = locale35.getDisplayName(locale36);
        java.util.Locale locale38 = locale35.stripExtensions();
        java.util.Locale locale39 = locale35.stripExtensions();
        java.lang.String str41 = locale35.getExtension('H');
        java.lang.String str42 = locale35.getDisplayVariant();
        java.lang.String str43 = locale28.getDisplayScript(locale35);
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
        org.junit.Assert.assertEquals(locale25.toString(), "fr_CA");
        org.junit.Assert.assertNotNull(charSet26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "fran\347ais" + "'", str27, "fran\347ais");
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "it");
        org.junit.Assert.assertNotNull(charSet29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "italien" + "'", str31, "italien");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "de");
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "allemand" + "'", str37, "allemand");
        org.junit.Assert.assertNotNull(locale38);
        org.junit.Assert.assertEquals(locale38.toString(), "de");
        org.junit.Assert.assertNotNull(locale39);
        org.junit.Assert.assertEquals(locale39.toString(), "de");
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
    }

    @Test
    public void test30352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30352");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale locale2 = builder0.build();
        java.util.Locale.Builder builder3 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder3.clear();
        java.util.Locale.Builder builder5 = builder3.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder7 = builder5.setLanguageTag("FRANZ\326SISCH (KANADA)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Invalid subtag: FRANZO?SISCH (KANADA) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test30353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30353");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.setLanguageTag("Italian");
        java.util.Locale.Builder builder4 = builder0.clearExtensions();
        java.util.Locale.Builder builder5 = builder0.clear();
        java.util.Locale locale7 = java.util.Locale.forLanguageTag("\\u0020");
        java.util.Locale.Builder builder8 = builder0.setLocale(locale7);
        java.util.Locale.Builder builder11 = builder0.setExtension('u', "Italian");
        java.util.Locale.Builder builder13 = builder0.setLanguageTag("ixii");
        java.util.Locale locale14 = java.util.Locale.GERMANY;
        java.util.Locale locale15 = locale14.stripExtensions();
        java.lang.String str17 = locale15.getExtension('G');
        java.util.Locale.Builder builder18 = builder0.setLocale(locale15);
        java.util.Locale locale20 = new java.util.Locale("en");
        boolean boolean21 = locale20.hasExtensions();
        java.util.Set<java.lang.String> strSet22 = locale20.getUnicodeLocaleKeys();
        java.util.Locale locale23 = java.util.Locale.ITALIAN;
        java.lang.String str24 = locale23.getDisplayLanguage();
        java.util.Locale locale25 = locale23.stripExtensions();
        java.lang.String str26 = locale25.getVariant();
        java.lang.String str27 = locale20.getDisplayLanguage(locale25);
        java.util.Locale.setDefault(locale25);
        java.lang.String str29 = locale25.getISO3Country();
        java.util.Locale locale30 = locale25.stripExtensions();
        java.util.Locale.Builder builder31 = builder0.setLocale(locale30);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "");
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "de_DE");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "de_DE");
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertEquals(locale20.toString(), "en");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(strSet22);
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "it");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "italien" + "'", str24, "italien");
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "it");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "inglese" + "'", str27, "inglese");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "it");
        org.junit.Assert.assertNotNull(builder31);
    }

    @Test
    public void test30354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30354");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("GBR");
        java.lang.String str2 = languageRange1.getRange();
        double double3 = languageRange1.getWeight();
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.split("Eagaash");
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray6);
        java.lang.String[] strArray11 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("HI!HI!", "fra", 117);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.replaceEach("\r", strArray6, strArray11);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray11);
        boolean boolean14 = languageRange1.equals((java.lang.Object) str13);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "gbr" + "'", str2, "gbr");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Eagaash" + "'", str7, "Eagaash");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\r" + "'", str12, "\r");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HI!HI!" + "'", str13, "HI!HI!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test30355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30355");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '4', 129);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void test30356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30356");
        java.util.Locale locale1 = new java.util.Locale("\\u005c");
        java.util.Locale locale3 = java.util.Locale.CHINESE;
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.lowerCase("Franz\366sisch (Frankreich)", locale3);
        java.lang.String str5 = locale3.getVariant();
        java.lang.String str6 = locale1.getDisplayScript(locale3);
        java.lang.String str7 = locale3.getVariant();
        java.lang.String str8 = locale3.getISO3Country();
        java.lang.String str9 = locale3.getScript();
        java.lang.Object obj10 = locale3.clone();
        org.junit.Assert.assertEquals(locale1.toString(), "\\u005c");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "franz\366sisch (frankreich)" + "'", str4, "franz\366sisch (frankreich)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertEquals(obj10.toString(), "zh");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj10), "zh");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj10), "zh");
    }

    @Test
    public void test30357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30357");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("franz\366sisch (frankreich)", "U0020ITALIANITALIANITALIANITALI", 116);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test30358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30358");
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
        java.util.Locale locale12 = builder10.build();
        java.lang.String str13 = locale12.getScript();
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
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test30359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30359");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfBlank("\\u0042", "FRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\u0042" + "'", str2, "\\u0042");
    }

    @Test
    public void test30360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30360");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("hcsineilatI", (int) 'b');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test30361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30361");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("zho                                                                    \\u0020italianitalianitalianitali", (int) 'Z');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                          \\u0020italianitalianitalianitali" + "'", str2, "                                                          \\u0020italianitalianitalianitali");
    }

    @Test
    public void test30362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30362");
        char[] charArray11 = new char[] { ' ', '4' };
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "HI!", charArray11);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!", charArray11);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "h", charArray11);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "h", charArray11);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "iTALIAN", charArray11);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "8600u\\", charArray11);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "\\U0078", charArray11);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "adaeafagaialamanaoaqarasatauawaxazbabbbdbebfbgbhbibjblbmbnbobqbrbsbtbvbwbybzcacccdcfcgchcickclcmcncocrcucvcwcxcyczded8...", charArray11);
        boolean boolean20 = org.apache.commons.lang3.StringUtils.containsAny("                                                                                                   HSadanacadanacGadanacE", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[ , 4]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test30363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30363");
        java.util.Locale locale0 = java.util.Locale.ROOT;
        java.lang.String str1 = locale0.getISO3Country();
        java.lang.String str2 = locale0.getDisplayVariant();
        java.lang.String str3 = locale0.getDisplayVariant();
        java.lang.String str4 = locale0.getDisplayName();
        java.util.Set<java.lang.String> strSet5 = locale0.getUnicodeLocaleKeys();
        java.util.Locale locale7 = java.util.Locale.forLanguageTag("\\u0020");
        java.lang.String str8 = locale7.getDisplayScript();
        java.lang.String str9 = locale0.getDisplayVariant(locale7);
        java.util.Locale.Builder builder10 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder11 = builder10.clearExtensions();
        java.util.Locale locale12 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str13 = locale12.getDisplayName();
        java.util.Locale.Builder builder14 = builder11.setLocale(locale12);
        java.util.Locale locale15 = java.util.Locale.GERMANY;
        java.util.Locale.Builder builder16 = builder11.setLocale(locale15);
        java.util.Set<java.lang.String> strSet17 = locale15.getUnicodeLocaleAttributes();
        java.lang.String str18 = locale15.getVariant();
        java.util.Locale locale19 = locale15.stripExtensions();
        java.util.Locale locale20 = locale15.stripExtensions();
        java.lang.String str21 = locale7.getDisplayName(locale15);
        java.lang.String str22 = locale7.getDisplayCountry();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "francese (Canada)" + "'", str13, "francese (Canada)");
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "de_DE");
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "de_DE");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test30364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30364");
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
        boolean boolean23 = org.apache.commons.lang3.StringUtils.containsAny("FRNZ\326SISCH (KND)FRNZ\326SISCH (KND)FRNZ\326SISCH (KND)FRNZ\326SISCH (KND)FRNZ\326SISCH (KND)FRNZ\326SISCH (KND)FRNZ\326SISCH (KND)FRNZ\326SISCH (KND)FRNZ\326SISCH (KND)FRNZ\326SISCH (KND)FRNZ\326SISCH (KND)", charArray13);
        int int24 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "nnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnhiHnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn", charArray13);
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
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test30365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30365");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale locale2 = java.util.Locale.UK;
        java.util.Locale.Builder builder3 = builder0.setLocale(locale2);
        java.util.Locale locale5 = java.util.Locale.forLanguageTag("\\U0020ITALIANITALIANITALIANITALI\\U0020ITALIANITALIANITALIANITAL");
        java.util.Locale.Builder builder6 = builder0.setLocale(locale5);
        java.lang.String str7 = locale5.getDisplayCountry();
        java.util.Locale locale8 = java.util.Locale.ITALIAN;
        java.lang.String str9 = locale8.getDisplayLanguage();
        java.util.Locale locale10 = java.util.Locale.ITALIAN;
        java.lang.String str12 = locale10.getExtension('h');
        java.lang.String str13 = locale8.getDisplayCountry(locale10);
        java.lang.String str14 = locale10.toLanguageTag();
        java.lang.String str15 = locale10.getDisplayLanguage();
        java.util.Locale.Builder builder16 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder17 = builder16.clearExtensions();
        java.util.Locale locale18 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str19 = locale18.getDisplayName();
        java.util.Locale.Builder builder20 = builder17.setLocale(locale18);
        java.util.Locale locale21 = java.util.Locale.GERMANY;
        java.util.Locale.Builder builder22 = builder17.setLocale(locale21);
        java.util.Set<java.lang.String> strSet23 = locale21.getUnicodeLocaleAttributes();
        java.lang.String str24 = locale21.getVariant();
        java.util.Locale locale25 = locale21.stripExtensions();
        java.util.Locale locale26 = locale21.stripExtensions();
        java.lang.String str27 = locale10.getDisplayLanguage(locale26);
        java.util.Set<java.lang.Character> charSet28 = locale26.getExtensionKeys();
        java.lang.String str29 = locale5.getDisplayName(locale26);
        java.lang.String str30 = locale26.getScript();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en_GB");
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "it");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "italiano" + "'", str9, "italiano");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "it");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "it" + "'", str14, "it");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "italiano" + "'", str15, "italiano");
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "francese (Canada)" + "'", str19, "francese (Canada)");
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "de_DE");
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(strSet23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "de_DE");
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Italienisch" + "'", str27, "Italienisch");
        org.junit.Assert.assertNotNull(charSet28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
    }

    @Test
    public void test30366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30366");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("\\0020ItalianItalianItalianItal", '\u671d');
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "k");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test30367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30367");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("HI!hi!", "         italian_ITALIAN_English", 574);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test30368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30368");
        java.util.Locale locale0 = java.util.Locale.ITALIAN;
        java.util.Set<java.lang.Character> charSet1 = locale0.getExtensionKeys();
        java.lang.String str3 = locale0.getExtension('a');
        java.lang.String str5 = locale0.getExtension('x');
        boolean boolean6 = locale0.hasExtensions();
        java.util.Locale locale8 = new java.util.Locale("AD4AE4AF4AG4AI4AL4AM4AN4AO4AQ4AR4AS4AT4AU4AW4AX4AZ4BA4BB4BD4BE4BF4BG4BH4BI4BJ4BL4BM4BN4BO4BQ4BR4BS4BT4BV4BW...R-FRAAAAAAAAAAAAAAAAAAAAAAAAAAAR-FRAAAAAAAAAAAAAAAAAAAAAAAAAAAR-FRAAAAAAAAAAAAAAAAAAAAAAAAAAAR-FRAAAAAAAAAAAAAAAAAAAAAAAAAAAR-FRAAAAAAAAAAAAAAAAAAAAAAAAAAAR-FRAAAAAAAAAAAAAAAAAAAAAAAAAAAR-FRAAAAAAAAAAAAAAAAAAAAAAAAAAAR-FRAAAAAAAAAAAAAAAAAAAAAAAAAAAR-FRAAAAAAAAAAAAAAAAAAAAAAAAAAAR-FRAAAAAAAAAAAAAAAAAAAAAAAAAAAR-FRAAAAAAAAAAAAAAAAAAAAAAAAAAAR-FRAAAAAAAAAAAAAAAAAAAAAAAAAAAR-FRAAAAAAAAAAAAAAAAAAAAAAAAAAAR-FRAAAAAAAAAAAAAAAAAAAAAAAAAAAR-FRAAAAAAAAAAAAAAAAAAAAAAAAAAAR-FRAAAAAAAAAAAAAAAAAAAAAAAAAAAR-FRAAAAAAAAAAAAAAAAAAAAAAAAAAAR-FRAAAAAAAAAAAAAAAAAAAAAAAAAAAR-FRAAAAAAAAAAAAAAAAAAAAAAAAAAAR-FRAAAAAAAAAAAAAAAAA");
        java.lang.String str9 = locale0.getDisplayCountry(locale8);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it");
        org.junit.Assert.assertNotNull(charSet1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals(locale8.toString(), "ad4ae4af4ag4ai4al4am4an4ao4aq4ar4as4at4au4aw4ax4az4ba4bb4bd4be4bf4bg4bh4bi4bj4bl4bm4bn4bo4bq4br4bs4bt4bv4bw...r-fraaaaaaaaaaaaaaaaaaaaaaaaaaar-fraaaaaaaaaaaaaaaaaaaaaaaaaaar-fraaaaaaaaaaaaaaaaaaaaaaaaaaar-fraaaaaaaaaaaaaaaaaaaaaaaaaaar-fraaaaaaaaaaaaaaaaaaaaaaaaaaar-fraaaaaaaaaaaaaaaaaaaaaaaaaaar-fraaaaaaaaaaaaaaaaaaaaaaaaaaar-fraaaaaaaaaaaaaaaaaaaaaaaaaaar-fraaaaaaaaaaaaaaaaaaaaaaaaaaar-fraaaaaaaaaaaaaaaaaaaaaaaaaaar-fraaaaaaaaaaaaaaaaaaaaaaaaaaar-fraaaaaaaaaaaaaaaaaaaaaaaaaaar-fraaaaaaaaaaaaaaaaaaaaaaaaaaar-fraaaaaaaaaaaaaaaaaaaaaaaaaaar-fraaaaaaaaaaaaaaaaaaaaaaaaaaar-fraaaaaaaaaaaaaaaaaaaaaaaaaaar-fraaaaaaaaaaaaaaaaaaaaaaaaaaar-fraaaaaaaaaaaaaaaaaaaaaaaaaaar-fraaaaaaaaaaaaaaaaaaaaaaaaaaar-fraaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test30369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30369");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.util.Locale locale1 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str2 = locale0.getDisplayScript(locale1);
        java.lang.String str3 = locale1.getVariant();
        java.util.Locale locale5 = new java.util.Locale("");
        java.util.Locale.setDefault(locale5);
        java.lang.String str7 = locale1.getDisplayName(locale5);
        java.util.Locale locale9 = new java.util.Locale("\\u0068");
        boolean boolean10 = locale9.hasExtensions();
        java.util.Locale locale13 = new java.util.Locale("!IH", "Hhhhhhhhhh");
        java.lang.String str14 = locale13.getDisplayLanguage();
        java.lang.String str15 = locale9.getDisplayName(locale13);
        java.lang.String str16 = locale9.getDisplayCountry();
        java.lang.String str17 = locale1.getDisplayCountry(locale9);
        java.lang.String str18 = locale1.getScript();
        java.util.Locale locale22 = new java.util.Locale("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaFranz\366sisch (Kanada)", "ZH_CN", "");
        java.lang.String str23 = locale1.getDisplayName(locale22);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals(locale5.toString(), "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "French (Canada)" + "'", str7, "French (Canada)");
        org.junit.Assert.assertEquals(locale9.toString(), "\\u0068");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals(locale13.toString(), "!ih_HHHHHHHHHH");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "!ih" + "'", str14, "!ih");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\\u0068" + "'", str15, "\\u0068");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Canada" + "'", str17, "Canada");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals(locale22.toString(), "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaafranz\366sisch (kanada)_ZH_CN");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "French (Canada)" + "'", str23, "French (Canada)");
    }

    @Test
    public void test30370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30370");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("fr");
        java.util.Locale.LanguageRange[] languageRangeArray2 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList3 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList3, languageRangeArray2);
        java.util.Locale.LanguageRange[] languageRangeArray5 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList6 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList6, languageRangeArray5);
        java.lang.String[] strArray10 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList11 = new java.util.ArrayList<java.lang.String>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList11, strArray10);
        java.util.Locale.FilteringMode filteringMode13 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList14 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList6, (java.util.Collection<java.lang.String>) strList11, filteringMode13);
        java.util.Locale.FilteringMode filteringMode15 = java.util.Locale.FilteringMode.AUTOSELECT_FILTERING;
        java.util.List<java.lang.String> strList16 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList3, (java.util.Collection<java.lang.String>) strList11, filteringMode15);
        java.util.Locale.FilteringMode filteringMode17 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList18 = java.util.Locale.filterTags(languageRangeList1, (java.util.Collection<java.lang.String>) strList11, filteringMode17);
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.lang.String>) strList11, 'Y');
        java.lang.String str22 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.lang.String>) strList11, 'D');
        org.junit.Assert.assertNotNull(languageRangeList1);
        org.junit.Assert.assertNotNull(languageRangeArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(languageRangeArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + filteringMode13 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode13.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertTrue("'" + filteringMode15 + "' != '" + java.util.Locale.FilteringMode.AUTOSELECT_FILTERING + "'", filteringMode15.equals(java.util.Locale.FilteringMode.AUTOSELECT_FILTERING));
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertTrue("'" + filteringMode17 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode17.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Yhi!" + "'", str20, "Yhi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Dhi!" + "'", str22, "Dhi!");
    }

    @Test
    public void test30371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30371");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfBlank((java.lang.CharSequence) "dnamezhzhzhzhzhzhzAhzSAhzRAhzQAhzOAhzNAhzMAhzLAhzIAhzGAhzFAhzEAhzDAARFhzhzhzhzhzhzhzhzhzhz", (java.lang.CharSequence) "NAILAT");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "dnamezhzhzhzhzhzhzAhzSAhzRAhzQAhzOAhzNAhzMAhzLAhzIAhzGAhzFAhzEAhzDAARFhzhzhzhzhzhzhzhzhzhz" + "'", charSequence2, "dnamezhzhzhzhzhzhzAhzSAhzRAhzQAhzOAhzNAhzMAhzLAhzIAhzGAhzFAhzEAhzDAARFhzhzhzhzhzhzhzhzhzhz");
    }

    @Test
    public void test30372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30372");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("FgenceFgenceFgenceFgenceFgenceFgenceFgenc", "anglais (Royaume-Uni)");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test30373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30373");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale locale2 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str3 = locale2.getDisplayName();
        java.util.Locale.Builder builder4 = builder1.setLocale(locale2);
        java.util.Locale.Builder builder5 = builder4.clear();
        java.util.Locale.Builder builder6 = builder4.clearExtensions();
        java.util.Locale.Builder builder7 = builder4.clearExtensions();
        java.util.Locale locale8 = java.util.Locale.FRANCE;
        java.util.Locale locale9 = java.util.Locale.ITALIAN;
        java.lang.String str11 = locale9.getExtension('h');
        java.lang.String str12 = locale8.getDisplayScript(locale9);
        java.lang.String str13 = locale8.getISO3Country();
        java.util.Locale locale14 = locale8.stripExtensions();
        java.util.Locale.Builder builder15 = builder4.setLocale(locale14);
        java.lang.String str16 = locale14.toLanguageTag();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "French (Canada)" + "'", str3, "French (Canada)");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "it");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "FRA" + "'", str13, "FRA");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "fr-FR" + "'", str16, "fr-FR");
    }

    @Test
    public void test30374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30374");
        java.util.Locale locale2 = new java.util.Locale("Chinese", "HHHHHHHHH         ITALIAN_italian_eNGLISH         ITALIAN_!IHitTAiT_ITALIAN_EgAis");
        org.junit.Assert.assertEquals(locale2.toString(), "chinese_HHHHHHHHH         ITALIAN_ITALIAN_ENGLISH         ITALIAN_!IHITTAIT_ITALIAN_EGAIS");
    }

    @Test
    public void test30375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30375");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("           \\u           \\u           \\u           \\u           \\", ')');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "           \\u           \\u           \\u           \\u           \\" + "'", str2, "           \\u           \\u           \\u           \\u           \\");
    }

    @Test
    public void test30376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30376");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '5', (int) '\\');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
    }

    @Test
    public void test30377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30377");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("frtatiIi2tatat", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test30378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30378");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "           5555555555           ", (java.lang.CharSequence) "neilRtI    E");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test30379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30379");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.setLanguageTag("Italian");
        java.util.Locale locale4 = java.util.Locale.PRC;
        java.lang.String str5 = locale4.getDisplayName();
        java.util.Locale.Builder builder6 = builder0.setLocale(locale4);
        java.util.Locale.Builder builder8 = builder6.removeUnicodeLocaleAttribute("china");
        java.util.Locale.Builder builder9 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder10 = builder9.clear();
        java.util.Locale locale11 = java.util.Locale.UK;
        java.util.Locale.Builder builder12 = builder9.setLocale(locale11);
        java.util.Locale.setDefault(locale11);
        java.util.Locale locale15 = new java.util.Locale("en");
        boolean boolean16 = locale15.hasExtensions();
        java.util.Set<java.lang.String> strSet17 = locale15.getUnicodeLocaleKeys();
        java.util.Locale locale18 = java.util.Locale.ITALIAN;
        java.lang.String str19 = locale18.getDisplayLanguage();
        java.util.Locale locale20 = locale18.stripExtensions();
        java.lang.String str21 = locale20.getVariant();
        java.lang.String str22 = locale15.getDisplayLanguage(locale20);
        java.lang.String str23 = locale11.getDisplayVariant(locale15);
        java.lang.String str24 = locale11.getVariant();
        java.util.Locale.Builder builder25 = builder6.setLocale(locale11);
        java.util.Locale.Builder builder27 = builder6.setLanguage("");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder29 = builder27.setLanguageTag("\\u00de\\u00\\u00de\\u00\\u00d         INGLESE       ");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Invalid subtag: \\u00de\\u00\\u00de\\u00\\u00d         INGLESE        [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Chinese (China)" + "'", str5, "Chinese (China)");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "en_GB");
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertEquals(locale15.toString(), "en");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "it");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Italian" + "'", str19, "Italian");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "it");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "inglese" + "'", str22, "inglese");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder27);
    }

    @Test
    public void test30380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30380");
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
        java.util.Locale locale14 = java.util.Locale.KOREA;
        java.util.Locale.Builder builder15 = builder13.setLocale(locale14);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder18 = builder13.setUnicodeLocaleKeyword("uD                                             \\U0034", "");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: uD                                             \\U0034 [at index 0]");
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
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(builder15);
    }

    @Test
    public void test30381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30381");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale locale2 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str3 = locale2.getDisplayName();
        java.util.Locale.Builder builder4 = builder1.setLocale(locale2);
        java.util.Locale.Builder builder5 = builder1.clearExtensions();
        java.util.Locale.Builder builder6 = builder1.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder8 = builder6.setRegion("                                               nailati                                                ");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region:                                                nailati                                                 [at index 0]");
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
    }

    @Test
    public void test30382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30382");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("         ", '\\');
        int int3 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray2);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "         " + "'", str4, "         ");
    }

    @Test
    public void test30383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30383");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList6 = new java.util.ArrayList<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList6, strArray5);
        java.util.Locale.FilteringMode filteringMode8 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList9 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strList6, filteringMode8);
        java.util.Locale.LanguageRange[] languageRangeArray10 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList11 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList11, languageRangeArray10);
        java.lang.String[] strArray15 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList16 = new java.util.ArrayList<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList16, strArray15);
        java.util.Locale.FilteringMode filteringMode18 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList19 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList11, (java.util.Collection<java.lang.String>) strList16, filteringMode18);
        java.lang.String[] strArray21 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList22 = new java.util.ArrayList<java.lang.String>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList22, strArray21);
        java.util.List<java.lang.String> strList24 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList11, (java.util.Collection<java.lang.String>) strList22);
        java.lang.String str25 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strList22);
        java.util.Locale.LanguageRange[] languageRangeArray26 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList27 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList27, languageRangeArray26);
        java.lang.String[] strArray31 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList32 = new java.util.ArrayList<java.lang.String>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList32, strArray31);
        java.util.Locale.FilteringMode filteringMode34 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList35 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList27, (java.util.Collection<java.lang.String>) strList32, filteringMode34);
        java.lang.String[] strArray37 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList38 = new java.util.ArrayList<java.lang.String>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList38, strArray37);
        java.util.List<java.lang.String> strList40 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList27, (java.util.Collection<java.lang.String>) strList38);
        java.lang.String str41 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strList38);
        java.util.Locale.Builder builder42 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder43 = builder42.clear();
        java.util.Locale locale44 = java.util.Locale.UK;
        java.util.Locale.Builder builder45 = builder42.setLocale(locale44);
        java.util.Set<java.lang.String> strSet46 = locale44.getUnicodeLocaleAttributes();
        java.lang.String str48 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.lang.String>) strSet46, "HI!HI!");
        java.lang.String str49 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strSet46);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap50 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList51 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap50);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap53 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList54 = java.util.Locale.LanguageRange.parse("FRA", strMap53);
        java.util.Locale.LanguageRange[] languageRangeArray55 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList56 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList56, languageRangeArray55);
        java.util.Locale.LanguageRange[] languageRangeArray58 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList59 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList59, languageRangeArray58);
        java.lang.String[] strArray63 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList64 = new java.util.ArrayList<java.lang.String>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList64, strArray63);
        java.util.Locale.FilteringMode filteringMode66 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList67 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList59, (java.util.Collection<java.lang.String>) strList64, filteringMode66);
        java.util.Locale.FilteringMode filteringMode68 = java.util.Locale.FilteringMode.AUTOSELECT_FILTERING;
        java.util.List<java.lang.String> strList69 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList56, (java.util.Collection<java.lang.String>) strList64, filteringMode68);
        java.util.Collection<java.util.Locale> localeCollection70 = null;
        java.util.List<java.util.Locale> localeList71 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList56, localeCollection70);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap73 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList74 = java.util.Locale.LanguageRange.parse("francese", strMap73);
        java.util.Locale locale76 = java.util.Locale.ITALIAN;
        java.lang.String str77 = org.apache.commons.lang3.StringUtils.upperCase("de_DE", locale76);
        java.util.Set<java.lang.String> strSet78 = locale76.getUnicodeLocaleKeys();
        java.lang.String str79 = java.util.Locale.lookupTag(languageRangeList74, (java.util.Collection<java.lang.String>) strSet78);
        java.util.Locale locale80 = java.util.Locale.GERMAN;
        java.util.Locale locale81 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str82 = locale80.getDisplayName(locale81);
        java.util.Set<java.lang.String> strSet83 = locale80.getUnicodeLocaleAttributes();
        java.util.Locale.FilteringMode filteringMode84 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList85 = java.util.Locale.filterTags(languageRangeList74, (java.util.Collection<java.lang.String>) strSet83, filteringMode84);
        java.util.List<java.util.Locale> localeList86 = java.util.Locale.filter(languageRangeList54, (java.util.Collection<java.util.Locale>) localeList71, filteringMode84);
        java.util.List<java.util.Locale> localeList87 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.util.Locale>) localeList86);
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + filteringMode8 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode8.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(languageRangeArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + filteringMode18 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode18.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList19);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(languageRangeArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + filteringMode34 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode34.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList35);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(strList40);
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertNotNull(locale44);
        org.junit.Assert.assertEquals(locale44.toString(), "en_GB");
        org.junit.Assert.assertNotNull(builder45);
        org.junit.Assert.assertNotNull(strSet46);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertNull(str49);
        org.junit.Assert.assertNotNull(languageRangeList51);
        org.junit.Assert.assertNotNull(languageRangeList54);
        org.junit.Assert.assertNotNull(languageRangeArray55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(languageRangeArray58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(strArray63);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertTrue("'" + filteringMode66 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode66.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList67);
        org.junit.Assert.assertTrue("'" + filteringMode68 + "' != '" + java.util.Locale.FilteringMode.AUTOSELECT_FILTERING + "'", filteringMode68.equals(java.util.Locale.FilteringMode.AUTOSELECT_FILTERING));
        org.junit.Assert.assertNotNull(strList69);
        org.junit.Assert.assertNotNull(localeList71);
        org.junit.Assert.assertNotNull(languageRangeList74);
        org.junit.Assert.assertNotNull(locale76);
        org.junit.Assert.assertEquals(locale76.toString(), "it");
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "DE_DE" + "'", str77, "DE_DE");
        org.junit.Assert.assertNotNull(strSet78);
        org.junit.Assert.assertNull(str79);
        org.junit.Assert.assertNotNull(locale80);
        org.junit.Assert.assertEquals(locale80.toString(), "de");
        org.junit.Assert.assertNotNull(locale81);
        org.junit.Assert.assertEquals(locale81.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "allemand" + "'", str82, "allemand");
        org.junit.Assert.assertNotNull(strSet83);
        org.junit.Assert.assertTrue("'" + filteringMode84 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode84.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList85);
        org.junit.Assert.assertNotNull(localeList86);
        org.junit.Assert.assertNotNull(localeList87);
    }

    @Test
    public void test30384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30384");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("JP", 9);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test30385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30385");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("\\u0034\\u00                                             hcstued                                             \\u0034\\u00 (\\U0020IITALIAN\\U0020I)", "00000000000000000000CCCC\\CCCC0000000000000000000000000000000000000000000000000000000");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\u0034\\u00                                             hcstued                                             \\u0034\\u00 (\\U0020IITALIAN\\U0020I)" + "'", str2, "\\u0034\\u00                                             hcstued                                             \\u0034\\u00 (\\U0020IITALIAN\\U0020I)");
    }

    @Test
    public void test30386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30386");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("\\u0063");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\u0063" + "'", str1, "\\u0063");
    }

    @Test
    public void test30387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30387");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC\\u00d\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\U0020ITALIANITALIANITALIANITALI\\U0020ITALIANITALIANITALIANITAL\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\u00CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC", "      \\u00de\\u00\\u00de\\u00\\u00d         INGLESE       O");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test30388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30388");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("NC_hzitalieital", (int) 'x', (int) '\u6cd5');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "NC_hzitalieital" + "'", str3, "NC_hzitalieital");
    }

    @Test
    public void test30389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30389");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                                                    ", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaFranz\366sisch (Kanada)");
        boolean boolean4 = org.apache.commons.lang3.StringUtils.startsWithAny("ITALIAN (ITALIAN,ENGLCOR\311ENCOR\311ENCOR\311ENCOR\311ENCOR\311ENCOR\311ENCOR\311ENCOR\311ENCOR\311ENCOR\311ENCOR\311ENCOR\311ENCOR\311ENCOR\311ENCOR\311ENCOR\311ENCOR", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test30390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30390");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("                                      ...                                                                                ", 120, (int) '7');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " " + "'", str3, " ");
    }

    @Test
    public void test30391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30391");
        java.util.Locale locale0 = java.util.Locale.GERMAN;
        java.util.Locale locale1 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str2 = locale0.getDisplayName(locale1);
        java.util.Locale.Category category3 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale4 = java.util.Locale.getDefault(category3);
        java.lang.String str5 = locale1.getDisplayVariant(locale4);
        java.util.Locale locale6 = locale1.stripExtensions();
        java.lang.String str7 = locale1.getDisplayScript();
        java.util.Set<java.lang.String> strSet8 = locale1.getUnicodeLocaleAttributes();
        java.lang.String str9 = locale1.getCountry();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "de");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "allemand" + "'", str2, "allemand");
        org.junit.Assert.assertTrue("'" + category3 + "' != '" + java.util.Locale.Category.FORMAT + "'", category3.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "CA" + "'", str9, "CA");
    }

    @Test
    public void test30392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30392");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("!       2italianitalianitalianitaliTALIENISCH2italianitalianitalianitalITALIAN_italian_eNGLISH2italianitalianitalianitalhi!2italianitalianitalianitalHI!2italianitalianitalianitaladaeafagaialamanaoaqarasatauawaxazbabbbdbebfbgbhbibjblbmbnbobqbrbsbtbvbwbybzcacccdcfcgchcickclcmcncocrcucvcwcxcyczded...2italianitalianitalianital\\U00342italianitalianitalianitalhi!2italianitalianitalianitaliTALIAN2italianitalianitalianital\\U00612italianitalianitalianital\\U00232italianitalianitalianitalHI!2italianitalianitalianitalItalian2italianitalianitalianitalcHINESE (cHINA)2italianitalianitalianitalHI!2italianitalianitalianitalZH_cn2italianitalianitalianitalItalian2italianitalianitalianitalEN2italianitalianitalianitaliTALIENISCH");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test30393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30393");
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
        java.util.Locale locale20 = java.util.Locale.getDefault(category0);
        java.lang.String str21 = locale20.getScript();
        java.lang.String str22 = locale20.getDisplayName();
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
        org.junit.Assert.assertEquals(locale20.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "French (France)" + "'", str22, "French (France)");
    }

    @Test
    public void test30394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30394");
        char[] charArray4 = new char[] { ' ' };
        boolean boolean5 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "hi!", charArray4);
        int int6 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "\\u0020iTALIANiTALIANiTALIANiTALI", charArray4);
        boolean boolean7 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "REHEGEEECEZDODMDKDJDEDZCYCXCWCVCUCRCOCNCMCLCKCICHCGCFCDCCCACZBY", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), " ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), " ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[ ]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test30395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30395");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("hcsnela                                                ", 713, 'g');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hcsnela                                                gggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggg" + "'", str3, "hcsnela                                                gggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggg");
    }

    @Test
    public void test30396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30396");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("  \\u0020iTALIANiTALIANiTALIANiTAL  ", "\u82f1\u6587");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test30397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30397");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.setLanguageTag("Italian");
        java.util.Locale locale4 = builder3.build();
        java.util.Locale locale5 = builder3.build();
        java.lang.String str6 = locale5.getISO3Country();
        java.util.Set<java.lang.String> strSet7 = locale5.getUnicodeLocaleAttributes();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "italian");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "italian");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(strSet7);
    }

    @Test
    public void test30398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30398");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder12 = builder9.addUnicodeLocaleAttribute("iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiifrancese (Francia)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiifrancese (Francia) [at index 0]");
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
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "ko");
    }

    @Test
    public void test30399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30399");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("Cen-G\\u0038zho                         CHD", '7');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Cen-G\\u0038zho                         CHD" + "'", str2, "Cen-G\\u0038zho                         CHD");
    }

    @Test
    public void test30400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30400");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "ian\\u0020i", (java.lang.CharSequence) "iTTAIT_ITALIAN_EGAISH          ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test30401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30401");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("IIIIIIIIII", 67, "                eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee                 ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeIIIIIIIIII" + "'", str3, "                eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeIIIIIIIIII");
    }

    @Test
    public void test30402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30402");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("AAAAAAAAAAAAAAAAAAAAAAAAAA)aHI0200U\\NAIHAAAAAAAAAAAAAAAAAAAAAAAAAA)a", 76, 26397);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAA)aHI0200U\\NAIHAAAAAAAAAAAAAAAAAAAAAAAAAA)a" + "'", str3, "AAAAAAAAAAAAAAAAAAAAAAAAAA)aHI0200U\\NAIHAAAAAAAAAAAAAAAAAAAAAAAAAA)a");
    }

    @Test
    public void test30403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30403");
        java.util.Locale.Category category0 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale1 = java.util.Locale.getDefault(category0);
        java.util.Locale locale2 = java.util.Locale.FRANCE;
        java.util.Locale locale3 = java.util.Locale.ITALIAN;
        java.lang.String str5 = locale3.getExtension('h');
        java.lang.String str6 = locale2.getDisplayScript(locale3);
        java.lang.String str7 = locale2.getISO3Country();
        java.util.Locale locale8 = java.util.Locale.GERMAN;
        java.util.Locale.setDefault(locale8);
        java.lang.String str10 = locale2.getDisplayName(locale8);
        java.lang.String str11 = locale2.getScript();
        java.util.Locale.setDefault(category0, locale2);
        java.util.Set<java.lang.String> strSet13 = locale2.getUnicodeLocaleKeys();
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.lang.String>) strSet13, '#');
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.lang.String>) strSet13, "e                               e                               e        ");
        java.lang.Class<?> wildcardClass18 = strSet13.getClass();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "\\u005c");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "it");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "FRA" + "'", str7, "FRA");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "de");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Franz\366sisch (Frankreich)" + "'", str10, "Franz\366sisch (Frankreich)");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test30404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30404");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("n Italienisch", "WBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDED...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "n Italienisch" + "'", str2, "n Italienisch");
    }

    @Test
    public void test30405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30405");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "BFIBGIBHIBIIBJIBLIBMIBNIBOIBQIBRIBSIBTIBVIBWIBYIBZICAICCICDICFICGICHICIICKICLICMICNICOICRICUICVICWICXICYICZIDEIDJIDKIDMIDOIDZIECIEEIEGIEHIERIESIETIFIIFJIFKIFMIFOIFRIGAIGBIGDIGEIGFIGGIGHIGIIGLIGMIGNIGPIGQIGRIGSIGTIGUIGWIGYIHKIHM");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test30406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30406");
        java.util.Locale locale0 = java.util.Locale.FRENCH;
        java.util.Locale locale1 = java.util.Locale.ENGLISH;
        java.lang.String str2 = locale1.getDisplayCountry();
        java.lang.String str3 = locale0.getDisplayVariant(locale1);
        java.util.Set<java.lang.String> strSet4 = locale0.getUnicodeLocaleKeys();
        java.util.Locale locale5 = java.util.Locale.ITALIAN;
        java.lang.String str6 = locale5.getDisplayLanguage();
        java.util.Locale locale7 = locale5.stripExtensions();
        java.lang.String str8 = locale7.getVariant();
        java.lang.String str9 = locale0.getDisplayVariant(locale7);
        java.lang.String str10 = locale7.getVariant();
        java.lang.String str11 = locale7.toString();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "it");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "italien" + "'", str6, "italien");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "it");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "it" + "'", str11, "it");
    }

    @Test
    public void test30407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30407");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("Frankreich", 'E');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Frankreich" + "'", str2, "Frankreich");
    }

    @Test
    public void test30408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30408");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("italian_ITALIAN_EnglisFitalian (italian,englis");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "italian_italian_englisfitalian (italian,englis" + "'", str1, "italian_italian_englisfitalian (italian,englis");
    }

    @Test
    public void test30409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30409");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("  ", "00000000000000coreen (Coree du Sud)", 7);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test30410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30410");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.util.Locale locale1 = java.util.Locale.ITALIAN;
        java.lang.String str3 = locale1.getExtension('h');
        java.lang.String str4 = locale0.getDisplayScript(locale1);
        java.util.Locale locale5 = locale0.stripExtensions();
        java.util.Set<java.lang.Character> charSet6 = locale5.getExtensionKeys();
        java.util.Locale locale8 = java.util.Locale.ENGLISH;
        java.lang.String str9 = locale8.getDisplayLanguage();
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.upperCase("!IH", locale8);
        java.lang.String str11 = locale8.getCountry();
        java.lang.String str12 = locale8.getCountry();
        boolean boolean13 = locale8.hasExtensions();
        java.lang.String str14 = locale5.getDisplayVariant(locale8);
        java.lang.String str16 = locale8.getExtension('a');
        java.util.Locale locale17 = locale8.stripExtensions();
        java.util.Set<java.lang.String> strSet18 = locale8.getUnicodeLocaleAttributes();
        boolean boolean19 = locale8.hasExtensions();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "it");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(charSet6);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "en");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "anglais" + "'", str9, "anglais");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "!IH" + "'", str10, "!IH");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "en");
        org.junit.Assert.assertNotNull(strSet18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test30411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30411");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("itTAiT_ITALIAN_EgAish                                                                               ", "                                                                                                                                                                                                     englisCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCEgschCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCALIAN_ENGLISH,\\u0061)", (int) 'R');
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test30412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30412");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) " \n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test30413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30413");
        java.util.Locale locale1 = java.util.Locale.ENGLISH;
        java.lang.String str2 = locale1.getDisplayLanguage();
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.upperCase("!IH", locale1);
        java.lang.String str5 = locale1.getExtension('x');
        java.util.Locale locale8 = new java.util.Locale("\\u0020iTALIANiTALIANiTALIANiTALI", "French (Canada)");
        java.lang.String str9 = locale1.getDisplayScript(locale8);
        java.util.Set<java.lang.Character> charSet10 = locale8.getExtensionKeys();
        java.util.Locale locale13 = new java.util.Locale("    ...EnglishEn", "\\u0023");
        java.lang.String str14 = locale8.getDisplayVariant(locale13);
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "English" + "'", str2, "English");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!IH" + "'", str3, "!IH");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals(locale8.toString(), "\\u0020italianitalianitalianitali_FRENCH (CANADA)");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(charSet10);
        org.junit.Assert.assertEquals(locale13.toString(), "    ...englishen_\\U0023");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test30414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30414");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("FRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhAeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee", "                          fRENCH");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test30415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30415");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("\\u0047", '5');
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\u0047" + "'", str3, "\\u0047");
    }

    @Test
    public void test30416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30416");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("\\u0023", "\\");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, 'F');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "u0023" + "'", str4, "u0023");
    }

    @Test
    public void test30417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30417");
        java.util.Locale locale3 = new java.util.Locale("\\0020iTALIANiTALIANiTALIANiTAL", "FRANZOSISCH(FRANKREICH)");
        java.util.Locale locale7 = new java.util.Locale("HI!       ", "\\U0020", "Italienisch#########################################################################################");
        java.util.Locale locale8 = locale7.stripExtensions();
        java.util.Locale locale9 = locale8.stripExtensions();
        java.lang.String str10 = locale8.toLanguageTag();
        java.util.Locale locale12 = new java.util.Locale("en");
        boolean boolean13 = locale12.hasExtensions();
        java.util.Set<java.lang.String> strSet14 = locale12.getUnicodeLocaleKeys();
        java.lang.String str15 = locale8.getDisplayName(locale12);
        java.util.Locale locale19 = new java.util.Locale("HI!       ", "\\U0020", "Italienisch#########################################################################################");
        java.util.Locale locale20 = locale19.stripExtensions();
        java.lang.String str21 = locale12.getDisplayName(locale20);
        java.lang.String str22 = locale12.getCountry();
        java.util.Locale locale23 = java.util.Locale.GERMAN;
        java.util.Locale locale24 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str25 = locale23.getDisplayName(locale24);
        java.util.Locale.Category category26 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale27 = java.util.Locale.getDefault(category26);
        java.lang.String str28 = locale24.getDisplayVariant(locale27);
        java.util.Locale locale29 = java.util.Locale.GERMAN;
        java.util.Locale locale30 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str31 = locale29.getDisplayName(locale30);
        java.util.Locale locale32 = java.util.Locale.UK;
        java.util.Locale locale33 = java.util.Locale.GERMAN;
        java.util.Locale locale34 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str35 = locale33.getDisplayName(locale34);
        java.util.Locale locale36 = locale33.stripExtensions();
        java.lang.String str37 = locale32.getDisplayVariant(locale33);
        java.lang.String str38 = locale30.getDisplayLanguage(locale33);
        java.lang.String str39 = locale27.getDisplayName(locale30);
        java.lang.String str40 = locale12.getDisplayVariant(locale30);
        java.util.Locale locale41 = java.util.Locale.FRANCE;
        java.util.Locale locale42 = java.util.Locale.ITALIAN;
        java.lang.String str44 = locale42.getExtension('h');
        java.lang.String str45 = locale41.getDisplayScript(locale42);
        java.lang.String str46 = locale41.getISO3Country();
        java.util.Locale locale47 = java.util.Locale.GERMAN;
        java.util.Locale.setDefault(locale47);
        java.lang.String str49 = locale41.getDisplayName(locale47);
        java.lang.String str50 = locale41.getScript();
        java.lang.String str51 = locale12.getDisplayVariant(locale41);
        java.util.Locale locale53 = new java.util.Locale("HHHHHHHHH");
        java.lang.String str54 = locale12.getDisplayVariant(locale53);
        java.lang.String str55 = locale3.getDisplayName(locale53);
        java.lang.String str56 = org.apache.commons.lang3.StringUtils.upperCase("rEGNO uNITO", locale53);
        org.junit.Assert.assertEquals(locale3.toString(), "\\0020italianitalianitalianital_FRANZOSISCH(FRANKREICH)");
        org.junit.Assert.assertEquals(locale7.toString(), "hi!       _\\U0020_Italienisch#########################################################################################");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "hi!       _\\U0020_Italienisch#########################################################################################");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "hi!       _\\U0020_Italienisch#########################################################################################");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "und" + "'", str10, "und");
        org.junit.Assert.assertEquals(locale12.toString(), "en");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!        (\\U0020,Italienisch#########################################################################################)" + "'", str15, "hi!        (\\U0020,Italienisch#########################################################################################)");
        org.junit.Assert.assertEquals(locale19.toString(), "hi!       _\\U0020_Italienisch#########################################################################################");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "hi!       _\\U0020_Italienisch#########################################################################################");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "English" + "'", str21, "English");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "de");
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "allemand" + "'", str25, "allemand");
        org.junit.Assert.assertTrue("'" + category26 + "' != '" + java.util.Locale.Category.FORMAT + "'", category26.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale27);
// flaky:         org.junit.Assert.assertEquals(locale27.toString(), "hi!       _\\U0020_Italienisch#########################################################################################");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "de");
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "allemand" + "'", str31, "allemand");
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "en_GB");
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "de");
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "allemand" + "'", str35, "allemand");
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "de");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "Franz\366sisch" + "'", str38, "Franz\366sisch");
// flaky:         org.junit.Assert.assertEquals("'" + str39 + "' != '" + "hi!        (\\U0020,Italienisch#########################################################################################)" + "'", str39, "hi!        (\\U0020,Italienisch#########################################################################################)");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertNotNull(locale41);
        org.junit.Assert.assertEquals(locale41.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale42);
        org.junit.Assert.assertEquals(locale42.toString(), "it");
        org.junit.Assert.assertNull(str44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "FRA" + "'", str46, "FRA");
        org.junit.Assert.assertNotNull(locale47);
        org.junit.Assert.assertEquals(locale47.toString(), "de");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "Franz\366sisch (Frankreich)" + "'", str49, "Franz\366sisch (Frankreich)");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertEquals(locale53.toString(), "hhhhhhhhh");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "\\0020italianitalianitalianital (FRANZOSISCH(FRANKREICH))" + "'", str55, "\\0020italianitalianitalianital (FRANZOSISCH(FRANKREICH))");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "REGNO UNITO" + "'", str56, "REGNO UNITO");
    }

    @Test
    public void test30418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30418");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("ian\\u0020i");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test30419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30419");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("", "de                                                                                                                      ##");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test30420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30420");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "_USEN_USEN_USEN_USEN_U         italian_italian_englishEN_USEN_USEN_USEN_USEN_US", (java.lang.CharSequence) "italian (italian,english)");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 59 + "'", int2 == 59);
    }

    @Test
    public void test30421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30421");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("BGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGTALIAN", "IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIITALIAN_ITALIAN_ENGLISHIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII", 0);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "BBBBBBBBBBBBBBBBBBBBBBBBBBBBBB" + "'", str4, "BBBBBBBBBBBBBBBBBBBBBBBBBBBBBB");
    }

    @Test
    public void test30422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30422");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("i\\u0020iTALIANiTALIANiTALIANiTALIit    \\        \\        \\        \\        \\        \\        \\        \\        \\        \\        \\        \\        \\        \\        \\        \\        \\        \\        \\        \\        \\        \\        \\        \\        \\        \\        \\        \\        \\        \\        \\        \\        \\        \\        \\        \\        \\        \\        \\        \\        \\        \\        \\        \\        \\        \\        \\        \\        \\        \\        \\        \\", 24, 'b');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "i\\u0020iTALIANiTALIANiTALIANiTALIit    \\        \\        \\        \\        \\        \\        \\        \\        \\        \\        \\        \\        \\        \\        \\        \\        \\        \\        \\        \\        \\        \\        \\        \\        \\        \\        \\        \\        \\        \\        \\        \\        \\        \\        \\        \\        \\        \\        \\        \\        \\        \\        \\        \\        \\        \\        \\        \\        \\        \\        \\        \\" + "'", str3, "i\\u0020iTALIANiTALIANiTALIANiTALIit    \\        \\        \\        \\        \\        \\        \\        \\        \\        \\        \\        \\        \\        \\        \\        \\        \\        \\        \\        \\        \\        \\        \\        \\        \\        \\        \\        \\        \\        \\        \\        \\        \\        \\        \\        \\        \\        \\        \\        \\        \\        \\        \\        \\        \\        \\        \\        \\        \\        \\        \\        \\");
    }

    @Test
    public void test30423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30423");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("HHHHHHHHH         ITALIAN_italian_eNGLISH         ITALIAN_!IHitTAiT_ITALIAN_EgAis", "TALIAN_ITALIAN_ENGLISh         ITAL");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test30424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30424");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("\\u0038");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\u0038" + "'", str1, "\\u0038");
    }

    @Test
    public void test30425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30425");
        java.util.Locale locale2 = new java.util.Locale("\\u0069", "    ");
        java.lang.String str3 = locale2.getDisplayName();
        java.util.Locale.setDefault(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "\\u0069_    ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\u0069 (    )" + "'", str3, "\\u0069 (    )");
    }

    @Test
    public void test30426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30426");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("                                                         \\u0046                                                         ", "AD  \\u007a", "french (canada)");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test30427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30427");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("\r\r\r\r\r\r\r\r\r\r\r\rITALIEITAL99999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ITALIEITAL99999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999" + "'", str1, "ITALIEITAL99999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999");
    }

    @Test
    public void test30428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30428");
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
        java.util.Locale.Builder builder13 = builder11.setLanguage("Engliscu");
        java.util.Locale locale14 = builder11.build();
        java.util.Locale locale16 = java.util.Locale.KOREA;
        java.lang.String str17 = locale16.getVariant();
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.upperCase("Canada", locale16);
        java.lang.String str19 = locale16.getDisplayName();
        java.lang.String str20 = locale16.getISO3Country();
        java.util.Locale.setDefault(locale16);
        java.lang.String str22 = locale16.getDisplayLanguage();
        java.lang.String str23 = locale14.getDisplayName(locale16);
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
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "engliscu");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "CANADA" + "'", str18, "CANADA");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Korean (South Korea)" + "'", str19, "Korean (South Korea)");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "KOR" + "'", str20, "KOR");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "\ud55c\uad6d\uc5b4" + "'", str22, "\ud55c\uad6d\uc5b4");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "engliscu" + "'", str23, "engliscu");
    }

    @Test
    public void test30429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30429");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("200U\\", "                                                                             zhzhzhzhzhzhzhzhzhzhfraazhaezhafzhagzhaizhalzhamzhanzhaozhaqzharzhaszhazhzhzhzhzhzhzhzhzhz2222222222222222222222222222222222222222222222222222222222222222222222222", "zh_cnfrench (canada)aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\r\r\r\r\r\r\r\r\\u0061italienischitalienischitalienischitalienischitalienischitalienischitalienischitalienischitalie\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\\u0061italienischitalienischitalienischitalienischitalienischitalienischitalienischitalienischitalie\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\\u0061italienischi");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test30430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30430");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("Chinesisch(China)                                                                ", "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rFRANZ...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Chinesisch(China)                                                                " + "'", str2, "Chinesisch(China)                                                                ");
    }

    @Test
    public void test30431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30431");
        java.util.Locale locale1 = java.util.Locale.FRENCH;
        java.util.Locale locale2 = java.util.Locale.ENGLISH;
        java.lang.String str3 = locale2.getDisplayCountry();
        java.lang.String str4 = locale1.getDisplayVariant(locale2);
        java.lang.String str5 = locale1.getDisplayCountry();
        java.lang.String str6 = locale1.getScript();
        java.lang.String str7 = locale1.getScript();
        java.util.Locale locale8 = java.util.Locale.FRENCH;
        java.util.Locale locale9 = java.util.Locale.ENGLISH;
        java.lang.String str10 = locale9.getDisplayCountry();
        java.lang.String str11 = locale8.getDisplayVariant(locale9);
        java.lang.String str12 = locale8.getDisplayCountry();
        java.lang.String str13 = locale8.getScript();
        java.lang.String str14 = locale8.getScript();
        java.lang.String str15 = locale1.getDisplayCountry(locale8);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.upperCase("\\xtalxan_ITALIAN_Englxsh", locale8);
        java.lang.String str17 = locale8.getDisplayName();
        java.util.Set<java.lang.String> strSet18 = locale8.getUnicodeLocaleKeys();
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.lang.String>) strSet18, '8');
        java.lang.String str22 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.lang.String>) strSet18, "IT                   ");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "fr");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "fr");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\\XTALXAN_ITALIAN_ENGLXSH" + "'", str16, "\\XTALXAN_ITALIAN_ENGLXSH");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\ud504\ub791\uc2a4\uc5b4" + "'", str17, "\ud504\ub791\uc2a4\uc5b4");
        org.junit.Assert.assertNotNull(strSet18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test30432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30432");
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
        java.util.Locale.Builder builder13 = builder12.clearExtensions();
        java.util.Locale.Builder builder14 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder15 = builder14.clearExtensions();
        java.util.Locale locale16 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str17 = locale16.getDisplayName();
        java.util.Locale.Builder builder18 = builder15.setLocale(locale16);
        java.util.Locale.Builder builder19 = builder18.clear();
        java.util.Locale.Builder builder21 = builder19.setLanguage("ITALIAN");
        java.util.Locale.Builder builder22 = builder19.clearExtensions();
        java.util.Locale locale23 = builder22.build();
        java.util.Locale locale24 = java.util.Locale.PRC;
        java.lang.String str25 = locale24.getDisplayName();
        java.util.Locale.Builder builder26 = builder22.setLocale(locale24);
        java.util.Locale.Builder builder27 = builder22.clear();
        java.util.Locale locale28 = builder22.build();
        java.util.Locale.Builder builder29 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder30 = builder29.clear();
        java.util.Locale locale31 = java.util.Locale.UK;
        java.util.Locale.Builder builder32 = builder29.setLocale(locale31);
        java.util.Set<java.lang.String> strSet33 = locale31.getUnicodeLocaleAttributes();
        java.lang.String str34 = locale31.getDisplayName();
        java.lang.String str36 = locale31.getExtension('f');
        java.util.Locale locale37 = locale31.stripExtensions();
        java.lang.String str38 = locale28.getDisplayLanguage(locale37);
        java.lang.String str39 = locale37.getDisplayVariant();
        java.util.Locale.Builder builder40 = builder13.setLocale(locale37);
        java.util.Locale.Builder builder42 = builder13.setLanguage("FRANC");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder44 = builder42.setScript("Italy");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: Italy [at index 0]");
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
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "fr_CA");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\ud504\ub791\uc2a4\uc5b4\uce90\ub098\ub2e4)" + "'", str17, "\ud504\ub791\uc2a4\uc5b4\uce90\ub098\ub2e4)");
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "italian");
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "zh_CN");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\uc911\uad6d\uc5b4\uc911\uad6d)" + "'", str25, "\uc911\uad6d\uc5b4\uc911\uad6d)");
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "");
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "en_GB");
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(strSet33);
// flaky:         org.junit.Assert.assertEquals("'" + str34 + "' != '" + "\uc601\uc5b4\uc601\uad6d)" + "'", str34, "\uc601\uc5b4\uc601\uad6d)");
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNotNull(locale37);
        org.junit.Assert.assertEquals(locale37.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertNotNull(builder42);
    }

    @Test
    public void test30433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30433");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("gggggggggggggggggggggg \\U0066  gggggggggggggggggggggg", (int) 'd', (int) '!');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...\\U0066  gggggggggggggggggggggg" + "'", str3, "...\\U0066  gggggggggggggggggggggg");
    }

    @Test
    public void test30434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30434");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("hi!        (\\u0020,italienisch#########################################################################################)", "Deutsch", 395);
        int int5 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("FrancGahhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test30435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30435");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "\\u00de\\u00\\u00de\\u00\\u00d         INGLESE       ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test30436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30436");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.setLanguage("ENGLISCH");
        java.util.Locale.Builder builder4 = builder3.clearExtensions();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void test30437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30437");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder2 = builder0.clear();
        java.util.Locale.Builder builder4 = builder2.setScript("");
        java.util.Locale.Builder builder5 = builder4.clear();
        java.util.Locale.Builder builder6 = builder4.clear();
        java.util.Locale locale9 = new java.util.Locale("\\u0045", "");
        java.util.Set<java.lang.String> strSet10 = locale9.getUnicodeLocaleAttributes();
        java.lang.String str11 = locale9.getLanguage();
        java.lang.String str12 = locale9.getLanguage();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder13 = builder6.setLocale(locale9);
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: \\u0045 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertEquals(locale9.toString(), "\\u0045");
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\\u0045" + "'", str11, "\\u0045");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\\u0045" + "'", str12, "\\u0045");
    }

    @Test
    public void test30438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30438");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("\\U0034\\U00HCSTUD\\U0034\\U00", 'e');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test30439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30439");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("                                                           ...                                                ", (int) 'J', 96);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                    " + "'", str3, "                                    ");
    }

    @Test
    public void test30440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30440");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder2 = builder0.clear();
        java.util.Locale.Builder builder3 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder3.clearExtensions();
        java.util.Locale.Category category5 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale6 = java.util.Locale.getDefault(category5);
        java.util.Locale locale7 = java.util.Locale.FRANCE;
        java.util.Locale locale8 = java.util.Locale.ITALIAN;
        java.lang.String str10 = locale8.getExtension('h');
        java.lang.String str11 = locale7.getDisplayScript(locale8);
        java.lang.String str12 = locale7.getISO3Country();
        java.util.Locale locale13 = java.util.Locale.GERMAN;
        java.util.Locale.setDefault(locale13);
        java.lang.String str15 = locale7.getDisplayName(locale13);
        java.lang.String str16 = locale7.getScript();
        java.util.Locale.setDefault(category5, locale7);
        java.util.Locale locale18 = java.util.Locale.getDefault(category5);
        java.util.Locale locale19 = java.util.Locale.JAPANESE;
        java.util.Locale locale21 = java.util.Locale.forLanguageTag("Deutsch");
        java.util.Locale.setDefault(locale21);
        java.lang.String str23 = locale19.getDisplayCountry(locale21);
        java.util.Set<java.lang.String> strSet24 = locale21.getUnicodeLocaleAttributes();
        java.lang.String str25 = locale18.getDisplayLanguage(locale21);
        java.util.Locale.Builder builder26 = builder3.setLocale(locale21);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str28 = locale21.getUnicodeLocaleType("                                                  IT44444444444444444EN");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key:                                                   IT44444444444444444EN");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertTrue("'" + category5 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category5.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "it");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "FRA" + "'", str12, "FRA");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "de");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Franz\366sisch (Frankreich)" + "'", str15, "Franz\366sisch (Frankreich)");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "ja");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "deutsch");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(strSet24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "French" + "'", str25, "French");
        org.junit.Assert.assertNotNull(builder26);
    }

    @Test
    public void test30441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30441");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx\\u0068 !ih !ih !ih !ih !ih !ih !ih !ih !ih", "inglesehhhhhhhhhenglisCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCEgschCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCALIAN_ENGLISH,\\u0061)englisCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCEgschCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCALIAN_ENGLISH,\\u0061)englisCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCEgschCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCALIAN_ENGLISH,\\u0061)englisCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCEgschCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCALIAN_ENGLISH,\\u0061)englisCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCEgschCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCALIAN_ENGLISH,\\u0061)englisCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCEgschCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCALIAN_ENGLISH,\\u0061)en");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "inglesehhhhhhhhhenglisCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCEgschCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCALIAN_ENGLISH,\\u0061)englisCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCEgschCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCALIAN_ENGLISH,\\u0061)englisCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCEgschCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCALIAN_ENGLISH,\\u0061)englisCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCEgschCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCALIAN_ENGLISH,\\u0061)englisCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCEgschCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCALIAN_ENGLISH,\\u0061)englisCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCEgschCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCALIAN_ENGLISH,\\u0061)en" + "'", str2, "inglesehhhhhhhhhenglisCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCEgschCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCALIAN_ENGLISH,\\u0061)englisCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCEgschCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCALIAN_ENGLISH,\\u0061)englisCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCEgschCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCALIAN_ENGLISH,\\u0061)englisCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCEgschCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCALIAN_ENGLISH,\\u0061)englisCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCEgschCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCALIAN_ENGLISH,\\u0061)englisCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCEgschCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCALIAN_ENGLISH,\\u0061)en");
    }

    @Test
    public void test30442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30442");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("             DE_DE            uuuuuuuuuuuuuuuuuuuuuuuuuu", 'n');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test30443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30443");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!4444ALLEMAND4444", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test30444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30444");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) " \\U0066  ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test30445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30445");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("U!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IUzhzhzhzhzhzhzhzhzhzhFRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhAzhzhzhzhzhzhzhzhzhzhUFRZ\326CZ(FRKREC)Ucinese (Cina)\\u0069hhhhhhhhhh\\u0069hhhhhhhhhh\\u0069hhhhhhhhhh\\u0069hhU         ITALIAN_ITALIAN_ENGLISH         ITALIAN_!IHITTAIT_ITALIAN_EGAISHU                                      ...", "allamandallamandallamandallamandallamandallamandallamandallamandallamandallamandallamandallamandallamandallamandallamandallamandallamandallamandallamandallamandallamandallamandallamandallamandallamandallamandallamandallamandallamandallamandallamandallamandallamandallamandallamandallamandallamandallamandallamandallamandallamandallamandallamandallamandallamandallamandallamandallamandallamandallamandallamandallamandallamandallamandallamandallamandallamandallamandallamandallamandallamandallamandallamandallamandallamandallamandallamandallamandallamandallamandallamandallamandallamandallamandallamandallamandallamandallamandallamandallamandallamandallamandallamandallamandallamandallamandallamandallamandallamandallamandallamandallamand");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "U!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IUzhzhzhzhzhzhzhzhzhzhFRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhAzhzhzhzhzhzhzhzhzhzhUFRZ\326CZ(FRKREC)Ucinese (Cina)\\u0069hhhhhhhhhh\\u0069hhhhhhhhhh\\u0069hhhhhhhhhh\\u0069hhU         ITALIAN_ITALIAN_ENGLISH         ITALIAN_!IHITTAIT_ITALIAN_EGAISHU                                      ..." + "'", str2, "U!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IUzhzhzhzhzhzhzhzhzhzhFRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhAzhzhzhzhzhzhzhzhzhzhUFRZ\326CZ(FRKREC)Ucinese (Cina)\\u0069hhhhhhhhhh\\u0069hhhhhhhhhh\\u0069hhhhhhhhhh\\u0069hhU         ITALIAN_ITALIAN_ENGLISH         ITALIAN_!IHITTAIT_ITALIAN_EGAISHU                                      ...");
    }

    @Test
    public void test30446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30446");
        java.util.Locale locale1 = java.util.Locale.ENGLISH;
        java.lang.String str2 = locale1.getDisplayLanguage();
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.upperCase("!IH", locale1);
        java.util.Set<java.lang.Character> charSet4 = locale1.getExtensionKeys();
        java.lang.String str5 = locale1.getDisplayVariant();
        java.util.Locale.Builder builder6 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder7 = builder6.clearExtensions();
        java.util.Locale locale8 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str9 = locale8.getDisplayName();
        java.util.Locale.Builder builder10 = builder7.setLocale(locale8);
        java.util.Locale locale11 = java.util.Locale.GERMANY;
        java.util.Locale.Builder builder12 = builder7.setLocale(locale11);
        java.util.Set<java.lang.String> strSet13 = locale11.getUnicodeLocaleAttributes();
        java.lang.String str14 = locale11.getVariant();
        java.util.Locale locale15 = java.util.Locale.ITALIAN;
        java.lang.String str16 = locale15.getDisplayLanguage();
        java.lang.String str17 = locale11.getDisplayLanguage(locale15);
        java.lang.String str18 = locale1.getDisplayLanguage(locale11);
        java.lang.String str19 = locale11.getDisplayScript();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "English" + "'", str2, "English");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!IH" + "'", str3, "!IH");
        org.junit.Assert.assertNotNull(charSet4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "French (Canada)" + "'", str9, "French (Canada)");
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "de_DE");
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "it");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Italian" + "'", str16, "Italian");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "tedesco" + "'", str17, "tedesco");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Englisch" + "'", str18, "Englisch");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test30447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30447");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("                           NNNNNNNNNNNNNNNNNN                               ZH_CN    South Korea    ZH_CN    Sout", "KOKOKO", 215);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test30448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30448");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "hcsnela                                                gggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggg", (java.lang.CharSequence) "ITA");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test30449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30449");
        java.util.Locale.Builder builder1 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder1.clear();
        java.util.Locale locale3 = java.util.Locale.UK;
        java.util.Locale.Builder builder4 = builder1.setLocale(locale3);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.lowerCase("Royaume-Uni", locale3);
        java.util.Locale locale7 = java.util.Locale.ITALIAN;
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.upperCase("de_DE", locale7);
        java.lang.String str9 = locale7.getISO3Language();
        java.util.Locale locale11 = java.util.Locale.ITALIAN;
        java.util.Set<java.lang.Character> charSet12 = locale11.getExtensionKeys();
        java.lang.String str13 = locale11.getVariant();
        java.lang.String str14 = locale11.getDisplayName();
        java.lang.String str15 = locale11.getCountry();
        java.util.Set<java.lang.String> strSet16 = locale11.getUnicodeLocaleKeys();
        java.util.Set<java.lang.String> strSet17 = locale11.getUnicodeLocaleKeys();
        java.util.Locale locale18 = java.util.Locale.ITALIAN;
        java.util.Set<java.lang.Character> charSet19 = locale18.getExtensionKeys();
        java.lang.String str20 = locale18.getVariant();
        java.lang.String str21 = locale18.getDisplayName();
        java.lang.String str22 = locale18.getCountry();
        java.util.Set<java.lang.String> strSet23 = locale18.getUnicodeLocaleKeys();
        java.util.Set<java.lang.String> strSet24 = locale18.getUnicodeLocaleKeys();
        java.lang.String str25 = locale11.getDisplayLanguage(locale18);
        java.util.Locale locale27 = java.util.Locale.FRANCE;
        java.util.Locale locale28 = java.util.Locale.ITALIAN;
        java.lang.String str30 = locale28.getExtension('h');
        java.lang.String str31 = locale27.getDisplayScript(locale28);
        java.lang.String str32 = org.apache.commons.lang3.StringUtils.lowerCase("HI!       ", locale27);
        java.lang.String str34 = locale27.getExtension('z');
        java.lang.String str35 = locale11.getDisplayName(locale27);
        java.lang.String str36 = org.apache.commons.lang3.StringUtils.lowerCase("                                                               \\u002", locale27);
        boolean boolean37 = locale27.hasExtensions();
        boolean boolean38 = locale27.hasExtensions();
        java.lang.String str39 = locale7.getDisplayCountry(locale27);
        java.lang.String str40 = locale27.getCountry();
        java.lang.String str41 = locale3.getDisplayVariant(locale27);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en_GB");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "royaume-uni" + "'", str5, "royaume-uni");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "it");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "DE_DE" + "'", str8, "DE_DE");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ita" + "'", str9, "ita");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "it");
        org.junit.Assert.assertNotNull(charSet12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Italian" + "'", str14, "Italian");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "it");
        org.junit.Assert.assertNotNull(charSet19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Italian" + "'", str21, "Italian");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(strSet23);
        org.junit.Assert.assertNotNull(strSet24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "italiano" + "'", str25, "italiano");
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "it");
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!       " + "'", str32, "hi!       ");
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "italien" + "'", str35, "italien");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "                                                               \\u002" + "'", str36, "                                                               \\u002");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "FR" + "'", str40, "FR");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
    }

    @Test
    public void test30450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30450");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\uCinese (Cina)\\u0069h..\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u", "de_D");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test30451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30451");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("00000000...", (int) 'e', (int) 'a');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test30452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30452");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("AzhzhzhzhzhzhzhfrancaAs (France)AzhzhzhzhzhzhzhzhzhzhfrancaAs (France)AzhzhzhzhzhzhzhzhzhzhfrancaAs cAnese (cAna)u0069h..France)AzhzhzhzhzhzhzhzhzhzhfrancaAs (France)AzhzhzhzhzhzhzhzhzhzhfrancaAs (France)AzhzhzhzhzhzhzhzhzhzhfrancaAs (France)AzhzhzhzhzhzhzhzhzhzhfrancaAs (France)AzhzhzhzhzhzhzhzhzhzhfrancaAs (France)AzhzhzhzhzhzhzhzhzhzhfrancaAs (France)AzhzhzhzhzhzhzhzhzhzhfrancaAs (France)AzhzhzhzhzhzhzhzhzhzhfrancaAs (France)AzhzhzhzhzhzhzhzhzhzhfrancaAs (France)AzhzhzhzhzhzhzhzhzhzhfrancaAs (France)AzhzhzhzhzhzhzhzhzhzhfrancaAs (France)AzhzhzhzhzhzhzhzhzhzhfrancaAs (France)AzhzhzhzhzhzhzhzhzhzhfrancaAs (France)AzhzhzhzhzhzhzhzhzhzhfrancaAs (France)AzhzhzhzhzhzhzhzhzhzhfrancaAs (France)AzhzhzhzhzhzhzhzhzhzhfrancaAs (France)AzhzhzhzhzhzhzhzhzhzhfrancaAs (France)AzhzhzhzhzhzhzhzhzhzhfrancaAs (France)Azhzhzhzhzhzhzhzhzhzh");
        java.lang.String str3 = locale1.getExtension('z');
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test30453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30453");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "430Francia");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test30454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30454");
        java.util.Locale locale3 = new java.util.Locale("Azhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais cinese (cina)\\u0069h..France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzh", "\ud55c\uad6d\uc5b4KR", "                                                                                                                                                                                                                         \\     ");
    }

    @Test
    public void test30455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30455");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee      eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee", "u Italia u");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee      eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee" + "'", str2, "eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee      eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee");
    }

    @Test
    public void test30456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30456");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("hi!", "...\r\r\r\r\r\r\r\r...", "20IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test30457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30457");
        java.util.Locale locale0 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str1 = locale0.toLanguageTag();
        java.util.Locale locale3 = java.util.Locale.FRANCE;
        java.util.Locale locale4 = java.util.Locale.ITALIAN;
        java.lang.String str6 = locale4.getExtension('h');
        java.lang.String str7 = locale3.getDisplayScript(locale4);
        java.util.Locale locale8 = locale3.stripExtensions();
        java.lang.String str9 = locale8.getISO3Country();
        java.util.Locale locale11 = new java.util.Locale("en");
        boolean boolean12 = locale11.hasExtensions();
        java.util.Set<java.lang.String> strSet13 = locale11.getUnicodeLocaleKeys();
        java.lang.String str14 = locale8.getDisplayCountry(locale11);
        java.util.Locale locale16 = new java.util.Locale("en");
        boolean boolean17 = locale16.hasExtensions();
        java.lang.String str18 = locale11.getDisplayCountry(locale16);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.lowerCase("Frnz\366sisch (Knd)", locale11);
        java.util.Locale locale20 = locale11.stripExtensions();
        java.util.Set<java.lang.Character> charSet21 = locale11.getExtensionKeys();
        java.lang.String str22 = locale0.getDisplayCountry(locale11);
        java.lang.String str23 = locale11.toLanguageTag();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "fr-CA" + "'", str1, "fr-CA");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "it");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "FRA" + "'", str9, "FRA");
        org.junit.Assert.assertEquals(locale11.toString(), "en");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "France" + "'", str14, "France");
        org.junit.Assert.assertEquals(locale16.toString(), "en");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "frnz\366sisch (knd)" + "'", str19, "frnz\366sisch (knd)");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "en");
        org.junit.Assert.assertNotNull(charSet21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Canada" + "'", str22, "Canada");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "en" + "'", str23, "en");
    }

    @Test
    public void test30458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30458");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "english (ITALY,H (HHHHHHHHH,CV CW CX CY CZ DE DJ DK DM DO DZ EC EE EG EH ER ES ET FI FJ FK))");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test30459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30459");
        java.util.Locale locale2 = new java.util.Locale("", "It_");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = locale2.getUnicodeLocaleType("ZHZHZHZHZHZHZHZHZHZHFRAADZHAEZHAFZHAGZHAIZHALZHAMZHANZHAOZHAQZHARZHASZHAZHZHZHZHZHZHZHZHZHZ2222222222222222222222222222222222222222222222222222222222222222222222222");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: ZHZHZHZHZHZHZHZHZHZHFRAADZHAEZHAFZHAGZHAIZHALZHAMZHANZHAOZHAQZHARZHASZHAZHZHZHZHZHZHZHZHZHZ2222222222222222222222222222222222222222222222222222222222222222222222222");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(locale2.toString(), "_IT_");
    }

    @Test
    public void test30460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30460");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale1 = java.util.Locale.getDefault(category0);
        java.util.Locale locale2 = java.util.Locale.GERMAN;
        java.util.Locale locale3 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str4 = locale2.getDisplayName(locale3);
        java.util.Locale.setDefault(category0, locale3);
        java.util.Locale locale8 = new java.util.Locale("\\u0020iTALIANiTALIANiTALIANiTALI\\u0020iTALIANiTALIANiTALIANiTAL", "allemand");
        java.util.Locale.setDefault(category0, locale8);
        java.util.Locale locale10 = java.util.Locale.getDefault(category0);
        java.util.Locale locale11 = java.util.Locale.getDefault(category0);
        java.util.Locale locale12 = java.util.Locale.ITALIAN;
        java.lang.String str13 = locale12.getDisplayLanguage();
        java.util.Locale locale14 = locale12.stripExtensions();
        java.util.Locale locale16 = java.util.Locale.forLanguageTag("\\u0020");
        java.lang.String str17 = locale16.getDisplayScript();
        java.lang.String str18 = locale14.getDisplayCountry(locale16);
        java.util.Locale.Builder builder19 = new java.util.Locale.Builder();
        java.util.Locale locale20 = builder19.build();
        java.util.Locale locale22 = java.util.Locale.forLanguageTag("Italian");
        java.lang.String str23 = locale20.getDisplayLanguage(locale22);
        java.lang.String str24 = locale14.getDisplayLanguage(locale20);
        java.lang.String str26 = locale20.getExtension('u');
        java.util.Set<java.lang.String> strSet27 = locale20.getUnicodeLocaleAttributes();
        java.lang.String str28 = locale20.getVariant();
        java.lang.String str29 = locale20.getDisplayLanguage();
        java.util.Locale locale31 = java.util.Locale.CHINESE;
        java.lang.String str32 = org.apache.commons.lang3.StringUtils.lowerCase("Franz\366sisch (Frankreich)", locale31);
        java.lang.String str33 = locale31.getVariant();
        java.util.Locale locale34 = java.util.Locale.FRANCE;
        java.util.Locale locale35 = java.util.Locale.ITALIAN;
        java.lang.String str37 = locale35.getExtension('h');
        java.lang.String str38 = locale34.getDisplayScript(locale35);
        java.util.Locale locale39 = locale34.stripExtensions();
        java.lang.String str40 = locale39.getISO3Country();
        boolean boolean41 = locale39.hasExtensions();
        java.lang.String str42 = locale39.getISO3Language();
        java.util.Locale locale43 = java.util.Locale.FRANCE;
        java.util.Locale locale44 = java.util.Locale.ITALIAN;
        java.lang.String str46 = locale44.getExtension('h');
        java.lang.String str47 = locale43.getDisplayScript(locale44);
        java.util.Locale locale48 = locale43.stripExtensions();
        java.lang.String str49 = locale48.getISO3Country();
        boolean boolean50 = locale48.hasExtensions();
        java.lang.String str51 = locale48.getLanguage();
        java.lang.String str52 = locale39.getDisplayLanguage(locale48);
        java.lang.String str53 = locale31.getDisplayCountry(locale39);
        java.lang.String str54 = locale31.getDisplayScript();
        java.lang.String str55 = locale20.getDisplayVariant(locale31);
        java.util.Locale.setDefault(category0, locale20);
        java.util.Locale locale57 = java.util.Locale.getDefault(category0);
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "deutsch");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "de");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "allemand" + "'", str4, "allemand");
        org.junit.Assert.assertEquals(locale8.toString(), "\\u0020italianitalianitalianitali\\u0020italianitalianitalianital_ALLEMAND");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "\\u0020italianitalianitalianitali\\u0020italianitalianitalianital_ALLEMAND");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "\\u0020italianitalianitalianitali\\u0020italianitalianitalianital_ALLEMAND");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "it");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Italian" + "'", str13, "Italian");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "it");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "italian");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Italian" + "'", str24, "Italian");
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNotNull(strSet27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "franz\366sisch (frankreich)" + "'", str32, "franz\366sisch (frankreich)");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "it");
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertNotNull(locale39);
        org.junit.Assert.assertEquals(locale39.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "FRA" + "'", str40, "FRA");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "fra" + "'", str42, "fra");
        org.junit.Assert.assertNotNull(locale43);
        org.junit.Assert.assertEquals(locale43.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale44);
        org.junit.Assert.assertEquals(locale44.toString(), "it");
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertNotNull(locale48);
        org.junit.Assert.assertEquals(locale48.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "FRA" + "'", str49, "FRA");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "fr" + "'", str51, "fr");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "fran\347ais" + "'", str52, "fran\347ais");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertNotNull(locale57);
        org.junit.Assert.assertEquals(locale57.toString(), "");
    }

    @Test
    public void test30461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30461");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("  nailati                                                                                                               ", "                                                                 HCSTUD                                             \\U0034");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test30462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30462");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("430Francia");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "430Francia" + "'", str1, "430Francia");
    }

    @Test
    public void test30463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30463");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("\\U0020IITALIAN\\U0020I\\U0020IITALIAN\\U0020I\\U0020IITALIAN\\U0020I\\U0020IITALIAN\\U0020I\\U0020IITALIAN\\U0020I\\U0020IITALIAN\\U0020I\\U0020IITALIAN\\U0020I\\U0020IITALIAN\\U0020I\\U0020IITALIAN\\U0020I\\U0020IITALIAN\\U0020I\\U0020IITALIAN\\U0020I\\U0020IITALIAN\\U0020I\\U0020IITALIAN\\U0020I\\U0020IITALIAN\\U0020I\\U0020IITALIAN\\U0020I\\U0020IITALIAN\\U0020I\\U0020IITALIAN\\U0020I\\U0020IITALIAN\\U0020I\\U0020IITALIAN\\U0020I\\U0020IITALIAN\\U0020I\\U0020IITALIAN\\U0020I\\U0020IITALIAN\\U0020I\\U0020IITALIAN\\U0020I\\U0020IITALIAN\\U0020I\\U0020IITALIAN\\U0020I\\U0020IITALIAN\\U0020I\\U0020IITALIAN\\U0020I\\U0020IITALIAN\\U0020I\\U0020IITALIAN\\U0020I\\U0020IITALIAN\\U0020I\\U0020IITALIAN\\U0020I\\U0020IITALIAN\\U0020I\\U0020IITALIAN\\U0020I\\U0020IITALIAN\\U0020I\\U0020IITALIAN\\U0020I", "                                  !ih                            ", "ESExxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxNCHI");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\U0020IITALIAN\\U0020I\\U0020IITALIAN\\U0020I\\U0020IITALIAN\\U0020I\\U0020IITALIAN\\U0020I\\U0020IITALIAN\\U0020I\\U0020IITALIAN\\U0020I\\U0020IITALIAN\\U0020I\\U0020IITALIAN\\U0020I\\U0020IITALIAN\\U0020I\\U0020IITALIAN\\U0020I\\U0020IITALIAN\\U0020I\\U0020IITALIAN\\U0020I\\U0020IITALIAN\\U0020I\\U0020IITALIAN\\U0020I\\U0020IITALIAN\\U0020I\\U0020IITALIAN\\U0020I\\U0020IITALIAN\\U0020I\\U0020IITALIAN\\U0020I\\U0020IITALIAN\\U0020I\\U0020IITALIAN\\U0020I\\U0020IITALIAN\\U0020I\\U0020IITALIAN\\U0020I\\U0020IITALIAN\\U0020I\\U0020IITALIAN\\U0020I\\U0020IITALIAN\\U0020I\\U0020IITALIAN\\U0020I\\U0020IITALIAN\\U0020I\\U0020IITALIAN\\U0020I\\U0020IITALIAN\\U0020I\\U0020IITALIAN\\U0020I\\U0020IITALIAN\\U0020I\\U0020IITALIAN\\U0020I\\U0020IITALIAN\\U0020I\\U0020IITALIAN\\U0020I\\U0020IITALIAN\\U0020I" + "'", str3, "\\U0020IITALIAN\\U0020I\\U0020IITALIAN\\U0020I\\U0020IITALIAN\\U0020I\\U0020IITALIAN\\U0020I\\U0020IITALIAN\\U0020I\\U0020IITALIAN\\U0020I\\U0020IITALIAN\\U0020I\\U0020IITALIAN\\U0020I\\U0020IITALIAN\\U0020I\\U0020IITALIAN\\U0020I\\U0020IITALIAN\\U0020I\\U0020IITALIAN\\U0020I\\U0020IITALIAN\\U0020I\\U0020IITALIAN\\U0020I\\U0020IITALIAN\\U0020I\\U0020IITALIAN\\U0020I\\U0020IITALIAN\\U0020I\\U0020IITALIAN\\U0020I\\U0020IITALIAN\\U0020I\\U0020IITALIAN\\U0020I\\U0020IITALIAN\\U0020I\\U0020IITALIAN\\U0020I\\U0020IITALIAN\\U0020I\\U0020IITALIAN\\U0020I\\U0020IITALIAN\\U0020I\\U0020IITALIAN\\U0020I\\U0020IITALIAN\\U0020I\\U0020IITALIAN\\U0020I\\U0020IITALIAN\\U0020I\\U0020IITALIAN\\U0020I\\U0020IITALIAN\\U0020I\\U0020IITALIAN\\U0020I\\U0020IITALIAN\\U0020I\\U0020IITALIAN\\U0020I\\U0020IITALIAN\\U0020I");
    }

    @Test
    public void test30464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30464");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.util.Locale locale1 = java.util.Locale.ITALIAN;
        java.lang.String str3 = locale1.getExtension('h');
        java.lang.String str4 = locale0.getDisplayScript(locale1);
        java.util.Locale locale5 = locale0.stripExtensions();
        java.lang.String str6 = locale5.getISO3Country();
        java.util.Locale locale8 = new java.util.Locale("en");
        boolean boolean9 = locale8.hasExtensions();
        java.util.Set<java.lang.String> strSet10 = locale8.getUnicodeLocaleKeys();
        java.lang.String str11 = locale5.getDisplayCountry(locale8);
        java.lang.String str12 = locale8.getScript();
        java.util.Locale locale14 = java.util.Locale.ENGLISH;
        java.lang.String str15 = locale14.getDisplayLanguage();
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.upperCase("!IH", locale14);
        java.lang.String str17 = locale14.getCountry();
        java.lang.String str18 = locale8.getDisplayCountry(locale14);
        java.util.Set<java.lang.String> strSet19 = locale8.getUnicodeLocaleKeys();
        java.lang.String str20 = locale8.getCountry();
        java.lang.String str22 = locale8.getExtension('n');
        java.lang.String str23 = locale8.toString();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "it");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "FRA" + "'", str6, "FRA");
        org.junit.Assert.assertEquals(locale8.toString(), "en");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "France" + "'", str11, "France");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "en");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "English" + "'", str15, "English");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "!IH" + "'", str16, "!IH");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(strSet19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "en" + "'", str23, "en");
    }

    @Test
    public void test30465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30465");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("   cor\351en    ", "Frankreich)kkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test30466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30466");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "                          fr-C                           ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test30467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30467");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("AC_ne", 267, 118);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test30468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30468");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069!IH\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\englisch", "ITALIAN_italian_eNGLISHITALIAN_!IHitTAiT_ITALIAN_EgAish", 4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test30469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30469");
        java.util.Locale locale2 = new java.util.Locale("z...Frn", "Chinese");
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
        java.util.Locale locale19 = java.util.Locale.CHINESE;
        java.util.Locale locale20 = java.util.Locale.FRENCH;
        java.lang.String str21 = locale20.getDisplayName();
        java.lang.String str23 = locale20.getExtension('C');
        java.lang.String str24 = locale19.getDisplayLanguage(locale20);
        java.lang.String str25 = locale19.getScript();
        java.util.Locale.setDefault(category3, locale19);
        java.util.Set<java.lang.String> strSet27 = locale19.getUnicodeLocaleAttributes();
        java.lang.String str28 = locale2.getDisplayName(locale19);
        java.util.Locale locale29 = locale2.stripExtensions();
        org.junit.Assert.assertEquals(locale2.toString(), "z...frn_CHINESE");
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
        org.junit.Assert.assertEquals(locale19.toString(), "zh");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "fran\347ais" + "'", str21, "fran\347ais");
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "chinois" + "'", str24, "chinois");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(strSet27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "z...frn (CHINESE)" + "'", str28, "z...frn (CHINESE)");
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "z...frn_CHINESE");
    }

    @Test
    public void test30470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30470");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("b", "8600u\\", "IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIITALIAN_ITALIAN_ENGLISHIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII", (int) 'E');
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "b" + "'", str4, "b");
    }

    @Test
    public void test30471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30471");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("France", (int) 'h', "ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDEDinglesehhhhhhhhhenglisCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCEgschCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCALIAN_ENGLISH,\\u0061)englisCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCEgschCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCALIAN_ENGLISH,\\u0061)englisCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCEgschCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCALIAN_ENGLISH,\\u0061)englisCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCEgschCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCALIAN_ENGLISH,\\u0061)englisCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCEgschCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCALIAN_ENGLISH,\\u0061)englisCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCEgschCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCALIAN_ENGLISH,\\u0061)en...");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNFrance" + "'", str3, "ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNFrance");
    }

    @Test
    public void test30472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30472");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("EEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEE", (int) 'u');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test30473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30473");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("Frankreich", "                \\     ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test30474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30474");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("Deutsch", 'i');
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray3);
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.split("AD4AE4AF4AG4AI4AL4AM4AN4AO4AQ4AR4AS4AT4AU4AW4AX4AZ4BA4BB4BD4BE4BF4BG4BH4BI4BJ4BL4BM4BN4BO4BQ4BR4BS4BT4BV4BW4BY4BZ4CA4CC4CD4CF4CG4CH4CI4CK4CL4CM4CN4CO4CR4CU4CV4CW4CX4CY4CZ4DE4DJ4DK4DM4DO4DZ4EC4EE4EG4EH4ER4ES4ET4FI4FJ4FK4FM4FO4FR4GA4GB4GD4GE4GF4GG4GH4GI4GL4GM4GN4GP4GQ4GR4GS4GT4GU4GW4GY4HK4HM4HN4HR4HT4HU4ID4IE4IL4IM4IN4IO4IQ4IR4IS4IT4JE4JM4JO4JP4KE4KG4KH4KI4KM4KN4KP4KR4KW4KY4KZ4LA4LB4LC4LI4LK4LR4LS4LT4LU4LV4LY4MA4MC4MD4ME4MF4MG4MH4MK4ML4MM4MN4MO4MP4MQ4MR4MS4MT4MU4MV4MW4MX4MY4MZ4NA4NC4NE4NF4NG4NI4NL4NO4NP4NR4NU4NZ4OM4PA4PE4PF4PG4PH4PK4PL4PM4PN4PR4PS4PT4PW4PY4QA4RE4RO4RS4RU4RW4SA4SB4SC4SD4SE4SG4SH4SI4SJ4SK4SL4SM4SN4SO4SR4SS4ST4SV4SX4SY4SZ4TC4TD4TF4TG4TH4TJ4TK4TL4TM4TN4TO4TR4TT4TV4TW4TZ4UA4UG4UM4US4UY4UZ4VA4VC4VE4VG4VI4VN4VU4WF4WS4YE4YT4ZA4ZM4ZW", '#');
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.stripAll(strArray7, "hhhhhhhhH");
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.replaceEach("French (Canada)", strArray3, strArray7);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Deutsch" + "'", str4, "Deutsch");
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "French (Canada)" + "'", str10, "French (Canada)");
    }

    @Test
    public void test30475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30475");
        java.util.Locale locale1 = new java.util.Locale("CCCCCCCCCCCCCanglais (CanadaCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC");
        java.util.Locale locale2 = java.util.Locale.ITALIAN;
        java.lang.String str3 = locale2.getDisplayLanguage();
        java.util.Locale locale4 = locale2.stripExtensions();
        java.lang.String str5 = locale2.getLanguage();
        java.lang.String str6 = locale2.getISO3Language();
        boolean boolean7 = locale2.hasExtensions();
        java.lang.String str8 = locale1.getDisplayScript(locale2);
        org.junit.Assert.assertEquals(locale1.toString(), "cccccccccccccanglais (canadaccccccccccccccccccccccccccccccccccccccc");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "it");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "italien" + "'", str3, "italien");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "it");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "it" + "'", str5, "it");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ita" + "'", str6, "ita");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test30476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30476");
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
        java.lang.String str14 = locale13.getDisplayCountry();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh");
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
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Allemagne" + "'", str14, "Allemagne");
    }

    @Test
    public void test30477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30477");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("                                                  it44444444444444444en", "HHHHHHHHHHtTAHHHHHHHHHHT_ITA", "ian\\u0020i");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                  i44444444444444444en" + "'", str3, "                                                  i44444444444444444en");
    }

    @Test
    public void test30478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30478");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("", "tedesco (Germania)", 23);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test30479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30479");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("fr-caNINININININININININININININININININININININININININININININININININININININININININININININININ", '\u6cd5');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "fr-caNINININININININININININININININININININININININININININININININININININININININININININININININ" + "'", str2, "fr-caNINININININININININININININININININININININININININININININININININININININININININININININININ");
    }

    @Test
    public void test30480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30480");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "cccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccc...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test30481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30481");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("FRANZ\326SISCHFRANZOSISCH (FRANKREICFRANZ\326SISCHFRANZOSISCH (FRANKREICH", "!!!!!!!!!!!!!!!!!!!!!!    zh_cn    !!!!!!!!!!!!!!!!!!!!!!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test30482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30482");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("nbobqbrbsbtbvbwbybzcacccdc", "...N4AO4AQ4AR4AS4AT4A...", 102);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test30483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30483");
        java.util.Locale locale2 = java.util.Locale.forLanguageTag("France");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.upperCase("inglese", locale2);
        java.lang.String str4 = locale2.getVariant();
        java.util.Locale locale5 = locale2.stripExtensions();
        java.util.Set<java.lang.String> strSet6 = locale5.getUnicodeLocaleKeys();
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "france");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "INGLESE" + "'", str3, "INGLESE");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "france");
        org.junit.Assert.assertNotNull(strSet6);
    }

    @Test
    public void test30484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30484");
        java.lang.Object[] objArray1 = null;
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.concatWith("     Englisch", objArray1);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test30485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30485");
        java.util.Locale locale2 = new java.util.Locale("CCCCCCCCCCCCCCCCCCCCCCCCCCfrz\366cz(frkrec)CCCCCCCCCCCCCCCCCCCCCCCCCC                                                                                                                                                                                                                                                                                                                                                    ", "\\U0078");
        java.lang.String str3 = locale2.getDisplayVariant();
        java.util.Locale locale5 = java.util.Locale.FRENCH;
        java.util.Locale locale6 = java.util.Locale.ENGLISH;
        java.lang.String str7 = locale6.getDisplayCountry();
        java.lang.String str8 = locale5.getDisplayVariant(locale6);
        java.lang.String str9 = locale5.getDisplayCountry();
        java.lang.String str10 = locale5.getScript();
        java.lang.String str11 = locale5.getScript();
        java.util.Locale locale12 = java.util.Locale.FRENCH;
        java.util.Locale locale13 = java.util.Locale.ENGLISH;
        java.lang.String str14 = locale13.getDisplayCountry();
        java.lang.String str15 = locale12.getDisplayVariant(locale13);
        java.lang.String str16 = locale12.getDisplayCountry();
        java.lang.String str17 = locale12.getScript();
        java.lang.String str18 = locale12.getScript();
        java.lang.String str19 = locale5.getDisplayCountry(locale12);
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.upperCase("\\xtalxan_ITALIAN_Englxsh", locale12);
        java.lang.String str21 = locale12.getDisplayName();
        java.util.Locale locale22 = null;
        java.lang.String str23 = locale12.getDisplayVariant(locale22);
        java.lang.String str24 = locale12.getLanguage();
        java.lang.String str25 = locale2.getDisplayName(locale12);
        org.junit.Assert.assertEquals(locale2.toString(), "ccccccccccccccccccccccccccfrz\366cz(frkrec)cccccccccccccccccccccccccc                                                                                                                                                                                                                                                                                                                                                    _\\U0078");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "fr");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "fr");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "en");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "\\XTALXAN_ITALIAN_ENGLXSH" + "'", str20, "\\XTALXAN_ITALIAN_ENGLXSH");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "fran\347ais" + "'", str21, "fran\347ais");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "fr" + "'", str24, "fr");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "ccccccccccccccccccccccccccfrz\366cz(frkrec)cccccccccccccccccccccccccc                                                                                                                                                                                                                                                                                                                                                     (\\U0078)" + "'", str25, "ccccccccccccccccccccccccccfrz\366cz(frkrec)cccccccccccccccccccccccccc                                                                                                                                                                                                                                                                                                                                                     (\\U0078)");
    }

    @Test
    public void test30486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30486");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("hi!allemanditalienischallemanditalian_italian_englishallemandhi!allemandhi!allemandadaeafagaialamanaoaqarasatauawaxazbabbbdbebfbgbhbibjblbmbnbobqbrbsbtbvbwbybzcacccdcfcgchcickclcmcncocrcucvcwcxcyczded...allemand\\u0034allemandhi!allemanditalianallemand\\u0061allemand\\u0023allemandhi!allemanditalianallemandchinese(china)allemandhi!allemandzh_cnallemanditalianallemandenallemanditalienisch", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               1");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test30487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30487");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("                                                           X                                                            ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "X" + "'", str1, "X");
    }

    @Test
    public void test30488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30488");
        char[] charArray9 = new char[] { ' ', '4' };
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "HI!", charArray9);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!", charArray9);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsAny("itTAiT_ITALIAN_EgAish", charArray9);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "Italy", charArray9);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsAny("44                                                                                               en44", charArray9);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsAny("\u52a0\u62ff\u5927eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee", charArray9);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsAny("tat_itaTtat_itaTtat_itaTtat_itaTtat_itaTtat_itaTtat_itaTtat_itaTtat_itaTtat_itaTtat_itaTtat_itaTtat_itaTtat_itaTtat_itaTtat_itaTtat_itaTtat_itaTtat_itaTtat_itaTtat_itaTtat_itaTtat_itaTtat_itaTtat_itaTtat_itaTtat_itaTtat_ita", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[ , 4]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test30489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30489");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("USA", "aEEEEEEEEEEEEE)");
        int int4 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("NC_HZ\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test30490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30490");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "Frnz\366sisch (Knd)");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test30491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30491");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("                                                                                                               ))))))))))))))))))))))))))))))))))))))))))))))))))))", 104);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                               ))))))))))))))))))))))))))))))))))))))))))))))))))))" + "'", str2, "                                                                                                               ))))))))))))))))))))))))))))))))))))))))))))))))))))");
    }

    @Test
    public void test30492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30492");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("ITALIAe");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test30493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30493");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("fr-", '0', 'G');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "fr-" + "'", str3, "fr-");
    }

    @Test
    public void test30494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30494");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale1 = java.util.Locale.getDefault(category0);
        java.util.Locale locale2 = java.util.Locale.GERMAN;
        java.util.Locale locale3 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str4 = locale2.getDisplayName(locale3);
        java.util.Locale.setDefault(category0, locale3);
        java.util.Locale locale8 = new java.util.Locale("\\u0020iTALIANiTALIANiTALIANiTALI\\u0020iTALIANiTALIANiTALIANiTAL", "allemand");
        java.util.Locale.setDefault(category0, locale8);
        java.util.Locale locale10 = java.util.Locale.getDefault(category0);
        java.util.Locale locale11 = java.util.Locale.getDefault(category0);
        java.util.Locale locale13 = new java.util.Locale("CA");
        java.util.Locale.setDefault(category0, locale13);
        java.util.Locale locale16 = new java.util.Locale("\\u005c");
        java.util.Locale locale18 = java.util.Locale.CHINESE;
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.lowerCase("Franz\366sisch (Frankreich)", locale18);
        java.lang.String str20 = locale18.getVariant();
        java.lang.String str21 = locale16.getDisplayScript(locale18);
        java.lang.String str23 = locale16.getExtension('C');
        boolean boolean24 = locale16.hasExtensions();
        java.util.Locale.setDefault(category0, locale16);
        java.util.Locale locale26 = java.util.Locale.getDefault(category0);
        java.util.Locale locale27 = java.util.Locale.ITALY;
        java.lang.String str28 = locale27.getScript();
        java.lang.String str29 = locale27.getDisplayCountry();
        boolean boolean30 = locale27.hasExtensions();
        java.util.Locale.setDefault(locale27);
        boolean boolean32 = locale27.hasExtensions();
        java.lang.String str33 = locale27.getDisplayScript();
        java.util.Set<java.lang.Character> charSet34 = locale27.getExtensionKeys();
        java.util.Locale.setDefault(category0, locale27);
        java.util.Locale locale36 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str37 = locale27.getDisplayCountry(locale36);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "de_DE");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "de");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "allemand" + "'", str4, "allemand");
        org.junit.Assert.assertEquals(locale8.toString(), "\\u0020italianitalianitalianitali\\u0020italianitalianitalianital_ALLEMAND");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "\\u0020italianitalianitalianitali\\u0020italianitalianitalianital_ALLEMAND");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "\\u0020italianitalianitalianitali\\u0020italianitalianitalianital_ALLEMAND");
        org.junit.Assert.assertEquals(locale13.toString(), "ca");
        org.junit.Assert.assertEquals(locale16.toString(), "\\u005c");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "franz\366sisch (frankreich)" + "'", str19, "franz\366sisch (frankreich)");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "\\u005c");
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Italie" + "'", str29, "Italie");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(charSet34);
    }

    @Test
    public void test30495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30495");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("NI d00u\\00u\\ed00u\\00u\\ed00u\\G ESEL", "444444444444444444444444444444444444444444444444444444444444444444444fRANZ\326SISC");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "NI d00u\\00u\\ed00u\\00u\\ed00u\\G ESEL" + "'", str2, "NI d00u\\00u\\ed00u\\00u\\ed00u\\G ESEL");
    }

    @Test
    public void test30496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30496");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("fffffffffffff                                                                        ", 25, 'T');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "fffffffffffff                                                                        " + "'", str3, "fffffffffffff                                                                        ");
    }

    @Test
    public void test30497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30497");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("CHINESE (CHINA)", "italian (italian,english) (                                                                                                         )", 19);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CHINESE (CHINA)" + "'", str3, "CHINESE (CHINA)");
    }

    @Test
    public void test30498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30498");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u", "ermany)Ger");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u" + "'", str2, "\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u");
    }

    @Test
    public void test30499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30499");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("AZHZHZHZHZHZHZHFRAN\307AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\307AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\307AIS CINESE (CINA)\\U0069H..FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\307AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\307AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\307AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\307AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\307AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\307AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\307AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\307AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\307AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\307AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\307AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\307AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\307AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\307AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\307AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\307AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\307AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\307AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZH", "zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzHSXLGNE_NAILATI_NAXLATX\\zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test30500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest60.test30500");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("HHHHHHHHH", (int) (short) 100, '\ud504');
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504" + "'", str3, "\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504");
    }
}
